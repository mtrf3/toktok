package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6u0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175086u0 extends C8BR<C8BS<?>, InterfaceC175096u1> implements C7B1 {
    public Aweme LJLJJI;
    public LifecycleOwner LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public C174386ss LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.C7B1
    public final void LJFF(CommentRethinkPopup commentRethinkPopup, UpvoteStruct upvoteStruct, Boolean bool) {
    }

    @Override // X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
        InterfaceC174526t6 LJIJJ = C7HV.LIZIZ.LJIJJ(this.LJLJJL);
        if (LJIJJ != null) {
            LJIJJ.LIZ(this);
        }
    }

    @Override // X.C7B1
    public final void LJ(UpvoteStruct upvoteStruct) {
        String str;
        String str2;
        InterfaceC175096u1 interfaceC175096u1;
        C223688qC c223688qC = null;
        if (upvoteStruct != null) {
            str = upvoteStruct.getItemId();
        } else {
            str = null;
        }
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2) || this.LJLJLLL || (interfaceC175096u1 = (InterfaceC175096u1) this.LJLILLLLZI) == null) {
            return;
        }
        if (upvoteStruct != null) {
            c223688qC = V16.LJJLIIIJLJLI(upvoteStruct);
            c223688qC.setIgnoreToast(true);
        }
        interfaceC175096u1.td(c223688qC);
    }

    @Override // X.C7B1
    public final void LJIIIZ(UpvoteStruct upvoteStruct) {
        String str;
        String str2;
        String str3;
        C223688qC c223688qC = null;
        if (upvoteStruct != null) {
            str = upvoteStruct.getItemId();
        } else {
            str = null;
        }
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            return;
        }
        InterfaceC175156u7 LJIL = C7HV.LIZIZ.LJIL();
        if (upvoteStruct != null) {
            str3 = upvoteStruct.getItemId();
        } else {
            str3 = null;
        }
        LJIL.LJ(str3);
        InterfaceC175096u1 interfaceC175096u1 = (InterfaceC175096u1) this.LJLILLLLZI;
        if (interfaceC175096u1 != null) {
            if (upvoteStruct != null) {
                c223688qC = V16.LJJLIIIJLJLI(upvoteStruct);
            }
            interfaceC175096u1.En(c223688qC);
        }
    }

    @Override // X.C7B1
    public final void LJIJI(UpvoteStruct upvoteStruct) {
        String str;
        String str2;
        InterfaceC175096u1 interfaceC175096u1;
        C223688qC c223688qC = null;
        if (upvoteStruct != null) {
            str = upvoteStruct.getItemId();
        } else {
            str = null;
        }
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2) || this.LJLJLLL || (interfaceC175096u1 = (InterfaceC175096u1) this.LJLILLLLZI) == null) {
            return;
        }
        if (upvoteStruct != null) {
            c223688qC = V16.LJJLIIIJLJLI(upvoteStruct);
            c223688qC.setIgnoreToast(true);
        }
        interfaceC175096u1.uI(c223688qC);
    }

    @Override // X.C7B1
    public final void LJI(Throwable th, UpvoteStruct upvoteStruct) {
        String str;
        InterfaceC175096u1 interfaceC175096u1;
        String str2 = null;
        if (upvoteStruct != null) {
            str = upvoteStruct.getItemId();
        } else {
            str = null;
        }
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        if (o.LJ(str, str2) && (interfaceC175096u1 = (InterfaceC175096u1) this.LJLILLLLZI) != null) {
            if (upvoteStruct != null) {
                V16.LJJLIIIJLJLI(upvoteStruct);
            }
            interfaceC175096u1.qp(th);
        }
    }

    @Override // X.C7B1
    public final void LJIIL(Throwable th, UpvoteStruct upvoteStruct) {
        String str;
        String str2;
        InterfaceC175096u1 interfaceC175096u1;
        C223688qC c223688qC = null;
        if (upvoteStruct != null) {
            str = upvoteStruct.getItemId();
        } else {
            str = null;
        }
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2) || this.LJLJLLL || (interfaceC175096u1 = (InterfaceC175096u1) this.LJLILLLLZI) == null) {
            return;
        }
        if (upvoteStruct != null) {
            c223688qC = V16.LJJLIIIJLJLI(upvoteStruct);
            c223688qC.setIgnoreToast(true);
        }
        interfaceC175096u1.rx(c223688qC, th);
    }

    public final void LJJIII(UpvoteList upvoteList, int i) {
        C174466t0 c174466t0;
        EnumC177686yC enumC177686yC;
        List<CommentReplyListItem> list;
        C174386ss c174386ss = this.LJLJLJ;
        if (c174386ss == null || (c174466t0 = c174386ss.LIZJ) == null) {
            return;
        }
        int size = upvoteList.getUpvotes().size();
        int LIZ = c174466t0.LIZ();
        if (size <= LIZ + i) {
            int i2 = size - LIZ;
            if (i2 < 0) {
                i = 0;
            } else {
                i = i2;
            }
        }
        if (LIZ + i >= ((int) upvoteList.getTotal())) {
            enumC177686yC = EnumC177686yC.ALL_EXPANDED;
        } else {
            enumC177686yC = EnumC177686yC.EXPANDABLE;
        }
        ArrayList arrayList = new ArrayList();
        C174386ss c174386ss2 = this.LJLJLJ;
        if (c174386ss2 == null || (list = c174386ss2.LIZ) == null || list.isEmpty()) {
            List<UpvoteStruct> upvotes = upvoteList.getUpvotes();
            arrayList = new ArrayList(C32I.LJJL(upvotes, 10));
            Iterator<UpvoteStruct> it = upvotes.iterator();
            while (it.hasNext()) {
                arrayList.add(V16.LJJLIIIJLJLI(it.next()));
            }
        } else {
            for (UpvoteStruct upvoteStruct : upvoteList.getUpvotes()) {
                String commentId = upvoteStruct.getCommentId();
                ArrayList arrayList2 = new ArrayList();
                for (CommentReplyListItem commentReplyListItem : list) {
                    if (o.LJ(commentReplyListItem.mComment.getCid(), commentId)) {
                        arrayList2.add(commentReplyListItem);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList.add(V16.LJJLIIIJLJLI(upvoteStruct));
                }
            }
        }
        InterfaceC175096u1 interfaceC175096u1 = (InterfaceC175096u1) this.LJLILLLLZI;
        if (interfaceC175096u1 == null) {
            return;
        }
        interfaceC175096u1.Tq0(enumC177686yC, arrayList.subList(0, Math.min(i, arrayList.size())));
    }
}
