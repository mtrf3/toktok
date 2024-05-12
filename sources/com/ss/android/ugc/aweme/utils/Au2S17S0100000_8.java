package com.ss.android.ugc.aweme.utils;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C17N;
import X.C188727au;
import X.C19K;
import X.C208338Fp;
import X.C208398Fv;
import X.C212428Vi;
import X.C51389KEv;
import X.C51391KEx;
import X.C55096Ljo;
import X.C6ZT;
import X.C76542zS;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.JQN;
import X.JXS;
import X.JZ1;
import X.K4W;
import X.K9E;
import X.TAT;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.general.ECStoreInfoAssem;
import com.ss.android.ugc.aweme.general.ECStoreLiveAssem;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class Au2S17S0100000_8 extends TAT {
    public final int $t;
    public Object l0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S17S0100000_8(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        if (view != null) {
            InterfaceC65784Pro<C76800UCe> onClick = ((C51389KEv) au2S17S0100000_8.l0).getOnClick();
            if (onClick != null) {
                onClick.invoke();
            }
            C51389KEv c51389KEv = (C51389KEv) au2S17S0100000_8.l0;
            c51389KEv.getClass();
            Map<String, String> map = c51389KEv.LIZ().LIZ;
            o.LJIIIIZZ(map, "generateGeneralLogEventMap().builder()");
            C76542zS.LIZ("trending_words_click", map);
            C51389KEv c51389KEv2 = (C51389KEv) au2S17S0100000_8.l0;
            Context context = c51389KEv2.getContext();
            o.LJIIIIZZ(context, "context");
            SmartRoute LIZIZ = c51389KEv2.LIZIZ(context);
            if (LIZIZ != null) {
                LIZIZ.open();
            }
        }
    }

    public static final void LIZ$1(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        if (view != null) {
            InterfaceC65784Pro<C76800UCe> onClick = ((C51391KEx) au2S17S0100000_8.l0).getOnClick();
            if (onClick != null) {
                onClick.invoke();
            }
            C51391KEx c51391KEx = (C51391KEx) au2S17S0100000_8.l0;
            c51391KEx.getClass();
            C188727au LIZ = c51391KEx.LIZ();
            LIZ.LJIIIZ("enter_from", c51391KEx.getEntranceModel().LIZ);
            LIZ.LJIIIZ("search_entrance", c51391KEx.getEntranceModel().LJII);
            LIZ.LJIIIZ("enter_method", "enter");
            LIZ.LJIIIZ("search_keyword", "");
            Map<String, String> map = LIZ.LIZ;
            o.LJIIIIZZ(map, "generateGeneralLogEventM…               .builder()");
            C76542zS.LIZ("enter_search_blankpage", map);
            C51391KEx c51391KEx2 = (C51391KEx) au2S17S0100000_8.l0;
            Context context = c51391KEx2.getContext();
            o.LJIIIIZZ(context, "context");
            SmartRoute LIZIZ = c51391KEx2.LIZIZ(context);
            if (LIZIZ != null) {
                LIZIZ.open();
            }
        }
    }

    public static final void LIZ$10(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        if (view != null) {
            ((ECSearchBarAssem) au2S17S0100000_8.l0).K3(String.valueOf(((C19K) ((ECSearchBarAssem) au2S17S0100000_8.l0)._$_findCachedViewById(R.id.jf6)).getText()));
        }
    }

    public static final void LIZ$11(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        if (view != null) {
            ECSearchBarAssem eCSearchBarAssem = (ECSearchBarAssem) au2S17S0100000_8.l0;
            eCSearchBarAssem.getClass();
            if (!C6ZT.LIZ(view)) {
                eCSearchBarAssem.I3().getClass();
                Uri.Builder buildUpon = UriProtector.parse(RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageFilterPanelNew).buildUpon();
                o.LJIIIIZZ(buildUpon, "parse(searchBarVM.getFilterSchema()).buildUpon()");
                String builder = buildUpon.appendQueryParameter("tab_name", "store").appendQueryParameter("height", "110").appendQueryParameter("status_bar_bg_color", "00000080").toString();
                o.LJIIIIZZ(builder, "builder\n                …              .toString()");
                SmartRouter.buildRoute(view.getContext(), builder).open();
            }
        }
    }

    public static final void LIZ$2(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        if (view != null) {
            HalfDynamicSearchShopFragment halfDynamicSearchShopFragment = (HalfDynamicSearchShopFragment) au2S17S0100000_8.l0;
            halfDynamicSearchShopFragment.getClass();
            ASQ.LJ(halfDynamicSearchShopFragment, ASX.LIZ);
        }
    }

    public static final void LIZ$3(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S17S0100000_8.l0).invoke(view);
        }
    }

    public static final void LIZ$4(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        ActivityC45651qj LIZ;
        if (view != null && (LIZ = C212428Vi.LIZ((MallToolBarAssem) au2S17S0100000_8.l0)) != null) {
            MallToolBarAssem mallToolBarAssem = (MallToolBarAssem) au2S17S0100000_8.l0;
            MallToolBarAssem.I3(LIZ, mallToolBarAssem.LJLL, mallToolBarAssem.LJLLLL);
        }
    }

    public static final void LIZ$5(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        if (view != null) {
            ((ECStoreInfoAssem) au2S17S0100000_8.l0).p4(view, "click_info", "goods_click_photo");
        }
    }

    public static final void LIZ$6(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        if (view != null) {
            ((ECStoreInfoAssem) au2S17S0100000_8.l0).p4(view, "enter_shop_button", "goods_click_button");
        }
    }

    public static final void LIZ$7(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        ECStoreLiveAssem eCStoreLiveAssem;
        JXS jxs;
        Aweme aweme;
        if (view != null && (jxs = (eCStoreLiveAssem = (ECStoreLiveAssem) au2S17S0100000_8.l0).LLFF) != null && (aweme = jxs.LJLILLLLZI) != null) {
            SearchServiceCenter$NavigateAbility searchServiceCenter$NavigateAbility = (SearchServiceCenter$NavigateAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(eCStoreLiveAssem), SearchServiceCenter$NavigateAbility.class);
            AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8((ECStoreLiveAssem) au2S17S0100000_8.l0, 244);
            if (searchServiceCenter$NavigateAbility.xK()) {
                C17N.LJJJJL(aweme).j4(new JZ1(aqS174S0100000_8));
                searchServiceCenter$NavigateAbility.y80(C55096Ljo.LJIIZILJ((ECStoreLiveAssem) au2S17S0100000_8.l0), aweme, new JQN());
            } else {
                searchServiceCenter$NavigateAbility.ns(C55096Ljo.LJIIZILJ((ECStoreLiveAssem) au2S17S0100000_8.l0), aweme, aqS174S0100000_8);
            }
        }
    }

    public static final void LIZ$8(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        ISearchBarContextAbility iSearchBarContextAbility;
        if (view != null && (iSearchBarContextAbility = ((ECSearchBarAssem) au2S17S0100000_8.l0).I3().LJLJJI) != null) {
            iSearchBarContextAbility.gm();
        }
    }

    public static final void LIZ$9(Au2S17S0100000_8 au2S17S0100000_8, View view) {
        C208398Fv c208398Fv;
        K9E g8;
        if (view != null) {
            K4W.LIZ = String.valueOf(((C19K) ((ECSearchBarAssem) au2S17S0100000_8.l0)._$_findCachedViewById(R.id.jf6)).getText());
            K4W.LIZIZ = System.currentTimeMillis();
            ISearchBarContextAbility iSearchBarContextAbility = ((ECSearchBarAssem) au2S17S0100000_8.l0).I3().LJLJJI;
            if (iSearchBarContextAbility != null && (g8 = iSearchBarContextAbility.g8()) != null) {
                c208398Fv = g8.LJIIZILJ;
            } else {
                c208398Fv = null;
            }
            EditText search_edit_text = (EditText) ((ECSearchBarAssem) au2S17S0100000_8.l0)._$_findCachedViewById(R.id.jf6);
            o.LJIIIIZZ(search_edit_text, "search_edit_text");
            C208338Fp.LIZJ(c208398Fv, search_edit_text, (ImageView) ((ECSearchBarAssem) au2S17S0100000_8.l0)._$_findCachedViewById(R.id.d99), true);
            ((TextView) ((ECSearchBarAssem) au2S17S0100000_8.l0)._$_findCachedViewById(R.id.jf6)).setText("");
            if (!((ECSearchBarAssem) au2S17S0100000_8.l0)._$_findCachedViewById(R.id.jf6).isFocused()) {
                ((ECSearchBarAssem) au2S17S0100000_8.l0)._$_findCachedViewById(R.id.jf6).requestFocus();
            }
        }
    }
}
