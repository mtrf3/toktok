package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6J7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6J7 extends TuxTextView implements InterfaceC26019AJb {
    public boolean LJLLLL;
    public int LJLLLLLL;
    public final Animation LJLZ;
    public final java.util.Map<Integer, View> LJZ = new LinkedHashMap();

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZ;
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

    public C6J7(Context context) {
        super(context, null, R.attr.k0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.o1}, R.attr.k0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…terView, defStyleAttr, 0)");
        this.LJLLLLLL = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        this.LJLZ = translateAnimation;
        translateAnimation.setInterpolator(new CycleInterpolator(2.0f));
        translateAnimation.setDuration(500L);
    }

    public final void setErrorColor(int i) {
        this.LJLLLLLL = i;
    }

    @Override // X.InterfaceC26019AJb
    public final void LJJIIZI(int i, CharSequence charSequence) {
        int i2;
        if (charSequence != null) {
            i2 = charSequence.length();
        } else {
            i2 = 0;
        }
        if (i2 <= i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i2);
            LIZ.append('/');
            LIZ.append(i);
            setText(X1D.LIZIZ(LIZ));
            this.LJLLLL = false;
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String valueOf = String.valueOf(i2);
        spannableStringBuilder.append((CharSequence) valueOf).append((CharSequence) "/").append((CharSequence) String.valueOf(i));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.LJLLLLLL), 0, valueOf.length(), 17);
        setText(spannableStringBuilder);
        if (this.LJLLLL) {
            return;
        }
        startAnimation(this.LJLZ);
        this.LJLLLL = true;
    }
}
