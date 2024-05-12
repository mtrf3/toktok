package X;

import androidx.recyclerview.widget.RecyclerView;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.UnboundedViewPool$preloadViews$2", f = "ChatRoomViewPool.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.45v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1038745v extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EnumC110124Tw LJLILLLLZI;
    public final /* synthetic */ C1038845w LJLJI;
    public final /* synthetic */ AbstractC1038245q LJLJJI;
    public final /* synthetic */ RecyclerView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038745v(EnumC110124Tw enumC110124Tw, C1038845w c1038845w, AbstractC1038245q abstractC1038245q, RecyclerView recyclerView, InterfaceC67352kd<? super C1038745v> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC110124Tw;
        this.LJLJI = c1038845w;
        this.LJLJJI = abstractC1038245q;
        this.LJLJJL = recyclerView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1038745v c1038745v = new C1038745v(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c1038745v.LJLIL = obj;
        return c1038745v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1038745v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
