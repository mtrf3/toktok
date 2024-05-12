package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.AbstractC85571XiB;
import X.ActivityC86117Xqz;
import X.AnonymousClass636;
import X.AnonymousClass806;
import X.C018905p;
import X.C16880lQ;
import X.C26338AVi;
import X.C32151Nz;
import X.C65429Pm5;
import X.C79045V0n;
import X.C85539Xhf;
import X.C85557Xhx;
import X.C85558Xhy;
import X.C85565Xi5;
import X.C85575XiF;
import X.InterfaceC85586XiQ;
import X.O6R;
import X.ORZ;
import X.R6A;
import X.T5S;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import Y.ARunnableS32S0200000_13;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.IDaS470S0100000_12;
import o3.h0;
import ujb.s;

/* loaded from: classes16.dex */
public final class ViewPagerLoginView extends AbstractC85571XiB {
    public final R6A LJIILJJIL;
    public final boolean LJIILL;

    public final int LJIIJ() {
        InterfaceC85586XiQ interfaceC85586XiQ = this.LIZ;
        o.LJII(interfaceC85586XiQ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.auth.factory.ViewPagerSignupManager");
        return Math.min(((C85575XiF) interfaceC85586XiQ).LJIILIIL(this.LJIILL), this.LIZLLL.size());
    }

    public final SpannableStringBuilder LJIIIZ(int i, int i2) {
        String string = this.LIZIZ.getString(i2);
        o.LJIIIIZZ(string, "activity.getString(rightRes)");
        String string2 = this.LIZIZ.getString(i, string);
        o.LJIIIIZZ(string2, "activity.getString(leftRes, rightString)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
        if (LJJLIIIJL >= 0) {
            final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, this.LIZIZ);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(LJIIIIZZ) { // from class: com.ss.android.ugc.aweme.account.login.auth.ui.login.ViewPagerLoginView$getBottomText$1
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    o.LJIIIZ(textPaint, "textPaint");
                    super.updateDrawState(textPaint);
                    T5S t5s = new T5S();
                    t5s.LIZ(82);
                    textPaint.setTypeface(t5s.getTypeface());
                }
            }, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerLoginView(C85575XiF c85575XiF, I18nSignUpActivity i18nSignUpActivity, ActivityC86117Xqz activityC86117Xqz, View view, boolean z, List list) {
        super(c85575XiF, activityC86117Xqz, view, list);
        C85575XiF c85575XiF2;
        o.LJIIIZ(view, "view");
        this.LJIILJJIL = i18nSignUpActivity;
        this.LJIILL = z;
        super.LJII();
        List LLJILJILJ = ORZ.LLJILJILJ(this.LIZLLL.subList(0, LJIIJ()));
        this.LJIIJ = new C85539Xhf(ORZ.LLJILJILJ(LLJILJILJ), LJIIJ(), z, LIZJ());
        IPrevLoginPlatformService LJIIL = PrevLoginPlatformService.LJIIL();
        AObserverS83S0100000_15 aObserverS83S0100000_15 = new AObserverS83S0100000_15(this, 75);
        LJIIL.getPlatform().observe(this.LIZIZ, aObserverS83S0100000_15);
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS32S0200000_13(LJIIL, aObserverS83S0100000_15, 54), 500L);
        LIZIZ().setAdapter(LIZ());
        int size = this.LIZLLL.size();
        InterfaceC85586XiQ interfaceC85586XiQ = this.LIZ;
        o.LJII(interfaceC85586XiQ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.auth.factory.ViewPagerSignupManager");
        if (size > ((C85575XiF) interfaceC85586XiQ).LJIILIIL(z)) {
            if (LIZJ().gv0()) {
                ((ArrayList) LLJILJILJ).add(C85558Xhy.LJIIJ);
            } else {
                ((ArrayList) LLJILJILJ).add(C85557Xhx.LJIIJ);
            }
            InterfaceC85586XiQ interfaceC85586XiQ2 = this.LIZ;
            if ((interfaceC85586XiQ2 instanceof C85575XiF) && (c85575XiF2 = (C85575XiF) interfaceC85586XiQ2) != null) {
                c85575XiF2.LJII.put(Integer.valueOf(c85575XiF2.LJI.getCurrentItem()), Boolean.FALSE);
            }
        }
        TuxTextView LJFF = LJFF();
        TuxTextView LJ = LJ();
        if (LIZJ().gv0()) {
            LJFF = LJ();
            TuxTextView LJ2 = LJ();
            LJ2.setTuxFont(42);
            LJ2.setTextColorRes(R.attr.go);
            C26338AVi.LJIIIZ(LJ2, 0, C65429Pm5.LIZIZ(12.0f), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(25.0f)))), 16);
            LJ2.setVisibility(0);
            LJ = LJFF();
            TuxTextView LJFF2 = LJFF();
            if (LJFF2.getLayoutParams() instanceof C018905p) {
                LJFF2.setTuxFont(71);
                ViewGroup.LayoutParams layoutParams = LJFF2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                C26338AVi.LJIIIZ(LJFF2, C65429Pm5.LIZIZ(32.0f), C65429Pm5.LIZIZ(16.0f), C65429Pm5.LIZIZ(32.0f), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(16.0f)))), 16);
                LJFF2.setTextColorRes(R.attr.gx);
                LJFF2.setVisibility(0);
            }
        }
        LJFF.setOnTouchListener(new AnonymousClass806(0.5f));
        if (z) {
            LJFF.setText(LJIIIZ(R.string.dq7, R.string.dq8));
            C16880lQ.LJJJJI(LJFF, new ACListenerS35S0100000_15(this, 156));
        } else {
            LJ.setVisibility(0);
            LIZIZ().setLayoutManager(new LinearLayoutManager());
            C16880lQ.LJJJJI(LJFF, new ACListenerS35S0100000_15(this, 157));
            LJFF.setText(LJIIIZ(R.string.doi, R.string.doj));
            this.LIZJ.setBackground(C79045V0n.LJIIIIZZ(R.attr.cl, this.LIZIZ));
        }
        h0.LJIJI(LJFF, new IDaS470S0100000_12(this, 2));
        LJI();
        LIZ().LJLJJL = new C85565Xi5(this);
        C85539Xhf LIZ = LIZ();
        LIZ.LJLIL.clear();
        LIZ.LJLIL.addAll(LLJILJILJ);
        LIZ.LJLILLLLZI = LIZ.LJLIL.size();
        LIZ.notifyDataSetChanged();
    }
}
