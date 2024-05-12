package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.GetAndInsertAwemeOperator$invoke$2", f = "GetAndInsertAwemeOperator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.LuP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55753LuP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C55752LuO LJLIL;
    public final /* synthetic */ User LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55753LuP(C55752LuO c55752LuO, User user, InterfaceC67352kd<? super C55753LuP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c55752LuO;
        this.LJLILLLLZI = user;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55753LuP(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object LIZ = new JG4(this.LJLIL.LIZIZ).LIZ();
        C55752LuO c55752LuO = this.LJLIL;
        User user = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            Aweme aweme = (Aweme) LIZ;
            c55752LuO.LJ = aweme;
            if (user != null) {
                aweme.setSharer(user);
            }
            new C55751LuN(aweme, c55752LuO.LIZ).LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("GetAndInsert insert ");
            LIZ2.append(c55752LuO.LIZIZ);
            LIZ2.append('!');
            C221018lt.LJFF("@LinkRelation_Video", X1D.LIZIZ(LIZ2));
        }
        C55752LuO c55752LuO2 = this.LJLIL;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("@LinkRelation_Video", "GetAndInsert get aweme fail", m10exceptionOrNullimpl);
            Context context = c55752LuO2.LIZJ.get();
            if (context != null) {
                JG7.LIZ(context, m10exceptionOrNullimpl);
            }
        }
        this.LJLIL.LIZLLL = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
