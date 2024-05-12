package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBG extends AbstractC65781Prl implements InterfaceC88471Ynr<MBA, MBD, MBA> {
    public static final MBG LJLIL = new MBG();

    public MBG() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final MBA invoke(MBA mba, MBD mbd) {
        MBF mbf;
        MBA acc = mba;
        MBD element = mbd;
        o.LJIIIZ(acc, "acc");
        o.LJIIIZ(element, "element");
        MBA minusKey = acc.minusKey(element.getKey());
        MBB mbb = MBB.INSTANCE;
        if (minusKey == mbb) {
            return element;
        }
        C3CR c3cr = C3CQ.LJJIJLIJ;
        MBD mbd2 = minusKey.get(c3cr);
        if (mbd2 == null) {
            mbf = new MBF(minusKey, element);
        } else {
            MBA minusKey2 = minusKey.minusKey(c3cr);
            if (minusKey2 == mbb) {
                return new MBF(element, mbd2);
            }
            mbf = new MBF(new MBF(minusKey2, element), mbd2);
        }
        return mbf;
    }
}
