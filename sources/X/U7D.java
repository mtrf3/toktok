package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7D implements TQU {
    public final /* synthetic */ U65 LIZ;

    public U7D(U65 u65) {
        this.LIZ = u65;
    }

    @Override // X.TQU
    public final void LIZ(Boolean bool, String source, String str) {
        o.LJIIIZ(source, "source");
        StringBuilder LIZLLL = C06540Nm.LIZLLL("monitorVideoApiCall apiName:", "LiveStream.switchVideoCapture", " source:", source, " mute:");
        LIZLLL.append(bool);
        LIZLLL.append(" extMsg:");
        LIZLLL.append(str);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZLLL));
        UA9.LJJJ(this.LIZ.LJLJJL, "LiveStream.switchVideoCapture", source, bool, str);
    }

    @Override // X.TQU
    public final void LIZJ(int i, int i2, int i3) {
        StringBuilder LIZJ = C06460Ne.LIZJ("monitorVideoCaptureCallback captureStatus:", i, " captureDevices:", i2, " captureFps:");
        LIZJ.append(i3);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZJ));
        U66 linker = this.LIZ.LJLJJL;
        o.LJIIIZ(linker, "linker");
        C76762UAs LIZJ2 = UA9.LIZJ();
        LIZJ2.getClass();
        UC0.LJJLIIIIJ(new U8D(linker, LIZJ2, i, i2, i3));
    }

    @Override // X.TQU
    public final void LIZIZ(Boolean bool, String str, String source, String str2) {
        o.LJIIIZ(source, "source");
        StringBuilder LIZLLL = C06540Nm.LIZLLL("monitorAudioApiCall apiName:", str, " source:", source, " mute:");
        LIZLLL.append(bool);
        LIZLLL.append(" extMsg:");
        LIZLLL.append(str2);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZLLL));
        UA9.LJIIJ(this.LIZ.LJLJJL, str, source, bool, str2);
    }
}
