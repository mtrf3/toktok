package Y;

import X.AnonymousClass349;
import X.C38891fp;
import X.C56745MOv;
import X.C56805MRd;
import X.EnumC56806MRe;
import X.InterfaceC29937Boz;
import X.InterfaceC73573Su9;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDaS160S0200000_9 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS160S0200000_9 iDaS160S0200000_9) {
        NotificationCombineVM notificationCombineVM = (NotificationCombineVM) iDaS160S0200000_9.l0;
        notificationCombineVM.LJZI = false;
        ((LiveData) notificationCombineVM.LJLLILLLL.getValue()).setValue((AnonymousClass349) iDaS160S0200000_9.l1);
    }

    public static final void run$1(IDaS160S0200000_9 iDaS160S0200000_9) {
        ((C56745MOv) iDaS160S0200000_9.l0).LIZJ();
        if (C56805MRd.LIZJ()) {
            EnumC56806MRe.LJLJL.LIZLLL();
        }
        InterfaceC73573Su9 emitter = (InterfaceC73573Su9) iDaS160S0200000_9.l1;
        o.LJIIIIZZ(emitter, "emitter");
        C56745MOv c56745MOv = (C56745MOv) iDaS160S0200000_9.l0;
        C38891fp.LJJIJ(emitter, c56745MOv.LJII(c56745MOv.LIZIZ(), null));
    }

    public IDaS160S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
