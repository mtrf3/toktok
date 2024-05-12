package X;

import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S25 extends S2R<TuxTextView, String> {
    public S25(TuxTextView tuxTextView) {
        super(tuxTextView);
    }

    public final void LIZLLL(String data) {
        o.LJIIIZ(data, "data");
        ((TextView) this.LIZ).setText(data);
    }

    public final void LJ(int i) {
        if (i != ((TextView) this.LIZ).getMaxLines()) {
            ((TextView) this.LIZ).setMaxLines(i);
        }
    }
}
