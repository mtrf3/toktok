package com.ss.android.ugc.aweme.friendstab.assem;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C32I;
import X.C36922EeM;
import X.C47261Igj;
import X.C52236Kem;
import X.C53976LGi;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62814Ol0;
import X.ORZ;
import X.OSZ;
import X.X1D;
import Y.IDComparatorS37S0000000_9;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.friendstab.ability.FriendBottomTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.ability.FriendsTabRouterAbility;
import com.ss.android.ugc.aweme.friendstab.ability.SocialBottomTabAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsTabProtocolAssem extends BaseMainContainerAssem implements ISocial2TabProtocolAbility {
    public static final ArrayList<String> LJLJJLL = C47261Igj.LJII("FRIENDS_FEED");
    public final CopyOnWriteArrayList<SocialTopTabNode> LJLIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<ISocialTabProtocol> LJLILLLLZI = new CopyOnWriteArrayList<>();
    public FutureTask<OSZ<List<ISocialTabProtocol>, List<SocialTopTabNode>>> LJLJI;
    public boolean LJLJJI;
    public ActivityC45651qj LJLJJL;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[Catch: all -> 0x006b, TryCatch #2 {, blocks: (B:3:0x0001, B:14:0x0040, B:16:0x005c, B:23:0x0030, B:25:0x0034, B:27:0x0060, B:28:0x006a, B:29:0x003a, B:32:0x0029, B:19:0x0018, B:21:0x001c, B:22:0x0024), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void v3() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.LJLJJI     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return
        L7:
            r4 = 1
            r5 = 0
            java.util.concurrent.FutureTask<X.OSZ<java.util.List<com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol>, java.util.List<com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode>>> r3 = r6.LJLJI     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L5c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L18
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = r3.get(r0, r2)     // Catch: java.lang.Throwable -> L18
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> L18
            goto L3e
        L18:
            java.util.concurrent.FutureTask<X.OSZ<java.util.List<com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol>, java.util.List<com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode>>> r0 = r6.LJLJI     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L24
            boolean r0 = r0.cancel(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L28
        L24:
            X.C3C5.m7constructorimpl(r5)     // Catch: java.lang.Throwable -> L28
            goto L30
        L28:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L6b
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L6b
        L30:
            X.1qj r0 = r6.LJLJJL     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L3a
            X.1qj r0 = X.C212428Vi.LIZ(r6)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L60
        L3a:
            X.OSZ r0 = r6.x3(r0)     // Catch: java.lang.Throwable -> L6b
        L3e:
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r0.getFirst()     // Catch: java.lang.Throwable -> L6b
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r0.getSecond()     // Catch: java.lang.Throwable -> L6b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol> r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L6b
            r0.clear()     // Catch: java.lang.Throwable -> L6b
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode> r0 = r6.LJLIL     // Catch: java.lang.Throwable -> L6b
            r0.clear()     // Catch: java.lang.Throwable -> L6b
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L6b
        L5c:
            r6.LJLJJI = r4     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L60:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6b
            r1.toString()     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.assem.FriendsTabProtocolAssem.v3():void");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final boolean BJ() {
        v3();
        CopyOnWriteArrayList<ISocialTabProtocol> copyOnWriteArrayList = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
        Iterator<ISocialTabProtocol> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTag());
        }
        v3();
        if (this.LJLILLLLZI.size() > 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<ISocialTabProtocol> L2() {
        v3();
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<ISocialTabProtocol> NL() {
        v3();
        CopyOnWriteArrayList<ISocialTabProtocol> copyOnWriteArrayList = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        Iterator<ISocialTabProtocol> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ISocialTabProtocol next = it.next();
            if (!o.LJ(next.getTag(), "SOCIAL_EXPLORE")) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), FriendsTabRouterAbility.class, null);
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), SocialBottomTabAbility.class, null);
            if (C52236Kem.LIZ()) {
                IBottomFriendsTabAvatarAbility LJIIJ = C53976LGi.LJIIJ(LIZ);
                if (LJIIJ != null) {
                    LJIIJ.unRegister();
                }
                C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), FriendBottomTabAvatarAbility.class, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), new FriendsTabRouterAbility(getContext()), IFriendsTabRouterAbility.class, null);
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), new SocialBottomTabAbility(getContext(), "FRIENDS_TAB"), IBottomTabLayoutAbility.class, null);
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), new FriendBottomTabAvatarAbility(getContext()), IBottomFriendsTabAvatarAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final List<SocialTopTabNode> p5() {
        v3();
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
    public final boolean v60() {
        String str;
        v3();
        if (this.LJLILLLLZI.size() != 1) {
            return false;
        }
        v3();
        ISocialTabProtocol iSocialTabProtocol = (ISocialTabProtocol) ORZ.LJLLLLLL(0, this.LJLILLLLZI);
        if (iSocialTabProtocol != null) {
            str = iSocialTabProtocol.getTag();
        } else {
            str = null;
        }
        if (!o.LJ(str, "FRIENDS_FEED")) {
            return false;
        }
        return true;
    }

    public final OSZ<List<ISocialTabProtocol>, List<SocialTopTabNode>> x3(ActivityC45651qj activityC45651qj) {
        C36922EeM.LIZLLL(2, "landing_2860", "execute prepareTopTabs");
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepareTopTabs ");
        LIZ.append(arrayList);
        LIZ.append(' ');
        LIZ.append(arrayList.size());
        C36922EeM.LIZLLL(2, "landing_2860", X1D.LIZIZ(LIZ));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ISocialTabProtocol iSocialTabProtocol : ORZ.LLILII(new IDComparatorS37S0000000_9(1), arrayList)) {
            arrayList2.add(iSocialTabProtocol);
            arrayList3.add(new SocialTopTabNode(activityC45651qj, iSocialTabProtocol));
        }
        return new OSZ<>(arrayList2, arrayList3);
    }
}
