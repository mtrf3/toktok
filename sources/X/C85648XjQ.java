package X;

import Y.ACListenerS35S0100000_15;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XjQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85648XjQ extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final SignupViewModel LJLILLLLZI;
    public final C85665Xjh LJLJI;
    public final C252949wI LJLJJI;
    public final C74088T5w LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final long LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85648XjQ(View view, SignupViewModel dependencies) {
        super(view);
        o.LJIIIZ(dependencies, "dependencies");
        this.LJLIL = view;
        this.LJLILLLLZI = dependencies;
        C85665Xjh c85665Xjh = (C85665Xjh) view.findViewById(R.id.hnq);
        this.LJLJI = c85665Xjh;
        this.LJLJJI = (C252949wI) view.findViewById(R.id.hnp);
        C74088T5w c74088T5w = (C74088T5w) view.findViewById(R.id.hnn);
        this.LJLJJL = c74088T5w;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 927));
        this.LJLJL = System.currentTimeMillis();
        View findViewById = view.findViewById(R.id.hnr);
        findViewById.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        findViewById.setPadding(0, 0, 0, 0);
        C26338AVi.LJI(findViewById, null, null, null, Integer.valueOf((int) TypedValue.applyDimension(1, 24.0f, view.getContext().getResources().getDisplayMetrics())), false, 23);
        view.findViewById(R.id.hno).setVisibility(8);
        String enterFrom = dependencies.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "dependencies.enterFrom");
        String lv0 = dependencies.lv0();
        o.LJIIIIZZ(lv0, "dependencies.loginPanelType");
        c85665Xjh.LJLILLLLZI = enterFrom;
        c85665Xjh.LJLJI = lv0;
        c85665Xjh.getInputView().setTextWatcher(new C85651XjT(this));
        c85665Xjh.LIZJ();
        String string = view.getContext().getString(R.string.iav);
        o.LJIIIIZZ(string, "item.context.getString(R.string.mus_continue)");
        c74088T5w.setText(string);
        c74088T5w.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 273)));
    }

    public static void L(C85648XjQ c85648XjQ, Integer num, String str, String str2, String str3, String str4) {
        int i;
        c85648XjQ.getClass();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", "phone");
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("enter_method", str2);
        c35936E8m.LIZLLL("enter_type", str3);
        c35936E8m.LIZLLL("login_panel_type", str4);
        if (num == null || num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        c35936E8m.LIZ(i, "is_success");
        c35936E8m.LIZ(1, "is_register");
        if (num == null) {
            c35936E8m.LIZJ("error_code", "");
        } else {
            c35936E8m.LIZ(num.intValue(), "error_code");
        }
        FMX.LJIIL("register_click_next_result", c35936E8m.LIZ);
    }
}
