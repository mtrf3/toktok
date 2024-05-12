package com.bytedance.android.live.publicscreen.impl.widget;

import X.AbstractC030109x;
import X.B4Q;
import X.BCX;
import X.C15380j0;
import X.C16880lQ;
import X.C20780ri;
import X.C25600zU;
import X.C259710f;
import X.C28329B9x;
import X.C28509BGv;
import X.C29306Beo;
import X.C30326BvG;
import X.C31255COl;
import X.C31319CQx;
import X.C31320CQy;
import X.C31371CSx;
import X.C31376CTc;
import X.C43431n9;
import X.C5H3;
import X.C73943T0h;
import X.C78996UzQ;
import X.C88207Yjb;
import X.CHK;
import X.CN1;
import X.CQO;
import X.CQQ;
import X.CR2;
import X.CR6;
import X.CRD;
import X.CRX;
import X.CS0;
import X.CSE;
import X.CSR;
import X.CT1;
import X.CT4;
import X.CT5;
import X.CT7;
import X.CTB;
import X.EnumC80901Vp3;
import X.KL2;
import X.ORY;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenConfig;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveNotShowGuideAgain;
import com.bytedance.android.livesdk.dataChannel.PublicScreenWidgetTopMessage;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenUpdateOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS16S0102000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ExtendedPublicScreenWidget extends PublicScreenWidget implements CS0 {
    public C43431n9 LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public boolean LLIILII;
    public boolean LLIIZ;
    public final Handler LLILII;
    public final C5H3 LLILIL;
    public final int LLIILZL = C15380j0.LIZ(90.0f);
    public boolean LLIL = true;

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final boolean LLIIII() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dai;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.CRA
    public final boolean wg0() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LLFFF() {
        registerRxBus(C31376CTc.class);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.lv0(this, LiveExtendedScreenStatus.class, new AqS171S0100000_5(this, 86));
        dataChannel.lv0(this, PublicScreenWidgetTopMessage.class, new AqS171S0100000_5(this, 87));
        dataChannel.ov0(this, LinkCrossRoomStateChangeEvent.class, new AqS171S0100000_5(this, 88));
        dataChannel.lv0(this, LiveNotShowGuideAgain.class, new AqS171S0100000_5(this, 89));
        C73943T0h.LIZ().LIZJ(this, B4Q.class).LIZIZ(new AfS57S0100000_5(this, 30));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LLFII() {
        SmoothLinearLayoutManager smoothLinearLayoutManager;
        C31371CSx c31371CSx = this.LLIIII;
        CT5 ct5 = new CT5();
        c31371CSx.LIZJ = ct5;
        C31255COl c31255COl = c31371CSx.LIZ;
        if (c31255COl != null) {
            c31255COl.setAdapter(ct5);
        }
        C31371CSx c31371CSx2 = this.LLIIII;
        SmoothLinearLayoutManager smoothLinearLayoutManager2 = new SmoothLinearLayoutManager();
        c31371CSx2.LIZLLL = smoothLinearLayoutManager2;
        C31255COl c31255COl2 = c31371CSx2.LIZ;
        if (c31255COl2 != null) {
            c31255COl2.setLayoutManager(smoothLinearLayoutManager2);
        }
        LivePublicScreenConfig LJJLI = C31319CQx.LJJLI(o.LJ(this.dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE));
        o.LJIIIIZZ(LJJLI, "getConfig(dataChannel.ge…nel::class.java) == true)");
        if (LJJLI.foldMessageScrollType != 0 && (smoothLinearLayoutManager = this.LLIIII.LIZLLL) != null) {
            smoothLinearLayoutManager.LLJJIJIIJIL(true);
        }
        SmoothLinearLayoutManager smoothLinearLayoutManager3 = this.LLIIII.LIZLLL;
        if (smoothLinearLayoutManager3 != null) {
            smoothLinearLayoutManager3.LLIIIJ = 1.0f;
            smoothLinearLayoutManager3.LLFZ = true;
            smoothLinearLayoutManager3.LLIIIL = true;
        }
        if (LLF()) {
            this.LLIIII.LJFF((AbstractC030109x) this.LLILIL.getValue());
        } else {
            this.LLIIII.LJFF(null);
        }
        C31371CSx c31371CSx3 = this.LLIIII;
        CTB ctb = new CTB((int) KL2.LIZJ(this.context, 11.0f));
        C31255COl c31255COl3 = c31371CSx3.LIZ;
        if (c31255COl3 != null) {
            c31255COl3.LJII(ctb, -1);
        }
        C31371CSx c31371CSx4 = this.LLIIII;
        int LIZJ = (int) KL2.LIZJ(this.context, 88.0f);
        C31255COl c31255COl4 = c31371CSx4.LIZ;
        if (c31255COl4 != null) {
            c31255COl4.setFadingEdgeLength(LIZJ);
        }
        C31255COl c31255COl5 = this.LLIIII.LIZ;
        if (c31255COl5 != null) {
            c31255COl5.setHasFixedSize(true);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final CSR<CQO<? extends CR6>, CSE<CQO<? extends CR6>>> LLIIJI() {
        return new CT1();
    }

    @Override // X.CS0
    public final void Rs() {
        C29306Beo.LJI(this.LLIIJI);
    }

    public ExtendedPublicScreenWidget() {
        Handler handler;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            handler = null;
        }
        this.LLILII = handler;
        this.LLILIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 57));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LLIIL() {
        CHK chk;
        super.LLIIL();
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_extended_public_screen_auto_slide");
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.start();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LLIILII() {
        CHK chk;
        super.LLIILII();
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_extended_public_screen_auto_slide");
        if (c5h3 != null && (chk = (CHK) c5h3.getValue()) != null) {
            chk.stop();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        C43431n9 c43431n9 = this.LLIIJI;
        if (c43431n9 != null) {
            C29306Beo.LJI(c43431n9);
        }
    }

    public final void LLILLIZIL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = getView();
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.height = i;
            View view2 = getView();
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // X.CS0
    public final void dB(String str) {
        ViewGroup viewGroup;
        if (this.LLIIJI == null) {
            C43431n9 c43431n9 = new C43431n9(new C25600zU(getContext(), C259710f.LIZ.LIZJ()), 0);
            View view = getView();
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(c43431n9, 0);
            }
            c43431n9.setButtonText("");
            c43431n9.setIconAttr(R.attr.au2);
            c43431n9.setMessage(R.string.mzl);
            ViewGroup.LayoutParams layoutParams = c43431n9.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            ViewGroup.LayoutParams layoutParams2 = c43431n9.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
            }
            c43431n9.post(new ARunnableS41S0100000_5(c43431n9, 35));
            this.LLIIJI = c43431n9;
        }
        C43431n9 c43431n92 = this.LLIIJI;
        if (c43431n92 != null) {
            c43431n92.setTitle(str);
        }
        C29306Beo.LJJLJLI(this.LLIIJI);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        C31319CQx c31320CQy;
        View LLLZIIL;
        CT7 ct7;
        LiveMode liveMode;
        if (objArr != null) {
            obj = ORY.LJJJJI(0, objArr);
        } else {
            obj = null;
        }
        this.LLIIIZ = 0;
        if (o.LJ(obj, Boolean.TRUE)) {
            c31320CQy = new CR2();
        } else {
            c31320CQy = new C31320CQy();
        }
        this.LJLLI = c31320CQy;
        c31320CQy.attachView(this);
        Handler handler = this.LLILII;
        if (handler != null) {
            handler.postDelayed(new ARunnableS41S0100000_5(this, 33), 360000L);
        }
        this.LLIIIILZ.setOverScrollMode(EnumC80901Vp3.NONE);
        this.LLIIIILZ.setScrollMode(CT4.NONE);
        this.LLD = (Room) this.dataChannel.kv0(RoomChannel.class);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null && C28509BGv.LJ(liveMode)) {
            this.LLIIZ = true;
        }
        LLFFF();
        C31371CSx c31371CSx = this.LLIIII;
        CQQ cqq = this.LJLLI.LLIILZL;
        o.LJIIIIZZ(cqq, "mPresenter.publicScreenContext");
        c31371CSx.getClass();
        CT7 ct72 = c31371CSx.LIZJ;
        if (ct72 != null) {
            ct72.LJLJI = cqq;
        }
        CSR<CQO<? extends CR6>, CSE<CQO<? extends CR6>>> csr = this.LLIFFJFJJ;
        CQQ cqq2 = this.LJLLI.LLIILZL;
        o.LJIIIIZZ(cqq2, "mPresenter.publicScreenContext");
        csr.getClass();
        csr.LIZIZ = cqq2;
        ViewGroup foldMessageView = (ViewGroup) findViewById(R.id.djk);
        int LJI = this.LLIFFJFJJ.LJI();
        CSR<CQO<? extends CR6>, CSE<CQO<? extends CR6>>> csr2 = this.LLIFFJFJJ;
        if (C20780ri.LIZ(LJI) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            o.LJIIIIZZ(foldMessageView, "foldMessageView");
            LLLZIIL = C20780ri.LIZJ(LJI, foldMessageView, true);
        } else {
            LLLZIIL = C16880lQ.LLLZIIL(LJI, C16880lQ.LLZIL(getContext()), foldMessageView);
        }
        o.LJIIIIZZ(LLLZIIL, "if (LayoutInflateHelper.…essageView)\n            }");
        this.LLII = csr2.LJIIJJI(LLLZIIL);
        LLFF(foldMessageView);
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
        C31371CSx c31371CSx3 = this.LLIIII;
        int LJI2 = this.LJLLI.LJZI.LJI();
        c31371CSx3.getClass();
        c31371CSx3.LIZIZ(new AqS16S0102000_5(c31371CSx3, 0, LJI2, 1));
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS41S0100000_5(this, 34));
        }
        enableSubWidgetManager(new WidgetCreateTimeUtil(null, 1, null), C30326BvG.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C28329B9x.LIZJ(getContext()));
        if (LivePublicScreenUpdateOptSetting.getCount(this.dataChannel) > 0) {
            e30(8);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.CRA
    public final void zJ(int i) {
        C31320CQy c31320CQy;
        super.zJ(i);
        C31319CQx c31319CQx = this.LJLLI;
        if ((c31319CQx instanceof C31320CQy) && (c31320CQy = (C31320CQy) c31319CQx) != null) {
            c31320CQy.LJLLLLLL();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.CRA
    public final void Bi0(int i, int i2) {
        C31320CQy c31320CQy;
        super.Bi0(i, i2);
        C31319CQx c31319CQx = this.LJLLI;
        if ((c31319CQx instanceof C31320CQy) && (c31320CQy = (C31320CQy) c31319CQx) != null) {
            c31320CQy.LJLLLLLL();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LLIIJLIL(int i, RecyclerView recyclerView) {
        CHK chk;
        CHK chk2;
        o.LJIIIZ(recyclerView, "recyclerView");
        super.LLIIJLIL(i, recyclerView);
        if (i == 0) {
            C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_extended_public_screen_auto_slide");
            if (c5h3 != null && (chk2 = (CHK) c5h3.getValue()) != null) {
                chk2.stop();
                return;
            }
            return;
        }
        C5H3 c5h32 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_extended_public_screen_slide");
        if (c5h32 == null || (chk = (CHK) c5h32.getValue()) == null) {
            return;
        }
        chk.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r3 == X.EnumC74778TWk.NORMAL) goto L40;
     */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.CRA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mn(int r5, int r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r4.LLF()
            r3 = 0
            if (r0 == 0) goto L22
            X.CSx r0 = r4.LLIIII
            X.COl r0 = r0.LIZ
            if (r0 == 0) goto L13
            X.09x r0 = r0.getItemAnimator()
            if (r0 != 0) goto L22
        L13:
            X.CSx r1 = r4.LLIIII
            if (r1 == 0) goto L22
            X.5H3 r0 = r4.LLILIL
            java.lang.Object r0 = r0.getValue()
            X.09x r0 = (X.AbstractC030109x) r0
            r1.LJFF(r0)
        L22:
            super.mn(r5, r6, r7)
            boolean r0 = r4.LLIIZ
            if (r0 == 0) goto Lc1
            X.CQx r0 = r4.LJLLI
            X.CQQ r0 = r0.LLIILZL
            boolean r0 = r0.LJFF
            if (r0 == 0) goto Lc1
            X.CSx r0 = r4.LLIIII
            int r1 = r0.LJ()
            r0 = 10
            if (r1 < r0) goto Lc1
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.LLLLLILLIL
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_GAME_EXTENDED_SCREEN_SHOW_GUIDE.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto Lc1
            X.BKY r0 = X.BKY.LIZIZ()
            boolean r0 = r0.LIZJ()
            if (r0 != 0) goto Lc1
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel.class
            java.lang.Object r1 = r1.kv0(r0)
            X.C4o r0 = X.EnumC30738C4o.DISMISS
            if (r1 != r0) goto Lc1
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LLD
            boolean r0 = X.C30791C6p.LIZ(r0)
            if (r0 == 0) goto Lc1
            boolean r0 = r4.LLIILII
            r2 = 0
            if (r0 != 0) goto Lc1
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.LinkInRoomWindowCountChannel> r0 = com.bytedance.android.live.liveinteract.api.LinkInRoomWindowCountChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L83
            int r0 = r0.intValue()
            if (r0 > 0) goto Lc1
        L83:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel> r0 = com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            X.Tfp r0 = (X.C75233Tfp) r0
            if (r0 == 0) goto La5
            X.TWk r0 = r0.LJLIL
            if (r0 == 0) goto La5
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel> r0 = com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            X.Tfp r0 = (X.C75233Tfp) r0
            if (r0 == 0) goto La1
            X.TWk r3 = r0.LJLIL
        La1:
            X.TWk r0 = X.EnumC74778TWk.NORMAL
            if (r3 != r0) goto Lc1
        La5:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel> r0 = com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb7
            int r0 = r0.intValue()
            if (r0 > 0) goto Lc1
        Lb7:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel> r0 = com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            if (r0 == 0) goto Lc5
        Lc1:
            r4.Rs()
            return
        Lc5:
            r4.LLIIZ = r2
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveGameExtendedScreenShowGuide> r0 = com.bytedance.android.livesdk.dataChannel.LiveGameExtendedScreenShowGuide.class
            r1.pv0(r0)
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.ExtendedPublicScreenWidget.mn(int, int, boolean):void");
    }
}
