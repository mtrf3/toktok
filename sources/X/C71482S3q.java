package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.S3q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71482S3q {
    public int LIZ;
    public final List<C71483S3r> LIZIZ;

    public /* synthetic */ C71482S3q() {
        this(null, false);
    }

    public final void LIZ(C71483S3r part) {
        o.LJIIIZ(part, "part");
        ((ArrayList) this.LIZIZ).add(part);
    }

    public final CharSequence LIZIZ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            C71483S3r c71483S3r = (C71483S3r) it.next();
            int i = this.LIZ;
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c71483S3r.LIZ);
            int i2 = 0;
            spannableStringBuilder.setSpan(new T5U(c71483S3r.LIZIZ, false), length, spannableStringBuilder.length(), 17);
            Integer num = c71483S3r.LJFF;
            if (num != null) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(num.intValue()), length, spannableStringBuilder.length(), 17);
            }
            if (-1 == i) {
                i = c71483S3r.LIZJ;
            }
            Integer LJI = C79045V0n.LJI(i, ctx);
            if (LJI != null) {
                i2 = LJI.intValue();
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public C71482S3q(C71482S3q c71482S3q, boolean z) {
        this.LIZ = -1;
        this.LIZIZ = new ArrayList();
        if (c71482S3q != null) {
            this.LIZ = c71482S3q.LIZ;
            if (z) {
                Iterator it = ((ArrayList) c71482S3q.LIZIZ).iterator();
                while (it.hasNext()) {
                    LIZ((C71483S3r) it.next());
                }
            }
        }
    }

    public static C71483S3r LIZJ(int i, int i2, int i3, String text) {
        o.LJIIIZ(text, "text");
        if (text.length() == 0) {
            return null;
        }
        return new C71483S3r(text, i, i2, i3);
    }
}
