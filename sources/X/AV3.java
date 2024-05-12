package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.api.bean.NicknameStoreData;
import com.ss.android.ugc.aweme.profile.ui.multiaccount.ChooseAccountBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class AV3 {
    public static boolean LJ;
    public final Context LIZ;
    public final TuxTextView LIZIZ;
    public SpannableStringBuilder LIZJ;
    public int LIZLLL;

    public final void LIZIZ() {
        SY9 sy9;
        C8FR c8fr = null;
        if (this.LIZJ != null) {
            Context context = this.LIZ;
            if (context != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_chevron_down_fill;
                c2068389v.LIZIZ = C7MY.LIZIZ(14);
                c2068389v.LIZJ = C7MY.LIZIZ(14);
                c8fr = c2068389v.LIZIZ(2, context);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hideAlertBadge, downFillIconSpan: , titleSpan: ");
            LIZ.append((Object) this.LIZJ);
            C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ));
            if (c8fr != null) {
                C8FR.LIZJ(c8fr, C90193gN.LIZ(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, 4);
            }
            SpannableStringBuilder spannableStringBuilder = this.LIZJ;
            if (spannableStringBuilder != null) {
                spannableStringBuilder.setSpan(c8fr, 1, 2, 17);
            }
            this.LIZIZ.setText(this.LIZJ);
        } else {
            if (this.LIZ != null) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_chevron_down_fill;
                sy9 = c2068389v2.LIZ(this.LIZ);
            } else {
                sy9 = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("hideAlertBadge, drawableRes: , titleSpan: ");
            LIZ2.append((Object) this.LIZJ);
            C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ2));
            if (sy9 != null) {
                sy9.setBounds(0, 0, C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            }
            if (C90193gN.LIZ()) {
                this.LIZIZ.setCompoundDrawables(sy9, null, null, null);
            } else {
                this.LIZIZ.setCompoundDrawables(null, null, sy9, null);
            }
            this.LIZIZ.setCompoundDrawablePadding((int) KL2.LIZJ(this.LIZ, 2.0f));
        }
        LJ = false;
    }

    public final void LIZLLL() {
        if (this.LIZJ != null) {
            C72769ShB LIZ = LIZ(this.LIZLLL);
            if (LIZ != null) {
                C8FR c8fr = new C8FR(LIZ, 2);
                C8FR.LIZJ(c8fr, C90193gN.LIZ(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), 0, 4);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("showAlertBadge, badgeSpan: , titleSpan: ");
                LIZ2.append((Object) this.LIZJ);
                C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ2));
                SpannableStringBuilder spannableStringBuilder = this.LIZJ;
                if (spannableStringBuilder != null) {
                    spannableStringBuilder.setSpan(c8fr, 1, 2, 17);
                }
                this.LIZIZ.setText(this.LIZJ);
            }
        } else {
            C72769ShB LIZ3 = LIZ(this.LIZLLL);
            if (LIZ3 != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("showAlertBadge, alertBadgeDrawable: , titleSpan: ");
                LIZ4.append((Object) this.LIZJ);
                C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ4));
                if (C90193gN.LIZ()) {
                    this.LIZIZ.setCompoundDrawables(LIZ3, null, null, null);
                } else {
                    this.LIZIZ.setCompoundDrawables(null, null, LIZ3, null);
                }
                this.LIZIZ.setCompoundDrawablePadding((int) KL2.LIZJ(this.LIZ, 2.0f));
            }
        }
        LJ = true;
    }

    public final C72769ShB LIZ(int i) {
        Context context;
        TypedArray obtainStyledAttributes;
        String valueOf;
        C72769ShB c72769ShB = null;
        if (i > 0 && ((Boolean) C54305LSz.LIZIZ.getValue()).booleanValue() && (context = this.LIZ) != null && (obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.m_, R.attr.ma, R.attr.mb, R.attr.bq0, R.attr.bq1, R.attr.bq2, R.attr.bq6}, R.attr.jl, 0)) != null) {
            c72769ShB = new C72769ShB(obtainStyledAttributes.getInt(1, 0), obtainStyledAttributes.getColor(2, -1), obtainStyledAttributes.getColor(0, -16777216), obtainStyledAttributes.getDimensionPixelSize(4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))));
            obtainStyledAttributes.recycle();
            if (c72769ShB != null) {
                if (i > 9) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(9);
                    LIZ.append('+');
                    valueOf = X1D.LIZIZ(LIZ);
                } else {
                    valueOf = String.valueOf(i);
                }
                o.LJIIIZ(valueOf, "<set-?>");
                c72769ShB.LJFF = valueOf;
                c72769ShB.LIZ();
                c72769ShB.setBounds(0, 0, c72769ShB.LJ, c72769ShB.LIZLLL);
            }
        }
        return c72769ShB;
    }

    public final void LIZJ(boolean z) {
        int LJIJ;
        Boolean bool;
        NicknameStoreData LIZ;
        int LJFF = C54362LVe.LJFF();
        this.LIZLLL = LJFF;
        if (LJFF < 0) {
            if (C54305LSz.LIZIZ() && (LIZ = C54261LRh.LIZ()) != null && !LIZ.isPanelUnfold && LIZ.totalCount > 0) {
                LIZLLL();
                return;
            }
            return;
        }
        if (C54305LSz.LIZIZ()) {
            if (z) {
                NicknameStoreData LIZ2 = C54261LRh.LIZ();
                if (LIZ2 != null && !LIZ2.isPanelUnfold && LIZ2.totalCount > 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("refreshUI: bottom sheet is not unfold, show alert badge, count: ");
                    LIZ3.append(LIZ2.totalCount);
                    C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ3));
                    LIZLLL();
                    return;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("refreshUI: bottom sheet is unfold: ");
                Integer num = null;
                if (LIZ2 != null) {
                    bool = Boolean.valueOf(LIZ2.isPanelUnfold);
                } else {
                    bool = null;
                }
                LIZ4.append(bool);
                LIZ4.append(", hide alert badge, count: ");
                if (LIZ2 != null) {
                    num = Integer.valueOf(LIZ2.totalCount);
                }
                LIZ4.append(num);
                C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ4));
                LIZIZ();
                return;
            }
            if (ENR.LIZ()) {
                LJIJ = C54362LVe.LJIIIZ().LJIJI();
            } else {
                LJIJ = C54362LVe.LJIIL().LJIJ();
            }
            if (ChooseAccountBottomSheetFragment.LJLJJL) {
                LIZIZ();
                C54261LRh.LJ(true);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("bottom sheet is unfold, hide alert badge, last count: ");
                LIZ5.append(LJIJ);
                LIZ5.append(", new count: ");
                LIZ5.append(this.LIZLLL);
                C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ5));
                return;
            }
            NicknameStoreData LIZ6 = C54261LRh.LIZ();
            if (LIZ6 != null && LIZ6.isPanelUnfold) {
                if (this.LIZLLL > LJIJ) {
                    LIZLLL();
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("bottom sheet has been unfold, show alert badge, last count: ");
                    LIZ7.append(LJIJ);
                    LIZ7.append(", new count: ");
                    LIZ7.append(this.LIZLLL);
                    C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ7));
                    C54261LRh.LJ(false);
                    return;
                }
                LIZIZ();
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("bottom sheet has been unfold, hide alert badge, last count: ");
                LIZ8.append(LJIJ);
                LIZ8.append(", new count: ");
                LIZ8.append(this.LIZLLL);
                C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ8));
                return;
            }
            if (this.LIZLLL > 0) {
                LIZLLL();
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("bottom sheet is not unfold, show alert badge, last count: ");
                LIZ9.append(LJIJ);
                LIZ9.append("，new count: ");
                LIZ9.append(this.LIZLLL);
                C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ9));
                return;
            }
            LIZIZ();
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append("bottom sheet is not unfold, hide alert badge, last count: ");
            LIZ10.append(LJIJ);
            LIZ10.append(", new count: ");
            LIZ10.append(this.LIZLLL);
            C221018lt.LJFF("NBNicknameBPManager", X1D.LIZIZ(LIZ10));
            return;
        }
        if (this.LIZLLL > 0) {
            LIZLLL();
        } else {
            LIZIZ();
        }
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onAccountPanelUnfoldEvent(AV4 event) {
        o.LJIIIZ(event, "event");
        if (C54305LSz.LIZIZ()) {
            C221018lt.LJFF("NBNicknameBPManager", "account panel is unfold");
            C54261LRh.LJ(true);
            LIZIZ();
        }
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNicknameNoticeCountShowRefreshEvent(AV5 event) {
        o.LJIIIZ(event, "event");
        if (((Boolean) C54305LSz.LIZIZ.getValue()).booleanValue()) {
            if (HG3.LJIIIIZZ().isEnableMultiAccountLogin()) {
                LIZJ(false);
            } else {
                LIZIZ();
            }
        }
    }

    public AV3(Context context, TuxTextView nicknameView, SpannableStringBuilder spannableStringBuilder) {
        o.LJIIIZ(nicknameView, "nicknameView");
        this.LIZ = context;
        this.LIZIZ = nicknameView;
        this.LIZJ = spannableStringBuilder;
        EventBus.LIZJ().LJIILJJIL(this);
        this.LIZLLL = 0;
        LJ = false;
    }
}
