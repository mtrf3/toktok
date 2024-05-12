package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LHy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54018LHy extends C54006LHm {
    public TuxTextView LIZJ;
    public TuxTextView LIZLLL;
    public boolean LJ;

    @Override // X.C54006LHm, X.InterfaceC54017LHx
    public final void V6() {
        this.LJ = false;
        TuxTextView tuxTextView = this.LIZJ;
        if (tuxTextView != null) {
            C78996UzQ.LJJ(tuxTextView);
        }
    }

    @Override // X.C54006LHm, X.InterfaceC54017LHx
    public final void W6() {
        TuxTextView tuxTextView;
        int i;
        View view;
        ViewStub viewStub;
        this.LJ = true;
        if (this.LIZJ == null) {
            ViewGroup.LayoutParams layoutParams = null;
            TuxTextView tuxTextView2 = null;
            if (C35138Dqg.LIZ()) {
                View LIZJ = LIZJ();
                if (LIZJ != null && (viewStub = (ViewStub) LIZJ.findViewById(R.id.mmg)) != null) {
                    view = viewStub.inflate();
                } else {
                    view = null;
                }
                if (view instanceof TuxTextView) {
                    tuxTextView2 = (TuxTextView) view;
                }
                this.LIZJ = tuxTextView2;
            } else {
                View LIZJ2 = LIZJ();
                if (LIZJ2 != null) {
                    tuxTextView = (TuxTextView) LIZJ2.findViewById(R.id.g0i);
                } else {
                    tuxTextView = null;
                }
                this.LIZJ = tuxTextView;
                if (tuxTextView != null) {
                    tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(536870912, LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(536870912, LiveLayoutPreloadThreadPriority.DEFAULT));
                }
                TuxTextView tuxTextView3 = this.LIZJ;
                if (tuxTextView3 != null) {
                    i = tuxTextView3.getMeasuredWidth();
                } else {
                    i = 0;
                }
                TuxTextView tuxTextView4 = this.LIZJ;
                if (tuxTextView4 != null) {
                    layoutParams = tuxTextView4.getLayoutParams();
                }
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i2 = -i;
                    if (!SearchServiceImpl.LLLZI().LJJJI()) {
                        i2 = C47135Ieh.LIZ(2, i2);
                    }
                    marginLayoutParams.setMarginStart(i2);
                }
                TuxTextView tuxTextView5 = this.LIZJ;
                if (tuxTextView5 != null) {
                    tuxTextView5.setLayoutParams(layoutParams);
                }
            }
        }
        TuxTextView tuxTextView6 = this.LIZJ;
        if (tuxTextView6 != null) {
            C78996UzQ.LJJJJL(tuxTextView6);
        }
    }

    @Override // X.C54006LHm
    public final TuxTextView LIZIZ() {
        KeyEvent.Callback callback;
        ViewStub viewStub;
        if (this.LIZLLL == null) {
            TuxTextView tuxTextView = null;
            if (C35138Dqg.LIZ()) {
                View LIZJ = LIZJ();
                if (LIZJ != null && (viewStub = (ViewStub) LIZJ.findViewById(R.id.mmf)) != null) {
                    callback = viewStub.inflate();
                } else {
                    callback = null;
                }
                if (callback instanceof TuxTextView) {
                    tuxTextView = (TuxTextView) callback;
                }
            } else {
                View LIZJ2 = LIZJ();
                if (LIZJ2 != null) {
                    tuxTextView = (TuxTextView) LIZJ2.findViewById(R.id.mme);
                }
            }
            this.LIZLLL = tuxTextView;
        }
        return this.LIZLLL;
    }

    @Override // X.C54006LHm, X.InterfaceC54017LHx
    public final boolean U6() {
        return this.LJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54018LHy(String tabName) {
        super(tabName);
        o.LJIIIZ(tabName, "tabName");
    }
}
