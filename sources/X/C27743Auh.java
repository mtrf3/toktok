package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Auh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27743Auh extends LinearLayout {
    public TuxTextView LJLIL;
    public View LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxSheet LJLJJI;
    public int LJLJJL;
    public InterfaceC88472Yns<? super Integer, Boolean> LJLJJLL;
    public View LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27743Auh(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJJL = EnumC26917AhN.DEFAULT.getValue();
        setupView(context);
        View view = this.LJLILLLLZI;
        if (view != null) {
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 74), view);
        } else {
            o.LJIJI("sortClickArea");
            throw null;
        }
    }

    private final void setupView(Context context) {
        C16880lQ.LLLZIIL(R.layout.c8p, C16880lQ.LLZIL(context), this);
        View findViewById = findViewById(R.id.dll);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.following_title)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.k70);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.sort_click_area)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = findViewById(R.id.k73);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.sort_desc_text)");
        this.LJLJI = (TuxTextView) findViewById3;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        C26338AVi.LJIIIZ(this, Integer.valueOf(LJJIIZ), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), Integer.valueOf(LJJIIZ2), Integer.valueOf(C7MY.LIZIZ(4)), 16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(0);
    }

    public final void LIZ(int i) {
        String LJJZ;
        Boolean bool;
        String str;
        int i2 = this.LJLJJL;
        EnumC26917AhN enumC26917AhN = EnumC26917AhN.DEFAULT;
        if (i2 == enumC26917AhN.getValue()) {
            LJJZ = C44384HbQ.LJJZ(R.string.gko);
        } else {
            LJJZ = C44384HbQ.LJJZ(R.string.gkp);
        }
        InterfaceC88472Yns<? super Integer, Boolean> interfaceC88472Yns = this.LJLJJLL;
        if (interfaceC88472Yns != null) {
            bool = interfaceC88472Yns.invoke(Integer.valueOf(this.LJLJJL));
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            this.LJLJJL = i;
        } else {
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                tuxTextView.setText(LJJZ);
            } else {
                o.LJIJI("sortDescTextView");
                throw null;
            }
        }
        C188727au c188727au = new C188727au();
        if (this.LJLJJL == enumC26917AhN.getValue()) {
            str = "default";
        } else {
            str = "latest";
        }
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("livesdk_following_sort_change", c188727au.LIZ);
    }

    public final void setSortChangeCallback(InterfaceC88472Yns<? super Integer, Boolean> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJJLL = callback;
    }

    public final void setStyle(String style) {
        o.LJIIIZ(style, "style");
        if (o.LJ(style, "left")) {
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
                return;
            } else {
                o.LJIJI("followingTextView");
                throw null;
            }
        }
        TuxTextView tuxTextView2 = this.LJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(0);
        } else {
            o.LJIJI("followingTextView");
            throw null;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int i2 = 0;
        if (e1.LIZ(31744, "relation_following_sort_by_crash_fix", true, false)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = -1;
            if (i == 0) {
                i2 = -2;
            }
            layoutParams.height = i2;
        }
        super.setVisibility(i);
    }
}
