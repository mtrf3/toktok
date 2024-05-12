package X;

import android.text.TextPaint;
import android.view.View;

/* renamed from: X.XmS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85836XmS extends AbstractC188397aN {
    public final /* synthetic */ View.OnClickListener LJLJJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.LJLJJI;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(C85837XmT.LJ());
        textPaint.setUnderlineText(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85836XmS(int i, int i2, View.OnClickListener onClickListener) {
        super(i, i2);
        this.LJLJJI = onClickListener;
    }
}
