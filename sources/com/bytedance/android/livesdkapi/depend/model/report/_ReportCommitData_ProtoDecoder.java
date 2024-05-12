package com.bytedance.android.livesdkapi.depend.model.report;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ReportCommitData_ProtoDecoder implements InterfaceC31105CIr<ReportCommitData> {
    @Override // X.InterfaceC31105CIr
    public final ReportCommitData LIZ(Q9H q9h) {
        ReportCommitData reportCommitData = new ReportCommitData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                reportCommitData.recordId = q9h.LJIIJJI();
                            }
                        } else {
                            reportCommitData.reportId = q9h.LJIIJJI();
                        }
                    } else {
                        reportCommitData.desc = Q9J.LIZIZ(q9h);
                    }
                } else {
                    reportCommitData.status = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return reportCommitData;
            }
        }
    }
}
