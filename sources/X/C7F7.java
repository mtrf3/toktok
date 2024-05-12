package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.7F7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7F7 extends FrameLayout {
    public final SmartImageView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final View LJLJI;
    public final TuxTextView LJLJJI;
    public final View LJLJJL;
    public final TuxTextView LJLJJLL;
    public C7F9 LJLJL;
    public S1E LJLJLJ;
    public String LJLJLLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42625Go9.LIZIZ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42625Go9.LIZJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7F7(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        FrameLayout.inflate(context, R.layout.p2, this);
        View findViewById = findViewById(R.id.a47);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.anchor_tag_icon)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.a4c);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.anchor_tag_title)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.a49);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.anchor_tag_root)");
        this.LJLJI = findViewById3;
        View findViewById4 = findViewById(R.id.a4a);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.anchor_tag_subtitle)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = findViewById(R.id.a4p);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.anchor_title_divider)");
        this.LJLJJL = findViewById5;
        View findViewById6 = findViewById(R.id.a4r);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.anchor_title_point_divider)");
        this.LJLJJLL = (TuxTextView) findViewById6;
    }

    public static boolean LIZ(C7F9 chain) {
        o.LJIIIZ(chain, "chain");
        S1E s1e = (S1E) ORZ.LJLLLL(chain.LIZJ());
        if (s1e != null && s1e.LJIILJJIL() > 1) {
            return true;
        }
        return false;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPoiCommentAnchorShowEvent(C174056sL event) {
        C7F9 c7f9;
        S1E s1e;
        o.LJIIIZ(event, "event");
        try {
            if ((this.LJLJLJ instanceof S1T) && o.LJ(event.LJLIL, this.LJLJLLL) && (c7f9 = this.LJLJL) != null && (s1e = this.LJLJLJ) != null) {
                o.LJI(s1e);
                C7F9 c7f92 = this.LJLJL;
                o.LJI(c7f92);
                s1e.LJ(C44100HSm.LIZIZ(c7f9, s1e, LIZ(c7f92)));
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
