package com.ss.android.ugc.aweme.followingtab.assem;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C47261Igj;
import X.C52236Kem;
import X.C53976LGi;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62814Ol0;
import X.C62822Ol8;
import X.LG6;
import X.LHM;
import X.ORZ;
import X.OSZ;
import Y.IDComparatorS37S0000000_9;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.followingtab.ability.FollowingBottomTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.ability.SocialBottomTabAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowingBottomTabProtocolAssem extends BaseMainContainerAssem implements ISocial2TabProtocolAbility {
    public static final ArrayList<String> LJLJJLL = C47261Igj.LJII("Following");
    public final String LJLIL = LHM.LIZIZ.LIZ().getSocial2TabTabName();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(LG6.LJLIL);
    public final CopyOnWriteArrayList<ISocialTabProtocol> LJLJI = new CopyOnWriteArrayList<>();
    public FutureTask<OSZ<List<ISocialTabProtocol>, List<SocialTopTabNode>>> LJLJJI;
    public boolean LJLJJL;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[Catch: all -> 0x006d, TryCatch #2 {, blocks: (B:3:0x0001, B:14:0x003c, B:16:0x005e, B:23:0x0030, B:25:0x0036, B:26:0x0062, B:27:0x006c, B:30:0x0029, B:19:0x0018, B:21:0x001c, B:22:0x0024), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[Catch: all -> 0x006d, TryCatch #2 {, blocks: (B:3:0x0001, B:14:0x003c, B:16:0x005e, B:23:0x0030, B:25:0x0036, B:26:0x0062, B:27:0x006c, B:30:0x0029, B:19:0x0018, B:21:0x001c, B:22:0x0024), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:14:0x003c, B:16:0x005e, B:23:0x0030, B:25:0x0036, B:26:0x0062, B:27:0x006c, B:30:0x0029, B:19:0x0018, B:21:0x001c, B:22:0x0024), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void v3() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.LJLJJL     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return
        L7:
            r3 = 1
            r5 = 0
            java.util.concurrent.FutureTask<X.OSZ<java.util.List<com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol>, java.util.List<com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode>>> r4 = r6.LJLJJI     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L5e
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L18
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = r4.get(r0, r2)     // Catch: java.lang.Throwable -> L18
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> L18
            goto L3a
        L18:
            java.util.concurrent.FutureTask<X.OSZ<java.util.List<com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol>, java.util.List<com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode>>> r0 = r6.LJLJJI     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L24
            boolean r0 = r0.cancel(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L28
        L24:
            X.C3C5.m7constructorimpl(r5)     // Catch: java.lang.Throwable -> L28
            goto L30
        L28:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L6d
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L6d
        L30:
            X.1qj r0 = X.C212428Vi.LIZ(r6)     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L62
            X.OSZ r0 = r6.x3(r0)     // Catch: java.lang.Throwable -> L6d
        L3a:
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r0.getFirst()     // Catch: java.lang.Throwable -> L6d
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r0.getSecond()     // Catch: java.lang.Throwable -> L6d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol> r0 = r6.LJLJI     // Catch: java.lang.Throwable -> L6d
            r0.clear()     // Catch: java.lang.Throwable -> L6d
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L6d
            X.Ol8 r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch: java.lang.Throwable -> L6d
            r0.clear()     // Catch: java.lang.Throwable -> L6d
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L6d
        L5e:
            r6.LJLJJL = r3     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)
            return
        L62:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            r1.toString()     // Catch: java.lang.Throwable -> L6d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            throw r0     // Catch: java.lang.Throwable -> L6d
        L6d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.followingtab.assem.FollowingBottomTabProtocolAssem.v3():void");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final boolean BJ() {
        v3();
        v3();
        return !this.LJLJI.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<ISocialTabProtocol> L2() {
        v3();
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<ISocialTabProtocol> NL() {
        v3();
        return this.LJLJI;
    }

    @Override // X.C8W0
    public final void onDestroy() {
        IBottomFriendsTabAvatarAbility LJIIJ;
        super.onDestroy();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            if (C52236Kem.LIZ() && (LJIIJ = C53976LGi.LJIIJ(LIZ)) != null) {
                LJIIJ.unRegister();
            }
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), SocialBottomTabAbility.class, null);
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), FollowingBottomTabAvatarAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), new SocialBottomTabAbility(getContext(), this.LJLIL), IBottomTabLayoutAbility.class, null);
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), new FollowingBottomTabAvatarAbility(getContext()), IBottomFriendsTabAvatarAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<SocialTopTabNode> p5() {
        v3();
        return (CopyOnWriteArrayList) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final boolean v60() {
        String str;
        v3();
        if (this.LJLJI.size() != 1) {
            return false;
        }
        v3();
        ISocialTabProtocol iSocialTabProtocol = (ISocialTabProtocol) ORZ.LJLLLLLL(0, this.LJLJI);
        if (iSocialTabProtocol != null) {
            str = iSocialTabProtocol.getTag();
        } else {
            str = null;
        }
        if (!o.LJ(str, this.LJLIL)) {
            return false;
        }
        return true;
    }

    public final OSZ<List<ISocialTabProtocol>, List<SocialTopTabNode>> x3(ActivityC45651qj activityC45651qj) {
        List LJIJ = C62814Ol0.LJIJ(C55230Lly.LIZLLL(activityC45651qj, null), ISocialTabProtocol.class);
        if (LJIJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJIJ) {
            if (((ISocialTabProtocol) obj).enable()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ISocialTabProtocol iSocialTabProtocol : ORZ.LLILII(new IDComparatorS37S0000000_9(0), arrayList)) {
            arrayList2.add(iSocialTabProtocol);
            arrayList3.add(new SocialTopTabNode(activityC45651qj, iSocialTabProtocol));
        }
        return new OSZ<>(arrayList2, arrayList3);
    }
}
