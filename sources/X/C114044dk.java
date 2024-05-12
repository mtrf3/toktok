package X;

import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS36S0200000_1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114044dk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C62387Oe7 config, final C113914dX shareChannelBar, Context context, C4P8 cb) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(shareChannelBar, "shareChannelBar");
        o.LJIIIZ(cb, "cb");
        config.LJIIJ.extras.getBoolean("is_async_sort");
        shareChannelBar.setVisibility(0);
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
        dialogC25756A8y.LIZIZ(R.string.rjz);
        if (shareChannelBar.getShowStyle() == EnumC62492Ofo.COLLAPSE) {
            shareChannelBar.LJLL = new InterfaceC114004dg() { // from class: X.4dj
                @Override // X.InterfaceC114004dg
                public final void LIZ(int i) {
                    View LIZIZ = C113914dX.this.LIZIZ(R.id.g2c);
                    o.LJIIIIZZ(LIZIZ, "shareChannelBar.ll_collapse_root");
                    View LIZIZ2 = C113914dX.this.LIZIZ(R.id.ai2);
                    View LIZIZ3 = C113914dX.this.LIZIZ(R.id.yi);
                    ValueAnimator ofInt = ValueAnimator.ofInt(LIZIZ.getHeight(), i);
                    o.LJIIIIZZ(ofInt, "ValueAnimator.ofInt(view.height, expandHeight)");
                    ofInt.addUpdateListener(new AUListenerS90S0100000_1(LIZIZ, 77));
                    ofInt.setDuration(350L);
                    ofInt.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
                    o.LJI(LIZIZ2);
                    ObjectAnimator animator1 = ObjectAnimator.ofFloat(LIZIZ2, "alpha", 1.0f, 0.0f);
                    o.LJIIIIZZ(animator1, "animator1");
                    animator1.setDuration(150L);
                    animator1.setInterpolator(new LinearInterpolator());
                    animator1.addListener(new IDAListenerS36S0200000_1(LIZIZ2, LIZIZ3, 4));
                    o.LJI(LIZIZ3);
                    ObjectAnimator animator2 = ObjectAnimator.ofFloat(LIZIZ3, "alpha", 0.1f, 1.0f);
                    o.LJIIIIZZ(animator2, "animator2");
                    animator2.setDuration(150L);
                    animator2.setInterpolator(new LinearInterpolator());
                    animator2.addUpdateListener(new AUListenerS90S0100000_1(LIZIZ3, 78));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(animator2).after(animator1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(ofInt).with(animatorSet);
                    animatorSet2.start();
                    C62468OfQ.LJJII = 1;
                    C62468OfQ.LIZ.clear();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("panel_source", "share_panel");
                    InterfaceC114054dl interfaceC114054dl = C62494Ofq.LIZIZ;
                    if (interfaceC114054dl != null) {
                        interfaceC114054dl.LIZIZ("click_more_external_share", linkedHashMap);
                    }
                }
            };
        }
        shareChannelBar.LJIIJ(config.LIZ, false);
        shareChannelBar.LJLJJL = new C62534OgU(config, cb, context, dialogC25756A8y, context, config.LJIIJ);
    }
}
