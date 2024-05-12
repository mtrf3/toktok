package X;

import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AoT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27357AoT extends C113664d8 {
    public final /* synthetic */ C27354AoQ<Object> LJLIL;

    public C27357AoT(C27354AoQ<Object> c27354AoQ) {
        this.LJLIL = c27354AoQ;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        C27354AoQ<Object> c27354AoQ = this.LJLIL;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        if (c27354AoQ.LJ(str)) {
            C27355AoR<Object> c27355AoR = this.LJLIL.LJLILLLLZI;
            c27355AoR.LJIIL.removeMessages(1);
            c27355AoR.LJIIL.sendEmptyMessageDelayed(1, 10L);
        } else {
            this.LJLIL.LJLILLLLZI.LIZ();
        }
        ImageView clearIcon = (ImageView) this.LJLIL.LIZIZ(R.id.be8);
        o.LJIIIIZZ(clearIcon, "clearIcon");
        int i4 = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i4 = 8;
        }
        clearIcon.setVisibility(i4);
    }
}
