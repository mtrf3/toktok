package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2;
import com.ss.android.ugc.aweme.deeplink.actions.ShortcutLinkAction;
import kotlin.jvm.internal.o;

/* renamed from: X.M5d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56233M5d extends M61 {
    public C56233M5d() {
        super(true);
    }

    @Override // X.M61
    public final void LIZIZ(M5X m5x) {
        String str;
        C56235M5f.LIZJ("LoginNode");
        Activity activity = m5x.LJLIL;
        if (activity instanceof AppLinkHandlerV2) {
            str = "from_app_link";
        } else {
            str = "from_deep_link";
        }
        M66.LIZIZ.LJIJI(activity, str);
    }

    @Override // X.M61
    public final boolean LIZJ(M5X m5x) {
        Object LIZ;
        ShortcutLinkAction.Companion.getClass();
        try {
            LIZ = UriProtector.getQueryParameter(m5x.LJLILLLLZI, "SHORTCUT_NEED_LOGIN");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            LIZ = "";
        }
        if (o.LJ("SHORTCUT_NEED_LOGIN_NO", LIZ)) {
            return false;
        }
        return C39176FZc.LIZ(m5x.LJLILLLLZI);
    }
}
