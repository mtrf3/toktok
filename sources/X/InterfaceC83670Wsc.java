package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.algorithm.VEAudioAlgorithmParam;

/* renamed from: X.Wsc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC83670Wsc {
    void LIZ(boolean z, boolean z2, boolean z3, boolean z4);

    void LIZIZ(boolean z);

    void LIZJ(IBA iba);

    void LIZLLL(Cert cert);

    void LJ();

    VEAudioCapture LJFF();

    void LJI(Cert cert, boolean z);

    int LJII(VEAudioAlgorithmParam vEAudioAlgorithmParam);

    void init(String str);

    boolean isInited();

    void release(Cert cert);

    int removeTrackAlgorithm(int i);

    void setAudioDevice(IC8 ic8);

    void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS);

    void setSensitiveApiCallback(InterfaceC83723WtT interfaceC83723WtT);
}
