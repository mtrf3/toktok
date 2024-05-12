package Y;

import X.C91188Zqa;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.AudioCardAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDDListenerS397S0100000_29 implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(IDDListenerS397S0100000_29 iDDListenerS397S0100000_29) {
        C91188Zqa c91188Zqa = ((AudioCardAssem) iDDListenerS397S0100000_29.l0).LLFII;
        if (c91188Zqa != null) {
            if (c91188Zqa.getHeight() == 0) {
                return true;
            }
            C91188Zqa c91188Zqa2 = ((AudioCardAssem) iDDListenerS397S0100000_29.l0).LLFII;
            if (c91188Zqa2 != null) {
                c91188Zqa2.getViewTreeObserver().removeOnPreDrawListener(iDDListenerS397S0100000_29);
                ((AudioCardAssem) iDDListenerS397S0100000_29.l0).e4();
                return false;
            }
            o.LJIJI("audioStyleView");
            throw null;
        }
        o.LJIJI("audioStyleView");
        throw null;
    }

    public static final boolean onPreDraw$1(IDDListenerS397S0100000_29 iDDListenerS397S0100000_29) {
        ViewTreeObserver viewTreeObserver;
        View view = ((UpsellLandingPageSlotAssem) iDDListenerS397S0100000_29.l0).LLI;
        if (view != null && view.getHeight() == 0) {
            return true;
        }
        View view2 = ((UpsellLandingPageSlotAssem) iDDListenerS397S0100000_29.l0).LLI;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(iDDListenerS397S0100000_29);
        }
        ((UpsellLandingPageSlotAssem) iDDListenerS397S0100000_29.l0).p4();
        return false;
    }

    public IDDListenerS397S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
