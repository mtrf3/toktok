package Y;

import X.C158986Lu;
import X.C76800UCe;
import X.C82306WRy;
import X.C82410WVy;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import android.graphics.Bitmap;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AfS20S0210000_14 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS20S0210000_14 afS20S0210000_14, Object obj) {
        Bitmap it = (Bitmap) obj;
        C82306WRy c82306WRy = (C82306WRy) afS20S0210000_14.l0;
        if (!c82306WRy.LJLIL.isAdded(c82306WRy.LJLLLL)) {
            ((C82306WRy) afS20S0210000_14.l0).LJLJJLL();
            C158986Lu c158986Lu = ((C82306WRy) afS20S0210000_14.l0).LJLLLL;
            o.LJIIIIZZ(it, "it");
            c158986Lu.LLJJ(it, afS20S0210000_14.z2, new AqS160S0100000_10((InterfaceC65784Pro) afS20S0210000_14.l1, (InterfaceC65784Pro<C76800UCe>) 305));
            return;
        }
        C158986Lu c158986Lu2 = ((C82306WRy) afS20S0210000_14.l0).LJLLLL;
        o.LJIIIIZZ(it, "it");
        c158986Lu2.LLJJ(it, afS20S0210000_14.z2, new AqS161S0200000_14((C82306WRy) afS20S0210000_14.l0, (C82306WRy) afS20S0210000_14.l1, (InterfaceC65784Pro<C76800UCe>) 12));
    }

    public static final void accept$1(AfS20S0210000_14 afS20S0210000_14, Object obj) {
        ((C82410WVy) afS20S0210000_14.l0).LJLLL().LLJJ(!afS20S0210000_14.z2, ((C82410WVy) afS20S0210000_14.l0).LLILZIL((Effect) afS20S0210000_14.l1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS20S0210000_14(Object obj, C82306WRy c82306WRy, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.z2 = c82306WRy;
        this.l1 = z;
    }
}
