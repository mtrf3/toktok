package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Xs6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86186Xs6 implements InterfaceC61107NyZ {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ C86184Xs4 LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        if (c164906daArr != null) {
            if (c164906daArr.length > 0 && c164906daArr[0].LIZIZ == EnumC61598OFm.GRANTED) {
                C73040SlY.LJII(this.LIZIZ.LIZJ, "live_image_popup", "take_photo");
                this.LIZIZ.LJIIL.LJI(EnumC26325AUv.TAKE_PHOTO, true);
                this.LIZIZ.LJIIJJI(this.LIZ);
                return;
            } else if (c164906daArr.length > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startCameraActivity permission failure: ");
                LIZ.append(c164906daArr[0].LIZIZ);
                C221018lt.LJFF("HeadUploadHelper", X1D.LIZIZ(LIZ));
            }
        }
        InterfaceC26319AUp interfaceC26319AUp = this.LIZIZ.LJIIL;
        EnumC26325AUv enumC26325AUv = EnumC26325AUv.TAKE_PHOTO;
        interfaceC26319AUp.LJI(enumC26325AUv, false);
        if (!C1AR.LJI(this.LIZIZ.LIZJ, "android.permission.CAMERA")) {
            this.LIZIZ.LJIIJ(R.string.sci, R.string.cgl, enumC26325AUv);
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LIZIZ.LIZJ);
        c26045AKb.LJIIIZ(this.LIZIZ.LIZJ.getString(R.string.jg9));
        c26045AKb.LJIIJ();
    }

    public C86186Xs6(C86184Xs4 c86184Xs4, int i) {
        this.LIZIZ = c86184Xs4;
        this.LIZ = i;
    }
}
