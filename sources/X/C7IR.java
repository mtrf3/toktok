package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7IR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IR extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssemNew, C43I<? extends Integer>, C76800UCe> {
    public static final C7IR LJLIL = new C7IR();

    public C7IR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssemNew upvoteVideoAssemNew, C43I<? extends Integer> c43i) {
        UpvoteVideoAssemNew selectSubscribe = upvoteVideoAssemNew;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLILIL = Long.valueOf(System.currentTimeMillis());
            selectSubscribe.LLILLIZIL = Boolean.TRUE;
            C7IQ c7iq = selectSubscribe.z4().LJLJI;
            c7iq.LIZ = 0;
            c7iq.LIZIZ = false;
            c7iq.LIZJ = false;
            c7iq.LIZLLL = false;
            c7iq.LJ = false;
            c7iq.LJFF = false;
            c7iq.LJI = false;
            c7iq.LJII = -1;
            c7iq.LJIIIIZZ = "";
            c7iq.LJIIIZ = false;
            c7iq.LJIIJ = null;
            selectSubscribe.LLIZ = true;
            selectSubscribe.LLILZLL = true;
            selectSubscribe.e5();
            selectSubscribe.O4(true);
            if (C7HP.LIZ() && ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().isPhotoMode() && !selectSubscribe.LLILII && selectSubscribe.D4(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType)) {
                selectSubscribe.LLILII = true;
                C7JZ.LIZIZ.LIZIZ(selectSubscribe, new AqS169S0100000_3(selectSubscribe, 530));
            }
        }
        return C76800UCe.LIZ;
    }
}
