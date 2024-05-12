package X;

import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U9H implements UBJ {
    public final /* synthetic */ LinkCoreService LIZ;

    @Override // X.UBJ
    public final int LIZIZ() {
        Iterator<U66> it = this.LIZ.LJLJJI.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() instanceof U7F) {
                i++;
            }
        }
        return i;
    }

    public U9H(LinkCoreService linkCoreService) {
        this.LIZ = linkCoreService;
    }

    @Override // X.UBJ
    public final void LIZ(U66 linker) {
        o.LJIIIZ(linker, "linker");
        LinkCoreService.LJIIIIZZ(this.LIZ, linker, false, "linker_remove_on_destroy_linker", null, 10);
    }
}
