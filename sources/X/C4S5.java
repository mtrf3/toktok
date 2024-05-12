package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.controller.manager.QuickShareManager$onLoadComplete$1$1$1", f = "QuickShareManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4S5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4S5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C4S6 LJLIL;
    public final /* synthetic */ List<C4SB> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4S5(C4S6 c4s6, List<? extends C4SB> list, InterfaceC67352kd<? super C4S5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c4s6;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4S5(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        r0 = r1.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        if ((r0 instanceof android.view.ViewGroup) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        r1 = r1.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        if ((r1 instanceof android.view.ViewGroup) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        r1 = (android.view.ViewGroup) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        if (r1 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        r1.setClipChildren(false);
        r1.setClipToPadding(false);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009d -> B:14:0x0089). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4S5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
