package X;

import java.util.Comparator;

/* renamed from: X.YHu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87138YHu implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC87134YHq abstractC87134YHq = (AbstractC87134YHq) obj;
        AbstractC87134YHq abstractC87134YHq2 = (AbstractC87134YHq) obj2;
        C87137YHt c87137YHt = new C87137YHt(abstractC87134YHq);
        C87137YHt c87137YHt2 = new C87137YHt(abstractC87134YHq2);
        while (c87137YHt.hasNext() && c87137YHt2.hasNext()) {
            int compareTo = Integer.valueOf(c87137YHt.LIZ() & 255).compareTo(Integer.valueOf(c87137YHt2.LIZ() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC87134YHq.zzd()).compareTo(Integer.valueOf(abstractC87134YHq2.zzd()));
    }
}
