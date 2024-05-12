package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.comment.bubble.manager.StoryInteractionListManager$fetchStoryBulletList$1$1", f = "StoryInteractionListManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7By, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181907By extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C79Y LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<A2G<C1809378f>> LJLJI;
    public final /* synthetic */ A2G<C1809378f> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C181907By(String str, C79Y c79y, InterfaceC67352kd<? super A2G<C1809378f>> interfaceC67352kd, A2G<C1809378f> a2g, InterfaceC67352kd<? super C181907By> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLIL = str;
        this.LJLILLLLZI = c79y;
        this.LJLJI = interfaceC67352kd;
        this.LJLJJI = a2g;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C181907By(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!o.LJ(this.LJLIL, this.LJLILLLLZI.LJLILLLLZI)) {
            return C76800UCe.LIZ;
        }
        InterfaceC67352kd<A2G<C1809378f>> interfaceC67352kd = this.LJLJI;
        A2G<C1809378f> a2g = this.LJLJJI;
        C3C5.m7constructorimpl(a2g);
        interfaceC67352kd.resumeWith(a2g);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
