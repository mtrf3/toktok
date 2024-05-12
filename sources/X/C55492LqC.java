package X;

import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LqC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55492LqC implements InterfaceC51617KNp {
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public View LIZJ;

    @Override // X.InterfaceC51617KNp
    public final void LIZ() {
        View view = this.LIZJ;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.InterfaceC51617KNp
    public final View LIZIZ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup instanceof FrameLayout) {
            this.LIZJ = C16970lZ.LIZJ(R.layout.al5, C45804HyK.LJIJJ(this.LIZIZ), this.LIZ, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) KL2.LIZJ(this.LIZIZ, 6.0f);
            this.LIZ.addView(this.LIZJ, layoutParams);
            View view = this.LIZJ;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (viewGroup instanceof RelativeLayout) {
            this.LIZJ = C16970lZ.LIZJ(R.layout.al5, C45804HyK.LJIJJ(this.LIZIZ), this.LIZ, false);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(14);
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = (int) KL2.LIZJ(this.LIZIZ, 6.0f);
            this.LIZ.addView(this.LIZJ, layoutParams2);
            View view2 = this.LIZJ;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC51617KNp
    public final void LIZJ(Aweme aweme) {
        BrandedContentToolSchema LIZ;
        View view;
        long j;
        if (aweme == null || (LIZ = GTF.LIZ()) == null || LIZ.baViewInsightsSchema == null || (view = this.LIZJ) == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.m0g);
        AwemeStatistics statistics = aweme.getStatistics();
        long j2 = 0;
        if (statistics != null) {
            j = statistics.getPlayCount();
        } else {
            j = 0;
        }
        String quantityString = this.LIZIZ.getResources().getQuantityString(R.plurals.be, (int) j, C60106NiQ.LIZIZ(j));
        o.LJIIIIZZ(quantityString, "context.resources\n      …(playCount)\n            )");
        if (statistics != null) {
            j2 = statistics.getShareCount();
        }
        String quantityString2 = this.LIZIZ.getResources().getQuantityString(R.plurals.bd, (int) j2, C60106NiQ.LIZIZ(j2));
        o.LJIIIIZZ(quantityString2, "context.resources\n      …DisplayCount(shareCount))");
        String LIZ2 = C29822Bn8.LIZ(this.LIZIZ, R.string.en3, "context.resources.getString(R.string.dm_comma)");
        if (textView != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(quantityString);
            LIZ3.append(LIZ2);
            LIZ3.append(' ');
            LIZ3.append(quantityString2);
            textView.setText(X1D.LIZIZ(LIZ3));
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LIZJ;
        if (view3 == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS44S0200000_9(this, aweme, 25), view3);
    }

    public C55492LqC(Context context, ViewGroup rootView) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(context, "context");
        this.LIZ = rootView;
        this.LIZIZ = context;
    }
}
