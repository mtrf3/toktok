package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.KNe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51606KNe extends TuxTextView {
    public C51607KNf LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public final ARunnableS44S0100000_8 LJZL;
    public final java.util.Map<Integer, View> LL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LL;
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

    public final boolean LJJJIL() {
        if (C16310kV.LIZLLL(this) == 1) {
            return true;
        }
        return false;
    }

    public final int getCount() {
        return this.LJLZ;
    }

    public final int getEndPosition() {
        return this.LJLLLLLL;
    }

    public final int getSpeed() {
        return this.LJZ;
    }

    public final int getTaskInterval() {
        return this.LJZI;
    }

    public final void setCount(int i) {
        this.LJLZ = i;
    }

    public final void setEndPosition(int i) {
        this.LJLLLLLL = i;
    }

    public final void setSpeed(int i) {
        this.LJZ = i;
    }

    public final void setTaskInterval(int i) {
        this.LJZI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51606KNe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ku);
        this.LL = C62850Ola.LJFF(context, "context");
        this.LJLZ = -1;
        this.LJZ = 40;
        this.LJZI = 25;
        this.LJZL = new ARunnableS44S0100000_8(this, 192);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C51607KNf c51607KNf = this.LJLLLL;
        if (c51607KNf != null && !c51607KNf.LJII) {
            c51607KNf.LJII = true;
        }
        this.LJLLLL = null;
        super.setText(charSequence, bufferType);
    }
}
