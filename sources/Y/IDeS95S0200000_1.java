package Y;

import X.ActivityC45651qj;
import X.C26045AKb;
import X.C48841JEv;
import X.C59522Vg;
import X.C70562po;
import X.C77125UOr;
import X.C77266UUc;
import X.C78613UtF;
import X.C78685UuP;
import X.C89003eS;
import X.DialogC25756A8y;
import X.InterfaceC65784Pro;
import X.R47;
import X.V1B;
import X.ViewOnClickListenerC252769w0;
import X.XKX;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDeS95S0200000_1 implements R47 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                return;
            case 1:
                onResult$1(this, i, i2, obj);
                return;
            default:
                return;
        }
    }

    public IDeS95S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onResult$0(IDeS95S0200000_1 iDeS95S0200000_1, int i, int i2, Object obj) {
        if (i == 7 && i2 == 1) {
            ((ViewOnClickListenerC252769w0) iDeS95S0200000_1.l0).setVisibility(8);
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) iDeS95S0200000_1.l1;
            baseMyProfileGuideWidget.getClass();
            C26045AKb c26045AKb = new C26045AKb(C77125UOr.LIZJ(baseMyProfileGuideWidget));
            c26045AKb.LJIIIIZZ(R.string.c9u);
            c26045AKb.LJIIJ();
            if (C59522Vg.LIZ()) {
                BaseMyProfileGuideWidget baseMyProfileGuideWidget2 = (BaseMyProfileGuideWidget) iDeS95S0200000_1.l1;
                baseMyProfileGuideWidget2.getClass();
                ActivityC45651qj LIZJ = C77125UOr.LIZJ(baseMyProfileGuideWidget2);
                o.LJII(LIZJ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(LIZJ), C78613UtF.LIZJ, null, new C70562po(LIZJ, null), 2);
                return;
            }
            C77266UUc c77266UUc = C77266UUc.LIZIZ;
            BaseMyProfileGuideWidget baseMyProfileGuideWidget3 = (BaseMyProfileGuideWidget) iDeS95S0200000_1.l1;
            baseMyProfileGuideWidget3.getClass();
            c77266UUc.LJIJJLI(C77125UOr.LIZJ(baseMyProfileGuideWidget3), 0);
        }
    }

    public static final void onResult$1(IDeS95S0200000_1 iDeS95S0200000_1, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            VideoCreationTailFragment videoCreationTailFragment = (VideoCreationTailFragment) iDeS95S0200000_1.l0;
            AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65784Pro) iDeS95S0200000_1.l1, 1004);
            String str = videoCreationTailFragment.LJLJLJ;
            if (str != null && C78685UuP.LJJJZ(str)) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C89003eS(videoCreationTailFragment, str, aqS151S0100000_1, null), 3);
                return;
            }
            DialogC25756A8y dialogC25756A8y = videoCreationTailFragment.LJLLL;
            if (dialogC25756A8y == null) {
                return;
            }
            V1B.LJLILLLLZI(dialogC25756A8y);
            return;
        }
        DialogC25756A8y dialogC25756A8y2 = ((VideoCreationTailFragment) iDeS95S0200000_1.l0).LJLLL;
        if (dialogC25756A8y2 == null) {
            return;
        }
        V1B.LJLILLLLZI(dialogC25756A8y2);
    }
}
