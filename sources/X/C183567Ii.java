package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183567Ii extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C183567Ii LJLIL = new C183567Ii();

    public C183567Ii() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssem upvoteVideoAssem, C43I<? extends Integer> c43i) {
        UpvoteVideoAssem selectSubscribe = upvoteVideoAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLILIL = Long.valueOf(System.currentTimeMillis());
            selectSubscribe.LLILLIZIL = Boolean.TRUE;
            C183577Ij c183577Ij = selectSubscribe.A4().LJLJI;
            c183577Ij.LIZ = 0;
            c183577Ij.LIZIZ = false;
            c183577Ij.LIZJ = false;
            c183577Ij.LIZLLL = false;
            c183577Ij.LJ = false;
            c183577Ij.LJFF = false;
            c183577Ij.LJI = false;
            c183577Ij.LJII = false;
            c183577Ij.LJIIIIZZ = false;
            c183577Ij.LJIIIZ = false;
            c183577Ij.LJIIJ = false;
            c183577Ij.LJIIJJI = -1;
            c183577Ij.LJIIL = "";
            c183577Ij.LJIILIIL.clear();
            c183577Ij.LJIILJJIL = false;
            c183577Ij.LJIILL = null;
            selectSubscribe.LLIZ = true;
            selectSubscribe.LLILZLL = true;
            selectSubscribe.e5();
            selectSubscribe.O4(true);
            if (C7HP.LIZ() && ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().isPhotoMode() && !selectSubscribe.LLJ && selectSubscribe.D4(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType)) {
                selectSubscribe.LLJ = true;
                C7JZ.LIZIZ.LIZIZ(selectSubscribe, new AqS169S0100000_3(selectSubscribe, 522));
            }
        }
        return C76800UCe.LIZ;
    }
}
