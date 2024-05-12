package com.bytedance.android.live.liveinteract.multiguestv3.usercard;

import X.AbstractC29482Bhe;
import X.BEU;
import X.C05170If;
import X.C15380j0;
import X.C16880lQ;
import X.C1XY;
import X.C29306Beo;
import X.C29448Bh6;
import X.C29552Bim;
import X.C29553Bin;
import X.C29556Biq;
import X.C2A7;
import X.C30868C9o;
import X.C32151Nz;
import X.C35331a5;
import X.C73943T0h;
import X.C74849TZd;
import X.C74983Tbn;
import X.C75018TcM;
import X.C76173Tuz;
import X.C8E;
import X.CN1;
import X.EnumC29551Bil;
import X.InterfaceC29444Bh2;
import X.O6R;
import X.TV3;
import X.TZQ;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import Y.AUListenerS0S0300002_5;
import Y.AfS54S0200000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkAnchorOpenOrClickUserCardEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorPermitGuestEvent;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileAtSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserPreviewOptMultiGuestSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserPreviewOptPackageSetting;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestUserCardCell extends AbstractC29482Bhe<Boolean> implements GenericLifecycleObserver {
    public final boolean LJLJJL;
    public ViewGroup LJLJJLL;
    public C2A7 LJLJL;
    public C2A7 LJLJLJ;
    public InterfaceC29444Bh2 LJLJLLL;
    public User LJLL;
    public ValueAnimator LJLLI;
    public boolean LJLLILLLL;
    public final int LJLLJ;
    public final float LJLLL;
    public final float LJLLLL;
    public final int LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final boolean LJZL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        ValueAnimator valueAnimator = this.LJLLI;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            C16880lQ.LJLJL(valueAnimator);
            valueAnimator.cancel();
        }
    }

    public final void LJIIJ() {
        LJIILJJIL("click");
        boolean z = false;
        if (C1XY.LIZ(TV3.LIZJ())) {
            C30868C9o.LIZJ(R.string.mij);
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Yu0() == 0) {
                try {
                    C76173Tuz c76173Tuz = C76173Tuz.LIZ;
                    HashMap hashMap = new HashMap();
                    C29556Biq.LIZ().getClass();
                    hashMap.put("maxLinkNum", String.valueOf(C74983Tbn.LJIIIIZZ()));
                    if (C8E.LJ().R6() != null) {
                        z = true;
                    }
                    hashMap.put("LinkMicSession is null", String.valueOf(z));
                    c76173Tuz.LIZ(30002, "ReachedMaxLinkNum but linkedGuestNum = 0 ", hashMap);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        User user = this.LJLL;
        if (user == null || user.getSecret() != 1) {
            if (!LiveUserPreviewOptMultiGuestSetting.INSTANCE.isEnable() && !this.LJLLILLLL) {
                C30868C9o.LIZJ(R.string.lt6);
                return;
            }
            User user2 = this.LJLL;
            if (user2 != null) {
                if (((IInteractService) CN1.LIZ(IInteractService.class)).DD().contains(Long.valueOf(user2.getId()))) {
                    if (this.LJLIL.LIZJ.LIZ()) {
                        this.LJLILLLLZI.qv0(LinkInRoomAnchorPermitGuestEvent.class, new C29552Bim(user2));
                    } else {
                        this.LJLILLLLZI.qv0(MultiGuestModeratorPermitGuestEvent.class, new C29553Bin(1, user2));
                    }
                } else if (this.LJLIL.LIZJ.LIZ()) {
                    this.LJLILLLLZI.qv0(LinkInRoomAnchorInviteGuestEvent.class, new TZQ(user2, "user_profile", 3, "user_profile_invite"));
                } else {
                    this.LJLILLLLZI.qv0(MultiGuestModeratorInviteGuestEvent.class, new C74849TZd(user2));
                }
            }
            this.LJLIL.LIZLLL.dismiss();
            return;
        }
        C30868C9o.LJI(C15380j0.LJIILL(R.string.mhp, C05170If.LIZ(this.LJLL)));
    }

    public final C2A7 LJIIJJI() {
        InterfaceC29444Bh2 interfaceC29444Bh2 = this.LJLJLLL;
        if (interfaceC29444Bh2 != null) {
            return interfaceC29444Bh2.getContentView();
        }
        o.LJIJI("followButtonApi");
        throw null;
    }

    public final boolean LJIIL() {
        return LiveProfileAtSetting.INSTANCE.isEnable();
    }

    public final boolean LJIILIIL() {
        User user;
        User user2 = this.LJLL;
        if (user2 == null) {
            return false;
        }
        EnumC29551Bil LJIIZILJ = C1XY.LJIIZILJ(user2, this.LJLIL.LJ);
        if (LJIIZILJ != EnumC29551Bil.GRAYED) {
            if (LJIIZILJ == EnumC29551Bil.GONE) {
                return false;
            }
            if ((LiveUserPreviewOptMultiGuestSetting.INSTANCE.isEnable() || this.LJLLILLLL) && !C1XY.LIZ(TV3.LIZJ()) && ((user = this.LJLL) == null || user.getSecret() != 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC29482Bhe
    public final int LIZJ() {
        return this.LJZI;
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJ() {
        return this.LJZL;
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJFF() {
        return this.LJLJJL;
    }

    @Override // X.AbstractC29482Bhe
    public final int LJI() {
        return this.LJZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1.LIZLLL() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiGuestUserCardCell(X.C29484Bhg r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            X.BhE r0 = r4.LIZJ
            boolean r0 = r0.LIZ()
            r2 = 1
            if (r0 != 0) goto L18
            X.BhE r1 = r4.LIZJ
            boolean r0 = r1.LJFF
            if (r0 == 0) goto Lae
            boolean r0 = r1.LIZLLL()
            if (r0 != 0) goto Lae
        L18:
            X.BhE r1 = r4.LIZJ
            com.bytedance.android.livesdk.event.UserProfileEvent r0 = r1.LIZ
            boolean r0 = r0.linkInRoomEnable
            if (r0 == 0) goto Lae
            boolean r0 = r1.LIZJ()
            if (r0 != 0) goto Lae
            X.BhE r0 = r4.LIZJ
            com.bytedance.android.livesdk.event.UserProfileEvent r0 = r0.LIZ
            boolean r0 = r0.coHostEnable
            if (r0 != 0) goto Lae
            r0 = 1
        L2f:
            r3.LJLJJL = r0
            android.content.Context r1 = r4.LIZ
            X.BhE r0 = r4.LIZJ
            boolean r0 = r0.LIZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C74945TbB.LIZIZ(r0)
            if (r0 == 0) goto Laa
            r0 = 2130970632(0x7f040808, float:1.754998E38)
        L46:
            int r0 = X.C259910h.LJ(r0, r1)
            r3.LJLLJ = r0
            boolean r0 = r3.LJIIL()
            r1 = 1084647014(0x40a66666, float:5.2)
            if (r0 == 0) goto La6
            r0 = 1082130432(0x40800000, float:4.0)
        L57:
            r3.LJLLL = r0
            boolean r0 = r3.LJIIL()
            if (r0 == 0) goto La3
        L5f:
            r3.LJLLLL = r1
            com.bytedance.android.livesdk.livesetting.roomfunction.LiveNickNameFontOptSetting r1 = com.bytedance.android.livesdk.livesetting.roomfunction.LiveNickNameFontOptSetting.INSTANCE
            boolean r0 = r1.enableOptRoundCorner()
            if (r0 == 0) goto L9f
            r0 = 2131887541(0x7f1205b5, float:1.9409692E38)
        L6c:
            r3.LJLLLLLL = r0
            boolean r0 = r1.enableOptRoundCorner()
            if (r0 == 0) goto L9b
            r0 = 2131887540(0x7f1205b4, float:1.940969E38)
        L77:
            r3.LJLZ = r0
            androidx.lifecycle.LifecycleOwner r0 = r4.LIZIZ
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.addObserver(r3)
            r1 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r3.LJZ = r0
            int r0 = X.C7MY.LIZIZ(r1)
            r3.LJZI = r0
            r3.LJZL = r2
            return
        L9b:
            r0 = 2131887156(0x7f120434, float:1.9408911E38)
            goto L77
        L9f:
            r0 = 2131887159(0x7f120437, float:1.9408917E38)
            goto L6c
        La3:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L5f
        La6:
            r0 = 1084647014(0x40a66666, float:5.2)
            goto L57
        Laa:
            r0 = 2130970630(0x7f040806, float:1.7549976E38)
            goto L46
        Lae:
            r0 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell.<init>(X.Bhg):void");
    }

    @Override // X.AbstractC29482Bhe
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dji, C16880lQ.LLZIL(context), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup = (ViewGroup) LLLZIIL;
        this.LJLJJLL = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.ftp);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.linkmic_button)");
        C2A7 c2a7 = (C2A7) findViewById;
        this.LJLJL = c2a7;
        c2a7.LJJLL(this.LJLLLLLL);
        C2A7 c2a72 = this.LJLJL;
        if (c2a72 != null) {
            c2a72.setIcon(R.drawable.dcc);
            ViewGroup viewGroup2 = this.LJLJJLL;
            if (viewGroup2 != null) {
                View findViewById2 = viewGroup2.findViewById(R.id.a9_);
                o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.at)");
                C2A7 c2a73 = (C2A7) findViewById2;
                this.LJLJLJ = c2a73;
                c2a73.LJJLL(this.LJLLLLLL);
                ViewGroup viewGroup3 = this.LJLJJLL;
                if (viewGroup3 != null) {
                    return viewGroup3;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("linkmicButton");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:13)(2:10|11))(5:35|36|(1:38)(1:42)|39|(1:41))|14|(5:16|(1:27)(1:20)|21|(1:23)|26)(3:28|(1:34)|26)|24|25))|44|6|7|(0)(0)|14|(0)(0)|24|25) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:13:0x0082, B:14:0x0085, B:16:0x0091, B:18:0x0095, B:20:0x0099, B:28:0x00a3, B:30:0x00a7, B:32:0x00ab, B:36:0x0033, B:39:0x006d), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:13:0x0082, B:14:0x0085, B:16:0x0091, B:18:0x0095, B:20:0x0099, B:28:0x00a3, B:30:0x00a7, B:32:0x00ab, B:36:0x0033, B:39:0x006d), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.AbstractC29482Bhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC67352kd<? super java.lang.Boolean> r18) {
        /*
            r17 = this;
            r5 = r18
            boolean r0 = r5 instanceof X.C29550Bik
            r1 = r17
            if (r0 == 0) goto L22
            r4 = r5
            X.Bik r4 = (X.C29550Bik) r4
            int r3 = r4.LJLJI
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L22
            int r3 = r3 - r2
            r4.LJLJI = r3
        L16:
            java.lang.Object r6 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            goto L82
        L22:
            X.Bik r4 = new X.Bik
            r4.<init>(r1, r5)
            goto L16
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r6)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAppContext> r0 = com.bytedance.android.livesdkapi.host.IHostAppContext.class
            X.0Mx r6 = X.CN1.LIZ(r0)     // Catch: java.lang.Throwable -> Lb2
            com.bytedance.android.livesdkapi.host.IHostAppContext r6 = (com.bytedance.android.livesdkapi.host.IHostAppContext) r6     // Catch: java.lang.Throwable -> Lb2
            X.PsI r5 = X.C65814PsI.LIZ()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.LinkApi> r0 = com.bytedance.android.livesdk.chatroom.api.LinkApi.class
            r5.getClass()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r7 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Throwable -> Lb2
            com.bytedance.android.livesdk.chatroom.api.LinkApi r7 = (com.bytedance.android.livesdk.chatroom.api.LinkApi) r7     // Catch: java.lang.Throwable -> Lb2
            X.Bhg r0 = r1.LJLIL     // Catch: java.lang.Throwable -> Lb2
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF     // Catch: java.lang.Throwable -> Lb2
            long r8 = r0.getId()     // Catch: java.lang.Throwable -> Lb2
            int r0 = r6.appId()     // Catch: java.lang.Throwable -> Lb2
            long r10 = (long) r0     // Catch: java.lang.Throwable -> Lb2
            int r0 = r6.liveId()     // Catch: java.lang.Throwable -> Lb2
            long r12 = (long) r0     // Catch: java.lang.Throwable -> Lb2
            X.Bhg r0 = r1.LJLIL     // Catch: java.lang.Throwable -> Lb2
            long r14 = r0.LJIIIZ     // Catch: java.lang.Throwable -> Lb2
            X.BhE r0 = r0.LIZJ     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = r0.LIZ()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L6b
            r16 = 1
            goto L6d
        L6b:
            r16 = 2
        L6d:
            X.SvC r1 = r7.checkOthersPermission(r8, r10, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb2
            X.T0k r0 = X.T16.LIZ()     // Catch: java.lang.Throwable -> Lb2
            X.Sun r0 = r1.LJJIIJ(r0)     // Catch: java.lang.Throwable -> Lb2
            r4.LJLJI = r3     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r6 = X.C29306Beo.LJJIIZI(r0, r4)     // Catch: java.lang.Throwable -> Lb2
            if (r6 != r2) goto L85
            return r2
        L82:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Throwable -> Lb2
        L85:
            com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse r6 = (com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse) r6     // Catch: java.lang.Throwable -> Lb2
            com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lb2
            r4 = 0
            if (r0 == 0) goto La3
            com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse$ResponseData r0 = r6.data     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L9c
            com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo r0 = r0.otherPermissionInfo     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L9c
            long r1 = r0.errCode     // Catch: java.lang.Throwable -> Lb2
            goto L9e
        L9c:
            r1 = 0
        L9e:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb2
            goto Lb3
        La3:
            com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse$ResponseData r0 = r6.data     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lb2
            com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo r0 = r0.otherPermissionInfo     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lb2
            long r1 = r0.errCode     // Catch: java.lang.Throwable -> Lb2
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb2
            goto Lb3
        Lb2:
            r3 = 0
        Lb3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell.LJIIIZ(X.2kd):java.lang.Object");
    }

    public final void LJIILJJIL(String str) {
        boolean z;
        boolean z2;
        String str2;
        User user = this.LJLL;
        if (user == null) {
            return;
        }
        EnumC29551Bil LJIIZILJ = C1XY.LJIIZILJ(user, this.LJLIL.LJ);
        C2A7 c2a7 = this.LJLJL;
        if (c2a7 != null) {
            if (c2a7.getVisibility() != 0 || LJIIZILJ == EnumC29551Bil.DISCONNECTED) {
                return;
            }
            long id = user.getId();
            boolean z3 = this.LJLLILLLL;
            User user2 = this.LJLL;
            if (user2 == null) {
                z = false;
            } else if (user2.getFollowInfo() != null && (user2.getFollowInfo().getFollowStatus() == 2 || user2.getFollowInfo().getFollowStatus() == 3)) {
                z = true;
            } else {
                z = false;
            }
            User user3 = this.LJLL;
            if (user3 == null) {
                z2 = false;
            } else if (user3.getFollowInfo() != null && (user3.getFollowInfo().getFollowStatus() == 2 || user3.getFollowInfo().getFollowStatus() == 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (LJIILIIL()) {
                C2A7 c2a72 = this.LJLJL;
                if (c2a72 != null) {
                    if (c2a72.getVisibility() == 0) {
                        str2 = "abnormal";
                        this.LJLILLLLZI.qv0(LinkAnchorOpenOrClickUserCardEvent.class, new C75018TcM(id, str, str2, z3, z, z2));
                        return;
                    }
                } else {
                    o.LJIJI("linkmicButton");
                    throw null;
                }
            }
            str2 = "normal";
            this.LJLILLLLZI.qv0(LinkAnchorOpenOrClickUserCardEvent.class, new C75018TcM(id, str, str2, z3, z, z2));
            return;
        }
        o.LJIJI("linkmicButton");
        throw null;
    }

    public final void LJIILL(boolean z) {
        boolean z2;
        boolean z3;
        ValueAnimator valueAnimator;
        User user = this.LJLL;
        if (user == null) {
            return;
        }
        EnumC29551Bil LJIIZILJ = C1XY.LJIIZILJ(user, this.LJLIL.LJ);
        C2A7 c2a7 = this.LJLJL;
        if (c2a7 != null) {
            c2a7.setVisibility(0);
            C2A7 c2a72 = this.LJLJL;
            if (c2a72 != null) {
                c2a72.setEnabled(true);
                if (LiveUserPreviewOptMultiGuestSetting.INSTANCE.isEnable() && !this.LJLLILLLL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C2A7 c2a73 = this.LJLJL;
                    if (c2a73 != null) {
                        c2a73.setVisibility(8);
                    } else {
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                } else if (LJIIZILJ == EnumC29551Bil.DISCONNECTED) {
                    C2A7 c2a74 = this.LJLJL;
                    if (c2a74 != null) {
                        c2a74.setText(R.string.now);
                        C2A7 c2a75 = this.LJLJL;
                        if (c2a75 != null) {
                            c2a75.setIcon(this.LJLLJ);
                            C2A7 c2a76 = this.LJLJL;
                            if (c2a76 != null) {
                                c2a76.LJJLL(this.LJLLLLLL);
                                C2A7 c2a77 = this.LJLJL;
                                if (c2a77 != null) {
                                    C16880lQ.LJJIII(c2a77, new ACListenerS25S0100000_5(this, 26));
                                } else {
                                    o.LJIJI("linkmicButton");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("linkmicButton");
                                throw null;
                            }
                        } else {
                            o.LJIJI("linkmicButton");
                            throw null;
                        }
                    } else {
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                } else if (LJIILIIL()) {
                    C2A7 c2a78 = this.LJLJL;
                    if (c2a78 != null) {
                        c2a78.LJJLL(this.LJLZ);
                        C2A7 c2a79 = this.LJLJL;
                        if (c2a79 != null) {
                            c2a79.setText(R.string.n8k);
                            C2A7 c2a710 = this.LJLJL;
                            if (c2a710 != null) {
                                C16880lQ.LJJIII(c2a710, new ACListenerS25S0100000_5(this, 27));
                            } else {
                                o.LJIJI("linkmicButton");
                                throw null;
                            }
                        } else {
                            o.LJIJI("linkmicButton");
                            throw null;
                        }
                    } else {
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                } else if (LJIIZILJ == EnumC29551Bil.ACTIVE) {
                    C2A7 c2a711 = this.LJLJL;
                    if (c2a711 != null) {
                        c2a711.setText(R.string.n8k);
                        C2A7 c2a712 = this.LJLJL;
                        if (c2a712 != null) {
                            c2a712.setIcon(R.drawable.dcc);
                            C2A7 c2a713 = this.LJLJL;
                            if (c2a713 != null) {
                                c2a713.LJJLL(this.LJLLLLLL);
                                C2A7 c2a714 = this.LJLJL;
                                if (c2a714 != null) {
                                    C16880lQ.LJJIII(c2a714, new ACListenerS25S0100000_5(this, 28));
                                } else {
                                    o.LJIJI("linkmicButton");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("linkmicButton");
                                throw null;
                            }
                        } else {
                            o.LJIJI("linkmicButton");
                            throw null;
                        }
                    } else {
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                } else {
                    C2A7 c2a715 = this.LJLJL;
                    if (c2a715 != null) {
                        c2a715.setVisibility(8);
                    } else {
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                }
                if (!user.isBlock && user.isFollowing()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    C2A7 c2a716 = this.LJLJL;
                    if (c2a716 != null) {
                        c2a716.setText("");
                    } else {
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                }
                User user2 = this.LJLL;
                if (user2 != null) {
                    ViewGroup.LayoutParams layoutParams = LJIIJJI().getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    C2A7 c2a717 = this.LJLJL;
                    if (c2a717 != null) {
                        ViewGroup.LayoutParams layoutParams3 = c2a717.getLayoutParams();
                        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        C2A7 c2a718 = this.LJLJL;
                        if (c2a718 != null) {
                            if (c2a718.getVisibility() == 0) {
                                float f = this.LJLLL;
                                float f2 = ((f - 1.0f) / 6) + 1.0f;
                                ValueAnimator valueAnimator2 = this.LJLLI;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.removeAllUpdateListeners();
                                    C16880lQ.LJLJL(valueAnimator2);
                                    valueAnimator2.cancel();
                                }
                                if (z) {
                                    valueAnimator = ValueAnimator.ofFloat(1.0f, f);
                                    valueAnimator.setDuration(300L);
                                    valueAnimator.setInterpolator(new C35331a5());
                                } else {
                                    valueAnimator = null;
                                }
                                this.LJLLI = valueAnimator;
                                if (!user2.isBlock && user2.isFollowing()) {
                                    if (!z || layoutParams2.weight == 1.0f) {
                                        if (LJIIL()) {
                                            layoutParams4.weight = f;
                                            C2A7 c2a719 = this.LJLJL;
                                            if (c2a719 != null) {
                                                c2a719.setLayoutParams(layoutParams4);
                                            } else {
                                                o.LJIJI("linkmicButton");
                                                throw null;
                                            }
                                        }
                                        layoutParams2.weight = 1.0f;
                                        LJIIJJI().setLayoutParams(layoutParams2);
                                    } else {
                                        ValueAnimator valueAnimator3 = this.LJLLI;
                                        if (valueAnimator3 != null) {
                                            valueAnimator3.addUpdateListener(new AUListenerS0S0300002_5(f2, f, layoutParams4, layoutParams2, this, 0));
                                        }
                                        ValueAnimator valueAnimator4 = this.LJLLI;
                                        if (valueAnimator4 != null) {
                                            valueAnimator4.start();
                                        }
                                    }
                                    if (LJIIL()) {
                                        C2A7 LJIIJJI = LJIIJJI();
                                        if ((LJIIJJI instanceof C2A7) && LJIIJJI != null) {
                                            LJIIJJI.setText("");
                                        }
                                    }
                                } else if (!z || layoutParams2.weight == f) {
                                    C2A7 c2a720 = this.LJLJL;
                                    if (c2a720 != null) {
                                        if (c2a720.getVisibility() == 0) {
                                            layoutParams2.weight = f;
                                        } else {
                                            layoutParams2.weight = this.LJLLLL;
                                        }
                                        LJIIJJI().setLayoutParams(layoutParams2);
                                    } else {
                                        o.LJIJI("linkmicButton");
                                        throw null;
                                    }
                                } else {
                                    ValueAnimator valueAnimator5 = this.LJLLI;
                                    if (valueAnimator5 != null) {
                                        valueAnimator5.addUpdateListener(new AUListenerS0S0300002_5(f2, f, layoutParams4, layoutParams2, this, 1));
                                    }
                                    ValueAnimator valueAnimator6 = this.LJLLI;
                                    if (valueAnimator6 != null) {
                                        valueAnimator6.start();
                                    }
                                }
                            } else {
                                layoutParams2.weight = this.LJLLLL;
                                LJIIJJI().setLayoutParams(layoutParams2);
                            }
                        } else {
                            o.LJIJI("linkmicButton");
                            throw null;
                        }
                    } else {
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                }
                LJIILJJIL("show");
                return;
            }
            o.LJIJI("linkmicButton");
            throw null;
        }
        o.LJIJI("linkmicButton");
        throw null;
    }

    @Override // X.AbstractC29482Bhe
    public final void LJII(User user, boolean z, boolean z2, Boolean bool) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        o.LJIIIZ(user, "user");
        this.LJLL = user;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.setMarginStart(C15380j0.LIZ(8.0f));
        layoutParams.leftMargin = layoutParams.getMarginStart();
        layoutParams.setMarginEnd(C15380j0.LIZ(16.0f));
        layoutParams.rightMargin = layoutParams.getMarginEnd();
        C29448Bh6 Ln0 = ((IUserCardService) CN1.LIZ(IUserCardService.class)).Ln0(this.LJLIL, user, this.LJLILLLLZI);
        this.LJLJLLL = Ln0;
        if (Ln0 != null) {
            ViewGroup viewGroup = this.LJLJJLL;
            if (viewGroup != null) {
                Ln0.LIZJ(-1, layoutParams, viewGroup);
                InterfaceC29444Bh2 interfaceC29444Bh2 = this.LJLJLLL;
                if (interfaceC29444Bh2 != null) {
                    interfaceC29444Bh2.LIZIZ().observe(this.LJLIL.LIZIZ, new AObserverS73S0100000_5(this, 35));
                    this.LJLLILLLL = o.LJ(bool, Boolean.TRUE);
                    LJIILL(false);
                    if (!LJIIL()) {
                        C2A7 c2a7 = this.LJLJLJ;
                        if (c2a7 != null) {
                            C29306Beo.LJI(c2a7);
                        } else {
                            o.LJIJI("atButton");
                            throw null;
                        }
                    }
                    C2A7 c2a72 = this.LJLJLJ;
                    if (c2a72 != null) {
                        C16880lQ.LJJIII(c2a72, new ACListenerS25S0100000_5(this, 268));
                        C2A7 c2a73 = this.LJLJL;
                        if (c2a73 != null) {
                            if (c2a73.getVisibility() == 8) {
                                if (LJIIL()) {
                                    C2A7 c2a74 = this.LJLJLJ;
                                    if (c2a74 != null) {
                                        ViewGroup.LayoutParams layoutParams2 = c2a74.getLayoutParams();
                                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                            marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                                            marginLayoutParams2.leftMargin = marginLayoutParams2.getMarginStart();
                                        }
                                    } else {
                                        o.LJIJI("atButton");
                                        throw null;
                                    }
                                } else {
                                    ViewGroup.LayoutParams layoutParams3 = LJIIJJI().getLayoutParams();
                                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                                        marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                                        marginLayoutParams.leftMargin = marginLayoutParams.getMarginStart();
                                    }
                                }
                            }
                            if (LiveUserPreviewOptPackageSetting.INSTANCE.isEnable()) {
                                C73943T0h.LIZ().LIZJ(this.LJLIL.LIZIZ, BEU.class).LIZIZ(new AfS54S0200000_5(this, user, 28));
                                return;
                            }
                            return;
                        }
                        o.LJIJI("linkmicButton");
                        throw null;
                    }
                    o.LJIJI("atButton");
                    throw null;
                }
                o.LJIJI("followButtonApi");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("followButtonApi");
        throw null;
    }
}
