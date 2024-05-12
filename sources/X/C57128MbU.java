package X;

import Y.ARunnableS1S0001000_6;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.MbU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C57128MbU extends RelativeLayout {
    public static final /* synthetic */ int LJLJI = 0;
    public C57127MbT LJLIL;
    public TuxTextView LJLILLLLZI;

    private RelativeLayout.LayoutParams getAvatarLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    private RelativeLayout.LayoutParams getLiveLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) KL2.LIZJ(getContext(), getLiveWidthFromExperiment()), (int) KL2.LIZJ(getContext(), getLiveHeightFromExperiment()));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        return layoutParams;
    }

    public final void LIZ() {
        String str;
        TuxTextView tuxTextView = this.LJLILLLLZI;
        try {
            C30039Bqd LJJIJIIJI = LiveOuterService.LJJJLL().LJJIJIL().LJJIJIIJI();
            Context context = this.LJLILLLLZI.getContext();
            LJJIJIIJI.getClass();
            str = C30039Bqd.LIZ(context);
        } catch (Exception unused) {
            str = null;
        }
        tuxTextView.setText(str);
        this.LJLILLLLZI.setTextColor(-1);
        this.LJLILLLLZI.setMaxLines(1);
        this.LJLILLLLZI.setEllipsize(TextUtils.TruncateAt.END);
        float f = 4;
        this.LJLILLLLZI.setPadding((int) KL2.LIZJ(getContext(), f), 0, (int) KL2.LIZJ(getContext(), f), 0);
        this.LJLILLLLZI.setGravity(17);
        this.LJLILLLLZI.setTuxFont(52);
        this.LJLILLLLZI.setMinTextSize(6.0f);
        this.LJLILLLLZI.LJJJ(9.0f);
    }

    private int getLiveHeightFromExperiment() {
        if (C202677xP.LIZIZ()) {
            return 12;
        }
        return 13;
    }

    private int getLiveWidthFromExperiment() {
        if (C202677xP.LIZIZ()) {
            return 30;
        }
        return 33;
    }

    public C57127MbT getAvatarImageView() {
        return this.LJLIL;
    }

    public TuxTextView getLiveTagView() {
        return this.LJLILLLLZI;
    }

    public final void LIZIZ(boolean z) {
        if (!z) {
            this.LJLILLLLZI.setVisibility(8);
            this.LJLIL.setBorderWidth(1);
            return;
        }
        this.LJLILLLLZI.setVisibility(0);
        this.LJLIL.setBorderWidth(0);
        try {
            LIZ();
            this.LJLILLLLZI.setBackgroundResource(R.drawable.boz);
        } catch (Resources.NotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (C53200KuK.LIZ()) {
            return;
        }
        C30326BvG.LIZ.post(new ARunnableS1S0001000_6(1, 17), null);
    }

    public void setAvatarRoundingPadding(float f) {
        C57127MbT c57127MbT = this.LJLIL;
        if (c57127MbT == null) {
            return;
        }
        c57127MbT.setRoundingParamsPadding(f);
    }

    public void setBorderColor(int i) {
        C57127MbT c57127MbT = this.LJLIL;
        if (c57127MbT != null) {
            c57127MbT.setBorderColor(i);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (((Boolean) C78895Uxn.LIZ().LJIIIZ(Boolean.FALSE, "enable_feed_live_avatar_tap_area")).booleanValue()) {
            if (layoutParams.width > 0 && layoutParams.height > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.LJLILLLLZI.getLayoutParams();
                layoutParams2.width = (layoutParams.width * getLiveWidthFromExperiment()) / 48;
                layoutParams2.height = (layoutParams.width * getLiveHeightFromExperiment()) / 48;
                this.LJLILLLLZI.setLayoutParams(layoutParams2);
                return;
            }
            this.LJLILLLLZI.setLayoutParams(getLiveLayoutParams());
        }
    }

    public C57128MbU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C57127MbT c57127MbT = new C57127MbT(getContext());
        this.LJLIL = c57127MbT;
        c57127MbT.getHierarchy().LJIJI(R.color.ao, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
        addView(this.LJLIL, getAvatarLayoutParams());
        TuxTextView tuxTextView = new TuxTextView(getContext());
        this.LJLILLLLZI = tuxTextView;
        tuxTextView.setVisibility(8);
        addView(this.LJLILLLLZI, getLiveLayoutParams());
    }
}
