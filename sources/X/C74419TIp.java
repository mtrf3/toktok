package X;

import Y.AfS64S0100000_12;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$1$1", f = "DefaultStickerSource.kt", l = {520, 113, 116}, m = "invokeSuspend")
/* renamed from: X.TIp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74419TIp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ AfS64S0100000_12 LJLJJI;
    public final /* synthetic */ C74389THl LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74419TIp(AfS64S0100000_12 afS64S0100000_12, C74389THl c74389THl, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = afS64S0100000_12;
        this.LJLJJL = c74389THl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C74419TIp(this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0054 -> B:7:0x0017). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0064 -> B:7:0x0017). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007a -> B:7:0x0017). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74419TIp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
