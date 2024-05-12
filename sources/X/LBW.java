package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LBW extends TuxTextView implements LBX {
    public final java.util.Map<Integer, View> LJLLLL;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBW(Context context) {
        super(context, null, 6, 0);
        this.LJLLLL = C62850Ola.LJFF(context, "context");
    }

    @Override // X.LBX
    public void setNewColor(int i) {
        setTextColor(i);
    }

    public void setNewValue(String value) {
        o.LJIIIZ(value, "value");
        setText(value);
    }

    @Override // X.LBX
    public final LBW LJIILLIIL(String str, EnumC53838LBa fontSize) {
        int i;
        o.LJIIIZ(fontSize, "fontSize");
        setText(str);
        switch (LBZ.LIZ[fontSize.ordinal()]) {
            case 1:
                i = 23;
                break;
            case 2:
                i = 33;
                break;
            case 3:
                i = 101;
                break;
            case 4:
                i = 41;
                break;
            case 5:
                i = 42;
                break;
            case 6:
                i = 71;
                break;
            default:
                throw new C162476Zf();
        }
        setTuxFont(i);
        return this;
    }
}
