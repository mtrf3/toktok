package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;

/* JADX INFO: Add missing generic type declarations: [D] */
@InterfaceC65848Psq(c = "com.bytedance.mota.runner.cache.CacheRunner$run$1", f = "CacheRunner.kt", l = {29, 34, LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40, 44}, m = "invokeSuspend")
/* renamed from: X.XGf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84549XGf<D> extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super XGX<D>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public EnumC199577sP LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ XGS LJLJJI;
    public final /* synthetic */ C84550XGg LJLJJL;
    public final /* synthetic */ XGY<D> LJLJJLL;
    public final /* synthetic */ XGZ LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84549XGf(XGS xgs, C84550XGg c84550XGg, XGY<D> xgy, XGZ xgz, InterfaceC67352kd<? super C84549XGf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = xgs;
        this.LJLJJL = c84550XGg;
        this.LJLJJLL = xgy;
        this.LJLJL = xgz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C84549XGf c84549XGf = new C84549XGf(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c84549XGf.LJLJI = obj;
        return c84549XGf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0133, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v10, types: [D extends X.MfB, X.MfB] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84549XGf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(obj, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
