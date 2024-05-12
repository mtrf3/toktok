package X;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.widget.TextView;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.CUd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31403CUd implements InterfaceC31293CPx {
    public final TextView LJLIL;
    public final CharSequence LJLILLLLZI;

    public C31403CUd(TextView textView, CharSequence charSequence) {
        o.LJIIIZ(textView, "textView");
        this.LJLIL = textView;
        this.LJLILLLLZI = charSequence;
    }

    @Override // X.InterfaceC31293CPx
    public final void LJLIL(Bitmap bitmap, CQO<? extends CR6> cqo) {
        Spannable spannable;
        if (bitmap == null || cqo == null) {
            return;
        }
        int LJJLIIJ = s.LJJLIIJ(String.valueOf(this.LJLILLLLZI), " . ", 6);
        if (LJJLIIJ != -1) {
            CharSequence charSequence = this.LJLILLLLZI;
            if ((charSequence instanceof Spannable) && (spannable = (Spannable) charSequence) != null) {
                CXJ.LIZ(spannable, bitmap, LJJLIIJ + 1, LJJLIIJ + 2, cqo);
            }
        }
        this.LJLIL.setText(this.LJLILLLLZI);
    }
}
