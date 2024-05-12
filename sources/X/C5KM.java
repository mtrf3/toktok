package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.jvm.internal.o;

/* renamed from: X.5KM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KM extends AbstractC65781Prl implements InterfaceC88472Yns<VideoSegment, Boolean> {
    public static final C5KM LJLIL = new C5KM();

    public C5KM() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(VideoSegment videoSegment) {
        VideoSegment it = videoSegment;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(!it.isDeleted);
    }
}
