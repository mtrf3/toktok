package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.NOk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59282NOk implements NOC {
    public static final C59282NOk LIZ = new C59282NOk();

    @Override // X.NOC
    public final AbstractC59249NNd LIZ(int i, InterfaceC59247NNb taskContext, Bundle bundle) {
        o.LJIIIZ(taskContext, "taskContext");
        switch (i) {
            case 0:
                return new C59279NOh(taskContext, bundle);
            case 1:
                return new NNL(taskContext, bundle);
            case 2:
                return new C59274NOc(taskContext, bundle);
            case 3:
                return new NOR(taskContext, bundle);
            case 4:
                return new C59278NOg(taskContext, bundle);
            case 5:
                return new C59276NOe(taskContext, bundle);
            case 6:
                return new C59277NOf(taskContext, bundle);
            case 7:
                return new C59286NOo(taskContext, bundle);
            case 8:
                return new C59283NOl(taskContext, bundle);
            case 9:
                return new C59281NOj(taskContext, bundle);
            default:
                return null;
        }
    }
}
