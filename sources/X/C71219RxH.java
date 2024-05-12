package X;

import Y.ACListenerS22S0100000_2;
import Y.ACListenerS37S0200000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.LivePermissionInfo;
import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.EcDrawMessage;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRefreshCouponListMessage;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.play.core.appupdate.u;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceLiveDegradeExp;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.data.OecInitData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.settings.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS178S0100000_12;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.RxH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71219RxH extends AbstractC71225RxN implements InterfaceC72822Si2 {
    public final Context LJLJJL;
    public IIconSlot.SlotViewModel LJLJJLL;
    public A72 LJLJL;
    public final C48502J1u LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public C26231ARf LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public final C64962gm LJLLLLLL;
    public final C71241Rxd LJLZ;
    public Room LJZ;
    public final C62822Ol8 LJZI;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(100003, 10000, 100002, 10004);
    }

    public final String LJIIL() {
        Long l;
        C86393XvR LJJIJIL;
        InterfaceC05190Ih currentUser;
        InterfaceC05190Ih author;
        String l2;
        Room room = this.LJZ;
        if (room == null || (author = room.author()) == null || (l2 = Long.valueOf(author.getId()).toString()) == null) {
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (currentUser = LJJIJIL.getCurrentUser()) != null) {
                l = Long.valueOf(currentUser.getId());
            } else {
                l = null;
            }
            return String.valueOf(l);
        }
        return l2;
    }

    public final String LJIILIIL() {
        String LIZ;
        Room room = this.LJZ;
        if (room == null || (LIZ = C17280m4.LIZ(room)) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return LIZ;
    }

    public final void LJIILL() {
        Context context = this.LJLJJL;
        String LJJJJZ = o.LJJJJZ(o.LJJJJZ(o.LJJJJZ(CreatorProductListLynxConfigSettings.LIZ(), "_roomId_", LJIILIIL(), false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJJJJZ);
        LIZ.append("&user_type=author");
        SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ)).open();
    }

    public final void LJIJI() {
        MutableLiveData<Drawable> mutableLiveData;
        MutableLiveData<Drawable> mutableLiveData2;
        MutableLiveData<Drawable> mutableLiveData3;
        if (this.LJLLL) {
            IIconSlot.SlotViewModel slotViewModel = this.LJLJJLL;
            if (slotViewModel != null && (mutableLiveData3 = slotViewModel.LJLJLJ) != null) {
                mutableLiveData3.setValue(C0OW.LIZ(this.LJLJJL.getResources(), R.drawable.api, null));
            }
            if (this.LJLLI) {
                this.LJLLI = false;
                IIconSlot.SlotViewModel slotViewModel2 = this.LJLJJLL;
                if (slotViewModel2 == null || (mutableLiveData2 = slotViewModel2.LJLL) == null) {
                    return;
                }
                mutableLiveData2.setValue(null);
                return;
            }
            return;
        }
        IIconSlot.SlotViewModel slotViewModel3 = this.LJLJJLL;
        if (slotViewModel3 == null || (mutableLiveData = slotViewModel3.LJLJLJ) == null) {
            return;
        }
        mutableLiveData.setValue(C0OW.LIZ(this.LJLJJL.getResources(), R.drawable.apj, null));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<EnumC29188Bcu> LLJJJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC29188Bcu.LIVE_ROOM_EC_LIVE_STATUS);
        return arrayList;
    }

    @Override // X.AbstractC71225RxN, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        String idStr;
        super.onDestroy();
        String str = null;
        C48841JEv.LIZJ(this.LJLLLLLL, null);
        Room room = this.LJZ;
        if (room != null && (idStr = room.getIdStr()) != null) {
            C71023Ru7.LIZ.remove(idStr);
        }
        LJIIJ();
        C72818Shy.LJII("set_live_continue", this);
        C72818Shy.LJII("talent_live_product_has_pin", this);
        C72818Shy.LJII("open_admin_list_dialog", this);
        C42625Go9.LIZJ(this);
        Room room2 = this.LJZ;
        if (room2 != null) {
            str = room2.getIdStr();
        }
        C247849o4.LIZ(str);
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71219RxH(Context context) {
        super(1);
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        this.LJLJJL = context;
        this.LJLJLJ = new C48502J1u("ECDuringLiveBroadcasterWidget");
        this.LJLL = true;
        this.LJLLLLLL = C48841JEv.LIZ(C36576EXc.LIZJ);
        this.LJLZ = new C71241Rxd(new C71224RxM(this));
        this.LJZI = C221108m2.LIZIZ(C53037Krh.LJLIL);
    }

    public static void LJIIZILJ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "live");
        linkedHashMap.put("popup_name", "author_ec_access_forbidden");
        linkedHashMap.put("action_type", str);
        C76542zS.LIZ("tiktokec_popup_click", linkedHashMap);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        if (kotlin.jvm.internal.o.LJ(str, "during_live")) {
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C36874Eda(this, null), 3);
            LJIIJJI(new C71229RxR("rd_tiktokec_during_live_icon_show", LJIIL(), LJIILIIL()));
        }
        C48502J1u mEventParamHelper = this.LJLJLJ;
        kotlin.jvm.internal.o.LJIIIZ(mEventParamHelper, "mEventParamHelper");
        C48658J7u.LIZ("livesdk_tiktokec_product_icon_show", C71202Rx0.LIZ(mEventParamHelper).LIZ);
    }

    @Override // X.AbstractC71225RxN, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        String idStr;
        boolean LIZ;
        C26231ARf c26231ARf;
        if (iMessage instanceof EcTaskRefreshCouponListMessage) {
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C75242xM(null), 3);
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C71222RxK(iMessage, this, null), 3);
            return;
        }
        if (iMessage instanceof ECommerceMessage) {
            ECommerceMessage eCommerceMessage = (ECommerceMessage) iMessage;
            int i = eCommerceMessage.actionType;
            if (i != 0) {
                if (i != 7) {
                    if (i != 8) {
                        if (i == 9) {
                            C52258Kf8.LIZ.getClass();
                            if (C52258Kf8.LIZ()) {
                                this.LJLLL = false;
                                if (this.LJLLJ && (c26231ARf = this.LJLLILLLL) != null) {
                                    c26231ARf.LIZIZ(null);
                                }
                                this.LJLLILLLL = null;
                                LJIJI();
                                LJIILJJIL(this.LJLLLL, false);
                            }
                        }
                    } else {
                        C52258Kf8.LIZ.getClass();
                        if (C52258Kf8.LIZ()) {
                            this.LJLLL = true;
                            LJIJ(eCommerceMessage.livePermissionInfo, false);
                            LJIJI();
                            LJIILJJIL(0, true);
                        }
                    }
                } else {
                    AtmosphereTagInfo atmosphereTagInfo = eCommerceMessage.atmosphereTagInfo;
                    if (atmosphereTagInfo == null) {
                        return;
                    }
                    Room room = this.LJZ;
                    if (room != null && (idStr = room.getIdStr()) != null) {
                        int i2 = atmosphereTagInfo.tagType;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    LIZ = C71023Ru7.LIZJ(idStr, false);
                                }
                            } else {
                                LIZ = C71023Ru7.LIZIZ(idStr, false);
                            }
                        } else {
                            LIZ = C71023Ru7.LIZ(idStr, false);
                        }
                        if (!LIZ) {
                            return;
                        }
                    }
                    XKX.LIZLLL(this.LJLLLLLL, null, null, new C71221RxJ(atmosphereTagInfo, null), 3);
                }
            } else {
                LJIILJJIL(eCommerceMessage.liveProductNumber, false);
            }
            int i3 = eCommerceMessage.actionType;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                        if (i3 != 8 && i3 != 9) {
                            return;
                        }
                        C52258Kf8.LIZ.getClass();
                        if (!C52258Kf8.LIZ()) {
                            return;
                        }
                        LJIILLIIL(eCommerceMessage.actionType, null);
                        return;
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    PopProduct popProduct = eCommerceMessage.popProduct;
                    if (popProduct != null) {
                        jSONObject.put("product_id", String.valueOf(Long.valueOf(popProduct.productId).longValue()));
                    }
                    LJIILLIIL(i3, jSONObject);
                    return;
                }
            }
            LJIILLIIL(i3, null);
            return;
        }
        if (iMessage instanceof ECShortItemRefreshMessage) {
            String LJIILIIL = LJIILIIL();
            String LJIIL = LJIIL();
            if (!C78685UuP.LJJJZ(LJIILIIL) || !C78685UuP.LJJJZ(LJIIL)) {
                return;
            }
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C71220RxI(LJIILIIL, LJIIL, iMessage, this, null), 3);
            return;
        }
        if (!(iMessage instanceof EcDrawMessage)) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C71197Rwv(iMessage, null), 3);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        DialogFragment LJJIJL;
        String LJJIJIL;
        MutableLiveData<Drawable> mutableLiveData;
        boolean z;
        A9Z a9z;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLJJL);
        if (LJJIFFI != null) {
            boolean z2 = false;
            if (kotlin.jvm.internal.o.LJ("set_live_continue", c199097rd.LJLIL)) {
                InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns != null) {
                    z = u.LJJIIZI(interfaceC78280Uns, "continue", false);
                } else {
                    z = true;
                }
                LiveOuterService.LJJJLL().LJIJJ();
                MutableLiveData<A9Z> mutableLiveData2 = C71272Ry8.LIZ(LJJIFFI).LJLIL;
                if (z) {
                    a9z = A9Z.STREAM_ON;
                } else {
                    a9z = A9Z.STREAM_PAUSE;
                }
                mutableLiveData2.setValue(a9z);
                return;
            }
            if (kotlin.jvm.internal.o.LJ("talent_live_product_has_pin", c199097rd.LJLIL) && this.LJLL) {
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    z2 = u.LJJIIZI(interfaceC78280Uns2, "hasPin", false);
                }
                this.LJLLI = z2;
                IIconSlot.SlotViewModel slotViewModel = this.LJLJJLL;
                C40681ii c40681ii = null;
                if (slotViewModel == null || (mutableLiveData = slotViewModel.LJLL) == null) {
                    return;
                }
                if (z2) {
                    c40681ii = C40681ii.LIZ(LJJIFFI.getResources(), R.drawable.apk, null);
                }
                mutableLiveData.setValue(c40681ii);
                return;
            }
            if (!kotlin.jvm.internal.o.LJ("open_admin_list_dialog", c199097rd.LJLIL)) {
                return;
            }
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            String str = "";
            if (interfaceC78280Uns3 != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns3, "page", "")) != null) {
                str = LJJIJIL;
            }
            if (!kotlin.jvm.internal.o.LJ("during_live", str) || (LJJIJL = LiveOuterService.LJJJLL().LJJIJL(EnumC28411BDb.MODERATOR_LIST)) == null) {
                return;
            }
            LJJIJL.show(LJJIFFI.getSupportFragmentManager(), "LiveAdminSettingDialog");
        }
    }

    @QD3
    public final void onShowBagList(C71061Ruj showBagList) {
        Long l;
        kotlin.jvm.internal.o.LJIIIZ(showBagList, "showBagList");
        if (showBagList.LJLIL) {
            String str = showBagList.LJLILLLLZI;
            Room room = this.LJZ;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            if (kotlin.jvm.internal.o.LJ(str, String.valueOf(l))) {
                LJIILL();
            }
        }
    }

    @QD3
    public final void onShowStateEvent(C233899Fx popCardShownStateEvent) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Drawable> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Drawable> mutableLiveData4;
        MutableLiveData<Drawable> mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6;
        kotlin.jvm.internal.o.LJIIIZ(popCardShownStateEvent, "popCardShownStateEvent");
        if (this.LJLL) {
            C36746EbW.LIZ(5, "show tag by js callback");
            return;
        }
        int i = popCardShownStateEvent.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || !this.LJLLI) {
                    return;
                }
                this.LJLLI = false;
                IIconSlot.SlotViewModel slotViewModel = this.LJLJJLL;
                if (slotViewModel != null && (mutableLiveData6 = slotViewModel.LJZ) != null) {
                    mutableLiveData6.setValue(Boolean.FALSE);
                }
                IIconSlot.SlotViewModel slotViewModel2 = this.LJLJJLL;
                if (slotViewModel2 == null || (mutableLiveData5 = slotViewModel2.LJLL) == null) {
                    return;
                }
                mutableLiveData5.setValue(null);
                return;
            }
            this.LJLLI = true;
            IIconSlot.SlotViewModel slotViewModel3 = this.LJLJJLL;
            if (slotViewModel3 != null && (mutableLiveData4 = slotViewModel3.LJLL) != null) {
                mutableLiveData4.setValue(C40681ii.LIZ(this.LJLJJL.getResources(), R.drawable.apk, null));
            }
            if (EcommerceLiveDegradeExp.LIZJ().LIZ() && ECommerceService.createIECommerceServicebyMonsterPlugin(false).isLowLevelDevice()) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, 1.0f, 1.3f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, 1.0f, 1.3f);
            AnimatorSet LIZ = C1DD.LIZ(100L);
            LIZ.play(ofFloat).with(ofFloat2).after(200L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, 1.3f, 0.9f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, 1.3f, 0.9f);
            AnimatorSet LIZ2 = C1DD.LIZ(200L);
            LIZ2.playTogether(ofFloat3, ofFloat4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, 0.9f, 1.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, 0.9f, 1.0f);
            AnimatorSet LIZ3 = C1DD.LIZ(100L);
            LIZ3.playTogether(ofFloat5, ofFloat6);
            animatorSet.playSequentially(LIZ, LIZ2, LIZ3);
            IIconSlot.SlotViewModel slotViewModel4 = this.LJLJJLL;
            if (slotViewModel4 != null && (mutableLiveData3 = slotViewModel4.LJZ) != null) {
                mutableLiveData3.setValue(Boolean.FALSE);
            }
            IIconSlot.SlotViewModel slotViewModel5 = this.LJLJJLL;
            if (slotViewModel5 == null) {
                return;
            }
            slotViewModel5.LLI = animatorSet;
            MutableLiveData<Boolean> mutableLiveData7 = slotViewModel5.LJZ;
            if (mutableLiveData7 == null) {
                return;
            }
            mutableLiveData7.setValue(Boolean.TRUE);
            return;
        }
        if (this.LJLLI) {
            return;
        }
        this.LJLLI = true;
        IIconSlot.SlotViewModel slotViewModel6 = this.LJLJJLL;
        if (slotViewModel6 != null && (mutableLiveData2 = slotViewModel6.LJLL) != null) {
            mutableLiveData2.setValue(C40681ii.LIZ(this.LJLJJL.getResources(), R.drawable.apk, null));
        }
        if (EcommerceLiveDegradeExp.LIZJ().LIZ() && ECommerceService.createIECommerceServicebyMonsterPlugin(false).isLowLevelDevice()) {
            return;
        }
        IIconSlot.SlotViewModel slotViewModel7 = this.LJLJJLL;
        if (slotViewModel7 != null && (mutableLiveData = slotViewModel7.LJZ) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_X, 0.0f, 1.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.SCALE_Y, 0.0f, 1.0f);
        AnimatorSet LIZ4 = C1DD.LIZ(150L);
        LIZ4.playTogether(ofFloat7, ofFloat8);
        IIconSlot.SlotViewModel slotViewModel8 = this.LJLJJLL;
        if (slotViewModel8 == null) {
            return;
        }
        slotViewModel8.LLI = LIZ4;
        MutableLiveData<Boolean> mutableLiveData8 = slotViewModel8.LJZ;
        if (mutableLiveData8 == null) {
            return;
        }
        mutableLiveData8.setValue(Boolean.TRUE);
    }

    public static final void LJIILLIIL(int i, JSONObject jSONObject) {
        IEventCenter LJ = EventCenter.LJ();
        JSONObject LIZLLL = C770830u.LIZLLL("action_type", i);
        if (jSONObject != null) {
            LIZLLL.put("data", jSONObject);
        }
        String jSONObject2 = LIZLLL.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
        LJ.LIZ("ec_author_message_event", jSONObject2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL(int i, boolean z) {
        boolean z2;
        java.util.Map<EnumC29188Bcu, MutableLiveData<Object>> map;
        FragmentManager fragmentManager;
        if (!z) {
            this.LJLLLL = i;
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Context context = this.LJLJJL;
        if (C19N.LJ("tiktok_ec_rank_enable", false)) {
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null && (topActivity instanceof ActivityC45651qj)) {
                fragmentManager = ((ActivityC45651qj) topActivity).getSupportFragmentManager();
            } else if (context instanceof ActivityC45651qj) {
                fragmentManager = ((ActivityC45651qj) context).getSupportFragmentManager();
            } else if (context instanceof Fragment) {
                fragmentManager = ((Fragment) context).getFragmentManager();
            } else {
                fragmentManager = null;
            }
            if (z2 && fragmentManager != null) {
                C5H3 c5h3 = C71242Rxe.LIZ;
                Object value = c5h3.getValue();
                kotlin.jvm.internal.o.LJIIIIZZ(value, "<get-SP>(...)");
                if (!((Keva) value).getBoolean("ec_rank_influencer_tip_show", false)) {
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aqm, null, false);
                    C16880lQ.LJJIZ((SY4) LLLLIILL.findViewById(R.id.h_v), new ACListenerS22S0100000_2(LLLLIILL, 156));
                    C16880lQ.LJJJJI((TuxTextView) LLLLIILL.findViewById(R.id.jr9), new ACListenerS37S0200000_2(context, LLLLIILL, 17));
                    ASL asl = new ASL();
                    asl.LJI(2);
                    TuxSheet tuxSheet = asl.LIZ;
                    tuxSheet.LJLLI = LLLLIILL;
                    tuxSheet.LJLLJ = true;
                    tuxSheet.LJLLL = null;
                    tuxSheet.show(fragmentManager, "EC_RANK_INFLUENCER_TIP_SHOW");
                    Object value2 = c5h3.getValue();
                    kotlin.jvm.internal.o.LJIIIIZZ(value2, "<get-SP>(...)");
                    ((Keva) value2).storeBoolean("ec_rank_influencer_tip_show", true);
                }
            }
        }
        if (this.LJLJLLL != z2) {
            this.LJLJLLL = z2;
            IIconSlot.SlotViewModel slotViewModel = this.LJLJJLL;
            if (slotViewModel != null && (map = slotViewModel.LJLLLLLL) != null) {
                LiveData liveData = (LiveData) ((ConcurrentHashMap) map).get(EnumC29188Bcu.LIVE_ROOM_EC_LIVE_STATUS);
                if (liveData != null) {
                    liveData.postValue(Boolean.valueOf(this.LJLJLLL));
                }
            }
        }
    }

    public final void LJIJ(LivePermissionInfo livePermissionInfo, boolean z) {
        String str;
        String format;
        if (!z) {
            if (livePermissionInfo == null) {
                return;
            }
        } else if (!this.LJLLJ) {
            C26231ARf c26231ARf = this.LJLLILLLL;
            if (c26231ARf != null) {
                c26231ARf.LIZLLL();
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(this.LJLJJL);
        String str2 = null;
        TuxIconView tuxIconView = new TuxIconView(this.LJLJJL, null, 0, 6, null);
        tuxIconView.setIconRes(R.drawable.ape);
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(100)));
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(72)));
        C018905p c018905p = new C018905p(-2, -2);
        c018905p.topToTop = 0;
        c018905p.startToStart = 0;
        c018905p.endToEnd = 0;
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C7MY.LIZIZ(24);
        tuxIconView.setLayoutParams(c018905p);
        constraintLayout.addView(tuxIconView);
        C26227ARb c26227ARb = new C26227ARb(this.LJLJJL);
        C78685UuP.LJIJI(c26227ARb, constraintLayout, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        c26227ARb.LJFF(C86V.LJFF(R.string.f5k));
        if (livePermissionInfo != null && (str = livePermissionInfo.reason) != null) {
            if (kotlin.jvm.internal.o.LJ(str, "ecom_creator_permission_ban_live_temporary")) {
                if (livePermissionInfo.endTime > 0) {
                    try {
                        format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(livePermissionInfo.endTime));
                        if (format == null) {
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable unused) {
                    }
                    str2 = this.LJLJJL.getString(R.string.f9c, format);
                }
                format = "";
                str2 = this.LJLJJL.getString(R.string.f9c, format);
            } else if (kotlin.jvm.internal.o.LJ(str, "ecom_creator_permission_ban_live_permanent")) {
                str2 = C86V.LJFF(R.string.f9b);
            }
        }
        c26227ARb.LIZIZ(str2);
        TuxTextView tuxTextView = new TuxTextView(this.LJLJJL, null, 6, 0);
        tuxTextView.setText(C86V.LJFF(R.string.txj));
        tuxTextView.setTuxFont(42);
        Context context = tuxTextView.getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
        tuxTextView.setGravity(17);
        C77119UOl.LJFF(c26227ARb, tuxTextView);
        C77123UOp.LJIILL(c26227ARb, new AqS175S0100000_9(this, 568));
        c26227ARb.LJII = false;
        c26227ARb.LIZLLL(new AqS178S0100000_12(this, 682));
        c26227ARb.LIZJ(new AqS178S0100000_12(this, 683));
        C26231ARf LJI = c26227ARb.LJI();
        this.LJLLILLLL = LJI;
        LJI.LIZLLL();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        boolean z;
        CommerceStruct commerceStruct;
        IIconSlot.SlotViewModel slotViewModel;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        kotlin.jvm.internal.o.LJIIIZ(viewModel2, "viewModel");
        kotlin.jvm.internal.o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("ec_anchor_or_moderator_permission_check_enable", true);
        } catch (Throwable unused) {
            z = C71249Rxl.LIZ;
        }
        if (z) {
            XKX.LIZLLL(this.LJLLLLLL, null, null, new C71164RwO(this, null), 3);
        }
        C78897Uxp.LJJJLIIL(viewModel2, true);
        viewModel2.LJLJL.setValue(C0OW.LIZ(this.LJLJJL.getResources(), R.drawable.aph, null));
        viewModel2.LJLJLJ.setValue(C0OW.LIZ(this.LJLJJL.getResources(), R.drawable.apj, null));
        viewModel2.LJLLI.setValue(this.LJLJJL.getString(R.string.n6a));
        viewModel2.LJLJLLL.setValue(C04270Et.LIZIZ(this.LJLJJL, R.drawable.apa));
        viewModel2.LJLLILLLL.setValue(this.LJLJJL.getString(R.string.to));
        viewModel2.LLFII = C78605Ut7.LJLILLLLZI;
        this.LJLJJLL = viewModel2;
        this.LJLJL = slotGate;
        Room room = this.LJZ;
        if (room != null && (commerceStruct = room.getCommerceStruct()) != null) {
            int i = (int) commerceStruct.productNum;
            if (i > 0 && (slotViewModel = this.LJLJJLL) != null) {
                slotViewModel.LLFFF = Integer.valueOf(i);
            }
            LJIILJJIL(i, false);
        }
        C72818Shy.LJFF("set_live_continue", this, "ECDuringLiveBroadcasterWidget");
        C72818Shy.LJFF("talent_live_product_has_pin", this, "ECDuringLiveBroadcasterWidget");
        C72818Shy.LJFF("open_admin_list_dialog", this, "ECDuringLiveBroadcasterWidget");
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, ? extends Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        boolean z;
        String str;
        boolean z2;
        CommerceStruct commerceStruct;
        CommerceStruct commerceStruct2;
        kotlin.jvm.internal.o.LJIIIZ(params, "params");
        Object obj = params.get("param_room");
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LJZ = room;
        boolean z3 = true;
        if (room != null && (commerceStruct2 = room.getCommerceStruct()) != null && commerceStruct2.commercePermission == 1) {
            z = true;
        } else {
            z = false;
        }
        Object obj2 = params.get("param_is_hidden_ec_widget");
        if (!(obj2 instanceof Boolean)) {
            obj2 = null;
        }
        Room room2 = this.LJZ;
        if (room2 != null && (commerceStruct = room2.getCommerceStruct()) != null) {
            str = commerceStruct.oecInitDataString;
        } else {
            str = null;
        }
        try {
            boolean z4 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(OecInitData.class))) instanceof OecInitData;
        } catch (s unused) {
        }
        C48502J1u c48502J1u = this.LJLJLJ;
        String LJIILIIL = LJIILIIL();
        c48502J1u.LJII("anchor_id", LJIIL(), false);
        c48502J1u.LJII("EVENT_ORIGIN_FEATURE", "TEMAI", false);
        c48502J1u.LJII("room_id", LJIILIIL, false);
        c48502J1u.LJII("live_status", "during_live", false);
        if (z && !kotlin.jvm.internal.o.LJ(obj2, Boolean.TRUE)) {
            z2 = true;
        } else {
            z2 = false;
        }
        interfaceC25704A6y.LIZ(z2);
        if (z) {
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C75232xL(null), 3);
        }
        C71234RxW.LIZ.getClass();
        if (((AnchorPinCardConfig) C71234RxW.LIZJ.getValue()).show != 0) {
            z3 = false;
        }
        this.LJLL = z3;
    }
}
