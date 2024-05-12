package X;

import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.M1l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56137M1l extends AbstractC65781Prl implements InterfaceC88471Ynr<EcVideoGuideAssem, C43I<? extends Long>, C76800UCe> {
    public static final C56137M1l LJLIL = new C56137M1l();

    public C56137M1l() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EcVideoGuideAssem ecVideoGuideAssem, C43I<? extends Long> c43i) {
        int i;
        EcVideoGuideAssem selectSubscribe = ecVideoGuideAssem;
        C43I<? extends Long> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            long longValue = ((Number) c43i2.LIZ).longValue();
            if (longValue > selectSubscribe.LLIIZ) {
                selectSubscribe.LLIIZ = (int) longValue;
            }
            XKS xks = selectSubscribe.LLIIL;
            if (xks != null && (xks._state instanceof InterfaceC30550Bys) && ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().productRecallType != 4 && longValue > 10000) {
                long j = 2 * longValue;
                Video video = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getVideo();
                if (video != null) {
                    i = video.getDuration();
                } else {
                    i = 0;
                }
                if (j >= i) {
                    OSZ osz = new OSZ(2, 3);
                    C3C5.m7constructorimpl(osz);
                    xks.resumeWith(osz);
                }
            }
            if (longValue >= selectSubscribe.LLIL) {
                C38891fp.LJJIIJ(C76800UCe.LIZ, selectSubscribe.LLIILII);
            }
        }
        return C76800UCe.LIZ;
    }
}
