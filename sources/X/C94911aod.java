package X;

import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$cleanCacheDraft$1$1", f = "MainFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aod, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94911aod extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94911aod(String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94911aod(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String path = this.LJLIL;
        o.LJIIIZ(path, "path");
        try {
            if (C93733aVd.LIZIZ(path)) {
                File file = new File(path);
                if (file.isDirectory()) {
                    OR7.LLLIIL(file);
                } else {
                    C16880lQ.LLLZZIL(file);
                }
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }
}
