package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Mci, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57204Mci extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C57204Mci LJLIL = new C57204Mci();

    public C57204Mci() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends C76800UCe> c43i) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && IFM.LIZ) {
            selectSubscribe.LLJJIJIIJIL = true;
            selectSubscribe.P4();
        }
        return C76800UCe.LIZ;
    }
}
