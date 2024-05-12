package X;

import Y.ACListenerS34S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.AUListenerS93S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.newtoolbar.widget.FixedSizeVerticalLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WKe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82104WKe extends C82102WKc {
    public int LJLLJ;
    public final AnimatorSet LJLLL;
    public final long LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final int LJLZ;
    public final C62822Ol8 LJZ;
    public LinearLayoutManager LJZI;
    public final C62822Ol8 LJZL;

    public final void LLJJLIIIJLLLLLLLZ() {
        this.LJLLJ = 2;
        getUiStates().LJ.LIZIZ.LJIILJJIL(false);
        getUiStates().LJ.LIZIZ.LJIIJJI();
        LLJLIL();
    }

    @Override // X.C82102WKc
    public final int LLJILJILJ() {
        return SFS.LJI(40.0d);
    }

    public final void LLJLIL() {
        if (((Boolean) this.LJZL.getValue()).booleanValue()) {
            LLJLILLLLZIIL(Math.min(((Number) this.LJZ.getValue()).intValue() * getUiStates().LJ.LIZIZ.getItemCount(), LLJJIJI()), this);
            return;
        }
        LinearLayoutManager linearLayoutManager = this.LJZI;
        if (linearLayoutManager != null) {
            FixedSizeVerticalLinearLayoutManager fixedSizeVerticalLinearLayoutManager = (FixedSizeVerticalLinearLayoutManager) linearLayoutManager;
            fixedSizeVerticalLinearLayoutManager.LLIIJI = new AqS145S0200000_14(fixedSizeVerticalLinearLayoutManager, this, 14);
        } else {
            o.LJIJI("layoutManager");
            throw null;
        }
    }

    @Override // X.C82102WKc, X.WM7
    public final void onDestroy() {
        super.onDestroy();
        this.LJLLL.cancel();
    }

    public C82104WKe(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLLJ = 2;
        this.LJLLL = new AnimatorSet();
        this.LJLLLL = 250L;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS164S0100000_14(diContainer, 206));
        this.LJLZ = 550;
        this.LJZ = C221108m2.LIZIZ(C165246e8.LJLIL);
        this.LJZL = C221108m2.LIZIZ(C53423Kxv.LJLIL);
    }

    @Override // X.C82102WKc, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        FrameLayout.LayoutParams layoutParams;
        LinearLayoutManager fixedSizeVerticalLinearLayoutManager;
        super.onActivityCreated(bundle);
        AbstractC030109x itemAnimator = LLJJIJIL().getItemAnimator();
        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC28931Bp) itemAnimator).LJI = false;
        getUiStates().LJ.LIZIZ.LJIILL(new AqS168S0100000_2(this, 308));
        getUiStates().LJ.LIZIZ.LJIIJJI();
        LLJJIJIIJIL().setImageResource(R.drawable.azf);
        ViewGroup.LayoutParams layoutParams2 = LLJJIJIIJIL().getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            layoutParams.setMarginEnd((int) C74275TDb.LIZIZ(requireSceneContext, 14.0f));
            Context requireSceneContext2 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            layoutParams.topMargin = (int) C74275TDb.LIZIZ(requireSceneContext2, 10.0f);
            Context requireSceneContext3 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext3, "requireSceneContext()");
            layoutParams.setMarginStart((int) C74275TDb.LIZIZ(requireSceneContext3, 10.0f));
            Context requireSceneContext4 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext4, "requireSceneContext()");
            layoutParams.bottomMargin = (int) C74275TDb.LIZIZ(requireSceneContext4, 10.0f);
            LLJJIJIIJIL().setLayoutParams(layoutParams);
        }
        getUiStates().LJ.LIZIZ.LJ().observe(this, new AObserverS82S0100000_14(this, 43));
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJI;
            }
        }, null, new AqS180S0100000_14(this, 217), 2, null);
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS34S0100000_14(this, 52));
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKv
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82105WKf) obj).LJ;
                }
            }, null, new AqS180S0100000_14(this, 218), 2, null);
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WL2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82105WKf) obj).LJII;
                }
            }, null, new AqS180S0100000_14(this, 219), 2, null);
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WKr
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C82105WKf) obj).LIZLLL);
                }
            }, null, new AqS180S0100000_14(this, 216), 2, null);
            if (((Boolean) this.LJZL.getValue()).booleanValue()) {
                requireSceneContext();
                fixedSizeVerticalLinearLayoutManager = new LinearLayoutManager(1, false);
            } else {
                fixedSizeVerticalLinearLayoutManager = new FixedSizeVerticalLinearLayoutManager(LLJJIJIL(), new C82107WKh(this), 0, 28);
            }
            this.LJZI = fixedSizeVerticalLinearLayoutManager;
            C57185McP LLJJIJIL = LLJJIJIL();
            LinearLayoutManager linearLayoutManager = this.LJZI;
            if (linearLayoutManager != null) {
                LLJJIJIL.setLayoutManager(linearLayoutManager);
                Context requireSceneContext5 = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext5, "requireSceneContext()");
                this.LJLJL = new C82036WHo(requireSceneContext5, getUiStates().LJ.LIZIZ, getUiActions());
                LLJJIJIL().setAdapter(LLJILJIL());
                LLJJJIL();
                return;
            }
            o.LJIJI("layoutManager");
            throw null;
        }
        o.LJIJI("loadMoreContainer");
        throw null;
    }

    public static final void LLJLILLLLZIIL(int i, C82104WKe c82104WKe) {
        int height = c82104WKe.LLJJIJIL().getHeight();
        c82104WKe.LJLLL.cancel();
        c82104WKe.LLJJIJIL();
        if (c82104WKe.LJLLJ == 1) {
            c82104WKe.LLJJIJIIJIL().setRotation(180.0f);
        } else {
            c82104WKe.LLJJIJIIJIL().setRotation(0.0f);
        }
        C57185McP LLJJIJIL = c82104WKe.LLJJIJIL();
        ValueAnimator ofInt = ValueAnimator.ofInt(height, i);
        ofInt.setDuration(c82104WKe.LJLLLL);
        ofInt.addUpdateListener(new AUListenerS93S0100000_4(LLJJIJIL, 17));
        c82104WKe.LJLLL.playTogether(ofInt);
        c82104WKe.LJLLL.start();
    }
}
