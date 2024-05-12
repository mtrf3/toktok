package X;

import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72245SWz extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C72245SWz LJLIL = new C72245SWz();

    public C72245SWz() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, C43I<? extends Boolean> c43i) {
        VideoMusicTitleRefactorAssem selectSubscribeOnAsync = videoMusicTitleRefactorAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(it, "it");
        if (!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) {
            selectSubscribeOnAsync.B4().qv0();
        }
        return C76800UCe.LIZ;
    }
}
