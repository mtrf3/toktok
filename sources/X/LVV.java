package X;

import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class LVV implements InterfaceC56268M6m {
    @Override // X.InterfaceC56268M6m
    public final Object LIZ(C56265M6j c56265M6j) {
        Iterator it = ((HashSet) LVT.LIZIZ.LIZ).iterator();
        Class cls = null;
        while (it.hasNext() && (cls = ((LVU) it.next()).LIZ(c56265M6j.LIZ.method)) == null) {
        }
        if (cls == null) {
            return null;
        }
        try {
            return JsonParseUtils.LIZJ(cls, new String(c56265M6j.LIZ()));
        } catch (Throwable unused) {
            return null;
        }
    }
}
