package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LIVE_TIP_HIGHLIGHT_FAILURE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.12a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC264412a {
    public static final EnumC264412a LIVE_TIP_APPEAL_SUCCESS_TIPS;
    public static final EnumC264412a LIVE_TIP_AUDIO_FOCUS_GET_TIP;
    public static final EnumC264412a LIVE_TIP_AUDIO_FOCUS_LOST_TIP;
    public static final EnumC264412a LIVE_TIP_BOTTOM_MESSAGE_CLOSE;
    public static final EnumC264412a LIVE_TIP_BOTTOM_MESSAGE_NO_CLOSE;
    public static final EnumC264412a LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP;
    public static final EnumC264412a LIVE_TIP_COPYRIGHT_WARNING;
    public static final EnumC264412a LIVE_TIP_GAMING_GOODY_BAG;
    public static final EnumC264412a LIVE_TIP_GAMING_LIVE_GOAL;
    public static final EnumC264412a LIVE_TIP_GAMING_RANKING_CHANGE_TIPS;
    public static final EnumC264412a LIVE_TIP_GAMING_SUB_GOAL;
    public static final EnumC264412a LIVE_TIP_GAMING_TREASURE;
    public static final EnumC264412a LIVE_TIP_GO_APPEAL_TIPS;
    public static final EnumC264412a LIVE_TIP_GO_LIVE_ERROR_TIP;
    public static final EnumC264412a LIVE_TIP_HIGHLIGHT_FAILURE;
    public static final EnumC264412a LIVE_TIP_HIGHLIGHT_SUCCESS;
    public static final EnumC264412a LIVE_TIP_HIGH_PING_TIPS;
    public static final EnumC264412a LIVE_TIP_HIGH_TEMPERATURE_TIPS;
    public static final EnumC264412a LIVE_TIP_LOW_BATTERY_TIPS;
    public static final EnumC264412a LIVE_TIP_LOW_DEVICE_TIPS;
    public static final EnumC264412a LIVE_TIP_MESSAGE_FIRST_CHAT_MESSAGE;
    public static final EnumC264412a LIVE_TIP_MESSAGE_FIRST_START_LIVE_2MIN;
    public static final EnumC264412a LIVE_TIP_MESSAGE_GAMEPAD_ACCESS_REVOKED;
    public static final EnumC264412a LIVE_TIP_MESSAGE_HEADPHONE;
    public static final EnumC264412a LIVE_TIP_MESSAGE_INTERRUPTED_ERROR;
    public static final EnumC264412a LIVE_TIP_MESSAGE_INTERRUPTED_ERROR_GUIDE_IMPROVE;
    public static final EnumC264412a LIVE_TIP_MESSAGE_MUTING_TIP;
    public static final EnumC264412a LIVE_TIP_MESSAGE_NETWORK_POOR;
    public static final EnumC264412a LIVE_TIP_MESSAGE_PAUSE_TIP;
    public static final EnumC264412a LIVE_TIP_MESSAGE_RECEIVE_FLASH_CARD_MESSAGE;
    public static final EnumC264412a LIVE_TIP_MESSAGE_UN_START;
    public static final EnumC264412a LIVE_TIP_MESSAGE_VOLUME;
    public static final EnumC264412a LIVE_TIP_MESSAGE_WARNING_TIP;
    public static final EnumC264412a LIVE_TIP_PERCEPTION_MESSAGE_P1;
    public static final EnumC264412a LIVE_TIP_PUSH_STREAM_ERROR_TIPS;
    public static final EnumC264412a LIVE_TIP_PUSH_STREAM_RETRY_TIPS;
    public static final EnumC264412a LIVE_TIP_SAVE_MODE_TIPS;
    public static final EnumC264412a LIVE_TIP_UNKNOWN;
    public static final /* synthetic */ EnumC264412a[] LJLJJLL;
    public final int LJLIL;
    public final C12I LJLILLLLZI;
    public final String LJLJI;
    public final C12I LJLJJI;
    public final boolean LJLJJL;

    public static EnumC264412a valueOf(String str) {
        return (EnumC264412a) V0N.LJJJ(EnumC264412a.class, str);
    }

    public static EnumC264412a[] values() {
        return (EnumC264412a[]) LJLJJLL.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC264412a enumC264412a = new EnumC264412a("LIVE_TIP_HIGHLIGHT_SUCCESS", 0, 2, new C12I(C15380j0.LJI(R.drawable.b5m), null), C15380j0.LJIILJJIL(R.string.l9a), new C12I(C15380j0.LJI(R.drawable.cv6), null));
        LIVE_TIP_HIGHLIGHT_SUCCESS = enumC264412a;
        int i = 3;
        EnumC264412a enumC264412a2 = new EnumC264412a("LIVE_TIP_HIGHLIGHT_FAILURE", 1, i, null, null == true ? 1 : 0, null == true ? 1 : 0);
        LIVE_TIP_HIGHLIGHT_FAILURE = enumC264412a2;
        int i2 = 2;
        int i3 = 3;
        EnumC264412a enumC264412a3 = new EnumC264412a("LIVE_TIP_UNKNOWN", i2, i, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0);
        LIVE_TIP_UNKNOWN = enumC264412a3;
        EnumC264412a enumC264412a4 = new EnumC264412a("LIVE_TIP_MESSAGE_PAUSE_TIP", i3, i3, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0);
        LIVE_TIP_MESSAGE_PAUSE_TIP = enumC264412a4;
        EnumC264412a enumC264412a5 = new EnumC264412a("LIVE_TIP_MESSAGE_FIRST_CHAT_MESSAGE", 4, i2, null == true ? 1 : 0, null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_MESSAGE_FIRST_CHAT_MESSAGE = enumC264412a5;
        EnumC264412a enumC264412a6 = new EnumC264412a("LIVE_TIP_MESSAGE_FIRST_START_LIVE_2MIN", 5, 2, null == true ? 1 : 0, null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_MESSAGE_FIRST_START_LIVE_2MIN = enumC264412a6;
        int i4 = 0;
        EnumC264412a enumC264412a7 = new EnumC264412a("LIVE_TIP_MESSAGE_INTERRUPTED_ERROR", 6, i4, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, new C12I(C15380j0.LJI(R.drawable.cv6), null));
        LIVE_TIP_MESSAGE_INTERRUPTED_ERROR = enumC264412a7;
        EnumC264412a enumC264412a8 = new EnumC264412a("LIVE_TIP_MESSAGE_INTERRUPTED_ERROR_GUIDE_IMPROVE", 7, i4, null == true ? 1 : 0, null == true ? 1 : 0, new C12I(C15380j0.LJI(R.drawable.cv6), null));
        LIVE_TIP_MESSAGE_INTERRUPTED_ERROR_GUIDE_IMPROVE = enumC264412a8;
        EnumC264412a enumC264412a9 = new EnumC264412a("LIVE_TIP_MESSAGE_NETWORK_POOR", 8, 2, null == true ? 1 : 0, null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_MESSAGE_NETWORK_POOR = enumC264412a9;
        EnumC264412a enumC264412a10 = new EnumC264412a("LIVE_TIP_MESSAGE_HEADPHONE", 9, 2, null == true ? 1 : 0, null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_MESSAGE_HEADPHONE = enumC264412a10;
        EnumC264412a enumC264412a11 = new EnumC264412a("LIVE_TIP_MESSAGE_VOLUME", 10, 2, null == true ? 1 : 0, null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_MESSAGE_VOLUME = enumC264412a11;
        int i5 = 2;
        EnumC264412a enumC264412a12 = new EnumC264412a("LIVE_TIP_MESSAGE_UN_START", 11, i5, null == true ? 1 : 0, null == true ? 1 : 0, new C12I(C15380j0.LJI(R.drawable.cv6), null));
        LIVE_TIP_MESSAGE_UN_START = enumC264412a12;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_exclamation_mark_circle;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        c2068389v.LIZLLL = Integer.valueOf(C15380j0.LIZIZ(R.color.bd));
        Context LIZLLL = C15380j0.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getContext()");
        int i6 = 1;
        EnumC264412a enumC264412a13 = new EnumC264412a("LIVE_TIP_MESSAGE_WARNING_TIP", 12, 1, new C12I(c2068389v.LIZ(LIZLLL), ColorStateList.valueOf(C15380j0.LIZIZ(R.color.bd))), null, C78685UuP.LJJIJIIJIL(), true);
        LIVE_TIP_MESSAGE_WARNING_TIP = enumC264412a13;
        EnumC264412a enumC264412a14 = new EnumC264412a("LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP", 13, 0, new C12I(C15380j0.LJI(R.drawable.dcg), null), null == true ? 1 : 0, new C12I(C15380j0.LJI(R.drawable.cv6), null));
        LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP = enumC264412a14;
        EnumC264412a enumC264412a15 = new EnumC264412a("LIVE_TIP_MESSAGE_RECEIVE_FLASH_CARD_MESSAGE", 14, i5, null == true ? 1 : 0, null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_MESSAGE_RECEIVE_FLASH_CARD_MESSAGE = enumC264412a15;
        EnumC264412a enumC264412a16 = new EnumC264412a("LIVE_TIP_MESSAGE_MUTING_TIP", 15, 1, new C12I(C15380j0.LJI(R.drawable.czc), null), null == true ? 1 : 0, null == true ? 1 : 0);
        LIVE_TIP_MESSAGE_MUTING_TIP = enumC264412a16;
        EnumC264412a enumC264412a17 = new EnumC264412a("LIVE_TIP_PUSH_STREAM_ERROR_TIPS", 16, i6, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_PUSH_STREAM_ERROR_TIPS = enumC264412a17;
        EnumC264412a enumC264412a18 = new EnumC264412a("LIVE_TIP_GO_LIVE_ERROR_TIP", 17, 3, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, null == true ? 1 : 0);
        LIVE_TIP_GO_LIVE_ERROR_TIP = enumC264412a18;
        EnumC264412a enumC264412a19 = new EnumC264412a("LIVE_TIP_PUSH_STREAM_RETRY_TIPS", 18, i6, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_PUSH_STREAM_RETRY_TIPS = enumC264412a19;
        EnumC264412a enumC264412a20 = new EnumC264412a("LIVE_TIP_AUDIO_FOCUS_LOST_TIP", 19, i6, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_AUDIO_FOCUS_LOST_TIP = enumC264412a20;
        EnumC264412a enumC264412a21 = new EnumC264412a("LIVE_TIP_AUDIO_FOCUS_GET_TIP", 20, 3, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0);
        LIVE_TIP_AUDIO_FOCUS_GET_TIP = enumC264412a21;
        EnumC264412a enumC264412a22 = new EnumC264412a("LIVE_TIP_MESSAGE_GAMEPAD_ACCESS_REVOKED", 21, 2, new C12I(C15380j0.LJI(R.drawable.czc), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_MESSAGE_GAMEPAD_ACCESS_REVOKED = enumC264412a22;
        int i7 = 1;
        EnumC264412a enumC264412a23 = new EnumC264412a("LIVE_TIP_BOTTOM_MESSAGE_NO_CLOSE", 22, i7, new C12I(C15380j0.LJI(R.drawable.czc), null), null == true ? 1 : 0, null == true ? 1 : 0);
        LIVE_TIP_BOTTOM_MESSAGE_NO_CLOSE = enumC264412a23;
        EnumC264412a enumC264412a24 = new EnumC264412a("LIVE_TIP_BOTTOM_MESSAGE_CLOSE", 23, i7, new C12I(C15380j0.LJI(R.drawable.czc), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_BOTTOM_MESSAGE_CLOSE = enumC264412a24;
        EnumC264412a enumC264412a25 = new EnumC264412a("LIVE_TIP_PERCEPTION_MESSAGE_P1", 24, i7, new C12I(C15380j0.LJI(R.drawable.czc), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_PERCEPTION_MESSAGE_P1 = enumC264412a25;
        EnumC264412a enumC264412a26 = new EnumC264412a("LIVE_TIP_COPYRIGHT_WARNING", 25, i7, new C12I(C15380j0.LJI(R.drawable.czc), null), null == true ? 1 : 0, new C12I(C15380j0.LJI(R.drawable.cv6), null));
        LIVE_TIP_COPYRIGHT_WARNING = enumC264412a26;
        EnumC264412a enumC264412a27 = new EnumC264412a("LIVE_TIP_HIGH_PING_TIPS", 26, i7, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_HIGH_PING_TIPS = enumC264412a27;
        int i8 = 2;
        EnumC264412a enumC264412a28 = new EnumC264412a("LIVE_TIP_HIGH_TEMPERATURE_TIPS", 27, i8, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_HIGH_TEMPERATURE_TIPS = enumC264412a28;
        EnumC264412a enumC264412a29 = new EnumC264412a("LIVE_TIP_LOW_DEVICE_TIPS", 28, i8, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_LOW_DEVICE_TIPS = enumC264412a29;
        EnumC264412a enumC264412a30 = new EnumC264412a("LIVE_TIP_LOW_BATTERY_TIPS", 29, i8, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_LOW_BATTERY_TIPS = enumC264412a30;
        EnumC264412a enumC264412a31 = new EnumC264412a("LIVE_TIP_SAVE_MODE_TIPS", 30, i8, new C12I(C15380j0.LJI(R.drawable.cvl), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_SAVE_MODE_TIPS = enumC264412a31;
        int i9 = 1;
        EnumC264412a enumC264412a32 = new EnumC264412a("LIVE_TIP_GO_APPEAL_TIPS", 31, i9, new C12I(C15380j0.LJI(R.drawable.czc), null), null == true ? 1 : 0, new C12I(C15380j0.LJI(R.drawable.cv6), null));
        LIVE_TIP_GO_APPEAL_TIPS = enumC264412a32;
        EnumC264412a enumC264412a33 = new EnumC264412a("LIVE_TIP_APPEAL_SUCCESS_TIPS", 32, i9, new C12I(C15380j0.LJI(R.drawable.b5m), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_APPEAL_SUCCESS_TIPS = enumC264412a33;
        EnumC264412a enumC264412a34 = new EnumC264412a("LIVE_TIP_GAMING_RANKING_CHANGE_TIPS", 33, 3, new C12I(C15380j0.LJI(R.drawable.cv_), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_GAMING_RANKING_CHANGE_TIPS = enumC264412a34;
        int i10 = 2;
        EnumC264412a enumC264412a35 = new EnumC264412a("LIVE_TIP_GAMING_LIVE_GOAL", 34, i8, new C12I(C15380j0.LJI(R.drawable.d7k), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_GAMING_LIVE_GOAL = enumC264412a35;
        EnumC264412a enumC264412a36 = new EnumC264412a("LIVE_TIP_GAMING_SUB_GOAL", 35, i8, new C12I(C15380j0.LJI(R.drawable.b6f), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_GAMING_SUB_GOAL = enumC264412a36;
        EnumC264412a enumC264412a37 = new EnumC264412a("LIVE_TIP_GAMING_TREASURE", 36, i10, new C12I(C15380j0.LJI(R.drawable.b6g), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_GAMING_TREASURE = enumC264412a37;
        EnumC264412a enumC264412a38 = new EnumC264412a("LIVE_TIP_GAMING_GOODY_BAG", 37, i10, new C12I(C15380j0.LJI(R.drawable.b6e), null), null == true ? 1 : 0, C78685UuP.LJJIJIIJIL());
        LIVE_TIP_GAMING_GOODY_BAG = enumC264412a38;
        LJLJJLL = new EnumC264412a[]{enumC264412a, enumC264412a2, enumC264412a3, enumC264412a4, enumC264412a5, enumC264412a6, enumC264412a7, enumC264412a8, enumC264412a9, enumC264412a10, enumC264412a11, enumC264412a12, enumC264412a13, enumC264412a14, enumC264412a15, enumC264412a16, enumC264412a17, enumC264412a18, enumC264412a19, enumC264412a20, enumC264412a21, enumC264412a22, enumC264412a23, enumC264412a24, enumC264412a25, enumC264412a26, enumC264412a27, enumC264412a28, enumC264412a29, enumC264412a30, enumC264412a31, enumC264412a32, enumC264412a33, enumC264412a34, enumC264412a35, enumC264412a36, enumC264412a37, enumC264412a38};
    }

    public final C12I getLeftIcon() {
        return this.LJLILLLLZI;
    }

    public final int getPriority() {
        return this.LJLIL;
    }

    public final C12I getRightIcon() {
        return this.LJLJJI;
    }

    public final String getRightText() {
        return this.LJLJI;
    }

    public final boolean isRed() {
        return this.LJLJJL;
    }

    public /* synthetic */ EnumC264412a(String str, int i, int i2, C12I c12i, String str2, C12I c12i2) {
        this(str, i, i2, c12i, str2, c12i2, false);
    }

    public EnumC264412a(String str, int i, int i2, C12I c12i, String str2, C12I c12i2, boolean z) {
        this.LJLIL = i2;
        this.LJLILLLLZI = c12i;
        this.LJLJI = str2;
        this.LJLJJI = c12i2;
        this.LJLJJL = z;
    }
}
