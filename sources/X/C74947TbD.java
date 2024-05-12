package X;

import Y.AfS25S0301000_13;
import Y.AfS62S0200000_13;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PunishSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TbD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74947TbD {
    public static final java.util.Map<Long, Long> LIZ = new LinkedHashMap();
    public static final int LIZIZ = 2460;
    public static long LIZJ;

    public static void LJI(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "3065468235990685154")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static long LJIIIIZZ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }

    public static LinkPlayerInfo LJIIIZ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return null;
        }
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LIZIZ = 0;
        linkPlayerInfo.mInteractIdStr = C78886Uxe.LJJJJLL(C8E.LJ());
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        linkPlayerInfo.mUser = owner;
        return linkPlayerInfo;
    }

    public static boolean LJIIJJI() {
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null) {
            return LJJZZI.LJJIJIIJI();
        }
        return true;
    }

    public static boolean LJIILL() {
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        return LJIILLIIL(LJ);
    }

    public static boolean LJIJ() {
        if (System.currentTimeMillis() - LIZJ <= 500) {
            return true;
        }
        LIZJ = System.currentTimeMillis();
        return false;
    }

    public static boolean LJJI() {
        if (C74838TYs.LJ().LJIIIIZZ) {
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            if (LJIILLIIL(LJ)) {
                return true;
            }
        }
        return false;
    }

    public static int LJIIJ(LinkPlayerInfo linkPlayerInfo) {
        User user;
        FollowInfo followInfo;
        if (linkPlayerInfo == null || (user = linkPlayerInfo.mUser) == null || (followInfo = user.getFollowInfo()) == null) {
            return 0;
        }
        return (int) followInfo.getFollowStatus();
    }

    public static int LJIIL(InterfaceC75179Tex window) {
        int i;
        int i2;
        o.LJIIIZ(window, "window");
        ViewGroup.LayoutParams layoutParams = window.LJJIJIL().getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = window.LJJIJIL().getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        } else {
            i2 = 0;
        }
        int LJIIJJI = i2 - C87277YNd.LJIIJJI(45);
        if (i > LJIIJJI) {
            i = LJIIJJI;
        }
        if (i < C87277YNd.LJIIJJI(45)) {
            return C87277YNd.LJIIJJI(25);
        }
        int LJIIJJI2 = C87277YNd.LJIIJJI(45);
        if (i <= C87277YNd.LJIIJJI(70) && LJIIJJI2 <= i) {
            return C87277YNd.LJIIJJI(40);
        }
        int LJIIJJI3 = C87277YNd.LJIIJJI(70);
        if (i <= C87277YNd.LJIIJJI(100) && LJIIJJI3 <= i) {
            return C87277YNd.LJIIJJI(48);
        }
        return C87277YNd.LJIIJJI(60);
    }

    public static boolean LJIILLIIL(User user) {
        User user2;
        o.LJIIIZ(user, "<this>");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            user2 = room.getOwner();
        } else {
            user2 = null;
        }
        if (user2 == null || user2.getId() != user.getId() || user.getId() == 0) {
            return false;
        }
        return true;
    }

    public static boolean LJIIZILJ(Long l) {
        User owner;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null && (owner = room.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        }
        return o.LJ(l2, l);
    }

    public static boolean LJIJI(C28467BFf response) {
        o.LJIIIZ(response, "response");
        if (response.statusCode == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJ(C28467BFf c28467BFf) {
        if (c28467BFf != null && c28467BFf.statusCode == 0 && c28467BFf.data != 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
        if (MultiGuestV3PunishSetting.INSTANCE.isEnable() && o.LJ(source, "business_mute_source_audio_mute_punish")) {
            return true;
        }
        return false;
    }

    public static String LJJIFFI(Long l) {
        TQ8 tq8;
        AbstractC74727TUl LIZ2;
        LinkListUser linkListUser;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        AbstractC74727TUl LIZ3;
        LinkPlayerInfo linkPlayerInfo;
        boolean LJIILL = LJIILL();
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (obj instanceof TQ8) {
            tq8 = (TQ8) obj;
        } else {
            tq8 = null;
        }
        if (l == null) {
            return null;
        }
        l.longValue();
        if (LJIILL) {
            Object obj2 = c75559Tl5.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (!(obj2 instanceof InterfaceC31805Ce1) || (interfaceC31805Ce1 = (InterfaceC31805Ce1) obj2) == null || (LIZ3 = interfaceC31805Ce1.LIZ()) == null || (linkPlayerInfo = (LinkPlayerInfo) LIZ3.LIZLLL(l.longValue())) == null) {
                return null;
            }
            return linkPlayerInfo.mInteractIdStr;
        }
        if (tq8 == null || (LIZ2 = tq8.LIZ()) == null || (linkListUser = (LinkListUser) LIZ2.LIZLLL(l.longValue())) == null) {
            return null;
        }
        return linkListUser.linkMicId;
    }

    public static int LIZ(LinkPlayerInfo linkPlayerInfo, MultiGuestDataHolder dataHolder) {
        o.LJIIIZ(dataHolder, "dataHolder");
        String str = null;
        if (linkPlayerInfo != null) {
            str = linkPlayerInfo.mInteractIdStr;
        }
        Boolean LIZJ2 = dataHolder.LIZJ(str);
        if (LIZJ2 != null) {
            boolean booleanValue = LIZJ2.booleanValue();
            Integer num = 2;
            num.intValue();
            if (booleanValue) {
                return num.intValue();
            }
        }
        return 1;
    }

    public static int LIZIZ(LinkListUser linkListUser, MultiGuestDataHolder dataHolder) {
        o.LJIIIZ(dataHolder, "dataHolder");
        String str = null;
        if (linkListUser != null) {
            str = linkListUser.linkMicId;
        }
        Boolean LIZJ2 = dataHolder.LIZJ(str);
        if (LIZJ2 != null) {
            boolean booleanValue = LIZJ2.booleanValue();
            Integer num = 2;
            num.intValue();
            if (booleanValue) {
                return num.intValue();
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (r0.mLinkType == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r6, com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r7) {
        /*
            java.lang.String r0 = "dataHolder"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            if (r6 == 0) goto L7b
            long r0 = r6.linkTypePermission
        L9:
            int r2 = X.TRK.LIZIZ(r0)
            r1 = 3
            r0 = 0
            r5 = 1
            if (r2 == r1) goto L14
            if (r2 != r5) goto L79
        L14:
            r3 = 1
        L15:
            X.Tl5 r1 = X.C75559Tl5.LIZIZ
            java.util.HashMap r2 = r1.LIZJ()
            java.lang.String r1 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r4 = r2.get(r1)
            boolean r2 = r4 instanceof X.InterfaceC31805Ce1
            r1 = 0
            if (r2 == 0) goto L77
            X.Ce1 r4 = (X.InterfaceC31805Ce1) r4
        L28:
            if (r3 != 0) goto L2b
        L2a:
            return r0
        L2b:
            if (r6 == 0) goto L2f
            java.lang.String r1 = r6.mInteractIdStr
        L2f:
            java.lang.Boolean r1 = r7.LJIIJ(r1)
            r0 = 2
            if (r1 == 0) goto L48
            boolean r1 = r1.booleanValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r0.intValue()
            if (r1 == 0) goto L65
            int r0 = r0.intValue()
            goto L2a
        L48:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r3.intValue()
            if (r4 == 0) goto L72
            X.TUl r2 = r4.LIZ()
            if (r2 == 0) goto L72
            if (r6 == 0) goto L5d
            java.lang.String r1 = r6.mInteractIdStr
            if (r1 != 0) goto L5f
        L5d:
            java.lang.String r1 = ""
        L5f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L67
        L65:
            r0 = 1
            goto L2a
        L67:
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C76917UGr.LJJIJIIJIL(r2, r1)
            if (r0 == 0) goto L65
            int r0 = r0.mLinkType
            if (r0 != r5) goto L72
            goto L65
        L72:
            int r0 = r3.intValue()
            goto L2a
        L77:
            r4 = r1
            goto L28
        L79:
            r3 = 0
            goto L15
        L7b:
            r0 = 3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74947TbD.LIZJ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (r0.linkType == 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r8, com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r9) {
        /*
            java.lang.String r0 = "dataHolder"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            long r2 = r9.LJJIZ
            r6 = 3
            r0 = 0
            r5 = 1
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 == 0) goto L15
            r6 = 1
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L7a
        L15:
            r3 = 1
        L16:
            X.Tl5 r1 = X.C75559Tl5.LIZIZ
            java.util.HashMap r2 = r1.LIZJ()
            java.lang.String r1 = "MULTI_GUEST_V3_GUEST_USER_MANAGER"
            java.lang.Object r4 = r2.get(r1)
            boolean r2 = r4 instanceof X.TQ8
            r1 = 0
            if (r2 == 0) goto L78
            X.TQ8 r4 = (X.TQ8) r4
        L29:
            if (r3 != 0) goto L2c
        L2b:
            return r0
        L2c:
            if (r8 == 0) goto L30
            java.lang.String r1 = r8.linkMicId
        L30:
            java.lang.Boolean r1 = r9.LJIIJ(r1)
            r0 = 2
            if (r1 == 0) goto L49
            boolean r1 = r1.booleanValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r0.intValue()
            if (r1 == 0) goto L66
            int r0 = r0.intValue()
            goto L2b
        L49:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r3.intValue()
            if (r4 == 0) goto L73
            X.TUl r2 = r4.LIZ()
            if (r2 == 0) goto L73
            if (r8 == 0) goto L5e
            java.lang.String r1 = r8.linkMicId
            if (r1 != 0) goto L60
        L5e:
            java.lang.String r1 = ""
        L60:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L68
        L66:
            r0 = 1
            goto L2b
        L68:
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = X.C76917UGr.LJJIJIL(r2, r1)
            if (r0 == 0) goto L66
            int r0 = r0.linkType
            if (r0 != r5) goto L73
            goto L66
        L73:
            int r0 = r3.intValue()
            goto L2b
        L78:
            r4 = r1
            goto L29
        L7a:
            r3 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74947TbD.LIZLLL(com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser, com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder):int");
    }

    public static C47121t6 LJIILIIL(Context context, String str) {
        C47121t6 c47121t6 = new C47121t6(context, null);
        c47121t6.setText(str);
        c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        c47121t6.setGravity(17);
        c47121t6.setTextSize(15.0f);
        c47121t6.setTextColor(C15380j0.LIZIZ(R.color.cu));
        return c47121t6;
    }

    public static void LJIILJJIL(Context context, Throwable th) {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.sp2);
        o.LJIIIIZZ(LJIILJJIL, "getString(strId)");
        if (th == null || context == null) {
            return;
        }
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            String prompt = c29401Dk.getPrompt();
            String alert = c29401Dk.getAlert();
            if (!TextUtils.isEmpty(alert)) {
                BPP.LIZ(context, alert, context.getResources().getString(R.string.sol));
                return;
            } else if (!TextUtils.isEmpty(prompt)) {
                C30868C9o.LJFF(context, prompt);
                return;
            } else {
                C30868C9o.LJFF(context, LJIILJJIL);
                return;
            }
        }
        C30868C9o.LIZLLL(R.string.sp2, context);
    }

    public static boolean LJIL(MotionEvent motionEvent, View view) {
        if (motionEvent == null || view == null) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public static boolean LJ(String str, Context context, C73318Sq2 compositeDisposable) {
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
            C29356Bfc c29356Bfc = new C29356Bfc();
            c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.sot);
            c29356Bfc.LIZJ = -1;
            c29356Bfc.LJ = "gift";
            c29356Bfc.LJFF = str;
            c29356Bfc.LIZLLL = "popup";
            ((C29374Bfu) LIZIZ2).LIZLLL(context, new C29377Bfx(c29356Bfc)).LIZ(new C29618Bjq(compositeDisposable));
            return false;
        }
        if (C2NU.LIZ.LIZIZ()) {
            return true;
        }
        C30868C9o.LIZJ(R.string.n0o);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r8, int r9, boolean r10) {
        /*
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3 = 0
            if (r8 == 0) goto Ld9
            com.bytedance.android.live.base.model.user.User r0 = r8.mUser
            if (r0 == 0) goto Ld9
            java.lang.String r0 = X.C05170If.LIZ(r0)
        Le:
            r7 = 0
            r1[r7] = r0
            r0 = 2131839865(0x7f114b79, float:1.9312994E38)
            java.lang.String r6 = X.C15380j0.LJIILL(r0, r1)
            java.lang.String r5 = "getString(R.string.pm_mu…ils.getDisplayName(it) })"
            if (r6 == 0) goto Lbd
            if (r10 == 0) goto Lbd
        L1e:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            if (r8 == 0) goto Lba
            com.bytedance.android.live.base.model.user.User r0 = r8.mUser
            if (r0 == 0) goto Lba
            java.lang.String r0 = X.C05170If.LIZ(r0)
        L2a:
            r1[r7] = r0
            r0 = 2131839868(0x7f114b7c, float:1.9313E38)
            java.lang.String r4 = X.C15380j0.LJIILL(r0, r1)
            if (r4 == 0) goto L9f
            if (r10 == 0) goto L9f
        L37:
            boolean r0 = X.C30922CBq.LIZIZ
            if (r0 != 0) goto L9d
            if (r8 == 0) goto L9b
            int r1 = r8.appVersion
        L3f:
            int r0 = X.C74947TbD.LIZIZ
            if (r1 >= r0) goto L9d
            if (r9 != r2) goto L97
            X.C30868C9o.LJI(r6)
        L48:
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            java.lang.String r0 = "checkMuteLimitedAndShowToast-> userid:"
            r5.append(r0)
            if (r8 == 0) goto L95
            com.bytedance.android.live.base.model.user.User r0 = r8.mUser
            if (r0 == 0) goto L95
            java.lang.String r0 = r0.getIdStr()
        L5b:
            r5.append(r0)
            java.lang.String r0 = " , interactId:"
            r5.append(r0)
            if (r8 == 0) goto L93
            java.lang.String r4 = r8.mInteractIdStr
        L67:
            java.lang.String r1 = " , status:"
            java.lang.String r0 = " , isOpCamera:"
            X.C0EH.LIZLLL(r5, r4, r1, r9, r0)
            r5.append(r10)
            java.lang.String r0 = " , appVersion:"
            r5.append(r0)
            if (r8 == 0) goto L7e
            int r0 = r8.appVersion
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L7e:
            r5.append(r3)
            java.lang.String r0 = " , limited:"
            r5.append(r0)
            r5.append(r2)
            java.lang.String r1 = X.X1D.LIZIZ(r5)
            java.lang.String r0 = "anchorMuteGuest/anchor"
            X.C0NB.LJIIIZ(r0, r1)
            return r2
        L93:
            r4 = r3
            goto L67
        L95:
            r0 = r3
            goto L5b
        L97:
            X.C30868C9o.LJI(r4)
            goto L48
        L9b:
            r1 = 0
            goto L3f
        L9d:
            r2 = 0
            goto L48
        L9f:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            if (r8 == 0) goto Lb8
            com.bytedance.android.live.base.model.user.User r0 = r8.mUser
            if (r0 == 0) goto Lb8
            java.lang.String r0 = X.C05170If.LIZ(r0)
        Lab:
            r1[r7] = r0
            r0 = 2131839869(0x7f114b7d, float:1.9313002E38)
            java.lang.String r4 = X.C15380j0.LJIILL(r0, r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r5)
            goto L37
        Lb8:
            r0 = r3
            goto Lab
        Lba:
            r0 = r3
            goto L2a
        Lbd:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            if (r8 == 0) goto Ld7
            com.bytedance.android.live.base.model.user.User r0 = r8.mUser
            if (r0 == 0) goto Ld7
            java.lang.String r0 = X.C05170If.LIZ(r0)
        Lc9:
            r1[r7] = r0
            r0 = 2131839866(0x7f114b7a, float:1.9312996E38)
            java.lang.String r6 = X.C15380j0.LJIILL(r0, r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r5)
            goto L1e
        Ld7:
            r0 = r3
            goto Lc9
        Ld9:
            r0 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74947TbD.LJFF(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, int, boolean):boolean");
    }

    public static C24130x7 LJII(MultiGuestDataHolder mDataHolder, boolean z, boolean z2, int i) {
        String LIZLLL;
        o.LJIIIZ(mDataHolder, "mDataHolder");
        C24130x7 c24130x7 = new C24130x7();
        c24130x7.LIZ = C74740TUy.LIZLLL().LJ;
        c24130x7.LIZIZ = C74740TUy.LIZLLL().LJFF;
        c24130x7.LJ = i;
        c24130x7.LJI = z;
        c24130x7.LJFF = z2;
        c24130x7.LIZJ = C74740TUy.LIZLLL().LJI;
        c24130x7.LIZLLL = C74740TUy.LIZLLL().LJII;
        if (C74740TUy.LIZLLL().LJIIJJI == 2) {
            String LIZLLL2 = C74838TYs.LJ().LIZLLL();
            if (LIZLLL2 != null) {
                mDataHolder.LJIILJJIL(LIZLLL2, true);
            }
            c24130x7.LJFF = false;
        } else if (C74740TUy.LIZLLL().LJIIJJI == 1 && (LIZLLL = C74838TYs.LJ().LIZLLL()) != null) {
            mDataHolder.LJIILJJIL(LIZLLL, false);
        }
        return c24130x7;
    }

    public static void LJJII(Long l, DataChannel dataChannel, InterfaceC75179Tex window, C47061t0 c47061t0) {
        int i;
        int i2;
        int LJIIJJI;
        java.util.Map map;
        o.LJIIIZ(window, "window");
        ViewGroup.LayoutParams layoutParams = window.LJJIJIL().getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = window.LJJIJIL().getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        } else {
            i2 = 0;
        }
        int LJIIJJI2 = i2 - C87277YNd.LJIIJJI(45);
        if (i > LJIIJJI2) {
            i = LJIIJJI2;
        }
        if (i < C87277YNd.LJIIJJI(45)) {
            LJIIJJI = C87277YNd.LJIIJJI(25);
        } else {
            int LJIIJJI3 = C87277YNd.LJIIJJI(45);
            if (i <= C87277YNd.LJIIJJI(70) && LJIIJJI3 <= i) {
                LJIIJJI = C87277YNd.LJIIJJI(40);
            } else {
                int LJIIJJI4 = C87277YNd.LJIIJJI(70);
                if (i <= C87277YNd.LJIIJJI(100) && LJIIJJI4 <= i) {
                    LJIIJJI = C87277YNd.LJIIJJI(48);
                } else {
                    LJIIJJI = C87277YNd.LJIIJJI(60);
                }
            }
        }
        if (dataChannel != null && (map = (java.util.Map) dataChannel.kv0(BDA.class)) != null && l != null) {
            map.put(Long.valueOf(l.longValue()), Integer.valueOf(LJIIJJI));
        }
        LinkMicMultiGuestV3MaskAvatarSizeTestSetting linkMicMultiGuestV3MaskAvatarSizeTestSetting = LinkMicMultiGuestV3MaskAvatarSizeTestSetting.INSTANCE;
        if (linkMicMultiGuestV3MaskAvatarSizeTestSetting.enableTest()) {
            LJIIJJI = C87277YNd.LJIIJJI(linkMicMultiGuestV3MaskAvatarSizeTestSetting.getValue());
        }
        if (c47061t0 != null) {
            ViewGroup.LayoutParams layoutParams3 = c47061t0.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = LJIIJJI;
                layoutParams3.width = LJIIJJI;
            }
            if (c47061t0 == null) {
                return;
            }
            c47061t0.setLayoutParams(layoutParams3);
        }
    }

    public static void LJJ(Context context, LinkPlayerInfo linkPlayerInfo, int i, C73318Sq2 mCompositeDisposable, TZL tzl) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        long j;
        User user;
        User user2;
        o.LJIIIZ(mCompositeDisposable, "mCompositeDisposable");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("realAnchorMuteGuestOp-> userid:");
        Long l = null;
        if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
            str = user2.getIdStr();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(" , interactId:");
        if (linkPlayerInfo != null) {
            str2 = linkPlayerInfo.mInteractIdStr;
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        LIZ2.append(" , appVersion:");
        if (linkPlayerInfo != null) {
            num = Integer.valueOf(linkPlayerInfo.appVersion);
        } else {
            num = null;
        }
        LIZ2.append(num);
        C0NB.LJIIIZ("anchorMuteGuest/anchor", X1D.LIZIZ(LIZ2));
        C74983Tbn LIZ3 = C29556Biq.LIZ();
        if (tzl != null) {
            num2 = Integer.valueOf(tzl.getFlag());
        } else {
            num2 = null;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        long LJIIIIZZ = LJIIIIZZ();
        long LJJJLIIL = C78886Uxe.LJJJLIIL(C8E.LJ());
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            l = Long.valueOf(user.getId());
        }
        LIZ3.getClass();
        C65814PsI.LIZ().getClass();
        mCompositeDisposable.LIZ(C1EW.LIZ(((MultiLiveApi) C65814PsI.LIZJ(MultiLiveApi.class)).anchorMuteGuest(j, LJIIIIZZ, LJJJLIIL, l, i, num2)).LJJJLIIL(new AfS25S0301000_13(i, linkPlayerInfo, tzl, context, 5), new AfS62S0200000_13(linkPlayerInfo, context, 77)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIII(android.widget.ImageView r5, int r6, android.content.Context r7, boolean r8, boolean r9) {
        /*
            java.lang.String r0 = "button"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r4 = 2131235289(0x7f0811d9, float:1.8086768E38)
            if (r9 == 0) goto L20
            boolean r0 = r5 instanceof com.bytedance.android.live.design.view.icon.LiveIconView
            if (r0 == 0) goto L18
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            android.graphics.drawable.Drawable r0 = X.C15400j2.LIZ(r4)
            r5.setIcon(r0)
        L17:
            return
        L18:
            android.graphics.drawable.Drawable r0 = X.C15400j2.LIZ(r4)
            r5.setImageDrawable(r0)
            goto L17
        L20:
            r3 = 1
            if (r8 != 0) goto L41
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.0Mx r2 = X.CN1.LIZ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r2 = (com.bytedance.android.live.liveinteract.api.IInteractService) r2
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r0 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto Lad
            java.lang.String r0 = X.C17280m4.LIZ(r0)
        L3b:
            boolean r0 = r2.gt(r0)
            if (r0 == 0) goto Lab
        L41:
            r2 = 1
        L42:
            if (r6 == r3) goto L7a
            r0 = 2
            if (r6 == r0) goto L48
        L47:
            return
        L48:
            boolean r0 = r5 instanceof com.bytedance.android.live.design.view.icon.LiveIconView
            if (r0 == 0) goto L65
            if (r2 == 0) goto L58
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            android.graphics.drawable.Drawable r0 = X.C15400j2.LIZ(r4)
            r5.setIcon(r0)
            goto L47
        L58:
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            r0 = 2130970640(0x7f040810, float:1.7549996E38)
            int r0 = X.C259910h.LJ(r0, r7)
            r5.setIcon(r0)
            goto L47
        L65:
            if (r2 == 0) goto L6f
            android.graphics.drawable.Drawable r0 = X.C15400j2.LIZ(r4)
            r5.setImageDrawable(r0)
            goto L47
        L6f:
            r0 = 2131235288(0x7f0811d8, float:1.8086766E38)
            android.graphics.drawable.Drawable r0 = X.C15400j2.LIZ(r0)
            r5.setImageDrawable(r0)
            goto L47
        L7a:
            boolean r1 = r5 instanceof com.bytedance.android.live.design.view.icon.LiveIconView
            r0 = 2131235291(0x7f0811db, float:1.8086772E38)
            if (r1 == 0) goto L96
            if (r2 == 0) goto L89
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            r5.setIcon(r0)
            goto L47
        L89:
            com.bytedance.android.live.design.view.icon.LiveIconView r5 = (com.bytedance.android.live.design.view.icon.LiveIconView) r5
            r0 = 2130970638(0x7f04080e, float:1.7549992E38)
            int r0 = X.C259910h.LJ(r0, r7)
            r5.setIcon(r0)
            goto L47
        L96:
            if (r2 == 0) goto La0
            android.graphics.drawable.Drawable r0 = X.C15400j2.LIZ(r0)
            r5.setImageDrawable(r0)
            goto L47
        La0:
            r0 = 2131235290(0x7f0811da, float:1.808677E38)
            android.graphics.drawable.Drawable r0 = X.C15400j2.LIZ(r0)
            r5.setImageDrawable(r0)
            goto L47
        Lab:
            r2 = 0
            goto L42
        Lad:
            r0 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74947TbD.LJJIII(android.widget.ImageView, int, android.content.Context, boolean, boolean):void");
    }

    public static void LJJIIJ(ImageView button, int i, Context context, boolean z, Boolean bool) {
        o.LJIIIZ(button, "button");
        if (!o.LJ(bool, Boolean.TRUE)) {
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            if (!C29306Beo.LJIL(Boolean.valueOf(LJIILLIIL(LJ)))) {
                C87277YNd.LJJIJ(button);
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        if (button instanceof LiveIconView) {
                            if (z) {
                                ((LiveIconView) button).setIcon(R.drawable.d11);
                                return;
                            } else {
                                ((LiveIconView) button).setIcon(C259910h.LJ(R.attr.avy, context));
                                return;
                            }
                        }
                        if (z) {
                            button.setImageDrawable(C15400j2.LIZ(R.drawable.d11));
                            return;
                        } else {
                            button.setImageDrawable(C15400j2.LIZ(R.drawable.d0w));
                            return;
                        }
                    }
                    if (button instanceof LiveIconView) {
                        if (z) {
                            ((LiveIconView) button).setIcon(C15400j2.LIZ(R.drawable.d0x));
                            return;
                        } else {
                            ((LiveIconView) button).setIcon(C259910h.LJ(R.attr.avx, context));
                            return;
                        }
                    }
                    if (z) {
                        button.setImageDrawable(C15400j2.LIZ(R.drawable.d0x));
                        return;
                    } else {
                        button.setImageDrawable(C15400j2.LIZ(R.drawable.d0z));
                        return;
                    }
                }
                if (button instanceof LiveIconView) {
                    ((LiveIconView) button).setIcon(R.drawable.d0x);
                    return;
                } else {
                    button.setImageDrawable(C15400j2.LIZ(R.drawable.d0x));
                    return;
                }
            }
        }
        C87277YNd.LJJIIZ(button);
    }

    public static void LJJIIJZLJL(LiveIconView liveIconView, EnumC74949TbF status, Context context, int i, int i2) {
        o.LJIIIZ(status, "status");
        int i3 = C74948TbE.LIZ[status.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (liveIconView != null) {
                    liveIconView.setIcon(C259910h.LJ(R.attr.ati, context));
                    liveIconView.setIconTint(i2);
                    return;
                }
                return;
            }
            if (liveIconView == null) {
                return;
            }
            liveIconView.setIcon(C259910h.LJ(R.attr.arz, context));
            liveIconView.setIconTint(i);
            return;
        }
        if (liveIconView == null) {
            return;
        }
        liveIconView.setIcon(C259910h.LJ(R.attr.ati, context));
        liveIconView.setIconTint(i);
    }
}
