package X;

import android.os.Build;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N7K extends N7L {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        N7N n7n = (N7N) xBaseParamModel;
        o.LJIIIZ(type, "type");
        IShortcutService LJIIJ = TiktokShortcutManager.LJIIJ();
        if (LJIIJ.LJII() && Build.VERSION.SDK_INT >= 26) {
            XBaseModel LIZJ = ED5.LIZJ(N7M.class, null);
            ((N7M) LIZJ).setExist(Boolean.valueOf(LJIIJ.LIZIZ(n7n.getShortcutId())));
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "shortcut is not supported", 4);
    }
}
