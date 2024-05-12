package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86833Y6b extends Y6Y {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_upload";
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        AwemeToolFeedbackECode awemeToolFeedbackECode;
        ArrayList arrayList = (ArrayList) LJFF();
        if (arrayList.isEmpty()) {
            return "";
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((C86832Y6a) next).LJI, C86844Y6m.LIZIZ)) {
                arrayList2.add(next);
            }
        }
        int size2 = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (o.LJ(((C86832Y6a) next2).LJI, C86845Y6n.LIZIZ)) {
                arrayList3.add(next2);
            }
        }
        int size3 = arrayList3.size();
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            if (((C86832Y6a) next3).LJI instanceof AbstractC86840Y6i) {
                arrayList4.add(next3);
            }
        }
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            AbstractC86839Y6h abstractC86839Y6h = ((C86832Y6a) it4.next()).LJI;
            o.LJII(abstractC86839Y6h, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.PublishBaseStrategy.OncePublish.Type.Failed");
            AbstractC86840Y6i abstractC86840Y6i = (AbstractC86840Y6i) abstractC86839Y6h;
            if (abstractC86840Y6i instanceof C86841Y6j) {
                C86841Y6j c86841Y6j = (C86841Y6j) abstractC86840Y6i;
                awemeToolFeedbackECode = new AwemeToolFeedbackECode(c86841Y6j.LIZIZ, c86841Y6j.LIZJ);
            } else if (abstractC86840Y6i instanceof C86843Y6l) {
                awemeToolFeedbackECode = new AwemeToolFeedbackECode("LO", ((C86843Y6l) abstractC86840Y6i).LIZIZ);
            } else if (abstractC86840Y6i instanceof C86842Y6k) {
                awemeToolFeedbackECode = new AwemeToolFeedbackECode(((C86842Y6k) abstractC86840Y6i).LIZIZ, "EX");
            } else {
                throw new C162476Zf();
            }
            arrayList5.add(awemeToolFeedbackECode);
        }
        String LIZJ = C75792yF.LIZJ(C47261Igj.LJJIJ(new AwemeToolFeedbackInfo("Publish", size, size2, size3, arrayList5)));
        o.LJIIIIZZ(LIZJ, "toJson(listOf(uploadInfo))");
        return LIZJ;
    }
}
