package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.2WM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WM extends SY4 {
    public boolean LLIIIILZ;
    public final java.util.Map<Integer, View> LLIIIJ = new LinkedHashMap();

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

    public C2WM(Context context) {
        super(context, null, 0);
    }

    public final void setNeedRedBorder(boolean z) {
        this.LLIIIILZ = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (!this.LLIIIILZ) {
            super.setPressed(z);
        }
    }
}
