package com.bytedance.ies.nle.editor_jni;

import X.C120634oN;

/* loaded from: classes3.dex */
public class NLEResourceSynchronizer {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEResourceSynchronizer(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        NLEEditorJniJNI.NLEResourceSynchronizer_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        NLEEditorJniJNI.NLEResourceSynchronizer_change_ownership(this, this.swigCPtr, true);
    }

    public NLEResourceSynchronizer() {
        this(NLEEditorJniJNI.new_NLEResourceSynchronizer(), true);
        NLEEditorJniJNI.NLEResourceSynchronizer_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEResourceSynchronizer nLEResourceSynchronizer) {
        if (nLEResourceSynchronizer == null) {
            return 0L;
        }
        return nLEResourceSynchronizer.swigCPtr;
    }

    public NLEResourceSynchronizer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int fetch(String str, C120634oN c120634oN) {
        long j;
        long j2 = this.swigCPtr;
        if (c120634oN == null) {
            j = 0;
        } else {
            j = c120634oN.LIZ;
        }
        return NLEEditorJniJNI.NLEResourceSynchronizer_fetch(j2, this, str, j);
    }

    public int push(String str, C120634oN c120634oN) {
        long j;
        long j2 = this.swigCPtr;
        if (c120634oN == null) {
            j = 0;
        } else {
            j = c120634oN.LIZ;
        }
        return NLEEditorJniJNI.NLEResourceSynchronizer_push(j2, this, str, j);
    }
}
