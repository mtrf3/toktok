package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.CommentViewHolder$fetchPlayerData$1", f = "CommentViewHolder.kt", l = {199}, m = "invokeSuspend")
/* renamed from: X.3IJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C4JU LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3IJ(C4JU c4ju, InterfaceC67352kd<? super C3IJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c4ju;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3IJ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            CommentContent commentContent = (CommentContent) this.LJLILLLLZI.LLIIIILZ;
            if (commentContent != null) {
                C3IH c3ih = C3IH.LIZ;
                this.LJLIL = 1;
                obj = c3ih.LIZ(commentContent, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            C4JU c4ju = this.LJLILLLLZI;
            c4ju.LLIIJLIL = aweme;
            AwemeService.LIZ().R1(c4ju.LLIIJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
