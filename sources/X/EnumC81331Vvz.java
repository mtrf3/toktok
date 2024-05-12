package X;

import android.util.SparseArray;

/* renamed from: X.Vvz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC81331Vvz {
    PLAY(101),
    PAUSE(102),
    RELEASE(103),
    SEEK(104),
    UPDATE_PROGRESS(201),
    VIDEO_SIZE_CHANGED(202),
    INIT_PLAY(203),
    PLAY_START(204),
    FETCH_VIDEO_MODEL(205),
    PREPARE(206),
    PREPARED(207),
    RENDER_START(208),
    VIDEO_PLAY(209),
    VIDEO_PAUSE(210),
    PLAYBACK_STATE_CHANGED(211),
    LOAD_STATE_CHANGED(212),
    BUFFER_START(213),
    BUFFER_COUNT(214),
    BUFFERING_UPDATE(215),
    BUFFER_END(216),
    STREAM_CHANGED(217),
    VIDEO_PRE_COMPLETED(218),
    VIDEO_COMPLETED(219),
    VIDEO_PRE_RELEASE(220),
    VIDEO_RELEASED(221),
    ERROR(222),
    RESOLUTION_CHANGED(223),
    PRE_FULLSCREEN(224),
    FULLSCREEN(225),
    INTERCEPT_FULLSCREEN(226),
    EXEC_COMMAND(227),
    VIDEO_STATUS_EXCEPTION(228),
    PRE_VIDEO_SEEK(229),
    SEEK_START(230),
    SEEK_COMPLETE(231),
    RENDER_SEEK_COMPLETE(232),
    REPLAY(233),
    RETRY(234),
    STREAM_BITRATE_CHANGED(235),
    UPDATE_VIDEO_SIZE(301),
    VIDEO_THREAD_QUIT(302);

    public static final SparseArray<EnumC81331Vvz> LJLILLLLZI = new SparseArray<>();
    public final int LJLIL;

    public static void LIZJ() {
        if (LJLILLLLZI.size() <= 0) {
            for (EnumC81331Vvz enumC81331Vvz : values()) {
                LJLILLLLZI.put(enumC81331Vvz.LJLIL, enumC81331Vvz);
            }
        }
    }

    public int getWhat() {
        LIZJ();
        return this.LJLIL;
    }

    public static EnumC81331Vvz getMsg(int i) {
        LIZJ();
        return LJLILLLLZI.get(i);
    }

    public static EnumC81331Vvz valueOf(String str) {
        return (EnumC81331Vvz) V0N.LJJJ(EnumC81331Vvz.class, str);
    }

    EnumC81331Vvz(int i) {
        this.LJLIL = i;
    }
}
