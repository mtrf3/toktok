package X;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import o3.h0;

/* renamed from: X.1YZ, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1YZ implements InterfaceC20420r8, C6IY, HTD {
    public final /* synthetic */ Object LIZ;

    public /* synthetic */ C1YZ(Object obj) {
        this.LIZ = obj;
    }

    public final boolean LIZ(C20440rA c20440rA, int i, Bundle bundle) {
        View view = (View) this.LIZ;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c20440rA.LIZ.LIZ();
                InputContentInfo inputContentInfo = (InputContentInfo) c20440rA.LIZ.LIZLLL();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
            }
        }
        C16160kG c16160kG = new C16160kG(new ClipData(c20440rA.LIZ.getDescription(), new ClipData.Item(c20440rA.LIZ.LIZIZ())), 2);
        c16160kG.LIZ.LIZ(c20440rA.LIZ.LIZJ());
        c16160kG.LIZ.setExtras(bundle);
        if (h0.LJIILJJIL(view, c16160kG.LIZ.build()) == null) {
            return true;
        }
        return false;
    }
}
