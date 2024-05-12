package Y;

import X.AbstractC60931Nvj;
import X.C018905p;
import X.C06460Ne;
import X.C109544Rq;
import X.C113554cx;
import X.C17N;
import X.C31F;
import X.C31G;
import X.C32151Nz;
import X.C34B;
import X.C38350F3i;
import X.C47135Ieh;
import X.C47261Igj;
import X.C48690J9a;
import X.C59465NVl;
import X.C60726NsQ;
import X.C60925Nvd;
import X.C60936Nvo;
import X.C60939Nvr;
import X.C60941Nvt;
import X.C60971NwN;
import X.C63164Oqe;
import X.LLE;
import X.NVB;
import X.NVF;
import X.NVK;
import X.NVL;
import X.NWH;
import X.NZ5;
import X.OM5;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.PdpV2Fragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabShowcaseFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard.DynamicCardViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class IDLListenerS197S0100000_10 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            case 7:
                onGlobalLayout$7(this);
                return;
            case 8:
                onGlobalLayout$8(this);
                return;
            case 9:
                onGlobalLayout$9(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        int i;
        int LIZ;
        int LIZ2;
        int peekHeight;
        C60939Nvr c60939Nvr = SparkPopup.LLIIZ;
        Window Jl = ((SparkPopup) iDLListenerS197S0100000_10.l0).Jl();
        ((SparkPopup) iDLListenerS197S0100000_10.l0).mo49getActivity();
        int LIZJ = C60939Nvr.LIZJ(c60939Nvr, Jl, SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0), (SparkPopup) iDLListenerS197S0100000_10.l0);
        AbstractC60931Nvj abstractC60931Nvj = null;
        if (SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getSelfAdaptiveHeight()) {
            SparkPopup sparkPopup = (SparkPopup) iDLListenerS197S0100000_10.l0;
            if (sparkPopup.LLI) {
                SparkPopup.xl(sparkPopup).setHeight(SparkPopup.wl((SparkPopup) iDLListenerS197S0100000_10.l0).getMeasuredHeight());
                SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).setPeekHeight((((SparkPopup) iDLListenerS197S0100000_10.l0).Kl() + SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getHeight()) - 1);
                SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIJJLI = ((SparkPopup) iDLListenerS197S0100000_10.l0).Kl() + SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getHeight();
                SparkPopup.Pl((SparkPopup) iDLListenerS197S0100000_10.l0, false, true, 0, 5);
            }
        } else if (LIZJ <= 0) {
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).setPeekHeight(SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LIZ() - 1);
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIJJLI = C60936Nvo.LIZJ(((SparkPopup) iDLListenerS197S0100000_10.l0).Jl()) - ((SparkPopup) iDLListenerS197S0100000_10.l0).Il(4);
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIILLIIL = true;
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LIZIZ(3);
        } else if (!SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragByGesture() || LIZJ >= SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragHeight()) {
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).setPeekHeight((((SparkPopup) iDLListenerS197S0100000_10.l0).Kl() + LIZJ) - 1);
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIJJLI = SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragHeight();
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIILLIIL = true;
            BottomSheetBehavior vl = SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0);
            Integer valueOf = Integer.valueOf(SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragDownCloseThreshold());
            if (valueOf.intValue() != 0) {
                i = valueOf.intValue();
            } else {
                i = C60925Nvd.LIZLLL;
            }
            vl.LJJIFFI = i;
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LIZIZ(3);
            if (SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIILL) {
                SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIIZILJ = true;
            }
        } else {
            int Kl = ((SparkPopup) iDLListenerS197S0100000_10.l0).Kl() + LIZJ;
            BottomSheetBehavior vl2 = SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0);
            if (Kl > 0) {
                int LIZJ2 = C60936Nvo.LIZJ(((SparkPopup) iDLListenerS197S0100000_10.l0).Jl());
                if (Kl > LIZJ2) {
                    Kl = LIZJ2;
                }
            } else {
                Kl = 0;
            }
            vl2.setPeekHeight(Kl);
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIJJLI = SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragHeight();
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIL = SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragUpThreshold();
            BottomSheetBehavior vl3 = SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0);
            Integer valueOf2 = Integer.valueOf(SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragDownThreshold());
            if (valueOf2.intValue() != 0) {
                LIZ = valueOf2.intValue();
            } else {
                LIZ = SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LIZ() - SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).getPeekHeight();
            }
            vl3.LJJ = LIZ;
            BottomSheetBehavior vl4 = SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0);
            Integer valueOf3 = Integer.valueOf(SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragDownCloseThreshold());
            if (valueOf3.intValue() != 0) {
                LIZ2 = valueOf3.intValue();
            } else {
                LIZ2 = SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LIZ() - ((int) (SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).getPeekHeight() * 0.8d));
            }
            vl4.LJJIFFI = LIZ2;
            BottomSheetBehavior vl5 = SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0);
            Integer valueOf4 = Integer.valueOf(SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getPeekDownCloseThreshold());
            if (valueOf4.intValue() != 0) {
                peekHeight = valueOf4.intValue();
            } else {
                peekHeight = (int) (SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).getPeekHeight() * 0.2d);
            }
            vl5.LJJI = peekHeight;
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LIZIZ(4);
            SparkPopup.vl((SparkPopup) iDLListenerS197S0100000_10.l0).LJIILLIIL = !SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getDragBack();
        }
        if (SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getSelfAdaptiveHeight()) {
            FrameLayout frameLayout = ((SparkPopup) iDLListenerS197S0100000_10.l0).LJLILLLLZI;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                SparkPopup.wl((SparkPopup) iDLListenerS197S0100000_10.l0).post(new ARunnableS46S0100000_10(iDLListenerS197S0100000_10, 12));
            } else {
                o.LJIJI("popupRoot");
                throw null;
            }
        } else {
            SparkPopup sparkPopup2 = (SparkPopup) iDLListenerS197S0100000_10.l0;
            C60941Nvt c60941Nvt = sparkPopup2.LJLJLLL;
            if (c60941Nvt != null) {
                SparkContext sparkContext = sparkPopup2.LJLLI;
                if (sparkContext != null) {
                    abstractC60931Nvj = (AbstractC60931Nvj) sparkContext.LIZIZ(AbstractC60931Nvj.class);
                }
                c60941Nvt.LIZIZ(abstractC60931Nvj, SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getHeight(), C60971NwN.LJLIL);
            } else {
                o.LJIJI("animatorParamHandler");
                throw null;
            }
        }
        if (!SparkPopup.xl((SparkPopup) iDLListenerS197S0100000_10.l0).getSelfAdaptiveHeight()) {
            SparkPopup.Pl((SparkPopup) iDLListenerS197S0100000_10.l0, false, false, 0, 7);
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        C59465NVl c59465NVl = (C59465NVl) iDLListenerS197S0100000_10.l0;
        Space space = c59465NVl.LJLILLLLZI;
        if (space != null) {
            c59465NVl.LJLJI = space.getHeight();
            Space space2 = ((C59465NVl) iDLListenerS197S0100000_10.l0).LJLILLLLZI;
            if (space2 != null) {
                space2.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS197S0100000_10);
                return;
            } else {
                o.LJIJI("space");
                throw null;
            }
        }
        o.LJIJI("space");
        throw null;
    }

    public static final void onGlobalLayout$2(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        ViewTreeObserver viewTreeObserver;
        TextView LJIJ = ((AdNewFakeUserProfileHeaderWidget) iDLListenerS197S0100000_10.l0).LJIJ();
        if (LJIJ != null && (viewTreeObserver = LJIJ.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS197S0100000_10);
        }
        AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget = (AdNewFakeUserProfileHeaderWidget) iDLListenerS197S0100000_10.l0;
        LinearLayout linearLayout = (LinearLayout) adNewFakeUserProfileHeaderWidget.LJLLL.getValue();
        if (linearLayout == null) {
            return;
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS61S0200000_10(linearLayout, adNewFakeUserProfileHeaderWidget, 0));
        TextView LJIJ2 = adNewFakeUserProfileHeaderWidget.LJIJ();
        if (LJIJ2 != null && LJIJ2.getLineCount() > 3) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        NVF nvf;
        NVL nvl;
        boolean z;
        String str;
        NVF nvf2 = (NVF) iDLListenerS197S0100000_10.l0;
        nvf2.getClass();
        Rect rect = new Rect();
        ((View) nvf2.LIZIZ.getValue()).getWindowVisibleDisplayFrame(rect);
        int height = rect.height();
        NVF nvf3 = (NVF) iDLListenerS197S0100000_10.l0;
        int i = nvf3.LIZJ;
        if (i == 0) {
            nvf3.LIZJ = height;
            return;
        }
        if (i == height) {
            return;
        }
        if (Math.abs(height - i) > 20 && (nvl = (nvf = (NVF) iDLListenerS197S0100000_10.l0).LJFF) != null) {
            int i2 = nvf.LIZJ;
            int i3 = nvf.LIZLLL;
            NVB nvb = nvl.LIZ;
            if (height < i2) {
                z = true;
            } else {
                z = false;
            }
            nvb.LLF = z;
            if (z) {
                str = "keyboardDidShow";
            } else {
                str = "keyboardDidHide";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("height", Integer.valueOf(C17N.LJJJJI(i3 - height)));
            NVB nvb2 = nvl.LIZ;
            if (nvb2.LJLJLLL) {
                NWH mBulletWebView = nvb2.getMBulletWebView();
                JSONObject jSONObject = new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap));
                mBulletWebView.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventName", str);
                if (mBulletWebView.getReactId().length() > 0) {
                    jSONObject2.put("reactId", mBulletWebView.getReactId());
                }
                jSONObject2.put("data", jSONObject);
                mBulletWebView.onEvent(new NVK(jSONObject2));
            } else {
                nvb2.getMWebView().LJJII(str, new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap)));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("send event ");
            LIZ.append(str);
            LIZ.append(' ');
            LIZ.append(linkedHashMap);
            X1D.LIZIZ(LIZ);
        }
        ((NVF) iDLListenerS197S0100000_10.l0).LIZJ = height;
    }

    public static final void onGlobalLayout$4(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        NZ5 nz5 = (NZ5) iDLListenerS197S0100000_10.l0;
        Space space = nz5.LJLIL;
        if (space != null) {
            nz5.LJLJI = space.getHeight();
            Space space2 = ((NZ5) iDLListenerS197S0100000_10.l0).LJLIL;
            if (space2 != null) {
                space2.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS197S0100000_10);
                return;
            } else {
                o.LJIJI("space");
                throw null;
            }
        }
        o.LJIJI("space");
        throw null;
    }

    public static final void onGlobalLayout$5(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        Integer valueOf;
        ViewTreeObserver viewTreeObserver;
        View view = ((PdpV2Fragment) iDLListenerS197S0100000_10.l0).LJLJJL;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null && (valueOf = Integer.valueOf(view.getHeight())) != null && valueOf.intValue() != 0) {
            ViewGroup.LayoutParams layoutParams = ((PdpV2Fragment) iDLListenerS197S0100000_10.l0)._$_findCachedViewById(R.id.hqu).getLayoutParams();
            if ((layoutParams instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = valueOf.intValue();
            }
            ((PdpV2Fragment) iDLListenerS197S0100000_10.l0)._$_findCachedViewById(R.id.hqu).setLayoutParams(marginLayoutParams);
            PdpV2Fragment pdpV2Fragment = (PdpV2Fragment) iDLListenerS197S0100000_10.l0;
            View view2 = pdpV2Fragment.LJLJJL;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(pdpV2Fragment.LJLLI);
            }
        }
    }

    public static final void onGlobalLayout$6(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        C109544Rq c109544Rq;
        int i;
        boolean z;
        int i2;
        int i3;
        String str;
        String localExtValue;
        Integer LJJIL;
        Integer LJJIL2;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = ((DynamicCardViewHolder) iDLListenerS197S0100000_10.l0).LLIIIJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LIZLLL() && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((DynamicCardViewHolder) iDLListenerS197S0100000_10.l0).LLIIIJ) != null) {
            int measuredWidth = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getMeasuredWidth();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = ((DynamicCardViewHolder) iDLListenerS197S0100000_10.l0).LLIIIJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                int measuredHeight = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0 || (c109544Rq = ((DynamicCardViewHolder) iDLListenerS197S0100000_10.l0).LLIIJLIL) == null) {
                    return;
                }
                Integer valueOf = Integer.valueOf(measuredWidth);
                String localExtValue2 = c109544Rq.getLocalExtValue("a:width_px");
                if (localExtValue2 != null && (LJJIL2 = C38350F3i.LJJIL(localExtValue2)) != null) {
                    i = LJJIL2.intValue();
                } else {
                    i = 0;
                }
                if (valueOf == null || i != valueOf.intValue()) {
                    String str2 = DynamicCardViewHolder.LLIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cacheCardWidth width:");
                    LIZ.append(valueOf);
                    LIZ.append(", recordWidth:");
                    LIZ.append(i);
                    LIZ.append("msg = ");
                    LIZ.append(c109544Rq.getUuid());
                    C34B.LJI(str2, X1D.LIZIZ(LIZ));
                    c109544Rq.addLocalExt("a:width_px", String.valueOf(valueOf));
                    z = true;
                } else {
                    z = false;
                }
                C109544Rq c109544Rq2 = ((DynamicCardViewHolder) iDLListenerS197S0100000_10.l0).LLIIJLIL;
                Integer valueOf2 = Integer.valueOf(measuredHeight);
                if (c109544Rq2 != null && (localExtValue = c109544Rq2.getLocalExtValue("a:height_px")) != null && (LJJIL = C38350F3i.LJJIL(localExtValue)) != null) {
                    i2 = LJJIL.intValue();
                } else {
                    i2 = 0;
                }
                if (valueOf2 == null || i2 != valueOf2.intValue()) {
                    String str3 = DynamicCardViewHolder.LLIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("cacheCardWidth height:");
                    LIZ2.append(valueOf2);
                    LIZ2.append(", recordHeight:");
                    LIZ2.append(i2);
                    LIZ2.append("msg = ");
                    if (c109544Rq2 != null) {
                        str = c109544Rq2.getUuid();
                    } else {
                        str = null;
                    }
                    C48690J9a.LJIIL(LIZ2, str, LIZ2, str3);
                    if (c109544Rq2 != null) {
                        c109544Rq2.addLocalExt("a:height_px", String.valueOf(valueOf2));
                    }
                } else if (!z) {
                    return;
                }
                String str4 = DynamicCardViewHolder.LLIL;
                StringBuilder LIZJ = C06460Ne.LIZJ("onMeasureUpdate width:", measuredWidth, ",  height:", measuredHeight, ", needUpdateLocalExt = ");
                LIZJ.append(true);
                LIZJ.append(", sparkview = ");
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = ((DynamicCardViewHolder) iDLListenerS197S0100000_10.l0).LLIIIJ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
                    i3 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.hashCode();
                } else {
                    i3 = 0;
                }
                LIZJ.append(i3);
                C34B.LJI(str4, X1D.LIZIZ(LIZJ));
                C31F.LIZ.getClass();
                C31G.LIZ();
                C63164Oqe.LIZIZ.LIZIZ(C47261Igj.LJJIJ(c109544Rq), false);
            }
        }
    }

    public static final void onGlobalLayout$7(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        Fragment fragment;
        if (((TabShowcaseFragment) iDLListenerS197S0100000_10.l0).getUserVisibleHint() && ((TabShowcaseFragment) iDLListenerS197S0100000_10.l0).isResumed()) {
            Rect rect = new Rect();
            C60726NsQ Hl = ((TabShowcaseFragment) iDLListenerS197S0100000_10.l0).Hl();
            if (Hl != null) {
                Hl.getGlobalVisibleRect(rect);
            }
            if (rect.top > 0) {
                TabShowcaseFragment tabShowcaseFragment = (TabShowcaseFragment) iDLListenerS197S0100000_10.l0;
                if (tabShowcaseFragment.LLFZ <= 0) {
                    tabShowcaseFragment.LLFZ = rect.bottom;
                    Fragment parentFragment = tabShowcaseFragment.getParentFragment();
                    if (parentFragment != null) {
                        fragment = parentFragment.getParentFragment();
                    } else {
                        fragment = null;
                    }
                    if (fragment instanceof LLE) {
                        TabShowcaseFragment tabShowcaseFragment2 = (TabShowcaseFragment) iDLListenerS197S0100000_10.l0;
                        tabShowcaseFragment2.LLFZ = C47135Ieh.LIZ(50, tabShowcaseFragment2.LLFZ);
                    }
                }
                TabShowcaseFragment tabShowcaseFragment3 = (TabShowcaseFragment) iDLListenerS197S0100000_10.l0;
                Context requireContext = tabShowcaseFragment3.requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                tabShowcaseFragment3.LLFFF = C32151Nz.LJJIJIIJI(requireContext, ((TabShowcaseFragment) iDLListenerS197S0100000_10.l0).LLFZ - rect.top);
                TabShowcaseFragment tabShowcaseFragment4 = (TabShowcaseFragment) iDLListenerS197S0100000_10.l0;
                if (tabShowcaseFragment4.LLFII) {
                    tabShowcaseFragment4.LLFII = false;
                    JSONObject params = new JSONObject().put("enter_method", ((TabShowcaseFragment) iDLListenerS197S0100000_10.l0).LLI).put("viewable_area", ((TabShowcaseFragment) iDLListenerS197S0100000_10.l0).LLFFF);
                    TabShowcaseFragment tabShowcaseFragment5 = (TabShowcaseFragment) iDLListenerS197S0100000_10.l0;
                    o.LJIIIIZZ(params, "params");
                    tabShowcaseFragment5.Ol("profile_appear_event", params);
                }
            }
        }
    }

    public static final void onGlobalLayout$8(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        RecyclerView recyclerView;
        if (!((TabStoreFragment) iDLListenerS197S0100000_10.l0).getUserVisibleHint() || !((TabStoreFragment) iDLListenerS197S0100000_10.l0).isResumed()) {
            return;
        }
        ((TabStoreFragment) iDLListenerS197S0100000_10.l0).Sl();
        View LJIJJ = ((TabStoreFragment) iDLListenerS197S0100000_10.l0).LJIJJ();
        if (!(LJIJJ instanceof RecyclerView) || (recyclerView = (RecyclerView) LJIJJ) == null) {
            return;
        }
        recyclerView.LJJLL(((TabStoreFragment) iDLListenerS197S0100000_10.l0).LLFFF);
        recyclerView.LJIIJJI(((TabStoreFragment) iDLListenerS197S0100000_10.l0).LLFFF);
    }

    public static final void onGlobalLayout$9(IDLListenerS197S0100000_10 iDLListenerS197S0100000_10) {
        OM5 om5 = (OM5) iDLListenerS197S0100000_10.l0;
        if (om5.LJ) {
            om5.LIZLLL = om5.LIZ.getHeight();
            om5.LJ = false;
        }
        Rect rect = new Rect();
        om5.LIZ.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != om5.LIZIZ) {
            int height = om5.LIZ.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > height / 4) {
                om5.LIZJ.height = (height - i2) + om5.LJFF;
            } else {
                om5.LIZJ.height = om5.LIZLLL;
            }
            om5.LIZ.requestLayout();
            om5.LIZIZ = i;
        }
    }

    public IDLListenerS197S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
