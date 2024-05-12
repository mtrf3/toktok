package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jm1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50137Jm1 extends FrameLayout {
    public C7ZY LJLIL;
    public C7ZY LJLILLLLZI;
    public C7ZY LJLJI;
    public ViewGroup LJLJJI;
    public ViewGroup LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C50137Jm1(Context context) {
        super(context, null, 0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cja, this, true);
        View findViewById = findViewById(R.id.mj1);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_search_result)");
        this.LJLIL = (C7ZY) findViewById;
        View findViewById2 = findViewById(R.id.m30);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_correct_strong)");
        this.LJLILLLLZI = (C7ZY) findViewById2;
        View findViewById3 = findViewById(R.id.m31);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_correct_weak)");
        this.LJLJI = (C7ZY) findViewById3;
        View findViewById4 = findViewById(R.id.klr);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.strong_container)");
        this.LJLJJI = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(R.id.nhm);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.weak_container)");
        this.LJLJJL = (ViewGroup) findViewById5;
    }

    public final void setTopMargin(int i) {
        C7ZY c7zy = this.LJLIL;
        if (c7zy != null) {
            ViewGroup.LayoutParams layoutParams = c7zy.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
            }
            c7zy.setLayoutParams(layoutParams);
            return;
        }
        o.LJIJI("tvSearchResult");
        throw null;
    }

    public static void LIZIZ(int i, String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (i == 2) {
            str6 = "strong";
        } else {
            str6 = "weak";
        }
        C50168JmW c50168JmW = new C50168JmW();
        c50168JmW.LJIIZILJ("action_type", str);
        c50168JmW.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(str4));
        c50168JmW.LJIIZILJ("correction_type", str6);
        c50168JmW.LJIIZILJ("impr_id", str4);
        c50168JmW.LJIIZILJ("corrected_keyword", str2);
        c50168JmW.LJIIZILJ("original_keyword", str3);
        c50168JmW.LJIIZILJ("click_type", str5);
        c50168JmW.LJIILIIL();
    }
}
