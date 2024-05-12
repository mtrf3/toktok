package o53;

import X.C163996c7;
import X.ViewOnClickListenerC161696Wf;
import X.W4V;
import android.graphics.drawable.Animatable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDdS473S0100000_2 extends W4V {
    public final int $t;
    public Object l0;

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, str, obj, animatable);
                return;
            case 1:
                LJFF$1(this, str, obj, animatable);
                return;
            default:
                super.LJFF(str, obj, animatable);
                return;
        }
    }

    public IDdS473S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJFF$0(IDdS473S0100000_2 iDdS473S0100000_2, String str, Object obj, Animatable animatable) {
        ((ViewOnClickListenerC161696Wf) iDdS473S0100000_2.l0).LJLIL.invoke();
    }

    public static final void LJFF$1(IDdS473S0100000_2 iDdS473S0100000_2, String id, Object obj, Animatable animatable) {
        o.LJIIIZ(id, "id");
        FrameLayout frameLayout = ((C163996c7) iDdS473S0100000_2.l0).LJLJJL;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        ImageView imageView = ((C163996c7) iDdS473S0100000_2.l0).LJLJJLL;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }
}
