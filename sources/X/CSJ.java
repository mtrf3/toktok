package X;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CSJ extends C8FP {
    public CTX LJII;

    @Override // X.C8FP
    public final void LIZIZ(ClickableSpan clickableSpan) {
        CTX ctx = this.LJII;
        if (ctx != null) {
            ctx.onEventDown(clickableSpan);
        }
    }

    @Override // X.C8FP
    public final void LIZ(TextView textView, ClickableSpan clickableSpan) {
        MESSAGE message;
        MESSAGE message2;
        Object obj = null;
        if (clickableSpan instanceof C30777C6b) {
            if (textView != null) {
                obj = textView.getTag(R.id.lrn);
            }
            if ((obj instanceof CQO) && (message2 = ((CQO) obj).LJIJJLI) != 0) {
                CR3.LJ(message2);
                return;
            }
            return;
        }
        if (!(clickableSpan instanceof C30778C6c)) {
            return;
        }
        if (textView != null) {
            obj = textView.getTag(R.id.lrn);
        }
        if (!(obj instanceof CQO) || (message = ((CQO) obj).LJIJJLI) == 0) {
            return;
        }
        CR3.LIZLLL(message);
    }
}
