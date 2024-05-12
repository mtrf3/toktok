package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.FLi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38818FLi {
    public IESSettingsProxy LIZJ;
    public final Object LIZ = new Object();
    public final CopyOnWriteArrayList<InterfaceC38821FLl> LIZIZ = new CopyOnWriteArrayList<>();
    public Gson LIZLLL = JsonParseUtils.LIZ().LIZ();

    public final void LIZ() {
        synchronized (this.LIZ) {
            this.LIZJ = new IESSettingsProxy();
            Iterator<InterfaceC38821FLl> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                InterfaceC38821FLl next = it.next();
                next.change(this.LIZJ);
                if (next instanceof C38820FLk) {
                    this.LIZIZ.remove(next);
                }
            }
        }
    }

    public C38818FLi() {
        LIZ();
    }
}
