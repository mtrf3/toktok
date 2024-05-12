package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Xy8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86560Xy8 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoProgressBarAssem, C55008LiO, C76800UCe> {
    public static final C86560Xy8 LJLIL = new C86560Xy8();

    public C86560Xy8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoProgressBarAssem videoProgressBarAssem, C55008LiO c55008LiO) {
        boolean z;
        VideoProgressBarAssem selectSubscribe = videoProgressBarAssem;
        C55008LiO c55008LiO2 = c55008LiO;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c55008LiO2 != null) {
            VideoProgressBarViewModel r4 = selectSubscribe.r4();
            if (c55008LiO2.LJLIL != 4) {
                z = true;
            } else {
                z = false;
            }
            r4.getClass();
            r4.setState(new AqS18S0010000_14(z, 32));
        }
        return C76800UCe.LIZ;
    }
}
