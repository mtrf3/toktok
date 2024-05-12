package X;

import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS110S0200000_5;
import Y.IDCListenerS298S0100000_5;
import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveLongPressCommentAvatarSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class CUG extends CUH<CQO<? extends CR6>, CSG<CQO<? extends CR6>>> implements InterfaceC31293CPx {
    public final C74074T5i LLD;
    public final C47061t0 LLF;
    public final C74074T5i LLFF;
    public CharSequence LLFFF;

    @Override // X.CUH
    public final String a0() {
        return "report_user";
    }

    @Override // X.CUH
    public final C74074T5i V() {
        return this.LLD;
    }

    @Override // X.CUH
    public final View X() {
        return this.LLFF;
    }

    public final void f0(CSG<CQO<? extends CR6>> pinnedPublicScreenMessageModel) {
        o.LJIIIZ(pinnedPublicScreenMessageModel, "pinnedPublicScreenMessageModel");
        c0(pinnedPublicScreenMessageModel);
        T().LIZIZ().LJIILLIIL();
        if (pinnedPublicScreenMessageModel.LIZLLL == 1) {
            if (!pinnedPublicScreenMessageModel.LJIIIZ.LIZJ) {
                pinnedPublicScreenMessageModel.LJ = true;
                Y().LJI();
                C74074T5i c74074T5i = this.LLD;
                SpannableString spannableString = new SpannableString(" ￼");
                spannableString.setSpan(new C31465CWn(Y().LIZIZ()), 1, 2, 33);
                c74074T5i.setSuffix(spannableString);
                CS6 cs6 = pinnedPublicScreenMessageModel.LJIIIZ;
                if (cs6.LJ && cs6.LIZ() > 0) {
                    C74074T5i c74074T5i2 = this.LLD;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LLD.getSuffix());
                    spannableStringBuilder.append(' ');
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((char) 65532);
                    spannableStringBuilder.setSpan(new C31465CWn(P().LIZIZ()), length, spannableStringBuilder.length(), 33);
                    c74074T5i2.setSuffix(spannableStringBuilder);
                    P().LJI();
                    return;
                }
                return;
            }
            C74074T5i c74074T5i3 = this.LLD;
            SpannableString spannableString2 = new SpannableString(" ￼");
            spannableString2.setSpan(new C31465CWn(Q().LIZIZ()), 1, 2, 33);
            c74074T5i3.setSuffix(spannableString2);
            Q().LJI();
            T().LJIIIIZZ();
            return;
        }
        CS6 cs62 = pinnedPublicScreenMessageModel.LJIIIZ;
        if (!cs62.LIZJ) {
            if (!pinnedPublicScreenMessageModel.LJ) {
                pinnedPublicScreenMessageModel.LJ = true;
                if (cs62.LJ) {
                    P().LIZIZ().LJJL = 0;
                    P().LIZIZ().LIZIZ = 0;
                    C74074T5i c74074T5i4 = this.LLD;
                    SpannableString spannableString3 = new SpannableString(" ￼");
                    spannableString3.setSpan(new C31465CWn(Q().LIZIZ()), 1, 2, 33);
                    c74074T5i4.setSuffix(spannableString3);
                    Q().LJIIIZ(new CUI(pinnedPublicScreenMessageModel, this));
                } else {
                    P().LJI();
                    Y().LJI();
                    C74074T5i c74074T5i5 = this.LLD;
                    SpannableString spannableString4 = new SpannableString(" ￼");
                    spannableString4.setSpan(new C31465CWn(Y().LIZIZ()), 1, 2, 33);
                    c74074T5i5.setSuffix(spannableString4);
                }
            } else {
                P().LJI();
                Y().LJI();
                C74074T5i c74074T5i6 = this.LLD;
                SpannableString spannableString5 = new SpannableString(" ￼");
                spannableString5.setSpan(new C31465CWn(Y().LIZIZ()), 1, 2, 33);
                c74074T5i6.setSuffix(spannableString5);
            }
            CS6 cs63 = pinnedPublicScreenMessageModel.LJIIIZ;
            if (!cs63.LJ || cs63.LIZ() <= 0) {
                return;
            }
            C74074T5i c74074T5i7 = this.LLD;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.LLD.getSuffix());
            spannableStringBuilder2.append(' ');
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((char) 65532);
            spannableStringBuilder2.setSpan(new C31465CWn(P().LIZIZ()), length2, spannableStringBuilder2.length(), 33);
            c74074T5i7.setSuffix(spannableStringBuilder2);
            return;
        }
        C74074T5i c74074T5i8 = this.LLD;
        SpannableString spannableString6 = new SpannableString(" ￼");
        spannableString6.setSpan(new C31465CWn(Q().LIZIZ()), 1, 2, 33);
        c74074T5i8.setSuffix(spannableString6);
        T().LJIIIIZZ();
    }

    @Override // X.InterfaceC31293CPx
    public final void LJLIL(Bitmap bitmap, CQO<? extends CR6> cqo) {
        Spannable spannable;
        if (bitmap == null || cqo == null) {
            return;
        }
        int LJJLIIJ = s.LJJLIIJ(String.valueOf(this.LLFFF), " . ", 6);
        if (LJJLIIJ != -1) {
            CharSequence charSequence = this.LLFFF;
            if ((charSequence instanceof Spannable) && (spannable = (Spannable) charSequence) != null) {
                CXJ.LIZ(spannable, bitmap, LJJLIIJ + 1, LJJLIIJ + 2, cqo);
            }
        }
        C74074T5i c74074T5i = this.LLD;
        CharSequence charSequence2 = this.LLFFF;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        c74074T5i.setOriginText(charSequence2);
        this.LLD.setText(this.LLFFF);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    @Override // X.CUH, X.CUL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(X.CSH r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CUG.M(X.CSH, java.util.List):void");
    }

    public CUG(View view, CQQ cqq, boolean z) {
        super(view, cqq);
        View findViewById = view.findViewById(R.id.text);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.text)");
        C74074T5i c74074T5i = (C74074T5i) findViewById;
        this.LLD = c74074T5i;
        View findViewById2 = view.findViewById(R.id.ecz);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.icon_view)");
        C47061t0 c47061t0 = (C47061t0) findViewById2;
        this.LLF = c47061t0;
        this.LLFF = c74074T5i;
        C6H.LIZ(new ACListenerS25S0100000_5(this, 459), c47061t0);
        if (LiveLongPressCommentAvatarSetting.INSTANCE.getEnableLongPress()) {
            c47061t0.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 14));
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "comment";
        CSJ csj = new CSJ();
        csj.LJII = new CSO(c68322mC);
        c74074T5i.setMovementMethod(csj);
        c74074T5i.setOnLongClickListener(new IDCListenerS110S0200000_5(this, c68322mC, 2));
        Q().LJII(new CUT(this));
        P().LJII(new CUY(this));
        if (!z) {
            C16300kU.LJIILLIIL(view, C04270Et.LIZIZ(view.getContext(), R.drawable.cj4));
        }
    }
}
