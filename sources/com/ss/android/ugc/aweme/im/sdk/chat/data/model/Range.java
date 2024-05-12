package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

/* loaded from: classes2.dex */
public final class Range {
    public int from;
    public int to;

    public int hashCode() {
        return (this.from * 31) + this.to;
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.to;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (this.from != range.from || this.to != range.to) {
            return false;
        }
        return true;
    }

    public final int getAnchorPosition(int i) {
        int i2 = this.from;
        int i3 = this.to;
        if ((i - i2) - (i3 - i) >= 0) {
            return i3;
        }
        return i2;
    }

    public final void setFrom(int i) {
        this.from = i;
    }

    public final void setTo(int i) {
        this.to = i;
    }

    public Range(int i, int i2) {
        this.from = i;
        this.to = i2;
    }

    public final boolean contains(int i, int i2) {
        if (this.from <= i && this.to >= i2) {
            return true;
        }
        return false;
    }

    public final boolean isEqual(int i, int i2) {
        int i3 = this.from;
        if ((i3 == i && this.to == i2) || (i3 == i2 && this.to == i)) {
            return true;
        }
        return false;
    }

    public final boolean isWrappedBy(int i, int i2) {
        int i3 = this.from;
        int i4 = i3 + 1;
        int i5 = this.to;
        if (i >= i5 || i4 > i) {
            int i6 = i3 + 1;
            if (i2 >= i5 || i6 > i2) {
                return false;
            }
        }
        return true;
    }
}
