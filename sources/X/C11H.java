package X;

import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.appupdate.u;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.11H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11H {
    public final List<C11P> LIZ;
    public final C11B LIZIZ;
    public int LIZJ;

    public final MotionEvent LIZ() {
        C11B c11b = this.LIZIZ;
        if (c11b != null) {
            return (MotionEvent) c11b.LIZIZ.LIZJ;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11H(List<C11P> changes) {
        this(changes, null);
        o.LJIIIZ(changes, "changes");
    }

    public C11H(List<C11P> changes, C11B c11b) {
        o.LJIIIZ(changes, "changes");
        this.LIZ = changes;
        this.LIZIZ = c11b;
        MotionEvent LIZ = LIZ();
        int i = 0;
        if (LIZ != null) {
            LIZ.getButtonState();
        }
        MotionEvent LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.getMetaState();
        }
        MotionEvent LIZ3 = LIZ();
        int i2 = 2;
        if (LIZ3 != null) {
            int actionMasked = LIZ3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                        i2 = i;
                    }
                    i = 3;
                    i2 = i;
                }
                i = 2;
                i2 = i;
            }
            i = 1;
            i2 = i;
        } else {
            int size = changes.size();
            while (true) {
                if (i < size) {
                    C11P c11p = (C11P) ListProtector.get(changes, i);
                    if (u.LIZIZ(c11p)) {
                        break;
                    }
                    if (u.LIZ(c11p)) {
                        i2 = 1;
                        break;
                    }
                    i++;
                } else {
                    i2 = 3;
                    break;
                }
            }
        }
        this.LIZJ = i2;
    }
}
