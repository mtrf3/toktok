package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.android.live.design.widget.LiveEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CIb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31089CIb extends LiveEditText {
    public final List<InterfaceC31088CIa> LJLL;

    public C31089CIb(Context context) {
        super(context, null);
        this.LJLL = new ArrayList();
    }

    @Override // X.C19K, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (super.onCreateInputConnection(editorInfo) == null) {
            return null;
        }
        return new C31103CIp(super.onCreateInputConnection(editorInfo));
    }

    @Override // X.C19K, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 || i == 16908337) {
            Iterator it = ((ArrayList) this.LJLL).iterator();
            while (it.hasNext()) {
                ((InterfaceC31088CIa) it.next()).LIZ();
            }
        }
        return onTextContextMenuItem;
    }

    public C31089CIb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLL = new ArrayList();
    }
}
