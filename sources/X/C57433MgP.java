package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MgP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57433MgP extends AbstractC57431MgN {
    public final C57446Mgc LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public C7YX LJLLLL;

    @Override // X.InterfaceC57449Mgf
    public final void LIZIZ() {
        NextLiveData<RelationStatus> nextLiveData;
        LiveEventObserver<RelationStatus> liveEventObserver = this.LJLJJLL;
        if (liveEventObserver != null && (nextLiveData = liveEventObserver.LJLIL) != null) {
            nextLiveData.removeObserver(liveEventObserver);
        }
    }

    @Override // X.AbstractC57431MgN
    public final void LJII() {
        this.LJLLILLLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 185)));
    }

    @Override // X.AbstractC57431MgN
    public final void LJIILIIL() {
        this.LJLJJLL = RelationDataSource.INSTANCE.get().subscribe(LJ(), this);
        LJI().LJLJI.observe(LJ(), this.LJLJLJ);
    }

    public final TuxTextView LJIILJJIL() {
        return (TuxTextView) this.LJLLL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57433MgP(C57446Mgc relationTextView) {
        super(relationTextView);
        o.LJIIIZ(relationTextView, "relationTextView");
        this.LJLLILLLL = relationTextView;
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 814));
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 815));
    }

    @Override // X.AbstractC57431MgN
    public final boolean LJIIIZ(int i) {
        boolean LJIIIZ = super.LJIIIZ(i);
        if (C6ZT.LIZIZ(this.LJLLILLLL, 300L)) {
            return false;
        }
        return LJIIIZ;
    }

    @Override // X.AbstractC57431MgN, X.InterfaceC57449Mgf
    public final void LJJJJJL(C57438MgU c57438MgU) {
        NextLiveData<RelationStatus> nextLiveData;
        if (!(c57438MgU instanceof C7YX)) {
            return;
        }
        LiveEventObserver<RelationStatus> liveEventObserver = this.LJLJJLL;
        if (liveEventObserver != null && (nextLiveData = liveEventObserver.LJLIL) != null) {
            nextLiveData.removeObserver(liveEventObserver);
        }
        this.LJLLLL = (C7YX) c57438MgU;
        super.LJJJJJL(c57438MgU);
    }

    @Override // X.AbstractC57431MgN
    public final void LJIIJJI(int i, Integer num) {
        EnumC57119MbL enumC57119MbL;
        int i2;
        java.util.Map<Boolean, Integer> map;
        Integer num2;
        java.util.Map<Boolean, Integer> map2;
        Integer num3;
        EnumC57435MgR enumC57435MgR = EnumC57435MgR.UNFOLLOW;
        if (i == enumC57435MgR.getValue()) {
            int value = enumC57435MgR.getValue();
            if (num != null && num.intValue() == value) {
                i = EnumC57435MgR.UNFOLLOW_BUT_BE_FOLLOWED.getValue();
            }
        }
        C7YX c7yx = this.LJLLLL;
        if (c7yx == null || (enumC57119MbL = c7yx.LIZLLL) == null) {
            return;
        }
        int i3 = C57120MbM.LIZ[enumC57119MbL.ordinal()];
        boolean z = true;
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            C7YX c7yx2 = this.LJLLLL;
            int i4 = 72;
            if (c7yx2 != null && (map2 = c7yx2.LJFF) != null && (num3 = map2.get(Boolean.TRUE)) != null) {
                i2 = num3.intValue();
            } else {
                i2 = 72;
            }
            C7YX c7yx3 = this.LJLLLL;
            if (c7yx3 != null && (map = c7yx3.LJFF) != null && (num2 = map.get(Boolean.FALSE)) != null) {
                i4 = num2.intValue();
            }
            if (C57434MgQ.LIZ.contains(Integer.valueOf(i))) {
                TuxTextView tuxTextView = (TuxTextView) this.LJLLJ.getValue();
                tuxTextView.setText("+");
                tuxTextView.setTextColor(tuxTextView.getResources().getColor(R.color.c0));
                tuxTextView.setTuxFont(i2);
                TuxTextView prefixNormalStyle$lambda$5 = LJIILJJIL();
                o.LJIIIIZZ(prefixNormalStyle$lambda$5, "prefixNormalStyle$lambda$5");
                C26338AVi.LJI(prefixNormalStyle$lambda$5, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3))), null, null, null, false, 30);
                prefixNormalStyle$lambda$5.setTextColor(prefixNormalStyle$lambda$5.getResources().getColor(R.color.c0));
                prefixNormalStyle$lambda$5.setTuxFont(i2);
                this.LJLLILLLL.setClickable(true);
                return;
            }
            if (!C57434MgQ.LIZIZ.contains(Integer.valueOf(i))) {
                return;
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.LJLLJ.getValue();
            tuxTextView2.setText("·");
            tuxTextView2.setTextColor(tuxTextView2.getResources().getColor(R.color.cu));
            tuxTextView2.setTuxFont(i4);
            TuxTextView prefixNormalStyle$lambda$7 = LJIILJJIL();
            o.LJIIIIZZ(prefixNormalStyle$lambda$7, "prefixNormalStyle$lambda$7");
            C26338AVi.LJI(prefixNormalStyle$lambda$7, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, null, false, 30);
            prefixNormalStyle$lambda$7.setTextColor(prefixNormalStyle$lambda$7.getResources().getColor(R.color.cu));
            prefixNormalStyle$lambda$7.setTuxFont(i4);
            C57446Mgc c57446Mgc = this.LJLLILLLL;
            C7YX c7yx4 = this.LJLLLL;
            if (c7yx4 == null || !c7yx4.LJ) {
                z = false;
            }
            c57446Mgc.setClickable(z);
            return;
        }
        ((View) this.LJLLJ.getValue()).setVisibility(8);
        if (C57434MgQ.LIZ.contains(Integer.valueOf(i))) {
            TuxTextView LJIILJJIL = LJIILJJIL();
            LJIILJJIL.setTextColor(LJIILJJIL.getResources().getColor(R.color.c0));
        } else {
            if (!C57434MgQ.LIZIZ.contains(Integer.valueOf(i))) {
                return;
            }
            TuxTextView LJIILJJIL2 = LJIILJJIL();
            LJIILJJIL2.setTextColor(LJIILJJIL2.getResources().getColor(R.color.cu));
        }
    }

    @Override // X.AbstractC57431MgN
    public final void LJIIL(int i, Integer num, String str) {
        if (o.LJ(HG3.LJIILL().getCurUserId(), str) || i == EnumC57435MgR.SAME_USER.getValue()) {
            this.LJLLILLLL.setVisibility(8);
            this.LJLJLLL = true;
            return;
        }
        if (this.LJLJLLL) {
            this.LJLLILLLL.setVisibility(0);
            this.LJLJLLL = false;
        }
        TuxTextView LJIILJJIL = LJIILJJIL();
        if (!this.LJLL) {
            str = null;
        }
        LJIILJJIL.setText(LIZLLL(i, num, null, str));
    }
}
