package X;

import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YBY extends LinearLayout {
    public InputConnection LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZLLL() {
        InputConnection inputConnection = this.LJLIL;
        if (inputConnection != null) {
            String valueOf = String.valueOf(inputConnection.getTextBeforeCursor(100, 0));
            String valueOf2 = String.valueOf(inputConnection.getTextAfterCursor(100, 0));
            this.LJLILLLLZI = valueOf.length();
            this.LJLJI = i0.LJFF(valueOf, valueOf2);
        }
    }

    public final InputConnection getInputConnection() {
        return this.LJLIL;
    }

    public final void LIZIZ(char c) {
        String LIZIZ;
        InputConnection inputConnection = this.LJLIL;
        if (inputConnection == null || this.LJLILLLLZI >= 20) {
            return;
        }
        inputConnection.commitText(String.valueOf(c), 1);
        int i = this.LJLILLLLZI;
        this.LJLILLLLZI = i + 1;
        if (i >= this.LJLJI.length()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZIZ = q.LIZIZ(LIZ, this.LJLJI, c, LIZ);
        } else {
            String str = this.LJLJI;
            int i2 = this.LJLILLLLZI - 1;
            StringBuilder LIZ2 = X1D.LIZ();
            String substring = str.substring(0, i2);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ2.append(substring);
            LIZ2.append(c);
            String substring2 = str.substring(i2);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            LIZ2.append(substring2);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        this.LJLJI = LIZIZ;
    }

    public final synchronized void LIZJ(char c) {
        LIZLLL();
        LIZIZ(c);
    }

    public final void setInputConnection(InputConnection inputConnection) {
        this.LJLIL = inputConnection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YBY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        this.LJLJI = "";
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.d63, this, true);
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1i), new ACListenerS35S0100000_15(this, 227));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1j), new ACListenerS35S0100000_15(this, 228));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1k), new ACListenerS35S0100000_15(this, 229));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1l), new ACListenerS35S0100000_15(this, 230));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1m), new ACListenerS35S0100000_15(this, 231));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1n), new ACListenerS35S0100000_15(this, 232));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1o), new ACListenerS35S0100000_15(this, 233));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1p), new ACListenerS35S0100000_15(this, 234));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1q), new ACListenerS35S0100000_15(this, 235));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1r), new ACListenerS35S0100000_15(this, 225));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.b1x), new ACListenerS35S0100000_15(this, 226));
    }
}
