package X;

import X.CRA;
import Y.AObjectS81S0300000_5;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS16S0300000_5;
import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.ARunnableS4S0310000_5;
import Y.ARunnableS9S0101000_5;
import Y.AfS17S0001000_5;
import Y.AfS18S0001000_6;
import Y.AfS44S0300000_5;
import Y.AfS54S0200000_5;
import Y.IDComparatorS338S0100000_5;
import Y.IDComparatorS33S0000000_5;
import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.adminsetting.ChatApproveApi;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.PublicScreenService;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenApi;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.chatroom.model.LiveCommentTranslationConfig;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenConfig;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.CommentStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShortenChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAnchorPublicScreenConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateEnlargeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveFasterReleaseMsgsLowHeatSettingSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageAdvanceCount;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageItemsSampleRateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveModelCreateAnchorSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveModelCreateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDirectDispatchSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenHeightMaskAdaptivelySetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageBufferFree;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageDefaultPrioritySetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSyncSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenUpdateOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenViewMetricsSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSdkPublicScreenMessageScheduleStrategySetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.ReportHeightRatioSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.LimitedSizeHashMap;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.CQx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31319CQx<T extends CRA> extends CR9<T> implements OnIMMessageListener, InterfaceC29574Bj8, InterfaceC31392CTs, InterfaceC80920VpM {
    public static final LivePublicScreenConfig LLJLILLLLZIIL = LivePublicScreenConfigSetting.getValue();
    public static final LivePublicScreenConfig LLJLL = LiveAnchorPublicScreenConfigSetting.getValue();
    public static final long LLJLLIL = LiveBeingAtConfigSetting.getValue().messageConsumeInterval;
    public static final long LLJLLL = LiveBeingAtConfigSetting.getValue().messageLifeDuration;
    public InterfaceC65784Pro LJLJI;
    public volatile long LJLJJI;
    public volatile BottomMessage LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLJ;
    public int LJLLLL;
    public C73893SzJ LLIFFJFJJ;
    public boolean LLIIII;
    public LiveCommentTranslationConfig LLIIIILZ;
    public boolean LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public C29821Fa LLIIJI;
    public java.util.Map<Class<? extends CRD>, InterfaceC31332CRk<? extends CS1>> LLIIJLIL;
    public java.util.Map<Class<? extends CR6>, InterfaceC31318CQw<? extends CR6>> LLIIL;
    public C0HK LLIILII;
    public CQQ LLIILZL;
    public final Handler LLIIZ;
    public boolean LLIL;
    public int LLILII;
    public C31322CRa LLILIL;
    public InterfaceC31342CRu LLILL;
    public InterfaceC31342CRu LLILLIZIL;
    public final List<InterfaceC31337CRp> LLILLJJLI;
    public CRD LLILLL;
    public InterfaceC31337CRp LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Long LLJ;
    public Room LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final int LLJILJILJ;
    public C31360CSm LLJILLL;
    public C31360CSm LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public volatile boolean LLJJIJIL;
    public CRR LLJJJ;
    public final int LLJJJIL;
    public final CRV LLJJJJ;
    public final ARunnableS41S0100000_5 LLJJJJJIL;
    public final ARunnableS41S0100000_5 LLJJJJLIIL;
    public final ARunnableS41S0100000_5 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final ARunnableS41S0100000_5 LLJL;
    public boolean LLJLIL;
    public volatile CharSequence LJLJJL = "";
    public int LJLLI = 200;
    public int LJLLILLLL = LiveChatShowDelayForHotLiveSetting.INSTANCE.getValue();
    public boolean LJLLL = false;
    public final Queue<CRD> LJLLLLLL = new PriorityQueue(100, new IDComparatorS338S0100000_5(this, 1));
    public final Queue<CRD> LJLZ = new ArrayDeque(100);
    public final Queue<CRD> LJZ = new ArrayDeque(8);
    public CR1<CRD> LJZI = new CR1<>(this.LJLLI);
    public final CRF LJZL = new CRF();
    public final Queue<CRD> LL = new PriorityQueue(11, new IDComparatorS33S0000000_5(9));
    public final LimitedSizeHashMap<Long, Object> LLD = new LimitedSizeHashMap<>(512);
    public final List<InterfaceC31337CRp> LLF = new ArrayList();
    public final List<CRD> LLFF = new ArrayList();
    public final IDComparatorS338S0100000_5 LLFFF = new IDComparatorS338S0100000_5(this, 2);
    public boolean LLFII = false;
    public final List<InterfaceC31337CRp> LLFZ = new LinkedList();
    public boolean LLI = false;
    public final CRE LLII = new CRE();

    public static void LJJJJLL(BXT bxt) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/publicscreen/impl/dialog/LiveCommentReportDialog", "show", bxt, new Object[0], "void", new C65300Pk0(false, "()V", "4240669285854309478")).LIZ) {
            return;
        }
        bxt.show();
    }

    @Override // X.InterfaceC29574Bj8
    public boolean LJIILIIL() {
        return this instanceof CR2;
    }

    @Override // X.CQP
    public final void LJIJ() {
        for (int i = 0; i < this.LJZI.LJII(); i++) {
            CRD LJ = this.LJZI.LJ(i);
            if (LJ.LJJJIL()) {
                CU2 LJJLI = LJ.LJJLI();
                if (LJJLI != null && !LJJLI.LIZ && LJ.LJIIIZ()) {
                    LJJLI.LIZ = true;
                    this.LLJJJ.LIZJ(new ARunnableS16S0300000_5(this, LJ, new CU4(), 9));
                    return;
                }
                return;
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "public_screen";
    }

    @Override // X.InterfaceC80920VpM
    public final void LJ() {
        if (!this.LLJLIL) {
            CRF crf = this.LJZL;
            if (!crf.LIZ) {
                if (!crf.LIZIZ()) {
                    crf.LIZ = false;
                    InterfaceC31392CTs interfaceC31392CTs = crf.LJI;
                    if (interfaceC31392CTs != null) {
                        ((C31319CQx) interfaceC31392CTs).LJJLL(new CRU(C61878OQg.INSTANCE, crf.LIZIZ(), crf.LIZ()));
                    }
                }
                LifecycleOwner lifecycleOwner = crf.LJII;
                if (lifecycleOwner != null) {
                    C29306Beo.LJJIIJZLJL(lifecycleOwner, null, new CR4(crf, null), 3);
                }
            }
            this.LLJLIL = true;
        }
        ((CRA) this.mView).LJ();
    }

    @Override // X.CQP
    public final int LJIIJJI() {
        return ((ArrayDeque) this.LJZ).size();
    }

    @Override // X.CQP
    public final C73893SzJ LJIILL() {
        if (!this.LLI) {
            return null;
        }
        C73893SzJ c73893SzJ = this.LLIFFJFJJ;
        if (c73893SzJ != null) {
            c73893SzJ.onComplete();
        } else {
            this.LLIIZ.postDelayed(this.LLJL, 1000);
        }
        C73893SzJ c73893SzJ2 = new C73893SzJ();
        this.LLIFFJFJJ = c73893SzJ2;
        return c73893SzJ2;
    }

    @Override // X.CQP
    public final int LJJIZ() {
        return ((PriorityQueue) this.LJLLLLLL).size();
    }

    @Override // X.CR9
    public void LJJJJ() {
        C31383CTj c31383CTj = new C31383CTj();
        this.LJLIL.LIZ(c31383CTj);
        this.LJLIL.LIZ(new C31384CTk());
        if (LivePublicScreenViewMetricsSetting.getValue()) {
            CR5 cr5 = this.LJLIL;
            CTH cth = new CTH();
            cr5.getClass();
            ((ArrayList) cr5.LJ).add(cth);
            ((ArrayList) cr5.LJFF).add(cth);
        }
        if (ReportHeightRatioSetting.enable()) {
            CR5 cr52 = this.LJLIL;
            CTW l = c31383CTj.LJJJJZ;
            cr52.getClass();
            o.LJIIIZ(l, "l");
            ((ArrayList) cr52.LJ).add(l);
            ((ArrayList) cr52.LJFF).add(l);
        }
        double value = LiveMessageItemsSampleRateSetting.getValue();
        if (value > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            this.LJLIL.LIZ(new CR0(value));
        }
        if (C31324CRc.LIZ()) {
            this.LJLIL.LIZ(new CSS());
        }
    }

    public void LJJJJI() {
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ROOM.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.CHAT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.EMOTE_CHAT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.GIFT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.MEMBER.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.LIVE_UNAUTHORIZED_MEMBER_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.DIGG.getIntType(), (OnIMMessageListener) this);
            InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LLIILZL.LJIIJJI);
            if (hq0 != null && hq0.isEnabled()) {
                this.mMessageManager.addMessageListener(EnumC31509CYf.LIKE.getIntType(), (OnIMMessageListener) this);
            }
            this.mMessageManager.addMessageListener(EnumC31509CYf.SOCIAL.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.CONTROL.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.SCREEN.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.ROOM_RICH_CHAT_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.COMMENT_IMAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.GOODS_ORDER.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.ASSET_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.PORTAL_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.ENVELOPE_PORTAL_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.LIVE_INTRO_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.BOTTOM_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.IM_DELETE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.QUESTION_DELETE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.RED_ENVELOPE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.WISH_LIST_UPDATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.SUB_NOTIFY_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.GIFT_COLLECTION_UPDATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.GUIDE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.RANK_TEXT_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.MODERATOR_OPERATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(EnumC31509CYf.CAPSULE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            if (!this.LLIILZL.LJFF) {
                this.mMessageManager.addMessageListener(EnumC31509CYf.GREETING_MESSAGE.getIntType(), (OnIMMessageListener) this);
            }
        }
    }

    public void LJJJLIIL() {
        T t = this.mView;
        if (t != 0 && ((CRA) t).hs() != null && ((CRA) this.mView).hs().mo49getActivity() != null) {
            this.LJLILLLLZI = (PinMessageViewModel) ViewModelProviders.of(((CRA) this.mView).hs()).get(PinMessageViewModel.class);
        }
    }

    public final InterfaceC31337CRp LJJJZ() {
        if (((ArrayList) this.LLF).size() <= 0) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        InterfaceC31337CRp interfaceC31337CRp = null;
        while (i < ((ArrayList) this.LLF).size()) {
            interfaceC31337CRp = (InterfaceC31337CRp) ListProtector.get(this.LLF, i);
            if (interfaceC31337CRp != null) {
                if (elapsedRealtime - interfaceC31337CRp.getCreateTime() <= LLJLLL && !interfaceC31337CRp.LJJLJLI().LIZ) {
                    break;
                }
                ((LinkedList) this.LLFZ).remove(interfaceC31337CRp);
                interfaceC31337CRp.LJJLJLI().LIZ = true;
                ListProtector.remove(this.LLF, i);
                i--;
                interfaceC31337CRp = null;
            }
            i++;
        }
        return interfaceC31337CRp;
    }

    public final boolean LJJL() {
        if (LJJLI(this.LLIILZL.LJFF).foldMessageScrollType != 0) {
            return true;
        }
        return false;
    }

    public final int LJJLIIIIJ() {
        InterfaceC31337CRp interfaceC31337CRp = this.LLILZ;
        if (interfaceC31337CRp != null) {
            return this.LJZI.LJIIIIZZ(interfaceC31337CRp);
        }
        return -1;
    }

    public void LJJLIIIJJIZ() {
        Room room;
        CQQ cqq = this.LLIILZL;
        if (cqq.LJFF && (room = cqq.LJI) != null && room.getStreamType() == LiveMode.SCREEN_RECORD) {
            this.LLI = true;
        }
    }

    public final boolean LJJLIIIJLLLLLLLZ() {
        if (!this.LLIILZL.LJFF) {
            this.LLJIJIL = InterfaceC30442Bx8.u0.LIZJ().booleanValue();
        } else {
            this.LLJIJIL = InterfaceC30442Bx8.x0.LIZJ().booleanValue();
        }
        if (this.LLIILZL.LJFF) {
            this.LLJILJIL = InterfaceC30442Bx8.z0.LIZJ().booleanValue();
        } else {
            this.LLJILJIL = InterfaceC30442Bx8.w0.LIZJ().booleanValue();
        }
        if (this.LLJILJILJ == 1 && (this.LLJIJIL || !this.LLJILJIL)) {
            return true;
        }
        return false;
    }

    public final void LJJLIIJ() {
        if (!this.LLILZIL) {
            long j = this.LJLJLLL;
            if (!this.LLJJIJIL) {
                this.LLJJJ.LIZ(j, this.LLJJJJJIL);
            } else {
                this.LLJJIJIL = false;
            }
            this.LLJJIJIIJIL = SystemClock.elapsedRealtime();
            this.LLJJJ.LIZ(this.LJLJLLL, this.LLJJJJLIIL);
            this.LLILZIL = true;
        }
    }

    public final void LJJZ() {
        int LJI = this.LJZI.LJI();
        while (((PriorityQueue) this.LL).size() > 0) {
            CRD crd = (CRD) ((PriorityQueue) this.LL).poll();
            if (crd != null) {
                C0NB.LJ("IPublicScreenModel", String.valueOf(crd.LJJJZ()));
                CR1<CRD> cr1 = this.LJZI;
                ListProtector.add(cr1.LIZIZ, 0, crd);
                if (cr1.LJI && !cr1.LIZJ(crd)) {
                    cr1.LIZJ.add(0, crd);
                }
            }
        }
        int LJI2 = this.LJZI.LJI() - LJI;
        boolean z = true;
        if (LJI2 > 0) {
            ((CRA) this.mView).mn(0, LJI2, true);
        }
        CRA cra = (CRA) this.mView;
        if (LJI2 <= 0) {
            z = false;
        }
        cra.Gx(z);
        this.LLJLIL = false;
    }

    public final void LJLI() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && LivePublicScreenHeightMaskAdaptivelySetting.shortenWhenLowHeat(dataChannel) && this.dataChannel.kv0(PublicScreenShortenChannel.class) == Boolean.TRUE) {
            this.LLJ = Long.valueOf(SystemClock.uptimeMillis());
            this.dataChannel.rv0(PublicScreenShortenChannel.class, Boolean.FALSE);
        }
    }

    public C31319CQx() {
        Handler handler = new Handler();
        this.LLIIZ = handler;
        this.LLILLJJLI = new LinkedList();
        this.LLILZLL = true;
        this.LLJ = 0L;
        this.LLJI = null;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = LiveAutoTranslateEnlargeSetting.getValue();
        this.LLJJI = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest();
        this.LLJJIII = LiveModelCreateAnchorSetting.getValue() == 1;
        this.LLJJIJI = LiveModelCreateSetting.getValue();
        this.LLJJIJIIJIL = 0L;
        this.LLJJIJIL = false;
        this.LLJJJ = new CRR(handler, handler);
        this.LLJJJIL = LiveSdkPublicScreenMessageScheduleStrategySetting.getMessageScheduleStrategy();
        this.LLJJJJ = new CRV(this);
        this.LLJJJJJIL = new ARunnableS41S0100000_5(this, 246);
        this.LLJJJJLIIL = new ARunnableS41S0100000_5(this, 247);
        this.LLJJL = new ARunnableS41S0100000_5(this, 248);
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = new ARunnableS41S0100000_5(this, 249);
        this.LLJLIL = false;
    }

    public final void LJJLIL() {
        boolean z;
        if (LivePublicScreenDirectDispatchSetting.enable()) {
            boolean z2 = false;
            if (((PriorityQueue) this.LJLLLLLL).size() >= LivePublicScreenDirectDispatchSetting.getDirectDispatchAccumulation()) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLJJIJIIJIL > 0 && ((float) (SystemClock.elapsedRealtime() - this.LLJJIJIIJIL)) > LivePublicScreenDirectDispatchSetting.getDirectDispatchMaxInterval()) {
                z2 = true;
            }
            if (!this.LLILZLL) {
                if (z || z2) {
                    if (LivePublicScreenDirectDispatchSetting.getResetDirectDispatch()) {
                        this.LLJJJ.LIZIZ.removeCallbacks(this.LLJJJJJIL);
                    } else {
                        this.LLJJIJIL = true;
                    }
                    this.LLJJJ.LIZIZ(this.LLJJJJJIL);
                }
            }
        }
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public void detachView() {
        IDebugService iDebugService;
        CQQ cqq;
        super.detachView();
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLIIZ.removeCallbacksAndMessages(null);
        CRR crr = this.LLJJJ;
        crr.LIZ.removeCallbacksAndMessages(null);
        crr.LIZIZ.removeCallbacksAndMessages(null);
        this.LLJJJ.LIZIZ(new IDRunnableS6S0101000(1, this, 10));
        List<CRD> unmodifiableRawList = this.LJZI.LIZLLL;
        o.LJIIIIZZ(unmodifiableRawList, "unmodifiableRawList");
        Iterator<CRD> it = unmodifiableRawList.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        ((java.util.Map) this.LLIIJI.LJLIL).clear();
        java.util.Map<Class<? extends CRD>, InterfaceC31332CRk<? extends CS1>> map = this.LLIIJLIL;
        if (map != null) {
            ((HashMap) map).clear();
        }
        java.util.Map<Class<? extends CR6>, InterfaceC31318CQw<? extends CR6>> map2 = this.LLIIL;
        if (map2 != null) {
            ((HashMap) map2).clear();
        }
        ((PublicScreenService) CN1.LIZ(IPublicScreenService.class)).LJLJI.remove(this.LLIILZL.LJIIJJI);
        this.LLJJJ.LIZIZ(new ARunnableS9S0101000_5(0, this, 13));
        CR5 cr5 = this.LJLIL;
        if (!cr5.LJI) {
            Iterator it2 = ((ArrayList) cr5.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC31335CRn) it2.next()).onUnload();
            }
        }
        this.LLILL.stop();
        this.LLILL = null;
        this.LLILLIZIL.stop();
        this.LLILLIZIL = null;
        C0HK c0hk = this.LLIILII;
        if (c0hk != null) {
            Iterator it3 = ((java.util.Map) c0hk.LIZIZ).entrySet().iterator();
            while (it3.hasNext()) {
                ((InterfaceC31329CRh) ((Map.Entry) it3.next()).getValue()).release();
            }
            ((java.util.Map) c0hk.LIZIZ).clear();
        }
        C31360CSm c31360CSm = this.LLJILLL;
        if (c31360CSm != null) {
            CV5<T> cv5 = c31360CSm.LJIIIZ;
            if (cv5 != 0) {
                cv5.dispose();
            }
            C73318Sq2 c73318Sq2 = c31360CSm.LJIIJJI;
            if (c73318Sq2 != null && !c73318Sq2.LJLILLLLZI) {
                c73318Sq2.LIZLLL();
            }
            c31360CSm.LJIIJJI = null;
        }
        WatchMemoryLeakOpt watchMemoryLeakOpt = WatchMemoryLeakOpt.INSTANCE;
        if (watchMemoryLeakOpt.settingValue() && (cqq = this.LLIILZL) != null) {
            cqq.LJIIIIZZ = null;
        }
        if (!C31324CRc.LIZ() || (iDebugService = (IDebugService) CN1.LIZ(IDebugService.class)) == null) {
            return;
        }
        iDebugService.tl(null);
        if (watchMemoryLeakOpt.settingValue()) {
            this.LJLJI = null;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        if (LivePublicScreenMessageBufferFree.getValue()) {
            return IMListenerType.ASYNC_BUFFER_FREE;
        }
        return IMListenerType.ASYNC;
    }

    @Override // X.CQP
    public final List<InterfaceC31337CRp> LJJIJIIJI() {
        return this.LLFZ;
    }

    public int LJJLIIIJILLIZJL() {
        return this.LJLLI;
    }

    public CRY LJL() {
        return CRY.Main;
    }

    public static void LJJJJLI(CRD crd) {
        if (!(crd instanceof CQO) || ((CQL) crd).LJIIJJI != null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Public Screen Context is not initialized, model is ");
        LIZ.append(crd);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public static LivePublicScreenConfig LJJLI(boolean z) {
        if (z) {
            return LLJLL;
        }
        return LLJLILLLLZIIL;
    }

    @Override // X.CQP
    public final void LJFF(long j) {
        CQQ cqq = this.LLIILZL;
        if (cqq != null && cqq.LJFF) {
            C1EW.LIZ(((PublicScreenApi) Q7L.LIZIZ(PublicScreenApi.class)).wave(this.LLIILZL.LJIIJJI, j)).LJJJLIIL(new AfS18S0001000_6(0, 2), new AfS17S0001000_5(0, 17));
        }
    }

    @Override // X.CQP
    public final InterfaceC31318CQw<? extends CR6> LJII(CR6 cr6) {
        java.util.Map<Class<? extends CR6>, InterfaceC31318CQw<? extends CR6>> map = this.LLIIL;
        if (map == null) {
            return null;
        }
        return (InterfaceC31318CQw) ((HashMap) map).get(cr6.getClass());
    }

    @Override // X.CQP
    public final void LJIILJJIL(List<InterfaceC31337CRp> list) {
        if (!CUE.LIZ) {
            Iterator it = ((ArrayList) list).iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                ((LinkedList) this.LLFZ).remove(next);
                if (((ArrayList) this.LLF).size() > 0 && ((ArrayList) this.LLF).contains(next)) {
                    ((ArrayList) this.LLF).remove(next);
                    if (next == this.LLILZ) {
                        z = true;
                    }
                }
            }
            if (z) {
                this.LLIIZ.removeCallbacks(this.LLJJL);
                InterfaceC31337CRp LJJJZ = LJJJZ();
                if (LJJJZ != null) {
                    Jz(LJJJZ, true);
                    this.LLIIZ.postDelayed(this.LLJJL, LLJLLIL);
                    return;
                }
                this.LLILZ = null;
                T t = this.mView;
                if (t == 0) {
                    return;
                }
                ((CRA) t).nP();
                return;
            }
            if (((ArrayList) this.LLF).size() != 0) {
                return;
            }
            this.LLILZ = null;
            T t2 = this.mView;
            if (t2 == 0) {
                return;
            }
            ((CRA) t2).nP();
        }
    }

    @Override // X.CQP
    public final void LJJIJ(InterfaceC31337CRp interfaceC31337CRp) {
        interfaceC31337CRp.LJJLJLI().LIZ = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x05e1, code lost:
    
        if (r7 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0180, code lost:
    
        if (((java.lang.Boolean) r3).booleanValue() != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028a A[LOOP:1: B:81:0x0284->B:83:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e4  */
    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJIZL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachView(T r22) {
        /*
            Method dump skipped, instructions count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31319CQx.attachView(X.CRA):void");
    }

    public final boolean LJJJJJ(CRD crd) {
        if (LJJLIIIJLLLLLLLZ() && this.LLJILLL.LJ(crd, this.LLJJJJ)) {
            return true;
        }
        return false;
    }

    public final void LJJJJL(CRD crd) {
        CRD crd2;
        if (crd.LJIIIZ() && crd.LJIJI()) {
            if (((ArrayDeque) this.LJLZ).size() < 100) {
                ((ArrayDeque) this.LJLZ).add(crd);
                crd.LIZLLL().LIZ = true;
                crd.LIZLLL().LIZIZ = SystemClock.uptimeMillis();
                this.LJLIL.LIZJ(crd);
                this.LJLIL.LJ(crd);
                if (crd.LJIIIIZZ()) {
                    LJJLIL();
                    return;
                }
                return;
            }
            crd.dispose();
            this.LJLIL.LJIIIIZZ(crd, false);
            CR5 cr5 = this.LJLIL;
            cr5.getClass();
            if (!cr5.LJI) {
                Iterator it = ((ArrayList) cr5.LIZLLL).iterator();
                while (it.hasNext()) {
                    ((CR8) it.next()).LJIIIZ(crd);
                }
            }
            if (!(crd instanceof CQO)) {
                return;
            }
            CR3.LIZ(((CQO) crd).LJIJJLI, "Message discarded because it exceeds self message buffer size.");
            return;
        }
        if (crd.LJJJJ()) {
            if (((ArrayDeque) this.LJZ).size() < this.LJLLJ) {
                ((ArrayDeque) this.LJZ).add(crd);
                crd.LJJJLL().LIZ = true;
                crd.LIZLLL().LIZ = true;
                crd.LIZLLL().LIZIZ = SystemClock.uptimeMillis();
                this.LJLIL.LIZJ(crd);
                this.LJLIL.LIZIZ(crd);
                return;
            }
            crd.dispose();
            this.LJLIL.LJIIIIZZ(crd, true);
            CR5 cr52 = this.LJLIL;
            cr52.getClass();
            if (!cr52.LJI) {
                Iterator it2 = ((ArrayList) cr52.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((CR8) it2.next()).LJIL(crd);
                }
            }
            if (!(crd instanceof CQO)) {
                return;
            }
            CR3.LIZ(((CQO) crd).LJIJJLI, "Message discarded because it exceeds fold message buffer size.");
            return;
        }
        if (((PriorityQueue) this.LJLLLLLL).size() < this.LJLLLL) {
            ((PriorityQueue) this.LJLLLLLL).add(crd);
            LJJLJ(crd);
            this.LJLIL.LIZLLL(crd);
            if (!crd.LJIIIIZZ()) {
                return;
            }
            LJJLIL();
            return;
        }
        if (this.LJLLL && (crd2 = (CRD) ((PriorityQueue) this.LJLLLLLL).peek()) != null && crd.getPriority() >= crd2.getPriority()) {
            ((PriorityQueue) this.LJLLLLLL).poll();
            ((PriorityQueue) this.LJLLLLLL).add(crd);
            LJJLJ(crd);
            this.LJLIL.LIZLLL(crd);
            if (crd.LJIIIIZZ()) {
                LJJLIL();
            }
        } else {
            crd2 = crd;
        }
        crd2.dispose();
        this.LJLIL.LJIIIIZZ(crd2, false);
        this.LJLIL.LJIIIZ(crd2);
        if (!(crd instanceof CQO)) {
            return;
        }
        CR3.LIZ(((CQO) crd).LJIJJLI, "Message discarded because it exceeds other message buffer size.");
    }

    public final CRD LJJJJZ(CR6 cr6) {
        CR5 cr5 = this.LJLIL;
        if (!cr5.LJI) {
            Iterator it = ((ArrayList) cr5.LIZLLL).iterator();
            while (it.hasNext()) {
                ((CR8) it.next()).LJJIIZI();
            }
        }
        return ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).b5(cr6);
    }

    public final CRD LJJJJZI(CR6 cr6) {
        long defaultPriorityForAudience;
        CRD LJJJJZ = LJJJJZ(cr6);
        if (LJJJJZ == null) {
            return null;
        }
        if (LJJJJZ instanceof InterfaceC31341CRt) {
            ((InterfaceC31341CRt) LJJJJZ).LJIJJLI(this.LLIILZL);
        }
        if (this.LJLLL) {
            LJJJJZ.LJJJJZ();
            if (LJJJJZ.getPriority() == 0) {
                if (this.LLIILZL.LJFF) {
                    defaultPriorityForAudience = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAnchor();
                } else {
                    defaultPriorityForAudience = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAudience();
                }
                LJJJJZ.LJJ(defaultPriorityForAudience);
            }
        }
        if (LJJJJZ.LJJJJ()) {
            LJJJJZ.LJJJLL().LIZ = true;
        }
        return LJJJJZ;
    }

    public final void LJJJLL(CRD crd) {
        String str;
        if (!this.LLIIIJ || this.LLIILZL == null) {
            return;
        }
        this.LLIIIJ = false;
        if (!(crd instanceof C29818Bn4) || ((CQO) crd).LJIJJLI.isLocalInsertMsg) {
            return;
        }
        CRD b5 = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).b5(C31309CQn.LJIJ(this.LLIILZL.LJIIJJI, C15380j0.LJIILJJIL(R.string.oqb)));
        if (b5 instanceof InterfaceC31341CRt) {
            ((InterfaceC31341CRt) b5).LJIJJLI(this.LLIILZL);
        }
        LJLJLLL(b5, true);
        Calendar calendar = Calendar.getInstance();
        C29889BoD LIZIZ = C29889BoD.LIZIZ(((InterfaceC31336CRo) this.mView).getContext());
        LIZIZ.LJII(Integer.valueOf(this.LLIIIL + 1), "live.mt.text_message.guidance_total_display_count");
        LIZIZ.LJII(Integer.valueOf(calendar.get(1)), "live.mt.text_message.guidance_last_display_year");
        LIZIZ.LJII(Integer.valueOf(calendar.get(6)), "live.mt.text_message.guidance_last_display_day");
        LIZIZ.LJII(Integer.valueOf(this.LLIIIZ + 1), "live.mt.text_message.guidance_daily_display_count");
        LIZIZ.LIZ();
        if (!this.LLIILZL.LJIILJJIL) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_translate_guide");
        LIZ.LJIILLIIL(this.dataChannel);
        if (this.LLIILZL.LJFF) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ(X.CQO<? extends X.CR6> r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31319CQx.LJJJLZIJ(X.CQO):void");
    }

    public final int LJJLIIIJ(long j) {
        if (j == 0) {
            return -1;
        }
        for (int i = 0; i < this.LJZI.LJII(); i++) {
            if (this.LJZI.LJ(i).getToken() == j) {
                return i;
            }
        }
        return -1;
    }

    public final void LJJLIIIJJI(BottomMessage bottomMessage) {
        CommonMessageData commonMessageData;
        boolean z;
        boolean z2;
        int i;
        if (bottomMessage == null || (commonMessageData = bottomMessage.baseMessage) == null || commonMessageData.displayText == null) {
            C29827BnD.LIZ(bottomMessage, "characterParsingError");
            return;
        }
        if (this.LJLJJLL != null && this.LJLJJI > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((i = bottomMessage.bizType) == 1 || i == 2)) {
            C29827BnD.LIZ(bottomMessage, "attributeSetting");
            return;
        }
        if (this.LJLJJLL != null && this.LJLJJI > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && bottomMessage.bizType == 5 && this.LJLJJLL.bizType != 1 && this.LJLJJLL.bizType != 2) {
            C29827BnD.LIZ(bottomMessage, "attributeSetting");
            return;
        }
        long j = this.LLIILZL.LJIILLIIL;
        if (this.LJLJJLL != null && this.LJLJJI > 0 && this.LJLJJLL.bizType == 6 && bottomMessage.bizType == 6 && this.LJLJJLL.violationUserId == j) {
            long j2 = bottomMessage.violationUserId;
            if (j2 != j && j2 > 0) {
                C29827BnD.LIZ(bottomMessage, "attributeSetting");
                return;
            }
        }
        if (bottomMessage.bizType == 5) {
            BZI LIZ = C28787BRn.LIZ("livesdk_tns_ags_popup_message_warning");
            LIZ.LJIJJ(Long.valueOf(((C29374Bfu) C279117r.LIZJ(LIZ, this.dataChannel)).getCurrentUserId()), "user_id");
            LIZ.LJJIIJZLJL();
        }
        long j3 = bottomMessage.duration;
        if (j3 < 0) {
            j3 = Long.MAX_VALUE;
        }
        this.LJLJJI = j3;
        bottomMessage.duration = this.LJLJJI;
        this.LJLJJL = CXJ.LJFF(bottomMessage.baseMessage.displayText, "");
        this.LJLJJLL = bottomMessage;
        this.LLJJJ.LIZJ(new IDRunnableS6S0101000(1, this, 31));
    }

    public final void LJJLJ(CRD crd) {
        crd.LIZLLL().LIZ = true;
        crd.LIZLLL().LIZIZ = SystemClock.uptimeMillis();
        this.LJLIL.LIZJ(crd);
    }

    public final void LJJLJLI(List<CRD> list) {
        CRD crd = this.LLILLL;
        if (crd != null) {
            if (!this.LJZI.LIZJ(crd)) {
                ((CRA) this.mView).sT(this.LLILLL);
                ((CRA) this.mView).r00();
            } else {
                ((CRA) this.mView).Wn0();
            }
        }
        List<CRD> LJFF = this.LJZI.LJFF();
        ((CRA) this.mView).oj(C03200Aq.LIZ(new C31323CRb(list, LJFF), true), LJFF);
        ((CRA) this.mView).DT(true);
    }

    public final void LJJLL(CRU cru) {
        ArrayList arrayList = new ArrayList();
        for (CR6 cr6 : cru.LIZ) {
            if (!this.LLD.containsKey(Long.valueOf(cr6.getMessageId()))) {
                CRD LJJJJZI = LJJJJZI(cr6);
                if (LJJLIIIJLLLLLLLZ() && LJJJJZI != null && this.LLJJ.LIZ(LJJJJZI)) {
                    arrayList.add(LJJJJZI);
                } else {
                    ((PriorityQueue) this.LL).offer(LJJJJZI);
                }
            }
        }
        if (arrayList.size() > 0) {
            C73428Sro LIZLLL = this.LLJJ.LIZLLL(arrayList);
            if (LIZLLL != null) {
                ((InterfaceC29856Bng) LIZLLL.LIZJ(C73933Szx.LJ((LifecycleOwner) this.mView))).LIZJ(new AfS54S0200000_5(this, arrayList, 38), new AfS54S0200000_5(this, arrayList, 39));
                return;
            }
            return;
        }
        LJJZ();
    }

    public final CS1 LJJZZI(CRD crd) {
        CS1 cs1 = null;
        if (crd == null) {
            return null;
        }
        java.util.Map<Class<? extends CRD>, InterfaceC31332CRk<? extends CS1>> map = this.LLIIJLIL;
        if (map != null) {
            InterfaceC31332CRk interfaceC31332CRk = (InterfaceC31332CRk) ((HashMap) map).get(crd.getClass());
            if (interfaceC31332CRk != null && (crd instanceof CS1)) {
                CS1 cs12 = (CS1) crd;
                interfaceC31332CRk.LIZ(cs12, this.LLIILZL);
                cs1 = cs12.LIZJ();
                if (cs1 != null) {
                    cs1.LJIJJLI(this.LLIILZL);
                }
            }
        }
        return cs1;
    }

    public final void LJLIIIL(int i) {
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(i, (OnIMMessageListener) this);
        }
    }

    public final void LJLIIL(int i) {
        CRD LJ = this.LJZI.LJ(i);
        LJ.dispose();
        int LJIIIIZZ = this.LJZI.LJIIIIZZ(LJ);
        this.LJZI.LJIIIZ(LJ);
        if (LJIIIIZZ != -1) {
            ((CRA) this.mView).zJ(LJIIIIZZ);
        }
    }

    public final void LJLJJL(HistoryInfo historyInfo) {
        boolean z;
        CRF crf = this.LJZL;
        String cursor = historyInfo.getCommentCursor();
        boolean hasMore = historyInfo.getHasMore();
        crf.getClass();
        o.LJIIIZ(cursor, "cursor");
        crf.LIZIZ = cursor;
        crf.LIZJ = hasMore;
        if (!C29306Beo.LJIIJ(this.dataChannel)) {
            CRA cra = (CRA) this.mView;
            if (this.LJZL.LIZIZ() && !this.LLFII) {
                z = true;
            } else {
                z = false;
            }
            cra.js(z);
        }
    }

    public final boolean LJLJJLL(CRD crd) {
        long j;
        long j2;
        long j3;
        if (!LivePublicScreenMessageSyncSetting.getValue().enableMessageSync) {
            return false;
        }
        CQQ cqq = this.LLIILZL;
        if (cqq.LJFF || !(crd instanceof CQJ)) {
            return false;
        }
        try {
            CQJ cqj = (CQJ) crd;
            long id = cqq.LJI.getOwner().getId();
            if (cqj.getUser() != null && cqj.getUser().getId() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                long LIZIZ = C31012CFc.LIZIZ();
                MESSAGE message = cqj.LJIJJLI;
                if (((ChatMessage) message).baseMessage != null) {
                    j = ((ChatMessage) message).baseMessage.clientSendTime;
                } else {
                    j = 0;
                }
                long j4 = LIZIZ - j;
                if (j4 < LivePublicScreenMessageSyncSetting.getValue().c2cDelayMax && j4 >= 0) {
                    InterfaceC28738BPq interfaceC28738BPq = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ;
                    if (interfaceC28738BPq != null) {
                        j2 = interfaceC28738BPq.LJJJJLL();
                    } else {
                        j2 = 0;
                    }
                    if (j2 < LivePublicScreenMessageSyncSetting.getValue().seiDelayMax && j2 >= 0) {
                        if (id == cqj.getUser().getId()) {
                            j3 = j2 - j4;
                        } else {
                            j3 = (LivePublicScreenMessageSyncSetting.getValue().hostC2CDelay + j2) - j4;
                        }
                        long j5 = j3 - LivePublicScreenMessageSyncSetting.getValue().syncDelayReduce;
                        if (j5 > this.LJLJLJ / 2 && j5 < LivePublicScreenMessageSyncSetting.getValue().syncDelayMax) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Public Screen Message shouldDelayRelease, c2cDelay: ");
                            LIZ.append(j4);
                            LIZ.append(", seiDelay: ");
                            LIZ.append(j2);
                            LIZ.append(", finalDelay: ");
                            LIZ.append(j5);
                            C0NB.LIZ(X1D.LIZIZ(LIZ));
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Public Screen Message shouldDelayRelease e: ");
            LIZ2.append(e);
            C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ2));
            return false;
        }
    }

    public final boolean LJLJLJ(CRD crd) {
        if (!LivePublicScreenDirectDispatchSetting.enable() && LiveFasterReleaseMsgsLowHeatSettingSetting.enable(this.dataChannel) && !this.LLILZLL && crd.LJIIIIZZ() && !this.LLIZLLLIL && !this.LLIZ) {
            return true;
        }
        return false;
    }

    public final OSZ LJLL(CSC csc) {
        boolean z;
        CSG<CQO<? extends CR6>> csg;
        CSH<? extends CRD> csh;
        int LJLLJ = LJLLJ(csc);
        PinMessageViewModel pinMessageViewModel = this.LJLILLLLZI;
        if (pinMessageViewModel != null && (((csg = pinMessageViewModel.LJLJJI) != null && csg.LJIIJ == csc) || ((csh = pinMessageViewModel.LJLJJL) != null && csh.LIZ() == csc))) {
            return new OSZ(Boolean.TRUE, Boolean.FALSE);
        }
        boolean z2 = false;
        if (LJLLJ != -1) {
            z = ((CRA) this.mView).nn(LJLLJ);
        } else {
            z = false;
        }
        if (LJLLJ != -1) {
            z2 = true;
        }
        return new OSZ(Boolean.valueOf(z2), Boolean.valueOf(z));
    }

    public final void LJLLI(boolean z) {
        Room room;
        if (this.mView == 0) {
            return;
        }
        if (z && (room = this.LLIILZL.LJI) != null && (room.getRoomAuthStatus() == null || this.LLIILZL.LJI.getRoomAuthStatus().isMessageEnable())) {
            ((CRA) this.mView).Qe();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(CommentStatusChannel.class, Boolean.TRUE);
                return;
            }
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(CommentStatusChannel.class, Boolean.FALSE);
        }
        ((CRA) this.mView).Vl0();
    }

    public final int LJLLJ(CRD crd) {
        PinMessageViewModel pinMessageViewModel = this.LJLILLLLZI;
        if (pinMessageViewModel != null && ((pinMessageViewModel.LJLJJI != null || pinMessageViewModel.LJLJJL != null) && pinMessageViewModel.gv0(crd))) {
            this.LJLILLLLZI.kv0(crd);
            return -1;
        }
        if (crd == null || this.mView == 0 || this.LLIILZL == null) {
            return -1;
        }
        if (LJJL() && this.LLILLL == crd) {
            ((CRA) this.mView).J30(crd);
            return -1;
        }
        int LJIIIIZZ = this.LJZI.LJIIIIZZ(crd);
        if (LJIIIIZZ != -1) {
            ((CRA) this.mView).VM(LJIIIIZZ);
        }
        return LJIIIIZZ;
    }

    public final void e30(int i) {
        CRA cra;
        if (LivePublicScreenUpdateOptSetting.getCount(this.dataChannel) > 0 && (cra = (CRA) this.mView) != null) {
            cra.e30(i);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        this.LLJJJ.LIZIZ(new ARunnableS24S0200000_5(this, (CR6) iMessage, 66));
    }

    public final void start(int i) {
        CRA cra;
        if (LivePublicScreenUpdateOptSetting.getCount(this.dataChannel) > 0 && (cra = (CRA) this.mView) != null) {
            cra.start(i);
        }
    }

    public static boolean LJLIL(long j, Collection<CRD> collection) {
        Iterator<CRD> it = collection.iterator();
        while (it.hasNext()) {
            CRD next = it.next();
            if (next.getToken() == j) {
                next.dispose();
                it.remove();
                return true;
            }
        }
        return false;
    }

    public final void Jz(InterfaceC31337CRp interfaceC31337CRp, boolean z) {
        this.LLILZ = interfaceC31337CRp;
        T t = this.mView;
        if (t != 0) {
            ((CRA) t).Jz(interfaceC31337CRp, z);
        }
    }

    @Override // X.CQP
    public final void LJJ(InterfaceC31337CRp interfaceC31337CRp, boolean z) {
        if (!CUE.LIZ) {
            if (((ArrayList) this.LLF).size() == 0) {
                ((ArrayList) this.LLF).add(interfaceC31337CRp);
                Jz(interfaceC31337CRp, true);
                this.LLIIZ.postDelayed(this.LLJJL, LLJLLIL);
            } else {
                if (((ArrayList) this.LLF).contains(interfaceC31337CRp)) {
                    return;
                }
                if (this.LLILZ != null && this.LJZI.LJIIIIZZ(interfaceC31337CRp) < LJJLIIIIJ()) {
                    Jz(interfaceC31337CRp, false);
                }
                ((ArrayList) this.LLF).add(interfaceC31337CRp);
                if (!z) {
                    return;
                }
                Collections.sort(this.LLF, this.LLFFF);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    @Override // X.CQP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(final X.CQO<? extends X.CR6> r40, X.C30779C6d r41) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31319CQx.LJJIIZ(X.CQO, X.C6d):void");
    }

    @Override // X.CQP
    public final void LJJIJL(ChatMessage chatMessage, CQK cqk) {
        ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).GZ((FragmentManager) this.dataChannel.kv0(C29494Bhq.class), chatMessage, new AObjectS81S0300000_5(this, chatMessage, cqk, 1));
    }

    public final void LJJJJJL(AbstractC31313CQr abstractC31313CQr, CR6 cr6) {
        CRD crd;
        if (abstractC31313CQr.LJ(cr6, this.LLIILZL.LJII) && abstractC31313CQr.LJIIIZ(cr6, this.LLIILZL.LJFF)) {
            if (((ArrayDeque) this.LJLZ).size() < 100) {
                CRD LJJJJZI = LJJJJZI(cr6);
                if (LJJJJZI != null) {
                    ((ArrayDeque) this.LJLZ).add(LJJJJZI);
                    LJJJJZI.LIZLLL().LIZ = true;
                    LJJJJZI.LIZLLL().LIZIZ = SystemClock.uptimeMillis();
                    this.LJLIL.LIZJ(LJJJJZI);
                    this.LJLIL.LJ(LJJJJZI);
                    if (!LJJJJZI.LJIIIIZZ()) {
                        return;
                    }
                    LJJLIL();
                    return;
                }
            } else {
                CR5 cr5 = this.LJLIL;
                CQQ cqq = this.LLIILZL;
                cr5.LJII(cr6, abstractC31313CQr, cqq.LJFF, cqq.LJII, false);
            }
            CR3.LIZ(cr6, "Message discarded because it exceeds self message buffer size.");
            return;
        }
        if (abstractC31313CQr.LJFF(this.LLIILZL, cr6)) {
            if (((ArrayDeque) this.LJZ).size() < this.LJLLJ) {
                CRD LJJJJZI2 = LJJJJZI(cr6);
                if (LJJJJZI2 != null) {
                    ((ArrayDeque) this.LJZ).add(LJJJJZI2);
                    LJJJJZI2.LJJJLL().LIZ = true;
                    LJJJJZI2.LIZLLL().LIZ = true;
                    LJJJJZI2.LIZLLL().LIZIZ = SystemClock.uptimeMillis();
                    this.LJLIL.LIZJ(LJJJJZI2);
                    this.LJLIL.LIZIZ(LJJJJZI2);
                    return;
                }
            } else {
                CR5 cr52 = this.LJLIL;
                CQQ cqq2 = this.LLIILZL;
                cr52.LJII(cr6, abstractC31313CQr, cqq2.LJFF, cqq2.LJII, true);
            }
            CR3.LIZ(cr6, "Message discarded because it exceeds fold message buffer size.");
            return;
        }
        if (((PriorityQueue) this.LJLLLLLL).size() < this.LJLLLL) {
            CRD LJJJJZI3 = LJJJJZI(cr6);
            if (LJJJJZI3 != null) {
                if (LJJJJJ(LJJJJZI3)) {
                    return;
                }
                ((PriorityQueue) this.LJLLLLLL).add(LJJJJZI3);
                LJJJJZI3.LIZLLL().LIZ = true;
                LJJJJZI3.LIZLLL().LIZIZ = SystemClock.uptimeMillis();
                this.LJLIL.LIZJ(LJJJJZI3);
                this.LJLIL.LIZLLL(LJJJJZI3);
                if (!LJJJJZI3.LJIIIIZZ()) {
                    return;
                }
                LJJLIL();
                return;
            }
        } else if (this.LJLLL && (crd = (CRD) ((PriorityQueue) this.LJLLLLLL).peek()) != null && abstractC31313CQr.LIZIZ(cr6, this.LJLLL, this.LLIILZL.LJFF, cr6.baseMessage) >= crd.getPriority()) {
            crd.dispose();
            this.LJLIL.LJIIIIZZ(crd, false);
            this.LJLIL.LJIIIZ(crd);
            ((PriorityQueue) this.LJLLLLLL).poll();
            CRD LJJJJZI4 = LJJJJZI(cr6);
            if (LJJJJZI4 != null) {
                if (LJJJJJ(LJJJJZI4)) {
                    return;
                }
                ((PriorityQueue) this.LJLLLLLL).add(LJJJJZI4);
                LJJLJ(LJJJJZI4);
                this.LJLIL.LIZLLL(LJJJJZI4);
                if (LJJJJZI4.LJIIIIZZ()) {
                    LJJLIL();
                }
            }
        } else {
            CR5 cr53 = this.LJLIL;
            CQQ cqq3 = this.LLIILZL;
            cr53.LJII(cr6, abstractC31313CQr, cqq3.LJFF, cqq3.LJII, false);
        }
        CR3.LIZ(cr6, "Message discarded because it exceeds other message buffer size.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0236, code lost:
    
        if (r1.LJI.mRoomAuthStatus.enableChat == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c4  */
    /* JADX WARN: Type inference failed for: r4v19, types: [X.2Wj, O] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJJLIIIJL(final X.CR6 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31319CQx.LJJLIIIJL(X.CR6, boolean):long");
    }

    public final boolean LJLJL(AbstractC31313CQr abstractC31313CQr, CR6 cr6) {
        if (!LivePublicScreenDirectDispatchSetting.enable() && LiveFasterReleaseMsgsLowHeatSettingSetting.enable(this.dataChannel) && !this.LLILZLL && abstractC31313CQr.LIZLLL(this.LLIILZL, cr6) && !this.LLIZLLLIL && !this.LLIZ) {
            return true;
        }
        return false;
    }

    public final void LJLJLLL(CRD crd, boolean z) {
        if ((z && LJJJJJ(crd)) || crd == null) {
            return;
        }
        int i = 0;
        if (crd.LJJJLL().LIZ) {
            this.LLJJJ.LIZJ(new RunnableC31370CSw(i, this, crd));
            return;
        }
        if (!this.LLIZ && crd.LJIIIIZZ()) {
            this.LLIZ = true;
        }
        CS1 LJJZZI = LJJZZI(crd);
        if (LJJZZI == null) {
            this.LLJJJ.LIZJ(new RunnableC31321CQz(i, this, Collections.singletonList(crd)));
        } else {
            this.LLJJJ.LIZJ(new RunnableC31321CQz(i, this, Arrays.asList(crd, LJJZZI)));
        }
    }

    public final void LJLLILLLL(ChatMessage chatMessage, CRD crd) {
        if (chatMessage != null) {
            C1EW.LIZ(((ChatApproveApi) Q7L.LIZIZ(ChatApproveApi.class)).chatApprove(this.LLIILZL.LJIIJJI, chatMessage.getMessageId())).LJJJLIIL(new AfS44S0300000_5(chatMessage, this, crd, 7), new AfS17S0001000_5(0, 18));
        }
    }

    public final void LJLLL(int i, CRD crd) {
        if (i >= 0 && i < this.LJZI.LJII() && crd != null && this.mView != 0 && this.LLIILZL != null) {
            if (!this.LJZI.LIZIZ.contains(crd) && (crd instanceof InterfaceC31341CRt)) {
                ((InterfaceC31341CRt) crd).LJIJJLI(this.LLIILZL);
            }
            CRD LJ = this.LJZI.LJ(i);
            LJ.dispose();
            int LJIIIIZZ = this.LJZI.LJIIIIZZ(LJ);
            this.LJZI.LJIIJ(i, crd);
            if (LJIIIIZZ != -1) {
                ((CRA) this.mView).VM(LJIIIIZZ);
            }
        }
    }

    @Override // X.CQP
    public final void LJJIIZI(CR6 cr6, boolean z, CS3 cs3) {
        this.LLJJJ.LIZIZ(new ARunnableS4S0310000_5(this, cr6, z, cs3, 1));
    }

    public final void LJJLIIIJLJLI(CS2 cs2, CRD crd, boolean z) {
        if (crd instanceof CQO) {
            ((InterfaceC31341CRt) crd).LJIJJLI(this.LLIILZL);
            CR6 cr6 = ((CQO) crd).LJIJJLI;
            InterfaceC31330CRi<? extends IMessage> interfaceC31330CRi = (InterfaceC31330CRi) ((java.util.Map) this.LLIIJI.LJLIL).get(cr6.getClass());
            if (interfaceC31330CRi != null && interfaceC31330CRi.LIZ(cr6, this.LLIILZL)) {
                this.LJLIL.LJIIJ(interfaceC31330CRi, cr6);
                if (cs2 != null) {
                    cs2.LIZ(0L);
                    return;
                }
                return;
            }
        }
        this.LJLIL.LJI(crd);
        this.LLJJJ.LIZIZ(new ARunnableS4S0310000_5(this, crd, z, cs2, 0));
    }

    public final long LJLJI(boolean z, CRD crd, boolean z2) {
        CQO<?> cqo;
        long defaultPriorityForAudience;
        if (this.LJLLL) {
            crd.LJJJJZ();
            if (crd.getPriority() == 0) {
                if (this.LLIILZL.LJFF) {
                    defaultPriorityForAudience = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAnchor();
                } else {
                    defaultPriorityForAudience = LivePublicScreenMessageDefaultPrioritySetting.getDefaultPriorityForAudience();
                }
                crd.LJJ(defaultPriorityForAudience);
            }
        }
        if (crd.LJJIII() || z) {
            if (crd.LJJJJ()) {
                crd.LJJJLL().LIZ = true;
            }
            LJLJLLL(crd, z2);
            if (crd instanceof CQM) {
                this.LLJJJ.LIZJ(new ARunnableS12S0101000_8(1, this, 33));
            }
        } else if (this.LLIL) {
            if (crd.LJJJJ()) {
                if (this.LLILII < LiveMessageAdvanceCount.getValue()) {
                    crd.LJJJLL().LIZ = true;
                    LJLJLLL(crd, z2);
                    this.LLILII++;
                } else {
                    LJJLIIJ();
                    LJJJJL(crd);
                }
            } else if (this.LLILII < LiveMessageAdvanceCount.getValue()) {
                LJLJLLL(crd, z2);
                this.LLILII++;
            } else {
                LJJLIIJ();
                if (LJLJLJ(crd)) {
                    LJLJLLL(crd, z2);
                } else {
                    LJJJJL(crd);
                }
            }
        } else if (LJLJLJ(crd)) {
            LJLJLLL(crd, z2);
        } else {
            LJJJJL(crd);
        }
        if (this.LLI && (crd instanceof CQO)) {
            if (crd instanceof CQ6) {
                cqo = new C31279CPj((LikeMessage) ((CQO) crd).LJIJJLI);
            } else if (crd instanceof CQ7) {
                cqo = new C31280CPk((SocialMessage) ((CQO) crd).LJIJJLI);
            } else if (crd instanceof C31276CPg) {
                cqo = new C31277CPh((MemberMessage) ((CQO) crd).LJIJJLI);
            } else if (crd instanceof C31290CPu) {
                cqo = new C31291CPv((GiftMessage) ((CQO) crd).LJIJJLI);
            } else {
                cqo = null;
            }
            if (BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup() && (crd instanceof CQJ)) {
                cqo = new C31272CPc((ChatMessage) ((CQO) crd).LJIJJLI);
            } else if (cqo == null) {
                this.LLII.LIZ((CQO) crd);
            }
            cqo.LJIJJLI(this.LLIILZL);
            this.LLII.LIZ(cqo);
        }
        return crd.getToken();
    }
}
