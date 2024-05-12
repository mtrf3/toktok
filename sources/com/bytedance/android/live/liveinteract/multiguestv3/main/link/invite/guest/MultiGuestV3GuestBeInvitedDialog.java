package com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest;

import X.ActivityC45651qj;
import X.B5G;
import X.B83;
import X.BPP;
import X.C05170If;
import X.C0NB;
import X.C0NE;
import X.C10A;
import X.C15380j0;
import X.C16880lQ;
import X.C17M;
import X.C1XY;
import X.C265112h;
import X.C28507BGt;
import X.C28733BPl;
import X.C29044Baa;
import X.C29137Bc5;
import X.C29213BdJ;
import X.C29215BdL;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C29556Biq;
import X.C2A7;
import X.C30868C9o;
import X.C31665Cbl;
import X.C32014ChO;
import X.C41051jJ;
import X.C44878HjO;
import X.C47121t6;
import X.C73411SrX;
import X.C74614TQc;
import X.C74751TVj;
import X.C74769TWb;
import X.C74770TWc;
import X.C74776TWi;
import X.C74824TYe;
import X.C74838TYs;
import X.C74868TZw;
import X.C74885TaD;
import X.C74983Tbn;
import X.C75017TcL;
import X.C75559Tl5;
import X.C77800Ug8;
import X.C78866UxK;
import X.C78926UyI;
import X.C87277YNd;
import X.C88207Yjb;
import X.C8E;
import X.CN1;
import X.EnumC38440F6u;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC75558Tl4;
import X.InterfaceC92693kP;
import X.TMC;
import X.TQH;
import X.TS1;
import X.TU1;
import X.TW6;
import X.TXF;
import X.TY7;
import X.TYD;
import X.U44;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS5S0100200_13;
import Y.ACListenerS5S0401000_13;
import Y.AfS65S0100000_13;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestBeInvitedDialogVisibilityChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAllowShowInivtedDialogOutsideSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestInviteModeInterceptionSkipSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevenueAreaBackUpSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3BeInvitedDialogCountDown;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3TurnOffInvitationOpt;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS100S0101000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestV3GuestBeInvitedDialog extends LiveDialogFragment implements TYD {
    public static final /* synthetic */ int LLFZ = 0;
    public C41051jJ LJLIL;
    public View LJLILLLLZI;
    public C2A7 LJLJI;
    public C2A7 LJLJJI;
    public View LJLJJL;
    public TY7 LJLJJLL;
    public Companion.OnInviteResultListener LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public C47121t6 LJLL;
    public boolean LJLLJ;
    public long LJLLLL;
    public ImageModel LJLLLLLL;
    public TU1 LJLZ;
    public C73411SrX LJZ;
    public C41051jJ LJZI;
    public LiveDialog LJZL;
    public boolean LL;
    public long LLD;
    public MultiGuestConnectDistributeDialog LLF;
    public DataChannel LLFF;
    public boolean LLFFF;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public String LJLLI = "";
    public String LJLLILLLL = "";
    public String LJLLL = "";

    @Override // X.TYD
    public final void LJJLJ() {
        this.LJLJLLL = false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MultiGuestV3GuestBeInvitedDialog() {
        C75559Tl5.LIZIZ.LIZLLL(this);
    }

    public final void Dl() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            TY7 ty7 = this.LJLJJLL;
            if (ty7 != null) {
                ty7.LJFF(10012, room.getOwnerUserId(), "leave_source_reply_pos_limit");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLeave: ");
            LIZ.append(room.getOwnerUserId());
            LIZ.append(", ");
            LIZ.append("leave_source_reply_pos_limit");
            C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ));
        }
    }

    public final void Il() {
        if (this.LJZ != null) {
            C0NB.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", "stopDismissCountdown");
            C73411SrX c73411SrX = this.LJZ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jl() {
        /*
            r5 = this;
            com.bytedance.android.live.design.app.LiveDialog r0 = r5.LJZL
            if (r0 == 0) goto L42
            boolean r1 = r0.isShowing()
            r0 = 1
            if (r1 != r0) goto L42
        Lb:
            java.lang.String r4 = "0"
            java.lang.String r3 = "timeout"
            if (r0 == 0) goto L27
            boolean r0 = r5.LL
            if (r0 == 0) goto L18
            X.C74824TYe.LJJJJJL(r3, r4)
        L18:
            X.Tbn r0 = X.C29556Biq.LIZ()
            r0.getClass()
            X.TWk r0 = X.C74983Tbn.LIZJ()
            X.C74751TVj.LJFF(r3, r4, r0)
        L27:
            long r0 = r5.LLD
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.LJLJLJ
            if (r0 == 0) goto L3f
            java.lang.String r1 = "outside_liveroom"
        L33:
            boolean r0 = r5.LLFFF
            X.C74751TVj.LJI(r3, r4, r1, r2, r0)
            r5.Il()
            r5.dismiss()
            return
        L3f:
            java.lang.String r1 = "in_liveroom"
            goto L33
        L42:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog.Jl():void");
    }

    @Override // X.TYD
    public final void LLILLJJLI() {
        C74776TWi.LJII((Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class), this.dataChannel, true);
        Companion.OnInviteResultListener onInviteResultListener = this.LJLJL;
        if (onInviteResultListener != null) {
            onInviteResultListener.LJJZZI();
        }
        C74614TQc.LIZ().LIZ("multi_guest_guest_preview_page", "agree_invite");
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIJI("reply");
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                TW6 tw6 = new TW6(1);
                tw6.LIZIZ = TXF.GO_LIVE;
                dataChannel.qv0(InteractStateChangeEvent.class, tw6);
            }
            dismiss();
            this.LJLJLLL = false;
            return;
        }
        o.LJIJI("mDataHolder");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cxo);
        c28507BGt.LIZJ = R.style.ac_;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // X.TYD
    public final boolean LLLLLLLLL() {
        if (isShowing() || this.LLFFF) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        LiveDialog liveDialog;
        super.dismiss();
        if (xl()) {
            try {
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null) {
                    long id = room.getId();
                    if (id != 0) {
                        if (this.LJLJJLL != null) {
                            TY7.LJIIIZ(id);
                        }
                    }
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            } catch (Exception unused) {
            }
        }
        if (MultiGuestV3TurnOffInvitationOpt.getValue() == 1 && (liveDialog = this.LJZL) != null) {
            liveDialog.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Il();
        MultiGuestDialogManager LIZ = TS1.LIZ();
        if (LIZ != null) {
            LIZ.kv0(8);
        }
        MultiGuestConnectDistributeDialog multiGuestConnectDistributeDialog = this.LLF;
        if (multiGuestConnectDistributeDialog != null) {
            multiGuestConnectDistributeDialog.dismissAllowingStateLoss();
        }
        this.LLF = null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(LinkInRoomGuestBeInvitedDialogVisibilityChannel.class, Boolean.FALSE);
        }
        TY7 ty7 = this.LJLJJLL;
        if (ty7 != null) {
            ty7.LIZJ();
        }
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            this.LJLJJLL = null;
        }
        C88207Yjb.LJIJI("multi_guest_be_invite_page");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        Window window;
        View decorView;
        super.onStart();
        Long valueOf = Long.valueOf(this.LLD);
        if (this.LJLJLJ) {
            str = "outside_liveroom";
        } else {
            str = "in_liveroom";
        }
        C74751TVj.LJI("show", CardStruct.IStatusCode.DEFAULT, str, valueOf, this.LLFFF);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public final boolean xl() {
        if (MultiGuestV3TurnOffInvitationOpt.getValue() == 1) {
            C41051jJ c41051jJ = this.LJZI;
            if (c41051jJ == null || !c41051jJ.isChecked()) {
                return false;
            }
            return true;
        }
        C41051jJ c41051jJ2 = this.LJLIL;
        if (c41051jJ2 == null || !c41051jJ2.isChecked()) {
            return false;
        }
        return true;
    }

    public final String Al(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_MultiGuestV3GuestBeInvitedDialog_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_MultiGuestV3GuestBeInvitedDialog_", i, LIZ2);
    }

    public final void Gl(int i) {
        TQH tqh;
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("invite_issue_check", "onPermissionGrant");
        int i2 = C74838TYs.LJ().LJJ;
        C29556Biq.LIZ().getClass();
        if (i2 >= C74983Tbn.LJIIIIZZ()) {
            C30868C9o.LIZJ(R.string.mij);
            Dl();
            dismiss();
            return;
        }
        if (this.LJLJLLL) {
            return;
        }
        int i3 = C74838TYs.LJ().LJJ;
        C29556Biq.LIZ().getClass();
        if (i3 >= C74983Tbn.LJIIIIZZ()) {
            C30868C9o.LIZJ(R.string.mij);
            Dl();
            return;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        this.LJLJLLL = true;
        if (this.LJLZ != null && C78926UyI.LJJIJIL()) {
            TU1 tu1 = this.LJLZ;
            if (tu1 == null || (tqh = tu1.LIZ) == null) {
                return;
            }
            tqh.LJJII(new AqS163S0100000_13(this, 551));
            return;
        }
        TY7 ty7 = this.LJLJJLL;
        if (ty7 == null) {
            return;
        }
        ty7.LIZLLL(room.getId(), room.getOwnerUserId(), i, null, this.LJLLLL);
    }

    public final void Hl(String str) {
        C0NB.LIZIZ("Connect_Distribute", "showStatusSettingDialog");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.hide();
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        MultiGuestConnectDistributeDialog multiGuestConnectDistributeDialog = this.LLF;
        if (multiGuestConnectDistributeDialog == null) {
            multiGuestConnectDistributeDialog = C74885TaD.LIZ(str, 2);
            C78866UxK.LJIJJ(multiGuestConnectDistributeDialog, 8, false, false, null, 1, 122);
        }
        C1XY.LJJIIJZLJL(multiGuestConnectDistributeDialog, fragmentManager, C16880lQ.LJLLJ(MultiGuestConnectDistributeDialog.class));
        this.LLF = multiGuestConnectDistributeDialog;
    }

    @Override // X.TYD
    public final void LJJLIIIJL(Throwable th) {
        String str;
        BPP.LIZLLL(getContext(), th, R.string.stz);
        dismiss();
        this.LJLJLLL = false;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doRequestReplyAnchor:");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("invite_issue_check", LIZIZ);
    }

    @Override // X.TYD
    public final void LLLLIILL(boolean z) {
        DataChannel dataChannel;
        dismiss();
        this.LJLJLLL = false;
        if (z && (dataChannel = this.dataChannel) != null) {
            C74776TWi.LJII((Room) dataChannel.kv0(RoomChannel.class), dataChannel, false);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        TY7 ty7;
        C74614TQc.LIZ().LJ();
        C88207Yjb.LJIILIIL("multi_guest_be_invite_page");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("isJoinDirectInvitedDialog", false);
        }
        this.LJLJLJ = z;
        DataChannel dataChannel = this.LLFF;
        if (dataChannel != null) {
            this.dataChannel = dataChannel;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            ty7 = new TY7(this, dataChannel2, this.LJLJLJ);
        } else {
            ty7 = null;
        }
        this.LJLJJLL = ty7;
    }

    public final void vl(int i) {
        try {
            if (getContext() != null) {
                Context context = getContext();
                o.LJI(context);
                Activity wl = wl(context);
                if (wl != null) {
                    EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
                    boolean z = false;
                    if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
                        LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, null, false, 6, null);
                        "Check failed.".toString();
                        throw new IllegalStateException("Check failed.");
                    }
                    if (B5G.LIZIZ().LJ() != 2 && (!MultiGuestInviteModeInterceptionSkipSetting.INSTANCE.isOpt() || !C8E.LIZLLL().eU("multi-guest guest be invite"))) {
                        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                        if (room == null || !C29137Bc5.LIZIZ(room)) {
                            C30868C9o.LIZJ(R.string.mhi);
                            dismiss();
                            return;
                        }
                    } else {
                        int i2 = C74838TYs.LJ().LJJ;
                        C29556Biq.LIZ().getClass();
                        if (i2 >= C74983Tbn.LJIIIIZZ()) {
                            C29556Biq.LIZ().getClass();
                            if (C74983Tbn.LJIIIIZZ() != 0) {
                                C30868C9o.LIZJ(R.string.mij);
                                Dl();
                                dismiss();
                                return;
                            }
                        }
                    }
                    if (!o.LJ(C75017TcL.LIZ, "outside_liveroom")) {
                        C75017TcL.LIZ = "anchor_invite_guest";
                        C74824TYe.LJIIIZ = "anchor_invite_guest";
                    }
                    Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    if (room2 != null && C29137Bc5.LIZIZ(room2)) {
                        z = true;
                    }
                    if (z) {
                        DataChannel dataChannel = this.dataChannel;
                        if (this.mDataHolder != null) {
                            C74770TWc.LIZ(dataChannel, 1, wl, Long.valueOf(r0.LJJIJLIJ), new AqS100S0101000_13(this, i, 1), null);
                            return;
                        } else {
                            o.LJIJI("mDataHolder");
                            throw null;
                        }
                    }
                    DataChannel dataChannel2 = this.dataChannel;
                    if (this.mDataHolder != null) {
                        C74769TWb.LIZ(false, dataChannel2, 1, wl, Long.valueOf(r0.LJJIJLIJ), new AqS100S0101000_13(this, i, 2), null);
                        return;
                    } else {
                        o.LJIJI("mDataHolder");
                        throw null;
                    }
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException unused) {
            Room room3 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room3 != null) {
                TY7 ty7 = this.LJLJJLL;
                if (ty7 != null) {
                    ty7.LJ(room3.getId(), room3.getOwnerUserId());
                }
                C0NB.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", "refuse onPluginNotAvailable");
            }
            dismiss();
        }
    }

    public final Activity wl(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return wl(context);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Companion.OnInviteResultListener onInviteResultListener;
        String str;
        String str2;
        boolean z;
        User owner;
        ImageModel avatarThumb;
        long j;
        String LJIILL;
        Object obj2;
        ActivityC45651qj topFragmentActivity;
        InterfaceC05190Ih interfaceC05190Ih;
        C47121t6 c47121t6;
        Bundle arguments;
        String string;
        Bundle arguments2;
        o.LJIIIZ(view, "view");
        C74614TQc.LIZ().LIZLLL();
        super.onViewCreated(view, bundle);
        Bundle arguments3 = getArguments();
        FragmentManager fragmentManager = null;
        if (arguments3 != null) {
            obj = C16880lQ.LLJJIII(arguments3, "OnLinkMicBuiltListener");
        } else {
            obj = null;
        }
        if (obj instanceof Companion.OnInviteResultListener) {
            onInviteResultListener = (Companion.OnInviteResultListener) obj;
        } else {
            onInviteResultListener = null;
        }
        this.LJLJL = onInviteResultListener;
        Bundle arguments4 = getArguments();
        String str3 = "";
        if (arguments4 == null || (str = arguments4.getString("beInvitedSharePlatform", "")) == null) {
            str = "";
        }
        this.LJLLI = str;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str2 = arguments5.getString("anchorInvitationPosition", "")) == null) {
            str2 = "";
        }
        this.LJLLILLLL = str2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room == null) {
            dismiss();
            return;
        }
        long id = room.getId();
        long ownerUserId = room.getOwnerUserId();
        LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting linkMicMultiGuestV3AndroidModeratorTechSwitchSetting = LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE;
        if (linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue() && (arguments2 = getArguments()) != null) {
            z = arguments2.getBoolean("operatorIsModerator", false);
        } else {
            z = false;
        }
        this.LJLLJ = z;
        if (linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue()) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (string = arguments6.getString("operatorDisplayName", "")) != null) {
                str3 = string;
            }
        } else {
            str3 = C05170If.LIZ(room.getOwner());
            o.LJIIIIZZ(str3, "{\n            DisplayNam…ame(room.owner)\n        }");
        }
        this.LJLLL = str3;
        if (linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue()) {
            Bundle arguments7 = getArguments();
            if (arguments7 != null) {
                avatarThumb = (ImageModel) arguments7.getParcelable("operatorAvatarImageModel");
            }
            avatarThumb = null;
        } else {
            Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room2 != null && (owner = room2.getOwner()) != null) {
                avatarThumb = owner.getAvatarThumb();
            }
            avatarThumb = null;
        }
        this.LJLLLLLL = avatarThumb;
        if (linkMicMultiGuestV3AndroidModeratorTechSwitchSetting.getValue() && (arguments = getArguments()) != null) {
            j = arguments.getLong("operator_uid", ownerUserId);
        } else {
            j = ownerUserId;
        }
        this.LJLLLL = j;
        this.LJLIL = (C41051jJ) view.findViewById(R.id.b7t);
        this.LJLILLLLZI = view.findViewById(R.id.e6s);
        this.LJLL = (C47121t6) view.findViewById(R.id.esl);
        if (!MultiGuestRevenueAreaBackUpSetting.INSTANCE.isShieldUs() && (c47121t6 = this.LJLL) != null) {
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.nce));
            c47121t6.setTextSize(13.0f);
            c47121t6.setTextColor(C15380j0.LIZIZ(R.color.cv));
            C29306Beo.LJJLIIIJ(C15380j0.LIZ(16.0f), c47121t6);
            C29306Beo.LJJJJL(C15380j0.LIZ(16.0f), c47121t6);
        }
        if (MultiGuestV3TurnOffInvitationOpt.getValue() == 1) {
            C41051jJ c41051jJ = this.LJLIL;
            if (c41051jJ != null) {
                c41051jJ.setVisibility(8);
            }
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                view2.setVisibility(4);
            }
        } else {
            C41051jJ c41051jJ2 = this.LJLIL;
            if (c41051jJ2 != null) {
                c41051jJ2.setVisibility(0);
            }
            View view3 = this.LJLILLLLZI;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.esm);
        if (this.LJLLJ) {
            LJIILL = C15380j0.LJIILL(R.string.n3m, this.LJLLL);
        } else {
            LJIILL = C15380j0.LJIILL(R.string.mhr, this.LJLLL);
        }
        textView.setText(LJIILL);
        ImageView imageView = (ImageView) view.findViewById(R.id.a1p);
        ImageModel imageModel = this.LJLLLLLL;
        if (imageModel != null) {
            C31665Cbl.LJIIJ(imageView, imageModel, imageView.getWidth(), imageView.getHeight(), R.drawable.cuk);
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.dzi);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            C31665Cbl.LJIIJ(imageView2, interfaceC05190Ih.getAvatarThumb(), imageView2.getWidth(), imageView2.getHeight(), R.drawable.cuk);
        }
        C2A7 c2a7 = (C2A7) view.findViewById(R.id.mgu);
        o.LJIIIIZZ(c2a7, "this");
        C87277YNd.LJJIJ(c2a7);
        C16880lQ.LJJIII(c2a7, new ACListenerS5S0100200_13(this, id, ownerUserId, 1));
        this.LJLJJI = c2a7;
        View findViewById = view.findViewById(R.id.n3x);
        o.LJIIIIZZ(findViewById, "this");
        C87277YNd.LJJIJ(findViewById);
        this.LJLJJL = findViewById;
        View findViewById2 = view.findViewById(R.id.faf);
        o.LJIIIIZZ(findViewById2, "this");
        C87277YNd.LJJIJ(findViewById2);
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 179), findViewById2);
        C2A7 c2a72 = (C2A7) view.findViewById(R.id.lz_);
        o.LJIIIIZZ(c2a72, "this");
        C87277YNd.LJJIJ(c2a72);
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 549);
        C29213BdJ c29213BdJ = new C29213BdJ();
        Context context = getContext();
        o.LJI(context);
        C16880lQ.LJIIJ(new ACListenerS5S0401000_13(c29213BdJ, new C29215BdL(context, this.dataChannel, new AqS100S0101000_13(this, 13), new AqS163S0100000_13(this, 550), 0, 32), this, aqS163S0100000_13, 2), c2a72);
        this.LJLJI = c2a72;
        c2a72.setEnabled(false);
        long value = LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue();
        int value2 = MultiGuestV3BeInvitedDialogCountDown.getValue();
        if (value2 != 0) {
            C44878HjO.LIZJ("startDismissCountDown maxCountDownValue:", value, "MultiGuestV3GuestBeInvitedDialog");
            InterfaceC92693kP LJJJLIIL = C265112h.LIZ(TMC.LJIL(0L, 1L, TimeUnit.SECONDS)).LJJJLIIL(new C74868TZw(this, value, value2), new AfS65S0100000_13(this, 211));
            Il();
            this.LJZ = (C73411SrX) LJJJLIIL;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, CheckPermissionSucc.class, new AqS179S0100000_13(this, 137));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(LinkInRoomGuestBeInvitedDialogVisibilityChannel.class, Boolean.TRUE);
        }
        C74614TQc.LIZ().LIZJ(view);
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            obj2 = dataChannel3.kv0(C29494Bhq.class);
        } else {
            obj2 = null;
        }
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null && (topFragmentActivity = iHostAction.getTopFragmentActivity()) != null) {
            fragmentManager = topFragmentActivity.getSupportFragmentManager();
        }
        if (!o.LJ(obj2, fragmentManager) && LinkMicAllowShowInivtedDialogOutsideSetting.isEnable()) {
            this.LLFFF = true;
        }
    }

    /* loaded from: classes14.dex */
    public static final class Companion {

        /* loaded from: classes14.dex */
        public interface OnInviteResultListener extends Parcelable {
            void LJJZZI();
        }

        public static MultiGuestV3GuestBeInvitedDialog LIZ(OnInviteResultListener onInviteResultListener, boolean z, String beInvitedSharePlatform, String anchorInvitationPosition, TU1 tu1, boolean z2, String operatorDisplayName, long j, ImageModel imageModel, DataChannel dataChannel) {
            o.LJIIIZ(beInvitedSharePlatform, "beInvitedSharePlatform");
            o.LJIIIZ(anchorInvitationPosition, "anchorInvitationPosition");
            o.LJIIIZ(operatorDisplayName, "operatorDisplayName");
            MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = new MultiGuestV3GuestBeInvitedDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("OnLinkMicBuiltListener", onInviteResultListener);
            bundle.putBoolean("isJoinDirectInvitedDialog", z);
            bundle.putString("beInvitedSharePlatform", beInvitedSharePlatform);
            bundle.putString("anchorInvitationPosition", anchorInvitationPosition);
            bundle.putBoolean("operatorIsModerator", z2);
            bundle.putString("operatorDisplayName", operatorDisplayName);
            bundle.putLong("operator_uid", j);
            bundle.putParcelable("operatorAvatarImageModel", imageModel);
            multiGuestV3GuestBeInvitedDialog.setArguments(bundle);
            multiGuestV3GuestBeInvitedDialog.LJLZ = tu1;
            multiGuestV3GuestBeInvitedDialog.LLFF = dataChannel;
            return multiGuestV3GuestBeInvitedDialog;
        }
    }
}
