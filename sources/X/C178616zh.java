package X;

import android.os.Build;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomQuickCommentAssem;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import kotlin.jvm.internal.o;

/* renamed from: X.6zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C178616zh extends TBS implements InterfaceC88472Yns<String, C76800UCe> {
    public C178616zh(Object obj) {
        super(1, obj, BottomQuickCommentAssem.class, "onClickEmoji", "onClickEmoji(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        C176996x5 EJ;
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        BottomQuickCommentAssem bottomQuickCommentAssem = (BottomQuickCommentAssem) this.receiver;
        if (Build.VERSION.SDK_INT >= 29) {
            ((C61995OUt) bottomQuickCommentAssem.LJLJL.getValue()).LIZ();
        } else {
            ((C61995OUt) bottomQuickCommentAssem.LJLJL.getValue()).LIZIZ(85, 61);
        }
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C75W.LIZ(p0);
        }
        C178646zk c178646zk = new C178646zk(1);
        c178646zk.LJLILLLLZI = bottomQuickCommentAssem.x3();
        c178646zk.LJLJI = p0;
        C2U8.LIZ(c178646zk);
        if (!((InterfaceC178516zX) bottomQuickCommentAssem.LJLJLJ.getValue()).get(bottomQuickCommentAssem.x3()).LJLJI.contains(p0) && (EJ = bottomQuickCommentAssem.EJ()) != null) {
            EJ.LJ(p0);
        }
        return C76800UCe.LIZ;
    }
}
