package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ROTATE_FUNCTION' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.4yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC126814yL {
    public static final EnumC126814yL ADD_AUDIO;
    public static final EnumC126814yL ADD_CAPTION;
    public static final EnumC126814yL ADD_OVERLAY;
    public static final EnumC126814yL ADD_RECORDED_AUDIO;
    public static final EnumC126814yL ADD_SOUND_EFFECT;
    public static final EnumC126814yL ADD_TEXT;
    public static final EnumC126814yL ADD_VIDEO;
    public static final EnumC126814yL ADD_VIDEO_EFFECT;
    public static final EnumC126814yL ADJUST_CLIPS;
    public static final EnumC126814yL APPLYTOALL_VOICE_EFFECT;
    public static final EnumC126814yL APPLY_TO_ALL;
    public static final EnumC126814yL APPLY_VOICE_EFFECT;
    public static final EnumC126814yL CANCEL_REVERSE;
    public static final EnumC126814yL CHANGE_FILTER;
    public static final EnumC126814yL CHANGE_SOUND_SPEED;
    public static final EnumC126814yL CHANGE_SPEED;
    public static final EnumC126814yL CHANGE_VOLUME;
    public static final EnumC126814yL CLIP;
    public static final EnumC126814yL CLOSE_MUSIC_SYNC;
    public static final EnumC126814yL CLOSE_VOLUME;
    public static final EnumC126814yL COPY;
    public static final EnumC126814yL COPY_RECORDED_AUDIO;
    public static final EnumC126814yL COPY_SOUND_EFFECT;
    public static final EnumC126814yL COPY_TEXT;
    public static final EnumC126814yL COPY_VIDEO_EFFECT;
    public static final EnumC126814yL CROP;
    public static final EnumC126814yL DELETE;
    public static final EnumC126814yL DELETE_CAPTION;
    public static final EnumC126814yL EDIT_CAPTION;
    public static final EnumC126814yL EDIT_TEXT;
    public static final EnumC126814yL FADE;
    public static final EnumC126814yL FADE_IN;
    public static final EnumC126814yL FADE_OUT;
    public static final /* synthetic */ EnumC126814yL[] LJLJJI;
    public static final EnumC126814yL MAGIC;
    public static final EnumC126814yL MOVE_CANVAS;
    public static final EnumC126814yL MUSIC_BEAT;
    public static final EnumC126814yL OPEN_MUSIC_SYNC;
    public static final EnumC126814yL OPEN_VOLUME;
    public static final EnumC126814yL REPLACE;
    public static final EnumC126814yL REPLACE_AUDIO;
    public static final EnumC126814yL REPLACE_VIDEO_EFFECT;
    public static final EnumC126814yL REVERSE_VIDEO;
    public static final EnumC126814yL ROTATE_CANVAS;
    public static final EnumC126814yL ROTATE_FUNCTION;
    public static final EnumC126814yL SOUND_ADJUST;
    public static final EnumC126814yL SPLIT;
    public static final EnumC126814yL START_OVER;
    public static final EnumC126814yL SUB_TRACK_ORDER;
    public static final EnumC126814yL TEXT_TO_SPEECH;
    public static final EnumC126814yL TRANSITION;
    public static final EnumC126814yL VIDEO_ORDER;
    public static final EnumC126814yL VIDEO_TRANSITION;
    public static final EnumC126814yL ZOOM_CANVAS;
    public final int LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;

    public static EnumC126814yL valueOf(String str) {
        return (EnumC126814yL) V0N.LJJJ(EnumC126814yL.class, str);
    }

    public static EnumC126814yL[] values() {
        return (EnumC126814yL[]) LJLJJI.clone();
    }

    static {
        EnumC126814yL enumC126814yL = new EnumC126814yL("SPLIT", "split", 0, R.string.s_s, Integer.valueOf(R.string.s9y));
        SPLIT = enumC126814yL;
        EnumC126814yL enumC126814yL2 = new EnumC126814yL("CHANGE_SPEED", "speed", 1, R.string.s_e, Integer.valueOf(R.string.s9k));
        CHANGE_SPEED = enumC126814yL2;
        EnumC126814yL enumC126814yL3 = new EnumC126814yL("CHANGE_VOLUME", "volume", 2, R.string.s_f, Integer.valueOf(R.string.s9l));
        CHANGE_VOLUME = enumC126814yL3;
        EnumC126814yL enumC126814yL4 = new EnumC126814yL("CLOSE_VOLUME", "original_sound_off", 3, R.string.s_w, Integer.valueOf(R.string.s_2));
        CLOSE_VOLUME = enumC126814yL4;
        EnumC126814yL enumC126814yL5 = new EnumC126814yL("OPEN_VOLUME", "original_sound_on", 4, R.string.s_x, Integer.valueOf(R.string.s_3));
        OPEN_VOLUME = enumC126814yL5;
        EnumC126814yL enumC126814yL6 = new EnumC126814yL("DELETE", "delete", 5, R.string.s_i, Integer.valueOf(R.string.s9o));
        DELETE = enumC126814yL6;
        EnumC126814yL enumC126814yL7 = new EnumC126814yL("APPLY_TO_ALL", "apply_to_all", 6, R.string.s_g, Integer.valueOf(R.string.s9m));
        APPLY_TO_ALL = enumC126814yL7;
        EnumC126814yL enumC126814yL8 = new EnumC126814yL("CHANGE_SOUND_SPEED", "sound_speed", 7, R.string.rgn, Integer.valueOf(R.string.rgm));
        CHANGE_SOUND_SPEED = enumC126814yL8;
        EnumC126814yL enumC126814yL9 = new EnumC126814yL("CHANGE_FILTER", "sound_filter", 8, R.string.rgl, Integer.valueOf(R.string.rgk));
        CHANGE_FILTER = enumC126814yL9;
        EnumC126814yL enumC126814yL10 = new EnumC126814yL("CLIP", "trim_slot", 9, R.string.s_v, Integer.valueOf(R.string.s_1));
        CLIP = enumC126814yL10;
        Integer valueOf = Integer.valueOf(R.string.s9v);
        EnumC126814yL enumC126814yL11 = new EnumC126814yL("ROTATE_FUNCTION", "rotate", 10, R.string.s_p, valueOf);
        ROTATE_FUNCTION = enumC126814yL11;
        EnumC126814yL enumC126814yL12 = new EnumC126814yL("ROTATE_CANVAS", "rotate", 11, R.string.s_p, valueOf);
        ROTATE_CANVAS = enumC126814yL12;
        EnumC126814yL enumC126814yL13 = new EnumC126814yL("ZOOM_CANVAS", "scale", 12, R.string.s_y, Integer.valueOf(R.string.s_4));
        ZOOM_CANVAS = enumC126814yL13;
        Integer valueOf2 = Integer.valueOf(R.string.s9s);
        EnumC126814yL enumC126814yL14 = new EnumC126814yL("MOVE_CANVAS", "translation", 13, R.string.s_m, valueOf2);
        MOVE_CANVAS = enumC126814yL14;
        EnumC126814yL enumC126814yL15 = new EnumC126814yL("ADJUST_CLIPS", "clip_slot", 14, R.string.s_d, Integer.valueOf(R.string.s9j));
        ADJUST_CLIPS = enumC126814yL15;
        EnumC126814yL enumC126814yL16 = new EnumC126814yL("VIDEO_ORDER", "sort_main_track", 15, R.string.s_n, Integer.valueOf(R.string.s9t));
        VIDEO_ORDER = enumC126814yL16;
        EnumC126814yL enumC126814yL17 = new EnumC126814yL("ADD_VIDEO", "add_video", 16, R.string.s__, Integer.valueOf(R.string.s9f));
        ADD_VIDEO = enumC126814yL17;
        EnumC126814yL enumC126814yL18 = new EnumC126814yL("START_OVER", "start_over", 17, R.string.s_t, Integer.valueOf(R.string.s9z));
        START_OVER = enumC126814yL18;
        EnumC126814yL enumC126814yL19 = new EnumC126814yL("OPEN_MUSIC_SYNC", "enable_ai_beat", 18, R.string.s_r, Integer.valueOf(R.string.s9x));
        OPEN_MUSIC_SYNC = enumC126814yL19;
        EnumC126814yL enumC126814yL20 = new EnumC126814yL("CLOSE_MUSIC_SYNC", "disable_ai_beat", 19, R.string.s_q, Integer.valueOf(R.string.s9w));
        CLOSE_MUSIC_SYNC = enumC126814yL20;
        EnumC126814yL enumC126814yL21 = new EnumC126814yL("ADD_AUDIO", "add_audio", 20, R.string.s_b, Integer.valueOf(R.string.s9h));
        ADD_AUDIO = enumC126814yL21;
        EnumC126814yL enumC126814yL22 = new EnumC126814yL("REPLACE_AUDIO", "replace_audio", 21, R.string.s_o, Integer.valueOf(R.string.s9u));
        REPLACE_AUDIO = enumC126814yL22;
        EnumC126814yL enumC126814yL23 = new EnumC126814yL("ADD_SOUND_EFFECT", "add_sound_effect", 22, R.string.fo1, Integer.valueOf(R.string.fnf));
        ADD_SOUND_EFFECT = enumC126814yL23;
        EnumC126814yL enumC126814yL24 = new EnumC126814yL("COPY_SOUND_EFFECT", "copy_sound_effect", 23, R.string.fo2, Integer.valueOf(R.string.fng));
        COPY_SOUND_EFFECT = enumC126814yL24;
        EnumC126814yL enumC126814yL25 = new EnumC126814yL("ADD_VIDEO_EFFECT", "add_video_effect", 24, R.string.flk, Integer.valueOf(R.string.flg));
        ADD_VIDEO_EFFECT = enumC126814yL25;
        EnumC126814yL enumC126814yL26 = new EnumC126814yL("REPLACE_VIDEO_EFFECT", "replace_video_effect", 25, R.string.flm, Integer.valueOf(R.string.fli));
        REPLACE_VIDEO_EFFECT = enumC126814yL26;
        EnumC126814yL enumC126814yL27 = new EnumC126814yL("COPY_VIDEO_EFFECT", "copy_video_effect", 26, R.string.fln, Integer.valueOf(R.string.flj));
        COPY_VIDEO_EFFECT = enumC126814yL27;
        EnumC126814yL enumC126814yL28 = new EnumC126814yL("ADD_TEXT", "add_text", 27, R.string.s_c, Integer.valueOf(R.string.s9i));
        ADD_TEXT = enumC126814yL28;
        EnumC126814yL enumC126814yL29 = new EnumC126814yL("TEXT_TO_SPEECH", "text_to_speech", 28, R.string.s_u, Integer.valueOf(R.string.s_0));
        TEXT_TO_SPEECH = enumC126814yL29;
        EnumC126814yL enumC126814yL30 = new EnumC126814yL("EDIT_TEXT", "edit_text", 29, R.string.s_l, Integer.valueOf(R.string.s9r));
        EDIT_TEXT = enumC126814yL30;
        EnumC126814yL enumC126814yL31 = new EnumC126814yL("COPY_TEXT", "copy_text", 30, R.string.s_h, Integer.valueOf(R.string.s9n));
        COPY_TEXT = enumC126814yL31;
        EnumC126814yL enumC126814yL32 = new EnumC126814yL("ADD_OVERLAY", "add_overlay", 31, R.string.s_a, Integer.valueOf(R.string.s9g));
        ADD_OVERLAY = enumC126814yL32;
        EnumC126814yL enumC126814yL33 = new EnumC126814yL("COPY", "copy", 32, R.string.g4o, Integer.valueOf(R.string.g4_));
        COPY = enumC126814yL33;
        EnumC126814yL enumC126814yL34 = new EnumC126814yL("REPLACE", "replace", 33, R.string.g4g, Integer.valueOf(R.string.g4f));
        REPLACE = enumC126814yL34;
        EnumC126814yL enumC126814yL35 = new EnumC126814yL("MUSIC_BEAT", "music_beat", 34, R.string.rh1, Integer.valueOf(R.string.rh0));
        MUSIC_BEAT = enumC126814yL35;
        EnumC126814yL enumC126814yL36 = new EnumC126814yL("REVERSE_VIDEO", "reverse_on", 35, R.string.b7b, null);
        REVERSE_VIDEO = enumC126814yL36;
        EnumC126814yL enumC126814yL37 = new EnumC126814yL("CANCEL_REVERSE", "reverse_off", 36, R.string.b6v, null);
        CANCEL_REVERSE = enumC126814yL37;
        EnumC126814yL enumC126814yL38 = new EnumC126814yL("TRANSITION", "transition", 37, R.string.b7g, null);
        TRANSITION = enumC126814yL38;
        EnumC126814yL enumC126814yL39 = new EnumC126814yL("FADE_IN", "fade_in", 38, R.string.b74, null);
        FADE_IN = enumC126814yL39;
        EnumC126814yL enumC126814yL40 = new EnumC126814yL("FADE_OUT", "fade_out", 39, R.string.b75, null);
        FADE_OUT = enumC126814yL40;
        EnumC126814yL enumC126814yL41 = new EnumC126814yL("FADE", "fade", 40, R.string.b73, null);
        FADE = enumC126814yL41;
        EnumC126814yL enumC126814yL42 = new EnumC126814yL("SUB_TRACK_ORDER", "move_sub_track", 41, R.string.s_m, valueOf2);
        SUB_TRACK_ORDER = enumC126814yL42;
        EnumC126814yL enumC126814yL43 = new EnumC126814yL("EDIT_CAPTION", "edit_caption", 42, R.string.s_k, Integer.valueOf(R.string.s9q));
        EDIT_CAPTION = enumC126814yL43;
        EnumC126814yL enumC126814yL44 = new EnumC126814yL("DELETE_CAPTION", "delete_caption", 43, R.string.s_j, Integer.valueOf(R.string.s9p));
        DELETE_CAPTION = enumC126814yL44;
        EnumC126814yL enumC126814yL45 = new EnumC126814yL("VIDEO_TRANSITION", "video_transition", 44, R.string.sjf, Integer.valueOf(R.string.sje));
        VIDEO_TRANSITION = enumC126814yL45;
        EnumC126814yL enumC126814yL46 = new EnumC126814yL("ADD_CAPTION", "add_caption", 45, R.string.s_9, Integer.valueOf(R.string.s9e));
        ADD_CAPTION = enumC126814yL46;
        EnumC126814yL enumC126814yL47 = new EnumC126814yL("ADD_RECORDED_AUDIO", "add_recorded_audio", 46, R.string.ts2, Integer.valueOf(R.string.trz));
        ADD_RECORDED_AUDIO = enumC126814yL47;
        EnumC126814yL enumC126814yL48 = new EnumC126814yL("COPY_RECORDED_AUDIO", "copy_recorded_audio", 47, R.string.ts7, Integer.valueOf(R.string.ts6));
        COPY_RECORDED_AUDIO = enumC126814yL48;
        EnumC126814yL enumC126814yL49 = new EnumC126814yL("APPLY_VOICE_EFFECT", "voice_effect", 48, R.string.ts4, Integer.valueOf(R.string.ts3));
        APPLY_VOICE_EFFECT = enumC126814yL49;
        EnumC126814yL enumC126814yL50 = new EnumC126814yL("APPLYTOALL_VOICE_EFFECT", "applyToAll_voice_effect", 49, R.string.ts1, Integer.valueOf(R.string.try));
        APPLYTOALL_VOICE_EFFECT = enumC126814yL50;
        EnumC126814yL enumC126814yL51 = new EnumC126814yL("CROP", "crop", 50, R.string.fm3, Integer.valueOf(R.string.fm1));
        CROP = enumC126814yL51;
        EnumC126814yL enumC126814yL52 = new EnumC126814yL("MAGIC", "magic", 51, R.string.e9a, Integer.valueOf(R.string.e9_));
        MAGIC = enumC126814yL52;
        EnumC126814yL enumC126814yL53 = new EnumC126814yL("SOUND_ADJUST", "sound_adjust", 52, R.string.bgs, Integer.valueOf(R.string.bgr));
        SOUND_ADJUST = enumC126814yL53;
        LJLJJI = new EnumC126814yL[]{enumC126814yL, enumC126814yL2, enumC126814yL3, enumC126814yL4, enumC126814yL5, enumC126814yL6, enumC126814yL7, enumC126814yL8, enumC126814yL9, enumC126814yL10, enumC126814yL11, enumC126814yL12, enumC126814yL13, enumC126814yL14, enumC126814yL15, enumC126814yL16, enumC126814yL17, enumC126814yL18, enumC126814yL19, enumC126814yL20, enumC126814yL21, enumC126814yL22, enumC126814yL23, enumC126814yL24, enumC126814yL25, enumC126814yL26, enumC126814yL27, enumC126814yL28, enumC126814yL29, enumC126814yL30, enumC126814yL31, enumC126814yL32, enumC126814yL33, enumC126814yL34, enumC126814yL35, enumC126814yL36, enumC126814yL37, enumC126814yL38, enumC126814yL39, enumC126814yL40, enumC126814yL41, enumC126814yL42, enumC126814yL43, enumC126814yL44, enumC126814yL45, enumC126814yL46, enumC126814yL47, enumC126814yL48, enumC126814yL49, enumC126814yL50, enumC126814yL51, enumC126814yL52, enumC126814yL53};
    }

    public final String getNameId() {
        return this.LJLJI;
    }

    public final Integer getRedoId() {
        return this.LJLILLLLZI;
    }

    public final int getUndoId() {
        return this.LJLIL;
    }

    public EnumC126814yL(String str, String str2, int i, int i2, Integer num) {
        this.LJLIL = i2;
        this.LJLILLLLZI = num;
        this.LJLJI = str2;
    }
}
