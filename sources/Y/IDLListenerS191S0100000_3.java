package Y;

import X.AbstractC48820JEa;
import X.C1795973b;
import X.C47959Irz;
import X.C51029K0z;
import X.C71Y;
import X.C78886Uxe;
import X.C79V;
import X.C86670Xzu;
import X.X1D;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.feed.assem.caption.PlaceHolderCaptionAssem;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeInteractEntrancesContainer;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.assem.list.cell.assem.MineMusicCellAssem;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDLListenerS191S0100000_3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            case 7:
                onGlobalLayout$7(this);
                return;
            case 8:
                onGlobalLayout$8(this);
                return;
            case 9:
                onGlobalLayout$9(this);
                return;
            case 10:
                onGlobalLayout$10(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        int i;
        Integer o4;
        LandscapeInteractEntrancesContainer landscapeInteractEntrancesContainer = (LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0;
        landscapeInteractEntrancesContainer.LLIIII = -1;
        landscapeInteractEntrancesContainer.LLIIIJ = "";
        if (landscapeInteractEntrancesContainer.p4() != null) {
            InteractBizTopAreaAttachAbility p4 = ((LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0).p4();
            if (p4 != null) {
                p4.rB(((LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0).LLIILZL);
            }
            InteractBizTopAreaAttachAbility p42 = ((LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0).p4();
            if (p42 != null) {
                p42.nf0(((LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0).LLIILZL);
            }
        } else {
            AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) ((LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0).LLFFF.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("trigger position update bizTopAbility fallback ");
            LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL((LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0)).getAweme().getAid());
            abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ));
            LandscapeInteractEntrancesContainer landscapeInteractEntrancesContainer2 = (LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0;
            RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) landscapeInteractEntrancesContainer2.LLFII.getValue();
            if (rootCellCommonAbility != null && (o4 = rootCellCommonAbility.o4()) != null) {
                i = o4.intValue();
            } else {
                i = 0;
            }
            landscapeInteractEntrancesContainer2.n4(i);
        }
        RootCellCommonAbility rootCellCommonAbility2 = (RootCellCommonAbility) ((LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0).LLFII.getValue();
        if (rootCellCommonAbility2 != null) {
            rootCellCommonAbility2.u0(iDLListenerS191S0100000_3);
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        KeyboardUtils.AndroidBug5497Workaround androidBug5497Workaround = (KeyboardUtils.AndroidBug5497Workaround) iDLListenerS191S0100000_3.l0;
        if (androidBug5497Workaround.LJLILLLLZI == null || androidBug5497Workaround.LJLJI == null) {
            return;
        }
        androidBug5497Workaround.LJLILLLLZI.getWindowVisibleDisplayFrame(new Rect());
        if (r1.bottom < androidBug5497Workaround.LJLILLLLZI.getHeight() * 0.75d) {
            androidBug5497Workaround.LJLJI.onShow();
        } else {
            androidBug5497Workaround.LJLJI.onHide();
        }
    }

    public static final void onGlobalLayout$10(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        ViewTreeObserver viewTreeObserver = ((C1795973b) iDLListenerS191S0100000_3.l0).LJLJJL.getViewTreeObserver();
        if (((C1795973b) iDLListenerS191S0100000_3.l0).LJLJJL.getWidth() != 0) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS191S0100000_3);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" flow.finalLines: ");
            LIZ.append(((C1795973b) iDLListenerS191S0100000_3.l0).LJLJJL.getFinalLines());
            LIZ.append("  childViewCount ");
            LIZ.append(((C1795973b) iDLListenerS191S0100000_3.l0).LJLJJL.getChildCount());
            LIZ.append("  flow.firstLineCount ");
            LIZ.append(((C1795973b) iDLListenerS191S0100000_3.l0).LJLJJL.getFirstLineCount());
            C71Y.LIZLLL("CommentMultiAnchorTag", X1D.LIZIZ(LIZ));
            if (((C1795973b) iDLListenerS191S0100000_3.l0).LJLJJL.getChildCount() > ((C1795973b) iDLListenerS191S0100000_3.l0).LJLJJL.getFirstLineCount()) {
                C78886Uxe.LJJLIIIJJI(((C1795973b) iDLListenerS191S0100000_3.l0).LJLILLLLZI);
                ((C1795973b) iDLListenerS191S0100000_3.l0).LIZ(!r1.LJLJJLL);
                return;
            }
            C78886Uxe.LJJLIIIJILLIZJL(((C1795973b) iDLListenerS191S0100000_3.l0).LJLILLLLZI);
        }
    }

    public static final void onGlobalLayout$2(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        Rect rect = new Rect();
        ((View) iDLListenerS191S0100000_3.l0).getWindowVisibleDisplayFrame(rect);
        int i = ((View) iDLListenerS191S0100000_3.l0).getContext().getResources().getDisplayMetrics().heightPixels;
        int i2 = rect.bottom;
        if (i < i2) {
            i = i2;
        }
        int i3 = i - i2;
        if (i3 != 0) {
            int LIZJ = C47959Irz.LIZJ(28, i3);
            if (((View) iDLListenerS191S0100000_3.l0).getPaddingBottom() != LIZJ) {
                ((View) iDLListenerS191S0100000_3.l0).setPadding(0, 0, 0, LIZJ);
                return;
            }
            return;
        }
        if (((View) iDLListenerS191S0100000_3.l0).getPaddingBottom() == 0) {
            return;
        }
        ((View) iDLListenerS191S0100000_3.l0).setPadding(0, 0, 0, 0);
    }

    public static final void onGlobalLayout$3(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        int i;
        BubbleListAssem bubbleListAssem = (BubbleListAssem) iDLListenerS191S0100000_3.l0;
        View view = bubbleListAssem.LLFF;
        if (view == null) {
            return;
        }
        int i2 = 0;
        if (bubbleListAssem.LLFII == bubbleListAssem.b4(view)) {
            BubbleListAssem bubbleListAssem2 = (BubbleListAssem) iDLListenerS191S0100000_3.l0;
            int i3 = bubbleListAssem2.LLFZ;
            View view2 = bubbleListAssem2.LLFFF;
            if (view2 != null) {
                i = view2.getMeasuredHeight();
            } else {
                i = 0;
            }
            if (i3 == i) {
                return;
            }
        }
        ((BubbleListAssem) iDLListenerS191S0100000_3.l0).c4(view);
        BubbleListAssem bubbleListAssem3 = (BubbleListAssem) iDLListenerS191S0100000_3.l0;
        bubbleListAssem3.LLFII = bubbleListAssem3.b4(view);
        BubbleListAssem bubbleListAssem4 = (BubbleListAssem) iDLListenerS191S0100000_3.l0;
        View view3 = bubbleListAssem4.LLFFF;
        if (view3 != null) {
            i2 = view3.getMeasuredHeight();
        }
        bubbleListAssem4.LLFZ = i2;
    }

    public static final void onGlobalLayout$4(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        int b4 = ((PlaceHolderCaptionAssem) iDLListenerS191S0100000_3.l0).b4();
        PlaceHolderCaptionAssem placeHolderCaptionAssem = (PlaceHolderCaptionAssem) iDLListenerS191S0100000_3.l0;
        if (b4 != placeHolderCaptionAssem.LL) {
            placeHolderCaptionAssem.Xw(placeHolderCaptionAssem.b4());
            PlaceHolderCaptionAssem placeHolderCaptionAssem2 = (PlaceHolderCaptionAssem) iDLListenerS191S0100000_3.l0;
            placeHolderCaptionAssem2.LL = placeHolderCaptionAssem2.b4();
        }
    }

    public static final void onGlobalLayout$5(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        Integer o4;
        int i;
        RelativeLayout.LayoutParams layoutParams;
        LandscapeInteractEntrancesContainer landscapeInteractEntrancesContainer = (LandscapeInteractEntrancesContainer) iDLListenerS191S0100000_3.l0;
        InteractBizTopAreaAttachAbility p4 = landscapeInteractEntrancesContainer.p4();
        if (p4 != null) {
            int Xj = p4.Xj();
            RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) landscapeInteractEntrancesContainer.LLFII.getValue();
            if (rootCellCommonAbility != null && (o4 = rootCellCommonAbility.o4()) != null) {
                int intValue = o4.intValue();
                if (landscapeInteractEntrancesContainer.LLIIII == Xj && intValue == landscapeInteractEntrancesContainer.LLIIIILZ) {
                    return;
                }
                landscapeInteractEntrancesContainer.LLIIII = Xj;
                landscapeInteractEntrancesContainer.LLIIIILZ = intValue;
                if (C86670Xzu.LJJIFFI(((VideoItemParams) C51029K0z.LJIILLIIL(landscapeInteractEntrancesContainer)).getAweme())) {
                    i = landscapeInteractEntrancesContainer.LLIIIZ;
                } else {
                    i = landscapeInteractEntrancesContainer.LLIIJI;
                }
                if ((Xj - i) - landscapeInteractEntrancesContainer.LLIIL > landscapeInteractEntrancesContainer.LLIIJLIL + intValue) {
                    landscapeInteractEntrancesContainer.n4(intValue);
                    return;
                }
                View view = landscapeInteractEntrancesContainer.LLII;
                if (view == null) {
                    return;
                }
                if (o.LJ(landscapeInteractEntrancesContainer.LLIIIJ, "align_caption")) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null && layoutParams.bottomMargin == i) {
                        return;
                    }
                }
                landscapeInteractEntrancesContainer.LLIIIJ = "align_caption";
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.removeRule(10);
                layoutParams4.topMargin = 0;
                InteractBizTopAreaAttachAbility p42 = landscapeInteractEntrancesContainer.p4();
                if (p42 != null) {
                    p42.AL(layoutParams4);
                }
                layoutParams4.bottomMargin = i;
                view.setLayoutParams(layoutParams4);
            }
        }
    }

    public static final void onGlobalLayout$6(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        Rect rect = new Rect();
        ((View) iDLListenerS191S0100000_3.l0).getWindowVisibleDisplayFrame(rect);
        int i = ((View) iDLListenerS191S0100000_3.l0).getContext().getResources().getDisplayMetrics().heightPixels;
        int i2 = rect.bottom;
        if (i < i2) {
            i = i2;
        }
        int i3 = i - i2;
        if (i3 != 0) {
            int LIZJ = C47959Irz.LIZJ(28, i3);
            if (((View) iDLListenerS191S0100000_3.l0).getPaddingBottom() != LIZJ) {
                ((View) iDLListenerS191S0100000_3.l0).setPadding(0, 0, 0, LIZJ);
                return;
            }
            return;
        }
        if (((View) iDLListenerS191S0100000_3.l0).getPaddingBottom() == 0) {
            return;
        }
        ((View) iDLListenerS191S0100000_3.l0).setPadding(0, 0, 0, 0);
    }

    public static final void onGlobalLayout$7(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        ((MineMusicCellAssem) iDLListenerS191S0100000_3.l0).getContainerView().findViewById(R.id.g3r).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS191S0100000_3);
        int width = ((MineMusicCellAssem) iDLListenerS191S0100000_3.l0).getContainerView().findViewById(R.id.g3r).getWidth();
        int width2 = ((MineMusicCellAssem) iDLListenerS191S0100000_3.l0).getContainerView().findViewById(R.id.m5x).getWidth();
        if (((MineMusicCellAssem) iDLListenerS191S0100000_3.l0).getContainerView().findViewById(R.id.g3s).getWidth() + width2 > width) {
            int i = width - width2;
            if (i < 0) {
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams = ((MineMusicCellAssem) iDLListenerS191S0100000_3.l0).getContainerView().findViewById(R.id.g3s).getLayoutParams();
            if (layoutParams != null) {
                MineMusicCellAssem mineMusicCellAssem = (MineMusicCellAssem) iDLListenerS191S0100000_3.l0;
                layoutParams.width = i;
                mineMusicCellAssem.getContainerView().findViewById(R.id.g3s).setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (kotlin.jvm.internal.o.LJIIJJI(r1, r0) <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
    
        r0 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
    
        if (kotlin.jvm.internal.o.LJIIJJI(r1, r0) <= 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onGlobalLayout$8(Y.IDLListenerS191S0100000_3 r6) {
        /*
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell r0 = (com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell) r0
            X.Nfs r0 = r0.LJLJJL
            if (r0 == 0) goto L7f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L7f
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell r0 = (com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell) r0
            android.view.View r5 = r0.itemView
            int r4 = r5.getPaddingLeft()
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell r0 = (com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell) r0
            android.view.View r0 = r0.itemView
            int r3 = r0.getPaddingTop()
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell r2 = (com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell) r2
            com.bytedance.tux.input.TuxTextView r0 = r2.LJLILLLLZI
            if (r0 == 0) goto L45
            int r1 = r0.getWidth()
            com.bytedance.tux.input.TuxTextView r0 = r2.LJLJI
            if (r0 == 0) goto Laf
            int r0 = r0.getWidth()
        L36:
            int r1 = r1 + r0
            X.Nfs r0 = r2.LJLJJL
            if (r0 == 0) goto Lad
            int r0 = r0.getWidth()
        L3f:
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r1, r0)
            if (r0 > 0) goto Laa
        L45:
            X.7Yg r0 = r2.LJLJJI
            if (r0 == 0) goto L5b
            int r1 = r0.getWidth()
            X.Nfs r0 = r2.LJLJJL
            if (r0 == 0) goto La8
            int r0 = r0.getWidth()
        L55:
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r1, r0)
            if (r0 > 0) goto Laa
        L5b:
            r0 = 20
        L5d:
            int r2 = X.C7MY.LIZIZ(r0)
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell r1 = (com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell) r1
            X.5F1 r0 = r1.LJLJJLL
            if (r0 == 0) goto L8f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8f
        L6f:
            r0 = 4
        L70:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r5.setPadding(r4, r3, r2, r0)
        L7f:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell r0 = (com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell) r0
            android.view.View r0 = r0.itemView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L8e
            r0.removeOnGlobalLayoutListener(r6)
        L8e:
            return
        L8f:
            X.7BR r0 = r1.LJLJLJ
            if (r0 == 0) goto L9a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L9a
            goto L6f
        L9a:
            X.7G0 r0 = r1.LJLJLLL
            if (r0 == 0) goto La5
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La5
            goto L6f
        La5:
            r0 = 8
            goto L70
        La8:
            r0 = 0
            goto L55
        Laa:
            r0 = 16
            goto L5d
        Lad:
            r0 = 0
            goto L3f
        Laf:
            r0 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDLListenerS191S0100000_3.onGlobalLayout$8(Y.IDLListenerS191S0100000_3):void");
    }

    public static final void onGlobalLayout$9(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        View view;
        View view2;
        C79V c79v = (C79V) iDLListenerS191S0100000_3.l0;
        int i = 0;
        RecyclerView.ViewHolder LJJJ = c79v.LJJJ(0, false);
        RecyclerView.ViewHolder LJJJ2 = c79v.LJJJ(1, false);
        if (LJJJ != null && LJJJ2 != null && (LJJJ2 instanceof ReactionBubbleDescriptionCell) && (view = LJJJ.itemView) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i2 = c79v.LLLIIIL - C79V.LLLJ;
            if (LJJJ2 != null && (view2 = LJJJ2.itemView) != null) {
                i = view2.getMeasuredHeight();
            }
            int i3 = i2 - i;
            if (i3 != layoutParams.height && i3 >= 0) {
                layoutParams.height = i3;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public IDLListenerS191S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
