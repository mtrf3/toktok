package X;

import Y.ARunnableS33S0200000_14;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WOf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82209WOf implements InterfaceC82434WWw {
    public final InterfaceC82086WJm LIZ;
    public final boolean LIZIZ;
    public final I37 LIZJ;
    public final C5H3<I37> LIZLLL;
    public final WRP LJ;
    public final I9W LJFF;
    public final ShortVideoContext LJI;
    public final C29901Fi<AbstractC82213WOj> LJII;
    public final ActivityC45651qj LJIIIIZZ;
    public final LifecycleOwner LJIIIZ;
    public final SafeHandler LJIIJ;
    public FilterBean LJIIJJI;

    @Override // X.InterfaceC82434WWw
    public final void LIZIZ() {
        this.LJII.LJII(C82215WOl.LIZ);
    }

    @Override // X.InterfaceC82434WWw
    public final void LJ() {
        this.LJII.LJII(C82214WOk.LIZ);
    }

    @Override // X.InterfaceC82434WWw
    public final void LIZ(Effect gameSticker) {
        o.LJIIIZ(gameSticker, "gameSticker");
        this.LJII.LJII(new C82212WOi(gameSticker));
        this.LJFF.ch0().LIZ(gameSticker, true);
    }

    @Override // X.InterfaceC82434WWw
    public final void LIZJ(Effect gameSticker) {
        o.LJIIIZ(gameSticker, "gameSticker");
        this.LJIIJ.post(new ARunnableS33S0200000_14(gameSticker, this, 49));
    }

    @Override // X.InterfaceC82434WWw
    public final void LIZLLL(Effect gameSticker) {
        FilterBean filterBean;
        WRP wrp;
        o.LJIIIZ(gameSticker, "gameSticker");
        this.LJII.LJII(new C82210WOg(gameSticker));
        if (C82398WVm.LIZLLL(this.LJFF)) {
            C78928UyK.LIZIZ(false, false, false, this.LIZ);
        } else {
            C78928UyK.LIZIZ(true, false, false, this.LIZ);
        }
        this.LJIIIIZZ.findViewById(R.id.fm5).setVisibility(0);
        this.LJIIIIZZ.findViewById(R.id.fim).setVisibility(8);
        if (V3N.LJIILLIIL(gameSticker) && (filterBean = this.LJIIJJI) != null && (wrp = this.LJ) != null) {
            wrp.setFilterChosen(filterBean, null, false, false, false);
        }
    }

    public C82209WOf(C82622Wbi diContainer, InterfaceC82086WJm interfaceC82086WJm, I37 i37, C62822Ol8 c62822Ol8, WRP wrp, I9W stickerApiComponent, ShortVideoContext shortVideoContext, C29901Fi gameStateChange) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(gameStateChange, "gameStateChange");
        this.LIZ = interfaceC82086WJm;
        this.LIZIZ = false;
        this.LIZJ = i37;
        this.LIZLLL = c62822Ol8;
        this.LJ = wrp;
        this.LJFF = stickerApiComponent;
        this.LJI = shortVideoContext;
        this.LJII = gameStateChange;
        this.LJIIIIZZ = (ActivityC45651qj) diContainer.LJ(ActivityC45651qj.class, null);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) diContainer.LJ(LifecycleOwner.class, null);
        this.LJIIIZ = lifecycleOwner;
        this.LJIIJ = new SafeHandler(lifecycleOwner);
    }
}
