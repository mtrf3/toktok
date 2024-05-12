package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SAU extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public View LIZ(int i) {
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

    public void setDesc(String desc) {
        o.LJIIIZ(desc, "desc");
        ((TextView) LIZ(R.id.ba1)).setText(desc);
    }

    public void setVariant(SAX variant) {
        o.LJIIIZ(variant, "variant");
        int i = SAW.LIZ[variant.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((C71897SJp) LIZ(R.id.ba0)).setChecked(false);
                TextView textView = (TextView) LIZ(R.id.ba1);
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.gv, context);
                if (LJI != null) {
                    i2 = LJI.intValue();
                }
                textView.setTextColor(i2);
                LIZ(R.id.ba0).setAlpha(0.5f);
                LIZ(R.id.ba1).setAlpha(1.0f);
                LIZ(R.id.ba0).announceForAccessibility(((AppCompatTextView) LIZ(R.id.ba1)).getText());
                return;
            }
            ((C71897SJp) LIZ(R.id.ba0)).setChecked(true);
            TextView textView2 = (TextView) LIZ(R.id.ba1);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.go, context2);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
            textView2.setTextColor(i2);
            LIZ(R.id.ba0).setAlpha(1.0f);
            LIZ(R.id.ba1).setAlpha(1.0f);
            return;
        }
        ((C71897SJp) LIZ(R.id.ba0)).setChecked(false);
        TextView textView3 = (TextView) LIZ(R.id.ba1);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        Integer LJI3 = C79045V0n.LJI(R.attr.e7, context3);
        if (LJI3 != null) {
            i2 = LJI3.intValue();
        }
        textView3.setTextColor(i2);
        LIZ(R.id.ba0).setAlpha(0.5f);
        LIZ(R.id.ba1).setAlpha(0.5f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SAU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SAU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        View.inflate(context, R.layout.m6, this);
        setVariant(SAX.None);
    }
}
