package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72241SWv extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C72241SWv LJLIL = new C72241SWv();

    public C72241SWv() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C43I<? extends Integer> c43i) {
        VideoMusicTitleAssem selectSubscribeOnAsync = videoMusicTitleAssem;
        C43I<? extends Integer> it = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(it, "it");
        if (!C53324KwK.LIZ() || ((Number) it.LIZ).intValue() != 0) {
            selectSubscribeOnAsync.C4().ov0();
        }
        return C76800UCe.LIZ;
    }
}
