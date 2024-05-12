package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.shared.UserProfileVideoLruCache$removeAll$1", f = "UserProfileVideoLruCache.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40, 42}, m = "invokeSuspend")
/* renamed from: X.2f9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63952f9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C63972fB LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ C63972fB LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63952f9(C63972fB c63972fB, InterfaceC67352kd<? super C63952f9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c63972fB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63952f9(this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJJI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L63
            if (r0 == r4) goto L35
            if (r0 != r5) goto L88
            java.lang.Object r3 = r9.LJLILLLLZI
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.2fB r8 = r9.LJLIL
            X.C141335gf.LIZJ(r10)
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L15
            r9.LJLIL = r8
            r9.LJLILLLLZI = r3
            r9.LJLJI = r7
            r9.LJLJJI = r4
            r8.getClass()
            java.lang.Object r0 = X.C63972fB.LIZ(r7, r9)
            if (r0 != r6) goto L42
            return r6
        L35:
            java.lang.Object r7 = r9.LJLJI
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r9.LJLILLLLZI
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.2fB r8 = r9.LJLIL
            X.C141335gf.LIZJ(r10)
        L42:
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            java.lang.String r2 = "aweme_publish"
            java.lang.String r1 = "aweme_popular"
            r0 = 0
            java.lang.String r1 = ujb.o.LJJJJZ(r7, r2, r1, r0)
            r9.LJLIL = r8
            r9.LJLILLLLZI = r3
            r0 = 0
            r9.LJLJI = r0
            r9.LJLJJI = r5
            r8.getClass()
            java.lang.Object r0 = X.C63972fB.LIZ(r1, r9)
            if (r0 != r6) goto L15
            return r6
        L63:
            X.C141335gf.LIZJ(r10)
            X.2fB r0 = r9.LJLJJL
            java.util.LinkedHashMap r0 = r0.LIZIZ()
            java.util.Collection r1 = r0.values()
            java.lang.String r0 = "cacheMap.values"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.2fB r8 = r9.LJLJJL
            java.util.Iterator r3 = r1.iterator()
            goto L15
        L7c:
            X.2fB r0 = r9.LJLJJL
            java.util.LinkedHashMap r0 = r0.LIZIZ()
            r0.clear()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63952f9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
