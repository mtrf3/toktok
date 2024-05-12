package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Version {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_Version(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String toString() {
        return EffectCreatorJniJNI.Version_toString(this.swigCPtr, this);
    }

    public Version withoutPatch() {
        return new Version(EffectCreatorJniJNI.Version_withoutPatch(this.swigCPtr, this), true);
    }

    public Version() {
        this(EffectCreatorJniJNI.new_Version__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public Version(String str) {
        this(EffectCreatorJniJNI.new_Version__SWIG_2(str), true);
    }

    public static long getCPtr(Version version) {
        if (version == null) {
            return 0L;
        }
        return version.swigCPtr;
    }

    public Version(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public Version(long j, long j2, long j3) {
        this(EffectCreatorJniJNI.new_Version__SWIG_1(j, j2, j3), true);
    }
}
