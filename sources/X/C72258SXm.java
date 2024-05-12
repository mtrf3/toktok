package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SXm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72258SXm extends TouchDelegate {
    public static final Rect LIZJ = new Rect();
    public final List<C72257SXl> LIZ;
    public C72257SXl LIZIZ;

    public C72258SXm(View view) {
        super(LIZJ, view);
        this.LIZ = new LinkedList();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent event) {
        C72257SXl c72257SXl;
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    c72257SXl = this.LIZIZ;
                    if (c72257SXl == null && c72257SXl.onTouchEvent(event)) {
                        return true;
                    }
                }
            }
            c72257SXl = this.LIZIZ;
            this.LIZIZ = null;
            return c72257SXl == null ? false : false;
        }
        for (int i = 0; i < ((LinkedList) this.LIZ).size(); i++) {
            C72257SXl c72257SXl2 = (C72257SXl) ListProtector.get(this.LIZ, i);
            if (c72257SXl2.onTouchEvent(event)) {
                this.LIZIZ = c72257SXl2;
                return true;
            }
        }
        return false;
    }
}
