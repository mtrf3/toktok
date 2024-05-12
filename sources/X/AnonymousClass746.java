package X;

import Y.ACListenerS21S0101000_2;
import Y.ACListenerS32S0101000_15;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.746, reason: invalid class name */
/* loaded from: classes4.dex */
public class AnonymousClass746 extends AnonymousClass744 {
    public final TextView LLILIL;
    public final TextView LLILL;
    public final TextView LLILLIZIL;
    public final TextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final LinearLayout LLILZLL;
    public final TextView LLIZ;
    public final SmartImageView LLIZLLLIL;
    public final FrameLayout LLJ;
    public final boolean LLJI;
    public int LLJIJIL;
    public final C76E LLJILJIL;

    @Override // X.AnonymousClass744
    public final void LLLLZ() {
        AnonymousClass708 anonymousClass708;
        int i;
        Comment comment = this.LJLILLLLZI;
        if (comment == null) {
            return;
        }
        if (C174446sy.LIZLLL(comment)) {
            TextView textView = this.LLILIL;
            if (textView != null) {
                C27740Aue.LJIIJ(false, textView, this.LLIIIL);
            }
            AnonymousClass708 anonymousClass7082 = this.LLD;
            if (anonymousClass7082 != null) {
                anonymousClass7082.setVisibility(8);
            }
        } else {
            TextView textView2 = this.LLILIL;
            if (textView2 != null) {
                textView2.setVisibility(0);
                C27740Aue.LJIIJ(true, this.LLIIIL);
                TextView textView3 = this.LLILIL;
                if (this.LLJI) {
                    textView3.setText(C86036Xpg.LIZIZ(this.LJLILLLLZI.getCreateTime() * 1000));
                } else {
                    textView3.setText(C57105Mb7.LIZJ(this.LJLILLLLZI.getCreateTime() * 1000, this.itemView.getContext()));
                }
            }
            if (!C178406zM.LJIIJ(this.LJLLLLLL) && (anonymousClass708 = this.LLD) != null) {
                anonymousClass708.setVisibility(0);
            }
        }
        if (this.LJLILLLLZI.getGift() != null && this.LJLILLLLZI.getGift().getImage() != null && this.LJLILLLLZI.getGift().getImage().getUrlList() != null && !this.LJLILLLLZI.getGift().getImage().getUrlList().isEmpty()) {
            this.LLILZLL.setVisibility(0);
            TextView textView4 = this.LLIZ;
            if (textView4 != null) {
                if (C90193gN.LIZ()) {
                    i = R.drawable.xu;
                } else {
                    i = R.drawable.xt;
                }
                textView4.setBackgroundResource(i);
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(this.LJLILLLLZI.getGift().getImage()));
            LJII.LJJIIJ = this.LLIZLLLIL;
            LJII.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
            C16880lQ.LLJJJ(LJII);
            C16880lQ.LJIIZILJ(this.LLILZLL, new ACListenerS21S0101000_2(0, this, 11));
        } else {
            this.LLILZLL.setVisibility(8);
        }
        C174446sy.LJIIJ(this.LJLILLLLZI, this.LLILZ);
        g0();
    }

    @Override // X.AnonymousClass744
    public final void Y() {
        this.LLILLL.setTypeface(this.LJLJL.getTypeface());
    }

    @Override // X.AnonymousClass744
    public final void LLII(String str) {
        this.LJLLLL = str;
    }

    public final void h0(boolean z) {
        User author;
        if (this.LLILZIL != null) {
            if (z) {
                C74J.LIZIZ(this.LLJ, true);
                Aweme aweme = this.LJLLLLLL;
                if (aweme == null || (author = aweme.getAuthor()) == null) {
                    return;
                }
                int LJIILL = C17N.LJIILL(16.0d);
                W5F LJI = C1JX.LJI(author);
                LJI.LJIILIIL(J7H.LIZ(100));
                LJI.LJIILIIL = C175166u8.LIZ(this.LJZL.getContext(), 16.0f);
                LJI.LJII = LJIILL;
                LJI.LJIIIIZZ = LJIILL;
                LJI.LJJIJIIJIL = true;
                LJI.LIZIZ("CommentViewHolder");
                LJI.LJJIIJ = this.LJZL;
                C16880lQ.LLJJJ(LJI);
                return;
            }
            C74J.LIZIZ(this.LLJ, false);
        }
    }

    @Override // X.AnonymousClass744
    public void N(Comment comment, Rect rect) {
        View view;
        C76E c76e;
        super.N(comment, rect);
        if (this.LJLILLLLZI == null || comment == null) {
            return;
        }
        this.LLILL.setVisibility(0);
        comment.getDiggCount();
        if (!this.LLIIJLIL || this.LLILZLL.getVisibility() != this.LLJIJIL) {
            this.LLJIJIL = this.LLILZLL.getVisibility();
            if (this.LLILZIL != null) {
                View view2 = this.LJLJI;
                if (view2 instanceof ConstraintLayout) {
                    C74E c74e = new C74E((ConstraintLayout) view2);
                    synchronized (C74F.class) {
                        if (c74e.LIZIZ == null) {
                            c74e.LIZIZ = new C74F(c74e);
                        }
                    }
                    c74e.LIZJ.LJII(c74e.LIZ);
                    C74F c74f = c74e.LIZIZ;
                    if (c74f == null) {
                        return;
                    }
                    if (this.LLFFF && (view = this.LJLJLLL) != null && view.getVisibility() == 0) {
                        if (this.LLILZLL.getVisibility() == 0) {
                            c74f.LIZ(R.id.fri, R.id.dv2);
                        } else {
                            c74f.LIZ(R.id.fri, R.id.bmd);
                        }
                        c74f.LIZ(R.id.lk9, R.id.nfp);
                        c74f.LIZ(R.id.hzt, R.id.lk9);
                    } else {
                        c74f.LIZ(R.id.lk9, R.id.bmd);
                        if (this.LLILZLL.getVisibility() == 0) {
                            c74f.LIZ(R.id.fri, R.id.dv2);
                        } else {
                            c74f.LIZ(R.id.fri, R.id.lk9);
                        }
                        c74f.LIZ(R.id.hzt, R.id.bmd);
                    }
                    C74E c74e2 = c74f.LIZ;
                    c74e2.LIZJ.LIZIZ(c74e2.LIZ);
                }
            }
        }
        if (this.LLIIJLIL && (c76e = this.LLJILJIL) != null) {
            Aweme aweme = this.LJLLLLLL;
            String str = this.LJLLLL;
            c76e.LIZIZ = aweme;
            c76e.LIZJ = str;
            c76e.LIZ(comment);
        } else {
            new C76E(this.itemView, this.LJLLLLLL, this.LJLLLL, false, false).LIZ(comment);
        }
        C74G.LIZ(this.LLILLIZIL, comment.getRelationLabel());
        if (!this.LLIIJLIL) {
            this.LLILLIZIL.setBackgroundResource(R.drawable.xn);
            TextView textView = this.LLILLIZIL;
            textView.setTextColor(C79045V0n.LJI(R.attr.go, textView.getContext()).intValue());
        }
        View view3 = this.LJLJLLL;
        if (view3 != null && view3.getVisibility() == 0 && this.LLILLJJLI != null) {
            Comment comment2 = (Comment) ListProtector.get(comment.getReplyComments(), 0);
            new C76E(this.itemView, this.LJLLLLLL, this.LJLLLL, true, true).LIZ(comment2);
            C74G.LIZ(this.LLILLJJLI, comment2.getRelationLabel());
            this.LLILLJJLI.setBackgroundResource(R.drawable.xn);
            TextView textView2 = this.LLILLJJLI;
            textView2.setTextColor(C78886Uxe.LJJIFFI(R.attr.go, R.color.ck, textView2.getContext()));
        }
        h0(comment.isAuthorDigged);
    }

    public AnonymousClass746(View view, AbsFragment absFragment, InterfaceC1797373p interfaceC1797373p) {
        super(view, absFragment, interfaceC1797373p);
        FFL.LJIIIZ().getClass();
        this.LLJI = FFL.LJ(31744, "standardize_timestamp", true, false);
        this.LLJIJIL = 8;
        AnonymousClass741 anonymousClass741 = new AnonymousClass741() { // from class: X.740
            @Override // X.AnonymousClass741
            public final void LIZLLL(View view2) {
                String str;
                Comment comment;
                AnonymousClass746 anonymousClass746 = AnonymousClass746.this;
                if (anonymousClass746.LJLILLLLZI == null || anonymousClass746.LLIL == null) {
                    return;
                }
                String str2 = "";
                if (view2.getId() == R.id.mgy) {
                    if (AnonymousClass746.this.LJLILLLLZI.getRelationLabel() != null) {
                        str2 = AnonymousClass746.this.LJLILLLLZI.getRelationLabel().getUserId();
                    }
                    str = AnonymousClass746.this.LJLILLLLZI.getUser().getSecUid();
                } else if (C79004UzY.LJJIFFI(AnonymousClass746.this.LJLILLLLZI.getReplyComments()) || (comment = (Comment) ListProtector.get(AnonymousClass746.this.LJLILLLLZI.getReplyComments(), 0)) == null) {
                    str = "";
                } else {
                    if (comment.getRelationLabel() != null) {
                        str2 = comment.getRelationLabel().getUserId();
                    }
                    str = comment.getUser().getSecUid();
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                ((CommentListFragment) AnonymousClass746.this.LLIL).Gn(str2, str);
            }
        };
        this.LLILIL = (TextView) view.findViewById(R.id.bmc);
        View mRootView = view.findViewById(R.id.bmd);
        view.findViewById(R.id.l8c);
        this.LLILL = (TextView) view.findViewById(R.id.bm6);
        view.findViewById(R.id.iw4);
        TextView textView = (TextView) view.findViewById(R.id.mgy);
        this.LLILLIZIL = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.mh4);
        this.LLILLJJLI = textView2;
        this.LLILLL = (TuxTextView) view.findViewById(R.id.blr);
        view.findViewById(R.id.iw3);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.hzt);
        this.LLILZ = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.fri);
        this.LLILZIL = tuxTextView2;
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.dv2);
        this.LLIZ = (TextView) view.findViewById(R.id.dv4);
        this.LLIZLLLIL = (SmartImageView) view.findViewById(R.id.dv3);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fqy);
        this.LLJ = frameLayout;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.fqz);
        Drawable LJIIIIZZ = C79045V0n.LJIIIIZZ(R.attr.l1, view.getContext());
        if (LJIIIIZZ != null) {
            tuxIconView.setImageDrawable(LJIIIIZZ);
        }
        if (this.LLIIJLIL) {
            this.LLJILJIL = new C76E(view, this.LJLLLLLL, this.LJLLLL, false, false);
            textView.setBackgroundResource(R.drawable.xn);
            textView.setTextColor(C79045V0n.LJI(R.attr.go, textView.getContext()).intValue());
        }
        C16880lQ.LJIILJJIL(frameLayout, new ACListenerS32S0101000_15(0, this, 12));
        C88463da.LIZ.LIZ(frameLayout, EnumC1796673i.BUTTON);
        view.setOnLongClickListener(new ViewOnClickListenerC1798273y(this));
        textView.setOnTouchListener(anonymousClass741);
        if (textView2 != null) {
            textView2.setOnTouchListener(anonymousClass741);
        }
        if (tuxTextView != null) {
            tuxTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X.74O
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1 || action == 3) {
                            C7FA.LIZ(view2, false);
                        }
                    } else {
                        C7FA.LIZ(view2, true);
                    }
                    return false;
                }
            });
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS21S0101000_2(0, this, 10));
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        tuxTextView2.setBackground(c110614Vt.LIZ(view.getContext()));
        C74J.LIZLLL(this.LJLJLJ);
        o.LJIIIZ(mRootView, "mRootView");
        ViewGroup.LayoutParams layoutParams = mRootView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
            int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
            int marginStart = marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = LJJIIZ;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = LJJIIZ2;
            mRootView.setLayoutParams(layoutParams);
            mRootView.setPaddingRelative(mRootView.getPaddingStart(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), mRootView.getPaddingEnd(), C7MY.LIZIZ(4));
            C74J.LJ(tuxTextView2);
            View view2 = this.LJLJI;
            o.LJIIIZ(view2, "view");
            view2.setPaddingRelative(view2.getPaddingStart(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), view2.getPaddingEnd(), C7MY.LIZIZ(8));
            if (C1803676a.LIZ()) {
                C74J.LIZ(this.LJLJLJ);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
