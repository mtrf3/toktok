package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.2Ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57422Ne extends C107114Ih {
    public final java.util.Map<Integer, View> LJLJJI;

    @Override // X.C107114Ih
    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.C107114Ih
    public int getLayoutResource() {
        return R.layout.b8j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57422Ne(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
    }
}
