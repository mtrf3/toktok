package com.bytedance.android.livesdk.broadcast.interaction.function.illegal;

import X.BEP;
import X.BEQ;
import X.BZI;
import X.C15380j0;
import X.C28507BGt;
import X.C28787BRn;
import X.C28871BUt;
import X.C30882CAc;
import X.C47061t0;
import X.C7N;
import X.CVT;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.model.WaitingReviewRule;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes6.dex */
public class IllegalReviewDialog extends LiveDialogFragment implements View.OnClickListener {
    public Context LJLIL;
    public View LJLILLLLZI;
    public RelativeLayout LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public LinearLayout LJLJLLL;
    public BEQ LJLL;
    public List<WaitingReviewRule> LJLLI;
    public LiveIllegalPresenter LJLLILLLL;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cxx);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        c28507BGt.LJIIL = new ColorDrawable(0);
        return c28507BGt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        WaitingReviewRule waitingReviewRule;
        if (view instanceof C47061t0) {
            if (view.getTag() != null) {
                i = ((Integer) view.getTag()).intValue();
            } else {
                i = -1;
            }
            List<WaitingReviewRule> list = this.LJLLI;
            if (list == null || list.isEmpty() || i < 0 || i >= this.LJLLI.size() || (waitingReviewRule = (WaitingReviewRule) ListProtector.get(this.LJLLI, i)) == null || TextUtils.isEmpty(waitingReviewRule.url)) {
                return;
            }
            String uri = UriProtector.parse(waitingReviewRule.url).buildUpon().appendQueryParameter("source", "inapp").appendQueryParameter("enter_from", "live").build().toString();
            C7N.LJFF().Lu();
            C30882CAc.LJII(getContext(), new C28871BUt(uri));
            if (!waitingReviewRule.url.contains("health_score")) {
                return;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_know_health_score_page_show");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ("shield", "enter_from");
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        LiveIllegalPresenter liveIllegalPresenter = this.LJLLILLLL;
        if (liveIllegalPresenter != null) {
            liveIllegalPresenter.onIllegalReviewDialogDismiss();
        }
        super.onDismiss(dialogInterface);
    }

    public static Spannable vl(int i, String str) {
        SpannableString spannableString = new SpannableString(str);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, 25.0f, Resources.getSystem().getDisplayMetrics()));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C15380j0.LIZIZ(R.color.my));
        spannableString.setSpan(absoluteSizeSpan, 4, i, 18);
        spannableString.setSpan(foregroundColorSpan, 4, i, 18);
        return spannableString;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = getView();
        this.LJLILLLLZI = view2;
        this.LJLJI = (RelativeLayout) view2.findViewById(R.id.btt);
        this.LJLJJI = (TextView) this.LJLILLLLZI.findViewById(R.id.e4p);
        this.LJLJJL = (TextView) this.LJLILLLLZI.findViewById(R.id.e4m);
        this.LJLILLLLZI.findViewById(R.id.e4l);
        this.LJLJJLL = (TextView) this.LJLILLLLZI.findViewById(R.id.ngq);
        this.LJLJL = (TextView) this.LJLILLLLZI.findViewById(R.id.ngr);
        this.LJLJLJ = (TextView) this.LJLILLLLZI.findViewById(R.id.b8f);
        this.LJLJLLL = (LinearLayout) this.LJLILLLLZI.findViewById(R.id.aq5);
        BEQ beq = (BEQ) this.LJLILLLLZI.findViewById(R.id.g7o);
        this.LJLL = beq;
        BEP LIZ = BEP.LIZ(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ab9);
        CVT cvt = new CVT(LIZ.LIZ, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        layoutParams.gravity = 17;
        cvt.setLayoutParams(layoutParams);
        LIZ.LIZIZ = cvt;
        beq.setBuilder(LIZ);
        this.LJLL.setVisibility(0);
        this.LJLL.LIZLLL();
        this.LJLL.setVisibility(0);
        this.LJLL.LIZLLL();
        LiveIllegalPresenter liveIllegalPresenter = this.LJLLILLLL;
        if (liveIllegalPresenter != null) {
            liveIllegalPresenter.updateReviewInfo();
        }
    }

    public final void wl(int i, int i2, boolean z) {
        if (z) {
            this.LJLJJLL.setVisibility(0);
            this.LJLJJLL.setText(vl(String.valueOf(i).length() + 4, C15380j0.LJIILL(R.string.sx5, Integer.valueOf(i))));
            this.LJLJL.setVisibility(0);
            this.LJLJL.setText(vl(String.valueOf(i2).length() + 4, C15380j0.LJIILL(R.string.sx6, Integer.valueOf(i2))));
            return;
        }
        this.LJLJJLL.setVisibility(4);
        this.LJLJL.setVisibility(4);
    }
}
