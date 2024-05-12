package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72240SWu extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C72240SWu LJLIL = new C72240SWu();

    public C72240SWu() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C43I<? extends Boolean> c43i) {
        VideoMusicTitleAssem selectSubscribeOnAsync = videoMusicTitleAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(it, "it");
        if (!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) {
            selectSubscribeOnAsync.C4().pv0();
        }
        return C76800UCe.LIZ;
    }
}
