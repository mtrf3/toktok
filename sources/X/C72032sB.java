package X;

import com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiGridPage$getPopularStickers$1$2", f = "EmojiGridPage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2sB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72032sB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3UO LJLIL;
    public final /* synthetic */ List<C105454Bx> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72032sB(C3UO c3uo, List<C105454Bx> list, InterfaceC67352kd<? super C72032sB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3uo;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72032sB(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter = this.LJLIL.LJIILIIL;
        if (baseEmojiGridAdapter != null) {
            baseEmojiGridAdapter.setDataAfterLoadMore(this.LJLILLLLZI);
        }
        this.LJLIL.LJIIJ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
