package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import kotlin.jvm.internal.o;

/* renamed from: X.GSs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41558GSs implements InputFilter {
    public final InterfaceC41560GSu LJLIL;
    public final int LJLILLLLZI;
    public final EditText LJLJI;
    public boolean LJLJJI;

    public C41558GSs(C65769PrZ c65769PrZ, int i, EditText editText) {
        o.LJIIIZ(editText, "editText");
        this.LJLIL = c65769PrZ;
        this.LJLILLLLZI = i;
        this.LJLJI = editText;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i4) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(dest, "dest");
        if (i3 == i4 && o.LJ(source, "")) {
            return null;
        }
        if (i3 == i4 && this.LJLJJI) {
            this.LJLJJI = false;
            return null;
        }
        if (i3 < this.LJLILLLLZI) {
            InterfaceC41560GSu interfaceC41560GSu = this.LJLIL;
            if (interfaceC41560GSu != null) {
                ((GSR) ((C65769PrZ) interfaceC41560GSu).LIZ).LLJI = true;
            }
            this.LJLJJI = true;
            int selectionStart = this.LJLJI.getSelectionStart();
            int selectionEnd = this.LJLJI.getSelectionEnd();
            int length = this.LJLJI.length();
            this.LJLJI.setText(dest);
            this.LJLJI.post(new RunnableC41559GSt(this, length, selectionStart, selectionEnd));
            return dest.subSequence(i3, i4);
        }
        return source;
    }
}
