package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.RnO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70606RnO extends ConstraintLayout {
    public C70609RnR LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C70606RnO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a5j, this, true);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ink);
        if (_$_findCachedViewById != null) {
            C78946Uyc.LJJIIJZLJL(_$_findCachedViewById, new C70920RsS(), new AqS162S0100000_12(this, 1149), new AqS178S0100000_12(this, 574));
        }
    }
}
