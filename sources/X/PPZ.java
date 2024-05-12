package X;

import com.ss.android.ugc.aweme.legoImp.task.pumbaa.TTPSystemAPIInit;

/* loaded from: classes12.dex */
public final class PPZ implements InterfaceC39218FaI {
    public final /* synthetic */ TTPSystemAPIInit LIZ;

    public PPZ(TTPSystemAPIInit tTPSystemAPIInit) {
        this.LIZ = tTPSystemAPIInit;
    }

    @Override // X.InterfaceC39218FaI
    public final void LIZ(String str, String str2, String str3, OHW ohw) {
        HH1.LIZ(str, "sdkName", str2, "methodName", str3, "domain");
        if (this.LIZ.LIZLLL.contains(str2)) {
            C78929UyL.LIZIZ(ohw, "android/media/AudioRecord", "startRecording()V", null);
        } else {
            if (!this.LIZ.LJ.contains(str2)) {
                return;
            }
            C78929UyL.LIZIZ(ohw, "android/media/AudioRecord", "stop()V", null);
        }
    }
}
