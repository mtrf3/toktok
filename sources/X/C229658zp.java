package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM$preload$2", f = "MixBottomBarVM.kt", l = {94, 95, 107}, m = "invokeSuspend")
/* renamed from: X.8zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229658zp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ MixBottomBarVM LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ C229708zu LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229658zp(String str, Aweme aweme, int i, MixBottomBarVM mixBottomBarVM, String str2, C229708zu c229708zu, InterfaceC67352kd<? super C229658zp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
        this.LJLJJI = aweme;
        this.LJLJJL = i;
        this.LJLJJLL = mixBottomBarVM;
        this.LJLJL = str2;
        this.LJLJLJ = c229708zu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C229658zp(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:14:0x00a3, B:15:0x00a6, B:17:0x00ac, B:21:0x00d8, B:22:0x00df, B:24:0x0092, B:25:0x0095, B:30:0x002b), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:14:0x00a3, B:15:0x00a6, B:17:0x00ac, B:21:0x00d8, B:22:0x00df, B:24:0x0092, B:25:0x0095, B:30:0x002b), top: B:2:0x000f }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229658zp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
