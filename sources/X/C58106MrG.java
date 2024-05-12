package X;

import com.ss.android.elearning.lingo.tracker.ElTrackerService;
import com.ss.android.elearning.lingo.tracker.impl.ElTrackerServiceImpl;
import org.json.JSONObject;

/* renamed from: X.MrG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58106MrG implements ElTrackerService {
    public static final C58106MrG LIZIZ = new C58106MrG();
    public final /* synthetic */ ElTrackerService LIZ;

    @Override // com.ss.android.elearning.lingo.tracker.ElTrackerService
    public final void LIZ(String str, JSONObject jSONObject) {
        this.LIZ.LIZ(str, jSONObject);
    }

    public C58106MrG() {
        ElTrackerService elTrackerService;
        Object LIZ = C58096Mr6.LIZ(ElTrackerService.class, false);
        if (LIZ != null) {
            elTrackerService = (ElTrackerService) LIZ;
        } else {
            if (C58096Mr6.LJJJJJ == null) {
                synchronized (ElTrackerService.class) {
                    if (C58096Mr6.LJJJJJ == null) {
                        C58096Mr6.LJJJJJ = new ElTrackerServiceImpl();
                    }
                }
            }
            elTrackerService = C58096Mr6.LJJJJJ;
        }
        this.LIZ = elTrackerService;
    }
}
