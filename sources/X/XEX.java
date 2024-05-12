package X;

import Y.ARunnableS51S0100000_15;

/* loaded from: classes16.dex */
public final /* synthetic */ class XEX extends C74232TBk implements InterfaceC88471Ynr<Integer, Long, C76800UCe> {
    public XEX(XBT xbt) {
        super(2, xbt);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "onProgress";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZ(XBT.class);
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "onProgress(IJ)V";
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, Long l) {
        int intValue = num.intValue();
        long longValue = l.longValue();
        XBT xbt = (XBT) this.receiver;
        xbt.getClass();
        C15180ig.LIZ(new ARunnableS51S0100000_15(xbt, intValue, longValue, 81));
        return C76800UCe.LIZ;
    }
}
