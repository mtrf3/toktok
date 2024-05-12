package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SHARE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.3oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC95523oy {
    public static final EnumC95523oy APPROVAL;
    public static final EnumC95523oy END_GROUP_CHAT;
    public static final EnumC95523oy LEAVE;
    public static final /* synthetic */ EnumC95523oy[] LJLJJLL;
    public static final EnumC95523oy MUTE;
    public static final EnumC95523oy PIN_TO_TOP;
    public static final EnumC95523oy REPORT;
    public static final EnumC95523oy SHARE;
    public final EnumC95533oz LJLIL;
    public final AET LJLILLLLZI;
    public final int LJLJI;
    public final Integer LJLJJI;
    public final InterfaceC88472Yns<C95293ob, Boolean> LJLJJL;

    public static EnumC95523oy valueOf(String str) {
        return (EnumC95523oy) V0N.LJJJ(EnumC95523oy.class, str);
    }

    public static EnumC95523oy[] values() {
        return (EnumC95523oy[]) LJLJJLL.clone();
    }

    static {
        EnumC95533oz enumC95533oz = EnumC95533oz.DISCLOSURE;
        AET aet = AET.NORMAL;
        EnumC95523oy enumC95523oy = new EnumC95523oy("SHARE", 0, enumC95533oz, aet, R.string.gwh, null);
        SHARE = enumC95523oy;
        EnumC95533oz enumC95533oz2 = EnumC95533oz.SWITCH;
        EnumC95523oy enumC95523oy2 = new EnumC95523oy("MUTE", 1, enumC95533oz2, aet, R.string.h7c, null, C95483ou.LJLIL);
        MUTE = enumC95523oy2;
        EnumC95523oy enumC95523oy3 = new EnumC95523oy("PIN_TO_TOP", 2, enumC95533oz2, aet, R.string.h9z, null, C95503ow.LJLIL);
        PIN_TO_TOP = enumC95523oy3;
        EnumC95533oz enumC95533oz3 = EnumC95533oz.NONE;
        AET aet2 = AET.DESTRUCTIVE;
        EnumC95523oy enumC95523oy4 = new EnumC95523oy("REPORT", 3, enumC95533oz3, aet2, R.string.q2_, null);
        REPORT = enumC95523oy4;
        EnumC95523oy enumC95523oy5 = new EnumC95523oy("LEAVE", 4, enumC95533oz3, aet2, R.string.gv4, Integer.valueOf(R.string.gv5));
        LEAVE = enumC95523oy5;
        EnumC95523oy enumC95523oy6 = new EnumC95523oy("END_GROUP_CHAT", 5, enumC95533oz3, aet2, R.string.gv6, Integer.valueOf(R.string.gv7));
        END_GROUP_CHAT = enumC95523oy6;
        EnumC95523oy enumC95523oy7 = new EnumC95523oy("APPROVAL", 6, enumC95533oz2, aet, R.string.gux, null, C95553p1.LJLIL);
        APPROVAL = enumC95523oy7;
        LJLJJLL = new EnumC95523oy[]{enumC95523oy, enumC95523oy2, enumC95523oy3, enumC95523oy4, enumC95523oy5, enumC95523oy6, enumC95523oy7};
    }

    public final EnumC95533oz getAccessory() {
        return this.LJLIL;
    }

    public final InterfaceC88472Yns<C95293ob, Boolean> getDefaultValue() {
        return this.LJLJJL;
    }

    public final Integer getSubTitle() {
        return this.LJLJJI;
    }

    public final int getTitle() {
        return this.LJLJI;
    }

    public final AET getVariant() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ EnumC95523oy(String str, int i, EnumC95533oz enumC95533oz, AET aet, int i2, Integer num) {
        this(str, i, enumC95533oz, aet, i2, num, C95563p2.LJLIL);
    }

    public EnumC95523oy(String str, int i, EnumC95533oz enumC95533oz, AET aet, int i2, Integer num, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = enumC95533oz;
        this.LJLILLLLZI = aet;
        this.LJLJI = i2;
        this.LJLJJI = num;
        this.LJLJJL = interfaceC88472Yns;
    }
}
