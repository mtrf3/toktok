package X;

import android.content.Context;
import android.widget.TextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.userId.ProfileUserIdAssem;
import fjb.a;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.widgets.userId.ProfileUserIdAssem$showTTChangeUsernameBubble$1$1", f = "ProfileUserIdAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9N0, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9N0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ProfileUserIdAssem LJLIL;
    public final /* synthetic */ C235719Mx LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ User LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9N0(ProfileUserIdAssem profileUserIdAssem, C235719Mx c235719Mx, int i, User user, InterfaceC67352kd<? super C9N0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = profileUserIdAssem;
        this.LJLILLLLZI = c235719Mx;
        this.LJLJI = i;
        this.LJLJJI = user;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9N0(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ProfileUserIdAssem profileUserIdAssem = this.LJLIL;
        TextView textView = profileUserIdAssem.LJLJI;
        if (textView == null) {
            return C76800UCe.LIZ;
        }
        Context context = profileUserIdAssem.getContext();
        if (context == null) {
            return C76800UCe.LIZ;
        }
        float x = ((textView.getX() + textView.getWidth()) - (textView.getHeight() / 2)) - ((textView.getX() + textView.getWidth()) / 2);
        ProfileUserIdAssem profileUserIdAssem2 = this.LJLIL;
        if (profileUserIdAssem2.LJLJJI == null || !this.LJLILLLLZI.LJLIL) {
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZ.LIZIZ = textView;
            c139825eE.LJI(WHL.BOTTOM);
            c139825eE.LIZ.LJI = (int) x;
            c139825eE.LJIIJJI(this.LJLJI);
            c139825eE.LJ(new AqS93S0300000_4(textView, this.LJLIL, this.LJLJJI, 187));
            c139825eE.LJII(new AqS154S0100000_4(this.LJLIL, 1199));
            profileUserIdAssem2.LJLJJI = c139825eE.LIZJ();
        }
        InterfaceC82683Wch interfaceC82683Wch = this.LJLIL.LJLJJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.show();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
