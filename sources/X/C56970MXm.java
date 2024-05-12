package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import java.util.HashMap;

/* renamed from: X.MXm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56970MXm extends DmtTextView {
    public InterfaceC56973MXp LJLJL;

    public C56970MXm(Context context) {
        super(context, null);
    }

    public C56970MXm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C56972MXo c56972MXo;
        int LIZ;
        InterfaceC56973MXp interfaceC56973MXp = this.LJLJL;
        if (interfaceC56973MXp != null) {
            Class<?> cls = interfaceC56973MXp.getClass();
            HashMap<Class, C56972MXo> hashMap = C56971MXn.LIZ;
            synchronized (hashMap) {
                c56972MXo = hashMap.get(cls);
            }
            if (c56972MXo != null && c56972MXo.LIZ) {
                LIZ = c56972MXo.LIZIZ;
            } else {
                LIZ = this.LJLJL.LIZ(this);
                C56971MXn.LIZ(this.LJLJL.getClass(), new C56972MXo(LIZ));
            }
            i = View.MeasureSpec.makeMeasureSpec(LIZ, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
