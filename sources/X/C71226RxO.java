package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingDialog;
import com.bytedance.keva.Keva;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RxO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71226RxO extends AbstractC71225RxN implements InterfaceC31748Cd6, InterfaceC72822Si2 {
    public final Context LJLJJL;
    public final C48502J1u LJLJJLL;
    public IIconSlot.SlotViewModel LJLJL;
    public final C71240Rxc LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public A72 LJLLI;

    public static final String LJIIL() {
        String currentUserID;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            return "";
        }
        return currentUserID;
    }

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<EnumC29188Bcu> LLJJJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC29188Bcu.LIVE_PREVIEW_BC_TOGGLE_INFO);
        return arrayList;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onResume() {
        ((AtomicBoolean) this.LJLJLLL.getValue()).compareAndSet(false, true);
        V2B startLiveManager = LiveOuterService.LJJJLL().startLiveManager();
        Object value = this.LJLL.getValue();
        startLiveManager.getClass();
        C29165BcX c29165BcX = (C29165BcX) Live.getService().startLiveManager();
        if (!((CopyOnWriteArrayList) c29165BcX.LJLIL).contains(value)) {
            ((CopyOnWriteArrayList) c29165BcX.LJLIL).add(value);
        }
    }

    @Override // X.AbstractC71225RxN, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("talent_live_product_list_num", this);
        C72818Shy.LJII("open_admin_list_dialog", this);
        if (C71227RxP.LIZLLL != null) {
            C71227RxP.LIZJ = null;
            C71227RxP.LIZ = true;
            C71227RxP.LIZIZ = 3;
            C71227RxP.LIZIZ().destroy();
        }
        C71227RxP.LIZLLL = null;
        V2B startLiveManager = LiveOuterService.LJJJLL().startLiveManager();
        Object value = this.LJLL.getValue();
        startLiveManager.getClass();
        ((CopyOnWriteArrayList) ((C29165BcX) Live.getService().startLiveManager()).LJLIL).remove(value);
        if (((AtomicBoolean) this.LJLJLLL.getValue()).get()) {
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new EK3(null), 3);
        }
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71226RxO(Context context) {
        super(1);
        o.LJIIIZ(context, "context");
        this.LJLJJL = context;
        this.LJLJJLL = new C48502J1u(C71226RxO.class.getName());
        this.LJLJLJ = new C71240Rxc(new C71228RxQ(this));
        this.LJLJLLL = C221108m2.LIZIZ(C71238Rxa.LJLIL);
        this.LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1201));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // X.InterfaceC31748Cd6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC67352kd r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.EK2
            if (r0 == 0) goto L7a
            r4 = r12
            X.EK2 r4 = (X.EK2) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r2 = r4.LJLILLLLZI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r3 = 3
            r10 = 0
            r6 = 1
            if (r0 == 0) goto L52
            if (r0 != r6) goto L83
            X.RxO r1 = r4.LJLIL
            X.C141335gf.LIZJ(r2)
        L24:
            X.EJz r2 = (X.C36235EJz) r2
            com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse<java.lang.String> r0 = r2.LIZ
            if (r0 == 0) goto L80
            boolean r0 = r0.isSuccess()
            if (r0 != r6) goto L80
            com.bytedance.android.live.slot.IIconSlot$SlotViewModel r0 = r1.LJLJL
            if (r0 == 0) goto L3d
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r0.LJLJJI
            if (r1 == 0) goto L3d
            java.lang.String r0 = ""
            r1.postValue(r0)
        L3d:
            java.lang.String r2 = X.C71227RxP.LIZLLL
            if (r2 == 0) goto L4f
            X.FSJ r0 = X.C36576EXc.LIZIZ
            X.2gm r1 = X.C48841JEv.LIZ(r0)
            X.EXe r0 = new X.EXe
            r0.<init>(r2, r10)
            X.XKX.LIZLLL(r1, r10, r10, r0, r3)
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L52:
            X.C141335gf.LIZJ(r2)
            X.EK0 r9 = new X.EK0
            r9.<init>()
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r4.LJLIL = r11
            r4.LJLJJI = r6
            X.FSJ r0 = X.C36576EXc.LIZIZ
            X.2gm r0 = X.C48841JEv.LIZ(r0)
            X.EJy r5 = new X.EJy
            r5.<init>(r6, r7, r8, r9, r10)
            X.XKn r0 = X.XKX.LIZIZ(r0, r10, r10, r5, r3)
            java.lang.Object r2 = r0.LJJIJ(r4)
            if (r2 != r1) goto L78
            return r1
        L78:
            r1 = r11
            goto L24
        L7a:
            X.EK2 r4 = new X.EK2
            r4.<init>(r11, r12)
            goto L12
        L80:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71226RxO.LJII(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        C48502J1u mEventParamHelper = this.LJLJJLL;
        o.LJIIIZ(mEventParamHelper, "mEventParamHelper");
        C48658J7u.LIZ("livesdk_tiktokec_product_icon_show", C71202Rx0.LIZ(mEventParamHelper).LIZ);
        LJIIJJI(new C71229RxR("rd_tiktokec_before_live_icon_show", LJIIL(), CardStruct.IStatusCode.DEFAULT));
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        BasePreviewSettingDialog LJIILLIIL;
        String LJJIJIL;
        MutableLiveData<String> mutableLiveData;
        String str = c199097rd.LJLIL;
        String str2 = "";
        if (o.LJ(str, "talent_live_product_list_num")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            int i = 0;
            if (interfaceC78280Uns != null) {
                i = u.LJJIJIIJI(interfaceC78280Uns, "productNum", 0);
            }
            IIconSlot.SlotViewModel slotViewModel = this.LJLJL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLJJI) != null) {
                if (i > 0) {
                    str2 = String.valueOf(i);
                }
                mutableLiveData.setValue(str2);
            }
            String str3 = C71227RxP.LIZLLL;
            if (str3 != null) {
                XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C36578EXe(str3, null), 3);
                return;
            }
            return;
        }
        if (!o.LJ(str, "open_admin_list_dialog") || (LJJIFFI = C45804HyK.LJJIFFI(this.LJLJJL)) == null || (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) == null) {
            return;
        }
        InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns2 != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns2, "page", "")) != null) {
            str2 = LJJIJIL;
        }
        if (!o.LJ("before_live", str2) || (LJIILLIIL = LiveOuterService.LJJJLL().LJIILLIIL(EnumC28411BDb.MODERATOR_LIST)) == null) {
            return;
        }
        LJIILLIIL.show(supportFragmentManager, "BasePreviewSettingDialog");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJL = viewModel2;
        this.LJLLI = slotGate;
        C78897Uxp.LJJJLIIL(viewModel2, true);
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(this.LJLJJL, R.drawable.apo));
        viewModel2.LJLLI.setValue(this.LJLJJL.getString(R.string.tw));
        viewModel2.LJLJLLL.setValue(C04270Et.LIZIZ(this.LJLJJL, R.drawable.apa));
        viewModel2.LJLLILLLL.setValue(this.LJLJJL.getString(R.string.to));
        Keva keva = DJ1.LIZ;
        if (keva.getBoolean("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM", true)) {
            viewModel2.LJLJJL.setValue(Boolean.TRUE);
            keva.storeBoolean("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM", false);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new EK1(System.currentTimeMillis(), this, null), 3);
        }
        C72818Shy.LJFF("talent_live_product_list_num", this, "ECProductBeforeLiveWidget");
        C72818Shy.LJFF("open_admin_list_dialog", this, "ECProductBeforeLiveWidget");
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, ? extends Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        boolean z;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_live_commercial");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Object obj2 = params.get("param_is_hidden_ec_widget");
        if (!(obj2 instanceof Boolean)) {
            obj2 = null;
        }
        this.LJLJJLL.LJII("anchor_id", LJIIL(), false);
        this.LJLJJLL.LJII("EVENT_ORIGIN_FEATURE", "TEMAI", false);
        this.LJLJJLL.LJII("room_id", CardStruct.IStatusCode.DEFAULT, false);
        this.LJLJJLL.LJII("live_status", "before_live", false);
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool) && !o.LJ(obj2, bool)) {
            z = true;
        } else {
            z = false;
        }
        interfaceC25704A6y.LIZ(z);
        if (o.LJ(obj, bool) && ECommerceService.createIECommerceServicebyMonsterPlugin(false).isLiveCreatorBCToggleAvailable()) {
            String LJIIL = LJIIL();
            Context context = this.LJLJJL;
            o.LJIIIZ(context, "context");
            C71227RxP.LIZLLL = LJIIL;
            C71227RxP.LIZJ = context;
            C71227RxP.LIZIZ().init();
            C71227RxP.LIZIZ().Jw(C71233RxV.LJLIL);
            C71227RxP.LIZIZ().Ds(C28529BHp.LJLIL);
            String str = C71227RxP.LIZLLL;
            if (str != null) {
                XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C36578EXe(str, null), 3);
            }
        }
    }
}
