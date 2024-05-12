package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.0Ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC05580Ju {
    Unknown(LiveLayoutPreloadThreadPriority.DEFAULT),
    Init(0),
    Config(1),
    Upload(2),
    UploadAck(3),
    Download(4),
    DownloadAck(5),
    Report(6),
    ReportACK(7),
    ClientError(8),
    ServerError(9),
    Ping(10),
    Pong(11),
    RealTime(12),
    Close(13);

    public final int LJLIL;

    public static EnumC05580Ju valueOf(String str) {
        return (EnumC05580Ju) V0N.LJJJ(EnumC05580Ju.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC05580Ju(int i) {
        this.LJLIL = i;
    }
}
