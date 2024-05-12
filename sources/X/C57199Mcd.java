package X;

import Y.ARunnableS45S0100000_9;
import com.ss.android.ugc.aweme.feed.assem.music.RecordMuteVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Mcd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57199Mcd extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C57199Mcd LJLIL = new C57199Mcd();

    public C57199Mcd() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends Boolean> c43i) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (selectSubscribe.LLJJJ) {
                JYH.LIZIZ.LIZ(selectSubscribe.I4());
            }
            if (!((Boolean) c43i2.LIZ).booleanValue()) {
                selectSubscribe.Y4();
                selectSubscribe.LLJILJILJ = false;
                selectSubscribe.LLJILLL = false;
                ARunnableS45S0100000_9 aRunnableS45S0100000_9 = selectSubscribe.LLJJI;
                if (aRunnableS45S0100000_9 != null) {
                    C1DH.LIZJ(aRunnableS45S0100000_9);
                }
                RecordMuteVM G4 = selectSubscribe.G4();
                G4.LJLJLLL.clear();
                G4.LJLL = true;
            }
        }
        return C76800UCe.LIZ;
    }
}
