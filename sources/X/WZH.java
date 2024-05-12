package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WZH implements InterfaceC150015uf {
    public final /* synthetic */ WZJ LIZ;

    public WZH(WZJ wzj) {
        this.LIZ = wzj;
    }

    @Override // X.InterfaceC150015uf
    public final void LIZ(int i, C167736i9 c167736i9) {
        AbstractC77373UYf svcSlipEffect;
        if (c167736i9.LJ == 1) {
            return;
        }
        o.LJII(this.LIZ.mActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        if (c167736i9.LJFF == 1) {
            Activity activity = this.LIZ.mActivity;
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                String string = activity.getResources().getString(R.string.zh);
                o.LJIIIIZZ(string, "it.resources.getString(c…n_voiceEffectError3_body)");
                creativeToastBuilder.message(string);
                C78915Uy7.LJJIIZI(activity, 3066, creativeToastBuilder);
                return;
            }
            return;
        }
        Effect effect = c167736i9.LIZ;
        if (effect == null) {
            return;
        }
        WZJ wzj = this.LIZ;
        AbstractC77373UYf abstractC77373UYf = wzj.LL;
        Iterator<AbstractC77373UYf> it = wzj.LJZL.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                AbstractC77373UYf next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    svcSlipEffect = next;
                    o.LJIIIIZZ(svcSlipEffect, "svcSlipEffect");
                    if (o.LJ(C86793Y4n.LJIJJ(svcSlipEffect).getEffect_id(), effect.getEffect_id())) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                svcSlipEffect = C77375UYh.LIZ;
                break;
            }
        }
        this.LIZ.LLFII.LJIILIIL(C86793Y4n.LJIJJ(svcSlipEffect));
        WZJ wzj2 = this.LIZ;
        StringBuilder LJ = C7MY.LJ("onPanelItemViewSelected: pos = ", i, ", item = ");
        LJ.append(C86793Y4n.LJJIFFI(svcSlipEffect));
        WLP.LLJJIII(wzj2, X1D.LIZIZ(LJ));
        if (C86793Y4n.LJJIIZ(svcSlipEffect, abstractC77373UYf)) {
            this.LIZ.getUiActions().LJI.invoke(Integer.valueOf(i), svcSlipEffect);
        } else {
            this.LIZ.getUiActions().LJFF.invoke(Integer.valueOf(i), svcSlipEffect);
        }
    }
}
