package X;

import Y.ACallableS118S0100000_15;
import Y.AgS131S0100000_15;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xm5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85813Xm5 extends C85814Xm6 {
    public TextView LJLJJLL;

    @Override // X.C85814Xm6
    public final View LIZJ() {
        if (this.LJLIL.getLayoutResource() <= 0) {
            this.LJLIL.setLayoutResource(R.layout.nm);
        }
        View inflate = this.LJLIL.inflate();
        View findViewById = inflate.findViewById(R.id.amu);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.blocked_authenticator_text)");
        this.LJLJJLL = (TextView) findViewById;
        if (this.LJLJJI == null) {
            InterfaceC85818XmA interfaceC85818XmA = this.LJLILLLLZI;
            if (interfaceC85818XmA != null) {
                interfaceC85818XmA.LJJLL();
            }
        } else {
            C10K.LIZJ(new ACallableS118S0100000_15(this, 18)).LJ(new AgS131S0100000_15(this, 19), C10K.LJIIIIZZ, null);
        }
        return inflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85813Xm5(C29S activity, ViewStub viewStub, InterfaceC85818XmA authCallback) {
        super(activity, viewStub, authCallback);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(authCallback, "authCallback");
    }
}
