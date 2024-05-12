package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public class NLEBaseTemplateZipProgressHandler {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_NLEBaseTemplateZipProgressHandler(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        NLETemplateJNI.NLEBaseTemplateZipProgressHandler_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLETemplateJNI.NLEBaseTemplateZipProgressHandler_change_ownership(this, this.swigCPtr, true);
    }

    public NLEBaseTemplateZipProgressHandler() {
        this(NLETemplateJNI.new_NLEBaseTemplateZipProgressHandler(), true);
        NLETemplateJNI.NLEBaseTemplateZipProgressHandler_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEBaseTemplateZipProgressHandler nLEBaseTemplateZipProgressHandler) {
        if (nLEBaseTemplateZipProgressHandler == null) {
            return 0L;
        }
        return nLEBaseTemplateZipProgressHandler.swigCPtr;
    }

    public void invoke(float f) {
        if (getClass() == NLEBaseTemplateZipProgressHandler.class) {
            NLETemplateJNI.NLEBaseTemplateZipProgressHandler_invoke(this.swigCPtr, this, f);
        } else {
            NLETemplateJNI.NLEBaseTemplateZipProgressHandler_invokeSwigExplicitNLEBaseTemplateZipProgressHandler(this.swigCPtr, this, f);
        }
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEBaseTemplateZipProgressHandler(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
