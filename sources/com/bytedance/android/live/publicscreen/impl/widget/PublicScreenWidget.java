package com.bytedance.android.live.publicscreen.impl.widget;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.BCN;
import X.BV7;
import X.BZI;
import X.C03150Al;
import X.C06F;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C20780ri;
import X.C28404BCu;
import X.C28733BPl;
import X.C28787BRn;
import X.C28857BUf;
import X.C29306Beo;
import X.C29841BnR;
import X.C30030BqU;
import X.C31255COl;
import X.C31309CQn;
import X.C31319CQx;
import X.C31369CSv;
import X.C31371CSx;
import X.C31372CSy;
import X.C31373CSz;
import X.C31376CTc;
import X.C31393CTt;
import X.C31665Cbl;
import X.C32537Cpp;
import X.C45243HpH;
import X.C47061t0;
import X.C5H3;
import X.C73411SrX;
import X.C73943T0h;
import X.C79864VWa;
import X.C80895Vox;
import X.C80955Vpv;
import X.C87009YCv;
import X.C87010YCw;
import X.C88207Yjb;
import X.CH8;
import X.CHK;
import X.CN1;
import X.CQO;
import X.CQQ;
import X.CR1;
import X.CR5;
import X.CR6;
import X.CR8;
import X.CRA;
import X.CRD;
import X.CRK;
import X.CRX;
import X.CSD;
import X.CSE;
import X.CSF;
import X.CSQ;
import X.CSR;
import X.CT0;
import X.CT2;
import X.CT4;
import X.CT6;
import X.CT7;
import X.CTB;
import X.CY3;
import X.EnumC80901Vp3;
import X.InterfaceC31337CRp;
import X.InterfaceC31781Cdd;
import X.KL2;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS21S0101000_2;
import Y.ACListenerS25S0100000_5;
import Y.ALAdapterS4S0100000_5;
import Y.AObjectS134S0100000_5;
import Y.AObjectS144S0100000_5;
import Y.AObjectS42S0101000_5;
import Y.AObjectS50S0101000_5;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS9S0101000_5;
import Y.AfS36S0101000_5;
import Y.IDRunnableS6S0101000;
import Y.IDTListenerS115S0100000_5;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.PublicScreenLoadedEvent;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.live.publicscreen.api.WidgetReadyEvent;
import com.bytedance.android.livesdk.chatroom.behavior.ScrollHeaderBehavior;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.DoSendMessageChannelEvent;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecyclePublicScreenWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePublicScreenRequestLayoutOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveHotDegradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAnimOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDebugEnabledSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenUpdateOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSdkPublicScreenMessageScheduleStrategySetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.ReportHeightRatioSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.message.RichChatMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.watch.FollowGuideBottomCardShow;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS105S0101000_5;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS16S0102000_5;
import kotlin.jvm.internal.AqS68S0201000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class PublicScreenWidget extends IPublicScreenHolderWidget implements CRA {
    public C79864VWa LJLIL;
    public CY3 LJLILLLLZI;
    public View LJLJI;
    public ObjectAnimator LJLJJI;
    public ObjectAnimator LJLJJL;
    public ObjectAnimator LJLJJLL;
    public FrameLayout LJLJL;
    public C31372CSy LJLJLJ;
    public View LJLJLLL;
    public C31319CQx LJLLI;
    public C80955Vpv LJLZ;
    public boolean LJZ;
    public C73411SrX LJZI;
    public String LJZL;
    public C30030BqU LL;
    public Room LLD;
    public boolean LLFF;
    public boolean LLFFF;
    public CRD LLI;
    public CSR<CQO<? extends CR6>, CSE<CQO<? extends CR6>>> LLIFFJFJJ;
    public CSE<CQO<? extends CR6>> LLII;
    public C31371CSx LLIIII;
    public C80895Vox LLIIIILZ;
    public AbstractC28931Bp LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public final boolean LJLL = LivePublicScreenDebugEnabledSetting.INSTANCE.getValue();
    public CT0 LJLLILLLL = CT0.NORMAL;
    public int LJLLJ = 0;
    public int LJLLL = 0;
    public boolean LJLLLL = false;
    public boolean LJLLLLLL = false;
    public final Handler LLF = new Handler(C16880lQ.LLJJJJ());
    public boolean LLFII = false;
    public final boolean LLFZ = LiveLikeOptSetting.INSTANCE.isOtherTextViewWidthOpt();

    public void LJZI() {
    }

    public /* synthetic */ boolean LLIIII() {
        return false;
    }

    public void LLIILZL(MotionEvent motionEvent, View view) {
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dc8;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private void LLIL() {
        CSE<CQO<? extends CR6>> cse;
        View view;
        if (this.LJLLILLLL == CT0.NORMAL && (cse = this.LLII) != null && (view = cse.itemView) != null) {
            view.setTranslationY(-view.getHeight());
        }
    }

    @Override // X.CRA
    public final void LJ() {
        C31255COl c31255COl = this.LLIIII.LIZ;
        if (c31255COl != null) {
            c31255COl.LJLJJI();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget
    public final CQQ LJLZ() {
        return this.LJLLI.LLIILZL;
    }

    public final void LJZL() {
        CSE<CQO<? extends CR6>> cse;
        CRD crd;
        CRD crd2 = this.LLI;
        if (crd2 != null && (crd = (cse = this.LLII).LJLJI) != crd2) {
            this.LLIFFJFJJ.LIZIZ(cse, crd2, Collections.emptyList());
            if (crd != null) {
                crd.LJII(false);
            }
            this.LLI.onAttach();
        }
    }

    public void LLFFF() {
        boolean z;
        Room room = this.LLD;
        if (room != null) {
            if (room.getStreamType() == LiveMode.THIRD_PARTY) {
                z = true;
            } else {
                z = false;
            }
            this.LJLLLLLL = z;
        }
        registerRxBus(C31376CTc.class);
        registerRxBus(BV7.class);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.lv0(this, PreShowKeyboardEvent.class, new AObjectS42S0101000_5(2, this, 48));
        dataChannel.lv0(this, FollowGuideBottomCardShow.class, new AObjectS42S0101000_5(1, this, 21));
        dataChannel.ov0(this, PublicScreenShrinkChannel.class, new AObjectS42S0101000_5(2, this, 49));
    }

    public void LLFII() {
        SmoothLinearLayoutManager smoothLinearLayoutManager;
        C31371CSx c31371CSx = this.LLIIII;
        CT6 ct6 = new CT6();
        c31371CSx.LIZJ = ct6;
        C31255COl c31255COl = c31371CSx.LIZ;
        if (c31255COl != null) {
            c31255COl.setAdapter(ct6);
        }
        C31371CSx c31371CSx2 = this.LLIIII;
        SmoothLinearLayoutManager smoothLinearLayoutManager2 = new SmoothLinearLayoutManager();
        c31371CSx2.LIZLLL = smoothLinearLayoutManager2;
        C31255COl c31255COl2 = c31371CSx2.LIZ;
        if (c31255COl2 != null) {
            c31255COl2.setLayoutManager(smoothLinearLayoutManager2);
        }
        if (C31319CQx.LJJLI(Boolean.TRUE.equals(this.dataChannel.kv0(UserIsAnchorChannel.class))).foldMessageScrollType != 0 && (smoothLinearLayoutManager = this.LLIIII.LIZLLL) != null) {
            smoothLinearLayoutManager.LLJJIJIIJIL(true);
        }
        C31371CSx c31371CSx3 = this.LLIIII;
        SmoothLinearLayoutManager smoothLinearLayoutManager3 = c31371CSx3.LIZLLL;
        if (smoothLinearLayoutManager3 != null) {
            smoothLinearLayoutManager3.LLIIIJ = 1.0f;
            smoothLinearLayoutManager3.LLFZ = true;
            smoothLinearLayoutManager3.LLIIIL = true;
        }
        CTB ctb = new CTB((int) KL2.LIZJ(this.context, 0.0f));
        C31255COl c31255COl3 = c31371CSx3.LIZ;
        if (c31255COl3 != null) {
            c31255COl3.LJII(ctb, -1);
        }
        C31255COl c31255COl4 = this.LLIIII.LIZ;
        if (c31255COl4 != null) {
            c31255COl4.setHasFixedSize(true);
        }
    }

    public final void LLFZ() {
        if (this.LJLJJI == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            this.LJLJJI = ofFloat;
            ofFloat.setDuration(240L);
            this.LJLJJI.addListener(new ALAdapterS4S0100000_5(this, 17));
        }
    }

    public final boolean LLII() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && C31319CQx.LJJLI(Boolean.TRUE.equals(dataChannel.kv0(UserIsAnchorChannel.class))).LIZIZ()) {
            return true;
        }
        return false;
    }

    public CSR<CQO<? extends CR6>, CSE<CQO<? extends CR6>>> LLIIJI() {
        return new CSQ();
    }

    public void LLIIL() {
        CHK chk;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_public_screen_auto_slide");
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.start();
        }
    }

    public void LLIILII() {
        CHK chk;
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_public_screen_auto_slide");
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.stop();
        }
    }

    public final void LLIIZ() {
        if (this.LJZ) {
            this.LJZ = false;
            C31319CQx c31319CQx = this.LJLLI;
            InterfaceC31337CRp interfaceC31337CRp = c31319CQx.LLILZ;
            if (interfaceC31337CRp != null) {
                c31319CQx.Jz(interfaceC31337CRp, true);
                c31319CQx.LLIIZ.postDelayed(c31319CQx.LLJJL, C31319CQx.LLJLLIL);
            }
            if (!this.LJLLI.LLFZ.isEmpty()) {
                LLIIIJ(true);
            }
        }
    }

    @Override // X.CRA
    public final void Qe() {
        this.LJLZ.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0181, code lost:
    
        if (r1.getLinkMicInfo() != null) goto L64;
     */
    @Override // X.CRA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RC() {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.RC():void");
    }

    @Override // X.CRA
    public final void Vl0() {
        this.LJLZ.setVisibility(8);
    }

    @Override // X.CRA
    public final void Wn0() {
        CSE<CQO<? extends CR6>> cse = this.LLII;
        if (cse != null) {
            cse.itemView.setVisibility(8);
        }
    }

    @Override // X.CRA
    public final void ad() {
        float f = 1;
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.LLIIII.LIZLLL;
        if (smoothLinearLayoutManager != null) {
            smoothLinearLayoutManager.LLIIIJ = f;
        }
    }

    @Override // X.CRA
    public final void ff0() {
        C31372CSy c31372CSy = this.LJLJLJ;
        if (c31372CSy != null) {
            c31372CSy.setVisibility(8);
            this.LJZL = "";
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(WarningInfoVisibilityEvent.class, Boolean.FALSE);
            }
        }
    }

    @Override // X.CRA
    public final Fragment hs() {
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            return interfaceC31781Cdd.getFragment();
        }
        return null;
    }

    @Override // X.CRA
    public final void n6() {
        this.LJLJLLL.animate().alpha(0.0f).start();
    }

    @Override // X.CRA
    public final void nP() {
        View view = this.LJLJI;
        if (view != null && view.getVisibility() != 8) {
            if (this.LJLJJLL == null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                this.LJLJJLL = ofFloat;
                ofFloat.setDuration(240L);
            }
            if (this.LJLJJLL.isRunning()) {
                return;
            }
            this.LJLJJLL.start();
            this.LJLJI.setEnabled(false);
            C16880lQ.LJLJJLL(this.LJLJJLL);
            this.LJLJJLL.addListener(new ALAdapterS4S0100000_5(this, 19));
            return;
        }
        if (!(!this.LLIIII.LIZ())) {
            LLILII(this.LJLLJ);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
        Handler handler = this.LLF;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LLFII = false;
        LLIIIILZ("onUnload");
        C31319CQx c31319CQx = this.LJLLI;
        if (c31319CQx != null) {
            c31319CQx.detachView();
            ((LinkedList) this.LJLLI.LLFZ).clear();
        }
        C73411SrX c73411SrX = this.LJZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
            this.LJZI = null;
        }
        View view = this.LJLJI;
        if (view != null) {
            view.setVisibility(8);
        }
        ff0();
        this.LLI = null;
        if (EnableRecyclePublicScreenWidgetSetting.INSTANCE.getValue()) {
            this.LJLLILLLL = CT0.NORMAL;
            this.LJLLJ = 0;
            this.LJLLL = 0;
            this.LJLLLL = false;
            this.LJLLLLLL = false;
            Wn0();
            this.LJZ = false;
        }
        this.LLIIIL = 0;
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            this.LL.LIZJ = null;
        }
    }

    @Override // X.CRA
    public final void r00() {
        CSE<CQO<? extends CR6>> cse = this.LLII;
        if (cse != null && cse.itemView.getVisibility() != 0) {
            this.LLII.itemView.setVisibility(0);
        }
    }

    public PublicScreenWidget() {
        new HandlerThread("PublicScreenSchedule", LiveSdkPublicScreenMessageScheduleStrategySetting.getThreadPriority());
        this.LLIIIL = 0;
        this.LLIIIZ = 0;
    }

    public final boolean LLF() {
        DataChannel dataChannel;
        if (LLII() && ((!BadPhonesWatchLiveCommonUIOptSetting.INSTANCE.getRemoveInsertMessageAnimation() && !LiveHotDegradeSetting.INSTANCE.disableMessageAnim() && !this.LLFII) || ((dataChannel = this.dataChannel) != null && Boolean.TRUE.equals(dataChannel.kv0(UserIsAnchorChannel.class))))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C31319CQx c31319CQx = this.LJLLI;
        if (c31319CQx != null) {
            c31319CQx.start(2);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C31319CQx c31319CQx = this.LJLLI;
        if (c31319CQx != null) {
            c31319CQx.e30(2);
        }
    }

    @Override // X.CRA
    public final CT0 v8() {
        return this.LJLLILLLL;
    }

    public static void LJZ(PublicScreenWidget publicScreenWidget) {
        publicScreenWidget.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_new_message_click");
        LIZ.LIZJ("click");
        LIZ.LJIILLIIL(publicScreenWidget.dataChannel);
        LIZ.LJIJJ(C29841BnR.LIZIZ(publicScreenWidget.LLD, publicScreenWidget.dataChannel), "admin_type");
        LIZ.LJIJJ(0, "is_floating");
        LIZ.LJJIIJZLJL();
        if (!publicScreenWidget.isViewValid()) {
            return;
        }
        C31319CQx c31319CQx = publicScreenWidget.LJLLI;
        if (c31319CQx != null) {
            c31319CQx.LJLI();
        }
        publicScreenWidget.LLILL(CT0.NORMAL, true);
        publicScreenWidget.LLIL();
    }

    @Override // X.CRA
    public final void DT(boolean z) {
        C31319CQx c31319CQx = this.LJLLI;
        if (c31319CQx == null || c31319CQx.LLIILZL == null) {
            return;
        }
        LLILL(CT0.NORMAL, true);
        LLILII(0);
        if (LLII()) {
            int LJ = this.LLIIII.LJ() - 1;
            C31371CSx c31371CSx = this.LLIIII;
            c31371CSx.getClass();
            c31371CSx.LIZIZ(new AqS105S0101000_5(c31371CSx, LJ, 3));
            this.LJLLL = LJ;
            C31371CSx c31371CSx2 = this.LLIIII;
            IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(1, this, 19);
            C31255COl c31255COl = c31371CSx2.LIZ;
            if (c31255COl != null) {
                c31255COl.post(iDRunnableS6S0101000);
            }
        } else {
            if (z) {
                SmoothLinearLayoutManager smoothLinearLayoutManager = this.LLIIII.LIZLLL;
                if (smoothLinearLayoutManager != null) {
                    smoothLinearLayoutManager.LLIIIJ = 1.0f;
                }
            } else {
                C31371CSx c31371CSx3 = this.LLIIII;
                float f = C31319CQx.LJJLI(this.LJLLI.LLIILZL.LJFF).msPerInch;
                SmoothLinearLayoutManager smoothLinearLayoutManager2 = c31371CSx3.LIZLLL;
                if (smoothLinearLayoutManager2 != null) {
                    smoothLinearLayoutManager2.LLIIIJ = f;
                }
            }
            xd0(this.LLIIII.LJ() - 1);
        }
        LLIL();
    }

    @Override // X.CRA
    public final void Gx(boolean z) {
        C80895Vox c80895Vox = this.LLIIIILZ;
        if (c80895Vox != null) {
            c80895Vox.LJI(false, z);
            C31319CQx c31319CQx = this.LJLLI;
            if (c31319CQx.LJZL.LIZIZ() && !c31319CQx.LLFII) {
                return;
            }
            this.LLIIIILZ.setScrollMode(CT4.NONE);
            this.LLIIIILZ.setOverScrollMode(EnumC80901Vp3.NONE);
        }
    }

    @Override // X.CRA
    public final void J30(CRD crd) {
        LLIIIL(crd);
    }

    public final void LL(int i) {
        int count = LivePublicScreenUpdateOptSetting.getCount(this.dataChannel);
        if (count <= 0 || this.LLIIIZ == 0 || !this.LLIIII.LIZIZ) {
            return;
        }
        this.LLIIIL += i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("msg count：");
        LIZ.append(this.LLIIIL);
        LIZ.append("--isExtendScreen：");
        LIZ.append(LLIIII());
        C0NB.LJ("PublicScreenOpt", X1D.LIZIZ(LIZ));
        if (this.LLIIIL < count) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("unbind--isExtendScreen：");
        LIZ2.append(LLIIII());
        C0NB.LJ("PublicScreenOpt", X1D.LIZIZ(LIZ2));
        C31319CQx c31319CQx = this.LJLLI;
        CR1<CRD> cr1 = c31319CQx.LJZI;
        cr1.getClass();
        CR1<CRD> cr12 = new CR1<>(cr1.LIZ);
        cr12.LIZIZ.addAll(cr1.LIZIZ);
        cr12.LIZJ.addAll(cr1.LIZJ);
        cr12.LJFF.addAll(cr1.LJFF);
        cr12.LJI = cr1.LJI;
        c31319CQx.LJZI = cr12;
        this.LLIIII.LIZIZ = false;
    }

    public final void LLFF(View view) {
        ScrollHeaderBehavior scrollHeaderBehavior = (ScrollHeaderBehavior) ((C06F) this.LLIIII.LIZ.getLayoutParams()).LIZ;
        if (scrollHeaderBehavior != null) {
            scrollHeaderBehavior.LIZ = new AObjectS144S0100000_5(this, 5);
        }
        SuctionBottomBehavior suctionBottomBehavior = (SuctionBottomBehavior) ((C06F) view.getLayoutParams()).LIZ;
        if (suctionBottomBehavior != null) {
            suctionBottomBehavior.LJFF = true;
            suctionBottomBehavior.LIZIZ = true;
            if (C31319CQx.LJJLI(this.LJLLI.LLIILZL.LJFF).foldMessageScrollType == 1) {
                suctionBottomBehavior.LJ = true;
            } else {
                if (C31319CQx.LJJLI(this.LJLLI.LLIILZL.LJFF).foldMessageScrollType != 2) {
                    return;
                }
                suctionBottomBehavior.LJ = false;
            }
        }
    }

    public final void LLIIIILZ(String str) {
        String str2;
        HashMap LIZ = C45243HpH.LIZ("event_name", "TEXT_MESSAGE_WIDGET_STATUS", "reason", str);
        if (isShowing()) {
            str2 = "visible";
        } else {
            str2 = "gone";
        }
        LIZ.put("view_status", str2);
        C28733BPl.LJIILIIL().LIZIZ("ttlive_msg", LIZ);
    }

    public final void LLIIIJ(boolean z) {
        int i;
        RecyclerView.ViewHolder viewHolder;
        if (!this.LJLLI.LLFZ.isEmpty()) {
            SmoothLinearLayoutManager smoothLinearLayoutManager = this.LLIIII.LIZLLL;
            if (smoothLinearLayoutManager != null) {
                i = smoothLinearLayoutManager.LLILLIZIL();
            } else {
                i = 0;
            }
            ArrayList arrayList = new ArrayList();
            for (int LIZLLL = this.LLIIII.LIZLLL(); LIZLLL <= i; LIZLLL++) {
                C31255COl c31255COl = this.LLIIII.LIZ;
                if (c31255COl != null) {
                    viewHolder = c31255COl.LJJIZ(LIZLLL);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof CSD) {
                    InterfaceC31337CRp interfaceC31337CRp = ((CSF) viewHolder).LJLJI;
                    if (interfaceC31337CRp instanceof InterfaceC31337CRp) {
                        if (z && !interfaceC31337CRp.LJJLJLI().LIZ) {
                            C31371CSx c31371CSx = this.LLIIII;
                            C31393CTt c31393CTt = new C31393CTt(true);
                            c31371CSx.getClass();
                            c31371CSx.LIZIZ(new AqS68S0201000_5(c31371CSx, LIZLLL, c31393CTt, 2));
                        } else {
                            this.LJLLI.LJJIJ(interfaceC31337CRp);
                        }
                        if (interfaceC31337CRp.LJJJJZI() != null) {
                            arrayList.add(interfaceC31337CRp);
                            ((LinkedList) this.LJLLI.LLFZ).remove(interfaceC31337CRp);
                        }
                    }
                }
            }
            this.LJLLI.LJIILJJIL(arrayList);
        }
    }

    public final void LLIIIL(CRD model) {
        SuctionBottomBehavior suctionBottomBehavior;
        if (model instanceof CQO) {
            CRD crd = this.LLII.LJLJI;
            if (crd != null && crd != model) {
                crd.dispose();
            }
            if (this.LLIIII.LIZIZ) {
                if (this.LLII.itemView.getTranslationY() != 0.0f || this.LLII.itemView.getVisibility() != 0) {
                    this.LLIFFJFJJ.LIZIZ(this.LLII, model, Collections.emptyList());
                    if (crd != null && crd != model) {
                        crd.LJII(false);
                    }
                    model.onAttach();
                    this.LLI = null;
                } else {
                    CR5 cr5 = this.LJLLI.LJLIL;
                    cr5.getClass();
                    o.LJIIIZ(model, "model");
                    if (!cr5.LJI) {
                        Iterator it = ((ArrayList) cr5.LIZLLL).iterator();
                        while (it.hasNext()) {
                            ((CR8) it.next()).LIZJ(model);
                        }
                    }
                    this.LLI = model;
                }
            } else {
                this.LLI = model;
            }
        }
        if (this.LJLLILLLL == CT0.FOCUS && (suctionBottomBehavior = (SuctionBottomBehavior) ((C06F) this.LJLJL.getLayoutParams()).LIZ) != null) {
            suctionBottomBehavior.LJFF = false;
        }
        if (this.LLII.itemView.getVisibility() != 0) {
            this.LLII.itemView.setVisibility(0);
        }
    }

    public final void LLILII(int i) {
        String str;
        if (!isViewValid()) {
            return;
        }
        if (CT0.NORMAL == this.LJLLILLLL || i <= 0) {
            if (this.LJLILLLLZI.getVisibility() != 4) {
                this.dataChannel.rv0(PublicScreenNewMessageVisible.class, Boolean.FALSE);
            }
            this.LJLILLLLZI.setVisibility(4);
            this.LJLLJ = 0;
            return;
        }
        this.LJLLJ = i;
        View view = this.LJLJI;
        if (view != null && view.getVisibility() == 0) {
            return;
        }
        if (i < 100) {
            str = String.valueOf(i);
        } else {
            str = "99+";
        }
        if (this.LLFZ) {
            if (str != this.LJLILLLLZI.getText()) {
                this.LJLILLLLZI.LJJJJ(C15380j0.LJIIIIZZ(R.plurals.kg, i, str), str, this.LJLILLLLZI.getPaddingEnd() + this.LJLILLLLZI.getPaddingStart());
            }
        } else {
            this.LJLILLLLZI.setText(C15380j0.LJIIIIZZ(R.plurals.kg, i, str));
        }
        if (this.LJLILLLLZI.getVisibility() != 0) {
            this.LLF.post(new ARunnableS18S0101000_14(0, this, 21));
        }
    }

    public final void LLILIL(CT0 ct0) {
        LLILL(ct0, true);
    }

    @Override // X.CRA
    public final void VM(int i) {
        C31255COl c31255COl;
        C31255COl c31255COl2;
        C31371CSx c31371CSx = this.LLIIII;
        c31371CSx.getClass();
        c31371CSx.LIZIZ(new AqS105S0101000_5(c31371CSx, i, 2));
        if (this.LLFFF) {
            return;
        }
        if (CT0.NORMAL == this.LJLLILLLL || this.LJLLLL) {
            this.LJLLLL = true;
            if (this.LLFF && (c31255COl2 = this.LLIIII.LIZ) != null) {
                c31255COl2.LJLILLLLZI();
            }
            DT(false);
            if (this.LLFF && (c31255COl = this.LLIIII.LIZ) != null) {
                c31255COl.LJLJI(false);
            }
        }
    }

    @Override // X.CRA
    public final void aN(int i) {
        mn(i, 1, false);
    }

    @Override // X.CRA
    public final void e30(int i) {
        this.LLIIIZ = i | this.LLIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("background-- visibility：");
        boolean z = false;
        if (this.LLIIIZ == 0) {
            z = true;
        }
        LIZ.append(z);
        LIZ.append("--isExtendScreen：");
        LIZ.append(LLIIII());
        C0NB.LJ("PublicScreenOpt", X1D.LIZIZ(LIZ));
    }

    @Override // X.CRA
    public final void js(boolean z) {
        C80895Vox c80895Vox = this.LLIIIILZ;
        if (c80895Vox != null) {
            if (z) {
                CT4 scrollMode = c80895Vox.getScrollMode();
                CT4 ct4 = CT4.REFRESH;
                if (scrollMode != ct4) {
                    this.LLIIIILZ.setScrollMode(ct4);
                    this.LLIIIILZ.setOverScrollMode(EnumC80901Vp3.ONLY_TOP);
                    return;
                }
                return;
            }
            CT4 scrollMode2 = this.LLIIIILZ.getScrollMode();
            CT4 ct42 = CT4.NONE;
            if (scrollMode2 == ct42) {
                return;
            }
            this.LLIIIILZ.setScrollMode(ct42);
            this.LLIIIILZ.setOverScrollMode(EnumC80901Vp3.NONE);
        }
    }

    @Override // X.CRA
    public final boolean nn(int i) {
        AbstractC030109x itemAnimator;
        C31371CSx c31371CSx = this.LLIIII;
        if (c31371CSx == null) {
            return false;
        }
        C31255COl c31255COl = c31371CSx.LIZ;
        if (c31255COl != null) {
            c31255COl.LJLJJI();
        }
        C31255COl c31255COl2 = this.LLIIII.LIZ;
        if (c31255COl2 != null && (itemAnimator = c31255COl2.getItemAnimator()) != null) {
            itemAnimator.LJIIJ();
        }
        C31371CSx c31371CSx2 = this.LLIIII;
        ARunnableS9S0101000_5 aRunnableS9S0101000_5 = new ARunnableS9S0101000_5(i, this, 15);
        C31255COl c31255COl3 = c31371CSx2.LIZ;
        if (c31255COl3 != null) {
            c31255COl3.post(aRunnableS9S0101000_5);
        }
        if (i >= this.LLIIII.LIZLLL()) {
            return false;
        }
        return true;
    }

    public void onEvent(C31376CTc c31376CTc) {
        RichChatMessage richChatMessage = c31376CTc.LIZ;
        if (richChatMessage != null && "6".equals(richChatMessage.actionType)) {
            this.dataChannel.qv0(DoSendMessageChannelEvent.class, new C28857BUf(richChatMessage.actionContent));
            C31319CQx c31319CQx = this.LJLLI;
            if (c31319CQx == null || c31319CQx.mView == 0) {
                return;
            }
            for (int i = 0; i < c31319CQx.LJZI.LJII(); i++) {
                CRD LJ = c31319CQx.LJZI.LJ(i);
                if ((LJ instanceof CQO) && richChatMessage == ((CQO) LJ).LJIJJLI) {
                    c31319CQx.LJLIIL(i);
                    ((CRA) c31319CQx.mView).DT(true);
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object... objArr) {
        this.LL = new C30030BqU();
        this.LJLIL = (C79864VWa) findViewById(R.id.gic);
        C80895Vox c80895Vox = (C80895Vox) findViewById(R.id.ito);
        this.LLIIIILZ = c80895Vox;
        c80895Vox.setNestedHeader(new CH8(this.context));
        this.LJLZ = (C80955Vpv) findViewById(R.id.l4q);
        this.LLIIII = new C31371CSx((C31255COl) findViewById(R.id.gib));
        this.LJLILLLLZI = (CY3) findViewById(R.id.gia);
        this.LJLJLJ = (C31372CSy) findViewById(R.id.nh0);
        this.LJLJLLL = findViewById(R.id.e7j);
        this.LLIFFJFJJ = LLIIJI();
        this.LJLJL = (FrameLayout) findViewById(R.id.djk);
        this.LLFF = LivePublicScreenRequestLayoutOptSetting.enableScrollInsertedOpt();
        this.LLFFF = LivePublicScreenRequestLayoutOptSetting.enableScrollUpdatedOpt();
        if (this.LJLL) {
            this.LJLJLLL.setVisibility(0);
            this.LJLJLLL.setAlpha(0.0f);
        } else {
            this.LJLJLLL.setVisibility(8);
        }
        this.LJLZ.setEnableFixedSize(true);
        this.LJLZ.setEnableSizeChange(true);
        LLFII();
        C31371CSx c31371CSx = this.LLIIII;
        C31369CSv c31369CSv = new C31369CSv(this);
        c31371CSx.getClass();
        C31255COl c31255COl = c31371CSx.LIZ;
        if (c31255COl != null) {
            c31255COl.LJIIJJI(c31369CSv);
        }
        C31371CSx c31371CSx2 = this.LLIIII;
        CT2 ct2 = new CT2(this);
        c31371CSx2.getClass();
        C31255COl c31255COl2 = c31371CSx2.LIZ;
        if (c31255COl2 != null) {
            c31255COl2.setOnDispatchTouchEventListener(ct2);
        }
        C31371CSx c31371CSx3 = this.LLIIII;
        IDTListenerS115S0100000_5 iDTListenerS115S0100000_5 = new IDTListenerS115S0100000_5(this, 21);
        c31371CSx3.getClass();
        C31255COl c31255COl3 = c31371CSx3.LIZ;
        if (c31255COl3 != null) {
            c31255COl3.setOnTouchListener(iDTListenerS115S0100000_5);
        }
        C31371CSx c31371CSx4 = this.LLIIII;
        C31373CSz c31373CSz = new C31373CSz(this);
        C31255COl c31255COl4 = c31371CSx4.LIZ;
        if (c31255COl4 != null) {
            c31255COl4.setOnFlingListener(c31373CSz);
        }
        this.LJLILLLLZI.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0101000_2(0, this, 7)));
        View view = getView();
        if (ReportHeightRatioSetting.enable() && view != null) {
            view.addOnLayoutChangeListener(new CRK(this, view));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.CQx, O] */
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object... objArr) {
        CT7 ct7;
        CRD crd;
        this.LL.LIZJ = this.dataChannel;
        if (this.LLFZ) {
            this.LJLILLLLZI.LJJIZ(Collections.singletonList("+"));
        } else {
            this.LJLILLLLZI.setEnableMeasureOpt(false);
        }
        if (LLF()) {
            if (LivePublicScreenAnimOptSetting.INSTANCE.getValue()) {
                C87010YCw c87010YCw = new C87010YCw(new ARunnableS18S0101000_14(0, this, 23), new ARunnableS15S0101000_11(0, this, 14));
                c87010YCw.LJI = false;
                c87010YCw.LJIJJ = new AObjectS134S0100000_5(this, 3);
                this.LLIIIJ = c87010YCw;
            } else {
                C87009YCv c87009YCv = new C87009YCv(new IDRunnableS6S0101000(1, this, 34), new IDRunnableS6S0101000(1, this, 35));
                c87009YCv.LJI = false;
                c87009YCv.LJJ = new AObjectS50S0101000_5(0, this, 3);
                this.LLIIIJ = c87009YCv;
            }
            this.LLIIII.LJFF(this.LLIIIJ);
        } else {
            this.LLIIII.LJFF(null);
        }
        ff0();
        LJZI();
        this.LLIIII.LIZIZ = true;
        this.LLIIIZ = 0;
        if (this.dataChannel.kv0(C28404BCu.class) != null) {
            this.LJLLI = (C31319CQx) this.dataChannel.kv0(C28404BCu.class);
        } else if (this.dataChannel.kv0(BCN.class) == null) {
            return;
        } else {
            this.LJLLI = new C31319CQx();
        }
        C80895Vox c80895Vox = this.LLIIIILZ;
        if (c80895Vox != null) {
            c80895Vox.setContentScrollWhenRefreshDone(true);
            this.LLIIIILZ.setScrollMode(CT4.NONE);
            this.LLIIIILZ.setOverScrollMode(EnumC80901Vp3.NONE);
            if (C29306Beo.LJIIL(this.dataChannel)) {
                this.LLIIIILZ.setOnRefreshListener(this.LJLLI);
            }
        }
        this.LJLLI.attachView(this);
        ((C32537Cpp) this.dataChannel.gv0(C28404BCu.class)).LIZ = this.LJLLI;
        this.LLD = (Room) this.dataChannel.kv0(RoomChannel.class);
        LLFFF();
        LLILII(0);
        LLIIIILZ("onLoad");
        this.dataChannel.pv0(WidgetReadyEvent.class);
        C31371CSx c31371CSx = this.LLIIII;
        CQQ publicScreenContext = this.LJLLI.LLIILZL;
        c31371CSx.getClass();
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        CT7 ct72 = c31371CSx.LIZJ;
        if (ct72 != null) {
            ct72.LJLJI = publicScreenContext;
        }
        CSR<CQO<? extends CR6>, CSE<CQO<? extends CR6>>> csr = this.LLIFFJFJJ;
        csr.LIZIZ = this.LJLLI.LLIILZL;
        if (this.LLII == null) {
            int LJI = csr.LJI();
            if (C20780ri.LIZ(LJI) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
                this.LLII = this.LLIFFJFJJ.LJIIJJI(C20780ri.LIZIZ(LJI, getContext(), this.LJLJL, true));
            } else {
                this.LLII = this.LLIFFJFJJ.LJIIJJI(C16880lQ.LLLZIIL(LJI, C16880lQ.LLZIL(getContext()), this.LJLJL));
            }
        }
        LLFF(this.LJLJL);
        this.LJLJL.setAlpha(1.0f);
        if (this.LJLLI.LJJL() && (crd = this.LJLLI.LLILLL) != null) {
            LLIIIL(crd);
        }
        CT7 ct73 = this.LLIIII.LIZJ;
        if (ct73 != null) {
            ct73.LL();
        }
        List<CRX> jh0 = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).jh0();
        if (!jh0.isEmpty()) {
            for (CRX crx : jh0) {
                if (crx != null && (ct7 = this.LLIIII.LIZJ) != null) {
                    crx.LIZJ(ct7);
                }
            }
        }
        C31371CSx c31371CSx2 = this.LLIIII;
        List<CRD> LJFF = this.LJLLI.LJZI.LJFF();
        CT7 ct74 = c31371CSx2.LIZJ;
        if (ct74 != null) {
            ct74.LJLIL = LJFF;
        }
        if (this.LJLLI.LJZI.LJI() > 0) {
            this.LJZ = true;
        }
        C31371CSx c31371CSx3 = this.LLIIII;
        c31371CSx3.getClass();
        c31371CSx3.LIZIZ(new AqS155S0100000_5(c31371CSx3, 361));
        C31371CSx c31371CSx4 = this.LLIIII;
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(1, this, 6);
        C31255COl c31255COl = c31371CSx4.LIZ;
        if (c31255COl != null) {
            c31255COl.postDelayed(iDRunnableS6S0101000, 100L);
        }
        if (ScalableDowngradeSetting.disablePublicScreenAnim()) {
            this.dataChannel.ov0(this, LowDevicePerfScalableChannel.class, new AObjectS42S0101000_5(1, this, 35));
        }
        if (C29306Beo.LJJII(this.dataChannel)) {
            C31319CQx c31319CQx = this.LJLLI;
            RoomMessage LJIJ = C31309CQn.LJIJ(0L, C15380j0.LJIILJJIL(R.string.mck));
            LJIJ.isWelcome = true;
            c31319CQx.LJJLIIIJLJLI(null, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).b5(LJIJ), true);
            this.LJLLI.LJJLIIIJLJLI(null, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).b5(C31309CQn.LJIJ(0L, C15380j0.LJIILJJIL(R.string.mcl))), false);
        }
        this.dataChannel.pv0(PublicScreenLoadedEvent.class);
    }

    public final <T> void registerRxBus(Class<T> cls) {
        C73943T0h.LIZ().LJ(cls).LJII(getAutoUnbindTransformer()).LJJJJZI(new AfS36S0101000_5(0, this, 60));
    }

    @Override // X.CRA
    public final void sT(CRD crd) {
        LLIIIL(crd);
    }

    @Override // X.CRA
    public final void start(int i) {
        boolean z;
        this.LLIIIZ = (~i) & this.LLIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("foreground-- visibility： ");
        if (this.LLIIIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append("--isExtendScreen：");
        LIZ.append(LLIIII());
        C0NB.LJ("PublicScreenOpt", X1D.LIZIZ(LIZ));
        if (this.LLIIIZ == 0 && !this.LLIIII.LIZIZ) {
            LJZL();
            this.LLIIIL = 0;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("rebind--isExtendScreen：");
            LIZ2.append(LLIIII());
            C0NB.LJ("PublicScreenOpt", X1D.LIZIZ(LIZ2));
            C31371CSx c31371CSx = this.LLIIII;
            c31371CSx.LIZIZ = true;
            List<CRD> LJFF = this.LJLLI.LJZI.LJFF();
            CT7 ct7 = c31371CSx.LIZJ;
            if (ct7 != null) {
                ct7.LJLIL = LJFF;
            }
            C31371CSx c31371CSx2 = this.LLIIII;
            c31371CSx2.getClass();
            c31371CSx2.LIZIZ(new AqS155S0100000_5(c31371CSx2, 361));
            if (this.LJLLILLLL == CT0.NORMAL) {
                C31371CSx c31371CSx3 = this.LLIIII;
                IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(1, this, 5);
                C31255COl c31255COl = c31371CSx3.LIZ;
                if (c31255COl != null) {
                    c31255COl.postDelayed(iDRunnableS6S0101000, 100L);
                }
            }
        }
    }

    @Override // X.CRA
    public final void xd0(int i) {
        C31371CSx c31371CSx = this.LLIIII;
        c31371CSx.getClass();
        c31371CSx.LIZIZ(new AqS105S0101000_5(c31371CSx, i, 4));
        this.LJLLL = i;
    }

    public void zJ(int i) {
        Bi0(i, 1);
        if (i != this.LLIIII.LJ()) {
            C31371CSx c31371CSx = this.LLIIII;
            int LJ = c31371CSx.LJ() - i;
            c31371CSx.getClass();
            c31371CSx.LIZIZ(new AqS16S0102000_5(c31371CSx, i, LJ, 0));
        }
    }

    public void onEvent(BV7 bv7) {
        CT0 ct0 = CT0.NORMAL;
        this.LJLLILLLL = ct0;
        LLILIL(ct0);
    }

    public void Bi0(int i, int i2) {
        C31371CSx c31371CSx = this.LLIIII;
        c31371CSx.getClass();
        c31371CSx.LIZIZ(new AqS16S0102000_5(c31371CSx, i, i2, 2));
        LL(i2);
    }

    @Override // X.CRA
    public final void In0(int i, Object payload) {
        C31255COl c31255COl;
        C31255COl c31255COl2;
        C31371CSx c31371CSx = this.LLIIII;
        c31371CSx.getClass();
        o.LJIIIZ(payload, "payload");
        c31371CSx.LIZIZ(new AqS68S0201000_5(c31371CSx, i, payload, 2));
        if (this.LLFFF) {
            return;
        }
        if (CT0.NORMAL == this.LJLLILLLL || this.LJLLLL) {
            this.LJLLLL = true;
            if (this.LLFF && (c31255COl2 = this.LLIIII.LIZ) != null) {
                c31255COl2.LJLILLLLZI();
            }
            DT(false);
            if (this.LLFF && (c31255COl = this.LLIIII.LIZ) != null) {
                c31255COl.LJLJI(false);
            }
        }
    }

    @Override // X.CRA
    public final void Jz(InterfaceC31337CRp interfaceC31337CRp, boolean z) {
        if (this.LJLILLLLZI.getVisibility() != 8) {
            this.dataChannel.rv0(PublicScreenNewMessageVisible.class, Boolean.FALSE);
        }
        this.LJLILLLLZI.setVisibility(8);
        if (this.LJLJI == null) {
            this.LJLJI = ((ViewStub) findViewById(R.id.gi9)).inflate();
        }
        int i = 0;
        if (this.LJLJI.getVisibility() != 0) {
            LLFZ();
            this.LJLJJI.start();
            this.LJLJI.setVisibility(0);
            if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_mention_remind_show")) {
                BZI LIZ = C28787BRn.LIZ("livesdk_mention_remind_show");
                LIZ.LJIILLIIL(this.dataChannel);
                LIZ.LJJIIJZLJL();
            }
        } else if (z) {
            LLFZ();
            if (this.LJLJJL == null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                this.LJLJJL = ofFloat;
                ofFloat.setDuration(240L);
                this.LJLJJL.addListener(new ALAdapterS4S0100000_5(this, 60));
            }
            ObjectAnimator objectAnimator = this.LJLJJLL;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                C16880lQ.LJLJJLL(this.LJLJJLL);
                this.LJLJJLL.addListener(new ALAdapterS4S0100000_5(this, 18));
            } else if (!this.LJLJJL.isRunning()) {
                this.LJLJJL.start();
            }
        }
        this.LLF.post(new ARunnableS18S0101000_14(0, this, 22));
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 38), this.LJLJI);
        C47061t0 c47061t0 = (C47061t0) findViewById(R.id.a9a);
        User LJJI = interfaceC31337CRp.LJJI();
        if (LJJI != null) {
            C31665Cbl.LJ(LJJI.getAvatarThumb(), c47061t0);
            TextView textView = (TextView) findViewById(R.id.a9f);
            if (getView() != null) {
                i = getView().getWidth();
            }
            textView.setMaxWidth(i);
        }
    }

    public void LLIIJLIL(int i, RecyclerView recyclerView) {
        CHK chk;
        CHK chk2;
        if (i == 0) {
            C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_public_screen_slide");
            if (c5h3 != null && (chk2 = (CHK) c5h3.getValue()) != null) {
                chk2.stop();
                return;
            }
            return;
        }
        C5H3 c5h32 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_public_screen_slide");
        if (c5h32 == null || (chk = (CHK) c5h32.getValue()) == null) {
            return;
        }
        chk.start();
    }

    public final void LLILL(CT0 ct0, boolean z) {
        if (this.LJLLILLLL == ct0) {
            return;
        }
        this.LJLLILLLL = ct0;
        if (CT0.NORMAL == ct0) {
            LLILII(0);
            if (z) {
                DT(true);
                LLIL();
            }
        }
    }

    @Override // X.CRA
    public final void OC(int i, int i2) {
        mn(i, i2, false);
    }

    @Override // X.CRA
    public final void oj(C03150Al c03150Al, List list) {
        this.LLIIII.LJFF(null);
        C31371CSx c31371CSx = this.LLIIII;
        CT7 ct7 = c31371CSx.LIZJ;
        if (ct7 != null) {
            ct7.LJLIL = list;
        }
        c31371CSx.getClass();
        c31371CSx.LIZIZ(new AqS152S0200000_5(c31371CSx, c03150Al, 30));
        this.LLIIII.LIZJ();
        DT(true);
    }

    public void mn(int i, int i2, boolean z) {
        boolean z2;
        C31255COl c31255COl;
        C31255COl c31255COl2;
        C31255COl c31255COl3;
        C31255COl c31255COl4;
        C31371CSx c31371CSx = this.LLIIII;
        c31371CSx.getClass();
        c31371CSx.LIZIZ(new AqS16S0102000_5(c31371CSx, i, i2, 1));
        if (!z) {
            LLILII(this.LJLLJ + i2);
        } else {
            this.LJLLL += i2;
            this.LLIIII.LJFF(null);
        }
        if (LLF() && this.LJLLILLLL == CT0.NORMAL && !z && (c31255COl4 = this.LLIIII.LIZ) != null) {
            c31255COl4.LLLIIIL = true;
        }
        if (this.LJLLJ >= 300) {
            this.LJLLILLLL = CT0.NORMAL;
            LLILII(0);
            LLIL();
            z2 = true;
        } else {
            z2 = false;
        }
        if (CT0.NORMAL == this.LJLLILLLL || this.LJLLLL) {
            this.LJLLLL = true;
            if (!z && this.LLIIIJ != null && (((c31255COl3 = this.LLIIII.LIZ) == null || c31255COl3.getItemAnimator() == null) && LLF())) {
                this.LLIIII.LJFF(this.LLIIIJ);
            }
            if (this.LLFF && (c31255COl2 = this.LLIIII.LIZ) != null) {
                c31255COl2.LJLILLLLZI();
            }
            if (!z) {
                DT(z2);
            }
            C31319CQx c31319CQx = this.LJLLI;
            if (c31319CQx != null) {
                c31319CQx.LJLI();
            }
            if (this.LLFF && (c31255COl = this.LLIIII.LIZ) != null) {
                c31255COl.LJLJI(false);
            }
        }
        LL(i2);
    }
}
