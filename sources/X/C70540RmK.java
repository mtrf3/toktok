package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RmK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70540RmK extends LinearLayout {
    public boolean LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    private final void setIconStyle(boolean z) {
        int i;
        Drawable drawable;
        int i2;
        this.LJLIL = z;
        if (z) {
            i = R.attr.go;
        } else {
            i = R.attr.dj;
        }
        View LIZ = LIZ(R.id.eb1);
        Drawable drawable2 = null;
        if (z) {
            drawable = null;
        } else {
            drawable = getContext().getDrawable(R.drawable.af1);
        }
        LIZ.setBackground(drawable);
        ((C70653Ro9) LIZ(R.id.eb1)).setTintColor(i);
        View LIZ2 = LIZ(R.id.ec0);
        if (!z) {
            drawable2 = getContext().getDrawable(R.drawable.af1);
        }
        LIZ2.setBackground(drawable2);
        ((C70653Ro9) LIZ(R.id.ec0)).setTintColor(i);
        if (z) {
            i2 = R.drawable.af2;
        } else {
            i2 = R.color.cz;
        }
        setBackgroundResource(i2);
    }

    public final void setCloseAlpha(float f) {
        LIZ(R.id.eb1).setAlpha(f);
    }

    public final void setCloseStyle(boolean z) {
        int i;
        Drawable drawable;
        if (z) {
            i = R.attr.go;
        } else {
            i = R.attr.dj;
        }
        ((C70653Ro9) LIZ(R.id.eb1)).setTintColor(i);
        View LIZ = LIZ(R.id.eb1);
        if (z) {
            drawable = null;
        } else {
            drawable = getContext().getDrawable(R.drawable.af1);
        }
        LIZ.setBackground(drawable);
    }

    public final void setMoreVisible(boolean z) {
        int i;
        C018905p c018905p;
        View LIZ = LIZ(R.id.ec0);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LIZ.setVisibility(i);
        View LIZ2 = LIZ(R.id.g3x);
        ViewGroup.LayoutParams layoutParams = LIZ2.getLayoutParams();
        C018905p c018905p2 = null;
        if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
            if (!z) {
                c018905p.endToStart = -1;
                c018905p.endToEnd = 0;
            } else {
                c018905p.endToStart = R.id.ec0;
                c018905p.endToEnd = -1;
            }
            c018905p2 = c018905p;
        }
        LIZ2.setLayoutParams(c018905p2);
    }

    public final void setNavIconVisible(boolean z) {
        int i;
        View LIZ = LIZ(R.id.g3x);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LIZ.setVisibility(i);
    }

    public final void setOnCloseClick(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        View icon_close = LIZ(R.id.eb1);
        o.LJIIIIZZ(icon_close, "icon_close");
        C16880lQ.LJIIJ(new Au2S20S0100000_12((InterfaceC65784Pro) block, 20), icon_close);
    }

    public final void setOnMoreClick(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        View icon_more = LIZ(R.id.ec0);
        o.LJIIIIZZ(icon_more, "icon_more");
        C16880lQ.LJIIJ(new Au2S20S0100000_12((InterfaceC65784Pro) block, 21), icon_more);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70540RmK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a2p, this, true);
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.agt});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.PdpHeadNavView)");
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        setIconStyle(z);
    }
}
