package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C175136u5;
import X.C176996x5;
import X.C177056xB;
import X.C177156xL;
import X.C178526zY;
import X.C178646zk;
import X.C181497Aj;
import X.C188727au;
import X.C212428Vi;
import X.C221108m2;
import X.C227768wm;
import X.C2U8;
import X.C62819Ol5;
import X.C62822Ol8;
import X.C71Y;
import X.C76A;
import X.FMX;
import X.V0N;
import X.X1D;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public abstract class AbstractBottomInputPriorityComponent extends AbstractBottomPriorityComponent {
    public final C62822Ol8 LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void F3() {
    }

    public abstract C177056xB M3();

    public void O3() {
    }

    public void P3(int i, int i2, CharSequence content, C177156xL eventTrackingBundle) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(eventTrackingBundle, "eventTrackingBundle");
    }

    public void Q3() {
    }

    public void R3() {
    }

    public AbstractBottomInputPriorityComponent() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 87));
        this.LJLJJI = "";
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 88));
    }

    public final C176996x5 EJ() {
        return (C176996x5) this.LJLILLLLZI.getValue();
    }

    public final void K3() {
        boolean LJ = a.LJ().LJ(3);
        if (this.LJLJI != LJ) {
            this.LJLJI = LJ;
            L3();
        }
    }

    public void L3() {
        C176996x5 EJ = EJ();
        if (EJ != null) {
            EJ.LJJJLIIL(this.LJLJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void C3(String currentTag) {
        o.LJIIIZ(currentTag, "currentTag");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttach: ");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        C71Y.LIZ("AbstractBottomPriorityComponent", X1D.LIZIZ(LIZ));
        getContainerView().setVisibility(0);
        E3();
        C177056xB c177056xB = (C177056xB) this.LJLJJL.getValue();
        if (!o.LJ(currentTag, y2())) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("commentInputManager.bindView: ");
            LIZ2.append(C16880lQ.LJLLJ(getClass()));
            C71Y.LIZ("AbstractBottomPriorityComponent", X1D.LIZIZ(LIZ2));
            C176996x5 EJ = EJ();
            if (EJ != null) {
                EJ.LIZIZ(c177056xB);
            }
        }
        K3();
    }

    public void onCommentInputPublishStart(Comment comment) {
        CommentListPageFragment LJJIJIIJI;
        if (comment == null) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (LJJIJIIJI = C62819Ol5.LJJIJIIJI(LIZ)) != null) {
            LJJIJIIJI.Kc(comment);
        }
        if (C76A.LIZ()) {
            C2U8.LIZ(new C175136u5(comment, 1));
        }
        if (((Number) C181497Aj.LIZ.getValue()).intValue() > 0) {
            C178646zk c178646zk = new C178646zk(0);
            String awemeId = comment.getAwemeId();
            o.LJIIIIZZ(awemeId, "comment.awemeId");
            c178646zk.LJLILLLLZI = awemeId;
            C2U8.LIZ(c178646zk);
        }
    }

    public final void N3(int i, Comment comment, boolean z) {
        long id;
        int i2;
        boolean z2;
        String str;
        String str2;
        C176996x5 EJ;
        Object obj;
        if (getAweme() == null || comment == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        c188727au.LJIIIZ("group_id", x3());
        c188727au.LJIIIZ("author_id", C227768wm.LIZJ(getAweme()));
        c188727au.LIZLLL(z ? 1 : 0, "is_success");
        if (comment.getGift() == null) {
            id = comment.getFakeGiftId();
        } else {
            id = comment.getGift().getId();
        }
        c188727au.LJ(id, "gift_id");
        c188727au.LIZLLL(C178526zY.LIZ(getAweme()), "is_follow");
        Aweme aweme = getAweme();
        if (aweme != null && aweme.isLike()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "is_like");
        c188727au.LIZLLL(!V0N.LJJII(comment.getText()) ? 1 : 0, "is_comment");
        if (i != 0) {
            c188727au.LIZLLL(i, "error_code");
            c188727au.LJFF(C16880lQ.LLJJI(getContext()), "newtork_condition");
        }
        if (this.LJLJJI.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object obj2 = null;
        if (z2) {
            c188727au.LJI("enter_method", this.LJLJJI);
        } else {
            C176996x5 EJ2 = EJ();
            if (EJ2 == null || (str = EJ2.LLIIII) == null || str.length() == 0) {
                c188727au.LJI("enter_method", "send_button");
            } else {
                C176996x5 EJ3 = EJ();
                if (EJ3 != null) {
                    str2 = EJ3.LLIIII;
                } else {
                    str2 = null;
                }
                c188727au.LJI("enter_method", str2);
            }
        }
        this.LJLJJI = "";
        C176996x5 EJ4 = EJ();
        if ((EJ4 == null || EJ4.LLILLJJLI != -1) && ((EJ = EJ()) == null || EJ.LLILLL != -1)) {
            C176996x5 EJ5 = EJ();
            if (EJ5 != null) {
                obj = Integer.valueOf(EJ5.LLILLJJLI);
            } else {
                obj = null;
            }
            c188727au.LJFF(obj, "gift_value");
            C176996x5 EJ6 = EJ();
            if (EJ6 != null) {
                obj2 = Integer.valueOf(EJ6.LLILLL);
            }
            c188727au.LJFF(obj2, "gift_position");
        }
        FMX.LJIIL("send_gift", c188727au.LIZ);
        C176996x5 EJ7 = EJ();
        if (EJ7 != null) {
            EJ7.LLILLJJLI = -1;
        }
        C176996x5 EJ8 = EJ();
        if (EJ8 == null) {
            return;
        }
        EJ8.LLILLL = -1;
    }
}
