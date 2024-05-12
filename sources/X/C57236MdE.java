package X;

import Y.ARunnableS45S0100000_9;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM;
import kotlin.jvm.internal.o;

/* renamed from: X.MdE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57236MdE extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C57236MdE LJLIL = new C57236MdE();

    public C57236MdE() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends Boolean> c43i) {
        VideoMusicCoverAssem selectSubscribeOnAsync = videoMusicCoverAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue()) {
            VideoMusicCoverVM D4 = selectSubscribeOnAsync.D4();
            if (D4.LJLJLLL && !D4.kv0()) {
                if (!L4E.LIZ.needFixMarqueeAnim) {
                    D4.LJLJLLL = false;
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS45S0100000_9(D4, 149));
                } else {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS45S0100000_9(D4, 150));
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
