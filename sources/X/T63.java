package X;

import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment;

/* loaded from: classes13.dex */
public final class T63 implements InterfaceC56522MGg {
    public final /* synthetic */ ChallengeDetailFragment LIZ;

    public T63(ChallengeDetailFragment challengeDetailFragment) {
        this.LIZ = challengeDetailFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    @Override // X.InterfaceC56522MGg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r7) {
        /*
            r6 = this;
            java.lang.String r5 = ""
            if (r7 == 0) goto L7d
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r6.LIZ
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r0.Hl()
            java.lang.String r1 = r0.getEnterFrom()
            java.lang.String r0 = "from_related_tag"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L7d
            X.7vU r2 = new X.7vU
            r2.<init>()
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r1 = r6.LIZ
            java.lang.String r0 = r1.LJLZ
            r4 = 0
            if (r0 == 0) goto L3d
            r2.LJJLIIIJJI = r0
            com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r0 = r1.LJLLLLLL
            java.lang.String r3 = "mHotFragment"
            if (r0 == 0) goto L39
            X.K1b<X.K1g> r0 = r0.LJLJJL     // Catch: java.lang.Exception -> L43
            T extends X.8BS r1 = r0.LJLIL     // Catch: java.lang.Exception -> L43
            boolean r0 = r1 instanceof X.InterfaceC65316PkG     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L47
            X.PkG r1 = (X.InterfaceC65316PkG) r1     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = r1.getRequestId()     // Catch: java.lang.Exception -> L43
            goto L48
        L39:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        L3d:
            java.lang.String r0 = "mChallengeId"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        L43:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L47:
            r0 = r5
        L48:
            r2.LJJIJ(r0)
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r6.LIZ
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r0.Hl()
            java.lang.String r0 = r0.getEnterFrom()
            if (r0 != 0) goto L9e
        L57:
            r2.LIZLLL = r5
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r6.LIZ
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r0.Hl()
            java.lang.String r0 = r0.getParentTagId()
            r2.LJLILLLLZI = r0
            r2.LJIILIIL()
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r2 = r6.LIZ
            com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment r0 = r2.LJLLLLLL
            if (r0 == 0) goto La0
            org.json.JSONObject r0 = r0.Il()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "mHotFragment.requestId.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.LLI = r1
        L7d:
            r1 = 0
            com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService r0 = com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(r1)
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L9d
            if (r7 != 0) goto L9d
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r6.LIZ
            X.Voy r0 = r0.Ll()
            boolean r0 = r0.LLIIIZ
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment r0 = r6.LIZ
            X.Voy r0 = r0.Ll()
            r0.setRefreshing(r1)
        L9d:
            return
        L9e:
            r5 = r0
            goto L57
        La0:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T63.LIZ(boolean):void");
    }
}
