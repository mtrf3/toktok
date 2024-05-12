package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.8Hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208948Hy extends LinearLayout {
    public static boolean LJLJI = KevaImpl.getRepoFromSp(EF7.LIZIZ(), "aweme_debug_repo", 1).getBoolean("debug_info_visibility", false);
    public ScrollView LJLIL;
    public RelativeLayout LJLILLLLZI;

    public final boolean getDebugInfoVisibility() {
        return LJLJI;
    }

    @QD3
    public final void onEvent(C8I0 event) {
        o.LJIIIZ(event, "event");
        ScrollView scrollView = this.LJLIL;
        if (scrollView != null) {
            LJLJI = false;
            scrollView.setVisibility(8);
        }
    }

    public final void setContent(String str) {
        if (!((RBX) HG3.LJIILL()).isLogin() || !C38354F3m.LIZJ(EF7.LJIILIIL, "lark_inhouse")) {
            return;
        }
        C54293LSn c54293LSn = C235779Nd.LIZ;
        if (c54293LSn.LJIJJ == null) {
            c54293LSn.LJIJJ = new C36821Ecj<>("debug_text", Boolean.TRUE);
        }
        Boolean LIZ = c54293LSn.LJIJJ.LIZ();
        o.LJIIIIZZ(LIZ, "inst().openDebugText.cache");
        if (!LIZ.booleanValue()) {
            return;
        }
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.af2, this, true);
        View findViewById = findViewById(R.id.kw7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.sv_debugInfoContainer)");
        this.LJLIL = (ScrollView) findViewById;
        View findViewById2 = findViewById(R.id.j4o);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.rl_debugInfoAll)");
        this.LJLILLLLZI = (RelativeLayout) findViewById2;
        EventBus.LIZJ().LJIILJJIL(this);
        RelativeLayout relativeLayout = this.LJLILLLLZI;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
            if (LJLJI) {
                ScrollView scrollView = this.LJLIL;
                if (scrollView != null) {
                    scrollView.setVisibility(0);
                } else {
                    o.LJIJI("mDebugInfoContainer");
                    throw null;
                }
            } else {
                ScrollView scrollView2 = this.LJLIL;
                if (scrollView2 != null) {
                    scrollView2.setVisibility(8);
                } else {
                    o.LJIJI("mDebugInfoContainer");
                    throw null;
                }
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(str);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "this.context");
            tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, context2));
            tuxTextView.setGravity(getLeft());
            tuxTextView.setTextAlignment(5);
            tuxTextView.setLineSpacing(0.0f, 1.5f);
            tuxTextView.setTextDirection(5);
            ScrollView scrollView3 = this.LJLIL;
            if (scrollView3 != null) {
                scrollView3.removeAllViews();
                ScrollView scrollView4 = this.LJLIL;
                if (scrollView4 != null) {
                    scrollView4.addView(tuxTextView);
                    return;
                } else {
                    o.LJIJI("mDebugInfoContainer");
                    throw null;
                }
            }
            o.LJIJI("mDebugInfoContainer");
            throw null;
        }
        o.LJIJI("mDebugInfoAll");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208948Hy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
