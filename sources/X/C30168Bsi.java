package X;

import Y.AfS20S0400000_5;
import Y.AfS57S0100000_5;
import Y.IDCListenerS281S0100000_5;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.toolbar.HideShareLeadEvent;
import com.bytedance.android.live.toolbar.ToolbarButtonMoreDialogNew;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.LiveToolbarMoreSheet;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.ToolbarButtonMoreDialog;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.behavior.experiment.LiveOfflineSubOnlyLiveEntranceSetting;
import com.bytedance.android.livesdk.dataChannel.LiveDismissMoreDialogEvent;
import com.bytedance.android.livesdk.dataChannel.LiveShowMoreDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.event.LiveWeeklyRankingGiftAnchorGuideEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorMoreLayoutStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bsi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30168Bsi implements InterfaceViewOnClickListenerC30227Btf {
    public Room LJLIL;
    public ToolbarButtonMoreDialog LJLJJL;
    public ToolbarButtonMoreDialogNew LJLJJLL;
    public LiveToolbarMoreSheet LJLJL;
    public DataChannel LJLJLJ;
    public LiveMode LJLJLLL;
    public InterfaceC30237Btp LJLL;
    public C73411SrX LJLLJ;
    public C30170Bsk LJLLL;
    public final List<EnumC30204BtI> LJLILLLLZI = new ArrayList();
    public final List<EnumC30204BtI> LJLJI = new ArrayList();
    public final List<EnumC30204BtI> LJLJJI = new ArrayList();
    public final C73318Sq2 LJLLI = new C73318Sq2();
    public final long LJLLILLLL = 5000;
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C30171Bsl.LJLIL);

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final String LIZJ() {
        ArrayList arrayList = new ArrayList();
        if (this.LJLJLLL == LiveMode.SCREEN_RECORD && (!C40210FqI.LJ(C15380j0.LIZLLL()))) {
            arrayList.add("float_window");
        }
        if (arrayList.isEmpty()) {
            return "null";
        }
        return arrayList.toString();
    }

    public final EnumC30204BtI LIZLLL() {
        if (!((IGiftService) CN1.LIZ(IGiftService.class)).isGiftSuspended(this.LJLJLJ)) {
            return EnumC30204BtI.BROADCAST_GIFT;
        }
        return EnumC30204BtI.DUMMY_BROADCAST_GIFT;
    }

    public final void LJFF() {
        if (this.LJLJLLL != LiveMode.SCREEN_RECORD) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_more_red_dot_show");
        LIZ.LJIJJ(Long.valueOf(((Number) this.LJLLLL.getValue()).longValue()), "anchor_id");
        LIZ.LJIJJ(LIZJ(), "type");
        LIZ.LJJIIJZLJL();
    }

    public final void LJI() {
        View view;
        InterfaceC30237Btp interfaceC30237Btp = this.LJLL;
        if (interfaceC30237Btp != null) {
            view = interfaceC30237Btp.LIZ(R.id.fwo);
        } else {
            view = null;
        }
        C29306Beo.LJJLIIIJJI(view, true);
        this.LJLLI.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(30L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 286)));
    }

    public final void LJII() {
        LiveMode liveMode;
        FragmentManager fragmentManager;
        LiveToolbarMoreSheet liveToolbarMoreSheet;
        Room room;
        Context context;
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            int i = 0;
            do {
                InterfaceC30237Btp interfaceC30237Btp = this.LJLL;
                if (interfaceC30237Btp != null) {
                    context = interfaceC30237Btp.getContext();
                } else {
                    context = null;
                }
                C20780ri.LIZLLL(R.layout.ddg, context);
                i++;
            } while (i < 6);
        }
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.qv0(HideShareLeadEvent.class, Boolean.TRUE);
        }
        DataChannel dataChannel2 = this.LJLJLJ;
        if (dataChannel2 != null && o.LJ(dataChannel2.kv0(BDS.class), Boolean.FALSE) && (room = this.LJLIL) != null) {
            ((ITreasureBoxService) CN1.LIZ(ITreasureBoxService.class)).sf0(this.LJLJLJ, Long.valueOf(room.getId()), room.getOwner().getSecUid());
        }
        LJIIIIZZ();
        if (C44384HbQ.LJJIJ() && !C29306Beo.LJJII(this.LJLJLJ)) {
            DataChannel dataChannel3 = this.LJLJLJ;
            if (dataChannel3 != null && dataChannel3.kv0(C29494Bhq.class) != null) {
                this.LJLJL = new LiveToolbarMoreSheet(this.LJLJI, this.LJLJJI);
                DataChannel dataChannel4 = this.LJLJLJ;
                if (dataChannel4 != null && (fragmentManager = (FragmentManager) dataChannel4.kv0(C29494Bhq.class)) != null && (liveToolbarMoreSheet = this.LJLJL) != null) {
                    liveToolbarMoreSheet.show(fragmentManager, "LiveToolbarMoreSheet");
                    return;
                }
                return;
            }
            return;
        }
        if (LiveAnchorMoreLayoutStyleSetting.INSTANCE.enableNewStyle() && (((liveMode = this.LJLJLLL) == LiveMode.VIDEO || liveMode == LiveMode.LIVE_VOICE) && !C32151Nz.LJJIIJZLJL(this.LJLJI) && !C32151Nz.LJJIIJZLJL(this.LJLJJI))) {
            List<EnumC30204BtI> list = this.LJLJI;
            List<EnumC30204BtI> list2 = this.LJLJJI;
            DataChannel dataChannel5 = this.LJLJLJ;
            o.LJI(dataChannel5);
            this.LJLJJLL = new ToolbarButtonMoreDialogNew(list, list2, dataChannel5);
            DataChannel dataChannel6 = this.LJLJLJ;
            o.LJI(dataChannel6);
            FragmentManager fragmentManager2 = (FragmentManager) dataChannel6.kv0(C29494Bhq.class);
            if (fragmentManager2 == null) {
                return;
            }
            ToolbarButtonMoreDialogNew toolbarButtonMoreDialogNew = this.LJLJJLL;
            o.LJI(toolbarButtonMoreDialogNew);
            toolbarButtonMoreDialogNew.show(fragmentManager2, "ToolbarButtonMoreDialogNew");
            return;
        }
        if (C32151Nz.LJJIIJZLJL(this.LJLILLLLZI)) {
            return;
        }
        List<EnumC30204BtI> list3 = this.LJLILLLLZI;
        DataChannel dataChannel7 = this.LJLJLJ;
        o.LJI(dataChannel7);
        this.LJLJJL = new ToolbarButtonMoreDialog(dataChannel7, list3);
        DataChannel dataChannel8 = this.LJLJLJ;
        o.LJI(dataChannel8);
        FragmentManager fragmentManager3 = (FragmentManager) dataChannel8.kv0(C29494Bhq.class);
        if (fragmentManager3 != null) {
            ToolbarButtonMoreDialog toolbarButtonMoreDialog = this.LJLJJL;
            o.LJI(toolbarButtonMoreDialog);
            toolbarButtonMoreDialog.show(fragmentManager3, "ToolbarButtonMoreDialog");
        }
        ToolbarButtonMoreDialog toolbarButtonMoreDialog2 = this.LJLJJL;
        if (toolbarButtonMoreDialog2 == null) {
            return;
        }
        toolbarButtonMoreDialog2.onCancelListener = new IDCListenerS281S0100000_5(this, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0607, code lost:
    
        if (X.C29306Beo.LJJIFFI(r5) != false) goto L328;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30168Bsi.LJIIIIZZ():void");
    }

    public final void LIZIZ() {
        if (C44384HbQ.LJJIJ() && !C29306Beo.LJJII(this.LJLJLJ)) {
            LiveToolbarMoreSheet liveToolbarMoreSheet = this.LJLJL;
            if (liveToolbarMoreSheet != null) {
                liveToolbarMoreSheet.dismiss();
                return;
            }
            return;
        }
        if (LiveAnchorMoreLayoutStyleSetting.INSTANCE.enableNewStyle()) {
            ToolbarButtonMoreDialogNew toolbarButtonMoreDialogNew = this.LJLJJLL;
            if (toolbarButtonMoreDialogNew == null) {
                return;
            }
            toolbarButtonMoreDialogNew.dismiss();
            return;
        }
        ToolbarButtonMoreDialog toolbarButtonMoreDialog = this.LJLJJL;
        if (toolbarButtonMoreDialog == null) {
            return;
        }
        toolbarButtonMoreDialog.dismiss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (X.C28509BGv.LJI(r0) != true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r4 = this;
            com.bytedance.android.live.toolbar.IToolbarService r1 = X.C7N.LJJ()
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LJLJLJ
            X.BtJ r1 = r1.pk(r0)
            r3 = 1
            if (r1 == 0) goto L33
            X.BtI r0 = X.EnumC30204BtI.INTERACTION_FEATURES
            boolean r0 = r1.LJFF(r0)
            if (r0 != r3) goto L33
            X.Ol8 r0 = X.C7N.LJIJJLI
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-qaService>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.live.qa.IQAService r1 = (com.bytedance.android.live.qa.IQAService) r1
            int r0 = r1.bR()
            if (r0 <= 0) goto L33
            r4.LJFF()
            X.BtI r1 = X.EnumC30204BtI.MORE
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LJLJLJ
            r1.showRedDot(r0)
        L32:
            return
        L33:
            com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting r0 = com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 != 0) goto L5e
            X.J0d<java.lang.Boolean> r0 = X.InterfaceC30442Bx8.LLJL
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_FIRST_OPEN_HASHTAG_DIALOG_IN_BROADCAST.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L70
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.LLLLIIIILLL
            java.lang.Object r2 = r0.LIZJ()
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.By6 r0 = X.EnumC30502By6.DEFAULT
            int r1 = r0.ordinal()
            if (r2 != 0) goto L7b
        L5e:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = r4.LJLJLLL
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r1 != r0) goto L8c
            android.content.Context r0 = X.C15380j0.LIZLLL()
            boolean r0 = X.C40210FqI.LJ(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L8c
        L70:
            r4.LJFF()
            X.BtI r1 = X.EnumC30204BtI.MORE
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LJLJLJ
            r1.showRedDot(r0)
            goto L32
        L7b:
            int r0 = r2.intValue()
            if (r0 != r1) goto L5e
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r4.LJLJLLL
            if (r0 == 0) goto L5e
            boolean r0 = X.C28509BGv.LJI(r0)
            if (r0 != r3) goto L5e
            goto L70
        L8c:
            X.BtI r1 = X.EnumC30204BtI.MORE
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.LJLJLJ
            r1.hideRedDot(r0)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30168Bsi.LJ():void");
    }

    public final void LIZ(List<EnumC30204BtI> list) {
        if (C29232Bdc.LJIIJJI(this.LJLJLJ) && !LiveOfflineSubOnlyLiveEntranceSetting.INSTANCE.enable()) {
            list.add(EnumC30204BtI.SUBSCRIPTION_IN_MORE_DIALOG);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        java.util.Map map;
        String str;
        LiveMode streamType;
        o.LJIIIZ(v, "v");
        C30444BxA.LIZ(EnumC30410Bwc.LIVE_BROADCAST_MORE);
        LJII();
        HashMap hashMap = new HashMap(6);
        java.util.Map map2 = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29022BaE.class);
        DataChannel dataChannel = this.LJLJLJ;
        if (dataChannel != null) {
            map = (java.util.Map) dataChannel.kv0(BDB.class);
        } else {
            map = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (map2 != null) {
            Iterator it = map2.keySet().iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (o.LJ(map2.get(Long.valueOf(longValue)), Boolean.TRUE)) {
                    arrayList.add(Long.valueOf(longValue));
                }
            }
        }
        if (map != null) {
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                long longValue2 = ((Number) it2.next()).longValue();
                if (o.LJ(map.get(Long.valueOf(longValue2)), Boolean.TRUE)) {
                    arrayList2.add(Long.valueOf(longValue2));
                }
            }
        }
        String abstractCollection = arrayList.toString();
        o.LJIIIIZZ(abstractCollection, "logEnvelopePermissionData.toString()");
        hashMap.put("envelope_permission", abstractCollection);
        String abstractCollection2 = arrayList2.toString();
        o.LJIIIIZZ(abstractCollection2, "logGoodyBagPermissionData.toString()");
        hashMap.put("goody_bag_permission", abstractCollection2);
        BZI LIZ = C28787BRn.LIZ("anchor_more_function_click");
        LIZ.LJIILLIIL(this.LJLJLJ);
        Room room = this.LJLIL;
        if (room != null && (streamType = room.getStreamType()) != null) {
            str = C28509BGv.LIZ(streamType);
        } else {
            str = "";
        }
        LIZ.LJIJJ(str, "live_type");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
        if (this.LJLJLLL == LiveMode.SCREEN_RECORD) {
            int i = !o.LJ(LIZJ(), "null") ? 1 : 0;
            BZI LIZ2 = C28787BRn.LIZ("livesdk_more_click");
            LIZ2.LJIJJ(Long.valueOf(((Number) this.LJLLLL.getValue()).longValue()), "anchor_id");
            LIZ2.LJIJJ(Integer.valueOf(i), "is_red_dot");
            LIZ2.LJIJJ(LIZJ(), "type");
            LIZ2.LJJIIJZLJL();
        }
        if (C29232Bdc.LJIIJJI(this.LJLJLJ)) {
            J9A.LIZJ(C28787BRn.LIZ("livesdk_anchor_more_subscription_management_show"), this.LJLJLJ, "anchor_more", "click_position");
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        if (C44384HbQ.LJJIJ() && !C29306Beo.LJJII(dataChannel)) {
            LiveToolbarMoreSheet liveToolbarMoreSheet = this.LJLJL;
            if (liveToolbarMoreSheet != null) {
                liveToolbarMoreSheet.dismiss();
            }
        } else if (LiveAnchorMoreLayoutStyleSetting.INSTANCE.enableNewStyle()) {
            ToolbarButtonMoreDialogNew toolbarButtonMoreDialogNew = this.LJLJJLL;
            if (toolbarButtonMoreDialogNew != null) {
                toolbarButtonMoreDialogNew.dismiss();
            }
        } else {
            ToolbarButtonMoreDialog toolbarButtonMoreDialog = this.LJLJJL;
            if (toolbarButtonMoreDialog != null) {
                toolbarButtonMoreDialog.dismiss();
            }
        }
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this.LJLLL);
            this.LJLLL = null;
        }
        dataChannel.jv0(this);
        this.LJLLI.LIZLLL();
        C73411SrX c73411SrX = this.LJLLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        Room room;
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJLJ = dataChannel;
        this.LJLIL = (Room) dataChannel.kv0(RoomChannel.class);
        this.LJLJLLL = (LiveMode) dataChannel.kv0(BCX.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoad mLiveMode:");
        LIZ.append(this.LJLJLLL);
        C0NB.LIZIZ("ToolbarMoreBehavior", X1D.LIZIZ(LIZ));
        this.LJLL = interfaceC30237Btp;
        dataChannel.mv0(BroadcastEndShowEvent.class, this, new AqS171S0100000_5(this, 742));
        dataChannel.nv0(RefreshMoreRedDotEvent.class, this, new AqS171S0100000_5(this, 743));
        dataChannel.nv0(LiveDismissMoreDialogEvent.class, this, new AqS171S0100000_5(this, 744));
        dataChannel.mv0(LiveShowMoreDialogEvent.class, this, new AqS171S0100000_5(this, 745));
        dataChannel.mv0(LiveWeeklyRankingGiftAnchorGuideEvent.class, this, new AqS171S0100000_5(this, 746));
        if (LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle()) {
            View LJI = C20910rv.LJI(R.layout.dj8, null, false, 12);
            this.LJLLI.LIZ(C73943T0h.LIZ().LJ(C30185Bsz.class).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS20S0400000_5((C47121t6) LJI.findViewById(R.id.di0), this, interfaceC30237Btp, LJI, 1), C30172Bsm.LJLIL));
        }
        LJIIIIZZ();
        LJ();
        C30170Bsk c30170Bsk = new C30170Bsk(this, interfaceC30237Btp);
        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            this.LJLLL = c30170Bsk;
            iMessageManager.addMessageListener(EnumC31509CYf.LIVE_EVENT_MESSAGE.getIntType(), c30170Bsk);
        }
        DataChannel dataChannel2 = this.LJLJLJ;
        if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null && room.liveEventCard != null) {
            LJI();
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_more_function_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(interfaceC30237Btp.getContext());
        if (LIZIZ != null) {
            C30444BxA.LIZJ(EnumC30410Bwc.LIVE_BROADCAST_MORE, LIZIZ, interfaceC30237Btp.LIZ(R.id.ldl), null, 4);
        }
    }
}
