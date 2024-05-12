package com.ss.android.ugc.aweme.sticker.favorite;

import X.C04330Ez;
import X.C07840Sm;
import X.C16880lQ;
import X.C1XY;
import X.C221108m2;
import X.C29S;
import X.C43045Guv;
import X.C47919IrL;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C74275TDb;
import X.C76800UCe;
import X.C78880UxY;
import X.C81268Vuy;
import X.C81658W3a;
import X.C81661W3d;
import X.InterfaceC65784Pro;
import X.InterfaceC74343TFr;
import X.InterfaceC74443TJn;
import X.InterfaceC78118UlG;
import X.InterfaceC81664W3g;
import X.InterfaceC88471Ynr;
import X.TDY;
import X.TEZ;
import X.TG7;
import X.TGD;
import X.THX;
import X.TJI;
import X.W3Z;
import Y.AObserverS77S0200000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS25S0300000_14;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.views.IDlS65S0100000_14;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS69S0110000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class FavoriteSticker implements GenericLifecycleObserver, InterfaceC81664W3g {
    public C81661W3d LJLIL;
    public final Drawable LJLILLLLZI;
    public final Drawable LJLJI;
    public final View LJLJJI;
    public final TextView LJLJJL;
    public final View LJLJJLL;
    public C73318Sq2 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C81268Vuy LJLJLLL;
    public final LifecycleOwner LJLL;
    public final C29S LJLLI;
    public final TEZ LJLLILLLL;
    public final InterfaceC74343TFr LJLLJ;
    public final THX LJLLL;
    public final FrameLayout LJLLLL;
    public final C81658W3a LJLLLLLL;
    public final InterfaceC78118UlG LJLZ;
    public final InterfaceC88471Ynr<Effect, Boolean, C76800UCe> LJZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZLLL() {
        this.LJLLILLLL.LJJJJLL().LIZIZ(new TJI("sticker_category:favorite", 0, 0, 0, false, null, 510));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLLLLLL.setOnStateChangeListener(null);
        this.LJLLLLLL.clearAnimation();
        C81661W3d c81661W3d = this.LJLIL;
        if (c81661W3d != null) {
            C47919IrL.LIZLLL(c81661W3d);
            this.LJLIL = null;
        }
        C73318Sq2 c73318Sq2 = this.LJLJL;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        }
    }

    @Override // X.InterfaceC81664W3g
    public void LIZ(boolean z) {
        if (z) {
            if (!this.LJLLI.isFinishing()) {
                C81268Vuy c81268Vuy = this.LJLJLLL;
                View anchor = this.LJLJJI;
                C29S activity = this.LJLLI;
                c81268Vuy.getClass();
                o.LJIIIZ(anchor, "anchor");
                o.LJIIIZ(activity, "activity");
                if (!c81268Vuy.LIZ.getBubbleGuideShown(false) && anchor.getParent() != null) {
                    anchor.post(new ARunnableS25S0300000_14(anchor, c81268Vuy, activity, 22));
                }
            }
            this.LJLLLL.setVisibility(0);
            return;
        }
        this.LJLLLL.setVisibility(8);
    }

    @Override // X.InterfaceC81664W3g
    public final void LIZIZ(Effect effect) {
        C43045Guv.LIZLLL(new AqS69S0110000_14(this, LIZJ(effect), 3), 0L);
    }

    public final boolean LIZJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        return ((InterfaceC74443TJn) this.LJLJLJ.getValue()).LJJJLL(effect.getEffectId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteSticker(C29S mAmeActivity, TEZ stickerDataManager, InterfaceC74343TFr stickerMobHelper, THX favoriteProcessor, FrameLayout frameLayout, C81658W3a c81658W3a, InterfaceC78118UlG stickerPreferences, InterfaceC65784Pro<TGD> configureProvider, InterfaceC88471Ynr<? super Effect, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(mAmeActivity, "mAmeActivity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        o.LJIIIZ(favoriteProcessor, "favoriteProcessor");
        o.LJIIIZ(stickerPreferences, "stickerPreferences");
        o.LJIIIZ(configureProvider, "configureProvider");
        this.LJLLI = mAmeActivity;
        this.LJLLILLLL = stickerDataManager;
        this.LJLLJ = stickerMobHelper;
        this.LJLLL = favoriteProcessor;
        this.LJLLLL = frameLayout;
        this.LJLLLLLL = c81658W3a;
        this.LJLZ = stickerPreferences;
        this.LJZ = interfaceC88471Ynr;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 176));
        this.LJLJLLL = new C81268Vuy(stickerPreferences);
        LifecycleOwner LJIIJJI = C1XY.LJIIJJI(frameLayout);
        LJIIJJI = LJIIJJI == null ? mAmeActivity : LJIIJJI;
        this.LJLL = LJIIJJI;
        LJIIJJI.getLifecycle().addObserver(this);
        C16880lQ.LJIILJJIL(frameLayout, new IDlS65S0100000_14(this, 1));
        View findViewById = frameLayout.findViewById(R.id.kle);
        o.LJIIIIZZ(findViewById, "mLikeLayout.findViewById(R.id.str_sticker_like)");
        this.LJLJJL = (TextView) findViewById;
        View findViewById2 = frameLayout.findViewById(R.id.fmb);
        o.LJIIIIZZ(findViewById2, "mLikeLayout.findViewById…layout_sticker_like_oval)");
        View findViewById3 = frameLayout.findViewById(R.id.fm_);
        o.LJIIIIZZ(findViewById3, "mLikeLayout.findViewById(R.id.layout_sticker_like)");
        this.LJLJJI = findViewById3;
        View findViewById4 = frameLayout.findViewById(R.id.fma);
        o.LJIIIIZZ(findViewById4, "mLikeLayout.findViewById…t_sticker_like_container)");
        this.LJLJJLL = findViewById4;
        TGD invoke = configureProvider.invoke();
        if (invoke != null) {
            TG7 tg7 = invoke.LJLLI;
            if (tg7.LJZ) {
                TDY tdy = new TDY();
                tdy.LIZIZ(C04330Ez.LIZIZ(findViewById2.getContext(), R.color.xt));
                tdy.LIZLLL(0);
                tdy.LIZJ(12.0f);
                findViewById2.setBackground(tdy.LIZ());
                findViewById2.getLayoutParams().height = (int) C74275TDb.LIZ(32.0f);
                findViewById2.getLayoutParams().width = (int) C74275TDb.LIZ(32.0f);
                findViewById3.setPadding((int) C74275TDb.LIZ(12.0f), findViewById3.getPaddingTop(), findViewById3.getPaddingRight(), findViewById3.getPaddingBottom());
                stickerDataManager.LJJJJLL().LJIJ().LJJJJ().LJLJJL.observe(LJIIJJI, new AObserverS82S0100000_14(this, 34));
                stickerDataManager.LJIIIIZZ().LJIILL().observe(LJIIJJI, new AObserverS77S0200000_14(invoke, this, 1));
            } else if (tg7.LLF) {
                TDY tdy2 = new TDY();
                tdy2.LIZIZ(C04330Ez.LIZIZ(findViewById2.getContext(), R.color.to));
                tdy2.LIZLLL(1);
                findViewById2.setBackground(tdy2.LIZ());
            }
            Drawable background = findViewById2.getBackground();
            if (background != null && invoke.LJLJJLL != -1) {
                C78880UxY.LJLIL(background, mAmeActivity.getResources().getColor(invoke.LJLJJLL));
                findViewById2.setBackground(background);
            }
        }
        mAmeActivity.getResources().getDimension(R.dimen.iy);
        mAmeActivity.getResources().getDimension(R.dimen.j1);
        mAmeActivity.getResources().getDimension(R.dimen.iw);
        Drawable LJFF = C07840Sm.LJFF(mAmeActivity.getResources().getDrawable(R.drawable.b4c));
        o.LJIIIIZZ(LJFF, "DrawableCompat.wrap(mAme…sticker_collection_fill))");
        this.LJLILLLLZI = LJFF;
        Drawable LJFF2 = C07840Sm.LJFF(mAmeActivity.getResources().getDrawable(R.drawable.b4d));
        o.LJIIIIZZ(LJFF2, "DrawableCompat.wrap(mAme…icker_collection_hollow))");
        this.LJLJI = LJFF2;
        c81658W3a.setOnStateChangeListener(new W3Z(this));
        C47919IrL.LIZIZ(mAmeActivity);
        C81661W3d c81661W3d = new C81661W3d(this);
        this.LJLIL = c81661W3d;
        C47919IrL.LIZJ(c81661W3d);
    }
}
