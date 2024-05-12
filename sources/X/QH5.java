package X;

import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public final class QH5 {
    public final Resources LIZ;
    public final String LIZIZ;

    public QH5(Context context) {
        QH7.LJIIIIZZ(context);
        Resources resources = context.getResources();
        this.LIZ = resources;
        this.LIZIZ = resources.getResourcePackageName(R.string.dnr);
    }

    public final String LIZ(String str) {
        int identifier = this.LIZ.getIdentifier(str, "string", this.LIZIZ);
        if (identifier == 0) {
            return null;
        }
        return this.LIZ.getString(identifier);
    }
}
