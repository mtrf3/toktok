package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85523Xg extends TuxTextView {
    public final java.util.Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLLLL;
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

    public C85523Xg(Context context) {
        super(context, null, 0);
        setBackgroundResource(R.drawable.abj);
        setTuxFont(72);
        setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0);
        setGravity(17);
    }

    public final void setIsSelected(boolean z) {
        int i;
        setSelected(z);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (z) {
            i = R.attr.go;
        } else {
            i = R.attr.dj;
        }
        setTextColor(AnonymousClass636.LJIIIIZZ(i, context));
    }

    public final void setTitle(String str) {
        setText(str);
    }
}
