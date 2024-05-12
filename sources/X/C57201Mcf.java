package X;

import Y.ARunnableS45S0100000_9;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Mcf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57201Mcf extends AbstractC65781Prl implements InterfaceC88473Ynt<VideoMusicCoverAssem, Boolean, Boolean, C76800UCe> {
    public static final C57201Mcf LJLIL = new C57201Mcf();

    public C57201Mcf() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, Boolean bool, Boolean bool2) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C35570Dxe.LIZ(new ARunnableS45S0100000_9(selectSubscribe, 144), selectSubscribe.LLIIJLIL);
        }
        if (booleanValue2) {
            C35570Dxe.LIZ(new ARunnableS45S0100000_9(selectSubscribe, 146), selectSubscribe.LLIIIZ);
        }
        return C76800UCe.LIZ;
    }
}
