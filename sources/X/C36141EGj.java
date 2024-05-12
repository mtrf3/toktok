package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.livephoto.BaseLivePhotoComponent$tryTakeLivePhoto$1", f = "BaseLivePhotoComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EGj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36141EGj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC83766WuA LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36141EGj(AbstractC83766WuA abstractC83766WuA, String str, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC83766WuA;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C36141EGj(this.LJLIL, this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LJJLIIIJJI()) {
            AbstractC83766WuA abstractC83766WuA = this.LJLIL;
            if (!abstractC83766WuA.LJLJLJ && !abstractC83766WuA.LJLJLLL) {
                abstractC83766WuA.LJJZZIII(this.LJLILLLLZI, this.LJLJI);
            }
        }
        return C76800UCe.LIZ;
    }
}
