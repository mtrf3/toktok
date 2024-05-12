package com.bytedance.android.livesdk.hints;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes6.dex */
public final class GiftHintsManager implements GenericLifecycleObserver {
    public static final GiftHintsManager LJLIL = new GiftHintsManager();
    public static volatile boolean LJLILLLLZI;
    public static volatile boolean LJLJI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LJLJI = false;
        LJLILLLLZI = false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:13)(2:10|11))(3:27|28|(1:30))|14|(1:16)(1:26)|(1:18)|19|20|(1:22)(2:23|24)))|33|6|7|(0)(0)|14|(0)(0)|(0)|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:13:0x004f, B:14:0x0052, B:16:0x005a, B:18:0x0060, B:19:0x0062, B:28:0x0030), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:13:0x004f, B:14:0x0052, B:16:0x005a, B:18:0x0060, B:19:0x0062, B:28:0x0030), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.android.livesdk.gift.model.GiftHintRequest r8, X.InterfaceC67352kd<? super java.util.List<com.bytedance.android.livesdk.gift.model.GiftHintInfo>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C32622CrC
            if (r0 == 0) goto L1f
            r6 = r9
            X.CrC r6 = (X.C32622CrC) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L25
            goto L4f
        L1f:
            X.CrC r6 = new X.CrC
            r6.<init>(r7, r9)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r1)
            X.PsI r1 = X.C65814PsI.LIZ()     // Catch: java.lang.Throwable -> L66
            java.lang.Class<com.bytedance.android.livesdk.hints.LiveGiftApi> r0 = com.bytedance.android.livesdk.hints.LiveGiftApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r2 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Throwable -> L66
            com.bytedance.android.livesdk.hints.LiveGiftApi r2 = (com.bytedance.android.livesdk.hints.LiveGiftApi) r2     // Catch: java.lang.Throwable -> L66
            java.util.List<java.lang.Integer> r1 = r8.hintIds     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "request.hintIds"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L66
            r6.LJLJI = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = r2.fetchGiftHints(r1, r6)     // Catch: java.lang.Throwable -> L66
            if (r1 != r5) goto L52
            return r5
        L4f:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L66
        L52:
            X.BFf r1 = (X.C28467BFf) r1     // Catch: java.lang.Throwable -> L66
            T r0 = r1.data     // Catch: java.lang.Throwable -> L66
            com.bytedance.android.livesdk.gift.model.GiftHintResponse$Data r0 = (com.bytedance.android.livesdk.gift.model.GiftHintResponse.Data) r0     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L5d
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftHintInfo> r1 = r0.hints     // Catch: java.lang.Throwable -> L66
            goto L5e
        L5d:
            r1 = r4
        L5e:
            if (r1 != 0) goto L62
            X.OQg r1 = X.C61878OQg.INSTANCE     // Catch: java.lang.Throwable -> L66
        L62:
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L66
            goto L6e
        L66:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L6e:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L75
        L74:
            return r4
        L75:
            r4 = r1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hints.GiftHintsManager.LIZ(com.bytedance.android.livesdk.gift.model.GiftHintRequest, X.2kd):java.lang.Object");
    }
}
