package Y;

import X.C113554cx;
import X.C27570Aru;
import X.C2U8;
import X.C46506INa;
import X.C70300RiS;
import X.C70414RkI;
import X.C70916RsO;
import X.C70975RtL;
import X.C71062Ruk;
import X.C71800SFw;
import X.C78946Uyc;
import android.animation.Animator;
import android.graphics.Region;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.model.PdpV2EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget.UsPdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS19S0000100_12;

/* loaded from: classes13.dex */
public class IDLListenerS198S0100000_12 implements ViewTreeObserver.OnGlobalLayoutListener {
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
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS198S0100000_12 iDLListenerS198S0100000_12) {
        ViewGroup viewGroup;
        Map LJJJLIIL;
        String str;
        String str2;
        int i;
        View view = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).contentView;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.isf)) != null && viewGroup.getChildCount() > 0 && !((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLIIII) {
            PdpBodyWidget pdpBodyWidget = (PdpBodyWidget) iDLListenerS198S0100000_12.l0;
            if (!pdpBodyWidget.dataMounted) {
                return;
            }
            if (pdpBodyWidget.getViewModel().LLIIIJ) {
                if (((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLIIIILZ) {
                    C70414RkI c70414RkI = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLFII;
                    if (c70414RkI == null) {
                        return;
                    }
                    c70414RkI.LJJLIIIJL(((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel(), false, true);
                    return;
                }
                ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().Cw0(((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getActivity());
                C70414RkI c70414RkI2 = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLFII;
                if (c70414RkI2 != null) {
                    c70414RkI2.LJJLIIIJJI(((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel());
                }
                ProductPackStruct productPackStruct = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LJLJLLL;
                if (productPackStruct == null || (str = productPackStruct.productId) == null) {
                    str = "";
                }
                boolean z = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LJLJL;
                IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LJLJJLL;
                String str3 = null;
                if (pdpEnterParam != null) {
                    str2 = pdpEnterParam.getAwemeId();
                } else {
                    str2 = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam2 = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LJLJJLL;
                if (pdpEnterParam2 != null) {
                    str3 = pdpEnterParam2.getClickFrom();
                }
                if (z) {
                    i = 2;
                } else {
                    i = 3;
                }
                C2U8.LIZ(new C71062Ruk(1, str, str2, str3, Integer.valueOf(i)));
                ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).removeGlobalLayoutListener();
                return;
            }
            ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().Cw0(((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getActivity());
            C70414RkI c70414RkI3 = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLFII;
            if (c70414RkI3 != null) {
                c70414RkI3.LJJLIIIJL(((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel(), ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLIIIL, false);
            }
            C70414RkI c70414RkI4 = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLFII;
            if (c70414RkI4 != null) {
                c70414RkI4.LJJLIIIJJI(((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel());
            }
            IPdpStarter.PdpEnterParam pdpEnterParam3 = ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LJLJJLL;
            if (pdpEnterParam3 == null || (LJJJLIIL = pdpEnterParam3.getTrackParams()) == null) {
                LJJJLIIL = C113554cx.LJJJLIIL();
            }
            HashMap hashMap = new HashMap(LJJJLIIL);
            if (((PdpBodyWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLFII != null) {
                C70414RkI.LJJLJLI(new AqS159S0200000_12((PdpBodyWidget) iDLListenerS198S0100000_12.l0, (PdpBodyWidget) hashMap, (HashMap<String, Object>) 14));
            }
            ((PdpBodyWidget) iDLListenerS198S0100000_12.l0).removeGlobalLayoutListener();
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS198S0100000_12 iDLListenerS198S0100000_12) {
        long j;
        if (((ViewGroup) ((PdpBodyAssem) iDLListenerS198S0100000_12.l0)._$_findCachedViewById(R.id.isf)).getChildCount() <= 0 || ((PdpBodyAssem) iDLListenerS198S0100000_12.l0).H3().LJLJJL) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        PdpV2EnterParams pdpV2EnterParams = ((C70300RiS) ((PdpBodyAssem) iDLListenerS198S0100000_12.l0).LJLLILLLL.getValue()).LJLIL;
        if (pdpV2EnterParams != null) {
            j = pdpV2EnterParams.getEnterTimeStamp();
        } else {
            j = -1;
        }
        long j2 = elapsedRealtime - j;
        View _$_findCachedViewById = ((PdpBodyAssem) iDLListenerS198S0100000_12.l0)._$_findCachedViewById(R.id.isf);
        if (_$_findCachedViewById != null) {
            C78946Uyc.LJJIIJ(_$_findCachedViewById, new C70916RsO(), new AqS19S0000100_12(j2, 1));
        }
        View _$_findCachedViewById2 = ((PdpBodyAssem) iDLListenerS198S0100000_12.l0)._$_findCachedViewById(R.id.isf);
        if (_$_findCachedViewById2 != null) {
            C78946Uyc.LJJIIJ(_$_findCachedViewById2, new C70975RtL(), new AqS19S0000100_12(j2, 2));
        }
        PdpBodyAssem pdpBodyAssem = (PdpBodyAssem) iDLListenerS198S0100000_12.l0;
        pdpBodyAssem._$_findCachedViewById(R.id.isf).getViewTreeObserver().removeOnGlobalLayoutListener(pdpBodyAssem.LJZI);
    }

    public static final void onGlobalLayout$2(IDLListenerS198S0100000_12 iDLListenerS198S0100000_12) {
        int i;
        ViewTreeObserver viewTreeObserver;
        int i2;
        int i3;
        int i4;
        if (((UsPdpBottomNavBarWidget) iDLListenerS198S0100000_12.l0).getViewModel().LLIIII) {
            return;
        }
        View _$_findCachedViewById = ((UsPdpBottomNavBarWidget) iDLListenerS198S0100000_12.l0)._$_findCachedViewById(R.id.b21);
        if (_$_findCachedViewById != null) {
            i = _$_findCachedViewById.getHeight();
        } else {
            i = 0;
        }
        View _$_findCachedViewById2 = ((UsPdpBottomNavBarWidget) iDLListenerS198S0100000_12.l0)._$_findCachedViewById(R.id.m1a);
        if (_$_findCachedViewById2 != null && _$_findCachedViewById2.getVisibility() == 0) {
            View _$_findCachedViewById3 = ((UsPdpBottomNavBarWidget) iDLListenerS198S0100000_12.l0)._$_findCachedViewById(R.id.m1a);
            if (_$_findCachedViewById3 != null) {
                int height = _$_findCachedViewById3.getHeight();
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById3.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = null;
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i3 = marginLayoutParams.topMargin;
                } else {
                    i3 = 0;
                }
                int i5 = height + i3;
                ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById3.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    layoutParams2 = layoutParams3;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    i4 = marginLayoutParams2.bottomMargin;
                } else {
                    i4 = 0;
                }
                i2 = i4 + i5;
            } else {
                i2 = 0;
            }
            i += i2;
        }
        View _$_findCachedViewById4 = ((UsPdpBottomNavBarWidget) iDLListenerS198S0100000_12.l0).LJLIL._$_findCachedViewById(R.id.hqu);
        if (_$_findCachedViewById4 != null) {
            C27570Aru.LJII(i, _$_findCachedViewById4);
        }
        UsPdpBottomNavBarWidget usPdpBottomNavBarWidget = (UsPdpBottomNavBarWidget) iDLListenerS198S0100000_12.l0;
        usPdpBottomNavBarWidget.LJLJJI = false;
        View view = usPdpBottomNavBarWidget.contentView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(usPdpBottomNavBarWidget.LJLJJLL);
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS198S0100000_12 iDLListenerS198S0100000_12) {
        ((MiniPdpPanelFragment) iDLListenerS198S0100000_12.l0).xl(true);
        ((MiniPdpPanelFragment) iDLListenerS198S0100000_12.l0).LJLJJLL._$_findCachedViewById(R.id.k2r).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS198S0100000_12);
    }

    public static final void onGlobalLayout$4(IDLListenerS198S0100000_12 iDLListenerS198S0100000_12) {
        ((SkuPanelFragment) iDLListenerS198S0100000_12.l0).xl(true);
        ((SkuPanelFragment) iDLListenerS198S0100000_12.l0).LJLJJLL._$_findCachedViewById(R.id.k2r).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS198S0100000_12);
    }

    public static final void onGlobalLayout$5(IDLListenerS198S0100000_12 iDLListenerS198S0100000_12) {
        ((C71800SFw) iDLListenerS198S0100000_12.l0).getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS198S0100000_12);
        C71800SFw c71800SFw = (C71800SFw) iDLListenerS198S0100000_12.l0;
        Region LIZIZ = c71800SFw.LIZIZ(c71800SFw.LIZJ);
        if (LIZIZ != null) {
            ((C46506INa) ((C71800SFw) iDLListenerS198S0100000_12.l0).LIZIZ.getValue()).LIZ = LIZIZ;
        }
    }

    public static final void onGlobalLayout$6(IDLListenerS198S0100000_12 iDLListenerS198S0100000_12) {
        ProfileNaviActivity profileNaviActivity = (ProfileNaviActivity) iDLListenerS198S0100000_12.l0;
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(profileNaviActivity._$_findCachedViewById(R.id.i86), profileNaviActivity._$_findCachedViewById(R.id.i86).getWidth() / 2, (profileNaviActivity._$_findCachedViewById(R.id.i86).getHeight() / 3) * 2, 0.0f, (float) (Math.max(profileNaviActivity._$_findCachedViewById(R.id.i86).getWidth(), profileNaviActivity._$_findCachedViewById(R.id.i86).getHeight()) * 1.1d));
        createCircularReveal.setDuration(400L);
        createCircularReveal.setInterpolator(new AccelerateInterpolator());
        profileNaviActivity._$_findCachedViewById(R.id.i86).setVisibility(0);
        createCircularReveal.start();
        ((ProfileNaviActivity) iDLListenerS198S0100000_12.l0)._$_findCachedViewById(R.id.i86).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS198S0100000_12);
    }

    public IDLListenerS198S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
