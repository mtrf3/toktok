package X;

import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7AO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AO extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoQuickCommentAssem, C43I<? extends C70012ov>, C76800UCe> {
    public static final C7AO LJLIL = new C7AO();

    public C7AO() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoQuickCommentAssem videoQuickCommentAssem, C43I<? extends C70012ov> c43i) {
        C70012ov c70012ov;
        String str;
        String str2;
        String aid;
        String str3;
        VideoQuickCommentAssem selectSubscribe = videoQuickCommentAssem;
        C43I<? extends C70012ov> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if ((!C53324KwK.LIZ() || c43i2 != null) && selectSubscribe.LJLLL && c43i2 != null && (c70012ov = (C70012ov) c43i2.LIZ) != null) {
            boolean z = c70012ov.LJLJJL;
            InterfaceC54795Lex LJIL = C55723Ltv.LIZIZ.LJIL();
            Aweme commentInputAweme = selectSubscribe.getCommentInputAweme();
            if (commentInputAweme != null) {
                str = commentInputAweme.getAuthorUid();
            } else {
                str = null;
            }
            if (str == null) {
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
            if (c7al.LJLIL || C79488VHo.LIZ()) {
                if (!c7al.LJLIL && C79488VHo.LIZ()) {
                    InterfaceC178516zX r42 = selectSubscribe.r4();
                    if (LJII != null) {
                        str3 = LJII.getAid();
                    } else {
                        str3 = null;
                    }
                    r42.LIZ(str3, C7AL.L(c7al, true, false, null, 6));
                }
                Aweme commentInputAweme2 = selectSubscribe.getCommentInputAweme();
                if (commentInputAweme2 != null && (aid = commentInputAweme2.getAid()) != null) {
                    C7AL c7al2 = selectSubscribe.r4().get(aid);
                    if (!c7al2.LJLILLLLZI && C178726zs.LIZ(selectSubscribe.getCommentInputAweme())) {
                        VideoQuickCommentAssem.z4(selectSubscribe, true, z, 4);
                        selectSubscribe.q4(null);
                        C224748ru c224748ru = selectSubscribe.LLII;
                        if (c224748ru != null) {
                            c224748ru.setText("");
                        }
                        selectSubscribe.r4().LIZ(aid, C7AL.L(c7al2, true, false, null, 6));
                        selectSubscribe.D4();
                    } else {
                        VideoQuickCommentAssem.z4(selectSubscribe, false, z, 4);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
