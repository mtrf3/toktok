package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class _IssueCategory_ProtoDecoder implements InterfaceC31105CIr<IssueCategory> {
    @Override // X.InterfaceC31105CIr
    public final IssueCategory LIZ(Q9H q9h) {
        IssueCategory issueCategory = new IssueCategory();
        issueCategory.issues = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        issueCategory.issues.add(Q9J.LIZIZ(q9h));
                    }
                } else {
                    issueCategory.category = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return issueCategory;
            }
        }
    }
}
