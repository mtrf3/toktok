package X;

import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CE7 implements InterfaceC30844C8q {
    public final /* synthetic */ CreatorToolsActivity LIZ;

    @Override // X.InterfaceC30844C8q
    public final void LIZ(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public CE7(CreatorToolsActivity creatorToolsActivity) {
        this.LIZ = creatorToolsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // X.InterfaceC30844C8q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse r7) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameImproveSubscribeSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameImproveSubscribeSetting.INSTANCE
            boolean r0 = r0.shouldImproveSubscribe()
            r5 = 1
            if (r0 == 0) goto L4b
            if (r7 == 0) goto L94
            com.bytedance.android.livesdk.subscribe.model.invite.SubEnable r0 = r7.subEnable
            if (r0 == 0) goto L94
            boolean r0 = r0.canEnable
            if (r0 != r5) goto L94
            boolean r0 = r7.qualification
            if (r0 != 0) goto L94
            java.lang.String r0 = "keva_repo_subs"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "keva_key_red_dot"
            r1.append(r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            java.lang.String r0 = r0.getCurUserId()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            boolean r0 = r2.getBoolean(r0, r5)
            if (r0 == 0) goto L94
            r3 = 1
        L3c:
            com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity r0 = r6.LIZ
            X.ACy r2 = r0.LJLZ
            if (r2 == 0) goto L4b
            kotlin.jvm.internal.AqS10S0010000_5 r1 = new kotlin.jvm.internal.AqS10S0010000_5
            r0 = 1
            r1.<init>(r3, r0)
            r2.LJIIJ(r1)
        L4b:
            if (r7 == 0) goto L8c
            com.bytedance.android.livesdk.subscribe.model.invite.SubEntrance r0 = r7.subEntrance
            if (r0 == 0) goto L8c
            boolean r0 = r0.showSubEntrance
            if (r0 != r5) goto L8c
            com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity r0 = r6.LIZ
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.LJLJJLL
            boolean r0 = r7.enable
            if (r0 == 0) goto L91
            java.lang.String r1 = "yes"
        L5f:
            java.lang.String r0 = "subscribe_privilege"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity r0 = r6.LIZ
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.LJLJJLL
            boolean r0 = r7.qualification
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r0 == 0) goto L8f
            r1 = r3
        L71:
            java.lang.String r0 = "is_opt_in"
            r4.put(r0, r1)
            com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity r0 = r6.LIZ
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LJLJJLL
            com.bytedance.android.livesdk.subscribe.model.invite.SubEnable r0 = r7.subEnable
            if (r0 == 0) goto L8d
            boolean r0 = r0.canEnable
            if (r0 != r5) goto L8d
        L82:
            java.lang.String r0 = "is_valid"
            r1.put(r0, r3)
            com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity r0 = r6.LIZ
            r0.LLILLL()
        L8c:
            return
        L8d:
            r3 = r2
            goto L82
        L8f:
            r1 = r2
            goto L71
        L91:
            java.lang.String r1 = "no"
            goto L5f
        L94:
            r3 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CE7.LIZIZ(com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse):void");
    }
}
