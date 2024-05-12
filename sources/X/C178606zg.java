package X;

import android.os.Build;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.6zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C178606zg extends TBS implements InterfaceC88472Yns<String, C76800UCe> {
    public C178606zg(C178506zW c178506zW) {
        super(1, c178506zW, C178506zW.class, "onClickEmoji", "onClickEmoji(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String str2;
        C176996x5 c176996x5;
        Aweme commentInputAweme;
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        C178506zW c178506zW = (C178506zW) this.receiver;
        if (Build.VERSION.SDK_INT >= 29) {
            ((C61995OUt) c178506zW.LIZIZ.getValue()).LIZ();
        } else {
            ((C61995OUt) c178506zW.LIZIZ.getValue()).LIZIZ(85, 61);
        }
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C75W.LIZ(p0);
        }
        InterfaceC178496zV interfaceC178496zV = c178506zW.LJFF;
        if (interfaceC178496zV == null || (commentInputAweme = interfaceC178496zV.getCommentInputAweme()) == null || (str2 = commentInputAweme.getAid()) == null) {
            str2 = "";
        }
        C178646zk c178646zk = new C178646zk(1);
        c178646zk.LJLILLLLZI = str2;
        c178646zk.LJLJI = p0;
        C2U8.LIZ(c178646zk);
        if (!((InterfaceC178516zX) c178506zW.LIZJ.getValue()).get(str2).LJLJI.contains(p0) && (c176996x5 = c178506zW.LJ) != null) {
            c176996x5.LJ(p0);
        }
        return C76800UCe.LIZ;
    }
}
