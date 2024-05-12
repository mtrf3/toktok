package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MNJ<T> implements Comparator {
    public static final MNJ<T> LJLIL = new MNJ<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC56676MMe abstractC56676MMe = (AbstractC56676MMe) obj;
        AbstractC56676MMe abstractC56676MMe2 = (AbstractC56676MMe) obj2;
        if (abstractC56676MMe2.getPriority$awemenotice_release() == abstractC56676MMe.getPriority$awemenotice_release()) {
            return o.LJIIL(abstractC56676MMe2.getLastNoticeTime$awemenotice_release(), abstractC56676MMe.getLastNoticeTime$awemenotice_release());
        }
        return o.LJIIJJI(abstractC56676MMe2.getPriority$awemenotice_release(), abstractC56676MMe.getPriority$awemenotice_release());
    }
}
