package X;

import android.view.View;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;

/* renamed from: X.68R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68R {
    public final /* synthetic */ C161426Ve LIZ;

    public C68R(C161426Ve c161426Ve) {
        this.LIZ = c161426Ve;
    }

    public final void LIZ(boolean z) {
        C67P c67p;
        InterfaceC1549466g interfaceC1549466g;
        View view;
        ((FTCEditTextStickerViewModel) this.LIZ.LJLJL.getValue()).lp0(C161426Ve.LLJILJIL(!z), false);
        if (z) {
            InterfaceC1549166d interfaceC1549166d = this.LIZ.LLJJ().LLIIJI;
            if (interfaceC1549166d instanceof C67P) {
                c67p = (C67P) interfaceC1549166d;
            } else {
                c67p = null;
            }
            if (c67p != null) {
                c67p.LJJ(C161426Ve.LLJILJIL(true), false);
            }
            Object obj = this.LIZ.LLJJ().LLIIJI;
            if ((obj instanceof C156086Aq) && (view = (View) obj) != null) {
                view.setAlpha(C161426Ve.LLJILJIL(true));
            }
            InterfaceC1549166d interfaceC1549166d2 = this.LIZ.LLJJ().LLIIJI;
            if ((interfaceC1549166d2 instanceof InterfaceC1549466g) && (interfaceC1549466g = (InterfaceC1549466g) interfaceC1549166d2) != null) {
                this.LIZ.getClass();
                interfaceC1549466g.LIZIZ();
            }
        }
    }
}
