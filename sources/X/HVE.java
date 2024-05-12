package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HVE implements ISuperEntranceService {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(HVF.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean isNeedShowSuperEntranceTabDirect() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean isSuperEntranceResReady() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void preDownloadSuperEntranceRes(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void setShowedSuperEntranceTab() {
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void setSuperEntranceRecordClicked(Context context, boolean z) {
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean shouldShowSuperEntranceRecord(Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean shouldStartSuperEntrance(Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final List<String> getSuperEntranceEffectList() {
        return C61878OQg.INSTANCE;
    }
}
