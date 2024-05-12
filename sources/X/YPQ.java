package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzgeg' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public class YPQ {
    public static final /* synthetic */ YPQ[] LJLJI;
    public static final YPQ zzgee;
    public static final YPQ zzgef;
    public static final YPQ zzgeg;
    public static final YPQ zzgeh;
    public static final YPQ zzgei;
    public static final YPQ zzgej;
    public static final YPQ zzgek;
    public static final YPQ zzgel;
    public static final YPQ zzgem;
    public static final YPQ zzgen;
    public static final YPQ zzgeo;
    public static final YPQ zzgep;
    public static final YPQ zzgeq;
    public static final YPQ zzger;
    public static final YPQ zzges;
    public static final YPQ zzget;
    public static final YPQ zzgeu;
    public static final YPQ zzgev;
    public final YPP LJLIL;
    public final int LJLILLLLZI;

    public /* synthetic */ YPQ() {
        throw null;
    }

    static {
        YPQ ypq = new YPQ("DOUBLE", 0, YPP.DOUBLE, 1);
        zzgee = ypq;
        YPQ ypq2 = new YPQ("FLOAT", 1, YPP.FLOAT, 5);
        zzgef = ypq2;
        YPP ypp = YPP.LONG;
        YPQ ypq3 = new YPQ("INT64", 2, ypp, 0);
        zzgeg = ypq3;
        YPQ ypq4 = new YPQ("UINT64", 3, ypp, 0);
        zzgeh = ypq4;
        YPP ypp2 = YPP.INT;
        YPQ ypq5 = new YPQ("INT32", 4, ypp2, 0);
        zzgei = ypq5;
        YPQ ypq6 = new YPQ("FIXED64", 5, ypp, 1);
        zzgej = ypq6;
        YPQ ypq7 = new YPQ("FIXED32", 6, ypp2, 5);
        zzgek = ypq7;
        YPQ ypq8 = new YPQ("BOOL", 7, YPP.BOOLEAN, 0);
        zzgel = ypq8;
        final YPP ypp3 = YPP.STRING;
        YPQ ypq9 = new YPQ(ypp3) { // from class: X.YPU
        };
        zzgem = ypq9;
        final YPP ypp4 = YPP.MESSAGE;
        YPQ ypq10 = new YPQ(ypp4) { // from class: X.YPV
        };
        zzgen = ypq10;
        YPQ ypq11 = new YPQ(ypp4) { // from class: X.YPW
        };
        zzgeo = ypq11;
        final YPP ypp5 = YPP.BYTE_STRING;
        YPQ ypq12 = new YPQ(ypp5) { // from class: X.YPX
        };
        zzgep = ypq12;
        YPQ ypq13 = new YPQ("UINT32", 12, ypp2, 0);
        zzgeq = ypq13;
        YPQ ypq14 = new YPQ("ENUM", 13, YPP.ENUM, 0);
        zzger = ypq14;
        YPQ ypq15 = new YPQ("SFIXED32", 14, ypp2, 5);
        zzges = ypq15;
        YPQ ypq16 = new YPQ("SFIXED64", 15, ypp, 1);
        zzget = ypq16;
        YPQ ypq17 = new YPQ("SINT32", 16, ypp2, 0);
        zzgeu = ypq17;
        YPQ ypq18 = new YPQ("SINT64", 17, ypp, 0);
        zzgev = ypq18;
        LJLJI = new YPQ[]{ypq, ypq2, ypq3, ypq4, ypq5, ypq6, ypq7, ypq8, ypq9, ypq10, ypq11, ypq12, ypq13, ypq14, ypq15, ypq16, ypq17, ypq18};
    }

    public static YPQ[] values() {
        return (YPQ[]) LJLJI.clone();
    }

    public final YPP zzawa() {
        return this.LJLIL;
    }

    public final int zzawb() {
        return this.LJLILLLLZI;
    }

    public YPQ(String str, int i, YPP ypp, int i2) {
        this.LJLIL = ypp;
        this.LJLILLLLZI = i2;
    }
}
