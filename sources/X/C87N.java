package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.87N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87N<T extends View> {
    public final int LIZ;
    public T LIZIZ;

    public C87N(int i) {
        this.LIZ = i;
    }

    public final T LIZ(BaseCommentWidget thisRef, InterfaceC74236TBo<?> property) {
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        if (this.LIZIZ == null) {
            T t = (T) thisRef.LJLJI.findViewById(this.LIZ);
            o.LJI(t);
            this.LIZIZ = t;
        }
        T t2 = this.LIZIZ;
        if (t2 != null) {
            return t2;
        }
        o.LJIJI("_value");
        throw null;
    }
}
