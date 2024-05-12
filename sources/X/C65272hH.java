package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.StoryPublishServiceImpl$getCover$1$1", f = "StoryPublishServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65272hH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65272hH(InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns, Bitmap bitmap, InterfaceC67352kd<? super C65272hH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = bitmap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65272hH(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
