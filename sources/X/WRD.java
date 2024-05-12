package X;

import android.content.Context;
import com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRD extends WRB {
    @Override // X.WRB
    public final boolean LJFF() {
        return C82807Weh.LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WRD(Context context, String filterRootDir, int i, List list, AndroidResourceFilterBackupPreferences preferences) {
        super(context, filterRootDir, i, list, preferences);
        o.LJIIIZ(filterRootDir, "filterRootDir");
        o.LJIIIZ(preferences, "preferences");
    }
}
