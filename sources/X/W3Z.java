package X;

import Y.AfS63S0200000_14;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS69S0110000_14;

/* loaded from: classes15.dex */
public final class W3Z implements InterfaceC81662W3e {
    public Effect LIZ;
    public Effect LIZIZ;
    public final /* synthetic */ FavoriteSticker LIZJ;

    @Override // X.InterfaceC81662W3e
    public final void LIZ() {
        InterfaceC92693kP LJJII;
        Effect effect = this.LIZ;
        if (effect != null) {
            FavoriteSticker favoriteSticker = this.LIZJ;
            InterfaceC88471Ynr<Effect, Boolean, C76800UCe> interfaceC88471Ynr = favoriteSticker.LJZ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(effect, Boolean.valueOf(favoriteSticker.LIZJ(effect)));
            }
            FavoriteSticker favoriteSticker2 = this.LIZJ;
            C73318Sq2 c73318Sq2 = favoriteSticker2.LJLJL;
            if (c73318Sq2 == null) {
                c73318Sq2 = new C73318Sq2();
                favoriteSticker2.LJLJL = c73318Sq2;
            }
            if (this.LIZJ.LIZJ(effect)) {
                LJJII = C74441TJl.LIZ((InterfaceC74443TJn) this.LIZJ.LJLJLJ.getValue(), effect, true).LJJII(new AfS63S0200000_14(effect, this, 1), C81659W3b.LJLIL);
            } else {
                this.LIZJ.LJLLJ.LIZLLL(effect, false, "click_main_panel", new OSZ[0]);
                if (this.LIZIZ != null) {
                    this.LIZJ.LJLLJ.LIZLLL(effect, true, "click_banner", new OSZ[0]);
                }
                LJJII = C74441TJl.LIZ((InterfaceC74443TJn) this.LIZJ.LJLJLJ.getValue(), effect, false).LJJII(new AfS63S0200000_14(effect, this, 2), C81660W3c.LJLIL);
            }
            c73318Sq2.LIZ(LJJII);
        }
    }

    public W3Z(FavoriteSticker favoriteSticker) {
        this.LIZJ = favoriteSticker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC81662W3e
    public final void LIZIZ(int i) {
        if (i == 0) {
            this.LIZ = this.LIZJ.LJLLILLLL.LLJJIJIIJIL();
            Effect effect = (Effect) this.LIZJ.LJLLILLLL.LJIIIIZZ().LJIILL().getValue();
            if (effect != null && !TextUtils.isEmpty(effect.getParentId())) {
                this.LIZIZ = effect;
            }
            InterfaceC74443TJn interfaceC74443TJn = (InterfaceC74443TJn) this.LIZJ.LJLJLJ.getValue();
            FavoriteSticker favoriteSticker = this.LIZJ;
            interfaceC74443TJn.LJIILIIL(!favoriteSticker.LIZJ(favoriteSticker.LJLLILLLL.LLJJIJIIJIL()));
            return;
        }
        if (i != 1) {
            return;
        }
        FavoriteSticker favoriteSticker2 = this.LIZJ;
        C43045Guv.LIZLLL(new AqS69S0110000_14(favoriteSticker2, true ^ favoriteSticker2.LIZJ(favoriteSticker2.LJLLILLLL.LLJJIJIIJIL()), 3), 0L);
    }
}
