package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.HashMap;

/* renamed from: X.Usf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78577Usf extends HashMap<String, Integer> {
    public C78577Usf() {
        put("playing", 1);
        put("recved_spspps", 2);
        put("play_stop", 4);
        put("start_play", 8);
        put("first_frame", 4096);
        put("prepare_result", 16);
        put("stream_abnormal", 32);
        put("session_stop", 64);
        put("decode_stall", 128);
        put("render_stall", Integer.valueOf(FileUtils.BUFFER_SIZE));
        put("link", 256);
        put("demux_stall", 512);
        put("retry", 1024);
        put("play_error", 2048);
        put("rtm_session_stop", 16384);
    }
}
