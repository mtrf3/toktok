package X;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.61i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536661i extends AbstractC65781Prl implements InterfaceC88473Ynt<SmartImageView, TextView, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C60U LJLILLLLZI;
    public final /* synthetic */ C68322mC<ValueAnimator> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536661i(boolean z, C60U c60u, C68322mC<ValueAnimator> c68322mC) {
        super(3);
        this.LJLIL = z;
        this.LJLILLLLZI = c60u;
        this.LJLJI = c68322mC;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(SmartImageView smartImageView, TextView textView, Integer num) {
        SmartImageView iconView = smartImageView;
        TextView textView2 = textView;
        int intValue = num.intValue();
        o.LJIIIZ(iconView, "iconView");
        o.LJIIIZ(textView2, "textView");
        if (intValue == 0) {
            if (this.LJLIL) {
                iconView.setAlpha(0.5f);
                textView2.setAlpha(0.5f);
            } else {
                C60U c60u = this.LJLILLLLZI;
                C68322mC<ValueAnimator> c68322mC = this.LJLJI;
                InterfaceC163006aW publishService = C60903NvH.LJIIJJI().getPublishService();
                c60u.getClass();
                publishService.LJJIJIL(c60u, new C1536761j(textView2, iconView, c60u, c68322mC));
            }
        }
        return C76800UCe.LIZ;
    }
}
