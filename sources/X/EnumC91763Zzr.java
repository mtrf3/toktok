package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CountryRegion' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Zzr, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class EnumC91763Zzr {
    public static final EnumC91763Zzr City;
    public static final EnumC91763Zzr CountryRegion;
    public static final /* synthetic */ EnumC91763Zzr[] LJLJJL;
    public static final EnumC91763Zzr State;
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final C92229a7N LJLJI;
    public final C92229a7N LJLJJI;

    public static EnumC91763Zzr valueOf(String str) {
        return (EnumC91763Zzr) V0N.LJJJ(EnumC91763Zzr.class, str);
    }

    public static EnumC91763Zzr[] values() {
        return (EnumC91763Zzr[]) LJLJJL.clone();
    }

    static {
        int i = 10;
        EnumC91763Zzr enumC91763Zzr = new EnumC91763Zzr("CountryRegion", 0, EnumC91966a38.BillingCountryRegion.getType(), 0, new C92229a7N("pipo_cashier_form_label_select_country", "Select country / region", i), new C92229a7N("pipo_cashier_form_label_country", "pipo_cashier_form_placeholder_select", "Country or region", "Select"));
        CountryRegion = enumC91763Zzr;
        EnumC91763Zzr enumC91763Zzr2 = new EnumC91763Zzr("State", 1, EnumC91966a38.BillingState.getType(), 1, new C92229a7N("pipo_cashier_form_label_select_state", "Select state / province", i), new C92229a7N("pipo_cashier_form_label_state", "pipo_cashier_form_placeholder_select", "State / province", "Select"));
        State = enumC91763Zzr2;
        EnumC91763Zzr enumC91763Zzr3 = new EnumC91763Zzr("City", 2, EnumC91966a38.BillingCity.getType(), 2, new C92229a7N("pipo_cashier_form_label_select_city", "Select city / town", i), new C92229a7N("pipo_cashier_form_label_city", "pipo_cashier_form_placeholder_select", "City / town", "Select"));
        City = enumC91763Zzr3;
        LJLJJL = new EnumC91763Zzr[]{enumC91763Zzr, enumC91763Zzr2, enumC91763Zzr3};
    }

    public final C92229a7N getDesc() {
        return this.LJLJI;
    }

    public final C92229a7N getFormDisplayData() {
        return this.LJLJJI;
    }

    public final String getParamName() {
        return this.LJLIL;
    }

    public final int getValue() {
        return this.LJLILLLLZI;
    }

    public EnumC91763Zzr(String str, int i, String str2, int i2, C92229a7N c92229a7N, C92229a7N c92229a7N2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = i2;
        this.LJLJI = c92229a7N;
        this.LJLJJI = c92229a7N2;
    }
}
