package X;

import com.ss.android.ugc.aweme.live.GoLiveActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Bd5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29199Bd5 {
    public final GoLiveActivity LIZ;
    public final C62822Ol8 LIZIZ;
    public volatile String LIZJ;
    public Exception LIZLLL;

    public C29199Bd5(GoLiveActivity goLiveActivity) {
        o.LJIIIZ(goLiveActivity, "goLiveActivity");
        this.LIZ = goLiveActivity;
        this.LIZIZ = C221108m2.LIZIZ(C29200Bd6.LJLIL);
        this.LIZJ = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C29198Bd4
            if (r0 == 0) goto L20
            r5 = r7
            X.Bd4 r5 = (X.C29198Bd4) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            X.Bd5 r3 = r5.LJLIL
            goto L53
        L20:
            X.Bd4 r5 = new X.Bd4
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r4)
            X.Ol8 r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L7d
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = "<get-iLiveRetrofit>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L7d
            X.PfT r1 = (X.C65019PfT) r1     // Catch: java.lang.Exception -> L7d
            java.lang.Class<com.ss.android.ugc.aweme.live.api.ILiveStreamInfoApi> r0 = com.ss.android.ugc.aweme.live.api.ILiveStreamInfoApi.class
            java.lang.Object r0 = r1.LIZ(r0)     // Catch: java.lang.Exception -> L7d
            com.ss.android.ugc.aweme.live.api.ILiveStreamInfoApi r0 = (com.ss.android.ugc.aweme.live.api.ILiveStreamInfoApi) r0     // Catch: java.lang.Exception -> L7d
            r5.LJLIL = r6     // Catch: java.lang.Exception -> L7d
            r5.LJLJJI = r2     // Catch: java.lang.Exception -> L7d
            java.lang.Object r4 = r0.getStreamInfo(r5)     // Catch: java.lang.Exception -> L7d
            if (r4 != r3) goto L51
            return r3
        L51:
            r3 = r6
            goto L56
        L53:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L7b
        L56:
            X.BFf r4 = (X.C28467BFf) r4     // Catch: java.lang.Exception -> L7b
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.0Mx r1 = X.CN1.LIZ(r0)     // Catch: java.lang.Exception -> L7b
            java.lang.String r0 = "getService(T::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L7b
            com.bytedance.android.live.broadcast.api.IBroadcastService r1 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r1     // Catch: java.lang.Exception -> L7b
            X.0eY r0 = r1.getLiveCoreInitUtil()     // Catch: java.lang.Exception -> L7b
            X.C3Z r0 = (X.C3Z) r0     // Catch: java.lang.Exception -> L7b
            r0.getClass()     // Catch: java.lang.Exception -> L7b
            if (r4 == 0) goto L88
            T r0 = r4.data     // Catch: java.lang.Exception -> L7b
            webcast.api.creator.PushStreamInfo r0 = (webcast.api.creator.PushStreamInfo) r0     // Catch: java.lang.Exception -> L7b
            if (r0 == 0) goto L88
            java.lang.String r0 = r0.sdkParams     // Catch: java.lang.Exception -> L7b
            if (r0 != 0) goto L8a
            goto L88
        L7b:
            r2 = move-exception
            goto L7f
        L7d:
            r2 = move-exception
            r3 = r6
        L7f:
            java.lang.String r1 = "GoLiveChecker"
            java.lang.String r0 = "fetchStreamInfoApi error"
            X.C0NB.LJFF(r1, r0, r2)
            r3.LIZLLL = r2
        L88:
            java.lang.String r0 = ""
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29199Bd5.LIZ(X.2kd):java.lang.Object");
    }

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LIZJ = "";
        this.LIZLLL = null;
        C29306Beo.LJJIIJZLJL(this.LIZ, C36636EZk.LIZ, new C29201Bd7(this, interfaceC88472Yns, interfaceC65784Pro, null), 2);
    }
}
