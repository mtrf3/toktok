package X;

import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.76E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C76E {
    public static final List<C76F> LJIIJ = C47261Igj.LJJIJIIJI(C76F.FOLLOW, C76F.MUTUAL_FOLLOW, C76F.MATCHED_FRIEND);
    public static final List<String> LJIIJJI = C47261Igj.LJJIJIIJI("homepage_hot", "homepage_follow", "homepage_friends", "others_homepage");
    public final View LIZ;
    public Aweme LIZIZ;
    public String LIZJ;
    public final boolean LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;

    public final TuxTextView LIZIZ() {
        Object value = this.LJI.getValue();
        o.LJIIIIZZ(value, "<get-commentSplitView>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView LIZJ() {
        Object value = this.LJII.getValue();
        o.LJIIIIZZ(value, "<get-commentStyleView>(...)");
        return (TuxTextView) value;
    }

    public final C57446Mgc LIZLLL() {
        Object value = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-followAppendTextView>(...)");
        return (C57446Mgc) value;
    }

    public final C58049MqL LJ() {
        Object value = this.LJIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-relationLabel>(...)");
        return (C58049MqL) value;
    }

    public final TuxTextView LJFF() {
        return (TuxTextView) this.LJFF.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Comment comment) {
        MatchedFriendStruct matchedFriendStruct;
        o.LJIIIZ(comment, "comment");
        if (C175296uL.LIZJ(comment) && this.LIZLLL) {
            C27740Aue.LJIIJ(true, this.LJ.getValue(), LJFF());
            C27740Aue.LJIIJ(false, LIZIZ(), LIZJ(), LIZLLL(), LJ());
            TuxTextView LJFF = LJFF();
            if (LJFF == null) {
                return;
            }
            LJFF.setText(C178406zM.LJIIIIZZ(comment.getReplyToNickName(), comment.getReplyToUserName(), this.LIZJ));
            return;
        }
        if (!C175296uL.LIZJ(comment) && comment.getLabelText() != null && comment.getLabelType() == 1) {
            C27740Aue.LJIIJ(false, this.LJ.getValue(), LJFF(), LIZLLL(), LJ());
            C1795873a.LIZIZ(comment, LIZIZ(), this.LIZJ);
            C1795873a.LIZ(comment, LIZJ(), this.LIZJ);
            return;
        }
        if (C175296uL.LIZIZ(comment, this.LIZIZ, this.LIZJ, this.LIZLLL)) {
            C27740Aue.LJIIJ(true, LIZLLL(), LJ());
            C27740Aue.LJIIJ(false, this.LJ.getValue(), LJFF(), LIZIZ(), LIZJ());
            C57446Mgc LIZLLL = LIZLLL();
            C7YW c7yw = new C7YW();
            User user = comment.getUser();
            o.LJIIIIZZ(user, "comment.user");
            c7yw.LIZ = user;
            c7yw.LIZLLL = C113554cx.LJJL(new OSZ(Boolean.FALSE, 61), new OSZ(Boolean.TRUE, 62));
            c7yw.LJ = true;
            LIZLLL.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
            LIZLLL.setDataChangeListener(new AqS132S0200000_1(LIZLLL, comment, 61));
            LIZLLL.setTracker(new AqS150S0200000_3(this, comment, 72));
            User user2 = comment.getUser();
            if (user2 != null && (matchedFriendStruct = user2.getMatchedFriendStruct()) != null) {
                LJ().LJJJJ(matchedFriendStruct, C58050MqM.LJII);
            }
            LJ().setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(new AqS134S0200000_3(this, comment, 198), 202)));
            return;
        }
        C27740Aue.LJIIJ(false, this.LJ.getValue(), LJFF(), LIZLLL(), LJ());
        C1795873a.LIZIZ(comment, LIZIZ(), this.LIZJ);
        C1795873a.LIZ(comment, LIZJ(), this.LIZJ);
    }

    public static final boolean LJI(Comment comment, String str) {
        o.LJIIIZ(comment, "<this>");
        if (C175306uM.LIZLLL && V16.LJJIZ(comment) && ORZ.LJLJJI(str, LJIIJJI) && (comment.getUser().getFollowStatus() == EnumC57435MgR.FOLLOWED.getValue() || comment.getUser().getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue())) {
            return true;
        }
        return false;
    }

    public C76E(View itemView, Aweme aweme, String str, boolean z, boolean z2) {
        o.LJIIIZ(itemView, "itemView");
        this.LIZ = itemView;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1493));
        this.LJFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1494));
        this.LJI = C221108m2.LIZIZ(new AqS60S0110000_3(this, z2, 10));
        this.LJII = C221108m2.LIZIZ(new AqS60S0110000_3(this, z2, 11));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS60S0110000_3(this, z2, 12));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS60S0110000_3(this, z2, 13));
    }
}
