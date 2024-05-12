package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rnb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70619Rnb extends ConstraintLayout {
    public RVG LJLIL;
    public boolean LJLILLLLZI;
    public InterfaceC70635Rnr LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View _$_findCachedViewById(int i) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C70619Rnb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70619Rnb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        View.inflate(context, R.layout.a2y, this);
    }
}
