package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SAV extends SAU {
    public final java.util.Map<Integer, View> LJLILLLLZI;

    @Override // X.SAU
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

    @Override // X.SAU
    public void setDesc(String desc) {
        o.LJIIIZ(desc, "desc");
        ((TextView) LIZ(R.id.ba1)).setText(desc);
    }

    @Override // X.SAU
    public void setVariant(SAX variant) {
        o.LJIIIZ(variant, "variant");
        int i = SAY.LIZ[variant.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            ((C71897SJp) LIZ(R.id.ba0)).setChecked(true);
            ((TextView) LIZ(R.id.ba1)).setTextColor(C06690Ob.LIZIZ(getResources(), R.color.ck, null));
            return;
        }
        ((C71897SJp) LIZ(R.id.ba0)).setChecked(false);
        ((TextView) LIZ(R.id.ba1)).setTextColor(C06690Ob.LIZIZ(getResources(), R.color.cu, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SAV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
    }
}
