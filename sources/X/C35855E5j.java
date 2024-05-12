package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.NoSuchElementException;

/* renamed from: X.E5j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35855E5j {
    public static IPluginService.ReinstallCheck LIZ(int i) {
        for (IPluginService.ReinstallCheck reinstallCheck : IPluginService.ReinstallCheck.values()) {
            if (reinstallCheck.getValue() == i) {
                return reinstallCheck;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
