package X;

import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214038ad implements NRR {
    public final Aweme LIZ;
    public final IVideoPlayTaskManager LIZIZ;
    public final Fragment LIZJ;
    public final View LIZLLL;
    public final ViewGroup LJ;
    public View LJFF;
    public boolean LJI;
    public final C214048ae LJII;

    public final View LJIJI() {
        ViewParent viewParent;
        ViewParent parent;
        if (!this.LJI) {
            View findViewById = this.LIZLLL.findViewById(R.id.gtc);
            View view = null;
            if (findViewById != null && (parent = findViewById.getParent()) != null) {
                viewParent = parent.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof View) {
                view = (View) viewParent;
            }
            this.LJFF = view;
            this.LJI = true;
        }
        return this.LJFF;
    }

    @Override // X.InterfaceC44391HbX
    public final Context getContext() {
        return getFragment().getContext();
    }

    @Override // X.NSF
    public final IVideoPlayTaskManager LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.NRR
    public final C214048ae LJIIIIZZ() {
        return this.LJII;
    }

    @Override // X.NRV
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.NRR
    public final ViewGroup getContainer() {
        return this.LJ;
    }

    @Override // X.InterfaceC42661Goj
    public final Fragment getFragment() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC42661Goj, X.InterfaceC41451GOp
    public final LifecycleOwner getLifecycleOwner() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC41452GOq
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC41449GOn
    public final void LJIIJJI(InterfaceC40967G5z listener) {
        o.LJIIIZ(listener, "listener");
        C42660Goi.LIZ(this, listener);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.8ae] */
    public C214038ad(View rootView, Fragment fragment, VideoPlayTaskManager playerTaskManager, VideoBaseCell baseHolder, Aweme aweme) {
        ViewGroup viewGroup;
        o.LJIIIZ(playerTaskManager, "playerTaskManager");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(baseHolder, "baseHolder");
        o.LJIIIZ(rootView, "rootView");
        this.LIZ = aweme;
        this.LIZIZ = playerTaskManager;
        this.LIZJ = fragment;
        this.LIZLLL = rootView;
        View LJLJL = baseHolder.LJLJL("ad_bottom_area_layout");
        ViewGroup viewGroup2 = null;
        if ((LJLJL instanceof ViewGroup) && (viewGroup = (ViewGroup) LJLJL) != null) {
            viewGroup.post(new ARunnableS37S0100000_1(viewGroup, 104));
            if (viewGroup.getChildCount() == 0) {
                viewGroup.addView(C16880lQ.LLLLIILL(C16880lQ.LLZIL(rootView.getContext()), R.layout.fw, viewGroup, false));
            }
            viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bnc);
        }
        this.LJ = viewGroup2;
        this.LJII = new C95T() { // from class: X.8ae
            @Override // X.C95T
            public final int LIZIZ() {
                return C8ON.LIZIZ();
            }

            @Override // X.C95T
            public final void LIZJ(float f) {
                View LJIJI = C214038ad.this.LJIJI();
                if (LJIJI == null) {
                    return;
                }
                LJIJI.setAlpha(f);
            }

            @Override // X.C95T
            public final void LJ(int i) {
                ViewGroup.LayoutParams layoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View LJIJI = C214038ad.this.LJIJI();
                ViewGroup.LayoutParams layoutParams2 = null;
                if (LJIJI != null) {
                    layoutParams = LJIJI.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.bottomMargin = i;
                }
                View LJIJI2 = C214038ad.this.LJIJI();
                if (LJIJI2 == null) {
                    return;
                }
                View LJIJI3 = C214038ad.this.LJIJI();
                if (LJIJI3 != null) {
                    layoutParams2 = LJIJI3.getLayoutParams();
                }
                LJIJI2.setLayoutParams(layoutParams2);
            }

            @Override // X.C95T
            public final void LJFF(int i) {
                View LJIJI = C214038ad.this.LJIJI();
                if (LJIJI == null) {
                    return;
                }
                LJIJI.setVisibility(i);
            }
        };
    }
}
