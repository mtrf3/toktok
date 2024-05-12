package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.376, reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass376 extends FrameLayout {
    public final List<View> LJLIL;
    public int LJLILLLLZI;

    public final View LIZ(int i) {
        if (i < 0 || i >= ((ArrayList) this.LJLIL).size()) {
            return null;
        }
        return (View) ListProtector.get(this.LJLIL, i);
    }

    public void setStatus(int i) {
        View LIZ;
        int i2 = this.LJLILLLLZI;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0 && (LIZ = LIZ(i2)) != null) {
            LIZ.setVisibility(4);
        }
        if (i >= 0) {
            setVisibility(0);
            View LIZ2 = LIZ(i);
            if (LIZ2 != null) {
                LIZ2.setVisibility(0);
            }
        } else {
            setVisibility(4);
        }
        this.LJLILLLLZI = i;
    }

    public AnonymousClass376(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = new ArrayList(5);
        this.LJLILLLLZI = -1;
    }
}
