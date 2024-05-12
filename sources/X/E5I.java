package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;

/* loaded from: classes7.dex */
public final class E5I {
    public static /* synthetic */ void LIZ(IPluginService iPluginService, Boolean bool, boolean z, int i, int i2) {
        if ((i2 & 8) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        iPluginService.startPluginRequest(null, null, null, bool, z, i);
    }
}
