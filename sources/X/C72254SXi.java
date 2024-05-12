package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SXi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72254SXi extends TouchDelegate {
    public static final Rect LIZJ = new Rect();
    public final List<C72256SXk> LIZ;
    public C72256SXk LIZIZ;

    public C72254SXi(View view) {
        super(LIZJ, view);
        this.LIZ = new LinkedList();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent event) {
        C72256SXk c72256SXk;
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    c72256SXk = this.LIZIZ;
                    if (c72256SXk == null && c72256SXk.onTouchEvent(event)) {
                        return true;
                    }
                }
            }
            c72256SXk = this.LIZIZ;
            this.LIZIZ = null;
            return c72256SXk == null ? false : false;
        }
        for (int i = 0; i < ((LinkedList) this.LIZ).size(); i++) {
            C72256SXk c72256SXk2 = (C72256SXk) ListProtector.get(this.LIZ, i);
            if (c72256SXk2.onTouchEvent(event)) {
                this.LIZIZ = c72256SXk2;
                return true;
            }
        }
        return false;
    }
}
