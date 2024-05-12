package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xhg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85540Xhg extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final ConstraintLayout LJLJI;
    public final TextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final float LJLJJLL;
    public final IPrevLoginPlatformService LJLJL;

    public final String L(String str) {
        String LIZ = C88913eJ.LIZ(this.LJLIL, R.string.g3i, "item.context.getString(R…ginPage_LoginBadge2_body)");
        String LIZ2 = C88913eJ.LIZ(this.LJLIL, R.string.mu, "item.context.getString(R.string.Email)");
        String LIZ3 = C88913eJ.LIZ(this.LJLIL, R.string.jj4, "item.context.getString(R.string.phone)");
        String LIZ4 = C88913eJ.LIZ(this.LJLIL, R.string.j_0, "item.context.getString(R…ogin_loginMethodUsername)");
        int hashCode = str.hashCode();
        if (hashCode != -1068855134) {
            if (hashCode != -265713450) {
                if (hashCode == 96619420 && str.equals("email")) {
                    return Q8U.LIZIZ(new Object[]{LIZ2}, 1, LIZ, "format(format, *args)");
                }
            } else if (str.equals("username")) {
                return Q8U.LIZIZ(new Object[]{LIZ4}, 1, LIZ, "format(format, *args)");
            }
        } else if (str.equals("mobile")) {
            return Q8U.LIZIZ(new Object[]{LIZ3}, 1, LIZ, "format(format, *args)");
        }
        return C88913eJ.LIZ(this.LJLIL, R.string.g3k, "item.context.getString(R…oginPage_loginBadge_body)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85540Xhg(View view, SignupViewModel dependencies) {
        super(view);
        o.LJIIIZ(dependencies, "dependencies");
        this.LJLIL = view;
        View findViewById = view.findViewById(R.id.e_q);
        o.LJIIIIZZ(findViewById, "item.findViewById(R.id.icon)");
        this.LJLILLLLZI = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.bs8);
        o.LJIIIIZZ(findViewById2, "item.findViewById(R.id.container)");
        this.LJLJI = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.b9m);
        o.LJIIIIZZ(findViewById3, "item.findViewById(R.id.channel_name)");
        this.LJLJJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.i1k);
        o.LJIIIIZZ(findViewById4, "item.findViewById(R.id.prev_login_platform_hint)");
        this.LJLJJL = (TuxTextView) findViewById4;
        this.LJLJJLL = KL2.LJIIJJI(view.getContext()) - KL2.LIZJ(view.getContext(), 60.0f);
        this.LJLJL = PrevLoginPlatformService.LJIIL();
        view.setOnTouchListener(new AnonymousClass806(0.5f));
    }
}
