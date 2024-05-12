package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Mcj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57205Mcj extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C57205Mcj LJLIL = new C57205Mcj();

    public C57205Mcj() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends C76800UCe> c43i) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && IFM.LIZ) {
            selectSubscribe.LLJJIJIIJIL = false;
            selectSubscribe.O4();
        }
        return C76800UCe.LIZ;
    }
}
