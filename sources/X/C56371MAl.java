package X;

import android.content.Context;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.StoryWidgetMgr$refreshWidgetInternal$job$1", f = "StoryWidgetMgr.kt", l = {128, 136, 143}, m = "invokeSuspend")
/* renamed from: X.MAl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56371MAl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ List<Integer> LJLJJLL;
    public final /* synthetic */ MB4 LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56371MAl(String str, boolean z, Context context, List<Integer> list, MB4 mb4, InterfaceC67352kd<? super C56371MAl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = context;
        this.LJLJJLL = list;
        this.LJLJL = mb4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C56371MAl c56371MAl = new C56371MAl(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c56371MAl.LJLILLLLZI = obj;
        return c56371MAl;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01dd  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56371MAl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
