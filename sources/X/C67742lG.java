package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM$syncFollowStatus$2", f = "TopVideoHolderVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67742lG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ User LJLILLLLZI;
    public final /* synthetic */ TopVideoHolderVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67742lG(User user, TopVideoHolderVM topVideoHolderVM, InterfaceC67352kd<? super C67742lG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = user;
        this.LJLJI = topVideoHolderVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C67742lG c67742lG = new C67742lG(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c67742lG.LJLIL = obj;
        return c67742lG;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        Integer num;
        C141335gf.LIZJ(obj);
        User user = this.LJLILLLLZI;
        TopVideoHolderVM topVideoHolderVM = this.LJLJI;
        try {
            int followStatus = user.getFollowStatus();
            int i = 1;
            if (followStatus != 1 && followStatus != 2) {
                i = 0;
            }
            Object value = topVideoHolderVM.LJLLJ.getValue();
            o.LJIIIIZZ(value, "<get-userService>(...)");
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            String secUid = user.getSecUid();
            o.LJIIIIZZ(secUid, "user.secUid");
            FollowStatus LJIIIIZZ = ((IUserService) value).LJIIIIZZ(i, uid, secUid);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("syncFollowStatus success, result followStatus: ");
            if (LJIIIIZZ == null) {
                num = null;
            } else {
                num = new Integer(LJIIIIZZ.followStatus);
            }
            LIZ2.append(num);
            LIZ = new Integer(android.util.Log.d("TopVideoVm", X1D.LIZIZ(LIZ2)));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl == null) {
            return null;
        }
        return new Integer(android.util.Log.d("TopVideoVm", "syncFollowStatus error: " + m10exceptionOrNullimpl));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
