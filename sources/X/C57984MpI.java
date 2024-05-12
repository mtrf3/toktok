package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MpI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57984MpI extends AbstractC57990MpO {
    public static final C57984MpI LIZ = new C57984MpI();

    public final String toString() {
        return "OverrideMerge";
    }

    @Override // X.AbstractC57990MpO
    public final C57971Mp5 LIZ(C57971Mp5 c57971Mp5, C57971Mp5 nextPage) {
        o.LJIIIZ(nextPage, "nextPage");
        List LIZIZ = C57964Moy.LIZIZ(nextPage.LIZIZ);
        if (c57971Mp5 == null || LIZIZ == null || !LIZIZ.isEmpty()) {
            return nextPage;
        }
        return c57971Mp5;
    }
}
