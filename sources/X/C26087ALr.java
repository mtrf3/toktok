package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ALr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26087ALr extends ConstraintLayout {
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

    public final void setIcon(Image image) {
        if (image != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image.toImageUrlModel());
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
            LIZLLL.LJJIIJZLJL = (ImageView) _$_findCachedViewById(R.id.e_q);
            C16880lQ.LLJJJ(LIZLLL);
        }
    }

    public final void setTitle(String str) {
        if (str != null) {
            ((TextView) _$_findCachedViewById(R.id.title)).setText(str);
        }
    }

    public C26087ALr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a45, this, true);
    }
}
