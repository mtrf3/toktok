package X;

import android.content.Context;
import android.widget.Toast;
import com.zhihu.matisse.internal.ui.widget.IncapableDialog;

/* renamed from: X.VrV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81053VrV {
    public final int LIZ;
    public final String LIZIZ;

    public C81053VrV(String str) {
        this.LIZIZ = str;
    }

    public C81053VrV(String str, int i) {
        this.LIZ = 1;
        this.LIZIZ = str;
    }

    public static void LIZ(Context context, C81053VrV c81053VrV) {
        if (c81053VrV == null) {
            return;
        }
        int i = c81053VrV.LIZ;
        if (i != 1) {
            if (i != 2) {
                C16880lQ.LLZILL(Toast.makeText(context, c81053VrV.LIZIZ, 0));
                return;
            }
            return;
        }
        IncapableDialog.vl(null, c81053VrV.LIZIZ).show(((ActivityC45651qj) context).getSupportFragmentManager(), IncapableDialog.class.getName());
    }
}
