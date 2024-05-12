package Y;

import X.C188727au;
import X.C244009hs;
import X.C26045AKb;
import X.C27743Auh;
import X.C55096Ljo;
import X.EnumC26917AhN;
import X.FMX;
import X.GO2;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.fragment.AddOrModifyKeywordFragment;
import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.PNSKrDeviceConsentUI;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui.SearchBarEllipsisAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftSettingFragment;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCListenerS205S0100000_4 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                return;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                return;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                return;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                return;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                return;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS205S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        Map<String, String> map;
        String str;
        String string;
        String string2;
        SearchBarEllipsisAssem searchBarEllipsisAssem = (SearchBarEllipsisAssem) iDCListenerS205S0100000_4.l0;
        ((AssemViewModel) searchBarEllipsisAssem.LJLJI.getValue()).setState(new AqS9S0010000_4(z, 21));
        TranslationKevaServiceImpl.LJIIL().LJIIJ(z);
        SearchResultFragmentAbility searchResultFragmentAbility = (SearchResultFragmentAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(searchBarEllipsisAssem), SearchResultFragmentAbility.class, null);
        if (searchResultFragmentAbility != null) {
            map = searchResultFragmentAbility.q9();
        } else {
            map = null;
        }
        searchBarEllipsisAssem.LJLJI.getValue();
        C188727au c188727au = new C188727au();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("switch_status", str);
        SearchEllipsisVM.gv0(c188727au, map);
        FMX.LJIIL("search_translate_switch_click", c188727au.LIZ);
        String str2 = "";
        if (z) {
            View view = searchBarEllipsisAssem.LJLIL;
            if (view != null) {
                C26045AKb c26045AKb = new C26045AKb(view);
                Context context = searchBarEllipsisAssem.getContext();
                if (context != null && (string2 = context.getString(R.string.sjp)) != null) {
                    str2 = string2;
                }
                c26045AKb.LJIIIZ(str2);
                c26045AKb.LJIIJ();
                return;
            }
            o.LJIJI("sheetView");
            throw null;
        }
        View view2 = searchBarEllipsisAssem.LJLIL;
        if (view2 != null) {
            C26045AKb c26045AKb2 = new C26045AKb(view2);
            Context context2 = searchBarEllipsisAssem.getContext();
            if (context2 != null && (string = context2.getString(R.string.sjq)) != null) {
                str2 = string;
            }
            c26045AKb2.LJIIIZ(str2);
            c26045AKb2.LJIIJ();
            return;
        }
        o.LJIJI("sheetView");
        throw null;
    }

    public static final void onCheckedChanged$1(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        ((AddOrModifyKeywordFragment) iDCListenerS205S0100000_4.l0).vl();
    }

    public static final void onCheckedChanged$2(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        ((AddOrModifyKeywordFragment) iDCListenerS205S0100000_4.l0).vl();
    }

    public static final void onCheckedChanged$3(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        ((PNSKrDeviceConsentUI) iDCListenerS205S0100000_4.l0).Ll();
    }

    public static final void onCheckedChanged$4(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        ((PNSKrDeviceConsentUI) iDCListenerS205S0100000_4.l0).Ll();
    }

    public static final void onCheckedChanged$5(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        ((TextView) ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.b7k)).setEnabled(!z);
        if (z) {
            ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.fhc).setVisibility(0);
            String str = ((AdSettingsActivity) iDCListenerS205S0100000_4.l0).LJLILLLLZI;
            if (str == null || str.length() == 0) {
                ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.m7k).setVisibility(0);
                ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.fhd).setVisibility(8);
            } else {
                ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.m7k).setVisibility(8);
                ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.fhd).setVisibility(0);
            }
        } else {
            ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.fhc).setVisibility(8);
            ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.m7k).setVisibility(8);
            ((AdSettingsActivity) iDCListenerS205S0100000_4.l0)._$_findCachedViewById(R.id.fhd).setVisibility(8);
        }
        ((AdSettingsActivity) iDCListenerS205S0100000_4.l0).LLIIIILZ(z);
    }

    public static final void onCheckedChanged$6(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        C27743Auh c27743Auh = (C27743Auh) iDCListenerS205S0100000_4.l0;
        int i = c27743Auh.LJLJJL;
        c27743Auh.LJLJJL = EnumC26917AhN.DEFAULT.getValue();
        ((C27743Auh) iDCListenerS205S0100000_4.l0).LIZ(i);
        TuxSheet tuxSheet = ((C27743Auh) iDCListenerS205S0100000_4.l0).LJLJJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    public static final void onCheckedChanged$7(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        C27743Auh c27743Auh = (C27743Auh) iDCListenerS205S0100000_4.l0;
        int i = c27743Auh.LJLJJL;
        c27743Auh.LJLJJL = EnumC26917AhN.LATEST.getValue();
        ((C27743Auh) iDCListenerS205S0100000_4.l0).LIZ(i);
        TuxSheet tuxSheet = ((C27743Auh) iDCListenerS205S0100000_4.l0).LJLJJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    public static final void onCheckedChanged$8(IDCListenerS205S0100000_4 iDCListenerS205S0100000_4, CompoundButton compoundButton, boolean z) {
        String str;
        GO2.LIZ.getClass();
        GO2.LIZJ.storeBoolean("posted_draft_status", z);
        DraftSettingFragment draftSettingFragment = (DraftSettingFragment) iDCListenerS205S0100000_4.l0;
        String str2 = draftSettingFragment.LJLIL;
        if (str2 != null) {
            String str3 = draftSettingFragment.LJLILLLLZI;
            if (str3 != null) {
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C244009hs.LIZ(str2, str3, linkedHashMap);
                linkedHashMap.put("to_status", str);
                FMX.LJIIL("change_posted_draft_toggle", linkedHashMap);
                return;
            }
            o.LJIJI("pageType");
            throw null;
        }
        o.LJIJI("enterFrom");
        throw null;
    }
}
