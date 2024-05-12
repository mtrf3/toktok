package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.73x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1798173x extends AnonymousClass746 {
    public final C72434Sbm LLJILJILJ;
    public TextView LLJILLL;

    @Override // X.AnonymousClass746, X.AnonymousClass744
    public final void N(Comment comment, Rect rect) {
        V92 v92;
        V92 hierarchy;
        V8L v8l;
        int i;
        TextView textView;
        V92 hierarchy2;
        o.LJIIIZ(comment, "comment");
        super.N(comment, rect);
        C72434Sbm c72434Sbm = this.LLJILJILJ;
        boolean z = true;
        if (c72434Sbm != null && (hierarchy2 = c72434Sbm.getHierarchy()) != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_repost;
            c2068389v.LIZIZ = C7MY.LIZIZ(16);
            c2068389v.LIZJ = C7MY.LIZIZ(16);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            hierarchy2.LJIILL(c2068389v.LIZ(context), 1);
        }
        C72434Sbm c72434Sbm2 = this.LLJILJILJ;
        V8L v8l2 = null;
        if (c72434Sbm2 != null) {
            v92 = c72434Sbm2.getHierarchy();
        } else {
            v92 = null;
        }
        if (v92 != null) {
            C72434Sbm c72434Sbm3 = this.LLJILJILJ;
            if (c72434Sbm3 != null && (hierarchy = c72434Sbm3.getHierarchy()) != null && (v8l = hierarchy.LIZJ) != null) {
                v8l.LIZLLL(C32151Nz.LJIIZILJ(1));
                Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cl);
                if (LIZIZ != null) {
                    i = LIZIZ.intValue();
                } else {
                    i = 0;
                }
                v8l.LJFF = i;
                v8l2 = v8l;
            }
            v92.LJIL(v8l2);
        }
        C72434Sbm c72434Sbm4 = this.LLJILJILJ;
        if (c72434Sbm4 != null) {
            c72434Sbm4.setVisibility(0);
        }
        if (V16.LJJIIZ(comment) && (textView = this.LLIIIL) != null) {
            textView.setVisibility(8);
        }
        CommentService.LIZ.getClass();
        if (CommentServiceImpl.LJJL().LJIILLIIL(this.LJLLLLLL) || !CommentServiceImpl.LJJL().LJJIJIIJI(this.LJLLLLLL)) {
            z = false;
        }
        if (V16.LJJIJL(comment) && z) {
            this.LLJILLL = (TextView) this.itemView.findViewById(R.id.bjl);
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 13), this.itemView);
            TextView textView2 = this.LLJILLL;
            if (textView2 != null) {
                textView2.setOnTouchListener(new AnonymousClass741() { // from class: X.73z
                    @Override // X.AnonymousClass741
                    public final void LIZLLL(View view) {
                        o.LJIIIZ(view, "view");
                        C1798173x c1798173x = C1798173x.this;
                        ((CommentListFragment) c1798173x.LLIL).xn(c1798173x.LJLILLLLZI, "click_add_recommendation");
                    }
                });
            }
            TextView textView3 = this.LLJILLL;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } else {
            TextView textView4 = this.LLJILLL;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 308), this.itemView);
        }
        AnonymousClass708 anonymousClass708 = this.LLD;
        if (anonymousClass708 != null) {
            anonymousClass708.LJIIIIZZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1798173x(View itemView, AbsFragment fragment, InterfaceC1797373p listener) {
        super(itemView, fragment, listener);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(listener, "listener");
        this.LLJILJILJ = (C72434Sbm) itemView.findViewById(R.id.fc7);
    }
}
