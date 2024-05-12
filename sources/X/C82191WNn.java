package X;

/* renamed from: X.WNn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82191WNn implements WGN {
    public final /* synthetic */ C82188WNk LIZ;

    public C82191WNn(C82188WNk c82188WNk) {
        this.LIZ = c82188WNk;
    }

    @Override // X.WGN
    public final void LIZ(boolean z) {
        InterfaceC153045zY interfaceC153045zY = this.LIZ.LLFII;
        if (interfaceC153045zY != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                InterfaceC123794tT LJFF = LJJI.LJFF();
                C82188WNk c82188WNk = this.LIZ;
                C121914qR LJJIII = LJFF.LJJIII();
                if (LJJIII != null) {
                    LJJIII.LJIIIZ = !z;
                } else {
                    LJJIII = null;
                }
                LJFF.LJJJJJL(LJJIII);
                c82188WNk.LLFII.stop();
                c82188WNk.LLFII.prepare();
                c82188WNk.LLFII.play();
                C82188WNk c82188WNk2 = this.LIZ;
                c82188WNk2.LLI = z;
                c82188WNk2.LLJILJILJ().creativeModel.musicBuzModel.changeTone = z;
                C82188WNk c82188WNk3 = this.LIZ;
                c82188WNk3.LJLILLLLZI.LIZIZ(c82188WNk3.LJLJLJ, c82188WNk3.LJZ);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
