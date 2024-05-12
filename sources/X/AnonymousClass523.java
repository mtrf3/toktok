package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.523, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass523 extends AnonymousClass524 {
    public String LIZJ;
    public Drawable LIZLLL;
    public final String LJ;
    public boolean LJFF;
    public final boolean LJI;
    public final long LJII;
    public final HashMap<String, Object> LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI = -1;
    public final List<AnonymousClass523> LJIIL = new ArrayList();

    public final ArrayList<AnonymousClass523> LIZIZ() {
        List<AnonymousClass524> list = this.LIZ;
        o.LJII(list, "null cannot be cast to non-null type java.util.ArrayList<com.ss.ugc.android.editor.base.functions.FunctionItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ss.ugc.android.editor.base.functions.FunctionItem> }");
        return (ArrayList) list;
    }

    public AnonymousClass523(AnonymousClass522 anonymousClass522) {
        this.LIZJ = anonymousClass522.LIZ;
        this.LIZLLL = anonymousClass522.LIZIZ;
        this.LJ = anonymousClass522.LIZJ;
        this.LJFF = anonymousClass522.LJII;
        this.LJI = anonymousClass522.LJIIIIZZ;
        this.LJII = anonymousClass522.LJ;
        this.LJIIIIZZ = anonymousClass522.LJFF;
        this.LJIIIZ = anonymousClass522.LJI;
    }

    public final boolean LIZ(AnonymousClass523 anonymousClass523) {
        if (LIZIZ().isEmpty()) {
            return false;
        }
        Iterator<AnonymousClass523> it = LIZIZ().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().LJ, anonymousClass523.LJ)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZJ(List<AnonymousClass523> list) {
        if (list == null) {
            ((ArrayList) this.LIZ).clear();
            return;
        }
        if (!this.LIZ.isEmpty()) {
            ((ArrayList) this.LIZ).clear();
        }
        ((ArrayList) this.LIZ).addAll(list);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AnonymousClass523) && TextUtils.equals(this.LJ, ((AnonymousClass523) obj).LJ)) {
            return true;
        }
        return false;
    }
}
