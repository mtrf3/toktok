package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4dE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113724dE extends SY4 {
    public Integer LLIIIILZ;
    public int LLIIIJ;
    public final java.util.Map<Integer, View> LLIIIL;

    @Override // X.SY4, com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIIIL;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final Integer getStyle() {
        return this.LLIIIILZ;
    }

    public final int getVariant() {
        return this.LLIIIJ;
    }

    @Override // X.SY4
    public void setButtonVariant(int i) {
        GradientDrawable gradientDrawable;
        super.setButtonVariant(i);
        this.LLIIIJ = i;
        if (isEnabled()) {
            Drawable background = getBackground();
            if (!(background instanceof GradientDrawable) || (gradientDrawable = (GradientDrawable) background) == null) {
                return;
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer num = this.LLIIIILZ;
            if (num != null) {
                num.intValue();
            }
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
            if (i != 0) {
                if (i == 4) {
                    gradientDrawable.setStroke(C17N.LJIILL(1.0f), LJIIIIZZ);
                    setTextColor(LJIIIIZZ);
                }
            } else {
                gradientDrawable.setColor(LJIIIIZZ);
            }
            setBackground(gradientDrawable);
        }
    }

    public final void setStyle(Integer num) {
        setButtonVariant(this.LLIIIJ);
        this.LLIIIILZ = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113724dE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LLIIIL = C62850Ola.LJFF(context, "context");
        this.LLIIIILZ = 1;
    }
}
