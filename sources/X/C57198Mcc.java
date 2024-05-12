package X;

import Y.ACListenerS29S0100000_9;
import Y.IDCListenerS300S0100000_9;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Mcc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57198Mcc extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, Boolean, C76800UCe> {
    public static final C57198Mcc LJLIL = new C57198Mcc();

    public C57198Mcc() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, Boolean bool) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        FrameLayout frameLayout = selectSubscribe.LLIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("music assem, ");
        LIZ.append(frameLayout);
        LIZ.append(", setMusicCoverClickListener");
        C204257zx.LJI(X1D.LIZIZ(LIZ));
        if (booleanValue) {
            if (frameLayout != null) {
                C16880lQ.LJIIJ(new ACListenerS29S0100000_9(selectSubscribe, 108), frameLayout);
            }
        } else {
            if (frameLayout != null) {
                C16880lQ.LJIIJ(new ACListenerS29S0100000_9(selectSubscribe, 109), frameLayout);
            }
            if (C34515Dgd.LIZ && frameLayout != null) {
                frameLayout.setOnLongClickListener(new IDCListenerS300S0100000_9(selectSubscribe, 2));
            }
        }
        C57197Mcb E4 = selectSubscribe.E4();
        if (C8D3.LIZJ()) {
            E4.LIZ();
        }
        return C76800UCe.LIZ;
    }
}
