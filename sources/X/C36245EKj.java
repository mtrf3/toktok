package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity$loopGettingReplayFragment$1", f = "LiveReplayVideoClipActivity.kt", l = {451}, m = "invokeSuspend")
/* renamed from: X.EKj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36245EKj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ LiveReplayVideoClipActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36245EKj(LiveReplayVideoClipActivity liveReplayVideoClipActivity, InterfaceC67352kd<? super C36245EKj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = liveReplayVideoClipActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36245EKj c36245EKj = new C36245EKj(this.LJLJI, interfaceC67352kd);
        c36245EKj.LJLILLLLZI = obj;
        return c36245EKj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r9 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLIL
            r8 = 1
            if (r0 == 0) goto L4b
            if (r0 != r8) goto L7f
            java.lang.Object r7 = r10.LJLILLLLZI
            X.2pa r7 = (X.InterfaceC70422pa) r7
            X.C141335gf.LIZJ(r11)
        L10:
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity r0 = r10.LJLJI
            java.util.Map<X.OSZ<java.lang.Long, java.lang.Long>, java.lang.Long> r0 = r0.LL
            boolean r0 = r0.isEmpty()
            r5 = 0
            if (r0 != 0) goto L25
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity r0 = r10.LJLJI
            java.util.Map<X.OSZ<java.lang.Long, java.lang.Long>, java.lang.Long> r0 = r0.LL
            int r0 = r0.size()
            if (r0 <= r8) goto L2b
        L25:
            X.C48841JEv.LIZJ(r7, r5)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity r0 = r10.LJLJI
            java.util.Map<X.OSZ<java.lang.Long, java.lang.Long>, java.lang.Long> r0 = r0.LL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Collection r0 = r0.values()
            java.lang.Object r0 = X.ORZ.LJLLILLLL(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
            X.C48841JEv.LIZJ(r7, r5)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4b:
            X.C141335gf.LIZJ(r11)
            java.lang.Object r7 = r10.LJLILLLLZI
            X.2pa r7 = (X.InterfaceC70422pa) r7
            goto L72
        L53:
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity r6 = r10.LJLJI
            r6.getClass()
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            X.Svk r5 = r0.getLiveReplayFragment(r3)
            X.Skk r2 = new X.Skk
            r2.<init>(r6, r3)
            Y.AfS7S0100100_12 r1 = new Y.AfS7S0100100_12
            r0 = 2
            r1.<init>(r6, r3, r0)
            r5.LJJJLIIL(r2, r1)
        L72:
            r10.LJLILLLLZI = r7
            r10.LJLIL = r8
            r0 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r10)
            if (r0 != r9) goto L10
            return r9
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36245EKj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
