package X;

import android.app.Activity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.viewmodel.ShareActionHelper$validateAndLaunchEdit$1", f = "ShareActionHelper.kt", l = {54, 69, 88, 107}, m = "invokeSuspend")
/* renamed from: X.Hyg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45826Hyg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C43722HDy LJLJI;
    public final /* synthetic */ C45827Hyh LJLJJI;
    public final /* synthetic */ C43703HDf LJLJJL;
    public final /* synthetic */ Activity LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45826Hyg(C43722HDy c43722HDy, C45827Hyh c45827Hyh, C43703HDf c43703HDf, Activity activity, InterfaceC67352kd<? super C45826Hyg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c43722HDy;
        this.LJLJJI = c45827Hyh;
        this.LJLJJL = c43703HDf;
        this.LJLJJLL = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C45826Hyg(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0383 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45826Hyg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
