package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.UuE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78674UuE extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoUserCardAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C78674UuE LJLIL = new C78674UuE();

    public C78674UuE() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoUserCardAssem videoUserCardAssem, C43I<? extends C195357lb> c43i) {
        String str;
        VideoUserCardAssem selectSubscribe = videoUserCardAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            VideoUserCardVM p4 = selectSubscribe.p4();
            if (p4.LJLJLLL) {
                p4.setStateImmediate(C78673UuD.LJLIL);
                p4.lv0(false, AA5.SLIDE);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onHolderUnSelected, item:");
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
        }
        return C76800UCe.LIZ;
    }
}
