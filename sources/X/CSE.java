package X;

import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS110S0200000_5;
import Y.IDCListenerS298S0100000_5;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.FeedbackAnimChannel;
import com.bytedance.android.live.FeedbackMessageChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveLongPressCommentAvatarSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;
import uw.c0;

/* loaded from: classes6.dex */
public class CSE<MODEL extends c0<? extends CR6>> extends CSX<MODEL> implements InterfaceC31293CPx {
    public final TextView LJLJLLL;
    public final C47061t0 LJLL;
    public CharSequence LJLLI;
    public final View LJLLILLLL;
    public ValueAnimator LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    public View N() {
        if (this.LJLLL && !this.LJLLLL) {
            View findViewById = this.itemView.findViewById(R.id.bq4);
            o.LJIIIIZZ(findViewById, "{\n                itemVi…mon_layout)\n            }");
            return findViewById;
        }
        View findViewById2 = this.itemView.findViewById(R.id.fg4);
        o.LJIIIIZZ(findViewById2, "{\n                itemVi….id.layout)\n            }");
        return findViewById2;
    }

    public final void P() {
        InterfaceC31368CSu interfaceC31368CSu;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        CQQ cqq = this.LJLILLLLZI;
        if ((cqq == null || !cqq.LJIIZILJ) && (interfaceC31368CSu = (CQO) this.LJLJI) != null && (interfaceC31368CSu instanceof CS1)) {
            CS1 cs1 = (CS1) interfaceC31368CSu;
            if (cs1.LJIILIIL() && !cs1.LJJIJIIJI().LIZ) {
                View view = this.LJLLILLLL;
                if (view != null) {
                    ValueAnimator valueAnimator = this.LJLLJ;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.6666667f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration(1200L);
                    duration.start();
                    this.LJLLJ = duration;
                    cs1.LJJIJIIJI().LIZ = true;
                    int[] iArr = new int[2];
                    this.itemView.getLocationInWindow(iArr);
                    if (iArr[0] > 0 || iArr[1] > 0) {
                        if (C16310kV.LIZLLL(this.itemView) != 1) {
                            iArr[0] = this.itemView.getMeasuredWidth() + iArr[0];
                        }
                        iArr[1] = (this.itemView.getMeasuredHeight() / 2) + iArr[1];
                        CQQ cqq2 = this.LJLILLLLZI;
                        if (cqq2 != null && (dataChannel2 = cqq2.LJIIIIZZ) != null) {
                            dataChannel2.rv0(FeedbackAnimChannel.class, iArr);
                        }
                    }
                }
                CQQ cqq3 = this.LJLILLLLZI;
                if (cqq3 != null && (dataChannel = cqq3.LJIIIIZZ) != null) {
                    dataChannel.rv0(FeedbackMessageChannel.class, cs1.LJJIJIIJI().LIZIZ);
                }
            }
        }
    }

    @Override // X.CSF
    public void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLLJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSE(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.text);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.text)");
        TextView textView = (TextView) findViewById;
        this.LJLJLLL = textView;
        View findViewById2 = itemView.findViewById(R.id.ecz);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.icon_view)");
        C47061t0 c47061t0 = (C47061t0) findViewById2;
        this.LJLL = c47061t0;
        this.LJLLILLLL = itemView.findViewById(R.id.af5);
        this.LJLLL = true;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 366));
        C6H.LIZ(new ACListenerS25S0100000_5(this, 387), c47061t0);
        if (LiveLongPressCommentAvatarSetting.INSTANCE.getEnableLongPress()) {
            c47061t0.setOnLongClickListener(new IDCListenerS298S0100000_5(this, 13));
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "comment";
        CSJ csj = new CSJ();
        csj.LIZLLL = false;
        csj.LJII = new CSL(c68322mC);
        textView.setMovementMethod(csj);
        textView.setOnLongClickListener(new IDCListenerS110S0200000_5(this, c68322mC, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        CQO model = (CQO) crd;
        o.LJIIIZ(model, "model");
        cqq.LIZ(this.LJLJLLL);
        if (this.LJLJJL) {
            this.LJLLL = cqq.LIZLLL;
            this.LJLLLL = cqq.LJIIZILJ;
            View view = (View) this.LJLLLLLL.getValue();
            view.setPadding(view.getPaddingLeft(), C7MY.LIZIZ(this.LJLJJLL), view.getPaddingRight(), 0);
        }
        this.LJLJLLL.setTag(R.id.lrn, model);
        ImageModel LJJLJ = model.LJJLJ();
        if (!this.LJLJJI || cqq.LJFF) {
            if (LJJLJ != null) {
                C31665Cbl.LJ(LJJLJ, this.LJLL);
            } else {
                C87277YNd.LJJIIJ(model.LJJJ(), this.LJLL);
            }
        } else {
            this.LJLL.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.LJLJLLL.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                this.LJLJLLL.setLayoutParams(layoutParams);
            }
        }
        CharSequence content = model.getContent();
        if (content == null) {
            return;
        }
        this.LJLLI = content;
        this.LJLJLLL.setText(content);
        if (cqq.LJIJ == CRY.ExtendedGift) {
            this.LJLJLLL.setTag(R.id.lro, "live_gift_record");
        }
        if (model.LJLJLJ()) {
            this.LJLJLLL.setMaxLines(1);
        } else {
            this.LJLJLLL.setMaxLines(Integer.MAX_VALUE);
        }
        if (model instanceof InterfaceC31379CTf) {
            ((InterfaceC31379CTf) model).LJIJJ(this);
        }
        if (!(model instanceof C29392BgC)) {
            return;
        }
        C29392BgC c29392BgC = (C29392BgC) model;
        if (!c29392BgC.LLFF()) {
            return;
        }
        c29392BgC.LLFFF(this.LJLJLLL, cqq.LJI, new CSI(this));
    }

    @Override // X.InterfaceC31293CPx
    public final void LJLIL(Bitmap bitmap, CQO<? extends CR6> cqo) {
        Spannable spannable;
        if (bitmap == null || cqo == null) {
            return;
        }
        int LJJLIIJ = s.LJJLIIJ(String.valueOf(this.LJLLI), " . ", 6);
        if (LJJLIIJ != -1) {
            CharSequence charSequence = this.LJLLI;
            if ((charSequence instanceof Spannable) && (spannable = (Spannable) charSequence) != null) {
                CXJ.LIZ(spannable, bitmap, LJJLIIJ + 1, LJJLIIJ + 2, cqo);
            }
        }
        this.LJLJLLL.setText(this.LJLLI);
    }
}
