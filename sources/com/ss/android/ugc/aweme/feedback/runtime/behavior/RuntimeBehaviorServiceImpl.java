package com.ss.android.ugc.aweme.feedback.runtime.behavior;

import X.ActivityC45651qj;
import X.C43176Gx2;
import X.C58096Mr6;
import java.util.Map;

/* loaded from: classes8.dex */
public class RuntimeBehaviorServiceImpl implements IRuntimeBehaviorService {
    public final C43176Gx2 LIZ = C43176Gx2.LIZ;

    public static IRuntimeBehaviorService LJ() {
        Object LIZ = C58096Mr6.LIZ(IRuntimeBehaviorService.class, false);
        if (LIZ != null) {
            return (IRuntimeBehaviorService) LIZ;
        }
        if (C58096Mr6.R0 == null) {
            synchronized (IRuntimeBehaviorService.class) {
                if (C58096Mr6.R0 == null) {
                    C58096Mr6.R0 = new RuntimeBehaviorServiceImpl();
                }
            }
        }
        return C58096Mr6.R0;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final Map<String, String> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void LIZJ(ActivityC45651qj activityC45651qj) {
        this.LIZ.LIZJ(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void event(String str, String str2) {
        this.LIZ.event(str, str2);
    }
}
