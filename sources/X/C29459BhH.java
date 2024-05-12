package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileV3Setting;
import com.bytedance.android.livesdk.usercard.profilev3.UserCardPreloadViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileRepository$flushUserQuery$2", f = "LiveProfileRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BhH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29459BhH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C29473BhV LJLIL;
    public final /* synthetic */ C29465BhN LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29459BhH(C29473BhV c29473BhV, C29465BhN c29465BhN, InterfaceC67352kd<? super C29459BhH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c29473BhV;
        this.LJLILLLLZI = c29465BhN;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29459BhH(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        User user = this.LJLIL.LIZ;
        if (user != null) {
            C29465BhN c29465BhN = this.LJLILLLLZI;
            UserCardPreloadViewModel userCardPreloadViewModel = c29465BhN.LJ;
            if (userCardPreloadViewModel != null) {
                Room room = c29465BhN.LIZ.LIZLLL;
                o.LJIIIZ(room, "room");
                long id = user.getId();
                if (LiveProfileV3Setting.INSTANCE.isEnableAuthorPrefetch() && id == room.getOwnerUserId()) {
                    userCardPreloadViewModel.LJLIL = user;
                }
            }
            this.LJLILLLLZI.LIZJ.setValue(new C29488Bhk<>(this.LJLIL, 0, null));
        } else {
            this.LJLILLLLZI.LIZJ.setValue(new C29488Bhk<>(this.LJLIL, 2, null));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
