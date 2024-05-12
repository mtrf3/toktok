package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.6Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159356Nf extends AbstractC161116Tz<AICaptionTagStickerModel> {
    public final TextView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159356Nf(Context context) {
        super(context, (AttributeSet) null, 0, 8);
        a1.LJFF(context, "context");
        this.LJLJJL = (TextView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bhw, this, true).findViewById(R.id.lzh);
    }

    public final void LIZ(boolean z) {
        if (z) {
            TextView textView = this.LJLJJL;
            if (textView != null) {
                textView.setText(R.string.f_);
                return;
            }
            return;
        }
        TextView textView2 = this.LJLJJL;
        if (textView2 == null) {
            return;
        }
        textView2.setText(R.string.fa);
    }
}
