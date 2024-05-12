package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176216vp implements InterfaceC174756tT, Observer<C176206vo> {
    public Context LJLIL;
    public InterfaceC176236vr LJLILLLLZI;
    public InterfaceC176236vr LJLJI;
    public Comment LJLJJI;
    public InterfaceC176226vq LJLJJL;
    public final C178216z3 LJLJJLL = C178216z3.LIZ;
    public C74D LJLJL;

    @Override // X.InterfaceC174756tT
    public final void resetTranslate() {
        Comment comment = this.LJLJJI;
        if (comment == null) {
            return;
        }
        this.LJLJJLL.getClass();
        C178216z3.LJ(C47261Igj.LJJIJ(comment));
    }

    @Override // X.InterfaceC174756tT
    public final void translate() {
        Comment comment = this.LJLJJI;
        if (comment == null) {
            return;
        }
        C178216z3 c178216z3 = this.LJLJJLL;
        C74D c74d = this.LJLJL;
        c178216z3.getClass();
        C178216z3.LJI(C47261Igj.LJJIJ(comment), c74d, false);
    }

    public C176216vp(Context context) {
        this.LJLIL = context;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C176206vo c176206vo) {
        Activity LIZ;
        C176206vo c176206vo2 = c176206vo;
        if (c176206vo2 == null || c176206vo2.LIZ == null || (LIZ = C27740Aue.LIZ(this.LJLIL)) == null || LIZ.isFinishing()) {
            return;
        }
        Comment comment = c176206vo2.LIZ;
        if (c176206vo2.LIZLLL == 1) {
            InterfaceC176226vq interfaceC176226vq = this.LJLJJL;
            if (interfaceC176226vq == null) {
                return;
            }
            interfaceC176226vq.setLoading(true);
            return;
        }
        if (c176206vo2.LIZIZ) {
            InterfaceC176226vq interfaceC176226vq2 = this.LJLJJL;
            if (interfaceC176226vq2 != null) {
                interfaceC176226vq2.setLoading(false);
                this.LJLJJL.LIZIZ();
            }
            ((C74I) this.LJLILLLLZI).LIZ(C1799274i.LIZIZ(comment, false), C1799274i.LIZJ(comment, this.LJLIL, true));
            List<Comment> replyComments = comment.getReplyComments();
            if (comment.getCommentType() != 0 || this.LJLJI == null || C79004UzY.LJJIFFI(replyComments)) {
                return;
            }
            Comment comment2 = (Comment) ListProtector.get(replyComments, 0);
            InterfaceC176236vr interfaceC176236vr = this.LJLJI;
            o.LJIIIZ(comment2, "<this>");
            ((C74I) interfaceC176236vr).LIZ(C1799274i.LIZIZ(comment2, true), C1799274i.LIZJ(comment2, this.LJLIL, true));
            return;
        }
        Exception exc = c176206vo2.LIZJ;
        InterfaceC176226vq interfaceC176226vq3 = this.LJLJJL;
        if (interfaceC176226vq3 != null) {
            interfaceC176226vq3.setLoading(false);
            this.LJLJJL.LIZIZ();
        }
        if (exc == null) {
            return;
        }
        C1A7.LJIJJ(this.LJLIL, exc);
    }

    @Override // X.InterfaceC174756tT
    public final void resetTranslatedMultiComment(List<Comment> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LJLJJI);
        if (list != null) {
            arrayList.addAll(list);
        }
        if (arrayList.size() == 0) {
            return;
        }
        this.LJLJJLL.getClass();
        C178216z3.LJ(arrayList);
    }

    @Override // X.InterfaceC174756tT
    public final void translateMultiWithReplyComment(List<Comment> list) {
        if (this.LJLJJI == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LJLJJI);
        if (list != null) {
            arrayList.addAll(list);
        }
        C178216z3 c178216z3 = this.LJLJJLL;
        C74D c74d = this.LJLJL;
        c178216z3.getClass();
        C178216z3.LJI(arrayList, c74d, false);
    }

    public final void LIZ(Context context, Comment comment, C74D c74d, C74I c74i, C74I c74i2, InterfaceC176226vq interfaceC176226vq) {
        if (comment != null) {
            if (!comment.isTranslated() || !interfaceC176226vq.LIZ()) {
                if (!C78886Uxe.LJJJJJL(comment)) {
                    if (interfaceC176226vq == null) {
                        return;
                    }
                    Comment comment2 = this.LJLJJI;
                    if (comment2 != null) {
                        C178216z3 c178216z3 = this.LJLJJLL;
                        String cid = comment2.getCid();
                        c178216z3.getClass();
                        C178216z3.LIZIZ(cid).removeObserver(this);
                    }
                    this.LJLIL = context;
                    this.LJLJJI = comment;
                    this.LJLJL = c74d;
                    this.LJLILLLLZI = c74i;
                    this.LJLJI = c74i2;
                    this.LJLJJL = interfaceC176226vq;
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) C27740Aue.LIZ(c74i.LIZIZ);
                    if (lifecycleOwner == null) {
                        C178216z3 c178216z32 = this.LJLJJLL;
                        String cid2 = this.LJLJJI.getCid();
                        c178216z32.getClass();
                        C178216z3.LIZIZ(cid2).observeForever(this, false);
                    } else {
                        C178216z3 c178216z33 = this.LJLJJLL;
                        String cid3 = this.LJLJJI.getCid();
                        c178216z33.getClass();
                        C178216z3.LIZIZ(cid3).observe(lifecycleOwner, this, false);
                    }
                    InterfaceC176226vq interfaceC176226vq2 = this.LJLJJL;
                    C178216z3 c178216z34 = this.LJLJJLL;
                    Comment comment3 = this.LJLJJI;
                    c178216z34.getClass();
                    interfaceC176226vq2.setLoading(C178216z3.LIZLLL(comment3));
                    C178216z3 c178216z35 = this.LJLJJLL;
                    Comment comment4 = this.LJLJJI;
                    c178216z35.getClass();
                    C178216z3.LIZLLL(comment4);
                    return;
                }
            }
            interfaceC176226vq.setViewVisibility(8);
        }
        if (interfaceC176226vq == null) {
            return;
        }
        interfaceC176226vq.setViewVisibility(8);
    }
}
