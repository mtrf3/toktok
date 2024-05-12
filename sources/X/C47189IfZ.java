package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.IPortraitService;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.IfZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47189IfZ {
    public final IPortraitService LIZ;
    public final java.util.Map<String, List<String>> LIZIZ = new HashMap();

    public C47189IfZ() {
        IPortraitService iPortraitService = (IPortraitService) InjectedConfigManager.getConfig(IPortraitService.class);
        this.LIZ = iPortraitService == null ? IPortraitService.LIZ : iPortraitService;
    }

    public static IZG LIZ(String str) {
        SimVideoUrlModel LIZIZ;
        if (TextUtils.isEmpty(str) || (LIZIZ = C46877IaX.LIZ.LIZIZ(str)) == null || TextUtils.isEmpty(LIZIZ.getMeta())) {
            return null;
        }
        return IZG.from(LIZIZ.getMeta());
    }
}
