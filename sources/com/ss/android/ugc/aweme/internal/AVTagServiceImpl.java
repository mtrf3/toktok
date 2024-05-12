package com.ss.android.ugc.aweme.internal;

import X.ActivityC45651qj;
import X.C186927Vg;
import X.C186997Vn;
import X.C47261Igj;
import X.C7F0;
import X.InterfaceC65784Pro;
import X.InterfaceC88473Ynt;
import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AVTagServiceImpl implements IAVTagService {
    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LIZ() {
        C186927Vg.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final int LIZIZ() {
        return C186927Vg.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final boolean LIZJ(boolean z) {
        if (!C7F0.LIZJ() && !C186997Vn.LIZIZ()) {
            return false;
        }
        if (!z ? !C47261Igj.LJII(1, 3, 5).contains(Integer.valueOf(C7F0.LIZIZ())) : !C7F0.LIZ()) {
            if (!C186997Vn.LIZIZ()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LJ(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
        C186927Vg.LIZIZ.LIZJ(activityC45651qj, false, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LIZLLL(Context context, String str, int i, List list, OnActivityResultCallback onActivityResultCallback) {
        o.LJIIIZ(context, "context");
        C186927Vg.LIZIZ.LJFF(context, str, null, i, list, onActivityResultCallback);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LJFF(ActivityC45651qj activityC45651qj, String str, int i, List list, InterfaceC88473Ynt interfaceC88473Ynt) {
        C186927Vg.LIZIZ.LIZLLL(activityC45651qj, str, null, i, list, interfaceC88473Ynt);
    }
}
