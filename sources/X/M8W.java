package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsgHighlight;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8W extends ClickableSpan {
    public final /* synthetic */ M8V LJLIL;
    public final /* synthetic */ SafeInfoNoticeMsgHighlight LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View textView) {
        o.LJIIIZ(textView, "textView");
        List<SafeInfoNoticeMsgHighlight> list = this.LJLIL.LJIIJJI;
        o.LJI(list);
        if (list.size() != 1) {
            this.LJLIL.LIZ(this.LJLILLLLZI.scheme);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LJLIL.LIZ));
        ds.setUnderlineText(false);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
    }

    public M8W(M8V m8v, SafeInfoNoticeMsgHighlight safeInfoNoticeMsgHighlight) {
        this.LJLIL = m8v;
        this.LJLILLLLZI = safeInfoNoticeMsgHighlight;
    }
}
