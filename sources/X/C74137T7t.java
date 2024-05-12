package X;

import Y.ACListenerS32S0100000_12;
import Y.ACListenerS37S0300000_12;
import Y.AUListenerS93S0100000_4;
import Y.IDObjectS122S0200000_12;
import Y.IDTListenerS120S0100000_12;
import android.content.Context;
import android.text.Editable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qnasearch.vm.QnaSearchViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T7t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74137T7t {
    public QnaSearchViewModel LIZ;
    public C74136T7s LIZIZ;
    public RecyclerView LIZJ;
    public ConstraintLayout LIZLLL;
    public AnonymousClass972 LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;

    public final void LJ() {
        Editable text;
        QnaSearchViewModel qnaSearchViewModel;
        if (this.LJII) {
            this.LJII = false;
            this.LJI = String.valueOf(System.currentTimeMillis());
        }
        T5T LIZIZ = LIZIZ(this.LIZLLL);
        if (LIZIZ == null || (text = LIZIZ.getText()) == null || text.length() == 0 || (qnaSearchViewModel = this.LIZ) == null) {
            return;
        }
        qnaSearchViewModel.LJLILLLLZI.setValue(new C74100T6i<>(qnaSearchViewModel.LJLIL.LIZIZ(true)));
    }

    public static T5T LIZIZ(ConstraintLayout constraintLayout) {
        if (constraintLayout != null) {
            return (T5T) constraintLayout.findViewById(R.id.ihx);
        }
        return null;
    }

    public static String LIZJ(ConstraintLayout constraintLayout) {
        Editable text;
        T5T LIZIZ = LIZIZ(constraintLayout);
        if (LIZIZ != null && (text = LIZIZ.getText()) != null) {
            return text.toString();
        }
        return null;
    }

    public final void LIZ(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        TuxTextView tuxTextView;
        if (this.LJ == null && constraintLayout != null && (constraintLayout2 = (ConstraintLayout) constraintLayout.findViewById(R.id.ihi)) != null && constraintLayout != null && (tuxTextView = (TuxTextView) constraintLayout.findViewById(R.id.ihw)) != null) {
            this.LJ = new AnonymousClass972(constraintLayout2, tuxTextView);
        }
        AnonymousClass972 anonymousClass972 = this.LJ;
        if (anonymousClass972 != null) {
            anonymousClass972.LIZIZ.addUpdateListener(new AUListenerS93S0100000_4(anonymousClass972, 52));
            anonymousClass972.LIZIZ.setDuration(175L);
            anonymousClass972.LIZIZ.start();
        }
        T5T LIZIZ = LIZIZ(constraintLayout);
        if (LIZIZ != null) {
            LIZIZ.requestFocus();
            KeyboardUtils.LIZJ(LIZIZ);
        }
    }

    public final void LIZLLL(C74102T6k c74102T6k, LG1 lg1, ViewModelStoreOwner viewModelStoreOwner, Context context, MIL mil, LifecycleOwner lifecycleOwner, QnaBannerViewModel qnaBannerVM, float f) {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData mutableLiveData6;
        MutableLiveData mutableLiveData7;
        MutableLiveData mutableLiveData8;
        MutableLiveData mutableLiveData9;
        MutableLiveData mutableLiveData10;
        MutableLiveData mutableLiveData11;
        FrameLayout frameLayout;
        View findViewById;
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        o.LJIIIZ(qnaBannerVM, "qnaBannerVM");
        if (mil != MIL.FYP_BANNER) {
            InterfaceC72761Sh3.LIZ.getClass();
            ViewGroup.LayoutParams layoutParams = null;
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C63072dj(null), 3);
            this.LIZLLL = (ConstraintLayout) lg1.findViewById(R.id.ii5);
            this.LIZ = (QnaSearchViewModel) new ViewModelProvider(viewModelStoreOwner, new KKO()).get(QnaSearchViewModel.class);
            QnaSearchViewModel qnaSearchViewModel = this.LIZ;
            o.LJII(qnaSearchViewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qnasearch.vm.QnaSearchDelegate");
            this.LIZIZ = new C74136T7s(c74102T6k, qnaSearchViewModel);
            RecyclerView recyclerView = (RecyclerView) lg1.findViewById(R.id.ktl);
            this.LIZJ = recyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.LIZIZ);
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            RecyclerView recyclerView2 = this.LIZJ;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView3 = this.LIZJ;
            if (recyclerView3 != null) {
                recyclerView3.setItemAnimator(null);
            }
            ConstraintLayout constraintLayout = this.LIZLLL;
            if (constraintLayout != null) {
                frameLayout = (FrameLayout) constraintLayout.findViewById(R.id.ktg);
            } else {
                frameLayout = null;
            }
            QnaSearchViewModel qnaSearchViewModel2 = this.LIZ;
            if (!(qnaSearchViewModel2 instanceof T8G)) {
                qnaSearchViewModel2 = null;
            }
            RecyclerView recyclerView4 = this.LIZJ;
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c9q, frameLayout, true);
            if (C99W.LIZ && frameLayout != null && (findViewById = frameLayout.findViewById(R.id.ihi)) != null) {
                findViewById.setBackground(context.getDrawable(R.drawable.c15));
            }
            int applyDimension = (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = applyDimension;
            frameLayout.setLayoutParams(marginLayoutParams);
            C16880lQ.LJIILJJIL(frameLayout, T8S.LJLIL);
            T5T t5t = (T5T) frameLayout.findViewById(R.id.ihx);
            View findViewById2 = frameLayout.findViewById(R.id.ihz);
            View findViewById3 = frameLayout.findViewById(R.id.ii0);
            View findViewById4 = frameLayout.findViewById(R.id.ihw);
            if (t5t != null) {
                t5t.addTextChangedListener(new IDObjectS122S0200000_12(findViewById2, qnaSearchViewModel2, 1));
                t5t.setOnEditorActionListener(new T85(qnaSearchViewModel2));
            }
            if (findViewById3 != null) {
                C16880lQ.LJIIJ(new ACListenerS37S0300000_12(qnaSearchViewModel2, t5t, findViewById2, 9), findViewById3);
            }
            if (findViewById4 != null) {
                C16880lQ.LJIIJ(new ACListenerS32S0100000_12(qnaSearchViewModel2, 167), findViewById4);
            }
            if (recyclerView4 != null) {
                recyclerView4.setOnTouchListener(new IDTListenerS120S0100000_12(t5t, 11));
            }
        }
        QnaSearchViewModel qnaSearchViewModel3 = this.LIZ;
        if (qnaSearchViewModel3 != null && (mutableLiveData11 = qnaSearchViewModel3.LJLJI) != null) {
            mutableLiveData11.observe(lifecycleOwner, new C74101T6j(new AqS143S0200000_12(this, qnaBannerVM, LiveTryModeCountDownThresholdSetting.DEFAULT)));
        }
        QnaSearchViewModel qnaSearchViewModel4 = this.LIZ;
        if (qnaSearchViewModel4 != null && (mutableLiveData10 = qnaSearchViewModel4.LJLLLLLL) != null) {
            mutableLiveData10.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 545)));
        }
        QnaSearchViewModel qnaSearchViewModel5 = this.LIZ;
        if (qnaSearchViewModel5 != null && (mutableLiveData9 = qnaSearchViewModel5.LJLZ) != null) {
            mutableLiveData9.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 546)));
        }
        QnaSearchViewModel qnaSearchViewModel6 = this.LIZ;
        if (qnaSearchViewModel6 != null && (mutableLiveData8 = qnaSearchViewModel6.LJLJLLL) != null) {
            mutableLiveData8.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 547)));
        }
        QnaSearchViewModel qnaSearchViewModel7 = this.LIZ;
        if (qnaSearchViewModel7 != null && (mutableLiveData7 = qnaSearchViewModel7.LJLLI) != null) {
            mutableLiveData7.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 548)));
        }
        QnaSearchViewModel qnaSearchViewModel8 = this.LIZ;
        if (qnaSearchViewModel8 != null && (mutableLiveData6 = qnaSearchViewModel8.LJZ) != null) {
            mutableLiveData6.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 549)));
        }
        QnaSearchViewModel qnaSearchViewModel9 = this.LIZ;
        if (qnaSearchViewModel9 != null && (mutableLiveData5 = qnaSearchViewModel9.LJLJJL) != null) {
            mutableLiveData5.observe(lifecycleOwner, new C74101T6j(new AqS143S0200000_12(this, qnaBannerVM, 121)));
        }
        QnaSearchViewModel qnaSearchViewModel10 = this.LIZ;
        if (qnaSearchViewModel10 != null && (mutableLiveData4 = qnaSearchViewModel10.LJLJL) != null) {
            mutableLiveData4.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 540)));
        }
        QnaSearchViewModel qnaSearchViewModel11 = this.LIZ;
        if (qnaSearchViewModel11 != null && (mutableLiveData3 = qnaSearchViewModel11.LJZI) != null) {
            mutableLiveData3.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 541)));
        }
        QnaSearchViewModel qnaSearchViewModel12 = this.LIZ;
        if (qnaSearchViewModel12 != null && (mutableLiveData2 = qnaSearchViewModel12.LJLLJ) != null) {
            mutableLiveData2.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 543)));
        }
        QnaSearchViewModel qnaSearchViewModel13 = this.LIZ;
        if (qnaSearchViewModel13 != null && (mutableLiveData = qnaSearchViewModel13.LJLLLL) != null) {
            mutableLiveData.observe(lifecycleOwner, new C74101T6j(new AqS178S0100000_12(this, 544)));
        }
    }
}
