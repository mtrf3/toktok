package X;

import android.media.AudioAttributes;
import android.media.SoundPool;
import kotlin.jvm.internal.o;

/* renamed from: X.UnS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78254UnS {
    public static final SoundPool LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static int LJFF;

    static {
        SoundPool build = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).setLegacyStreamType(3).build()).build();
        o.LJIIIIZZ(build, "{\n        val audioAttri…           .build()\n    }");
        LIZ = build;
        LIZIZ = C15490jB.LIZIZ(build, "tiktok_live_gift_send_sound.mp3");
        LIZJ = C15490jB.LIZIZ(build, "tiktok_live_gift_combo_sound.mp3");
        LIZLLL = C15490jB.LIZIZ(build, "tiktok_live_gift_send_sound.mp3");
        LJ = C15490jB.LIZIZ(build, "tiktok_live_gift_combo_sound.mp3");
        LJFF = C15490jB.LIZIZ(build, "tiktok_live_gift_recharge_sound.mp3");
    }

    public static void LIZ() {
        SoundPool soundPool = LIZ;
        LIZIZ = C15490jB.LIZIZ(soundPool, "tiktok_live_gift_send_sound.mp3");
        LIZJ = C15490jB.LIZIZ(soundPool, "tiktok_live_gift_combo_sound.mp3");
        LIZLLL = C15490jB.LIZIZ(soundPool, "tiktok_live_gift_send_sound.mp3");
        LJ = C15490jB.LIZIZ(soundPool, "tiktok_live_gift_combo_sound.mp3");
        LJFF = C15490jB.LIZIZ(soundPool, "tiktok_live_gift_recharge_sound.mp3");
    }
}
