package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SQo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72078SQo implements InterfaceC72081SQr<String> {
    public final java.util.Map<String, Aweme> LIZ = new HashMap();

    @Override // X.InterfaceC72081SQr
    public final void clear() {
        ((HashMap) this.LIZ).clear();
    }

    @Override // X.InterfaceC72081SQr
    public final Collection<Aweme> values() {
        return ((HashMap) this.LIZ).values();
    }

    @Override // X.InterfaceC72081SQr
    public final boolean containsKey(String str) {
        return ((HashMap) this.LIZ).containsKey(str);
    }

    @Override // X.InterfaceC72081SQr
    public final Aweme get(String str) {
        return (Aweme) ((HashMap) this.LIZ).get(str);
    }

    @Override // X.InterfaceC72081SQr
    public final void LIZ(Aweme aweme, Object obj) {
        java.util.Map<String, Aweme> map = this.LIZ;
        o.LJI(obj);
        ((HashMap) map).put(obj, aweme);
    }
}
