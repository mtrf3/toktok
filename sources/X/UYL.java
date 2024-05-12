package X;

import android.view.ViewGroup;
import com.bytedance.android.live.rank.impl.list.RankLeagueListDialog;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UYL implements InterfaceC80659Vl9 {
    public final /* synthetic */ RankLeagueListDialog LIZ;

    @Override // X.InterfaceC80659Vl9
    public final void LIZ() {
    }

    @Override // X.InterfaceC80659Vl9
    public final void LIZJ(C80654Vl4 c80654Vl4) {
    }

    public UYL(RankLeagueListDialog rankLeagueListDialog) {
        this.LIZ = rankLeagueListDialog;
    }

    @Override // X.InterfaceC80659Vl9
    public final void LIZIZ(C80654Vl4 c80654Vl4) {
        Integer num;
        if (c80654Vl4 != null) {
            num = Integer.valueOf(c80654Vl4.LIZLLL);
        } else {
            num = null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            RankLeagueListDialog rankLeagueListDialog = this.LIZ;
            C47121t6 c47121t6 = rankLeagueListDialog.LJLLILLLL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
            C47121t6 c47121t62 = rankLeagueListDialog.LJLLL;
            if (c47121t62 != null) {
                c47121t62.setVisibility(0);
            }
            C47121t6 c47121t63 = rankLeagueListDialog.LJLLJ;
            if (c47121t63 != null) {
                c47121t63.setVisibility(0);
            }
            C47121t6 c47121t64 = rankLeagueListDialog.LJLLJ;
            if (c47121t64 != null) {
                ViewGroup.LayoutParams layoutParams = c47121t64.getLayoutParams();
                if (layoutParams != null) {
                    C018905p c018905p = (C018905p) layoutParams;
                    C47121t6 c47121t65 = rankLeagueListDialog.LJLLL;
                    if (c47121t65 != null) {
                        c018905p.endToStart = c47121t65.getId();
                        c018905p.startToEnd = -1;
                    }
                    c018905p.setMarginEnd(C15380j0.LIZ(2.0f));
                    c47121t64.setLayoutParams(c018905p);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            C47121t6 c47121t66 = rankLeagueListDialog.LJLLLL;
            if (c47121t66 != null) {
                c47121t66.setVisibility(0);
            }
            C47121t6 c47121t67 = rankLeagueListDialog.LJLLLLLL;
            if (c47121t67 != null) {
                c47121t67.setVisibility(8);
            }
            C47121t6 c47121t68 = rankLeagueListDialog.LJLZ;
            if (c47121t68 != null) {
                c47121t68.setVisibility(8);
            }
            C23010vJ.LIZLLL(rankLeagueListDialog.LJZ, 3, 700);
            C23010vJ.LIZLLL(rankLeagueListDialog.LJZI, 6, 600);
            C23010vJ.LIZLLL(rankLeagueListDialog.LJZL, 6, 600);
            C47121t6 c47121t69 = rankLeagueListDialog.LJZ;
            if (c47121t69 != null) {
                c47121t69.setTextSize(14.0f);
                c47121t69.setTextColor(C04330Ez.LIZIZ(c47121t69.getContext(), R.color.ck));
                c47121t69.setAlpha(1.0f);
                ViewGroup.LayoutParams layoutParams2 = c47121t69.getLayoutParams();
                if (layoutParams2 != null) {
                    C018905p c018905p2 = (C018905p) layoutParams2;
                    C47121t6 c47121t610 = rankLeagueListDialog.LJLLLL;
                    if (c47121t610 != null) {
                        c018905p2.topToTop = c47121t610.getId();
                        c018905p2.bottomToBottom = c47121t610.getId();
                        c018905p2.startToStart = c47121t610.getId();
                        c018905p2.endToEnd = c47121t610.getId();
                    }
                    c47121t69.setLayoutParams(c018905p2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            C47121t6 c47121t611 = rankLeagueListDialog.LJZI;
            if (c47121t611 != null) {
                c47121t611.setTextColor(C04330Ez.LIZIZ(c47121t611.getContext(), R.color.bc));
                c47121t611.setAlpha(0.8f);
                ViewGroup.LayoutParams layoutParams3 = c47121t611.getLayoutParams();
                if (layoutParams3 != null) {
                    C018905p c018905p3 = (C018905p) layoutParams3;
                    C47121t6 c47121t612 = rankLeagueListDialog.LJLLJ;
                    if (c47121t612 != null) {
                        c018905p3.topToTop = c47121t612.getId();
                        c018905p3.bottomToBottom = c47121t612.getId();
                        c018905p3.startToStart = c47121t612.getId();
                        c018905p3.endToEnd = c47121t612.getId();
                    }
                    c47121t611.setLayoutParams(c018905p3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            C47121t6 c47121t613 = rankLeagueListDialog.LJZL;
            if (c47121t613 == null) {
                return;
            }
            c47121t613.setTextColor(C04330Ez.LIZIZ(c47121t613.getContext(), R.color.bc));
            c47121t613.setAlpha(0.8f);
            ViewGroup.LayoutParams layoutParams4 = c47121t613.getLayoutParams();
            if (layoutParams4 != null) {
                C018905p c018905p4 = (C018905p) layoutParams4;
                C47121t6 c47121t614 = rankLeagueListDialog.LJLLL;
                if (c47121t614 != null) {
                    c018905p4.topToTop = c47121t614.getId();
                    c018905p4.bottomToBottom = c47121t614.getId();
                    c018905p4.startToStart = c47121t614.getId();
                    c018905p4.endToEnd = c47121t614.getId();
                }
                c47121t613.setLayoutParams(c018905p4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        if (num.intValue() == 1) {
            RankLeagueListDialog rankLeagueListDialog2 = this.LIZ;
            C47121t6 c47121t615 = rankLeagueListDialog2.LJLLILLLL;
            if (c47121t615 != null) {
                c47121t615.setVisibility(0);
            }
            C47121t6 c47121t616 = rankLeagueListDialog2.LJLLJ;
            if (c47121t616 != null) {
                c47121t616.setVisibility(8);
            }
            C47121t6 c47121t617 = rankLeagueListDialog2.LJLLL;
            if (c47121t617 != null) {
                c47121t617.setVisibility(0);
            }
            C47121t6 c47121t618 = rankLeagueListDialog2.LJLLLL;
            if (c47121t618 != null) {
                c47121t618.setVisibility(8);
            }
            C47121t6 c47121t619 = rankLeagueListDialog2.LJLLLLLL;
            if (c47121t619 != null) {
                c47121t619.setVisibility(0);
            }
            C47121t6 c47121t620 = rankLeagueListDialog2.LJLZ;
            if (c47121t620 != null) {
                c47121t620.setVisibility(8);
            }
            C23010vJ.LIZLLL(rankLeagueListDialog2.LJZ, 6, 600);
            C23010vJ.LIZLLL(rankLeagueListDialog2.LJZI, 3, 700);
            C23010vJ.LIZLLL(rankLeagueListDialog2.LJZL, 6, 600);
            C47121t6 c47121t621 = rankLeagueListDialog2.LJZ;
            if (c47121t621 != null) {
                c47121t621.setTextColor(C04330Ez.LIZIZ(c47121t621.getContext(), R.color.bc));
                c47121t621.setAlpha(0.8f);
                ViewGroup.LayoutParams layoutParams5 = c47121t621.getLayoutParams();
                if (layoutParams5 != null) {
                    C018905p c018905p5 = (C018905p) layoutParams5;
                    C47121t6 c47121t622 = rankLeagueListDialog2.LJLLILLLL;
                    if (c47121t622 != null) {
                        c018905p5.topToTop = c47121t622.getId();
                        c018905p5.bottomToBottom = c47121t622.getId();
                        c018905p5.startToStart = c47121t622.getId();
                        c018905p5.endToEnd = c47121t622.getId();
                    }
                    c47121t621.setLayoutParams(c018905p5);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            C47121t6 c47121t623 = rankLeagueListDialog2.LJZI;
            if (c47121t623 != null) {
                c47121t623.setTextSize(14.0f);
                c47121t623.setTextColor(C04330Ez.LIZIZ(c47121t623.getContext(), R.color.ck));
                c47121t623.setAlpha(1.0f);
                ViewGroup.LayoutParams layoutParams6 = c47121t623.getLayoutParams();
                if (layoutParams6 != null) {
                    C018905p c018905p6 = (C018905p) layoutParams6;
                    C47121t6 c47121t624 = rankLeagueListDialog2.LJLLLLLL;
                    if (c47121t624 != null) {
                        c018905p6.topToTop = c47121t624.getId();
                        c018905p6.bottomToBottom = c47121t624.getId();
                        c018905p6.startToStart = c47121t624.getId();
                        c018905p6.endToEnd = c47121t624.getId();
                    }
                    c47121t623.setLayoutParams(c018905p6);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            C47121t6 c47121t625 = rankLeagueListDialog2.LJZL;
            if (c47121t625 == null) {
                return;
            }
            c47121t625.setTextColor(C04330Ez.LIZIZ(c47121t625.getContext(), R.color.bc));
            c47121t625.setAlpha(0.8f);
            ViewGroup.LayoutParams layoutParams7 = c47121t625.getLayoutParams();
            if (layoutParams7 != null) {
                C018905p c018905p7 = (C018905p) layoutParams7;
                C47121t6 c47121t626 = rankLeagueListDialog2.LJLLL;
                if (c47121t626 != null) {
                    c018905p7.topToTop = c47121t626.getId();
                    c018905p7.bottomToBottom = c47121t626.getId();
                    c018905p7.startToStart = c47121t626.getId();
                    c018905p7.endToEnd = c47121t626.getId();
                }
                c47121t625.setLayoutParams(c018905p7);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        if (num.intValue() != 2) {
            return;
        }
        RankLeagueListDialog rankLeagueListDialog3 = this.LIZ;
        C47121t6 c47121t627 = rankLeagueListDialog3.LJLLILLLL;
        if (c47121t627 != null) {
            c47121t627.setVisibility(0);
        }
        C47121t6 c47121t628 = rankLeagueListDialog3.LJLLJ;
        if (c47121t628 != null) {
            c47121t628.setVisibility(0);
        }
        C47121t6 c47121t629 = rankLeagueListDialog3.LJLLJ;
        if (c47121t629 != null) {
            ViewGroup.LayoutParams layoutParams8 = c47121t629.getLayoutParams();
            if (layoutParams8 != null) {
                C018905p c018905p8 = (C018905p) layoutParams8;
                C47121t6 c47121t630 = rankLeagueListDialog3.LJLLILLLL;
                if (c47121t630 != null) {
                    c018905p8.startToEnd = c47121t630.getId();
                    c018905p8.endToStart = -1;
                }
                c018905p8.setMarginStart(C15380j0.LIZ(2.0f));
                c47121t629.setLayoutParams(c018905p8);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        C47121t6 c47121t631 = rankLeagueListDialog3.LJLLL;
        if (c47121t631 != null) {
            c47121t631.setVisibility(8);
        }
        C47121t6 c47121t632 = rankLeagueListDialog3.LJLLLL;
        if (c47121t632 != null) {
            c47121t632.setVisibility(8);
        }
        C47121t6 c47121t633 = rankLeagueListDialog3.LJLLLLLL;
        if (c47121t633 != null) {
            c47121t633.setVisibility(8);
        }
        C47121t6 c47121t634 = rankLeagueListDialog3.LJLZ;
        if (c47121t634 != null) {
            c47121t634.setVisibility(0);
        }
        C23010vJ.LIZLLL(rankLeagueListDialog3.LJZ, 6, 600);
        C23010vJ.LIZLLL(rankLeagueListDialog3.LJZI, 6, 600);
        C23010vJ.LIZLLL(rankLeagueListDialog3.LJZL, 3, 700);
        C47121t6 c47121t635 = rankLeagueListDialog3.LJZ;
        if (c47121t635 != null) {
            c47121t635.setTextColor(C04330Ez.LIZIZ(c47121t635.getContext(), R.color.bc));
            c47121t635.setAlpha(0.8f);
            ViewGroup.LayoutParams layoutParams9 = c47121t635.getLayoutParams();
            if (layoutParams9 != null) {
                C018905p c018905p9 = (C018905p) layoutParams9;
                C47121t6 c47121t636 = rankLeagueListDialog3.LJLLILLLL;
                if (c47121t636 != null) {
                    c018905p9.topToTop = c47121t636.getId();
                    c018905p9.bottomToBottom = c47121t636.getId();
                    c018905p9.startToStart = c47121t636.getId();
                    c018905p9.endToEnd = c47121t636.getId();
                }
                c47121t635.setLayoutParams(c018905p9);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        C47121t6 c47121t637 = rankLeagueListDialog3.LJZI;
        if (c47121t637 != null) {
            c47121t637.setTextColor(C04330Ez.LIZIZ(c47121t637.getContext(), R.color.bc));
            c47121t637.setAlpha(0.8f);
            ViewGroup.LayoutParams layoutParams10 = c47121t637.getLayoutParams();
            if (layoutParams10 != null) {
                C018905p c018905p10 = (C018905p) layoutParams10;
                C47121t6 c47121t638 = rankLeagueListDialog3.LJLLJ;
                if (c47121t638 != null) {
                    c018905p10.topToTop = c47121t638.getId();
                    c018905p10.bottomToBottom = c47121t638.getId();
                    c018905p10.startToStart = c47121t638.getId();
                    c018905p10.endToEnd = c47121t638.getId();
                }
                c47121t637.setLayoutParams(c018905p10);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        C47121t6 c47121t639 = rankLeagueListDialog3.LJZL;
        if (c47121t639 == null) {
            return;
        }
        c47121t639.setTextSize(14.0f);
        c47121t639.setTextColor(C04330Ez.LIZIZ(c47121t639.getContext(), R.color.ck));
        c47121t639.setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams11 = c47121t639.getLayoutParams();
        if (layoutParams11 != null) {
            C018905p c018905p11 = (C018905p) layoutParams11;
            C47121t6 c47121t640 = rankLeagueListDialog3.LJLZ;
            if (c47121t640 != null) {
                c018905p11.topToTop = c47121t640.getId();
                c018905p11.bottomToBottom = c47121t640.getId();
                c018905p11.startToStart = c47121t640.getId();
                c018905p11.endToEnd = c47121t640.getId();
            }
            c47121t639.setLayoutParams(c018905p11);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
