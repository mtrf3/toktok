package X;

import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.17I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17I {
    public final List<Object> LIZ = new ArrayList();
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ(Object obj) {
        if (obj != null) {
            if (obj instanceof ClickableSpan) {
                ListProtector.add(this.LIZ, 0, obj);
            } else {
                ((ArrayList) this.LIZ).add(obj);
            }
        }
    }

    public final void LIZIZ(SpannableStringBuilder spannableStringBuilder) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            spannableStringBuilder.setSpan(it.next(), this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
    }
}
