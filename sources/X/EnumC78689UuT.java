package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IS_LINKING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.UuT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC78689UuT {
    public static final EnumC78689UuT INVITATION_DENIED;
    public static final EnumC78689UuT INVITATION_DENIED_TOAST;
    public static final EnumC78689UuT IS_LINKING;
    public static final EnumC78689UuT IS_LINKING_TOAST;
    public static final /* synthetic */ EnumC78689UuT[] LJLILLLLZI;
    public static final EnumC78689UuT LOW_CLIENT_VERSION;
    public static final EnumC78689UuT MATURE_THEME_NOT_MATCH;
    public static final EnumC78689UuT PERMISSION_DENIED;
    public static final EnumC78689UuT POS_FULL;
    public static final EnumC78689UuT ROOM_PAUSED;
    public final String LJLIL;

    public static EnumC78689UuT valueOf(String str) {
        return (EnumC78689UuT) V0N.LJJJ(EnumC78689UuT.class, str);
    }

    public static EnumC78689UuT[] values() {
        return (EnumC78689UuT[]) LJLILLLLZI.clone();
    }

    static {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.knx);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_connecting1)");
        EnumC78689UuT enumC78689UuT = new EnumC78689UuT("IS_LINKING", 0, LJIILJJIL);
        IS_LINKING = enumC78689UuT;
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.otm);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_unavailable1)");
        EnumC78689UuT enumC78689UuT2 = new EnumC78689UuT("INVITATION_DENIED", 1, LJIILJJIL2);
        INVITATION_DENIED = enumC78689UuT2;
        String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.juv);
        o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_CohostToastOccupied4)");
        EnumC78689UuT enumC78689UuT3 = new EnumC78689UuT("IS_LINKING_TOAST", 2, LJIILJJIL3);
        IS_LINKING_TOAST = enumC78689UuT3;
        String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.juw);
        o.LJIIIIZZ(LJIILJJIL4, "getString(R.string.pm_CohostToastOff)");
        EnumC78689UuT enumC78689UuT4 = new EnumC78689UuT("INVITATION_DENIED_TOAST", 3, LJIILJJIL4);
        INVITATION_DENIED_TOAST = enumC78689UuT4;
        String LJIILJJIL5 = C15380j0.LJIILJJIL(R.string.nho);
        o.LJIIIIZZ(LJIILJJIL5, "getString(R.string.pm_noaccess)");
        EnumC78689UuT enumC78689UuT5 = new EnumC78689UuT("PERMISSION_DENIED", 4, LJIILJJIL5);
        PERMISSION_DENIED = enumC78689UuT5;
        String LJIILJJIL6 = C15380j0.LJIILJJIL(R.string.otm);
        o.LJIIIIZZ(LJIILJJIL6, "getString(R.string.pm_unavailable1)");
        EnumC78689UuT enumC78689UuT6 = new EnumC78689UuT("LOW_CLIENT_VERSION", 5, LJIILJJIL6);
        LOW_CLIENT_VERSION = enumC78689UuT6;
        String LJIILJJIL7 = C15380j0.LJIILJJIL(R.string.otm);
        o.LJIIIIZZ(LJIILJJIL7, "getString(R.string.pm_unavailable1)");
        EnumC78689UuT enumC78689UuT7 = new EnumC78689UuT("ROOM_PAUSED", 6, LJIILJJIL7);
        ROOM_PAUSED = enumC78689UuT7;
        String LJIILJJIL8 = C15380j0.LJIILJJIL(R.string.kjp);
        o.LJIIIIZZ(LJIILJJIL8, "getString(R.string.pm_cohost_max_toast)");
        EnumC78689UuT enumC78689UuT8 = new EnumC78689UuT("POS_FULL", 7, LJIILJJIL8);
        POS_FULL = enumC78689UuT8;
        String LJIILJJIL9 = C15380j0.LJIILJJIL(R.string.otm);
        o.LJIIIIZZ(LJIILJJIL9, "getString(R.string.pm_unavailable1)");
        EnumC78689UuT enumC78689UuT9 = new EnumC78689UuT("MATURE_THEME_NOT_MATCH", 8, LJIILJJIL9);
        MATURE_THEME_NOT_MATCH = enumC78689UuT9;
        LJLILLLLZI = new EnumC78689UuT[]{enumC78689UuT, enumC78689UuT2, enumC78689UuT3, enumC78689UuT4, enumC78689UuT5, enumC78689UuT6, enumC78689UuT7, enumC78689UuT8, enumC78689UuT9};
    }

    public final String getReason() {
        return this.LJLIL;
    }

    public EnumC78689UuT(String str, int i, String str2) {
        this.LJLIL = str2;
    }
}
