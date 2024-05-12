package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.35N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35N extends RelativeLayout {
    public boolean LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ() {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(R.id.i4g);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.i4g);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35N(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bdg, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ajk});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…e.PrivacySettingItemView)");
        int i = obtainStyledAttributes.getInt(0, -1);
        Integer valueOf = Integer.valueOf(R.attr.eb);
        Integer valueOf2 = Integer.valueOf(R.attr.gp);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_bubble_ellipsis_right_fill;
                c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(22));
                c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(22));
                c2068389v.LJ = this.LJLIL ? valueOf : valueOf2;
                ((TuxIconView) LIZ()).setTuxIcon(c2068389v);
                return;
            }
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_stitch_fill;
            c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(22));
            c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(22));
            c2068389v2.LJ = this.LJLIL ? valueOf : valueOf2;
            ((TuxIconView) LIZ()).setTuxIcon(c2068389v2);
            return;
        }
        C2068389v c2068389v3 = new C2068389v();
        c2068389v3.LIZ = R.raw.icon_duet_fill;
        c2068389v3.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(22));
        c2068389v3.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(22));
        c2068389v3.LJ = this.LJLIL ? valueOf : valueOf2;
        ((TuxIconView) LIZ()).setTuxIcon(c2068389v3);
    }
}
