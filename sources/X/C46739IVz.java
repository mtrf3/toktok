package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.exp.model.ExtCacheRootPathConfigExp;
import kotlin.jvm.internal.o;

/* renamed from: X.IVz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46739IVz {
    public static int LIZ(EnumC46736IVw enumC46736IVw) {
        if (enumC46736IVw != null && !TextUtils.isEmpty(enumC46736IVw.getCacheDir())) {
            Object value = IZ8.LLJJIJIL.getValue();
            o.LJIIIIZZ(value, "<get-ExtCacheRootPathConfigExp>(...)");
            java.util.Map<String, Integer> config = ((ExtCacheRootPathConfigExp) value).getConfig();
            if (config != null && config.containsKey(enumC46736IVw.getCacheDir()) && 1 == config.get(enumC46736IVw.getCacheDir()).intValue()) {
                return 1;
            }
        }
        return 0;
    }
}
