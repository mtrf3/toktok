package X;

import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42800Gqy {
    public final View LIZ;
    public final InterfaceC42309Gj3 LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final ViewModelStoreOwner LJ;

    public C42800Gqy(View rootLayout, InterfaceC42309Gj3 iAddHashTag, String creationId, List<String> list, ViewModelStoreOwner viewModelStoreOwner) {
        o.LJIIIZ(rootLayout, "rootLayout");
        o.LJIIIZ(iAddHashTag, "iAddHashTag");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        this.LIZ = rootLayout;
        this.LIZIZ = iAddHashTag;
        this.LIZJ = creationId;
        this.LIZLLL = list;
        this.LJ = viewModelStoreOwner;
    }
}
