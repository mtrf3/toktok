package X;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VYA {
    public final int LIZ;
    public final LinkedList<C79916VYa> LIZIZ;
    public final HashMap<C79916VYa, VYM> LIZJ;
    public final /* synthetic */ VY8 LIZLLL;

    public VYA(VY8 vy8) {
        this.LIZLLL = vy8;
        Context context = vy8.getContext();
        o.LJIIIIZZ(context, "context");
        this.LIZ = (int) J75.LIZ(context, 20.0f);
        this.LIZIZ = new LinkedList<>();
        this.LIZJ = new HashMap<>();
    }
}
