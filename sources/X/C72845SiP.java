package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SiP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72845SiP extends TouchDelegate {
    public final List<C72847SiR> LIZ;
    public C72847SiR LIZIZ;

    public C72845SiP(View view) {
        super(new Rect(), view);
        this.LIZ = new ArrayList();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent event) {
        C72847SiR c72847SiR;
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    c72847SiR = this.LIZIZ;
                    if (c72847SiR == null && c72847SiR.onTouchEvent(event)) {
                        return true;
                    }
                }
            }
            c72847SiR = this.LIZIZ;
            this.LIZIZ = null;
            return c72847SiR == null ? false : false;
        }
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            C72847SiR c72847SiR2 = (C72847SiR) ListProtector.get(this.LIZ, i);
            if (c72847SiR2.onTouchEvent(event)) {
                this.LIZIZ = c72847SiR2;
                return true;
            }
        }
        return false;
    }
}
