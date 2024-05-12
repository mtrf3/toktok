package X;

import Y.ACListenerS35S0100000_15;
import Y.IDrS50S0100000_12;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import o3.h0;
import yq4.a;

/* renamed from: X.XiB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC85571XiB {
    public final InterfaceC85586XiQ LIZ;
    public final ActivityC86117Xqz LIZIZ;
    public final View LIZJ;
    public final List<C85542Xhi> LIZLLL;
    public final C62822Ol8 LJ;
    public final C5H3 LJFF;
    public final C5H3 LJI;
    public final C5H3 LJII;
    public final C5H3 LJIIIIZZ;
    public final C5H3 LJIIIZ;
    public C85539Xhf LJIIJ;
    public DialogC81625W1t LJIIJJI;
    public DialogC81625W1t LJIIL;
    public DialogC81625W1t LJIILIIL;

    public final C85539Xhf LIZ() {
        C85539Xhf c85539Xhf = this.LJIIJ;
        if (c85539Xhf != null) {
            return c85539Xhf;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public final RecyclerView LIZIZ() {
        Object value = this.LJII.getValue();
        o.LJIIIIZZ(value, "<get-channelList>(...)");
        return (RecyclerView) value;
    }

    public final SignupViewModel LIZJ() {
        return (SignupViewModel) this.LJ.getValue();
    }

    public final TuxTextView LJ() {
        Object value = this.LJIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-tvBottom>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView LJFF() {
        Object value = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-tvFooter>(...)");
        return (TuxTextView) value;
    }

    public int LIZLLL() {
        if (C85837XmT.LJII().equals("TR")) {
            return R.string.t5f;
        }
        if (C35870E5y.LIZ() || !LIZJ().gv0()) {
            return C85837XmT.LJFF();
        }
        if (((HashSet) C85837XmT.LIZ).contains(C85837XmT.LJII())) {
            return R.string.s5y;
        }
        return R.string.s5z;
    }

    public final void LJI() {
        TuxTextView LJ;
        if (LIZJ().gv0()) {
            LJ = LJFF();
        } else {
            LJ = LJ();
        }
        C85837XmT.LIZIZ(this.LIZIZ, LJ, new ACListenerS35S0100000_15(this, 153), new ACListenerS35S0100000_15(this, 154), new ACListenerS35S0100000_15(this, 155), LIZLLL(), AGJ.ACCOUNT_SIGNUP_OR_LOGIN.getValue());
        h0.LIZLLL(LJ);
    }

    public void LJII() {
        LIZIZ().LJIIJJI(new IDrS50S0100000_12(this, 11));
        LIZIZ().setLayoutManager(new LinearLayoutManager());
        LIZIZ().setClipChildren(false);
    }

    public static void LJIIIIZZ(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZIZ(new O0X(AGJ.ACCOUNT_SIGNUP_OR_LOGIN.getValue(), str, true, true, 4), new C85574XiE());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC85571XiB(InterfaceC85586XiQ interfaceC85586XiQ, ActivityC86117Xqz activityC86117Xqz, View view, List<? extends C85542Xhi> list) {
        o.LJIIIZ(view, "view");
        this.LIZ = interfaceC85586XiQ;
        this.LIZIZ = activityC86117Xqz;
        this.LIZJ = view;
        this.LIZLLL = list;
        this.LJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 731));
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJFF = C221108m2.LIZ(enumC221088m0, new AqS165S0100000_15(this, 733));
        this.LJI = C221108m2.LIZ(enumC221088m0, new AqS165S0100000_15(this, 732));
        this.LJII = C221108m2.LIZ(enumC221088m0, new AqS165S0100000_15(this, 730));
        this.LJIIIIZZ = C221108m2.LIZ(enumC221088m0, new AqS165S0100000_15(this, 735));
        this.LJIIIZ = C221108m2.LIZ(enumC221088m0, new AqS165S0100000_15(this, 734));
    }
}
