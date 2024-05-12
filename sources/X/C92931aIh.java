package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.aIh, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92931aIh extends AbstractC65781Prl implements InterfaceC88472Yns<Context, C92012a3s> {
    public static final C92931aIh LJLIL = new C92931aIh();

    public C92931aIh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C92012a3s invoke(Context context) {
        Context context2 = context;
        o.LJIIIZ(context2, "context");
        C92012a3s c92012a3s = new C92012a3s(context2);
        c92012a3s.setLayoutParams(new ViewGroup.LayoutParams(O6R.LJJIIZ(C91989a3V.LIZ(36)), O6R.LJJIIZ(C91989a3V.LIZ(36))));
        c92012a3s.LJLJLLL = -1L;
        if (c92012a3s.LJLL <= 0) {
            c92012a3s.setProgressBarInfo(O6R.LJJIIZ(C91989a3V.LIZ(36)));
        }
        int measuredHeight = c92012a3s.getMeasuredHeight();
        int measuredWidth = c92012a3s.getMeasuredWidth();
        if (measuredHeight > measuredWidth) {
            measuredHeight = measuredWidth;
        }
        if (1 <= measuredHeight && measuredHeight < c92012a3s.LJLL) {
            c92012a3s.setProgressBarInfo(measuredHeight);
        }
        c92012a3s.LJLJL = true;
        c92012a3s.LJLJLJ = true;
        c92012a3s.LJLJJLL = true;
        c92012a3s.postInvalidate();
        return c92012a3s;
    }
}
