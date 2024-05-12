package com.bytedance.android.live.publicscreen.impl;

import X.AbstractC31462CWk;
import X.AbstractC31467CWp;
import X.ActivityC45651qj;
import X.B83;
import X.BXU;
import X.C15610jN;
import X.C16880lQ;
import X.C1EW;
import X.C1FC;
import X.C1UF;
import X.C20780ri;
import X.C20910rv;
import X.C28C;
import X.C28D;
import X.C28E;
import X.C28F;
import X.C28G;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C29846BnW;
import X.C29927Bop;
import X.C31080CHs;
import X.C31272CPc;
import X.C31281CPl;
import X.C31285CPp;
import X.C31306CQk;
import X.C31319CQx;
import X.C31344CRw;
import X.C31351CSd;
import X.C31353CSf;
import X.C31354CSg;
import X.C31809Ce5;
import X.C37671dr;
import X.C37681ds;
import X.C37861eA;
import X.C47261Igj;
import X.C65777Prh;
import X.C65814PsI;
import X.C72242sW;
import X.C73411SrX;
import X.C78857UxB;
import X.CBL;
import X.CMU;
import X.CN1;
import X.CPR;
import X.CQL;
import X.CQO;
import X.CQQ;
import X.CR6;
import X.CRA;
import X.CRD;
import X.CRX;
import X.CS3;
import X.CS4;
import X.CS5;
import X.CS6;
import X.CS7;
import X.CS9;
import X.CSA;
import X.CSG;
import X.CSH;
import X.CSK;
import X.CSN;
import X.CTQ;
import X.CU7;
import X.CU8;
import X.CUB;
import X.CUX;
import X.CW4;
import X.CWA;
import X.CZB;
import X.EnumC20860rq;
import X.EnumC20870rr;
import X.EnumC31509CYf;
import X.InterfaceC29848BnY;
import X.InterfaceC30921CBp;
import X.InterfaceC31286CPq;
import X.InterfaceC31355CSh;
import X.InterfaceC31374CTa;
import X.InterfaceC31378CTe;
import X.InterfaceC92693kP;
import X.OSZ;
import X.V3N;
import Y.ARunnableS13S0100100_5;
import Y.ARunnableS16S0300000_5;
import Y.ARunnableS4S0200100_5;
import Y.AfS1S0200100_5;
import Y.AfS4S0100100_5;
import android.content.Context;
import android.os.HandlerThread;
import android.util.LongSparseArray;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget;
import com.bytedance.android.live.commentcombo.view.ExtendedCommentComboTrayWidget;
import com.bytedance.android.live.commentcombo.view.LandscapeCommentComboTrayWidget;
import com.bytedance.android.live.liveinteract.api.InteractPlayerViewChangeChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomWindowCountChannel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.pin.api.PinApi;
import com.bytedance.android.live.pin.widget.ExtendScreenCommentPinnedWidget;
import com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextDeleteTopWidget;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;
import com.bytedance.android.live.publicscreen.impl.displayfilter.ExtendedScreenMultiFilterWidget;
import com.bytedance.android.live.publicscreen.impl.displayfilter.ExtendedScreenRadioFilterWidget;
import com.bytedance.android.live.publicscreen.impl.giftHistory.GiftHistoryWidgetHelper;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedPublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget;
import com.bytedance.android.live.room.CommentComboTrayEvent;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.CommentStatusChannel;
import com.bytedance.android.livesdk.dataChannel.DrawGuessStatusVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveDeleteUselessPreloadSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameSlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class PublicScreenService implements IPublicScreenService, CBL, InterfaceC31378CTe {
    public final CopyOnWriteArrayList<CRX> LJLIL;
    public final List<CRX> LJLILLLLZI;
    public final LongSparseArray<List<C31319CQx<? extends CRA>>> LJLJI;
    public C78857UxB LJLJJI;
    public final LongSparseArray<Long> LJLJJL;
    public final LongSparseArray<Long> LJLJJLL;
    public final LongSparseArray<BottomMessage> LJLJL;
    public final LongSparseArray<HistoryInfo> LJLJLJ;
    public BXU LJLJLLL;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<InterfaceC29848BnY>> LJLL;
    public final Map<Class<? extends CR6>, InterfaceC30921CBp<? extends CR6>> LJLLI;
    public final Map<Class<? extends CRD>, InterfaceC31374CTa<? extends CRD, ? extends CSH<? extends CRD>>> LJLLILLLL;
    public ARunnableS4S0200100_5 LJLLJ;

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends IPublicScreenContextWidget> BD() {
        return ExtendScreenCommentPinnedWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> Dr() {
        return LandscapeCommentComboTrayWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> Gh() {
        return CommentComboTrayWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> KQ() {
        return ExtendedScreenRadioFilterWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> Lo() {
        return ExtendedScreenMultiFilterWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> Rn() {
        return CaptionTextDeleteTopWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> SE() {
        return ExtendedCommentComboTrayWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> Ub0() {
        return CaptionTextWidgetV2.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final boolean bu0(boolean z) {
        return z;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends LiveRecyclableWidget> ow() {
        return MainScreenCommentPinnedWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends IPublicScreenHolderWidget> sn() {
        return ExtendedPublicScreenWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void O60() {
        CS5.LIZ.getClass();
        CS6 LIZIZ = CS5.LIZIZ(0L);
        if (LIZIZ != null) {
            CS5.LJIIIZ(LIZIZ);
            CS5.LJFF(LIZIZ, CSN.CANCEL);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void UM() {
        HandlerThread handlerThread = C31344CRw.LIZIZ;
        if (handlerThread != null && handlerThread.isAlive()) {
            try {
                HandlerThread handlerThread2 = C31344CRw.LIZIZ;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                HandlerThread handlerThread3 = C31344CRw.LIZIZ;
                if (handlerThread3 != null) {
                    handlerThread3.interrupt();
                }
            } catch (Exception unused) {
            }
        }
        C31344CRw.LIZ = null;
        C31344CRw.LIZIZ = null;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final List<CRX> jh0() {
        List<CRX> unmodifiableOnRegistryReadyListeners = this.LJLILLLLZI;
        o.LJIIIIZZ(unmodifiableOnRegistryReadyListeners, "unmodifiableOnRegistryReadyListeners");
        return unmodifiableOnRegistryReadyListeners;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C78857UxB m90() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new C78857UxB();
        }
        C78857UxB c78857UxB = this.LJLJJI;
        o.LJI(c78857UxB);
        return c78857UxB;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void onPlayFragmentCreate() {
        C20910rv c20910rv = C20910rv.LIZ;
        EnumC20860rq enumC20860rq = EnumC20860rq.FOUNDATION;
        EnumC20870rr enumC20870rr = EnumC20870rr.FIRST_FRAME;
        c20910rv.LJIILJJIL(R.layout.dhl, 3, "ttlive_public_screen_item_common", enumC20860rq, enumC20870rr, true);
        if (LiveDeleteUselessPreloadSetting.preloadAble()) {
            c20910rv.LJIILJJIL(R.layout.dhi, 4, "ttlive_public_screen_item_chat", enumC20860rq, enumC20870rr, true);
        } else {
            c20910rv.LJIILJJIL(R.layout.dhj, 4, "ttlive_public_screen_item_chat_singleline", enumC20860rq, enumC20870rr, true);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void rE() {
        CMU.LIZ.clear();
    }

    public PublicScreenService() {
        CopyOnWriteArrayList<CRX> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LJLIL = copyOnWriteArrayList;
        this.LJLILLLLZI = Collections.unmodifiableList(copyOnWriteArrayList);
        this.LJLJI = new LongSparseArray<>();
        this.LJLJJL = new LongSparseArray<>();
        this.LJLJJLL = new LongSparseArray<>();
        this.LJLJL = new LongSparseArray<>();
        this.LJLJLJ = new LongSparseArray<>();
        this.LJLL = new ConcurrentHashMap<>();
        this.LJLLI = new ConcurrentHashMap();
        this.LJLLILLLL = new ConcurrentHashMap();
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final BXU A4() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void CO(Context context) {
        int i = 0;
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            int i2 = 0;
            do {
                C20780ri.LIZLLL(R.layout.dhl, context);
                C20780ri.LIZLLL(R.layout.bll, context);
                i2++;
            } while (i2 < 2);
            do {
                C20780ri.LIZLLL(R.layout.dhj, context);
                i++;
            } while (i < 5);
            return;
        }
        C20910rv.LJIILL(R.layout.dhl, 2, "ttlive_public_screen_item_common", EnumC20860rq.FOUNDATION, null, true, 32);
        CZB.LIZ.getClass();
        CZB.LIZLLL(R.layout.bll, 2, 0);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Dq0(long j) {
        this.LJLJJLL.put(j, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final BottomMessage Ia0(long j) {
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                if (!c31319CQx.LJIILIIL()) {
                    return c31319CQx.LJLJJLL;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Ks(DataChannel dataChannel) {
        FragmentManager fragmentManager;
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            ((IUserCardService) CN1.LIZ(IUserCardService.class)).Uz(LJ.getId(), LJ).show(fragmentManager, C16880lQ.LJLLJ(fragmentManager.getClass()));
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final CSH<? extends CRD> MB(CR6 cr6) {
        CRD b5;
        InterfaceC31374CTa interfaceC31374CTa;
        if (cr6 == null || (b5 = b5(cr6)) == null) {
            return null;
        }
        Object obj = ((ConcurrentHashMap) this.LJLLILLLL).get(b5.getClass());
        if (!(obj instanceof InterfaceC31374CTa) || (interfaceC31374CTa = (InterfaceC31374CTa) obj) == null) {
            return null;
        }
        return interfaceC31374CTa.LIZ(b5);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void NN(long j) {
        this.LJLJJL.remove(j);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void QF(String count) {
        o.LJIIIZ(count, "count");
        CWA.LLILZIL.onNext(count);
        CW4.LLI.onNext(count);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void XO(CR6 message) {
        CommonMessageData commonMessageData;
        CommonMessageData commonMessageData2;
        o.LJIIIZ(message, "message");
        CS5.LIZ.getClass();
        CS6 cs6 = new CS6(0L);
        cs6.LIZJ = true;
        cs6.LIZIZ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        cs6.LJFF = message;
        CS5.LJFF.put(0L, cs6);
        CS5.LJIIL(cs6);
        CR6 cr6 = cs6.LJFF;
        if (cr6 != null && (commonMessageData2 = cr6.baseMessage) != null) {
            commonMessageData2.messageId = message.getMessageId();
        }
        PinMessage pinMessage = new PinMessage();
        pinMessage.action = 1;
        cs6.LJI = pinMessage;
        cs6.LIZJ = false;
        cs6.LIZLLL = false;
        CS6 LIZIZ = CS5.LIZIZ(0L);
        if (LIZIZ != null) {
            CS5.LJFF(LIZIZ, CSN.REPLACE);
        }
        CS5.LIZLLL.put(0L, cs6);
        cs6.LIZIZ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        cs6.LJ = true;
        CR6 cr62 = cs6.LJFF;
        if (cr62 != null && (commonMessageData = cr62.baseMessage) != null) {
            commonMessageData.messageId = 0L;
        }
        cs6.LJII = 60000L;
        CS5.LJI(cs6);
        CS5.LIZ(0L, 60000L, cs6);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Yj0(CRX crx) {
        this.LJLIL.add(crx);
        crx.LIZ(this);
        crx.LJ(this);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final CRD b5(CR6 cr6) {
        InterfaceC30921CBp interfaceC30921CBp;
        if (cr6 == null) {
            return null;
        }
        CQO<? extends CR6> LJ = CPR.LJ(cr6);
        if (LJ != null) {
            return LJ;
        }
        Object obj = ((ConcurrentHashMap) this.LJLLI).get(cr6.getClass());
        if (!(obj instanceof InterfaceC30921CBp) || (interfaceC30921CBp = (InterfaceC30921CBp) obj) == null) {
            return null;
        }
        return interfaceC30921CBp.b5(cr6);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void c00(Room room) {
        if (room != null) {
            ARunnableS4S0200100_5 aRunnableS4S0200100_5 = this.LJLLJ;
            if (aRunnableS4S0200100_5 != null) {
                C15610jN.LIZLLL(aRunnableS4S0200100_5);
            }
            this.LJLJLJ.remove(room.getId());
        }
        C37861eA.LJLJJL = null;
        C37861eA.LJLJJLL = false;
        C37861eA.LJLJL = -1L;
        C37861eA.LJLJLJ = -1L;
        C37861eA.LJLJLLL = -1L;
        C73411SrX c73411SrX = C37861eA.LJLLILLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void c20(int i) {
        CWA.LLILZ.onNext(Integer.valueOf(i));
        CW4.LLFZ.onNext(Integer.valueOf(i));
        CUB.LJLIL.onNext(Integer.valueOf(i));
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C31281CPl cw(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        return new C31281CPl(dataChannel);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void df(long j) {
        this.LJLJJLL.remove(j);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final long e10(long j) {
        Long l = this.LJLJJL.get(j);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final List<InterfaceC29848BnY> hr0(int i) {
        CopyOnWriteArrayList<InterfaceC29848BnY> copyOnWriteArrayList = this.LJLL.get(Integer.valueOf(i));
        if (copyOnWriteArrayList != null) {
            return Collections.unmodifiableList(copyOnWriteArrayList);
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void nv(CRD model) {
        o.LJIIIZ(model, "model");
        F00(0L, model);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Class<? extends IPublicScreenHolderWidget> pq(boolean z) {
        if (z) {
            return PortraitPublicScreenWidget.class;
        }
        return LandscapePublicScreenWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final Long qo(long j) {
        return this.LJLJJLL.get(j);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final C31285CPp xG(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        return new C31285CPp(dataChannel);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final boolean xg(Room room) {
        boolean z = false;
        if (room == null) {
            return false;
        }
        CS5.LIZ.getClass();
        if (CS5.LIZJ(room)) {
            return true;
        }
        Iterator it = ((ArrayList) CS7.LIZJ).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((InterfaceC31355CSh) it.next()).LIZ(room)) {
                z = true;
                break;
            }
        }
        return z;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Dv(int i, InterfaceC29848BnY interfaceC29848BnY) {
        CopyOnWriteArrayList<InterfaceC29848BnY> copyOnWriteArrayList = this.LJLL.get(Integer.valueOf(i));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.LJLL.put(Integer.valueOf(i), copyOnWriteArrayList);
        }
        if (interfaceC29848BnY != null && (!copyOnWriteArrayList.contains(interfaceC29848BnY))) {
            copyOnWriteArrayList.add(interfaceC29848BnY);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void F00(long j, CRD model) {
        o.LJIIIZ(model, "model");
        C72242sW c72242sW = new C72242sW();
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            int i = 0;
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    c31319CQx.LJJLIIIJLJLI(new CS4(c72242sW, i, this), model, false);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void FY(CQQ publicScreenContext, CapsuleMessage capsuleMessage) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        o.LJIIIZ(capsuleMessage, "capsuleMessage");
        String str = capsuleMessage.schema;
        if (str == null || str.length() == 0) {
            return;
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(publicScreenContext.LIZ, capsuleMessage.schema);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void GL(long j, C29846BnW c29846BnW) {
        C72242sW c72242sW = new C72242sW();
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                if (!c31319CQx.LJIILIIL()) {
                    arrayList.add(c31319CQx);
                }
            }
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    ((C31319CQx) next).LJJLIIIJLJLI(new C31351CSd(c72242sW, i, this), c29846BnW, false);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void IX(long j, CQL model) {
        o.LJIIIZ(model, "model");
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            Iterator<C31319CQx<? extends CRA>> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJLLJ(model);
            }
        }
    }

    @Override // X.InterfaceC31378CTe
    public final void LIZ(Class cls, CTQ ctq) {
        ((ConcurrentHashMap) this.LJLLILLLL).put(cls, ctq);
    }

    @Override // X.CBL
    public final <MESSAGE extends CR6> void LIZLLL(Class<MESSAGE> cls, InterfaceC30921CBp<MESSAGE> interfaceC30921CBp) {
        ((ConcurrentHashMap) this.LJLLI).put(cls, interfaceC30921CBp);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void LLFFF(Room room, DataChannel dataChannel) {
        long j;
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        long j2 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        CS7.LIZLLL.remove(j);
        CS5 cs5 = CS5.LIZ;
        if (room != null) {
            j2 = room.getId();
        }
        cs5.getClass();
        LongSparseArray<DataChannel> longSparseArray = CS5.LIZIZ;
        DataChannel dataChannel2 = longSparseArray.get(j2);
        if (dataChannel2 != null && (iMessageManager2 = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager2.removeMessageListener(CS5.LJIIIIZZ.get(j2));
        }
        CS5.LJIILJJIL(j2, 0, CSN.NULL);
        CS5.LJIIIIZZ.remove(j2);
        longSparseArray.remove(j2);
        CS5.LIZJ.remove(j2);
        CS5.LJI.remove(j2);
        this.LJLJLLL = null;
        C37861eA c37861eA = C37861eA.LJLIL;
        C37861eA.LJLJJI = 0;
        C37861eA.LJLL = null;
        DataChannel dataChannel3 = C37861eA.LJLLI;
        if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(c37861eA);
        }
        C37861eA.LJLLI = null;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Lk0(long j, String punishId) {
        o.LJIIIZ(punishId, "punishId");
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                c31319CQx.getClass();
                if ("".equals(punishId) || (c31319CQx.LJLJJLL != null && c31319CQx.LJLJJLL.punishInfo != null && Objects.equals(c31319CQx.LJLJJLL.punishInfo.punishId, punishId))) {
                    c31319CQx.LJLJJLL = null;
                    ((CRA) c31319CQx.mView).ff0();
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void OF(long j, C29846BnW c29846BnW) {
        F00(j, c29846BnW);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Qm(long j, HistoryInfo historyInfo) {
        ARunnableS4S0200100_5 aRunnableS4S0200100_5 = new ARunnableS4S0200100_5(this, j, historyInfo, 0);
        this.LJLLJ = aRunnableS4S0200100_5;
        C15610jN.LIZIZ(aRunnableS4S0200100_5);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void ZD(long j, CUX cux) {
        List<CSK> list = CS7.LIZIZ.get(j);
        if (list != null) {
            Iterator<CSK> it = list.iterator();
            while (it.hasNext()) {
                it.next().ci0(cux);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void bt(long j, long j2) {
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                if (j2 == 0) {
                    c31319CQx.getClass();
                } else {
                    int LJJLIIIJ = c31319CQx.LJJLIIIJ(j2);
                    if (LJJLIIIJ != -1) {
                        c31319CQx.LJLIIL(LJJLIIIJ);
                    } else {
                        c31319CQx.LLJJJ.LIZIZ(new ARunnableS13S0100100_5(j2, c31319CQx, 7));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final CSA kh(Context context, ChatMessage chatMessage) {
        o.LJIIIZ(context, "context");
        CSA csa = new CSA(context, null, 0);
        C31272CPc c31272CPc = new C31272CPc(chatMessage);
        csa.LJLILLLLZI.setText(c31272CPc.LLFII());
        TextView textView = csa.LJLIL;
        CharSequence content = c31272CPc.getContent();
        if (content != null) {
            textView.setVisibility(0);
            textView.setText(content);
        } else {
            textView.setVisibility(8);
        }
        Collection<AbstractC31462CWk<? extends AbstractC31467CWp>> LLFFF = c31272CPc.LLFFF();
        if (LLFFF.isEmpty()) {
            csa.LJLJI.setVisibility(8);
        } else {
            csa.LJLJI.setBadges(C65777Prh.LIZIZ(LLFFF));
            csa.LJLJI.setVisibility(0);
        }
        return csa;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void t80(CQQ publicScreenContext, CR6 message) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        o.LJIIIZ(message, "message");
        CS5.LIZ.getClass();
        long j = publicScreenContext.LJIIJJI;
        InterfaceC31355CSh LIZ = CS7.LIZ(new V3N(j));
        if (LIZ != null) {
            LIZ.LIZIZ(publicScreenContext);
            return;
        }
        CS6 cs6 = new CS6(j);
        cs6.LIZJ = true;
        cs6.LIZIZ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        cs6.LJFF = message;
        CS5.LJFF.put(j, cs6);
        CS5.LJIIL(cs6);
        C65814PsI.LIZ().getClass();
        PinApi pinApi = (PinApi) C65814PsI.LIZJ(PinApi.class);
        String wsMethod = message.getMessageType().getWsMethod();
        o.LJIIIIZZ(wsMethod, "message.messageType.wsMethod");
        String json = GsonProtectorUtils.toJson((Gson) CS5.LJIIJ.getValue(), message);
        o.LJIIIIZZ(json, "gson.toJson(message)");
        InterfaceC92693kP LJJJLIIL = C1EW.LIZ(pinApi.pin(j, wsMethod, json)).LJJJLIIL(new AfS1S0200100_5(j, cs6, publicScreenContext, 20), new AfS4S0100100_5(j, cs6, 21));
        LongSparseArray<List<InterfaceC92693kP>> longSparseArray = CS5.LJII;
        List<InterfaceC92693kP> list = longSparseArray.get(j);
        if (list == null) {
            list = new ArrayList<>();
            longSparseArray.put(j, list);
        }
        list.add(LJJJLIIL);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void x9(ActivityC45651qj activityC45651qj, User user) {
        ((IUserCardService) CN1.LIZ(IUserCardService.class)).x9(activityC45651qj, user);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Ji(long j, CR6 cr6, C31080CHs c31080CHs) {
        C72242sW c72242sW = new C72242sW();
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            int i = 0;
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    c31319CQx.LJJIIZI(cr6, true, new CS3(c72242sW, i, this, c31080CHs));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return;
        }
        if (c31080CHs != null) {
            c31080CHs.LIZ(c72242sW.element);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void LLZZLLIL(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (dataChannel == null || room == null) {
            return;
        }
        CS7.LIZLLL.put(room.getId(), dataChannel);
        CS5.LIZ.getClass();
        CS5.LIZIZ.put(room.getId(), dataChannel);
        if (!CS5.LIZJ(room)) {
            CS5.LIZJ.put(room.getId(), 1);
        } else {
            CS5.LIZJ.put(room.getId(), 0);
            dataChannel.ov0(lifecycleOwner, InteractPlayerViewChangeChannel.class, new AqS171S0100000_5(room, 878));
            dataChannel.ov0(lifecycleOwner, LinkInRoomWindowCountChannel.class, new AqS171S0100000_5(room, 879));
            dataChannel.ov0(lifecycleOwner, MultiLiveRTCLayoutChannel.class, new AqS171S0100000_5(room, 880));
            dataChannel.ov0(lifecycleOwner, QuestionCardVisibilityEvent.class, new AqS171S0100000_5(room, 881));
            dataChannel.ov0(lifecycleOwner, LinkCrossRoomStateChangeEvent.class, new AqS171S0100000_5(room, 882));
            dataChannel.ov0(lifecycleOwner, DrawGuessStatusVisibilityChannel.class, new AqS171S0100000_5(room, 883));
            dataChannel.ov0(lifecycleOwner, PublicScreenNormalPollStateVisibilityChannel.class, new AqS171S0100000_5(room, 884));
            dataChannel.ov0(lifecycleOwner, PublicScreenGiftPollStateVisibilityChannel.class, new AqS171S0100000_5(room, 885));
            dataChannel.ov0(lifecycleOwner, FrameL2SlotVisibilityChannel.class, new AqS171S0100000_5(room, 886));
            dataChannel.ov0(lifecycleOwner, RoomUserChannel.class, new AqS171S0100000_5(room, 873));
            dataChannel.ov0(lifecycleOwner, AdminPermissionUpdateChannel.class, new AqS171S0100000_5(room, 874));
            dataChannel.ov0(lifecycleOwner, FrameSlotVisibilityChannel.class, new AqS171S0100000_5(room, 875));
            dataChannel.ov0(lifecycleOwner, PartnershipPromoteGameCardShowChannel.class, new AqS171S0100000_5(room, 876));
            dataChannel.ov0(lifecycleOwner, CommentStatusChannel.class, new AqS171S0100000_5(room, 877));
        }
        CS9 cs9 = new CS9(room);
        CS5.LJIIIIZZ.put(room.getId(), cs9);
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.PIN_MESSAGE.getIntType(), cs9);
        }
        BXU bxu = new BXU();
        this.LJLJLLL = bxu;
        bxu.LIZ = dataChannel;
        C37861eA c37861eA = C37861eA.LJLIL;
        C37861eA.LJLLI = dataChannel;
        C37861eA.LJLL = room;
        IMessageManager iMessageManager2 = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.COMMENT_TRAY_MESSAGE.getIntType(), c37861eA);
        }
        DataChannel dataChannel2 = C37861eA.LJLLI;
        if (dataChannel2 != null) {
            dataChannel2.lv0(lifecycleOwner, CommentComboTrayEvent.class, C28C.LJLIL);
            dataChannel2.lv0(lifecycleOwner, CommentPinWidgetVisibility.class, C28D.LJLIL);
            dataChannel2.lv0(lifecycleOwner, DrawGuessStatusVisibilityChannel.class, C28E.LJLIL);
            dataChannel2.lv0(lifecycleOwner, PublicScreenNormalPollStateVisibilityChannel.class, C28F.LJLIL);
            dataChannel2.lv0(lifecycleOwner, PublicScreenGiftPollStateVisibilityChannel.class, C28G.LJLIL);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void Lb0(long j, CSH<? extends CRD> csh, boolean z) {
        CU8 cu8;
        if (csh == null) {
            return;
        }
        if (csh instanceof CSG) {
            PinMessage pinMessage = ((CSG) csh).LJIIIZ.LJI;
            if (pinMessage != null) {
                CS5.LIZ.getClass();
                CS5.LJIIZILJ(j, pinMessage);
                return;
            }
            return;
        }
        csh.LJFF = true;
        if (z) {
            cu8 = new CU8();
        } else {
            cu8 = null;
        }
        List<CSK> list = CS7.LIZIZ.get(j);
        if (list == null) {
            return;
        }
        Iterator<CSK> it = list.iterator();
        while (it.hasNext()) {
            it.next().lc0(csh, cu8);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final CSH<? extends CRD> UW(long j, C31353CSf c31353CSf, boolean z) {
        boolean z2;
        CU7 cu7;
        InterfaceC31355CSh LIZ;
        if (c31353CSf.LJLILLLLZI > 0) {
            CS5 cs5 = CS5.LIZ;
            CSN csn = CSN.INTERRUPT;
            CU8 cu8 = new CU8();
            cs5.getClass();
            OSZ LJIJ = CS5.LJIJ(j, csn, cu8);
            if (LJIJ.getFirst() != null || LJIJ.getSecond() != null) {
                z2 = true;
                DataChannel dataChannel = CS7.LIZLLL.get(j);
                if (dataChannel != null && (LIZ = CS7.LIZ(new C31354CSg(c31353CSf))) != null) {
                    LIZ.LJ(dataChannel, (CS6) LJIJ.getFirst(), (CS6) LJIJ.getSecond());
                }
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        CSH<? extends CRD> MB = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).MB(c31353CSf.LJLIL);
        if (MB != null) {
            if (z || z2) {
                cu7 = new CU7();
            } else {
                cu7 = null;
            }
            MB.LIZ().LJJIIZI().LIZ = false;
            MB.LIZ().LJJIIZI().LIZIZ = true;
            List<CSK> list = CS7.LIZIZ.get(j);
            if (list != null) {
                Iterator<CSK> it = list.iterator();
                while (it.hasNext()) {
                    it.next().ie(MB, cu7);
                }
            }
        }
        return MB;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void df0(long j, CQL model, C31306CQk c31306CQk) {
        o.LJIIIZ(model, "model");
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                c31319CQx.LLJJJ.LIZJ(new ARunnableS16S0300000_5(c31319CQx, model, c31306CQk, 9));
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void dh0(long j, CSH<? extends CRD> csh, Object obj) {
        List<CSK> list = CS7.LIZIZ.get(j);
        if (list != null) {
            Iterator<CSK> it = list.iterator();
            while (it.hasNext()) {
                it.next().lY(csh, obj);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void ue0(long j, long j2, CR6 cr6) {
        CRD LJJJJZ;
        int LJJLIIIJ;
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                c31319CQx.getClass();
                if (j2 != 0 && (LJJJJZ = c31319CQx.LJJJJZ(cr6)) != null && (LJJLIIIJ = c31319CQx.LJJLIIIJ(j2)) != -1) {
                    c31319CQx.LJLLL(LJJLIIIJ, LJJJJZ);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final CW4 KR(ActivityC45651qj context, InterfaceC31286CPq interfaceC31286CPq, C37681ds c37681ds, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        return new CW4(context, interfaceC31286CPq, c37681ds, dataChannel);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final ChatMessage ib(long j, String str, User user, Long l) {
        return CMU.LIZ(j, str, user, 0, null, false, true, l, "star_comment");
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final CWA uc(ActivityC45651qj context, InterfaceC31286CPq interfaceC31286CPq, C37671dr c37671dr, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        return new CWA(context, interfaceC31286CPq, c37671dr, dataChannel);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final ChatMessage pP(long j, String str, User user, int i, C1FC c1fc) {
        return CMU.LIZ(j, str, user, i, c1fc, true, false, null, null);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final GiftHistoryWidgetHelper e70(LifecycleOwner lifecycleOwner, DataChannel dataChannel, TextView textView, C31809Ce5 c31809Ce5, boolean z, C1UF c1uf) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        return new GiftHistoryWidgetHelper(lifecycleOwner, dataChannel, textView, c31809Ce5, z, c1uf);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenService
    public final void ny(long j, Text text, long j2, PunishEventInfo punishEventInfo, int i, int i2, String str) {
        BottomMessage bottomMessage = new BottomMessage();
        long j3 = -System.currentTimeMillis();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = j3;
        boolean z = true;
        commonMessageData.showMsg = true;
        commonMessageData.displayText = text;
        bottomMessage.baseMessage = commonMessageData;
        bottomMessage.content = "";
        bottomMessage.duration = j2;
        bottomMessage.showType = 1;
        bottomMessage.textType = 0;
        bottomMessage.bizType = i;
        bottomMessage.punishInfo = punishEventInfo;
        bottomMessage.style = i2;
        bottomMessage.detailUrl = str;
        List<C31319CQx<? extends CRA>> list = this.LJLJI.get(j);
        if (list != null) {
            for (C31319CQx<? extends CRA> c31319CQx : list) {
                if (!c31319CQx.LJIILIIL()) {
                    c31319CQx.LJJLIIIJJI(bottomMessage);
                    z = false;
                }
            }
            if (z) {
                this.LJLJL.put(j, bottomMessage);
                return;
            }
            return;
        }
        this.LJLJL.put(j, bottomMessage);
    }
}
