package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.zhiliaoapp.musically.R;

/* renamed from: X.A8w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC25754A8w extends Dialog {
    public DialogC25754A8w(Context context) {
        super(context, R.style.a93);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C16880lQ.LLLZIIL(R.layout.bp6, C16880lQ.LLZIL(getContext()), null));
        C8ID c8id = (C8ID) findViewById(R.id.g7r);
        if (c8id != null) {
            c8id.setVisibility(0);
        }
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
    }
}
