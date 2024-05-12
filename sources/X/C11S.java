package X;

import android.view.MotionEvent;
import android.widget.EditText;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.11S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11S {
    public long LIZ;
    public final Object LIZIZ;
    public Object LIZJ;

    public /* synthetic */ C11S(EditText caption) {
        o.LJIIIZ(caption, "caption");
        this.LIZIZ = caption;
        this.LIZJ = "";
        this.LIZ = System.currentTimeMillis();
    }

    public /* synthetic */ C11S(long j, List pointers, MotionEvent motionEvent) {
        o.LJIIIZ(pointers, "pointers");
        o.LJIIIZ(motionEvent, "motionEvent");
        this.LIZ = j;
        this.LIZIZ = pointers;
        this.LIZJ = motionEvent;
    }
}
