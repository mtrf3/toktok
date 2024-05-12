package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ARS {
    public final /* synthetic */ int LIZ = 0;
    public Object LIZIZ;
    public final Object LIZJ;
    public Object LIZLLL;

    public abstract View LIZIZ();

    public final String toString() {
        switch (this.LIZ) {
            case 1:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BaseStatFile{mPath='");
                Q89.LIZIZ(LIZ, (String) this.LIZJ, '\'', ", mFile=");
                LIZ.append(this.LIZLLL);
                LIZ.append(", mLastInfo=");
                LIZ.append(this.LIZIZ);
                LIZ.append('}');
                return X1D.LIZIZ(LIZ);
            default:
                return super.toString();
        }
    }

    public ARS(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZIZ = context;
        this.LIZJ = new ARJ(context);
    }

    public void LIZ(C26231ARf dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LIZLLL = dialog;
    }

    public ARS(String str) {
        this.LIZJ = str;
    }
}
