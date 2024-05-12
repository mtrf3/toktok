package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.views.TextClickable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Uuh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78703Uuh extends ClickableSpan {
    public final String LJLIL;
    public final /* synthetic */ TextClickable LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C78704Uui c78704Uui = this.LJLILLLLZI.LIZIZ;
        if (c78704Uui != null) {
            c78704Uui.LIZ(this.LJLIL);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C78704Uui c78704Uui = this.LJLILLLLZI.LIZIZ;
        if (c78704Uui != null) {
            T5S t5s = new T5S();
            t5s.LIZ(82);
            textPaint.setTypeface(t5s.getTypeface());
            textPaint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.gr, c78704Uui.LIZ.mContext));
            textPaint.setUnderlineText(true);
        }
    }

    public C78703Uuh(TextClickable textClickable, String str, int i) {
        this.LJLILLLLZI = textClickable;
        this.LJLIL = str;
    }
}
