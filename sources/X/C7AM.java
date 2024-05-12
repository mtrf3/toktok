package X;

import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7AM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AM extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoQuickCommentAssem, C178646zk, C76800UCe> {
    public static final C7AM LJLIL = new C7AM();

    public C7AM() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoQuickCommentAssem videoQuickCommentAssem, C178646zk c178646zk) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        VideoQuickCommentAssem selectSubscribe = videoQuickCommentAssem;
        C178646zk c178646zk2 = c178646zk;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (selectSubscribe.LJLLL) {
            if (c178646zk2 != null && c178646zk2.LJLIL == 2) {
                z = true;
            } else {
                z = false;
            }
            String str5 = null;
            if (z) {
                InterfaceC178516zX r4 = selectSubscribe.r4();
                Aweme commentInputAweme = selectSubscribe.getCommentInputAweme();
                if (commentInputAweme != null) {
                    str5 = commentInputAweme.getAid();
                }
                VideoQuickCommentAssem.z4(selectSubscribe, !r4.get(str5).LJLILLLLZI, true, 4);
            } else if (c178646zk2 != null && c178646zk2.LJLIL == 3) {
                VideoQuickCommentAssem.z4(selectSubscribe, false, true, 4);
            } else {
                InterfaceC178516zX r42 = selectSubscribe.r4();
                if (c178646zk2 != null) {
                    str = c178646zk2.LJLILLLLZI;
                } else {
                    str = null;
                }
                C7AL c7al = r42.get(str);
                if (c178646zk2 != null) {
                    str2 = c178646zk2.LJLILLLLZI;
                } else {
                    str2 = null;
                }
                Aweme commentInputAweme2 = selectSubscribe.getCommentInputAweme();
                if (commentInputAweme2 != null) {
                    str3 = commentInputAweme2.getAid();
                } else {
                    str3 = null;
                }
                if (o.LJ(str2, str3) && !c7al.LJLILLLLZI) {
                    InterfaceC178516zX r43 = selectSubscribe.r4();
                    if (c178646zk2 != null) {
                        str4 = c178646zk2.LJLILLLLZI;
                    } else {
                        str4 = null;
                    }
                    r43.LIZ(str4, C7AL.L(c7al, true, true, null, 4));
                    VideoQuickCommentAssem.z4(selectSubscribe, false, true, 4);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
