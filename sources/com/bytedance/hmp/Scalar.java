package com.bytedance.hmp;

/* loaded from: classes34.dex */
public class Scalar extends Ptr {
    public void free() {
        if (this.own) {
            Api.scalar_free(this.ptr);
        }
    }

    public Scalar(double d) {
        this.ptr = Api.scalar(d);
        this.own = true;
    }

    public Scalar(long j) {
        this.ptr = Api.scalar(j);
        this.own = true;
    }

    public Scalar(boolean z) {
        this.ptr = Api.scalar(z);
        this.own = true;
    }

    public Scalar(long j, boolean z) {
        this.ptr = j;
        this.own = z;
    }

    public static Scalar wrap(long j, boolean z) {
        return new Scalar(j, z);
    }
}
