package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.61j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536761j extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public final /* synthetic */ C60U LJLIL;
    public final /* synthetic */ SmartImageView LJLILLLLZI;
    public final /* synthetic */ TextView LJLJI;
    public final /* synthetic */ C68322mC<ValueAnimator> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536761j(TextView textView, SmartImageView smartImageView, C60U c60u, C68322mC c68322mC) {
        super(2);
        this.LJLIL = c60u;
        this.LJLILLLLZI = smartImageView;
        this.LJLJI = textView;
        this.LJLJJI = c68322mC;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, android.animation.ObjectAnimator, android.animation.ValueAnimator] */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, String flowId) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(flowId, "flowId");
        if (o.LJ(this.LJLIL.LLJLIL().creativeModel.editSaveLocalModel.flowId, flowId) && booleanValue) {
            C68322mC<ValueAnimator> c68322mC = this.LJLJJI;
            SmartImageView smartImageView = this.LJLILLLLZI;
            smartImageView.setActualImageResource(R.drawable.b3l);
            if (c68322mC.element == null) {
                ?? ofFloat = ObjectAnimator.ofFloat(smartImageView, "rotation", 0.0f, 360.0f);
                ofFloat.setDuration(1000L);
                ofFloat.setRepeatCount(-1);
                C149985uc.LIZ(ofFloat);
                c68322mC.element = ofFloat;
            }
            ValueAnimator valueAnimator3 = c68322mC.element;
            if ((valueAnimator3 == null || !valueAnimator3.isRunning()) && (valueAnimator2 = c68322mC.element) != null) {
                valueAnimator2.start();
            }
            this.LJLJI.setText(R.string.q9t);
        } else {
            C68322mC<ValueAnimator> c68322mC2 = this.LJLJJI;
            SmartImageView smartImageView2 = this.LJLILLLLZI;
            smartImageView2.setActualImageResource(R.drawable.b3k);
            smartImageView2.setRotation(0.0f);
            ValueAnimator valueAnimator4 = c68322mC2.element;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = c68322mC2.element) != null) {
                valueAnimator.cancel();
            }
            this.LJLJI.setText(R.string.q9s);
        }
        return C76800UCe.LIZ;
    }
}
