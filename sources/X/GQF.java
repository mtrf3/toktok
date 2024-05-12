package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class GQF<METADATA> {
    public final ORV<AbstractC41507GQt<METADATA>> LIZ = new ORV<>();

    public abstract C41495GQh LIZIZ(CharSequence charSequence, Iterable iterable);

    public abstract List<AbstractC41507GQt<METADATA>> LIZJ(CharSequence charSequence, List<? extends METADATA> list);

    public final ORV LIZ() {
        ORV<AbstractC41507GQt<METADATA>> orv = this.LIZ;
        Iterator<AbstractC41507GQt<METADATA>> it = orv.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC41507GQt<METADATA> next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC41507GQt<METADATA> abstractC41507GQt = next;
                if (abstractC41507GQt.LJIIJJI()) {
                    abstractC41507GQt.LJIILJJIL(String.valueOf(i));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return orv;
    }
}
