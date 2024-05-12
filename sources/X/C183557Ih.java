package X;

import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183557Ih {
    public final FrameLayout LIZ;
    public final UpvoteListViewModelNew LIZIZ;
    public final C7JQ LIZJ;
    public final C183907Jq LIZLLL;
    public final C7JP LJ;
    public int LJFF;
    public boolean LJI;
    public String LJII;
    public InterfaceC88475Ynv<? super View, ? super Integer, ? super Integer, ? super UpvoteStruct, ? super String, C76800UCe> LJIIIIZZ;
    public Animator LJIIIZ;
    public AnimatorSet LJIIJ;
    public InterfaceC88471Ynr<? super Integer, ? super UpvoteStruct, C76800UCe> LJIIJJI;

    public final void LIZIZ() {
        AnimatorSet animatorSet;
        Animator animator;
        Animator animator2 = this.LJIIIZ;
        if (animator2 != null && animator2.isRunning() && (animator = this.LJIIIZ) != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIIJ;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LJIIJ) != null) {
            animatorSet.cancel();
        }
    }

    public final void LIZLLL() {
        C7JP c7jp = this.LJ;
        if (c7jp != null) {
            if (2 != c7jp.getWhiteBarStyle()) {
                c7jp.getTouchArea().setBackground(c7jp.getWhiteBarBG());
                c7jp.LJJLJLI(R.raw.icon_plus_small, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                TuxTextView upvoteTV = c7jp.getUpvoteTV();
                C72062SPy c72062SPy = new C72062SPy();
                String string = c7jp.getContext().getString(R.string.q3z);
                o.LJIIIIZZ(string, "context.getString(R.stri…ost_v2_guide_add_comment)");
                c72062SPy.LIZIZ = string;
                c72062SPy.LIZ = false;
                c72062SPy.LJ(1);
                c72062SPy.LIZIZ(62);
                Context context = c7jp.getContext();
                o.LJIIIIZZ(context, "context");
                upvoteTV.setText(c72062SPy.LIZ(context));
                C26338AVi.LJIIIZ(c7jp.getTouchArea(), AnonymousClass391.LIZJ(4), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7))), null, 26);
                C26338AVi.LJI(c7jp.getUpvoteTV(), null, AnonymousClass391.LIZJ(5), null, AnonymousClass391.LIZJ(7), false, 21);
                c7jp.getUpvoteTV().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                c7jp.setWhiteBarStyle(2);
            }
            LIZJ(this.LJ);
            this.LJFF = c7jp.getWhiteBarStyle();
        }
    }

    public final void LJ() {
        LIZIZ();
        C7JQ c7jq = this.LIZJ;
        if (c7jq != null) {
            c7jq.setVisibility(8);
        }
        C7JP c7jp = this.LJ;
        if (c7jp != null) {
            c7jp.setVisibility(8);
        }
        UpvoteListViewModelNew upvoteListViewModelNew = this.LIZIZ;
        this.LJII = upvoteListViewModelNew.LJLJI;
        if (upvoteListViewModelNew.LJ()) {
            C183907Jq c183907Jq = this.LIZLLL;
            if (c183907Jq == null) {
                return;
            }
            c183907Jq.setVisibility(8);
            return;
        }
        UpvoteList value = this.LIZIZ.LIZJ().getValue();
        if (value == null) {
            return;
        }
        C183907Jq c183907Jq2 = this.LIZLLL;
        if (c183907Jq2 != null) {
            LIZ(value, c183907Jq2, false);
            this.LJFF = c183907Jq2.getWhiteBarStyle();
            InterfaceC88471Ynr<? super Integer, ? super UpvoteStruct, C76800UCe> interfaceC88471Ynr = this.LJIIJJI;
            if (interfaceC88471Ynr != null) {
                Integer valueOf = Integer.valueOf(c183907Jq2.getWhiteBarStyle());
                Object tag = c183907Jq2.getTag();
                if (!(tag instanceof UpvoteStruct)) {
                    tag = null;
                }
                interfaceC88471Ynr.invoke(valueOf, tag);
            }
        }
        int i = this.LJFF;
        if (i != 3 && i != 4) {
            Animator LIZ = C183967Jw.LIZ(this.LIZLLL, null, null);
            this.LJIIIZ = LIZ;
            LIZ.start();
            return;
        }
        C183907Jq c183907Jq3 = this.LIZLLL;
        if (c183907Jq3 != null) {
            c183907Jq3.setAlpha(1.0f);
        }
        C183907Jq c183907Jq4 = this.LIZLLL;
        if (c183907Jq4 == null) {
            return;
        }
        c183907Jq4.setVisibility(0);
    }

    public final void LIZJ(AbstractC183947Ju abstractC183947Ju) {
        int i;
        View touchArea;
        View touchArea2;
        View touchArea3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append(" handleWhiteBarClick: whiteBar: ");
        if (abstractC183947Ju != null) {
            i = abstractC183947Ju.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(", style: ");
        Integer num = null;
        if (abstractC183947Ju != null) {
            num = Integer.valueOf(abstractC183947Ju.getWhiteBarStyle());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        C7JQ c7jq = this.LIZJ;
        if (c7jq != null && (touchArea3 = c7jq.getTouchArea()) != null) {
            touchArea3.setClickable(false);
        }
        C183907Jq c183907Jq = this.LIZLLL;
        if (c183907Jq != null && (touchArea2 = c183907Jq.getTouchArea()) != null) {
            touchArea2.setClickable(false);
        }
        C7JP c7jp = this.LJ;
        if (c7jp != null && (touchArea = c7jp.getTouchArea()) != null) {
            touchArea.setClickable(false);
        }
        if (abstractC183947Ju != null) {
            int whiteBarStyle = abstractC183947Ju.getWhiteBarStyle();
            if (whiteBarStyle != 1) {
                if (whiteBarStyle != 2) {
                    if (whiteBarStyle != 3) {
                        if (whiteBarStyle == 4) {
                            C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, abstractC183947Ju, 50), abstractC183947Ju.getTouchArea());
                        }
                    } else {
                        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 176), abstractC183947Ju.getTouchArea());
                    }
                } else {
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 175), abstractC183947Ju.getTouchArea());
                }
            } else {
                C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 174), abstractC183947Ju.getTouchArea());
            }
            abstractC183947Ju.getTouchArea().setClickable(true);
        }
    }

    public C183557Ih(FrameLayout frameLayout, UpvoteListViewModelNew vm) {
        C7JQ c7jq;
        C183907Jq c183907Jq;
        o.LJIIIZ(vm, "vm");
        this.LIZ = frameLayout;
        this.LIZIZ = vm;
        if (frameLayout != null) {
            c7jq = (C7JQ) frameLayout.findViewById(R.id.nhj);
        } else {
            c7jq = null;
        }
        this.LIZJ = c7jq;
        if (frameLayout != null) {
            c183907Jq = (C183907Jq) frameLayout.findViewById(R.id.nhk);
        } else {
            c183907Jq = null;
        }
        this.LIZLLL = c183907Jq;
        this.LJ = frameLayout != null ? (C7JP) frameLayout.findViewById(R.id.nhi) : null;
    }

    public final void LIZ(UpvoteList upvoteList, C183907Jq c183907Jq, boolean z) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append(" resetWhiteBarView: aid: ");
        LIZ.append(this.LIZIZ.LJLJI);
        LIZ.append(", targetWhiteBar: ");
        C183907Jq c183907Jq2 = this.LIZLLL;
        if (c183907Jq2 != null) {
            i = c183907Jq2.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        if (z && this.LJFF == 4) {
            UpvoteStruct LJIIIIZZ = C1FP.LJIIIIZZ(upvoteList);
            if (LJIIIIZZ != null) {
                C183907Jq c183907Jq3 = this.LIZLLL;
                if (c183907Jq3 != null) {
                    c183907Jq3.LJJZZI(1L, C47261Igj.LJJIJ(LJIIIIZZ));
                }
                this.LJI = true;
            }
        } else {
            C183907Jq c183907Jq4 = this.LIZLLL;
            if (c183907Jq4 != null) {
                c183907Jq4.LJJZZI(upvoteList.getTotal(), upvoteList.getUpvotes());
            }
            this.LJI = false;
        }
        LIZJ(c183907Jq);
    }
}
