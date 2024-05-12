package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.2WL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WL extends SY4 {
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

    public final void setNeedCustomColor(boolean z) {
        this.LLIIIILZ = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (!this.LLIIIILZ) {
            super.setPressed(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2WL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIIIJ = C62850Ola.LJFF(context, "context");
    }
}
