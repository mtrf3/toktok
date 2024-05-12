package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostDeleteServiceImpl$onDislikeBtnClick$1", f = "NowPostDeleteService.kt", l = {109}, m = "invokeSuspend")
/* renamed from: X.Mki, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57700Mki extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57700Mki(Aweme aweme, InterfaceC67352kd<? super C57700Mki> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57700Mki(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                Aweme aweme = this.LJLILLLLZI;
                C57701Mkj c57701Mkj = InterfaceC57702Mkk.LIZ;
                User author = aweme.getAuthor();
                o.LJIIIIZZ(author, "aweme.author");
                EnumC57876MnY enumC57876MnY = EnumC57876MnY.TT_NOW_FEED;
                int value = EnumC46514INi.SCENE_FOR_YOU_PAGE.getValue();
                int value2 = EnumC57697Mkf.DISLIKE_USER.getValue();
                this.LJLIL = 1;
                c57701Mkj.getClass();
                Object LIZ = C57703Mkl.LIZJ.LIZ(author, enumC57876MnY, value, value2, this);
                if (LIZ != enumC58928NAu) {
                    LIZ = C76800UCe.LIZ;
                }
                if (LIZ == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
