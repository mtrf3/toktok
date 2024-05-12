package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.VoiceChatShowStatusEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplicantNumChangedForModeratorChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestMgrPopUpShowScreenSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWH implements InterfaceViewOnClickListenerC30227Btf, InterfaceC74790TWw {
    public DataChannel LJLIL;
    public C47121t6 LJLILLLLZI;
    public InterfaceC30237Btp LJLJI;
    public LiveActionSheetDialog LJLJJI;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mMultiGuestDataHolder;

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

    public final MultiGuestDataHolder LIZIZ() {
        MultiGuestDataHolder multiGuestDataHolder = this.mMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mMultiGuestDataHolder");
        throw null;
    }

    public final C41031jH LIZJ() {
        int i;
        Integer num;
        C41021jG c41021jG = new C41021jG();
        Object[] objArr = new Object[1];
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(MultiGuestApplicantNumChangedForModeratorChannel.class)) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        c41021jG.LIZ = C15380j0.LJIILL(R.string.n8j, objArr);
        c41021jG.LIZJ = new TWI(this);
        return new C41031jH(c41021jG);
    }

    public final void LJ() {
        int i;
        Integer num;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(MultiGuestApplicantNumChangedForModeratorChannel.class)) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C47121t6 c47121t6 = this.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText(String.valueOf(i));
        }
        if (i > 0) {
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
        } else {
            C29306Beo.LJIIIZ(this.LJLILLLLZI);
        }
    }

    @Override // X.InterfaceC74790TWw
    public final void LIZ(boolean z) {
        Boolean bool;
        View LJFF;
        LiveActionSheetDialog liveActionSheetDialog = this.LJLJJI;
        Context context = null;
        if (liveActionSheetDialog != null) {
            bool = Boolean.valueOf(liveActionSheetDialog.isShowing());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            LiveActionSheetDialog liveActionSheetDialog2 = this.LJLJJI;
            if (liveActionSheetDialog2 != null) {
                liveActionSheetDialog2.dismiss();
            }
            InterfaceC30237Btp interfaceC30237Btp = this.LJLJI;
            if (interfaceC30237Btp != null && (LJFF = interfaceC30237Btp.LJFF()) != null) {
                context = LJFF.getContext();
            }
            LIZLLL(context, true);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        LIZLLL(context, true);
    }

    public final void LIZLLL(Context context, boolean z) {
        Boolean bool;
        Boolean bool2;
        String LJIILJJIL;
        long j;
        Room room;
        User owner;
        FollowInfo followInfo;
        LiveActionSheetDialog liveActionSheetDialog = this.LJLJJI;
        LiveMode liveMode = null;
        if (liveActionSheetDialog != null) {
            bool = Boolean.valueOf(liveActionSheetDialog.isShowing());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return;
        }
        if (z) {
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                j = followInfo.getFollowStatus();
            } else {
                j = 0;
            }
            C75457TjR.LJIJJLI(j, "plus_button", "multi_guest", true);
        }
        if (context != null) {
            C2A6 c2a6 = new C2A6(context);
            ArrayList arrayList = new ArrayList();
            U35 LIZ = TQA.LIZ();
            if (LIZ != null) {
                bool2 = Boolean.valueOf(LIZ.LJIIJJI());
            } else {
                bool2 = null;
            }
            if (C29306Beo.LJJIFFI(bool2)) {
                C41021jG c41021jG = new C41021jG();
                c41021jG.LIZ = C15380j0.LJIILJJIL(R.string.ndf);
                c41021jG.LIZJ = new TWE(this);
                arrayList.add(new C41031jH(c41021jG));
            }
            if (1 == MultiGuestV3GuestMgrPopUpShowScreenSetting.getValue()) {
                DataChannel dataChannel2 = this.LJLIL;
                if (dataChannel2 != null) {
                    liveMode = (LiveMode) dataChannel2.kv0(BCX.class);
                }
                if (C29137Bc5.LIZ(liveMode)) {
                    C41021jG c41021jG2 = new C41021jG();
                    if (LIZIZ().LIZLLL) {
                        LJIILJJIL = C15380j0.LJIILJJIL(R.string.neh);
                    } else {
                        LJIILJJIL = C15380j0.LJIILJJIL(R.string.nei);
                    }
                    c41021jG2.LIZ = LJIILJJIL;
                    c41021jG2.LIZJ = new TWF(this);
                    arrayList.add(new C41031jH(c41021jG2));
                } else {
                    C41021jG c41021jG3 = new C41021jG();
                    c41021jG3.LIZ = C15380j0.LJIILJJIL(R.string.n_1);
                    c41021jG3.LIZJ = new TWB(this);
                    arrayList.add(new C41031jH(c41021jG3));
                }
            }
            if (C74789TWv.LIZIZ()) {
                arrayList.add(LIZJ());
            }
            C41021jG c41021jG4 = new C41021jG();
            c41021jG4.LIZ = C15380j0.LJIILJJIL(R.string.nay);
            c41021jG4.LIZJ = new TWD(this);
            arrayList.add(new C41031jH(c41021jG4));
            C41021jG c41021jG5 = new C41021jG();
            c41021jG5.LIZ = C15380j0.LJIILJJIL(R.string.now);
            c41021jG5.LIZJ = new TWG(this);
            arrayList.add(new C41031jH(c41021jG5));
            c2a6.LIZIZ(arrayList);
            C30101Gc c30101Gc = new C30101Gc();
            c30101Gc.LIZ = C15380j0.LJIILJJIL(R.string.snx);
            c30101Gc.LIZJ = TWJ.LJLIL;
            c2a6.LIZLLL = new C30111Gd(c30101Gc);
            this.LJLJJI = c2a6.LIZ();
        }
        LiveActionSheetDialog liveActionSheetDialog2 = this.LJLJJI;
        if (liveActionSheetDialog2 == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/view/sheet/action/LiveActionSheetDialog", "show", liveActionSheetDialog2, new Object[0], "void", new C65300Pk0(false, "()V", "-7963073765520314218")).LIZ) {
            return;
        }
        liveActionSheetDialog2.show();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            C74789TWv.LIZJ.remove(this);
            this.LJLJI = null;
        }
        this.LJLJJI = null;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        C75559Tl5.LIZIZ.LIZLLL(this);
        this.LJLIL = dataChannel;
        if (dataChannel != null) {
            dataChannel.mv0(VoiceChatShowStatusEvent.class, this, new AqS144S0200000_13(this, interfaceC30237Btp, 38));
        }
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            this.LJLJI = interfaceC30237Btp;
            this.LJLILLLLZI = (C47121t6) interfaceC30237Btp.LIZ(R.id.nbp);
            LJ();
            if (dataChannel != null) {
                dataChannel.mv0(MultiGuestApplicantNumChangedForModeratorChannel.class, this, new AqS179S0100000_13(this, 401));
            }
            C74789TWv.LIZJ.add(this);
        }
    }
}
