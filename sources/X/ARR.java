package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ARR extends SY4 {
    public boolean LLIIIILZ;
    public final java.util.Map<Integer, View> LLIIIJ;

    @Override // X.SY4, com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIIIJ;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARR(Context context) {
        super(context, null, 6, 0);
        this.LLIIIJ = C62850Ola.LJFF(context, "context");
    }

    private void setButtonVariant$___ob_twin___(int i) {
        super.setButtonVariant(i);
    }

    @Override // X.SY4
    public void setButtonVariant(int i) {
        int i2;
        Context ctx = getContext();
        setIconTintColorRes(R.attr.go);
        o.LJIIIIZZ(ctx, "ctx");
        Integer LJI = C79045V0n.LJI(R.attr.ct, ctx);
        if (LJI != null) {
            i2 = LJI.intValue();
        } else {
            i2 = 0;
        }
        setBackground(new ColorDrawable(i2));
        if (this.LLIIIILZ) {
            C78897Uxp.LJJJJJL(this, 0.0f);
            setOnTouchListener(null);
        } else {
            C78897Uxp.LJJJJLI(this, null);
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            setForeground(null);
        }
    }

    public final void setMaskPressed(boolean z) {
        this.LLIIIILZ = z;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{new ARJ(context).LJIILIIL, i}));
    }
}
