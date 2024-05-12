package X;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OBo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61496OBo implements M5A {
    public static final C61496OBo LJLIL = new C61496OBo();
    public static boolean LJLILLLLZI;

    @Override // X.M5A
    public final void onAppEnterBackGround() {
        LJLILLLLZI = true;
    }

    @Override // X.M5A
    public final void onAppEnterForeground() {
        if (LJLILLLLZI) {
            LJLILLLLZI = false;
            if (C33806DOo.LIZ()) {
                return;
            }
            new Handler().postDelayed(RunnableC61497OBp.LJLIL, TimeUnit.SECONDS.toMillis(5L));
        }
    }
}
