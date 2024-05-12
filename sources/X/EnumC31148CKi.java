package X;

import com.ss.ttlivestreamer.core.utils.LiveStreamThreadType;

/* renamed from: X.CKi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31148CKi {
    ENABLE_WORK(LiveStreamThreadType.WORK_THREAD, 1),
    ENABLE_VIDEO(LiveStreamThreadType.VIDEO_CAPTURE, 2),
    ENABLE_GRK(LiveStreamThreadType.GRK_THREAD, 4);

    public final LiveStreamThreadType LJLIL;
    public final int LJLILLLLZI;

    public static EnumC31148CKi valueOf(String str) {
        return (EnumC31148CKi) V0N.LJJJ(EnumC31148CKi.class, str);
    }

    public final LiveStreamThreadType getThreadType() {
        return this.LJLIL;
    }

    public final int getValue() {
        return this.LJLILLLLZI;
    }

    EnumC31148CKi(LiveStreamThreadType liveStreamThreadType, int i) {
        this.LJLIL = liveStreamThreadType;
        this.LJLILLLLZI = i;
    }
}
