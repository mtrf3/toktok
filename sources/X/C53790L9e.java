package X;

import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.L9e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53790L9e extends L9Y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53790L9e(Activity activity) {
        super(activity);
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.L9Y, X.AbstractC51620KNs
    public final void LIZJ(C208108Es target, long j) {
        o.LJIIIZ(target, "target");
        if (!C53791L9f.LIZ()) {
            return;
        }
        AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(this, target, 116);
        if (j > 0) {
            C37190Eig.LIZ.postDelayed(new ARunnableS45S0100000_9((Object) aqS156S0200000_9, 231), j);
        } else {
            C37190Eig.LIZ.post(new ARunnableS45S0100000_9((Object) aqS156S0200000_9, 231));
        }
    }
}
