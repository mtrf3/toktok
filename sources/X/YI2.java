package X;

import java.util.Comparator;

/* loaded from: classes16.dex */
public final class YI2 implements Comparator<AbstractC87141YHx> {
    @Override // java.util.Comparator
    public final int compare(AbstractC87141YHx abstractC87141YHx, AbstractC87141YHx abstractC87141YHx2) {
        AbstractC87141YHx abstractC87141YHx3 = abstractC87141YHx;
        AbstractC87141YHx abstractC87141YHx4 = abstractC87141YHx2;
        YI3 yi3 = (YI3) abstractC87141YHx3.iterator();
        YI3 yi32 = (YI3) abstractC87141YHx4.iterator();
        while (yi3.hasNext() && yi32.hasNext()) {
            int compare = Integer.compare(yi3.LIZJ() & 255, yi32.LIZJ() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(abstractC87141YHx3.size(), abstractC87141YHx4.size());
    }
}
