package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.RegexpString;
import kotlin.jvm.internal.o;

/* renamed from: X.9NG, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9NG {
    public static final KUN LIZ = new KUN(EF7.LIZIZ(), "change_username");

    public static final boolean LIZIZ() {
        String LIZLLL = AV1.LIZLLL(HG3.LJIILL().getCurUser());
        o.LJIIIIZZ(LIZLLL, "getHandle(user)");
        return LIZ(LIZLLL);
    }

    public static final boolean LIZ(String userName) {
        o.LJIIIZ(userName, "userName");
        if (TextUtils.isEmpty(userName)) {
            return true;
        }
        OJD ojd = new OJD("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("handle_settings", RegexpString.class);
            o.LJIIIIZZ(LJII, "getInstance().getValue(C…ernameRegexp::class.java)");
            String str = ((RegexpString) LJII).regexp;
            if (str != null) {
                ojd = new OJD(str);
            }
        } catch (Throwable unused) {
            ojd = new OJD("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        }
        return ojd.matches(userName);
    }
}
