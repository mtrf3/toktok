package X;

/* loaded from: classes9.dex */
public final class INH extends AbstractC65781Prl implements InterfaceC88471Ynr<ING, Integer, ING> {
    public static final INH LJLIL = new INH();

    public INH() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final ING invoke(ING ing, Integer num) {
        ING ing2 = ing;
        int intValue = num.intValue();
        if (ing2 != null) {
            return new ING(ing2.LIZ, Integer.valueOf(intValue));
        }
        return new ING(null, Integer.valueOf(intValue), 1);
    }
}
