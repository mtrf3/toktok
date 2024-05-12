package X;

import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;

/* loaded from: classes10.dex */
public final class MWO extends AbstractC65781Prl implements InterfaceC65784Pro<NoticeVideoManager.Meta> {
    public static final MWO LJLIL = new MWO();

    public MWO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager$Meta, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final NoticeVideoManager.Meta invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        NoticeVideoManager.Meta meta = NoticeVideoManager.LJLIL;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "preload_notice_video", 31744, NoticeVideoManager.Meta.class, meta);
        if (LJIJ == 0) {
            return meta;
        }
        return LJIJ;
    }
}
