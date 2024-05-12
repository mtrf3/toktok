package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GoS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42644GoS extends AbstractC42966Gte {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_read_record";
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        String str;
        List<AwemeToolFeedbackInfo> LJ = LJ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
        Iterator it = ((ArrayList) LJ).iterator();
        while (it.hasNext()) {
            AwemeToolFeedbackInfo awemeToolFeedbackInfo = (AwemeToolFeedbackInfo) it.next();
            String str2 = "";
            if (!awemeToolFeedbackInfo.getECode().isEmpty()) {
                StringBuilder sb = new StringBuilder("(");
                List<AwemeToolFeedbackECode> eCode = awemeToolFeedbackInfo.getECode();
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(eCode, 10));
                for (AwemeToolFeedbackECode awemeToolFeedbackECode : eCode) {
                    String stage = awemeToolFeedbackECode.getStage();
                    if (stage == null || stage.length() == 0) {
                        str = "";
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(awemeToolFeedbackECode.getStage());
                        LIZ.append(':');
                        str = X1D.LIZIZ(LIZ);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(awemeToolFeedbackECode.getCode());
                    arrayList2.add(X1D.LIZIZ(LIZ2));
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = C00F.LIZIZ((String) next, ';', (String) it2.next());
                    }
                    str2 = C07670Rv.LIZIZ(sb, (String) next, ')');
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            arrayList.add("[" + awemeToolFeedbackInfo.getName() + ':' + awemeToolFeedbackInfo.getCount() + ' ' + awemeToolFeedbackInfo.getSuccessCount() + "Success|" + awemeToolFeedbackInfo.getCancelCount() + "Cancel|" + awemeToolFeedbackInfo.getECode().size() + "Failed" + str2 + ']');
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Object next2 = it3.next();
            while (it3.hasNext()) {
                next2 = i0.LJFF((String) next2, (String) it3.next());
            }
            return (String) next2;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
