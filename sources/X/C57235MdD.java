package X;

import Y.ARunnableS45S0100000_9;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.MdD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57235MdD extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C57235MdD LJLIL = new C57235MdD();

    public C57235MdD() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends Boolean> c43i) {
        VideoMusicCoverVM D4;
        VideoItemParams gv0;
        Aweme aweme;
        VideoMusicCoverAssem selectSubscribeOnAsync = videoMusicCoverAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(it, "it");
        if ((!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) && (((gv0 = (D4 = selectSubscribeOnAsync.D4()).gv0()) == null || (aweme = gv0.getAweme()) == null || !C62819Ol5.LJIJJLI(aweme)) && !D4.LJLJLLL && !D4.kv0() && !C40010Fn4.LIZJ().LIZLLL() && !C54333LUb.LIZJ)) {
            if (!L4E.LIZ.needFixMarqueeAnim) {
                D4.LJLJLLL = true;
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS45S0100000_9(D4, 147));
            } else {
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS45S0100000_9(D4, 148));
            }
        }
        return C76800UCe.LIZ;
    }
}
