package X;

/* loaded from: classes9.dex */
public final class INI extends AbstractC65781Prl implements InterfaceC88471Ynr<ING, Integer, ING> {
    public static final INI LJLIL = new INI();

    public INI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final ING invoke(ING ing, Integer num) {
        ING ing2 = ing;
        int intValue = num.intValue();
        if (ing2 != null) {
            return new ING(Integer.valueOf(intValue), ing2.LIZIZ);
        }
        return new ING(Integer.valueOf(intValue), null, 2);
    }
}
