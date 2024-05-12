package X;

import com.zhiliaoapp.musically.R;
import defpackage.e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class I38 {
    public static final I38 LIVE;
    public static final /* synthetic */ I38[] LJLJI;
    public static final I38 NEW_BOTTOM_STORY;
    public static final I38 PHOTO_SHORT;
    public static final I38 RECORD_COMBINE;
    public static final I38 RECORD_COMBINE_15;
    public static final I38 RECORD_COMBINE_180;
    public static final I38 RECORD_COMBINE_60;
    public static final I38 RECORD_COMBINE_600;
    public static final I38 RECORD_COMBINE_LIGHTENING;
    public static final I38 RECORD_LIGHTENING_PHOTO;
    public static final I38 RECORD_LIGHTENING_PHOTO_AND_VIDEO;
    public static final I38 RECORD_LIGHTENING_QUICK;
    public static final I38 RECORD_LIGHTENING_TEXT;
    public static final I38 RECORD_LIGHTENING_VIDEO;
    public static final I38 RECORD_NOW;
    public static final I38 RECORD_SPLIT_3MIN;
    public static final I38 RECORD_SPLIT_LIGHTENING;
    public final int LJLIL;
    public final String LJLILLLLZI;

    public static I38 valueOf(String str) {
        return (I38) V0N.LJJJ(I38.class, str);
    }

    public static I38[] values() {
        return (I38[]) LJLJI.clone();
    }

    static {
        int i;
        I38 i38 = new I38("PHOTO_SHORT", 0, R.string.pwg, "record_mode_shoot");
        PHOTO_SHORT = i38;
        I38 i382 = new I38("RECORD_COMBINE", 1, R.string.pvx, "record_mode_combine");
        RECORD_COMBINE = i382;
        I38 i383 = new I38("RECORD_COMBINE_60", 2, R.string.pvl, "RecordShoot60s");
        RECORD_COMBINE_60 = i383;
        I38 i384 = new I38("RECORD_COMBINE_15", 3, R.string.pvk, "RecordShoot15s");
        RECORD_COMBINE_15 = i384;
        I38 i385 = new I38("RECORD_COMBINE_180", 4, R.string.s7s, "RecordShoot180s");
        RECORD_COMBINE_180 = i385;
        I38 i386 = new I38("RECORD_COMBINE_600", 5, R.string.s5v, "RecordShoot600s");
        RECORD_COMBINE_600 = i386;
        I38 i387 = new I38("RECORD_SPLIT_3MIN", 6, R.string.eij, "RecordShoot180s");
        RECORD_SPLIT_3MIN = i387;
        if (e1.LIZ(31744, "tt_story2_change_camera_tab_name", true, false)) {
            i = R.string.jl5;
        } else {
            i = R.string.rrn;
        }
        I38 i388 = new I38("RECORD_SPLIT_LIGHTENING", 7, i, "RecordShoot180s");
        RECORD_SPLIT_LIGHTENING = i388;
        I38 i389 = new I38("RECORD_LIGHTENING_QUICK", 8, R.string.rrk, "RecordLightening");
        RECORD_LIGHTENING_QUICK = i389;
        I38 i3810 = new I38("RECORD_LIGHTENING_VIDEO", 9, R.string.rrm, "RecordLighteningVideo");
        RECORD_LIGHTENING_VIDEO = i3810;
        I38 i3811 = new I38("RECORD_LIGHTENING_PHOTO", 10, R.string.rrl, "RecordLighteningPhoto");
        RECORD_LIGHTENING_PHOTO = i3811;
        I38 i3812 = new I38("RECORD_LIGHTENING_TEXT", 11, R.string.s6z, "RecordLighteningText");
        RECORD_LIGHTENING_TEXT = i3812;
        I38 i3813 = new I38("NEW_BOTTOM_STORY", 12, R.string.rrk, "RecordBottomStory");
        NEW_BOTTOM_STORY = i3813;
        I38 i3814 = new I38("RECORD_COMBINE_LIGHTENING", 13, R.string.tl_, "record_mode_combine");
        RECORD_COMBINE_LIGHTENING = i3814;
        I38 i3815 = new I38("RECORD_LIGHTENING_PHOTO_AND_VIDEO", 14, R.string.rrk, "RecordLighteningPhotoAndVideo");
        RECORD_LIGHTENING_PHOTO_AND_VIDEO = i3815;
        I38 i3816 = new I38("RECORD_NOW", 15, R.string.j1a, "RecordNow");
        RECORD_NOW = i3816;
        I38 i3817 = new I38("LIVE", 16, R.string.htc, "record_mode_live");
        LIVE = i3817;
        LJLJI = new I38[]{i38, i382, i383, i384, i385, i386, i387, i388, i389, i3810, i3811, i3812, i3813, i3814, i3815, i3816, i3817};
    }

    public final int getNameResId() {
        return this.LJLIL;
    }

    public final String getTag() {
        return this.LJLILLLLZI;
    }

    public I38(String str, int i, int i2, String str2) {
        this.LJLIL = i2;
        this.LJLILLLLZI = str2;
    }
}
