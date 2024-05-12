package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.game.InterruptGuidelinesSettingV2;
import kotlin.jvm.internal.o;

/* renamed from: X.0vC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22940vC {
    public static final /* synthetic */ int LJIILIIL = 0;
    public int LIZIZ;
    public boolean LIZJ;
    public int LJ;
    public int LJFF;
    public long LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long LIZ = -1;
    public long LIZLLL = -1;
    public int LJIIJ = -1;
    public final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(C529125v.LJLIL);
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(C529025u.LJLIL);

    public final String LIZIZ() {
        return (String) this.LJIIL.getValue();
    }

    public final long LIZJ() {
        return ((Number) this.LJIIJJI.getValue()).longValue();
    }

    public final void LIZ(long j) {
        long j2 = j - this.LIZLLL;
        if (j2 >= 180000) {
            this.LJ = 1;
        }
        if (j2 >= LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            this.LJFF = 1;
        }
        this.LJI = Math.max(j2, this.LJI);
    }

    public final void LJIIIZ(String str) {
        this.LIZ = System.currentTimeMillis();
        if (this.LJIIIZ && this.LJIIJ == -1) {
            this.LJIIJ = 0;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_resumestream_state");
        LIZ.LJIJJ(LIZIZ(), "anchor_id");
        LIZ.LJIJJ("screen_share", "live_type");
        LIZ.LJIJJ(Long.valueOf(LIZJ()), "room_id");
        LIZ.LJIJJ(str, "state");
        LIZ.LJIJJ(Boolean.valueOf(C1O1.LJIIIIZZ()), "is_backGround_restricted");
        LIZ.LJIJJ(Boolean.valueOf(InterruptGuidelinesSettingV2.INSTANCE.isEnable()), "guide_switch");
        LIZ.LJIJJ(Boolean.valueOf(this.LJIIIZ), "has_complete_setting");
        LIZ.LJJIIJZLJL();
    }

    public final void LIZLLL(EnumC266912z enumC266912z, AnonymousClass130 anonymousClass130) {
        long LIZJ;
        String str;
        this.LJIIIZ = true;
        if (this.LJIIIIZZ) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_samsung_setting_complete");
            if (enumC266912z == EnumC266912z.BANNER) {
                LIZJ = 0;
            } else {
                LIZJ = LIZJ();
            }
            LIZ.LJIJJ(LIZIZ(), "anchor_id");
            LIZ.LJIJJ(Long.valueOf(LIZJ), "room_id");
            if (enumC266912z != null) {
                str = enumC266912z.getValue();
            } else {
                str = null;
            }
            LIZ.LJIJJ(str, "enter_from");
            if (anonymousClass130 != null) {
                LIZ.LJIJJ(anonymousClass130.getValue(), "scence_type");
            }
            LIZ.LJJIIJZLJL();
            this.LJIIIIZZ = false;
        }
    }

    public final void LJ(EnumC266912z type, EnumC266812y enumC266812y, AnonymousClass130 anonymousClass130) {
        long LIZJ;
        String str;
        o.LJIIIZ(type, "type");
        if (enumC266812y != EnumC266812y.NOT_NOW) {
            this.LJIIIIZZ = true;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_samsung_self_fix_click");
        if (type == EnumC266912z.BANNER) {
            LIZJ = 0;
        } else {
            LIZJ = LIZJ();
        }
        LIZ.LJIJJ(LIZIZ(), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(LIZJ), "room_id");
        LIZ.LJIJJ(type.getValue(), "type");
        if (enumC266812y != null) {
            str = enumC266812y.getValue();
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "button_name");
        if (anonymousClass130 != null) {
            LIZ.LJIJJ(anonymousClass130.getValue(), "scence_type");
        }
        LIZ.LJJIIJZLJL();
    }

    public final void LJFF(EnumC266912z type, EnumC266912z enumC266912z, AnonymousClass130 anonymousClass130) {
        long j;
        String str;
        o.LJIIIZ(type, "type");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_samsung_self_fix_show");
        EnumC266912z enumC266912z2 = EnumC266912z.BANNER;
        if (type == enumC266912z2 || enumC266912z == enumC266912z2) {
            j = 0;
        } else {
            j = LIZJ();
        }
        LIZ.LJIJJ(LIZIZ(), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        LIZ.LJIJJ(type.getValue(), "type");
        if (enumC266912z != null) {
            str = enumC266912z.getValue();
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "enter_from");
        if (anonymousClass130 != null) {
            LIZ.LJIJJ(anonymousClass130.getValue(), "scence_type");
        }
        LIZ.LJJIIJZLJL();
    }

    public final void LJI(long j, EnumC266912z enumC266912z, AnonymousClass130 anonymousClass130) {
        String str;
        this.LJIIIZ = true;
        if (this.LJIIIIZZ) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_android_setting_complete");
            LIZ.LJIJJ(LIZIZ(), "anchor_id");
            LIZ.LJIJJ(Long.valueOf(j), "room_id");
            String str2 = null;
            if (enumC266912z != null) {
                str = enumC266912z.getValue();
            } else {
                str = null;
            }
            LIZ.LJIJJ(str, "enter_from");
            if (anonymousClass130 != null) {
                str2 = anonymousClass130.getValue();
            }
            LIZ.LJIJJ(str2, "scene_type");
            LIZ.LJJIIJZLJL();
            this.LJIIIIZZ = false;
        }
    }

    public final void LJIIIIZZ(long j, EnumC266912z type, AnonymousClass130 anonymousClass130) {
        String str;
        o.LJIIIZ(type, "type");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_android_self_fix_show");
        LIZ.LJIJJ(LIZIZ(), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        LIZ.LJIJJ(type.getValue(), "type");
        if (anonymousClass130 != null) {
            str = anonymousClass130.getValue();
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "scene_type");
        LIZ.LJJIIJZLJL();
    }

    public final void LJII(long j, EnumC266912z type, EnumC266812y enumC266812y, AnonymousClass130 anonymousClass130) {
        String str;
        o.LJIIIZ(type, "type");
        if (enumC266812y == EnumC266812y.LEARN_MORE) {
            this.LJIIIIZZ = true;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_android_self_fix_click");
        LIZ.LJIJJ(LIZIZ(), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        LIZ.LJIJJ(type.getValue(), "type");
        String str2 = null;
        if (enumC266812y != null) {
            str = enumC266812y.getValue();
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "button_name");
        if (anonymousClass130 != null) {
            str2 = anonymousClass130.getValue();
        }
        LIZ.LJIJJ(str2, "scene_type");
        LIZ.LJJIIJZLJL();
    }
}
