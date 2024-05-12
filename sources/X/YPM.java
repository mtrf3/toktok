package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public final class YPM {
    public static final YPM[] LJLILLLLZI;
    public static final /* synthetic */ YPM[] LJLJI;
    public static final YPM zzA;
    public static final YPM zzB;
    public static final YPM zzC;
    public static final YPM zzD;
    public static final YPM zzE;
    public static final YPM zzF;
    public static final YPM zzG;
    public static final YPM zzH;
    public static final YPM zzI;
    public static final YPM zzJ;
    public static final YPM zzK;
    public static final YPM zzL;
    public static final YPM zzM;
    public static final YPM zzN;
    public static final YPM zzO;
    public static final YPM zzP;
    public static final YPM zzQ;
    public static final YPM zzR;
    public static final YPM zzS;
    public static final YPM zzT;
    public static final YPM zzU;
    public static final YPM zzV;
    public static final YPM zzW;
    public static final YPM zzX;
    public static final YPM zzY;
    public static final YPM zza;
    public static final YPM zzb;
    public static final YPM zzc;
    public static final YPM zzd;
    public static final YPM zze;
    public static final YPM zzf;
    public static final YPM zzg;
    public static final YPM zzh;
    public static final YPM zzi;
    public static final YPM zzj;
    public static final YPM zzk;
    public static final YPM zzl;
    public static final YPM zzm;
    public static final YPM zzn;
    public static final YPM zzo;
    public static final YPM zzp;
    public static final YPM zzq;
    public static final YPM zzr;
    public static final YPM zzs;
    public static final YPM zzt;
    public static final YPM zzu;
    public static final YPM zzv;
    public static final YPM zzw;
    public static final YPM zzx;
    public static final YPM zzy;
    public static final YPM zzz;
    public final int LJLIL;

    public final int zza() {
        return this.LJLIL;
    }

    static {
        YPL ypl = YPL.DOUBLE;
        YPM ypm = new YPM("DOUBLE", 0, 0, 1, ypl);
        zza = ypm;
        YPL ypl2 = YPL.FLOAT;
        YPM ypm2 = new YPM("FLOAT", 1, 1, 1, ypl2);
        zzb = ypm2;
        YPL ypl3 = YPL.LONG;
        YPM ypm3 = new YPM("INT64", 2, 2, 1, ypl3);
        zzc = ypm3;
        YPM ypm4 = new YPM("UINT64", 3, 3, 1, ypl3);
        zzd = ypm4;
        YPL ypl4 = YPL.INT;
        YPM ypm5 = new YPM("INT32", 4, 4, 1, ypl4);
        zze = ypm5;
        YPM ypm6 = new YPM("FIXED64", 5, 5, 1, ypl3);
        zzf = ypm6;
        YPM ypm7 = new YPM("FIXED32", 6, 6, 1, ypl4);
        zzg = ypm7;
        YPL ypl5 = YPL.BOOLEAN;
        YPM ypm8 = new YPM("BOOL", 7, 7, 1, ypl5);
        zzh = ypm8;
        YPL ypl6 = YPL.STRING;
        YPM ypm9 = new YPM("STRING", 8, 8, 1, ypl6);
        zzi = ypm9;
        YPL ypl7 = YPL.MESSAGE;
        YPM ypm10 = new YPM("MESSAGE", 9, 9, 1, ypl7);
        zzj = ypm10;
        YPL ypl8 = YPL.BYTE_STRING;
        YPM ypm11 = new YPM("BYTES", 10, 10, 1, ypl8);
        zzk = ypm11;
        YPM ypm12 = new YPM("UINT32", 11, 11, 1, ypl4);
        zzl = ypm12;
        YPL ypl9 = YPL.ENUM;
        YPM ypm13 = new YPM("ENUM", 12, 12, 1, ypl9);
        zzm = ypm13;
        YPM ypm14 = new YPM("SFIXED32", 13, 13, 1, ypl4);
        zzn = ypm14;
        YPM ypm15 = new YPM("SFIXED64", 14, 14, 1, ypl3);
        zzo = ypm15;
        YPM ypm16 = new YPM("SINT32", 15, 15, 1, ypl4);
        zzp = ypm16;
        YPM ypm17 = new YPM("SINT64", 16, 16, 1, ypl3);
        zzq = ypm17;
        YPM ypm18 = new YPM("GROUP", 17, 17, 1, ypl7);
        zzr = ypm18;
        YPM ypm19 = new YPM("DOUBLE_LIST", 18, 18, 2, ypl);
        zzs = ypm19;
        YPM ypm20 = new YPM("FLOAT_LIST", 19, 19, 2, ypl2);
        zzt = ypm20;
        YPM ypm21 = new YPM("INT64_LIST", 20, 20, 2, ypl3);
        zzu = ypm21;
        YPM ypm22 = new YPM("UINT64_LIST", 21, 21, 2, ypl3);
        zzv = ypm22;
        YPM ypm23 = new YPM("INT32_LIST", 22, 22, 2, ypl4);
        zzw = ypm23;
        YPM ypm24 = new YPM("FIXED64_LIST", 23, 23, 2, ypl3);
        zzx = ypm24;
        YPM ypm25 = new YPM("FIXED32_LIST", 24, 24, 2, ypl4);
        zzy = ypm25;
        YPM ypm26 = new YPM("BOOL_LIST", 25, 25, 2, ypl5);
        zzz = ypm26;
        YPM ypm27 = new YPM("STRING_LIST", 26, 26, 2, ypl6);
        zzA = ypm27;
        YPM ypm28 = new YPM("MESSAGE_LIST", 27, 27, 2, ypl7);
        zzB = ypm28;
        YPM ypm29 = new YPM("BYTES_LIST", 28, 28, 2, ypl8);
        zzC = ypm29;
        YPM ypm30 = new YPM("UINT32_LIST", 29, 29, 2, ypl4);
        zzD = ypm30;
        YPM ypm31 = new YPM("ENUM_LIST", 30, 30, 2, ypl9);
        zzE = ypm31;
        YPM ypm32 = new YPM("SFIXED32_LIST", 31, 31, 2, ypl4);
        zzF = ypm32;
        YPM ypm33 = new YPM("SFIXED64_LIST", 32, 32, 2, ypl3);
        zzG = ypm33;
        YPM ypm34 = new YPM("SINT32_LIST", 33, 33, 2, ypl4);
        zzH = ypm34;
        YPM ypm35 = new YPM("SINT64_LIST", 34, 34, 2, ypl3);
        zzI = ypm35;
        YPM ypm36 = new YPM("DOUBLE_LIST_PACKED", 35, 35, 3, ypl);
        zzJ = ypm36;
        YPM ypm37 = new YPM("FLOAT_LIST_PACKED", 36, 36, 3, ypl2);
        zzK = ypm37;
        YPM ypm38 = new YPM("INT64_LIST_PACKED", 37, 37, 3, ypl3);
        zzL = ypm38;
        YPM ypm39 = new YPM("UINT64_LIST_PACKED", 38, 38, 3, ypl3);
        zzM = ypm39;
        YPM ypm40 = new YPM("INT32_LIST_PACKED", 39, 39, 3, ypl4);
        zzN = ypm40;
        YPM ypm41 = new YPM("FIXED64_LIST_PACKED", 40, 40, 3, ypl3);
        zzO = ypm41;
        YPM ypm42 = new YPM("FIXED32_LIST_PACKED", 41, 41, 3, ypl4);
        zzP = ypm42;
        YPM ypm43 = new YPM("BOOL_LIST_PACKED", 42, 42, 3, ypl5);
        zzQ = ypm43;
        YPM ypm44 = new YPM("UINT32_LIST_PACKED", 43, 43, 3, ypl4);
        zzR = ypm44;
        YPM ypm45 = new YPM("ENUM_LIST_PACKED", 44, 44, 3, ypl9);
        zzS = ypm45;
        YPM ypm46 = new YPM("SFIXED32_LIST_PACKED", 45, 45, 3, ypl4);
        zzT = ypm46;
        YPM ypm47 = new YPM("SFIXED64_LIST_PACKED", 46, 46, 3, ypl3);
        zzU = ypm47;
        YPM ypm48 = new YPM("SINT32_LIST_PACKED", 47, 47, 3, ypl4);
        zzV = ypm48;
        YPM ypm49 = new YPM("SINT64_LIST_PACKED", 48, 48, 3, ypl3);
        zzW = ypm49;
        YPM ypm50 = new YPM("GROUP_LIST", 49, 49, 2, ypl7);
        zzX = ypm50;
        YPM ypm51 = new YPM("MAP", 50, 50, 4, YPL.VOID);
        zzY = ypm51;
        LJLJI = new YPM[]{ypm, ypm2, ypm3, ypm4, ypm5, ypm6, ypm7, ypm8, ypm9, ypm10, ypm11, ypm12, ypm13, ypm14, ypm15, ypm16, ypm17, ypm18, ypm19, ypm20, ypm21, ypm22, ypm23, ypm24, ypm25, ypm26, ypm27, ypm28, ypm29, ypm30, ypm31, ypm32, ypm33, ypm34, ypm35, ypm36, ypm37, ypm38, ypm39, ypm40, ypm41, ypm42, ypm43, ypm44, ypm45, ypm46, ypm47, ypm48, ypm49, ypm50, ypm51};
        YPM[] values = values();
        LJLILLLLZI = new YPM[values.length];
        for (YPM ypm52 : values) {
            LJLILLLLZI[ypm52.LJLIL] = ypm52;
        }
    }

    public static YPM[] values() {
        return (YPM[]) LJLJI.clone();
    }

    public YPM(String str, int i, int i2, int i3, YPL ypl) {
        this.LJLIL = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                ypl.zza();
            }
        } else {
            ypl.zza();
        }
        if (i3 == 1) {
            ypl.ordinal();
        }
    }
}
