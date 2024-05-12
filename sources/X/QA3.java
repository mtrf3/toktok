package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public class QA3 implements InterfaceC66557QAf {
    public InterfaceC66566QAo LIZ;
    public Context LIZIZ;
    public final C66533Q9h LIZJ;

    public QA3(Context context, C66533Q9h c66533Q9h, InterfaceC66566QAo interfaceC66566QAo) {
        this.LIZIZ = context;
        this.LIZJ = c66533Q9h;
        this.LIZ = interfaceC66566QAo;
    }

    public static void LIZ(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
        }
    }
}
