package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public final class YPK {
    public static final /* synthetic */ YPK[] LJLILLLLZI;
    public static final YPK zza;
    public static final YPK zzb;
    public static final YPK zzc;
    public static final YPK zzd;
    public static final YPK zze;
    public static final YPK zzf;
    public static final YPK zzg;
    public static final YPK zzh;
    public static final YPK zzi;
    public static final YPK zzj;
    public static final YPK zzk;
    public static final YPK zzl;
    public static final YPK zzm;
    public static final YPK zzn;
    public static final YPK zzo;
    public static final YPK zzp;
    public static final YPK zzq;
    public static final YPK zzr;
    public final YPJ LJLIL;

    public final YPJ zza() {
        return this.LJLIL;
    }

    static {
        YPK ypk = new YPK("DOUBLE", 0, YPJ.DOUBLE);
        zza = ypk;
        YPK ypk2 = new YPK("FLOAT", 1, YPJ.FLOAT);
        zzb = ypk2;
        YPJ ypj = YPJ.LONG;
        YPK ypk3 = new YPK("INT64", 2, ypj);
        zzc = ypk3;
        YPK ypk4 = new YPK("UINT64", 3, ypj);
        zzd = ypk4;
        YPJ ypj2 = YPJ.INT;
        YPK ypk5 = new YPK("INT32", 4, ypj2);
        zze = ypk5;
        YPK ypk6 = new YPK("FIXED64", 5, ypj);
        zzf = ypk6;
        YPK ypk7 = new YPK("FIXED32", 6, ypj2);
        zzg = ypk7;
        YPK ypk8 = new YPK("BOOL", 7, YPJ.BOOLEAN);
        zzh = ypk8;
        YPK ypk9 = new YPK("STRING", 8, YPJ.STRING);
        zzi = ypk9;
        YPJ ypj3 = YPJ.MESSAGE;
        YPK ypk10 = new YPK("GROUP", 9, ypj3);
        zzj = ypk10;
        YPK ypk11 = new YPK("MESSAGE", 10, ypj3);
        zzk = ypk11;
        YPK ypk12 = new YPK("BYTES", 11, YPJ.BYTE_STRING);
        zzl = ypk12;
        YPK ypk13 = new YPK("UINT32", 12, ypj2);
        zzm = ypk13;
        YPK ypk14 = new YPK("ENUM", 13, YPJ.ENUM);
        zzn = ypk14;
        YPK ypk15 = new YPK("SFIXED32", 14, ypj2);
        zzo = ypk15;
        YPK ypk16 = new YPK("SFIXED64", 15, ypj);
        zzp = ypk16;
        YPK ypk17 = new YPK("SINT32", 16, ypj2);
        zzq = ypk17;
        YPK ypk18 = new YPK("SINT64", 17, ypj);
        zzr = ypk18;
        LJLILLLLZI = new YPK[]{ypk, ypk2, ypk3, ypk4, ypk5, ypk6, ypk7, ypk8, ypk9, ypk10, ypk11, ypk12, ypk13, ypk14, ypk15, ypk16, ypk17, ypk18};
    }

    public static YPK[] values() {
        return (YPK[]) LJLILLLLZI.clone();
    }

    public YPK(String str, int i, YPJ ypj) {
        this.LJLIL = ypj;
    }
}
