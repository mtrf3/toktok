package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.comp.impl.game.ui.GameShortVideoAdDetailPageDialogFragment;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UHC extends AbstractC26257ASf {
    public final /* synthetic */ GameShortVideoAdDetailPageDialogFragment LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ int LIZJ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        WebKitView webKitView;
        BottomSheetBehavior<?> bottomSheetBehavior;
        int i;
        int i2;
        boolean z;
        View view;
        View childAt;
        View view2;
        WebKitView webKitView2;
        ViewTreeObserver viewTreeObserver;
        InterfaceC60761Nsz kitView;
        View view3;
        InterfaceC60761Nsz kitView2;
        InterfaceC60761Nsz kitView3;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LIZ;
        View view4 = this.LIZIZ;
        int i3 = this.LIZJ;
        gameShortVideoAdDetailPageDialogFragment.LJLLLL = f;
        VUI vui = gameShortVideoAdDetailPageDialogFragment.LJLJLLL;
        int i4 = 0;
        View view5 = null;
        if (vui == null && gameShortVideoAdDetailPageDialogFragment.LJLL == null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = gameShortVideoAdDetailPageDialogFragment.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView3 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                view2 = kitView3.LIZJ();
            } else {
                view2 = null;
            }
            if (view2 instanceof WebKitView) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = gameShortVideoAdDetailPageDialogFragment.LJLJL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
                    view3 = kitView2.LIZJ();
                } else {
                    view3 = null;
                }
                o.LJII(view3, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.webkit.WebKitView");
                WebKitView webKitView3 = (WebKitView) view3;
                gameShortVideoAdDetailPageDialogFragment.LJLL = webKitView3;
                ViewGroup.LayoutParams layoutParams = webKitView3.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = gameShortVideoAdDetailPageDialogFragment.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.getKitView()) != null) {
                view5 = kitView.LIZJ();
            }
            VUI vl = GameShortVideoAdDetailPageDialogFragment.vl((ViewGroup) view5);
            gameShortVideoAdDetailPageDialogFragment.LJLJLLL = vl;
            if (vl != null && (viewTreeObserver = vl.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnScrollChangedListener(new UHD(gameShortVideoAdDetailPageDialogFragment));
            }
            if (Build.VERSION.SDK_INT >= 23 && (webKitView2 = gameShortVideoAdDetailPageDialogFragment.LJLL) != null) {
                webKitView2.setOnScrollChangeListener(new UHF(gameShortVideoAdDetailPageDialogFragment));
            }
        } else if (((vui != null && vui.canScrollVertically(-1)) || ((webKitView = gameShortVideoAdDetailPageDialogFragment.LJLL) != null && webKitView.canScrollVertically(-1))) && (bottomSheetBehavior = gameShortVideoAdDetailPageDialogFragment.LJLJJI) != null) {
            bottomSheetBehavior.setDraggable(false);
        }
        if (gameShortVideoAdDetailPageDialogFragment.LJLJJL <= 0) {
            int height = view4.getHeight();
            gameShortVideoAdDetailPageDialogFragment.LJLJJL = height;
            float f2 = 1 - ((GameShortVideoAdDetailPageDialogFragment.LLIIIILZ - GameShortVideoAdDetailPageDialogFragment.LLIIIJ) / height);
            BottomSheetBehavior<?> bottomSheetBehavior2 = gameShortVideoAdDetailPageDialogFragment.LJLJJI;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setHalfExpandedRatio(f2);
            }
            gameShortVideoAdDetailPageDialogFragment.LJZI = (int) (gameShortVideoAdDetailPageDialogFragment.LJLJJL * f2);
        }
        BottomSheetBehavior<?> bottomSheetBehavior3 = gameShortVideoAdDetailPageDialogFragment.LJLJJI;
        if (bottomSheetBehavior3 != null) {
            i = bottomSheetBehavior3.getPeekHeight();
        } else {
            i = 0;
        }
        int i5 = gameShortVideoAdDetailPageDialogFragment.LJLJJL - i;
        if (f > 0.0f) {
            i2 = i5;
        } else {
            i2 = i;
        }
        float f3 = i2 * f;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("curSlideOffset");
        LIZ.append(gameShortVideoAdDetailPageDialogFragment.LJLLLL);
        LIZ.append(", scrolledDistance =");
        LIZ.append(f3);
        C0NB.LIZIZ("GameShortVideoAdDetailFragment", X1D.LIZIZ(LIZ));
        float f4 = GameShortVideoAdDetailPageDialogFragment.LLIFFJFJJ;
        if (f3 > f4) {
            gameShortVideoAdDetailPageDialogFragment.Al((f3 - f4) / ((gameShortVideoAdDetailPageDialogFragment.LJZI - i) - f4));
        } else {
            gameShortVideoAdDetailPageDialogFragment.Al(0.0f);
        }
        float f5 = f3 - (gameShortVideoAdDetailPageDialogFragment.LJZI - i);
        if (f5 > 0.0f) {
            gameShortVideoAdDetailPageDialogFragment.LJZ = true;
            float f6 = f3 - gameShortVideoAdDetailPageDialogFragment.LJLZ;
            ViewGroup viewGroup = gameShortVideoAdDetailPageDialogFragment.LJLLJ;
            if (viewGroup != null) {
                viewGroup.scrollBy(0, (int) f6);
            }
            ViewGroup viewGroup2 = gameShortVideoAdDetailPageDialogFragment.LJLLJ;
            if (viewGroup2 != null && (childAt = viewGroup2.getChildAt(0)) != null) {
                childAt.setAlpha(1.0f);
            }
        } else if (gameShortVideoAdDetailPageDialogFragment.LJZ) {
            gameShortVideoAdDetailPageDialogFragment.LJZ = false;
            ViewGroup viewGroup3 = gameShortVideoAdDetailPageDialogFragment.LJLLJ;
            if (viewGroup3 != null) {
                viewGroup3.setScrollY(i3);
            }
        }
        if (f > 0.0f) {
            float f7 = i5 - f3;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sendOffsetEvent offset=");
            LIZ2.append(f7);
            C0NB.LIZIZ("GameShortVideoAdDetailFragment", X1D.LIZIZ(LIZ2));
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = gameShortVideoAdDetailPageDialogFragment.LJLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
                C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4, "gameDetailPageTopOffsetDidChange", new JSONObject().put("offset", Float.valueOf(f7)));
            }
        }
        if (0.0f <= f && f <= 0.2f) {
            z = true;
        } else {
            z = false;
        }
        if (f > 0.0f && C29306Beo.LJJIIJ(gameShortVideoAdDetailPageDialogFragment.LJLJJLL) != z && (view = gameShortVideoAdDetailPageDialogFragment.LJLJJLL) != null) {
            if (!z) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        if (f5 > 0.0f) {
            float f8 = gameShortVideoAdDetailPageDialogFragment.LJLJJL - (i + f3);
            if (f8 < GameShortVideoAdDetailPageDialogFragment.LLII) {
                View view6 = gameShortVideoAdDetailPageDialogFragment.LJLLL;
                if (view6 != null) {
                    view6.setAlpha(1.0f);
                }
            } else {
                View view7 = gameShortVideoAdDetailPageDialogFragment.LJLLL;
                if (view7 != null) {
                    view7.setAlpha(1 - (f8 / GameShortVideoAdDetailPageDialogFragment.LLIIII));
                }
            }
        } else {
            View view8 = gameShortVideoAdDetailPageDialogFragment.LJLLL;
            if (view8 != null) {
                view8.setAlpha(0.0f);
            }
        }
        gameShortVideoAdDetailPageDialogFragment.LJLZ = f3;
        gameShortVideoAdDetailPageDialogFragment.xl();
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LIZ;
        if (i != 4) {
            if (i != 5) {
                if (i == 6) {
                    gameShortVideoAdDetailPageDialogFragment.Al(1.0f);
                }
            } else {
                gameShortVideoAdDetailPageDialogFragment.dismiss();
            }
        } else {
            gameShortVideoAdDetailPageDialogFragment.Al(0.0f);
        }
        gameShortVideoAdDetailPageDialogFragment.xl();
    }

    public UHC(GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment, View view, int i) {
        this.LIZ = gameShortVideoAdDetailPageDialogFragment;
        this.LIZIZ = view;
        this.LIZJ = i;
    }
}
