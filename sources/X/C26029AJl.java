package X;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.AJl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26029AJl extends View implements InterfaceC86816Y5k {
    public final C26021AJd LJLIL;
    public final C26018AJa LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26029AJl(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLIL = new C26021AJd(context, null, 6);
        this.LJLILLLLZI = new C26018AJa(context, null, 6);
    }

    @Override // X.InterfaceC86816Y5k
    public final void LIZ(InterfaceC88472Yns<? super EditText, C76800UCe> interfaceC88472Yns) {
        interfaceC88472Yns.invoke(this.LJLILLLLZI.getEditText());
    }

    @Override // X.InterfaceC86816Y5k
    public final C26021AJd LIZIZ(String str) {
        C26021AJd c26021AJd = this.LJLIL;
        c26021AJd.LJIIIIZZ(str);
        c26021AJd.setFormField(this.LJLILLLLZI);
        return c26021AJd;
    }

    @Override // X.InterfaceC86816Y5k
    public void setClearButton(boolean z) {
        this.LJLILLLLZI.LJ(z);
    }

    @Override // X.InterfaceC86816Y5k
    public void setErrorMsg(String str) {
        if (str == null || str.length() == 0) {
            this.LJLIL.LJI(false);
            return;
        }
        C26021AJd c26021AJd = this.LJLIL;
        c26021AJd.LJI(true);
        c26021AJd.LIZLLL(str);
    }

    @Override // X.InterfaceC86816Y5k
    public void setInputMode(int i) {
        ((TextView) this.LJLILLLLZI.LIZIZ(R.id.cps)).setInputType(i);
    }

    @Override // X.InterfaceC86816Y5k
    public void setPlaceholder(String placeholder) {
        o.LJIIIZ(placeholder, "placeholder");
        this.LJLILLLLZI.LJII(placeholder);
    }

    @Override // X.InterfaceC86816Y5k
    public void setText(String value) {
        o.LJIIIZ(value, "value");
        this.LJLILLLLZI.LJIIIZ(value);
    }
}
