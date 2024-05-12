package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.McY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57194McY extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C57194McY LJLIL = new C57194McY();

    public C57194McY() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends Boolean> c43i) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue()) {
            selectSubscribe.z4();
        }
        return C76800UCe.LIZ;
    }
}
