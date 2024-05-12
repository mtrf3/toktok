package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.AbstractC32320CmK;
import X.AbstractC32682CsA;
import X.AbstractC32698CsQ;
import X.B83;
import X.BJM;
import X.BZI;
import X.C025908h;
import X.C0A7;
import X.C0AC;
import X.C0NB;
import X.C28787BRn;
import X.C28835BTj;
import X.C29044Baa;
import X.C29374Bfu;
import X.C30725C4b;
import X.C30896CAq;
import X.C31120CJg;
import X.C32128CjE;
import X.C32129CjF;
import X.C32136CjM;
import X.C32137CjN;
import X.C32138CjO;
import X.C32313CmD;
import X.C32314CmE;
import X.C32481Cov;
import X.C32502CpG;
import X.C32683CsB;
import X.C32694CsM;
import X.C32700CsS;
import X.C32710Csc;
import X.C32711Csd;
import X.C32712Cse;
import X.C32722Cso;
import X.C32730Csw;
import X.C32732Csy;
import X.C32738Ct4;
import X.C32739Ct5;
import X.C32740Ct6;
import X.C32778Cti;
import X.C32781Ctl;
import X.C32783Ctn;
import X.C32785Ctp;
import X.C32789Ctt;
import X.C32792Ctw;
import X.C32830CuY;
import X.C73318Sq2;
import X.C73943T0h;
import X.C77283UUt;
import X.C77557UcD;
import X.C78110Ul8;
import X.C80091Vbz;
import X.C82555Wad;
import X.C88137YiT;
import X.C88207Yjb;
import X.EnumC35487DwJ;
import X.F9J;
import X.InterfaceC136265Wk;
import X.ViewTreeObserverOnDrawListenerC32749CtF;
import X.ZCL;
import Y.AObjectS42S0101000_5;
import Y.AObserverS60S0101000_5;
import Y.ARunnableS13S0101000_9;
import Y.ARunnableS9S0101000_5;
import Y.AfS36S0101000_5;
import Y.IDRunnableS6S0101000;
import Y.IDrS45S0100000_5;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.CancelAllAnimationEvent;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFirstRechargeOptimizedSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelManualSortSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class LiveNewGiftPanelWidget extends LiveWidget implements InterfaceC136265Wk {
    public RecyclerView LJLIL;
    public C77557UcD LJLILLLLZI;
    public Room LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public EnumC35487DwJ LJLJL;
    public AbstractC32682CsA LJLJLLL;
    public C32136CjM LJLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public String LJLLL;
    public int LLFF;
    public GiftPage LLFFF;
    public int LLFII;
    public RiskCtl LLIIIILZ;
    public final LinkedList<GiftPage> LJLJLJ = new LinkedList<>();
    public LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJLLJ = new LinkedList<>();
    public int LJLLLL = 0;
    public final C73318Sq2 LJLLLLLL = new C73318Sq2();
    public boolean LJLZ = true;
    public boolean LJZ = false;
    public boolean LJZI = false;
    public boolean LJZL = false;
    public boolean LL = true;
    public boolean LLD = false;
    public Map<Long, C32830CuY> LLF = new HashMap();
    public boolean LLFZ = true;
    public long LLI = 0;
    public long LLIFFJFJJ = 0;
    public boolean LLII = true;
    public final ViewTreeObserverOnDrawListenerC32749CtF LLIIII = new ViewTreeObserver.OnDrawListener() { // from class: X.CtF
        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            LiveNewGiftPanelWidget liveNewGiftPanelWidget = LiveNewGiftPanelWidget.this;
            if (liveNewGiftPanelWidget.LLII) {
                liveNewGiftPanelWidget.LLII = false;
                C32694CsM.LJJIJIL = SystemClock.uptimeMillis();
                long uptimeMillis = SystemClock.uptimeMillis() - liveNewGiftPanelWidget.LLI;
                C32694CsM.LJIL = uptimeMillis;
                C32792Ctw.LIZIZ(uptimeMillis, liveNewGiftPanelWidget.LLIFFJFJJ);
            }
        }
    };
    public int LLIIIJ = 1;
    public int LLIIIL = 1;
    public final AtomicBoolean LLIIIZ = new AtomicBoolean(true);
    public boolean LLIIJI = false;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* loaded from: classes6.dex */
    public static class GiftSSGridLayoutManager extends SSGridLayoutManager {
        public final boolean LLIIZ;
        public final Runnable LLIL;

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final boolean LJIJJLI() {
            if (super.LJIJJLI() && this.LLIIZ) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final boolean LJIL() {
            if (super.LJIL() && this.LLIIZ) {
                return true;
            }
            return false;
        }

        public GiftSSGridLayoutManager(ARunnableS13S0101000_9 aRunnableS13S0101000_9) {
            super(2, 0);
            this.LLIIZ = true;
            this.LLIL = aRunnableS13S0101000_9;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final void LJLJJL(C0AC c0ac) {
            Runnable runnable;
            super.LJLJJL(c0ac);
            int LLILL = LLILL();
            int LLILLJJLI = LLILLJJLI();
            if (LLILL >= 0 && LLILLJJLI >= 0 && LLILLJJLI >= LLILL && (runnable = this.LLIL) != null) {
                runnable.run();
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager, androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
            if (C32694CsM.LJIIL == 0) {
                C32694CsM.LJIIL = SystemClock.uptimeMillis();
            }
            super.LJLJJI(c0a7, c0ac);
            if (C32694CsM.LJIILIIL == 0) {
                C32694CsM.LJIILIIL = SystemClock.uptimeMillis();
            }
        }
    }

    public final boolean LJLZ() {
        long j;
        User user;
        C32136CjM c32136CjM = this.LJLL;
        if (c32136CjM != null && (user = c32136CjM.LIZ) != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        RiskCtl riskCtl = this.LLIIIILZ;
        if (riskCtl != null && riskCtl.disableSendGift && j == C025908h.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C32694CsM c32694CsM = C32694CsM.LIZ;
        C32694CsM.LJJIL = SystemClock.uptimeMillis();
        C32128CjE c32128CjE = C32129CjF.LIZ;
        String str = c32128CjE.LJ;
        int i = this.LLIIIJ;
        int i2 = this.LLIIIL;
        int i3 = C32694CsM.LIZLLL;
        int i4 = C32694CsM.LJJI;
        C32710Csc.LJIIJJI(new C32722Cso(str, i, i2, i3, i4, true, Math.min(i4, Math.max(C32694CsM.LJJIII, C32694CsM.LJJII)), Math.min(C32694CsM.LJJI, C32694CsM.LJJII)), new C32730Csw(c32694CsM), new C32712Cse(c32694CsM, this.LLI - c32128CjE.LJIIJ), new C32711Csd(c32694CsM), SystemClock.uptimeMillis() - this.LLI, Math.min(C32694CsM.LJJIJL, Math.min(C32694CsM.LJJIL, C32694CsM.LJJIJLIJ)) - c32128CjE.LJIIJ, C32694CsM.LIZIZ(), C32694CsM.LJFF, 0L, 0L, 0);
        super.onDestroy();
        C32694CsM.LIZ();
        this.LJLLLLLL.LIZLLL();
        this.LLD = false;
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnDrawListener(this.LLIIII);
        }
        C32136CjM c32136CjM = this.LJLL;
        if (c32136CjM != null) {
            c32136CjM.LIZIZ.removeObservers(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C32683CsB c32683CsB = C32783Ctn.LIZ;
        c32683CsB.LIZ = -1;
        c32683CsB.LIZIZ = -1;
        c32683CsB.LJIIJ = true;
        if (AbstractC32320CmK.LIZ.LJIIIZ()) {
            BZI LIZ = C28787BRn.LIZ("welcome_gift_show");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ.LJJIIJZLJL();
        }
        RecyclerView recyclerView = (RecyclerView) this.contentView.findViewById(R.id.du5);
        this.LJLIL = recyclerView;
        recyclerView.getViewTreeObserver().removeOnDrawListener(this.LLIIII);
        this.LJLIL.getViewTreeObserver().addOnDrawListener(this.LLIIII);
        this.LJLILLLLZI = (C77557UcD) this.containerView.findViewById(R.id.biy);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            this.LJLJI = (Room) dataChannel.kv0(RoomChannel.class);
            this.LJLJJLL = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
            this.LJLLLLLL.LIZ(C73943T0h.LIZ().LJ(C32481Cov.class).LJJJJZI(new AfS36S0101000_5(1, this, 36)));
            this.LJLLLLLL.LIZ(C73943T0h.LIZ().LJ(ZCL.class).LJJJJZI(new AfS36S0101000_5(3, this, 37)));
            this.LJLLLLLL.LIZ(C73943T0h.LIZ().LJ(C32138CjO.class).LJJJJZI(new AfS36S0101000_5(1, this, 38)));
            if (this.LJLJI != null) {
                this.LLIIIILZ = GiftManager.inst().getTargetRoomGiftRiskCtl(this.LJLJI.getId());
            }
        }
        if (this.LJLLI) {
            final Context context = this.context;
            this.LJLJLLL = new AbstractC32682CsA(context, this) { // from class: X.5Wj
                @Override // X.AbstractC029409q
                public final AbstractC32677Cs5 onCreateViewHolder(ViewGroup parent, int i) {
                    o.LJIIIZ(parent, "parent");
                    AbstractC32677Cs5 LJLZ = super.LJLZ(i, parent);
                    Object LLILL = C16880lQ.LLILL(this.LJLJJI, "window");
                    o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
                    Point point = new Point();
                    Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
                    if (defaultDisplay != null) {
                        defaultDisplay.getSize(point);
                    }
                    LJLZ.itemView.setLayoutParams(new ViewGroup.LayoutParams(point.x / 4, (int) KL2.LIZJ(this.LJLJJI, 110.0f)));
                    C0AX.LIZ(parent, LJLZ.itemView, R.id.lj7);
                    View view = LJLZ.itemView;
                    if (view != null) {
                        view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                    }
                    try {
                        if (LJLZ.itemView.getParent() != null) {
                            boolean z = true;
                            try {
                                SettingsManager.LIZLLL().getClass();
                                z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                            } catch (Exception unused) {
                            }
                            if (z) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(LJLZ.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(parent.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C78983UzD.LJIILL(stringBuffer.toString());
                                ViewGroup viewGroup = (ViewGroup) LJLZ.itemView.getParent();
                                if (viewGroup != null) {
                                    C16880lQ.LJLLL(LJLZ.itemView, viewGroup);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C78946Uyc.LIZIZ(e);
                        C36922EeM.LIZ(e);
                    }
                    C29127Bbv.LIZ = LJLZ.getClass().getName();
                    return LJLZ;
                }
            };
        } else {
            final Context context2 = this.context;
            this.LJLJLLL = new AbstractC32682CsA(context2, this) { // from class: X.5Wl
                @Override // X.AbstractC029409q
                public final AbstractC32677Cs5 onCreateViewHolder(ViewGroup parent, int i) {
                    o.LJIIIZ(parent, "parent");
                    AbstractC32677Cs5 LJLZ = super.LJLZ(i, parent);
                    LJLZ.itemView.setLayoutParams(new ViewGroup.LayoutParams((int) KL2.LIZJ(this.LJLJJI, 91.0f), (int) KL2.LIZJ(this.LJLJJI, 110.0f)));
                    C0AX.LIZ(parent, LJLZ.itemView, R.id.lj7);
                    View view = LJLZ.itemView;
                    if (view != null) {
                        view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                    }
                    try {
                        if (LJLZ.itemView.getParent() != null) {
                            boolean z = true;
                            try {
                                SettingsManager.LIZLLL().getClass();
                                z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                            } catch (Exception unused) {
                            }
                            if (z) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(LJLZ.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(parent.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C78983UzD.LJIILL(stringBuffer.toString());
                                ViewGroup viewGroup = (ViewGroup) LJLZ.itemView.getParent();
                                if (viewGroup != null) {
                                    C16880lQ.LJLLL(LJLZ.itemView, viewGroup);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C78946Uyc.LIZIZ(e);
                        C36922EeM.LIZ(e);
                    }
                    C29127Bbv.LIZ = LJLZ.getClass().getName();
                    return LJLZ;
                }
            };
        }
        this.LJLJLLL.LJLJLLL = this.dataChannel;
        C32136CjM c32136CjM = this.LJLL;
        if (c32136CjM != null && c32136CjM.LJI.getValue() != null) {
            this.LJLJLLL.LJLJJLL = this.LJLL.LJI.getValue().longValue();
        }
        AbstractC32682CsA abstractC32682CsA = this.LJLJLLL;
        abstractC32682CsA.LJLL = new C32789Ctt(this);
        this.LJLIL.setAdapter(abstractC32682CsA);
        this.LJLIL.setItemAnimator(null);
        AbstractC32682CsA abstractC32682CsA2 = this.LJLJLLL;
        abstractC32682CsA2.LJLJJL = this;
        abstractC32682CsA2.LJLJLJ = this.LJLLILLLL;
        GiftSSGridLayoutManager giftSSGridLayoutManager = new GiftSSGridLayoutManager(new ARunnableS13S0101000_9(1, this, 6));
        giftSSGridLayoutManager.LLFZ = true;
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(giftSSGridLayoutManager);
            this.LJLIL.setHasFixedSize(true);
            this.LJLIL.setItemViewCacheSize(16);
            this.LJLIL.setClipChildren(false);
            this.LJLIL.LJIIJJI(new IDrS45S0100000_5(this, 8));
        }
        C88207Yjb.LJ(this.LJLIL);
        C80091Vbz c80091Vbz = new C80091Vbz(this);
        if (c80091Vbz.LIZJ > 0) {
            int i = 2;
            c80091Vbz.LIZJ = 2;
            if (c80091Vbz.LIZLLL > 0) {
                c80091Vbz.LIZLLL = 4;
                RecyclerView recyclerView3 = this.LJLIL;
                RecyclerView recyclerView4 = c80091Vbz.LIZ;
                if (recyclerView4 != recyclerView3) {
                    if (recyclerView4 != null) {
                        recyclerView4.LJJLL(c80091Vbz.LIZIZ);
                        c80091Vbz.LIZ.setOnFlingListener(null);
                    }
                    c80091Vbz.LIZ = recyclerView3;
                    if (recyclerView3 != null) {
                        if (recyclerView3.getOnFlingListener() == null) {
                            c80091Vbz.LIZ.LJIIJJI(c80091Vbz.LIZIZ);
                            c80091Vbz.LIZ.setOnFlingListener(c80091Vbz);
                            new Scroller(c80091Vbz.LIZ.getContext(), new DecelerateInterpolator());
                            c80091Vbz.LIZJ();
                        } else {
                            throw new IllegalStateException("An instance of OnFlingListener already set.");
                        }
                    }
                }
                this.LJLIL.LJIIJJI(new IDrS45S0100000_5(this, 9));
                C32136CjM c32136CjM2 = this.LJLL;
                if (c32136CjM2 != null) {
                    c32136CjM2.LIZIZ.observe(this, new AObserverS60S0101000_5(2, this, 0));
                }
                this.dataChannel.lv0(this, CancelAllAnimationEvent.class, new AObjectS42S0101000_5(0, this, 62));
                C32502CpG.LJ(this, this.LJLIL, this.dataChannel, new C82555Wad(i, this));
                return;
            }
            throw new IllegalArgumentException("column must be greater than zero");
        }
        throw new IllegalArgumentException("row must be greater than zero");
    }

    public final void LJZI(int i) {
        int i2 = i / 8;
        if (i2 < 0 || i2 >= this.LJLJJL) {
            return;
        }
        if (i2 != this.LJLLLL) {
            this.LJLLLL = i2;
            C88137YiT.LIZ.LIZ = false;
        }
        this.dataChannel.pv0(CancelAllAnimationEvent.class);
        C32700CsS c32700CsS = C32781Ctl.LIZ;
        if (c32700CsS.LIZLLL != i2) {
            c32700CsS.LIZLLL();
        }
        C32137CjN c32137CjN = new C32137CjN();
        c32137CjN.LIZIZ = i2;
        c32137CjN.LIZ = this.LJLJJL;
        this.LJLL.LJFF.setValue(c32137CjN);
        if (this.LJZ && 5 != this.LJLL.LIZIZ.getValue().intValue()) {
            C32129CjF.LIZ.LJIIIIZZ = this.LJLL.LIZIZ.getValue().intValue();
            C32785Ctp.LJIILIIL.LJIILLIIL(c32137CjN.LIZIZ, this.LLFF, this.LLFFF, false, this.LJLLL);
        }
        C32783Ctn.LIZ.LJII(i2);
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.List, X.CsQ] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final void LJZ(Integer num, List list) {
        MutableLiveData<Integer> mutableLiveData;
        int i;
        long j;
        int i2;
        boolean z;
        ?? r1;
        boolean z2;
        int i3;
        int size;
        Long l;
        Integer num2;
        String str;
        Gift gift;
        Gift gift2;
        Gift gift3;
        int i4;
        String str2;
        String str3;
        int i5;
        User owner;
        int i6;
        long j2;
        Gift gift4;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList2;
        Gift LJI;
        C32136CjM c32136CjM = this.LJLL;
        if (c32136CjM == null || (mutableLiveData = c32136CjM.LIZIZ) == null || mutableLiveData.getValue() == null) {
            return;
        }
        if ((!this.LJLL.LIZIZ.getValue().equals(num) && this.LJLZ) || list == null || list.isEmpty()) {
            return;
        }
        int i7 = 1;
        if (!this.LJLZ) {
            this.LJLZ = true;
        }
        int i8 = 0;
        int i9 = 0;
        while (i9 < list.size()) {
            GiftPage giftPage = (GiftPage) ListProtector.get(list, i9);
            if (giftPage.pageType == num.intValue()) {
                LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList3 = new LinkedList<>();
                for (Gift gift5 : giftPage.gifts) {
                    if (gift5.type == 3) {
                        linkedList3.addLast(new C32732Csy(gift5));
                    } else if (!gift5.isBoxGift) {
                        linkedList3.addLast(new C32739Ct5(gift5));
                    }
                }
                this.LLFII = this.LJLL.LIZIZ.getValue().intValue();
                this.LJLLJ = linkedList3;
                this.LLFFF = giftPage;
                this.LLFF = i9;
                if (giftPage.pageType != 5) {
                    C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                    List<Gift> list2 = giftPage.gifts;
                    if (list2 != null) {
                        c32785Ctp.LIZLLL = list2;
                    } else {
                        c32785Ctp.getClass();
                    }
                }
                if (this.LLFII == i7) {
                    C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
                    if (c32313CmD.LJIIIZ() && (LJI = c32313CmD.LJI()) != null) {
                        linkedList3.addFirst(new C32740Ct6(LJI));
                    }
                }
                C32683CsB c32683CsB = C32783Ctn.LIZ;
                c32683CsB.LJIIIIZZ(num.intValue(), linkedList3);
                if (this.LJLJLLL == null) {
                    this.LLIIIJ = i8;
                } else {
                    this.LLIIIJ = i7;
                    if (LiveGiftPanelManualSortSetting.INSTANCE.isEnable() && this.LLFII == i7 && this.LJLL.LJIIIIZZ.getValue() != null) {
                        C32738Ct4.LIZ(linkedList3, this.LJLL.LJIIIIZZ.getValue(), new LinkedList());
                    }
                    C78110Ul8.LIZ.getClass();
                    GiftManager.inst().updatePanelList(linkedList3);
                    if (linkedList3.size() > 0) {
                        i = ((linkedList3.size() - i7) / 8) + 1;
                    } else {
                        i = 0;
                    }
                    this.LJLJJL = i;
                    this.LJLJLLL.LJZ(linkedList3);
                    if (this.LJZ) {
                        AbstractC32682CsA abstractC32682CsA = this.LJLJLLL;
                        if (abstractC32682CsA.LJLLLLLL(abstractC32682CsA.LJLJLJ) == -1 && (linkedList2 = this.LJLLJ) != null && !linkedList2.isEmpty()) {
                            this.LJLJLLL.LJLJLJ = this.LJLLJ.get(i8).LIZJ();
                            RecyclerView recyclerView = this.LJLIL;
                            if (recyclerView != null) {
                                recyclerView.postDelayed(new IDRunnableS6S0101000(2, this, 36), 50L);
                            }
                        } else {
                            AbstractC32682CsA abstractC32682CsA2 = this.LJLJLLL;
                            int LJLLLLLL = ((abstractC32682CsA2.LJLLLLLL(abstractC32682CsA2.LJLJLJ) / 8) * 8) + 7;
                            RecyclerView recyclerView2 = this.LJLIL;
                            if (recyclerView2 != null) {
                                recyclerView2.postDelayed(new ARunnableS9S0101000_5(this, LJLLLLLL, 16), 50L);
                            }
                            C32137CjN c32137CjN = new C32137CjN();
                            c32137CjN.LIZ = this.LJLJJL;
                            AbstractC32682CsA abstractC32682CsA3 = this.LJLJLLL;
                            c32137CjN.LIZIZ = abstractC32682CsA3.LJLLLLLL(abstractC32682CsA3.LJLJLJ) / 8;
                            this.LJLL.LJFF.setValue(c32137CjN);
                            c32683CsB.LJII(c32137CjN.LIZIZ);
                        }
                    } else {
                        long LIZ = C32778Cti.LIZ(this.context);
                        if (this.LJLL.LJI.getValue() != null) {
                            j = this.LJLL.LJI.getValue().longValue();
                        } else {
                            j = 0;
                        }
                        int i10 = this.LLFFF.pageType;
                        Context context = this.context;
                        if (context == null) {
                            i2 = -1;
                        } else {
                            i2 = F9J.LIZIZ(context, i8, "gift_dialog_storage").getInt("sp_gift_page_type", -1);
                        }
                        if (i10 != i2 && !this.LJLLJ.isEmpty()) {
                            LIZ = this.LJLLJ.get(i8).LIZJ();
                        }
                        C32313CmD c32313CmD2 = AbstractC32320CmK.LIZ;
                        if (c32313CmD2.LJIIIZ()) {
                            LIZ = c32313CmD2.LJII();
                            if (LiveGiftFirstRechargeOptimizedSetting.INSTANCE.inExp2() && !c32313CmD2.LJIIJ() && (C32314CmE.LIZIZ() > 0 || C32314CmE.LIZ())) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= linkedList3.size()) {
                                        break;
                                    }
                                    if (linkedList3.get(i11) instanceof C32740Ct6) {
                                        int i12 = i11 + 1;
                                        if (i12 < linkedList3.size()) {
                                            LIZ = linkedList3.get(i12).LIZJ();
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        if (j != 0) {
                            LIZ = j;
                        }
                        C32137CjN c32137CjN2 = new C32137CjN();
                        c32137CjN2.LIZIZ = i8;
                        c32137CjN2.LIZ = this.LJLJJL;
                        this.LJLL.LJFF.setValue(c32137CjN2);
                        C32683CsB c32683CsB2 = C32783Ctn.LIZ;
                        c32683CsB2.LJII(i8);
                        if (this.LJLJLLL.LJLLLLLL(LIZ) != -1 && !this.LLD) {
                            int LJLLLLLL2 = ((this.LJLJLLL.LJLLLLLL(LIZ) / 8) * 8) + 7;
                            RecyclerView recyclerView3 = this.LJLIL;
                            if (recyclerView3 != null) {
                                recyclerView3.postDelayed(new ARunnableS9S0101000_5(this, LJLLLLLL2, 17), 50L);
                            }
                            c32137CjN2.LIZ = this.LJLJJL;
                            c32137CjN2.LIZIZ = this.LJLJLLL.LJLLLLLL(LIZ) / 8;
                            this.LJLL.LJFF.setValue(c32137CjN2);
                            c32683CsB2.LJII(c32137CjN2.LIZIZ);
                        } else {
                            this.LJLIL.LJLI(i8);
                        }
                        if (this.LJLJLLL.LJLLLLLL(LIZ) == -1 && (linkedList = this.LJLLJ) != null && !linkedList.isEmpty()) {
                            if (j == 0) {
                                this.LJLJLLL.LJLJLJ = this.LJLLJ.get(i8).LIZJ();
                                LIZ = this.LJLLJ.get(i8).LIZJ();
                            } else if (this.LL) {
                                C0NB.LIZLLL("This gift is currently unavailable");
                            }
                        } else {
                            this.LJLJLLL.LJLJLJ = LIZ;
                        }
                        this.LJLJLLL.LJLJJLL = LIZ;
                        if (!this.LJZL) {
                            this.LJZL = true;
                            C32785Ctp c32785Ctp2 = C32785Ctp.LJIILIIL;
                            int i13 = c32137CjN2.LIZIZ;
                            if (this.LJLJL == EnumC35487DwJ.GUEST) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i14 = this.LLFF;
                            GiftPage giftPage2 = this.LLFFF;
                            String str4 = this.LJLLL;
                            Integer value = this.LJLL.LIZIZ.getValue();
                            c32785Ctp2.getClass();
                            o.LJIIIZ(giftPage2, "giftPage");
                            c32785Ctp2.LJI = str4;
                            c32785Ctp2.LJFF = C30725C4b.LIZ();
                            String LJFF = C32785Ctp.LJFF(String.valueOf(C30725C4b.LIZ() + ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                            if (!o.LJ(c32785Ctp2.LIZ, LJFF)) {
                                c32785Ctp2.LIZ = LJFF;
                                c32785Ctp2.LIZJ = i13;
                                c32785Ctp2.LIZIZ = i13;
                                c32785Ctp2.LJ = z2;
                                C32128CjE c32128CjE = C32129CjF.LIZ;
                                if (value != null) {
                                    i3 = value.intValue();
                                } else {
                                    i3 = 1;
                                }
                                c32128CjE.LJIIIIZZ = i3;
                                if (giftPage2.gifts.size() < 9) {
                                    size = giftPage2.gifts.size();
                                } else if (giftPage2.gifts.size() > c32785Ctp2.LIZJ * 8) {
                                    size = 8;
                                } else {
                                    size = giftPage2.gifts.size() - (c32785Ctp2.LIZJ * 8);
                                }
                                for (int i15 = 0; i15 < size; i15++) {
                                    List<? extends Gift> list3 = c32785Ctp2.LIZLLL;
                                    if (list3 != null && (gift3 = (Gift) ListProtector.get(list3, i15)) != null) {
                                        l = Long.valueOf(gift3.id);
                                    } else {
                                        l = null;
                                    }
                                    List<? extends Gift> list4 = c32785Ctp2.LIZLLL;
                                    if (list4 != null && (gift2 = (Gift) ListProtector.get(list4, i15)) != null) {
                                        num2 = Integer.valueOf(gift2.diamondCount);
                                    } else {
                                        num2 = null;
                                    }
                                    List<? extends Gift> list5 = c32785Ctp2.LIZLLL;
                                    if (list5 != null && (gift = (Gift) ListProtector.get(list5, i15)) != null) {
                                        str = gift.recommendInfo;
                                    } else {
                                        str = null;
                                    }
                                    c32785Ctp2.LJIILJJIL(i15, i14, giftPage2, l, num2, str);
                                }
                            }
                            C32785Ctp c32785Ctp3 = C32785Ctp.LJIILIIL;
                            int i16 = c32137CjN2.LIZIZ;
                            int i17 = this.LLFF;
                            GiftPage giftPage3 = this.LLFFF;
                            String str5 = this.LJLLL;
                            c32785Ctp3.getClass();
                            o.LJIIIZ(giftPage3, "giftPage");
                            JSONObject jSONObject = new JSONObject();
                            if (giftPage3.gifts.size() < 9) {
                                i4 = giftPage3.gifts.size();
                            } else if (giftPage3.gifts.size() > c32785Ctp3.LIZJ * 8 && giftPage3.gifts.size() < (c32785Ctp3.LIZJ + 1) * 8) {
                                i4 = giftPage3.gifts.size() - (c32785Ctp3.LIZJ * 8);
                            } else {
                                i4 = 8;
                            }
                            for (int i18 = 0; i18 < i4; i18++) {
                                int i19 = (c32785Ctp3.LIZJ * 8) + i18;
                                List<? extends Gift> list6 = c32785Ctp3.LIZLLL;
                                if (list6 != null) {
                                    i6 = list6.size();
                                } else {
                                    i6 = 0;
                                }
                                if (i6 > i19) {
                                    List<? extends Gift> list7 = c32785Ctp3.LIZLLL;
                                    if (list7 != null && (gift4 = (Gift) ListProtector.get(list7, i19)) != null) {
                                        j2 = gift4.id;
                                    } else {
                                        j2 = 0;
                                    }
                                    jSONObject.put(String.valueOf(j2), i18 + 1);
                                }
                            }
                            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                            BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_pages_show");
                            LIZ2.LJIIZILJ();
                            LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
                            LIZ2.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
                            LIZ2.LJIJJ(giftPage3.pageName, "tab_name");
                            LIZ2.LJIJJ(Integer.valueOf(giftPage3.pageType), "tab_id");
                            LIZ2.LJIJJ(Integer.valueOf(i17 + 1), "tab_position");
                            LIZ2.LJIJJ(Integer.valueOf(c32785Ctp3.LIZIZ + 1), "from_page");
                            LIZ2.LJIJJ(jSONObject.toString(), "gift_seen");
                            if (o.LJ(C31120CJg.LIZIZ(), "manual_pk")) {
                                if (C31120CJg.LJIIIZ()) {
                                    LIZ2.LJIJJ("pk_phase", "match_status");
                                } else {
                                    LIZ2.LJIJJ("punish", "match_status");
                                }
                                LIZ2.LJJIFFI(C31120CJg.LJFF());
                            }
                            if (C88137YiT.LIZ.LIZ) {
                                str2 = "first_screen";
                            } else {
                                str2 = "other_screen";
                            }
                            LIZ2.LJIJJ(str2, "is_first_screen");
                            LIZ2.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
                            int i20 = i16 + 1;
                            LIZ2.LJIJJ(Integer.valueOf(i20), "page_position");
                            LIZ2.LJIJJ(Integer.valueOf(i20), "page");
                            LIZ2.LJIJJ(str5, "gift_enter_from");
                            String str6 = C32785Ctp.LJIILJJIL;
                            if (C32785Ctp.LJI()) {
                                str3 = "1";
                            } else {
                                str3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            LIZ2.LJIJJ(str3, str6);
                            LIZ2.LJIJJ(str5, "event_module");
                            if (room != null && (owner = room.getOwner()) != null && owner.isSubscribed()) {
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                            LIZ2.LJIJJ(Integer.valueOf(i5), "is_subscription");
                            LIZ2.LJJIFFI(C32129CjF.LIZ.LJIILJJIL);
                            LIZ2.LJJIIJZLJL();
                            this.LJLLLL = c32137CjN2.LIZIZ;
                        } else if (!this.LLFZ) {
                            this.LLFZ = true;
                            C32129CjF.LIZ.LJIIIIZZ = this.LJLL.LIZIZ.getValue().intValue();
                            C88137YiT.LIZ.LIZ = false;
                            C32785Ctp.LJIILIIL.LJIILLIIL(c32137CjN2.LIZIZ, this.LLFF, this.LLFFF, true, this.LJLLL);
                        }
                        if ("gift_panel".equals(this.LJLLL) && this.LL) {
                            z = false;
                            this.LL = false;
                        } else {
                            z = false;
                        }
                        r1 = 0;
                        Map<Long, C32830CuY> LIZ3 = C32792Ctw.LIZ(giftPage, linkedList3, r1, z, r1);
                        this.LLF = LIZ3;
                        C32785Ctp.LJIILIIL.LJIIJ = LIZ3;
                        return;
                    }
                }
                r1 = 0;
                z = false;
                Map<Long, C32830CuY> LIZ32 = C32792Ctw.LIZ(giftPage, linkedList3, r1, z, r1);
                this.LLF = LIZ32;
                C32785Ctp.LJIILIIL.LJIIJ = LIZ32;
                return;
            }
            i9++;
            i8 = 0;
            i7 = 1;
        }
    }
}
