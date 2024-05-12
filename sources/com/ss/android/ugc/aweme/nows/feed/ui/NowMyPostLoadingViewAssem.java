package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC193947jK;
import X.AbstractC194637kR;
import X.C16880lQ;
import X.C181847Bs;
import X.C193907jG;
import X.C194157jf;
import X.C194237jn;
import X.C194437k7;
import X.C194617kP;
import X.C196227n0;
import X.C196237n1;
import X.C207768Dk;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C47704Ins;
import X.C55749LuL;
import X.C65314PkE;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8XO;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import X.X1D;
import Y.AUListenerS92S0100000_3;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowMyPostLoadingViewAssem extends ReusedUISlotAssem<NowMyPostLoadingViewAssem> implements C8XO<InterfaceC194547kI>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFF;
    public final C55749LuL LLFFF;
    public View LLFII;
    public C207768Dk LLFZ;
    public TuxTextView LLI;

    static {
        TBT tbt = new TBT(NowMyPostLoadingViewAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.by7;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowMyPostLoadingViewAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 603), null, C196237n1.INSTANCE, null, null);
        this.LLFFF = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
    }

    @Override // X.C8XO
    public final void F0(InterfaceC194547kI item) {
        C194617kP c194617kP;
        o.LJIIIZ(item, "item");
        if (o.LJ(((C181847Bs) this.LLFFF.getValue()).LJLIL, C194157jf.LIZ)) {
            AbstractC194637kR LJII = C65314PkE.LJII();
            if ((LJII instanceof C194617kP) && (c194617kP = (C194617kP) LJII) != null) {
                m4(c194617kP.LIZJ, false);
            }
        }
        C194237jn.LIZ(this, (NowPostCellViewModel) this.LLFF.LIZ(this, LLIFFJFJJ[0]));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Lifecycle lifecycle;
        o.LJIIIZ(view, "view");
        View containerView = getContainerView();
        this.LLFII = containerView;
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, containerView);
        View findViewById = view.findViewById(R.id.h71);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.now_loading_view)");
        this.LLFZ = (C207768Dk) findViewById;
        View findViewById2 = view.findViewById(R.id.h82);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.now_upload_percent)");
        this.LLI = (TuxTextView) findViewById2;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (lifecycle = LIZLLL.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.nows.feed.ui.NowMyPostLoadingViewAssem$onViewCreated$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        onStop();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                public final void onStop() {
                    C207768Dk c207768Dk = NowMyPostLoadingViewAssem.this.LLFZ;
                    if (c207768Dk != null) {
                        ValueAnimator valueAnimator = c207768Dk.LJLJJLL;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("myPostLoadingView");
                    throw null;
                }
            });
        }
        ((NowPostCellViewModel) this.LLFF.LIZ(this, LLIFFJFJJ[0])).hv0(this, C213688a4.LIZLLL());
        if (o.LJ(((C181847Bs) this.LLFFF.getValue()).LJLIL, C194157jf.LIZ)) {
            C65314PkE.LJIIJJI(this, false, C196227n0.LJLIL);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        if (nowPostCellState.LJLIL instanceof C193907jG) {
            View view = this.LLFII;
            if (view != null) {
                view.setVisibility(0);
                return;
            } else {
                o.LJIJI("myPostLoadingOverlay");
                throw null;
            }
        }
        View view2 = this.LLFII;
        if (view2 != null) {
            view2.setVisibility(8);
        } else {
            o.LJIJI("myPostLoadingOverlay");
            throw null;
        }
    }

    public final void m4(int i, boolean z) {
        ValueAnimator valueAnimator;
        C207768Dk c207768Dk = this.LLFZ;
        if (c207768Dk != null) {
            float f = (i * 1.0f) / 100;
            if (c207768Dk.LJLL != f && f >= 0.0f && f <= 1.0f) {
                c207768Dk.LJLL = f;
                if (z) {
                    ValueAnimator valueAnimator2 = c207768Dk.LJLJJLL;
                    if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = c207768Dk.LJLJJLL) != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimator3 = c207768Dk.LJLJJLL;
                    if (valueAnimator3 != null) {
                        valueAnimator3.removeAllUpdateListeners();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(c207768Dk.LJLJL, c207768Dk.LJLL);
                    ofFloat.addUpdateListener(new AUListenerS92S0100000_3(c207768Dk, 39));
                    ofFloat.setDuration(Math.abs(c207768Dk.LJLL - c207768Dk.LJLJL) * ((float) 2000));
                    ofFloat.setInterpolator(new LinearInterpolator());
                    c207768Dk.LJLJJLL = ofFloat;
                    ofFloat.start();
                } else {
                    c207768Dk.LJLJL = f;
                    c207768Dk.invalidate();
                }
            }
            TuxTextView tuxTextView = this.LLI;
            if (tuxTextView != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append('%');
                tuxTextView.setText(X1D.LIZIZ(LIZ));
                return;
            }
            o.LJIJI("myPostLoadingPercentView");
            throw null;
        }
        o.LJIJI("myPostLoadingView");
        throw null;
    }
}
