package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes8.dex */
public class NLEModelExportListenerWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaRemoteJniJNI.delete_NLEModelExportListenerWrapper(j);
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
        NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEModelExportListenerWrapper() {
        this(NLEMediaRemoteJniJNI.new_NLEModelExportListenerWrapper(), true);
        NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_director_connect(this, this.swigCPtr, true, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEModelExportListenerWrapper nLEModelExportListenerWrapper) {
        if (nLEModelExportListenerWrapper == null) {
            return 0L;
        }
        return nLEModelExportListenerWrapper.swigCPtr;
    }

    public void onCompileDone(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
        long j = 0;
        if (getClass() == NLEModelExportListenerWrapper.class) {
            long j2 = this.swigCPtr;
            if (nLEModelExporterListenerParamBody != null) {
                j = nLEModelExporterListenerParamBody.LIZ;
            }
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileDone(j2, this, j, nLEModelExporterListenerParamBody);
            return;
        }
        long j3 = this.swigCPtr;
        if (nLEModelExporterListenerParamBody != null) {
            j = nLEModelExporterListenerParamBody.LIZ;
        }
        NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileDoneSwigExplicitNLEModelExportListenerWrapper(j3, this, j, nLEModelExporterListenerParamBody);
    }

    public void onCompileProgress(float f) {
        if (getClass() == NLEModelExportListenerWrapper.class) {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileProgress(this.swigCPtr, this, f);
        } else {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileProgressSwigExplicitNLEModelExportListenerWrapper(this.swigCPtr, this, f);
        }
    }

    public void onCompileStart(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
        long j = 0;
        if (getClass() == NLEModelExportListenerWrapper.class) {
            long j2 = this.swigCPtr;
            if (nLEModelExporterListenerParamBody != null) {
                j = nLEModelExporterListenerParamBody.LIZ;
            }
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileStart(j2, this, j, nLEModelExporterListenerParamBody);
            return;
        }
        long j3 = this.swigCPtr;
        if (nLEModelExporterListenerParamBody != null) {
            j = nLEModelExporterListenerParamBody.LIZ;
        }
        NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileStartSwigExplicitNLEModelExportListenerWrapper(j3, this, j, nLEModelExporterListenerParamBody);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEModelExportListenerWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCompileError(int i, int i2, float f, String str) {
        if (getClass() == NLEModelExportListenerWrapper.class) {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileError(this.swigCPtr, this, i, i2, f, str);
        } else {
            NLEMediaRemoteJniJNI.NLEModelExportListenerWrapper_onCompileErrorSwigExplicitNLEModelExportListenerWrapper(this.swigCPtr, this, i, i2, f, str);
        }
    }
}
