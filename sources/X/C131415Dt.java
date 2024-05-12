package X;

import Y.ARunnableS9S0000000_2;
import android.content.Context;
import android.os.Looper;
import android.view.OrientationEventListener;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5Dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131415Dt extends AbstractC65781Prl implements InterfaceC65784Pro<C5EI> {
    public static final C131415Dt LJLIL = new C131415Dt();

    public C131415Dt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5EI] */
    @Override // X.InterfaceC65784Pro
    public final C5EI invoke() {
        final Context LIZ = C58S.LIZ();
        return new OrientationEventListener(LIZ) { // from class: X.5EI
            public final /* synthetic */ Context LIZ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(LIZ, 3);
                this.LIZ = LIZ;
            }

            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                int i2 = this.LIZ.getResources().getConfiguration().orientation;
                if (i2 != 0 && i2 != C131425Du.LIZIZ) {
                    C131425Du.LIZIZ = i2;
                    if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                        synchronized (C131425Du.LIZ) {
                            Iterator<C5EJ> it = C131425Du.LIZJ.iterator();
                            while (it.hasNext()) {
                                it.next().LIZ();
                            }
                        }
                        return;
                    }
                    C131425Du.LIZLLL.post(new ARunnableS9S0000000_2(i2, 0));
                }
            }
        };
    }
}
