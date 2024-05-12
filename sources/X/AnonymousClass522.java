package X;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.522, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass522 {
    public String LIZ;
    public Drawable LIZIZ;
    public List<AnonymousClass523> LIZLLL;
    public String LJI;
    public boolean LJIIIIZZ;
    public String LIZJ = "default_type";
    public long LJ = 600;
    public final HashMap<String, Object> LJFF = new HashMap<>();
    public final boolean LJII = true;

    public final AnonymousClass523 LIZ() {
        AnonymousClass523 anonymousClass523 = new AnonymousClass523(this);
        List<AnonymousClass523> list = this.LIZLLL;
        if (list != null) {
            ((ArrayList) anonymousClass523.LIZ).addAll(list);
        }
        List<AnonymousClass523> list2 = this.LIZLLL;
        if (list2 != null) {
            for (AnonymousClass523 anonymousClass5232 : list2) {
                anonymousClass5232.LIZIZ = anonymousClass523;
                anonymousClass5232.LJIIIZ = anonymousClass523.LJ;
            }
        }
        return anonymousClass523;
    }

    public final void LIZIZ(Object value, String str) {
        o.LJIIIZ(value, "value");
        this.LJFF.put(str, value);
    }
}
