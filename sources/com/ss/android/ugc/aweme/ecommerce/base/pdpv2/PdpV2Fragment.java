package com.ss.android.ugc.aweme.ecommerce.base.pdpv2;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C26059AKp;
import X.C27162AlK;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C61712OJw;
import X.C61713OJx;
import X.C61928OSe;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70300RiS;
import X.C70450Rks;
import X.C70527Rm7;
import X.C70528Rm8;
import X.C70529Rm9;
import X.C70533RmD;
import X.C70858RrS;
import X.C70921RsT;
import X.C70922RsU;
import X.C70928Rsa;
import X.C76800UCe;
import X.C78915Uy7;
import X.C78926UyI;
import X.C78946Uyc;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.DialogC25756A8y;
import X.EnumC61929OSf;
import X.IWF;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC25830ABu;
import X.InterfaceC37828Esy;
import X.InterfaceC60061Nhh;
import X.InterfaceC61927OSd;
import X.InterfaceC65350Pko;
import X.InterfaceC71003Rtn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import Y.IDLListenerS197S0100000_10;
import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.util.ButtonActionHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpHeadViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS33S0100100_12;
import kotlin.jvm.internal.AqS3S0000001_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class PdpV2Fragment extends ECBaseFragment implements InterfaceC61927OSd, KPL, InterfaceC25830ABu, InterfaceC60061Nhh {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C214298b3 LJLJJI;
    public View LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C70300RiS LJLL;
    public final IDLListenerS197S0100000_10 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "product_detail";
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC61927OSd
    public final boolean onBackPressed() {
        this.LJLJJLL = true;
        if (!this.LJLL.LJ()) {
            C61928OSe c61928OSe = new C61928OSe(this.LJLL.LIZIZ());
            c61928OSe.LJIILIIL(EnumC61929OSf.RETURN);
            c61928OSe.LJIIL(getStayDuration());
            c61928OSe.LJIIJ();
        }
        vl().getClass();
        return false;
    }

    public PdpV2Fragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C214298b3 c214298b33;
        C214298b3 c214298b34;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpMainViewModel.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 174);
        C70527Rm7 c70527Rm7 = C70527Rm7.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS160S0100000_10, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c70527Rm7, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS160S0100000_10, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c70527Rm7, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(PdpBodyViewModel.class);
        AqS160S0100000_10 aqS160S0100000_102 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ2, 175);
        C70533RmD c70533RmD = C70533RmD.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS160S0100000_102, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c70533RmD, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS160S0100000_102, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c70533RmD, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b32;
        C65776Prg LIZ3 = C65352Pkq.LIZ(PdpHeadViewModel.class);
        AqS160S0100000_10 aqS160S0100000_103 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ3, 176);
        C70528Rm8 c70528Rm8 = C70528Rm8.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b33 = new C214298b3(aqS160S0100000_103, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c70528Rm8, LIZ3);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b33 = new C214298b3(aqS160S0100000_103, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c70528Rm8, LIZ3);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b33;
        C65776Prg LIZ4 = C65352Pkq.LIZ(PdpBottomViewModel.class);
        AqS160S0100000_10 aqS160S0100000_104 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ4, 177);
        C70529Rm9 c70529Rm9 = C70529Rm9.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b34 = new C214298b3(aqS160S0100000_104, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c70529Rm9, LIZ4);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b34 = new C214298b3(aqS160S0100000_104, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c70529Rm9, LIZ4);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJI = c214298b34;
        this.LJLJL = 4;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 173));
        this.LJLL = new C70300RiS();
        this.LJLLI = new IDLListenerS197S0100000_10(this, 5);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (!this.LJLJJLL && !ActivityStack.isAppBackGround()) {
            C61928OSe c61928OSe = new C61928OSe(this.LJLL.LIZIZ());
            c61928OSe.LJIILIIL(EnumC61929OSf.NEXT);
            c61928OSe.LJIIL(getStayDuration());
            c61928OSe.LJIIJ();
        }
        this.LJLJJLL = false;
        super.onStop();
    }

    public final PdpMainViewModel vl() {
        return (PdpMainViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C26059AKp.LIZ().LIZIZ("ec_page_quit", this);
        C26059AKp.LIZ().LIZIZ("ec_page_show", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        try {
            ((DialogC25756A8y) this.LJLJLLL.getValue()).dismiss();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        View view = this.LJLJJL;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LJLLI);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        new C70450Rks(this.LJLL.LIZIZ()).LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        InterfaceC71003Rtn interfaceC71003Rtn;
        Object context = getContext();
        if ((context instanceof InterfaceC37828Esy) && (interfaceC71003Rtn = (InterfaceC71003Rtn) context) != null) {
            return interfaceC71003Rtn;
        }
        return super.preTrackNode();
    }

    public final void Dl(boolean z) {
        if (!isResumed() || !this.LJLJLJ) {
            return;
        }
        if (z) {
            IWF.LJJLIIIIJ().LJIJJ();
        } else {
            IWF.LJJLIIIIJ().LJJIL();
            IWF.LJJLIIIIJ().LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        PdpMainViewModel vl = vl();
        vl.getClass();
        C78915Uy7.LJJJ(params, new AqS178S0100000_12(vl, 492));
        C78915Uy7.LJJIL(params, new AqS178S0100000_12(vl, 493));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8VV.LIZ(this, false, new AqS178S0100000_12(this, 151));
        PdpMainViewModel vl = vl();
        PdpHeadViewModel pdpHeadViewModel = (PdpHeadViewModel) this.LJLJI.getValue();
        PdpBodyViewModel pdpBodyViewModel = (PdpBodyViewModel) this.LJLILLLLZI.getValue();
        PdpBottomViewModel pdpBottomViewModel = (PdpBottomViewModel) this.LJLJJI.getValue();
        C70300RiS pdpPageData = this.LJLL;
        vl.getClass();
        o.LJIIIZ(pdpPageData, "pdpPageData");
        vl.LJLILLLLZI = pdpHeadViewModel;
        pdpBodyViewModel.LJLJJL = pdpPageData;
        vl.LJLIL = pdpBodyViewModel;
        vl.LJLJI = pdpBottomViewModel;
        ButtonActionHelper buttonActionHelper = new ButtonActionHelper(vl.getLifecycle());
        vl.LJLJJLL = buttonActionHelper;
        vl.LJLJJI = pdpPageData;
        buttonActionHelper.LJLILLLLZI = pdpPageData;
        vl.jv0(true, false);
        C26059AKp.LIZ().LIZJ("ec_sku_panel_open", vl);
        C26059AKp.LIZ().LIZJ("ec_sku_panel_state_change", vl);
        C26059AKp.LIZ().LIZJ("ec_sku_panel_operated", vl);
    }

    public final void wl(String str) {
        JSONObject jSONObject = new JSONObject(str);
        Object obj = jSONObject.get("product_id");
        Integer num = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        if (!o.LJ(obj, this.LJLL.LIZIZ())) {
            return;
        }
        Object obj2 = jSONObject.get("quit_type");
        if (obj2 instanceof Integer) {
            num = (Integer) obj2;
        }
        C78946Uyc.LJJII(this, new C70928Rsa(), new AqS143S0200000_12(this, num, 36));
        int value = EnumC61929OSf.NEXT.getValue();
        if (num == null || num.intValue() != value) {
            return;
        }
        C70300RiS c70300RiS = this.LJLL;
        if (!c70300RiS.LJLLLL) {
            return;
        }
        c70300RiS.LJLLLL = false;
        c70300RiS.LJLLLLLL = true;
        c70300RiS.LJLZ = SystemClock.elapsedRealtime();
        C78946Uyc.LJJII(this, new C70922RsU(), new AqS178S0100000_12(this, 150));
    }

    public final void xl(String str) {
        Object obj = new JSONObject(str).get("product_id");
        if (!(obj instanceof String)) {
            obj = null;
        }
        if (o.LJ(obj, this.LJLL.LIZIZ()) && this.LJLL.LJLLLLLL) {
            C78946Uyc.LJJII(this, new C70921RsT(), new AqS33S0100100_12(SystemClock.elapsedRealtime() - this.LJLL.LJLZ, this, 2));
            C70300RiS c70300RiS = this.LJLL;
            c70300RiS.LJLLLLLL = false;
            c70300RiS.LJLZ = -1L;
        }
    }

    public static final void Al(TuxSheet tuxSheet, boolean z) {
        Dialog dialog = tuxSheet.getDialog();
        if (dialog != null) {
            ActivityC45651qj requireActivity = tuxSheet.requireActivity();
            o.LJIIIIZZ(requireActivity, "sheet.requireActivity()");
            C61713OJx LIZLLL = C61712OJw.LIZLLL(requireActivity, dialog);
            LIZLLL.LIZIZ.LJIIJ(z);
            LIZLLL.LIZIZ.LJIIL();
            LIZLLL.LJFF(-16777216);
            LIZLLL.LIZIZ.LJII(true);
            LIZLLL.LIZ(false);
            LIZLLL.LIZJ();
        }
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        if (Float.isNaN(f)) {
            return;
        }
        if (f <= 0.0f) {
            float f2 = (-f) * C27162AlK.LIZJ;
            View view = this.LJLJJL;
            if (view != null) {
                view.setTranslationY(f2);
            }
        } else {
            View view2 = this.LJLJJL;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
        }
        PdpMainViewModel vl = vl();
        vl.getClass();
        vl.setState(new AqS3S0000001_12(f, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC25830ABu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Pg(com.bytedance.tux.sheet.sheet.TuxSheet r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sheet"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r7 = 1
            r6 = 3
            r4 = 5
            r5 = 4
            if (r10 == r6) goto L69
            if (r10 == r5) goto L50
            if (r10 == r4) goto L50
        Lf:
            if (r10 != r4) goto L81
            r8.LJLJJLL = r7
            X.OSe r2 = new X.OSe
            X.RiS r0 = r8.LJLL
            java.lang.String r0 = r0.LIZIZ()
            r2.<init>(r0)
            X.OSf r0 = X.EnumC61929OSf.RETURN
            r2.LJIILIIL(r0)
            long r0 = r8.getStayDuration()
            r2.LJIIL(r0)
            r2.LJIIJ()
        L2d:
            int r0 = r8.LJLJL
            if (r0 != r5) goto L42
            X.Rsi r3 = new X.Rsi
            r3.<init>()
            kotlin.jvm.internal.AqS35S1000000_12 r2 = new kotlin.jvm.internal.AqS35S1000000_12
            java.lang.String r1 = "halftoquit"
            r0 = 17
            r2.<init>(r1, r0)
            X.C78946Uyc.LJJII(r8, r3, r2)
        L42:
            r8.LJLJL = r10
            if (r10 == r4) goto L4a
            android.view.View r1 = r8.LJLJJL
            if (r1 != 0) goto L4b
        L4a:
            return
        L4b:
            r0 = 0
            r1.setTranslationY(r0)
            goto L4a
        L50:
            r3 = 0
            Al(r9, r3)
            r8.Dl(r3)
            com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel r2 = r8.vl()
            r2.getClass()
            kotlin.jvm.internal.AqS16S0010000_12 r1 = new kotlin.jvm.internal.AqS16S0010000_12
            r0 = 17
            r1.<init>(r3, r0)
            r2.setState(r1)
            goto Lf
        L69:
            Al(r9, r7)
            r8.Dl(r7)
            com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel r2 = r8.vl()
            r2.getClass()
            kotlin.jvm.internal.AqS16S0010000_12 r1 = new kotlin.jvm.internal.AqS16S0010000_12
            r0 = 17
            r1.<init>(r7, r0)
            r2.setState(r1)
            goto L83
        L81:
            if (r10 != r6) goto L99
        L83:
            int r0 = r8.LJLJL
            if (r0 != r5) goto L42
            X.Rsi r3 = new X.Rsi
            r3.<init>()
            kotlin.jvm.internal.AqS35S1000000_12 r2 = new kotlin.jvm.internal.AqS35S1000000_12
            java.lang.String r1 = "halftofull"
            r0 = 17
            r2.<init>(r1, r0)
            X.C78946Uyc.LJJII(r8, r3, r2)
            goto L42
        L99:
            if (r10 != r5) goto Lb1
            int r0 = r8.LJLJL
            if (r0 != r6) goto L42
            X.Rsi r3 = new X.Rsi
            r3.<init>()
            kotlin.jvm.internal.AqS35S1000000_12 r2 = new kotlin.jvm.internal.AqS35S1000000_12
            java.lang.String r1 = "fulltohalf"
            r0 = 17
            r2.<init>(r1, r0)
            X.C78946Uyc.LJJII(r8, r3, r2)
            goto L42
        Lb1:
            if (r10 != r4) goto Lb5
            goto L2d
        Lb5:
            if (r10 == r6) goto L42
            if (r10 == r5) goto L42
            if (r10 == r4) goto L42
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.PdpV2Fragment.Pg(com.bytedance.tux.sheet.sheet.TuxSheet, int):void");
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        try {
            if (o.LJ(eventName, "ec_page_quit")) {
                wl(str);
            } else if (o.LJ(eventName, "ec_page_show")) {
                xl(str);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (r3 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        r3 = r3.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if ((r3 instanceof X.C45621qg) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0112, code lost:
    
        if ((r3 instanceof android.view.View) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0114, code lost:
    
        r3 = (android.view.View) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0116, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        r3 = (android.view.View) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        r4 = new X.C06F(-1, -2);
        r4.LIZJ = 80;
        r0 = _$_findCachedViewById(com.zhiliaoapp.musically.R.id.aov);
        r11.LJLJJL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        r1 = r0.getViewTreeObserver();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        r1.addOnGlobalLayoutListener(r11.LJLLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        X.C16880lQ.LJLZ(_$_findCachedViewById(com.zhiliaoapp.musically.R.id.aov), (androidx.constraintlayout.widget.ConstraintLayout) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.bs8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if ((r3 instanceof X.C45621qg) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        r3 = (android.view.ViewGroup) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        r3.addView(r11.LJLJJL, r4);
        r2 = r3.findViewById(com.zhiliaoapp.musically.R.id.liz);
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "findViewById<View>(R.id.touch_outside)");
        X.C16880lQ.LJIIJ(new com.ss.android.ugc.aweme.utils.Au2S19S0100000_10(r11, 0), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        r11.LJLJLJ = X.IWF.LJJLIIIIJ().isPlaying();
        r1 = getParentFragment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fa, code lost:
    
        if ((r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheet) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        r1 = (androidx.fragment.app.DialogFragment) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
    
        r1 = r1.getDialog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0104, code lost:
    
        if (r1 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        r1.setOnKeyListener(new X.DialogInterfaceOnKeyListenerC70547RmR(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        r3 = null;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.PdpV2Fragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a56, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
