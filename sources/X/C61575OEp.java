package X;

import android.content.Context;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.google.android.play.core.appupdate.i;
import com.google.android.play.core.appupdate.q;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OEp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61575OEp implements InterfaceC153055zZ, OF0 {
    public Object LJLIL;

    public final void LIZ() {
        Object obj = this.LJLIL;
        if (obj == null || ((List) obj).isEmpty()) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "global settings notify finish");
        Iterator it = ((List) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((AbstractC61574OEo) it.next()).LIZ();
        }
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        Context context = (Context) ((i) ((InterfaceC153055zZ) this.LJLIL)).LJLIL.LIZ;
        C40654FxS.LJI(context);
        return new q(context);
    }

    public /* synthetic */ C61575OEp() {
    }

    public /* synthetic */ C61575OEp(Object obj) {
        this.LJLIL = obj;
    }

    public final void LIZIZ(GlobalConfigSettings globalConfigSettings) {
        Object obj = this.LJLIL;
        if (obj == null || ((List) obj).isEmpty()) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "global settings notify update");
        Iterator it = ((List) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((AbstractC61574OEo) it.next()).LIZIZ(globalConfigSettings);
        }
    }
}
