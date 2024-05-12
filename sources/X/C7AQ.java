package X;

import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7AQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AQ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoQuickCommentAssem, C43I<? extends C210108Mk>, C76800UCe> {
    public static final C7AQ LJLIL = new C7AQ();

    public C7AQ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoQuickCommentAssem videoQuickCommentAssem, C43I<? extends C210108Mk> c43i) {
        C210108Mk c210108Mk;
        String str;
        String str2;
        VideoQuickCommentAssem selectSubscribe = videoQuickCommentAssem;
        C43I<? extends C210108Mk> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c210108Mk = (C210108Mk) c43i2.LIZ) != null && (((float) c210108Mk.LJLJI) * 1.0f) / ((float) 1000) >= 0.5d) {
            InterfaceC54795Lex LJIL = C55723Ltv.LIZIZ.LJIL();
            Aweme commentInputAweme = selectSubscribe.getCommentInputAweme();
            String str3 = null;
            if (commentInputAweme == null || (str = commentInputAweme.getAuthorUid()) == null) {
                str = "";
            }
            Aweme LJII = LJIL.LJII(str);
            InterfaceC178516zX r4 = selectSubscribe.r4();
            if (LJII != null) {
                str2 = LJII.getAid();
            } else {
                str2 = null;
            }
            C7AL c7al = r4.get(str2);
            if (!c7al.LJLIL && C178726zs.LIZ(selectSubscribe.getCommentInputAweme())) {
                InterfaceC178516zX r42 = selectSubscribe.r4();
                Aweme commentInputAweme2 = selectSubscribe.getCommentInputAweme();
                if (commentInputAweme2 != null) {
                    str3 = commentInputAweme2.getAid();
                }
                if (!r42.get(str3).LJLILLLLZI) {
                    selectSubscribe.u4(true, true, new AqS92S0300000_3(selectSubscribe, LJII, c7al, 17));
                } else {
                    VideoQuickCommentAssem.z4(selectSubscribe, false, true, 4);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
