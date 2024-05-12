package Y;

import X.C45804HyK;
import X.C62688Oiy;
import X.C68322mC;
import X.InterfaceC65784Pro;
import X.JJ4;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDgS139S0200000_10 implements JJ4 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final /* synthetic */ void LIZIZ$1(IDgS139S0200000_10 iDgS139S0200000_10) {
    }

    @Override // X.JJ4
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.JJ4
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                return;
            case 1:
                LIZIZ$1(this);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$0(IDgS139S0200000_10 iDgS139S0200000_10) {
        ((InterfaceC65784Pro) ((C68322mC) iDgS139S0200000_10.l0).element).invoke();
    }

    public static final void LIZ$1(IDgS139S0200000_10 iDgS139S0200000_10) {
        C62688Oiy c62688Oiy = (C62688Oiy) iDgS139S0200000_10.l0;
        Activity LJIJJ = C45804HyK.LJIJJ((Context) iDgS139S0200000_10.l1);
        o.LJI(LJIJJ);
        c62688Oiy.LIZJ(LJIJJ);
    }

    public static final void LIZIZ$0(IDgS139S0200000_10 iDgS139S0200000_10) {
        ((ChatCheckLoginActivity) iDgS139S0200000_10.l1).finish();
    }

    public IDgS139S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
