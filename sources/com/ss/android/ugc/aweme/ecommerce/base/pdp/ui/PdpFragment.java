package com.ss.android.ugc.aweme.ecommerce.base.pdp.ui;

import X.AMD;
import X.AML;
import X.ASQ;
import X.ASX;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C06F;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C26059AKp;
import X.C26338AVi;
import X.C26875Agh;
import X.C27162AlK;
import X.C27531ArH;
import X.C27565Arp;
import X.C27739Aud;
import X.C29S;
import X.C2U8;
import X.C32151Nz;
import X.C3C5;
import X.C45621qg;
import X.C47135Ieh;
import X.C55047Lj1;
import X.C5H3;
import X.C61928OSe;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70215Rh5;
import X.C70414RkI;
import X.C70550RmU;
import X.C70858RrS;
import X.C70882Rrq;
import X.C70908RsG;
import X.C70909RsH;
import X.C71062Ruk;
import X.C72264SXs;
import X.C72713SgH;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73411SrX;
import X.C76800UCe;
import X.C78915Uy7;
import X.C78946Uyc;
import X.C78983UzD;
import X.C7MY;
import X.C86393XvR;
import X.C90903hW;
import X.CN1;
import X.DialogC25756A8y;
import X.EF7;
import X.EnumC221088m0;
import X.EnumC61929OSf;
import X.IWF;
import X.InterfaceC151715xP;
import X.InterfaceC60061Nhh;
import X.InterfaceC61312at;
import X.InterfaceC61927OSd;
import X.InterfaceC72712tH;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.M27;
import X.O6R;
import X.TBW;
import X.TMG;
import X.W1T;
import X.X1D;
import Y.IDLListenerS62S0200000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecallBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpAddonFloatWidget;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS19S0000100_12;
import kotlin.jvm.internal.AqS3S0000001_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class PdpFragment extends ECBaseSheetFragment implements InterfaceC151715xP, AMD<ViewModelProvider.Factory>, InterfaceC61927OSd, InterfaceC72712tH, InterfaceC60061Nhh {
    public static boolean LLIIJLIL;
    public Integer LJLJJLL;
    public C73411SrX LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLILLLL;
    public boolean LJLLL;
    public boolean LJLLLL;
    public PdpAddonFloatWidget LJLLLLLL;
    public C45621qg LJLZ;
    public boolean LLD;
    public boolean LLFF;
    public boolean LLFFF;
    public View LLFII;
    public View LLFZ;
    public CardView LLI;
    public View LLIFFJFJJ;
    public final lifecycleAwareLazy LLIIII;
    public final C27565Arp LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public IDLListenerS62S0200000_12 LLIIIL;
    public boolean LLIIIZ;
    public final Map<Integer, View> LLIIJI = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 244));
    public long LJLLJ = -1;
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 371));
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 368));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 369));
    public final C62822Ol8 LL = C221108m2.LIZIZ(C26875Agh.LJLIL);
    public final C5H3 LLF = C221108m2.LIZ(EnumC221088m0.NONE, new AqS154S0100000_4(this, 242));
    public final C62822Ol8 LLII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 243));

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void Gl() {
        this.LLIIIZ = true;
        C70414RkI c70414RkI = Ll().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJ = "return";
        }
        C61928OSe c61928OSe = new C61928OSe(Ll().jw0());
        EnumC61929OSf enumC61929OSf = EnumC61929OSf.RETURN;
        c61928OSe.LJIILIIL(enumC61929OSf);
        c61928OSe.LJIIL(getStayDuration());
        c61928OSe.LJIIJ();
        C70414RkI c70414RkI2 = Ll().LLFII;
        if (c70414RkI2 != null) {
            c70414RkI2.LJJJJJL(enumC61929OSf);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void Il() {
        this.LLIIIZ = true;
        C70414RkI c70414RkI = Ll().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJ = "return";
        }
        C61928OSe c61928OSe = new C61928OSe(Ll().jw0());
        EnumC61929OSf enumC61929OSf = EnumC61929OSf.RETURN;
        c61928OSe.LJIILIIL(enumC61929OSf);
        c61928OSe.LJIIL(getStayDuration());
        c61928OSe.LJIIJ();
        C70414RkI c70414RkI2 = Ll().LLFII;
        if (c70414RkI2 != null) {
            c70414RkI2.LJJJJJL(enumC61929OSf);
        }
        ASQ.LJ(this, ASX.LIZ);
    }

    public final void Jl() {
        try {
            this.LLFFF = true;
            ((DialogC25756A8y) this.LLII.getValue()).dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJI;
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
        return "product_detail";
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

    @Override // X.InterfaceC61927OSd
    public final boolean onBackPressed() {
        C70414RkI c70414RkI;
        this.LLIIIZ = true;
        if (!xl()) {
            return Ll().onBackPressed();
        }
        C70414RkI c70414RkI2 = Ll().LLFII;
        if (c70414RkI2 != null) {
            c70414RkI2.LJJ = "return";
        }
        C61928OSe c61928OSe = new C61928OSe(Ll().jw0());
        EnumC61929OSf enumC61929OSf = EnumC61929OSf.RETURN;
        c61928OSe.LJIILIIL(enumC61929OSf);
        c61928OSe.LJIIL(getStayDuration());
        c61928OSe.LJIIJ();
        boolean onBackPressed = Ll().onBackPressed();
        if (!onBackPressed && (c70414RkI = Ll().LLFII) != null) {
            c70414RkI.LJJJJJL(enumC61929OSf);
        }
        return onBackPressed;
    }

    public PdpFragment() {
        C70215Rh5 c70215Rh5 = new C70215Rh5(this);
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 370);
        this.LLIIII = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, c70215Rh5, 5));
        this.LLIIIILZ = new C27565Arp(this);
        this.LLIIIJ = C221108m2.LIZIZ(C70550RmU.LJLIL);
    }

    public final PdpViewModel Ll() {
        return (PdpViewModel) this.LLIIII.getValue();
    }

    public final C72713SgH Ml() {
        return (C72713SgH) this.LJZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final boolean downgrade() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZ().getPageAnimDegrade();
    }

    @Override // X.AMD
    public final ViewModelProvider.Factory getViewModelFactory() {
        return (ViewModelProvider.Factory) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        ViewTreeObserver viewTreeObserver;
        if (!this.LLIIIZ && !ActivityStack.isAppBackGround()) {
            C61928OSe c61928OSe = new C61928OSe(Ll().jw0());
            EnumC61929OSf enumC61929OSf = EnumC61929OSf.NEXT;
            c61928OSe.LJIILIIL(enumC61929OSf);
            c61928OSe.LJIIL(getStayDuration());
            c61928OSe.LJIIJ();
            C70414RkI c70414RkI = Ll().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJJJJL(enumC61929OSf);
            }
        }
        this.LLIIIZ = false;
        Ll().LLJJJIL = true;
        View view = this.LLFZ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LLIIIL);
        }
        super.onStop();
    }

    public final int Kl() {
        return Ll().mw0() + EF7.LIZIZ().getResources().getDimensionPixelSize(R.dimen.ju);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return onBackPressed();
    }

    public final boolean Nl() {
        IPdpStarter.PdpEnterParam pdpEnterParam = Ll().LJLJJLL;
        if (pdpEnterParam == null || !pdpEnterParam.getPlayerControl()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLJLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        HashMap<String, Object> hashMap = null;
        this.LJLJLJ = null;
        Jl();
        C26059AKp.LIZ().LIZIZ("ec_sku_user_transform", this);
        IEcUgPopupService LJIILJJIL = EcUgPopupService.LJIILJJIL();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        M27 m27 = (M27) this.LLIIIJ.getValue();
        boolean xl = xl();
        IPdpStarter.PdpEnterParam pdpEnterParam = Ll().LJLJJLL;
        if (pdpEnterParam != null) {
            hashMap = pdpEnterParam.getTrackParams();
        }
        LJIILJJIL.LJIILIIL(mo49getActivity, m27, xl, hashMap);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Ll().mx0(this);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (xl() && Ll().LJLJL && Nl()) {
            C2U8.LIZ(new C55047Lj1(getContext(), false));
        }
        Jl();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        HashMap<String, Object> hashMap;
        C70414RkI c70414RkI;
        C70414RkI c70414RkI2;
        super.onResume();
        IPdpStarter.PdpEnterParam pdpEnterParam = Ll().LJLJJLL;
        if (pdpEnterParam != null) {
            hashMap = pdpEnterParam.getTrackParams();
        } else {
            hashMap = null;
        }
        u.LJJIIJZLJL("pdp onResume", hashMap);
        if (xl()) {
            if (Nl()) {
                C2U8.LIZ(new C55047Lj1(getContext(), true));
            }
            if (this.LJLLJ > 0) {
                if (this.LJLLL && (c70414RkI2 = Ll().LLFII) != null) {
                    C78946Uyc.LJJII(c70414RkI2.LJIJI(), new C70909RsH(), new AqS19S0000100_12(this.LJLLJ, 3));
                }
                if (this.LJLLLL && (c70414RkI = Ll().LLFII) != null) {
                    C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70908RsG(), new AqS19S0000100_12(this.LJLLJ, 4));
                }
                this.LJLLJ = -1L;
                this.LJLLLL = false;
                this.LJLLL = false;
            }
        }
        if (!Ll().LLIIJI) {
            Ll().LLIIJI = true;
            C70414RkI c70414RkI3 = Ll().LLFII;
            if (c70414RkI3 != null) {
                c70414RkI3.LJJJZ(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final boolean xl() {
        IPdpStarter.PdpEnterParam pdpEnterParam = Ll().LJLJJLL;
        boolean z = false;
        if (pdpEnterParam != null && pdpEnterParam.getFullScreen()) {
            z = true;
        }
        return !z;
    }

    public final void Pl(boolean z) {
        if (!isResumed() || !this.LLFF || !Nl()) {
            return;
        }
        if (z) {
            View view = getView();
            if (view != null) {
                view.post(new Runnable() { // from class: X.2Q8
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            IWF.LJJLIIIIJ().LJIILJJIL();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
            IWF.LJJLIIIIJ().LJIJJ();
            return;
        }
        if (Nl()) {
            IWF.LJJLIIIIJ().LJJIL();
        }
        if (!Nl()) {
            return;
        }
        IWF.LJJLIIIIJ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        PdpViewModel Ll = Ll();
        Ll.getClass();
        C78915Uy7.LJJIL(params, new AqS178S0100000_12(Ll, 72));
        C78915Uy7.LJJIZ(params, "lib_track_builtin_lane_param_pass", new AqS178S0100000_12(Ll, 54));
        C70414RkI c70414RkI = Ll.LLFII;
        if (c70414RkI != null) {
            C78915Uy7.LJJIL(params, new AqS178S0100000_12(c70414RkI, 707));
        }
    }

    @Override // X.InterfaceC72712tH
    public final void onCountDown(long j) {
        RecallBox recallBox;
        if (Ll().LLJJIJI > 0) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.ic9);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Ll().LLJJIJI);
            LIZ.append('s');
            textView.setText(X1D.LIZIZ(LIZ));
            PdpViewModel Ll = Ll();
            Ll.LLJJIJI--;
            return;
        }
        if (Ll().LLJJIJI == 0) {
            PdpViewModel Ll2 = Ll();
            Ll2.getClass();
            ProductPackStruct productPackStruct = Ll2.LJLJLLL;
            if (productPackStruct != null && (recallBox = productPackStruct.recallBox) != null) {
                C78946Uyc.LJJII(this, new C70882Rrq(), new AqS178S0100000_12((HashMap) C27739Aud.LJII(recallBox.daInfo), (HashMap<String, Object>) 58));
            }
            PdpViewModel Ll3 = Ll();
            Ll3.LLJJIJI--;
            _$_findCachedViewById(R.id.ic5).setVisibility(8);
            return;
        }
        if (Ll().LLJJIJI != -1) {
            return;
        }
        _$_findCachedViewById(R.id.ic5).setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0176, code lost:
    
        if (r8 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v10, types: [X.2kd, X.XKY] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher, java.lang.Long, kotlin.jvm.internal.DefaultConstructorMarker, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC27438Apm
    public final boolean onDetectBlank(Map<String, String> params) {
        String str;
        o.LJIIIZ(params, "params");
        PdpViewModel Ll = Ll();
        Ll.getClass();
        if (!Ll.LLIIII) {
            PdpMainState pdpMainState = (PdpMainState) Ll.lv0();
            params.put("content_list_size", String.valueOf(pdpMainState.getContentList().size()));
            Integer Wv0 = Ll.Wv0();
            if (Wv0 == null || (str = Wv0.toString()) == null) {
                str = "";
            }
            params.put("biz_type", str);
            if (pdpMainState.getLoadingStatus() == 3) {
                params.put("blank_type", "error_status");
            } else if (Ll.LJLJLLL == null) {
                params.put("blank_type", "no_meta_data");
            }
            return true;
        }
        if (((ViewGroup) _$_findCachedViewById(R.id.isf)).getChildCount() > 0 && _$_findCachedViewById(R.id.isf).getHeight() > 0) {
            return false;
        }
        params.put("blank_type", "empty_view");
        return true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        LiveOuterService.LJJJLL().LJJIJIL().getClass();
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Pb0();
        if (Nl()) {
            boolean isPlaying = IWF.LJJLIIIIJ().isPlaying();
            if (this.LLFF && !isPlaying && Nl()) {
                IWF.LJJLIIIIJ().LIZIZ();
            }
            if (Nl()) {
                IWF.LJJLIIIIJ().LJJIL();
            }
        }
        Jl();
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJ(false);
        }
        LLIIJLIL = false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void wl(C45621qg c45621qg) {
        int LIZIZ;
        Float collapsedHeight;
        ViewTreeObserver viewTreeObserver;
        View rootView;
        View findViewById;
        View view = getView();
        if (view != null && (rootView = view.getRootView()) != null && (findViewById = rootView.findViewById(R.id.c8m)) != null) {
            findViewById.setElevation(0.0f);
        }
        C06F c06f = new C06F(-1, -2);
        c06f.LIZJ = 80;
        C16880lQ.LJLZ(_$_findCachedViewById(R.id.aov), (ConstraintLayout) _$_findCachedViewById(R.id.bs8));
        if (c45621qg != null) {
            c45621qg.addView(this.LLFZ, c06f);
        }
        this.LJLZ = c45621qg;
        if (this.LLI != null) {
            C06F c06f2 = new C06F(-2, -2);
            c06f2.LIZJ = 80;
            this.LLIIIL = new IDLListenerS62S0200000_12(this, c06f2, 0);
            View view2 = this.LLFZ;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.LLIIIL);
            }
            c06f2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            C16880lQ.LJLZ(this.LLI, (ConstraintLayout) _$_findCachedViewById(R.id.bs8));
            if (c45621qg != null) {
                c45621qg.addView(this.LLI, c06f2);
            }
        }
        View view3 = this.LLIFFJFJJ;
        if (view3 != null) {
            C06F c06f3 = new C06F(-2, C7MY.LIZIZ(32));
            int mw0 = Ll().mw0() + C27162AlK.LIZIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam = Ll().LJLJJLL;
            if (pdpEnterParam != null && (collapsedHeight = pdpEnterParam.getCollapsedHeight()) != null) {
                LIZIZ = (int) collapsedHeight.floatValue();
            } else {
                LIZIZ = C7MY.LIZIZ(LiveChatShowDelayForHotLiveSetting.DEFAULT);
            }
            ((ViewGroup.MarginLayoutParams) c06f3).topMargin = C47135Ieh.LIZ(8, C47135Ieh.LIZ(32, mw0 - LIZIZ));
            c06f3.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            c06f3.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            if (c45621qg != null) {
                c45621qg.addView(view3, c06f3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void Al(TuxSheet sheet, float f) {
        int i;
        int i2;
        int i3;
        o.LJIIIZ(sheet, "sheet");
        if (f <= 0.0f) {
            float f2 = -f;
            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.LJLIL.getValue();
            if (bottomSheetBehavior != null) {
                i3 = bottomSheetBehavior.getPeekHeight();
            } else {
                i3 = 0;
            }
            float f3 = f2 * i3;
            View view = this.LLFZ;
            if (view != null) {
                view.setTranslationY(f3);
            }
            CardView cardView = this.LLI;
            if (cardView != null) {
                cardView.setTranslationY(f3);
            }
        } else {
            View view2 = this.LLFZ;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
            CardView cardView2 = this.LLI;
            if (cardView2 != null) {
                cardView2.setTranslationY(0.0f);
            }
        }
        View view3 = this.LLIFFJFJJ;
        if (view3 != null) {
            float f4 = -f;
            if (f <= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior) this.LJLIL.getValue();
                if (bottomSheetBehavior2 != null) {
                    i2 = bottomSheetBehavior2.getPeekHeight();
                } else {
                    i2 = 0;
                }
            } else {
                int mw0 = Ll().mw0() + C27162AlK.LIZIZ;
                BottomSheetBehavior bottomSheetBehavior3 = (BottomSheetBehavior) this.LJLIL.getValue();
                if (bottomSheetBehavior3 != null) {
                    i = bottomSheetBehavior3.getPeekHeight();
                } else {
                    i = 0;
                }
                i2 = mw0 - i;
            }
            view3.setTranslationY(f4 * i2);
        }
        if (f <= 1.0f) {
            if (f >= 0.6f) {
                View view4 = this.LLFII;
                if (view4 != null) {
                    C26338AVi.LJI(view4, null, Integer.valueOf((int) (((f * 2.5d) - 1.5d) * Kl())), null, null, false, 29);
                }
            } else {
                View view5 = this.LLFII;
                if (view5 != null) {
                    C26338AVi.LJI(view5, null, 0, null, null, false, 29);
                }
            }
        }
        int[] iArr = {0, 0};
        int LIZIZ = C7MY.LIZIZ(44);
        if (_$_findCachedViewById(R.id.e6n) == null) {
            C78983UzD.LJIILL("PdpNewFragment bottom_sheet_container is null when pdp slide");
        } else {
            _$_findCachedViewById(R.id.e6n).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                LIZIZ = C7MY.LIZIZ(72);
            }
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ic5);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setTranslationY(LIZIZ);
        }
        PdpViewModel Ll = Ll();
        Ll.getClass();
        Ll.setState(new AqS3S0000001_12(f, 0));
        Iterator it = ((ArrayList) Ll().LJLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC88472Yns) it.next()).invoke(Float.valueOf(f));
        }
    }

    public final void Ol(PopUp popUp, Map<String, ? extends Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        long j;
        String str13 = popUp.schema;
        if (str13 == null) {
            return;
        }
        Uri.Builder buildUpon = UriProtector.parse(str13).buildUpon();
        Object obj = map.get("author_id");
        Object obj2 = null;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        buildUpon.appendQueryParameter("anchor_id", str);
        Object obj3 = map.get("source_content_id");
        if (obj3 != null) {
            str2 = obj3.toString();
        } else {
            str2 = null;
        }
        buildUpon.appendQueryParameter("group_id", str2);
        Object obj4 = map.get("entrance_form");
        if (obj4 != null) {
            str3 = obj4.toString();
        } else {
            str3 = null;
        }
        buildUpon.appendQueryParameter("enter_from", str3);
        Object obj5 = map.get("anchor_show_type");
        if (obj5 != null) {
            str4 = obj5.toString();
        } else {
            str4 = null;
        }
        buildUpon.appendQueryParameter("anchor_show_type", str4);
        Object obj6 = map.get("product_source");
        if (obj6 != null) {
            str5 = obj6.toString();
        } else {
            str5 = null;
        }
        buildUpon.appendQueryParameter("product_source", str5);
        Object obj7 = map.get("source_from");
        if (obj7 != null) {
            str6 = obj7.toString();
        } else {
            str6 = null;
        }
        buildUpon.appendQueryParameter("source_from", str6);
        Object obj8 = map.get("source");
        if (obj8 != null) {
            str7 = obj8.toString();
        } else {
            str7 = null;
        }
        buildUpon.appendQueryParameter("source", str7);
        Object obj9 = map.get("product_id");
        if (obj9 != null) {
            str8 = obj9.toString();
        } else {
            str8 = null;
        }
        buildUpon.appendQueryParameter("product_id", str8);
        Object obj10 = map.get("is_self");
        if (obj10 != null) {
            str9 = obj10.toString();
        } else {
            str9 = null;
        }
        buildUpon.appendQueryParameter("is_self", str9);
        Object obj11 = map.get("is_single_anchor");
        if (obj11 != null) {
            str10 = obj11.toString();
        } else {
            str10 = null;
        }
        buildUpon.appendQueryParameter("is_single_anchor", str10);
        Object obj12 = map.get("is_ad");
        if (obj12 != null) {
            str11 = obj12.toString();
        } else {
            str11 = null;
        }
        buildUpon.appendQueryParameter("is_ad", str11);
        Object obj13 = map.get("ad_id");
        if (obj13 != null) {
            str12 = obj13.toString();
        } else {
            str12 = null;
        }
        buildUpon.appendQueryParameter("ad_id", str12);
        String builder = buildUpon.toString();
        o.LJIIIIZZ(builder, "parse(url).buildUpon().a…   )\n        }.toString()");
        Long l = popUp.fcSecond;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Context context = getContext();
        if (context != null) {
            obj2 = C72264SXs.LIZ(context).LIZLLL("ug_last_popup_time");
        }
        if (obj2 == null) {
            SmartRouter.buildRoute(getContext(), builder).open();
            obj2 = Long.valueOf(System.currentTimeMillis() / 1000);
        } else {
            long parseLong = CastLongProtector.parseLong(obj2.toString()) + j;
            long j2 = 1000;
            if (parseLong <= System.currentTimeMillis() / j2) {
                SmartRouter.buildRoute(getContext(), builder).open();
                obj2 = Long.valueOf(System.currentTimeMillis() / j2);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            C72264SXs.LIZ(context2).LJIIIIZZ(obj2.toString(), "ug_last_popup_time");
        }
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        String str2;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_sku_user_transform")) {
            try {
                Object obj = new JSONObject(str).get("trans_from_type");
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, "1")) {
                    Ll().LLJJJ = true;
                } else if (o.LJ(str2, "2")) {
                    Ll().LLJJIJIL = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0349  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r43, android.os.Bundle r44) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void Dl(int i, int i2, boolean z) {
        C70414RkI c70414RkI;
        String str;
        String str2;
        String str3;
        String str4;
        if (i2 == 3 || i2 == 4 || i2 == 5) {
            Ll().ox0(i2);
        }
        String str5 = "";
        String str6 = null;
        if (i2 == 3) {
            if (i == 4) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null && (getParentFragment() instanceof DialogFragment)) {
                    C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
                    Fragment parentFragment = getParentFragment();
                    o.LJII(parentFragment, "null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
                    LJJIJIL.getClass();
                    ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).nd0(mo49getActivity, (DialogFragment) parentFragment);
                }
                C70414RkI c70414RkI2 = Ll().LLFII;
                if (c70414RkI2 != null) {
                    c70414RkI2.LJJIZ("halftofull");
                }
                ProductPackStruct productPackStruct = Ll().LJLJLLL;
                if (productPackStruct == null || (str3 = productPackStruct.productId) == null) {
                    str3 = "";
                }
                IPdpStarter.PdpEnterParam pdpEnterParam = Ll().LJLJJLL;
                if (pdpEnterParam != null) {
                    str4 = pdpEnterParam.getAwemeId();
                } else {
                    str4 = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam2 = Ll().LJLJJLL;
                if (pdpEnterParam2 != null) {
                    str6 = pdpEnterParam2.getClickFrom();
                }
                C2U8.LIZ(new C71062Ruk(str3, 2, str4, str6));
                return;
            }
            return;
        }
        if (i2 == 4) {
            if (i != 3) {
                return;
            }
            LiveOuterService.LJJJLL().LJJIJIL().getClass();
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Pb0();
            C70414RkI c70414RkI3 = Ll().LLFII;
            if (c70414RkI3 != null) {
                c70414RkI3.LJJIZ("fulltohalf");
            }
            ProductPackStruct productPackStruct2 = Ll().LJLJLLL;
            if (productPackStruct2 != null && (str2 = productPackStruct2.productId) != null) {
                str5 = str2;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam3 = Ll().LJLJJLL;
            if (pdpEnterParam3 != null) {
                str = pdpEnterParam3.getAwemeId();
            } else {
                str = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam4 = Ll().LJLJJLL;
            if (pdpEnterParam4 != null) {
                str6 = pdpEnterParam4.getClickFrom();
            }
            C2U8.LIZ(new C71062Ruk(str5, 3, str, str6));
            return;
        }
        if (i2 != 5 || i != 4 || !z || (c70414RkI = Ll().LLFII) == null) {
            return;
        }
        c70414RkI.LJJIZ("halftoquit");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context != null) {
            view = C27531ArH.LIZ(R.layout.a2e, context, viewGroup, false);
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
