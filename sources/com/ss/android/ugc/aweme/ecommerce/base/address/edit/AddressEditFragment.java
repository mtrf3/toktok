package com.ss.android.ugc.aweme.ecommerce.base.address.edit;

import X.AMD;
import X.AML;
import X.ASQ;
import X.ASX;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C26059AKp;
import X.C26227ARb;
import X.C26586Ac2;
import X.C26761Aer;
import X.C27021Aj3;
import X.C27241Amb;
import X.C27263Amx;
import X.C27285AnJ;
import X.C27532ArI;
import X.C27739Aud;
import X.C29S;
import X.C3AW;
import X.C3C5;
import X.C47261Igj;
import X.C5S1;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65330PkU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65777Prh;
import X.C70858RrS;
import X.C70921RsT;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73227SoZ;
import X.C76800UCe;
import X.C77119UOl;
import X.C78915Uy7;
import X.C78946Uyc;
import X.C78983UzD;
import X.C84654XKg;
import X.C90903hW;
import X.DialogC25756A8y;
import X.EF7;
import X.InterfaceC151715xP;
import X.InterfaceC25830ABu;
import X.InterfaceC26883Agp;
import X.InterfaceC27825Aw1;
import X.InterfaceC27833Aw9;
import X.InterfaceC60061Nhh;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC68122ls;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.ORS;
import X.ORZ;
import X.OSZ;
import X.TBW;
import X.TMG;
import X.UC0;
import X.ViewTreeObserverOnGlobalLayoutListenerC27247Amh;
import X.W1T;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressTipButton;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressTipInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AddressEditFragment extends ECBaseFragment implements InterfaceC151715xP, AMD<ViewModelProvider.Factory>, InterfaceC27825Aw1, InterfaceC68122ls, InterfaceC60061Nhh, InterfaceC25830ABu, InterfaceC27833Aw9 {
    public static AddressEditFragment LLD;
    public String LJLIL;
    public ViewTreeObserverOnGlobalLayoutListenerC27247Amh LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final lifecycleAwareLazy LJLJL;
    public final AqS154S0100000_4 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public String LJLLI;
    public KeyBoardVisibilityUtil LJLLILLLL;
    public AddressPageStarter.AddressEditEnterParams LJLLJ;
    public InterfaceC88472Yns<? super OSZ<String, Address>, C76800UCe> LJLLL;
    public AqS151S0200000_4 LJLLLL;
    public long LJLLLLLL;
    public AqS170S0100000_4 LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public int LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 115));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 109));

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "shipping_address";
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public AddressEditFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(AddressEditViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 114);
        this.LJLJL = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ, C27263Amx.INSTANCE, 0));
        this.LJLJLJ = new AqS154S0100000_4(this, 113);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 108));
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 110));
        this.LJLLJ = new AddressPageStarter.AddressEditEnterParams(null, null, "", null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 130683, null);
        this.LJLLL = C27285AnJ.LJLIL;
        this.LJLLLLLL = -1L;
        this.LJZI = true;
        this.LJZL = 1;
    }

    public final C26586Ac2 Al() {
        return (C26586Ac2) this.LJLJLLL.getValue();
    }

    public final AddressEditViewModel Dl() {
        return (AddressEditViewModel) this.LJLJL.getValue();
    }

    public final void Hl() {
        if (((Dialog) this.LJLL.getValue()).isShowing()) {
            ((Dialog) this.LJLL.getValue()).dismiss();
        }
    }

    @Override // X.AMD
    public final ViewModelProvider.Factory getViewModelFactory() {
        return (ViewModelProvider.Factory) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC27825Aw1
    public final void onInVisible() {
        try {
            C78946Uyc.LJJII(this, new C70921RsT(), new AqS170S0100000_4(this, 176));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void wl() {
        if (this.LJZI) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            mo49getActivity.finish();
            return;
        }
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        vl();
        return true;
    }

    @Override // X.InterfaceC27833Aw9
    public final boolean onBackPressed() {
        vl();
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        ((InterfaceC26883Agp) this.LJLJJLL.getValue()).onDestroy();
        C26059AKp.LIZ().LIZIZ("ec_address_edit_popup", this);
        C26059AKp.LIZ().LIZIZ("ec_show_check_address_result", this);
        C26059AKp.LIZ().LIZIZ("ec_change_address_on_order", this);
        C26059AKp.LIZ().LIZIZ("ec_change_address_on_edit_detail", this);
        View view = getView();
        if (view != null && (rootView = view.getRootView()) != null && (viewTreeObserver = rootView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJLILLLLZI);
        }
        this.LJLILLLLZI = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i;
        AddressEditViewModel Dl = Dl();
        Dl.getClass();
        ((ArrayList) Dl.LLILL).remove(this);
        super.onDestroyView();
        if (this.LJZ) {
            i = 0;
        } else {
            i = -1;
        }
        AddressPageStarter.AddressEvent addressEvent = new AddressPageStarter.AddressEvent("", i, null, 4, null);
        C84654XKg c84654XKg = AddressPageStarter.LIZ;
        if (c84654XKg != null) {
            C3C5.m7constructorimpl(addressEvent);
            c84654XKg.resumeWith(addressEvent);
            AddressPageStarter.LIZ = null;
        }
        this.LJZ = false;
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.LJZI) {
            onVisible();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!this.LJZI) {
            onInVisible();
        }
    }

    @Override // X.InterfaceC27825Aw1
    public final void onVisible() {
        Dl().LLJ = SystemClock.elapsedRealtime();
    }

    public final void vl() {
        C73157SnR.LJIIJJI(Dl(), new AqS170S0100000_4(this, 172));
    }

    public final void Gl(int i) {
        Collection collection = Al().LJLJI.LIZJ;
        o.LJII(collection, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
        List LIZIZ = C65777Prh.LIZIZ(collection);
        int LJJI = C47261Igj.LJJI(LIZIZ);
        Object obj = ListProtector.get(LIZIZ, LJJI);
        if (i > 0) {
            if (!(obj instanceof Integer)) {
                LIZIZ.add(Integer.valueOf(i));
                Al().notifyItemInserted(LJJI + 1);
                return;
            } else {
                if (i == ((Number) obj).intValue()) {
                    return;
                }
                ListProtector.set(LIZIZ, LJJI, Integer.valueOf(i));
                Al().notifyItemChanged(LJJI);
                return;
            }
        }
        if (!(obj instanceof Integer)) {
            return;
        }
        C26586Ac2 Al = Al();
        List LLJILJILJ = ORZ.LLJILJILJ(LIZIZ);
        ORS.LJJLL(LLJILJILJ);
        Al.getClass();
        C73227SoZ.LIZ(Al, LLJILJILJ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        C78915Uy7.LJJIL(params, new AqS170S0100000_4(this, 173));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0394, code lost:
    
        if (r0.isEmpty() != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ad  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r5 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r5 != null) goto L10;
     */
    @Override // X.InterfaceC68122ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCountDown(long r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = r6.Dl()
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionInfo r0 = r3.LLIL
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionDeadline r5 = r0.addressPromotionDeadline
        La:
            r4 = 0
            if (r5 == 0) goto L85
            java.lang.Integer r0 = r5.hour
            if (r0 == 0) goto L85
            int r1 = r0.intValue()
        L15:
            java.lang.Integer r0 = r5.minute
            if (r0 == 0) goto L89
            int r2 = r0.intValue()
        L1d:
            java.lang.Integer r0 = r5.second
            if (r0 == 0) goto L25
            int r4 = r0.intValue()
        L25:
            int r1 = r1 * 3600
            r0 = 60
            int r1 = X.C22510uV.LIZ(r2, r0, r1, r4)
            int r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.Yv0(r7)
            int r1 = r1 - r0
            if (r1 >= 0) goto L51
            r0 = 2131371194(0x7f0a24ba, float:1.8362416E38)
            android.view.View r0 = r6._$_findCachedViewById(r0)
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L51
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 1322(0x52a, float:1.853E-42)
            r1.<init>(r2, r0)
            r3.setState(r1)
        L50:
            return
        L51:
            int r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.Yv0(r7)
            r2 = 86400(0x15180, float:1.21072E-40)
            int r0 = r2 - r0
            if (r0 > 0) goto L6c
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 1322(0x52a, float:1.853E-42)
            r1.<init>(r2, r0)
            r3.setState(r1)
            goto L50
        L6c:
            r0 = 2131364981(0x7f0a0c75, float:1.8349814E38)
            android.view.View r1 = r6._$_findCachedViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto L78
            goto L50
        L78:
            int r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.Yv0(r7)
            int r2 = r2 - r0
            java.lang.String r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.Sv0(r2)
            r1.setText(r0)
            goto L50
        L85:
            r1 = 0
            if (r5 == 0) goto L89
            goto L15
        L89:
            r2 = 0
            if (r5 == 0) goto L25
            goto L1d
        L8d:
            r5 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.onCountDown(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0209, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "cart") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00da, code lost:
    
        if (r3 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC27438Apm
    public final boolean onDetectBlank(Map<String, String> params) {
        o.LJIIIZ(params, "params");
        AddressEditViewModel Dl = Dl();
        Dl.getClass();
        AddressEditState lv0 = Dl.lv0();
        if (lv0.getInputItemFirstTimeLoadingStatus() != 0) {
            params.put("content_list_size", String.valueOf(lv0.getInputItemVOList().size()));
            if (lv0.getInputItemFirstTimeLoadingStatus() == 2 || lv0.getInputItemFirstTimeLoadingStatus() == 3) {
                params.put("blank_type", "error_status");
            } else {
                List<C27021Aj3> inputItemVOList = lv0.getInputItemVOList();
                if (inputItemVOList == null || inputItemVOList.isEmpty()) {
                    params.put("blank_type", "empty_data_list");
                }
            }
            return true;
        }
        if (((ViewGroup) _$_findCachedViewById(R.id.isf)).getChildCount() > 0 && _$_findCachedViewById(R.id.isf).getHeight() > 0) {
            return false;
        }
        params.put("blank_type", "empty_view");
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("enter_params", this.LJLLJ);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        String str2;
        AddressVerifyData addressVerifyData;
        Object obj;
        List<AddressTipButton> list;
        AddressTipInfo addressTipInfo;
        String str3;
        String str4;
        String str5;
        o.LJIIIZ(eventName, "eventName");
        String str6 = null;
        Address address = null;
        switch (eventName.hashCode()) {
            case -1726668033:
                if (!eventName.equals("ec_change_address_on_edit_detail")) {
                    return;
                }
                AddressEditViewModel Dl = Dl();
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(Address.class)));
                    if (!(fromJson instanceof Address)) {
                        fromJson = null;
                    }
                    address = (Address) fromJson;
                } catch (s unused) {
                }
                Dl.vw0(address);
                return;
            case -1631874432:
                if (!eventName.equals("ec_show_check_address_result") || this.LJLJJI) {
                    return;
                }
                this.LJLJJI = true;
                if (getContext() != null) {
                    try {
                        Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(CheckShippingAddressData.class)));
                        if (!(fromJson2 instanceof CheckShippingAddressData)) {
                            fromJson2 = null;
                        }
                        CheckShippingAddressData checkShippingAddressData = (CheckShippingAddressData) fromJson2;
                        if (checkShippingAddressData == null || (addressVerifyData = checkShippingAddressData.verifyData) == null) {
                            return;
                        }
                        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ww, C16880lQ.LLZIL(requireContext()), null);
                        Context requireContext = requireContext();
                        o.LJIIIIZZ(requireContext, "requireContext()");
                        C26227ARb LIZ = C3AW.LIZ(requireContext);
                        AddressTipInfo addressTipInfo2 = addressVerifyData.tipInfo;
                        if (addressTipInfo2 != null && (str5 = addressTipInfo2.title) != null) {
                            LIZ.LJFF(str5);
                        }
                        C77119UOl.LJFF(LIZ, LLLZIIL);
                        AddressTipInfo addressTipInfo3 = addressVerifyData.tipInfo;
                        if (addressTipInfo3 != null && (str4 = addressTipInfo3.content) != null) {
                            LIZ.LIZIZ(str4);
                        }
                        if ((LLLZIIL instanceof TuxTextView) && (addressTipInfo = addressVerifyData.tipInfo) != null && (str3 = addressTipInfo.tips) != null) {
                            ((TextView) LLLZIIL).setText(str3);
                        }
                        AddressTipInfo addressTipInfo4 = addressVerifyData.tipInfo;
                        if (addressTipInfo4 != null && (list = addressTipInfo4.buttons) != null) {
                            UC0.LIZJ(LIZ, new AqS108S0300000_4((List) list, (List<AddressTipButton>) this, (AddressEditFragment) addressVerifyData, (AddressVerifyData) 4));
                        }
                        LIZ.LJII = false;
                        C27241Amb Wv0 = Dl().Wv0();
                        HashMap<String, Object> hashMap = Dl().LJLLLL;
                        if (hashMap != null) {
                            obj = hashMap.get("entrance_info");
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            str6 = (String) obj;
                        }
                        C27241Amb.LIZIZ(Wv0, "update_address_format", str6, null, null, 222);
                        LIZ.LJI().LIZLLL();
                        return;
                    } catch (s | Exception unused2) {
                        return;
                    }
                }
                C78983UzD.LJIILL("editFragment context is null");
                return;
            case 1582258407:
                if (!eventName.equals("ec_change_address_on_order")) {
                    return;
                }
                ChangeOnOrderStruct.Companion.getClass();
                Integer num = C26761Aer.LIZ(str).code;
                if (num == null || num.intValue() != 0) {
                    C26045AKb c26045AKb = new C26045AKb(this);
                    c26045AKb.LJIIIZ(C26761Aer.LIZ(str).toast_message);
                    c26045AKb.LJIIJ();
                    return;
                }
                wl();
                return;
            case 2069927075:
                if (!eventName.equals("ec_address_edit_popup")) {
                    return;
                }
                Object obj2 = new JSONObject(str).get("type");
                if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                    return;
                }
                int hashCode = str2.hashCode();
                if (hashCode != -1071039722) {
                    if (hashCode != 755424222) {
                        if (hashCode != 1825442897 || !str2.equals("give_up_deals")) {
                            return;
                        }
                    } else if (!str2.equals("component_unmount")) {
                        return;
                    }
                    wl();
                    return;
                }
                if (!str2.equals("fill_in_address")) {
                    return;
                }
                C73157SnR.LJIIJJI(Dl(), new AqS170S0100000_4(this, 175));
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((InterfaceC26883Agp) this.LJLJJLL.getValue()).LIZ(Dl(), view);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public final void xl(Integer num, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (num == null) {
            return;
        }
        if (num.intValue() == -1) {
            Hl();
            interfaceC65784Pro.invoke();
            return;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            DialogC25756A8y dialogC25756A8y = (DialogC25756A8y) this.LJLL.getValue();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-3360020830922042100")).LIZ) {
                return;
            }
            dialogC25756A8y.show();
            return;
        }
        if (num.intValue() != 2) {
            return;
        }
        Hl();
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZLLL(getString(R.string.r9l));
        c5s1.LJ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (viewGroup != null) {
            Context context = inflater.getContext();
            o.LJIIIIZZ(context, "inflater.context");
            view = C27532ArI.LIZ(R.layout.x3, context, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
