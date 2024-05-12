package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.Ge1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41997Ge1 extends C19K {
    public GSY LJLJJLL;
    public InterfaceC41998Ge2 LJLJL;
    public boolean LJLJLJ;

    public final GSY LJI() {
        if (!this.LJLJLJ) {
            LLog.LIZLLL(3, "LynxEditText", "InputConnection has not been initialized yet ");
            return null;
        }
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41997Ge1(Context context) {
        super(context, null);
        o.LJIIJ(context, "context");
        this.LJLJJLL = new GSY();
    }

    @Override // X.C19K, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            try {
                GSY gsy = this.LJLJJLL;
                if (gsy != null) {
                    gsy.setTarget(onCreateInputConnection);
                }
                this.LJLJLJ = true;
                return this.LJLJJLL;
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    @Override // X.C19K, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i != 16908321) {
            return super.onTextContextMenuItem(i);
        }
        InterfaceC41998Ge2 interfaceC41998Ge2 = this.LJLJL;
        if (interfaceC41998Ge2 != null) {
            interfaceC41998Ge2.LIZ();
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException unused) {
            return true;
        }
    }

    public final void setBackSpaceListener(InterfaceC41548GSi interfaceC41548GSi) {
        GSY gsy = this.LJLJJLL;
        if (gsy != null) {
            gsy.LIZ = interfaceC41548GSi;
        }
    }

    public final void setCopyListener(InterfaceC41998Ge2 copyListener) {
        o.LJIIJ(copyListener, "copyListener");
        this.LJLJL = copyListener;
    }
}
