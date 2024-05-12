package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Alo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27192Alo extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    public final void LJJLL(InterfaceC88472Yns interfaceC88472Yns) {
        View com_text = _$_findCachedViewById(R.id.biw);
        o.LJIIIIZZ(com_text, "com_text");
        interfaceC88472Yns.invoke(com_text);
    }

    public static void LJJLJLI(C27192Alo c27192Alo, C62562cu c62562cu) {
        View icon = c27192Alo._$_findCachedViewById(R.id.e_q);
        o.LJIIIIZZ(icon, "icon");
        OUP.LJJLIIIJ(icon);
        if (c62562cu != null) {
            W5F LJIIIZ = W5U.LJIIIZ(c62562cu);
            LJIIIZ.LJJIIJ = (SmartImageView) c27192Alo._$_findCachedViewById(R.id.e_q);
            C16880lQ.LLJJJ(LJIIIZ);
        } else {
            View icon2 = c27192Alo._$_findCachedViewById(R.id.e_q);
            o.LJIIIIZZ(icon2, "icon");
            OUP.LJIJJLI(icon2);
        }
        c27192Alo._$_findCachedViewById(R.id.e_q).setLayoutParams(c27192Alo._$_findCachedViewById(R.id.e_q).getLayoutParams());
    }

    public C27192Alo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.anu, this, true);
    }
}
