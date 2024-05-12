package X;

import android.app.Application;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class F8F {
    public final Application LIZ;
    public final HashMap<String, F8Y> LIZIZ = new HashMap<>();

    public F8F(AwemeHostApplication awemeHostApplication) {
        if (awemeHostApplication != null) {
            this.LIZ = awemeHostApplication;
            return;
        }
        throw new RuntimeException("Godzilla init, application is null");
    }

    public final void LIZ(F8Y f8y) {
        String LIZIZ = f8y.LIZIZ();
        if (!TextUtils.isEmpty(LIZIZ)) {
            if (this.LIZIZ.get(LIZIZ) == null) {
                this.LIZIZ.put(LIZIZ, f8y);
                return;
            }
            throw new RuntimeException(C16880lQ.LLLZ("%s plugin is already exist", new Object[]{LIZIZ}));
        }
        throw new RuntimeException(C16880lQ.LLLZ("%s plugin name is null", new Object[]{f8y.getClass().getName()}));
    }
}
