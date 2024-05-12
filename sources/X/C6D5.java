package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6D5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6D5 extends RelativeLayout {
    public View LJLIL;
    public final TuxTextView LJLILLLLZI;

    public final View getNatureStickerLayoutView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6D5(Context context) {
        super(context);
        a1.LJFF(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dt1, this, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.LJLIL = LLLLIILL;
        TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.title);
        this.LJLILLLLZI = tuxTextView;
        View findViewById = this.LJLIL.findViewById(R.id.gwc);
        if (findViewById != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.e9);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            Context context2 = findViewById.getContext();
            o.LJIIIIZZ(context2, "natureStickerView.context");
            findViewById.setBackground(c110614Vt.LIZ(context2));
        }
        if (tuxTextView != null) {
            tuxTextView.setMinTextSize(18.0f);
        }
        Typeface typefaceByFontName = AVExternalServiceImpl.LIZ().typeFaceService().getTypefaceByFontName("Neon");
        if (typefaceByFontName != null && tuxTextView != null) {
            tuxTextView.setTypeface(typefaceByFontName);
        }
        addView(this.LJLIL);
    }

    public final void setNatureStickerLayoutView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLIL = view;
    }

    public final void setSpeciesName(String str) {
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }
}
