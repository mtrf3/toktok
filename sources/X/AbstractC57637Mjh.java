package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Mjh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC57637Mjh {
    public final User LIZ;

    public abstract boolean LIZ();

    public abstract boolean LIZIZ();

    public abstract boolean LIZJ();

    public AbstractC57637Mjh() {
        User curUser = HG3.LJIILL().getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        this.LIZ = curUser;
    }
}
