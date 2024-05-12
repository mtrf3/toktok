package X;

import android.app.ApplicationExitInfo;
import java.util.Comparator;

/* loaded from: classes12.dex */
public final class PLV implements Comparator<ApplicationExitInfo> {
    @Override // java.util.Comparator
    public final int compare(ApplicationExitInfo applicationExitInfo, ApplicationExitInfo applicationExitInfo2) {
        return (int) (applicationExitInfo2.getTimestamp() - applicationExitInfo.getTimestamp());
    }
}
