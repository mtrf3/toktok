package com.bytedance.ies.nle.editor_jni;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class NLEEffectMsgListenerWrapper2 {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEEffectMsgListenerWrapper2(j);
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
        NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper2_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper2_change_ownership(this, this.swigCPtr, true);
    }

    public NLEEffectMsgListenerWrapper2() {
        this(NLEMediaPublicJniJNI.new_NLEEffectMsgListenerWrapper2(), true);
        NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper2_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEEffectMsgListenerWrapper2 nLEEffectMsgListenerWrapper2) {
        if (nLEEffectMsgListenerWrapper2 == null) {
            return 0L;
        }
        return nLEEffectMsgListenerWrapper2.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEEffectMsgListenerWrapper2(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onMessageReceived(long j, BigInteger bigInteger, BigInteger bigInteger2, String str, boolean z) {
        if (getClass() == NLEEffectMsgListenerWrapper2.class) {
            NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper2_onMessageReceived(this.swigCPtr, this, j, bigInteger, bigInteger2, str, z);
        } else {
            NLEMediaPublicJniJNI.NLEEffectMsgListenerWrapper2_onMessageReceivedSwigExplicitNLEEffectMsgListenerWrapper2(this.swigCPtr, this, j, bigInteger, bigInteger2, str, z);
        }
    }
}
