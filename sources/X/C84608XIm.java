package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.experiments.TrackerUploadRate;

/* renamed from: X.XIm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84608XIm extends AbstractC65781Prl implements InterfaceC65784Pro<TrackerUploadRate> {
    public static final C84608XIm LJLIL = new C84608XIm();

    public C84608XIm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.legoImp.task.experiments.TrackerUploadRate, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final TrackerUploadRate invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TrackerUploadRate trackerUploadRate = C84605XIj.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("arch_tracker_reporter_upload_rate_v2", TrackerUploadRate.class, trackerUploadRate);
        if (LJIIIIZZ == 0) {
            return trackerUploadRate;
        }
        return LJIIIIZZ;
    }
}
