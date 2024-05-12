package X;

import Y.ALAdapterS9S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWR extends AbstractC65781Prl implements InterfaceC88471Ynr<AddToMusicDspButtonAssem, Double, C76800UCe> {
    public static final SWR LJLIL = new SWR();

    public SWR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddToMusicDspButtonAssem addToMusicDspButtonAssem, Double d) {
        AddToMusicDspButtonAssem selectSubscribe = addToMusicDspButtonAssem;
        Double d2 = d;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            int i = C53206KuQ.LIZJ().addToDspLargeButtonDisplayTimeBeforeRed;
            if (i < 0) {
                i = 0;
            }
            if (doubleValue > i && !selectSubscribe.LLIIIJ && (C187437Xf.LIZ() == 2 || C187437Xf.LIZ() == 3)) {
                selectSubscribe.LLIIIJ = true;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(selectSubscribe.LLFZ, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(selectSubscribe.LLI, "alpha", 0.0f, 1.0f);
                ofFloat2.setStartDelay(50L);
                ofFloat2.setDuration(300L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.addListener(new ALAdapterS9S0100000_12(selectSubscribe, 12));
                animatorSet.start();
            }
        }
        return C76800UCe.LIZ;
    }
}
