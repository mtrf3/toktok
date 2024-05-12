package X;

import Y.ACListenerS28S0100000_8;
import Y.AUListenerS90S0100000_1;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JAx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48739JAx extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Integer>, C76800UCe> {
    public static final C48739JAx INSTANCE = new C48739JAx();

    public C48739JAx() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MidAdCellComponent selectSubscribe, C43I<Integer> it) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        boolean z;
        ViewGroup rootView;
        FrameLayout frameLayout;
        Integer num;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it.LIZ != null && (aweme = selectSubscribe.A4().LJLJLLL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            int skipAdTime = awemeRawAd.getSkipAdTime();
            Integer num2 = it.LIZ;
            int i = skipAdTime / 1000;
            if (((num2 != null && num2.intValue() == i) || ((num = it.LIZ) != null && num.intValue() == -1 && skipAdTime == -1)) && !selectSubscribe.LLIILZL) {
                selectSubscribe.LLIILZL = true;
                Aweme aweme2 = selectSubscribe.A4().LJLJLLL;
                if (aweme2 != null && C63081OpJ.LJZL(aweme2)) {
                    selectSubscribe.q4();
                } else {
                    Integer num3 = it.LIZ;
                    if (num3 == null || num3.intValue() != -1 || skipAdTime != -1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    IMidAdAbility z4 = selectSubscribe.z4();
                    if (z4 != null && (rootView = z4.getRootView()) != null && (frameLayout = (FrameLayout) rootView.findViewById(R.id.su)) != null) {
                        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                        Context context = frameLayout.getContext();
                        o.LJIIIIZZ(context, "maskView.context");
                        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, C79045V0n.LJI(R.attr.d4, context), 0);
                        ofObject.setDuration(300L);
                        ofObject.addUpdateListener(new AUListenerS90S0100000_1(frameLayout, 38));
                        ofObject.addListener(new JB3(rootView, frameLayout, z, selectSubscribe));
                        ofObject.start();
                    }
                }
            }
            Integer num4 = it.LIZ;
            if (num4 == null || num4.intValue() != 0) {
                Integer num5 = it.LIZ;
                if (num5 == null || num5.intValue() != -1) {
                    TuxTextView u4 = selectSubscribe.u4();
                    String string = selectSubscribe.u4().getContext().getString(R.string.gdn);
                    o.LJIIIIZZ(string, "buttonTextView.context.g…d_ads_mid_roll_skip_ad_n)");
                    C025908h.LJ(new Object[]{String.valueOf(it.LIZ)}, 1, string, "format(format, *args)", u4);
                    return;
                }
                return;
            }
            selectSubscribe.u4().setText(selectSubscribe.r4().getContext().getString(R.string.gdm));
            selectSubscribe.q4();
            C16880lQ.LJIIL(selectSubscribe.r4(), new ACListenerS28S0100000_8(selectSubscribe, 57));
        }
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Integer> c43i) {
        invoke2(midAdCellComponent, (C43I<Integer>) c43i);
        return C76800UCe.LIZ;
    }
}
