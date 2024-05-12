package X;

import android.text.TextPaint;
import android.view.View;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;

/* loaded from: classes10.dex */
public final class MF4 extends AnonymousClass899 {
    public final /* synthetic */ AwemeListFragmentImpl LJLIL;

    public MF4(AwemeListFragmentImpl awemeListFragmentImpl) {
        this.LJLIL = awemeListFragmentImpl;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.LJLIL.LLLZI();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
