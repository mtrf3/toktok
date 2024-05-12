package X;

import android.graphics.Paint;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedList;

/* renamed from: X.GhB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C42193GhB implements InterfaceC66512Q8m {
    public static SparkContext LIZIZ(String str) {
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(str);
        return sparkContext;
    }

    @Override // X.InterfaceC66512Q8m, X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Lifecycle.Event event = (Lifecycle.Event) obj;
        int i = GFH.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return Lifecycle.Event.ON_STOP;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Lifecycle has ended! Last event was ");
                    LIZ.append(event);
                    throw new C42194GhC(X1D.LIZIZ(LIZ));
                }
                return Lifecycle.Event.ON_PAUSE;
            }
            return Lifecycle.Event.ON_STOP;
        }
        return Lifecycle.Event.ON_DESTROY;
    }

    public static Paint LIZ(LinkedList linkedList, Paint paint) {
        linkedList.add(paint);
        return new Paint();
    }

    public static C73426Srm LIZJ(C73849Syb c73849Syb, C73849Syb c73849Syb2) {
        c73849Syb.getClass();
        return new C73426Srm(c73849Syb2);
    }
}
