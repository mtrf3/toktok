package com.bytedance.android.livesdk.envelope.widget;

import X.AbstractC31219CNb;
import X.ActivityC45651qj;
import X.B83;
import X.BCW;
import X.BJM;
import X.BRN;
import X.BSA;
import X.BSD;
import X.BSE;
import X.BSG;
import X.BSH;
import X.BSI;
import X.BSJ;
import X.BSL;
import X.BSR;
import X.C05170If;
import X.C09650Zl;
import X.C0NB;
import X.C15490jB;
import X.C1EU;
import X.C221108m2;
import X.C28792BRs;
import X.C28793BRt;
import X.C28796BRw;
import X.C29374Bfu;
import X.C29701Eo;
import X.C30725C4b;
import X.C30892CAm;
import X.C31220CNc;
import X.C34K;
import X.C45804HyK;
import X.C47061t0;
import X.C47261Igj;
import X.C51029K0z;
import X.C5H3;
import X.C68322mC;
import X.C780334l;
import X.C87277YNd;
import X.CFX;
import X.CN1;
import X.EnumC221088m0;
import X.EnumC30204BtI;
import X.InterfaceC05190Ih;
import X.InterfaceC30642C0w;
import X.OSZ;
import X.UOS;
import X.X1D;
import X.XKX;
import Y.IDDListenerS145S0100000_5;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;
import com.bytedance.android.livesdk.dataChannel.InitEnvelopeListChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.gift.event.TreasureBoxStatusEvent;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.livesetting.portal.PortalFeatureSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.GetTreasureBoxListOpt;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeURLConfig;
import com.bytedance.android.livesdk.livesetting.redenvelope.TreasureBoxAnimationImageSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RedEnvelopeWidget extends LiveRecyclableWidget implements BSA {
    public C47061t0 LJLIL;
    public BRN LJLILLLLZI;
    public boolean LJLJI;
    public Exception LJLJJI;
    public boolean LJLJJL = true;
    public final List<BSI> LJLJJLL;
    public final ReentrantLock LJLJL;
    public final C5H3 LJLJLJ;
    public final List<Long> LJLJLLL;
    public boolean LJLL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.BSA
    public final void LJJLIIIJLLLLLLLZ() {
        BRN brn = this.LJLILLLLZI;
        if (brn != null) {
            brn.LJLJJL = 1;
            brn.LIZ();
        }
        this.dataChannel.qv0(TreasureBoxStatusEvent.class, 1);
    }

    @Override // X.BSA
    public final void LJJLJLI() {
        BRN brn = this.LJLILLLLZI;
        if (brn != null) {
            brn.LJLJJL = 0;
            brn.LIZ();
        }
        this.dataChannel.qv0(TreasureBoxStatusEvent.class, 0);
    }

    public final BSH LJZ() {
        return (BSH) this.LJLJLJ.getValue();
    }

    public final void LJZI() {
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null) {
            iBrowserService.qk0(this.context, Boolean.TRUE, "TREASURE_BOX_SHORT_TOUCH_IS_SHOWING");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleRevenueWidgetSetting.INSTANCE.getValue();
    }

    public RedEnvelopeWidget() {
        List<BSI> synchronizedList = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList, "synchronizedList(ArrayList())");
        this.LJLJJLL = synchronizedList;
        this.LJLJL = new ReentrantLock();
        this.LJLJLJ = C221108m2.LIZ(EnumC221088m0.NONE, BSD.LJLIL);
        this.LJLJLLL = C47261Igj.LJJIJIL(20L);
    }

    @Override // X.BSA
    public final Context LJFF() {
        return super.getContext();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        LJZ().onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        LJZ().onResume();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C30892CAm Yd0;
        LJZ().LIZ();
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null && (Yd0 = iBrowserService.Yd0()) != null) {
            Yd0.LIZ();
        }
        if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue()) {
            LJZ().LJ(null);
        }
        this.LJLJLLL.clear();
        this.LJLJJLL.clear();
    }

    @Override // X.BSA
    public final void LJL(C28793BRt sendEnvelope) {
        String str;
        String str2;
        o.LJIIIZ(sendEnvelope, "sendEnvelope");
        String sendUrl = RedEnvelopeURLConfig.INSTANCE.getSendUrl();
        Uri.Builder buildUpon = UriProtector.parse(sendUrl).buildUpon();
        buildUpon.appendQueryParameter("time_stamp", String.valueOf(C30725C4b.LIZ())).appendQueryParameter("guide_reason", sendEnvelope.LJLJI).appendQueryParameter("guide_from", sendEnvelope.LJLJJI);
        String uri = buildUpon.build().toString();
        o.LJIIIIZZ(uri, "builder.build().toString()");
        if (sendUrl != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("openRedEnvelopeCreate: url=");
            LIZ.append(sendUrl);
            C0NB.LIZIZ("RedEnvelopeWidget", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("openRedEnvelopeCreateDialog: lynxUrl=");
            LIZ2.append(uri);
            C0NB.LIZIZ("RedEnvelopeWidget", X1D.LIZIZ(LIZ2));
            Uri.Builder appendQueryParameter = UriProtector.parse(uri).buildUpon().appendQueryParameter("enter_from_merge", BJM.LJFF()).appendQueryParameter("enter_method", BJM.LJIIIIZZ());
            if (LJZ().isAnchor()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("is_anchor", str).appendQueryParameter("entrance", sendEnvelope.LJLILLLLZI);
            Room LIZJ = LJZ().LIZJ();
            if (LIZJ == null || (str2 = LIZJ.getIdStr()) == null) {
                str2 = "";
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str2);
            o.LJIIIIZZ(appendQueryParameter3, "parse(lynxUrl)\n         …r.getRoom()?.idStr ?: \"\")");
            Uri parse = UriProtector.parse(appendQueryParameter3.toString());
            String queryParameter = UriProtector.getQueryParameter(parse, "gravity");
            if (queryParameter == null || queryParameter.length() == 0) {
                parse = parse.buildUpon().appendQueryParameter("gravity", "bottom").build();
            }
            String uri2 = parse.toString();
            o.LJIIIIZZ(uri2, "uri.toString()");
            if (((IHostAction) CN1.LIZ(IHostAction.class)).hostInterceptSpark(uri2)) {
                IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                iHybridContainerService.Vs0(context, uri2, new AqS171S0100000_5(this, 764));
                return;
            }
            PopupContainerFragment Mo = ((IBrowserService) CN1.LIZ(IBrowserService.class)).Mo(new PopupConfig(parse));
            if ((Mo instanceof BaseDialogFragment) && Mo != null) {
                Mo.LJLILLLLZI = new IDDListenerS145S0100000_5(this, 11);
            }
            Context context2 = this.context;
            o.LJIIIIZZ(context2, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI == null) {
                return;
            }
            Mo.getClass();
            BaseDialogFragment.wl(LJJIFFI, Mo);
            return;
        }
        C0NB.LJ("RedEnvelopeWidget", "openRedEnvelopeCreate: send url is empty");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        DataChannel dataChannel;
        C47061t0 c47061t0 = new C47061t0(this.context);
        this.LJLIL = c47061t0;
        C15490jB.LJFF(c47061t0, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_normal_1"), "ttlive_treasure_box_anim_pic.png", ImageView.ScaleType.CENTER_CROP, new BSG(this));
        Boolean bool = (Boolean) this.dataChannel.kv0(BCW.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLL = z;
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.REDENVELOPE;
        DataChannel dataChannel2 = this.dataChannel;
        o.LJIIIIZZ(dataChannel2, "dataChannel");
        BRN brn = new BRN(dataChannel2);
        this.LJLILLLLZI = brn;
        enumC30204BtI.load(dataChannel2, brn);
        this.LJLJLLL.clear();
        BSH LJZ = LJZ();
        DataChannel dataChannel3 = this.dataChannel;
        o.LJIIIIZZ(dataChannel3, "dataChannel");
        LJZ.LJIIIIZZ(dataChannel3, this);
        this.LJLJJLL.clear();
        if (GetTreasureBoxListOpt.INSTANCE.getValue() && (dataChannel = this.dataChannel) != null) {
            dataChannel.lv0(this, InitEnvelopeListChannel.class, new AqS171S0100000_5(this, 763));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v55, types: [T, com.bytedance.android.live.base.model.ImageModel] */
    /* JADX WARN: Type inference failed for: r0v68, types: [T, com.bytedance.android.live.base.model.ImageModel] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, X.1Eo, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.lang.Object, java.lang.String] */
    @Override // X.BSA
    public final void LJLJJLL(String data, String dataFrom) {
        boolean z;
        Integer num;
        String str;
        String str2;
        boolean z2;
        long j;
        ImageModel imageModel;
        String str3;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        RedEnvelopInfo4FE redEnvelopInfo4FE2;
        Room room;
        String str4;
        List<RedEnvelopeMessage4FE> list;
        RedEnvelopeMessage4FE redEnvelopeMessage4FE;
        RedEnvelopInfo4FE redEnvelopInfo4FE3;
        AbstractC31219CNb abstractC31219CNb;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(dataFrom, "dataFrom");
        User user = null;
        View view = null;
        r9 = null;
        C28796BRw c28796BRw = null;
        r9 = null;
        String str5 = null;
        if (LJZ().LJII()) {
            C0NB.LIZIZ("RedEnvelopeWidget", "notify envelope data change");
            Map<String, ? extends Object> LJJIIZI = C51029K0z.LJJIIZI(new OSZ("update_data", GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, data, (Type) Map.class)));
            IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
            UOS uos = UOS.ID;
            String LJFF = LJZ().LJFF();
            o.LJI(LJFF);
            InterfaceC30642C0w vr = iShortTouchService.vr(uos, LJFF);
            if (vr != null) {
                view = vr.LIZJ();
            }
            if ((view instanceof AbstractC31219CNb) && (abstractC31219CNb = (AbstractC31219CNb) view) != null) {
                abstractC31219CNb.LIZJ(LJJIIZI);
            }
            LJZI();
            LJZ().LJI();
            LJZ().LIZLLL();
            return;
        }
        C0NB.LIZIZ("RedEnvelopeWidget", "notify envelope data created");
        Boolean bool = (Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE = (RedEnvelopeInfoModel4FE) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, data, new BSL().getType());
        Map<String, String> map = null;
        for (Map<String, String> map2 : TreasureBoxAnimationImageSetting.INSTANCE.getValue()) {
            String str6 = map2.get("business_type");
            if (str6 != null && CastIntegerProtector.parseInt(str6) == 1) {
                map = map2;
            }
        }
        if (redEnvelopeInfoModel4FE != null && (list = redEnvelopeInfoModel4FE.envelopList) != null && (redEnvelopeMessage4FE = (RedEnvelopeMessage4FE) ListProtector.get(list, 0)) != null && (redEnvelopInfo4FE3 = redEnvelopeMessage4FE.envelopInfo) != null) {
            num = redEnvelopInfo4FE3.businessType;
        } else {
            num = null;
        }
        if (map != null) {
            str = map.get("short_touch");
        } else {
            str = null;
        }
        Uri.Builder LIZIZ = C1EU.LIZIZ(str, "initial_data", data);
        String str7 = "1";
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder appendQueryParameter = LIZIZ.appendQueryParameter("is_anchor", str2);
        if (!o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri uri = appendQueryParameter.appendQueryParameter("is_portal_user", str7).appendQueryParameter("portal_id", String.valueOf(BJM.LJIIL())).build();
        if (num == null || (num.intValue() != 1 && num.intValue() != 2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new BSE(this, dataFrom, redEnvelopeInfoModel4FE, z, null), 3);
            o.LJIIIIZZ(uri, "uri");
            List<RedEnvelopeMessage4FE> list2 = redEnvelopeInfoModel4FE.envelopList;
            C31220CNc FX = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).FX(this.context, uri, "shortTouchTreasureBox", true);
            if (FX != null) {
                LJZ().LJ(FX.LIZ());
                IShortTouchService iShortTouchService2 = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
                if (this.LJLL && this.LJLIL != null) {
                    c28796BRw = new C28796BRw(this, list2, dataFrom);
                }
                iShortTouchService2.B10(FX, c28796BRw);
            }
            LJZI();
            LJZ().LJI();
            LJZ().LIZLLL();
            return;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() != 4 && num.intValue() != 9) {
            return;
        }
        if (!PortalFeatureSetting.INSTANCE.getValue() && !z) {
            C28792BRs.LIZ(Boolean.valueOf(LJZ().isAnchor()), "audience settings is disable", redEnvelopeInfoModel4FE.envelopList);
            return;
        }
        RedEnvelopInfo4FE redEnvelopInfo4FE4 = ((RedEnvelopeMessage4FE) ListProtector.get(redEnvelopeInfoModel4FE.envelopList, 0)).envelopInfo;
        if (redEnvelopInfo4FE4 != null && (str4 = redEnvelopInfo4FE4.envelopeId) != null) {
            j = CastLongProtector.parseLong(str4);
        } else {
            j = 0;
        }
        if (this.LJLJLLL.contains(Long.valueOf(j)) || j == 0) {
            C28792BRs.LIZ(Boolean.valueOf(LJZ().isAnchor()), "envelope id has been used", redEnvelopeInfoModel4FE.envelopList);
            return;
        }
        this.LJLJLLL.add(Long.valueOf(j));
        C68322mC c68322mC = new C68322mC();
        if (this.LJLL) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                imageModel = room.getCover();
            } else {
                imageModel = null;
            }
            C68322mC c68322mC2 = new C68322mC();
            C68322mC c68322mC3 = new C68322mC();
            String str8 = "";
            c68322mC3.element = "";
            RedEnvelopeMessage4FE redEnvelopeMessage4FE2 = (RedEnvelopeMessage4FE) ListProtector.get(redEnvelopeInfoModel4FE.envelopList, 0);
            if (redEnvelopeMessage4FE2 != null && (redEnvelopInfo4FE2 = redEnvelopeMessage4FE2.envelopInfo) != null) {
                str3 = redEnvelopInfo4FE2.sendUserId;
            } else {
                str3 = null;
            }
            if (o.LJ(str3, String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())) || redEnvelopeMessage4FE2 == null || redEnvelopeMessage4FE2.envelopInfo == null) {
                c68322mC2.element = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
                InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
                if (interfaceC05190Ih instanceof User) {
                    user = (User) interfaceC05190Ih;
                }
                ?? LIZ = C05170If.LIZ(user);
                o.LJIIIIZZ(LIZ, "getDisplayName(UserServi…r().currentUser as? User)");
                c68322mC3.element = LIZ;
            } else {
                if (redEnvelopeMessage4FE2 != null && (redEnvelopInfo4FE = redEnvelopeMessage4FE2.envelopInfo) != null) {
                    str5 = redEnvelopInfo4FE.sendUserAvatar;
                }
                c68322mC2.element = ImageModel.genBy(str5);
                T t = str8;
                if (redEnvelopeMessage4FE2 != null) {
                    RedEnvelopInfo4FE redEnvelopInfo4FE5 = redEnvelopeMessage4FE2.envelopInfo;
                    t = str8;
                    if (redEnvelopInfo4FE5 != null) {
                        String str9 = redEnvelopInfo4FE5.sendUserName;
                        t = str8;
                        if (str9 != null) {
                            t = str9;
                        }
                    }
                }
                c68322mC3.element = t;
            }
            C68322mC c68322mC4 = new C68322mC();
            C68322mC c68322mC5 = new C68322mC();
            C34K c34k = new C34K();
            ?? c29701Eo = new C29701Eo(this.context);
            c29701Eo.setLayoutParams(new LinearLayout.LayoutParams(C87277YNd.LJIIJJI(110), C87277YNd.LJIIJJI(133)));
            c68322mC.element = c29701Eo;
            XKX.LIZLLL(C780334l.LJLIL, null, null, new BSR(imageModel, new CountDownLatch(3), c68322mC4, c68322mC2, c68322mC5, c68322mC, c34k, this, c68322mC3, dataFrom, redEnvelopeInfoModel4FE, z, uri, null), 3);
            return;
        }
        o.LJIIIIZZ(uri, "uri");
        LJLZ(uri, (C29701Eo) c68322mC.element);
        LJZI();
        LJZ().LJI();
        LJZ().LIZLLL();
    }

    public final void LJLZ(Uri uri, C29701Eo c29701Eo) {
        BSJ bsj;
        C31220CNc FX = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).FX(this.context, uri, "shortTouchTreasureBox", true);
        if (FX != null) {
            LJZ().LJ(FX.LIZ());
            IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
            if (c29701Eo == null) {
                bsj = null;
            } else {
                bsj = new BSJ(c29701Eo);
            }
            iShortTouchService.B10(FX, bsj);
        }
    }
}
