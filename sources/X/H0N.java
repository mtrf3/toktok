package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$start$2$1", f = "BaseAIMusicUploadFrameTask.kt", l = {141, 144, 170, 172, 195, 204}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H0N extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ AbstractC41925Gcr LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0N(AbstractC41925Gcr abstractC41925Gcr, InterfaceC67352kd<? super H0N> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = abstractC41925Gcr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        H0N h0n = new H0N(this.LJLJJI, interfaceC67352kd);
        h0n.LJLJI = obj;
        return h0n;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x032e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03bd  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H0N.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
