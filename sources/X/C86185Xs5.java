package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Xs5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86185Xs5 implements InterfaceC61107NyZ {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C86184Xs4 LIZJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        if (c164906daArr != null) {
            if (c164906daArr.length > 0 && c164906daArr[0].LIZIZ == EnumC61598OFm.GRANTED) {
                if (C158096Ij.LIZ) {
                    C86184Xs4 c86184Xs4 = this.LIZJ;
                    if (c86184Xs4.LJ != null) {
                        final int i = this.LIZ;
                        c86184Xs4.LIZ(new InterfaceC63015OoF() { // from class: X.XsA
                            @Override // X.InterfaceC63015OoF
                            public final void LIZ() {
                                C86185Xs5 c86185Xs5 = C86185Xs5.this;
                                c86185Xs5.LIZJ.LJIIIIZZ(i);
                            }
                        });
                        return;
                    }
                }
                this.LIZJ.LJIIIIZZ(this.LIZ);
                return;
            }
            if (c164906daArr.length > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startGalleryActivity permission failure: ");
                LIZ.append(c164906daArr[0].LIZIZ);
                C221018lt.LJFF("HeadUploadHelper", X1D.LIZIZ(LIZ));
            }
        }
        this.LIZJ.LJIIL.LJI(EnumC26325AUv.UPLOAD_PHOTO, false);
        if (!C1AR.LJI(this.LIZJ.LIZJ, this.LIZIZ)) {
            this.LIZJ.LJIIJ(R.string.e2z, R.string.dho, EnumC26325AUv.TAKE_PHOTO);
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LIZJ.LIZJ);
        c26045AKb.LJIIIZ(this.LIZJ.LIZJ.getString(R.string.jga));
        c26045AKb.LJIIJ();
    }

    public C86185Xs5(C86184Xs4 c86184Xs4, int i, String str) {
        this.LIZJ = c86184Xs4;
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
