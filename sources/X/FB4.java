package X;

/* loaded from: classes7.dex */
public final class FB4 implements FBC {
    @Override // X.FBC
    public final void onEffectiveConnectionTypeChanged(int i) {
        FBA fba = FBA.LIZJ;
        Integer num = FBA.LIZIZ;
        if (num == null || num.intValue() != i) {
            FBA.LIZIZ = Integer.valueOf(i);
            fba.LIZ(i);
        }
    }
}
