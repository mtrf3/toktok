package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7E implements TQU {
    public final /* synthetic */ U64 LIZ;

    public U7E(U64 u64) {
        this.LIZ = u64;
    }

    @Override // X.TQU
    public final void LIZ(Boolean bool, String source, String str) {
        o.LJIIIZ(source, "source");
        StringBuilder LIZLLL = C06540Nm.LIZLLL("monitorVideoApiCall apiName:", "LiveStream.switchVideoCapture", " source:", source, " mute:");
        LIZLLL.append(bool);
        LIZLLL.append(" extMsg:");
        LIZLLL.append(str);
        U4R.LIZLLL("CoLinkMicSession", X1D.LIZIZ(LIZLLL));
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null) {
            UA9.LJJJ(u66, "LiveStream.switchVideoCapture", source, bool, str);
        }
    }

    @Override // X.TQU
    public final void LIZJ(int i, int i2, int i3) {
        StringBuilder LIZJ = C06460Ne.LIZJ("monitorVideoCaptureCallback captureStatus:", i, " captureDevices:", i2, " captureFps:");
        LIZJ.append(i3);
        U4R.LIZLLL("CoLinkMicSession", X1D.LIZIZ(LIZJ));
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null) {
            C76762UAs LIZJ2 = UA9.LIZJ();
            LIZJ2.getClass();
            UC0.LJJLIIIIJ(new U8D(u66, LIZJ2, i, i2, i3));
        }
    }

    @Override // X.TQU
    public final void LIZIZ(Boolean bool, String str, String source, String str2) {
        o.LJIIIZ(source, "source");
        StringBuilder LIZLLL = C06540Nm.LIZLLL("monitorAudioApiCall apiName:", str, " source:", source, "} mute:");
        LIZLLL.append(bool);
        LIZLLL.append(" extMsg:");
        LIZLLL.append(str2);
        U4R.LIZLLL("CoLinkMicSession", X1D.LIZIZ(LIZLLL));
        U66 u66 = this.LIZ.LJLLI;
        if (u66 != null) {
            UA9.LJIIJ(u66, str, source, bool, str2);
        }
    }
}
