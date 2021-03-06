package net.avh4.util.imagecomparison;

import java.awt.image.BufferedImage;

public class NoReferenceImageResult extends ImageComparisonResult {
    public NoReferenceImageResult(BufferedImage actualImage) {
        super(actualImage);
    }

    @Override
    public boolean isEqual() {
        return false;
    }

    @Override
    public String getFailureMessage() {
        return null;
    }

    @Override
    public String toString() {
        return "NoReferenceImageResult{" +
                "actualImage=" + actualImage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final NoReferenceImageResult that = (NoReferenceImageResult) o;

        if (actualImage != null ? !actualImage.equals(that.actualImage) :
                that.actualImage != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return actualImage != null ? actualImage.hashCode() : 0;
    }
}
