package X;

import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.XQh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84811XQh extends AbstractC68898R2g<String, GifEmoji> {
    public final QLB LIZJ = new QLB(new XQ7().LIZ());

    @Override // X.AbstractC68898R2g
    public final /* bridge */ /* synthetic */ void LIZIZ() {
    }

    @Override // X.AbstractC68898R2g
    public final List<OSZ<String, List<GifEmoji>>> LJIIIIZZ() {
        QLB qlb = this.LIZJ;
        qlb.getClass();
        ArrayList arrayList = new ArrayList();
        AbstractMap abstractMap = ((XQY) ((InterfaceC84371X9j) qlb.LIZ)).LJLIL;
        o.LJFF(abstractMap, "mRealCache.asMap()");
        for (Map.Entry entry : abstractMap.entrySet()) {
            arrayList.add(new OSZ(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Override // X.AbstractC68898R2g
    public final List<GifEmoji> LJII(String str) {
        ConcurrentMapC84812XQi<K, V> concurrentMapC84812XQi = ((XQY) ((InterfaceC84371X9j) this.LIZJ.LIZ)).LJLIL;
        concurrentMapC84812XQi.getClass();
        str.getClass();
        int LIZLLL = concurrentMapC84812XQi.LIZLLL(str);
        return (List) concurrentMapC84812XQi.LJII(LIZLLL).LJII(LIZLLL, str);
    }

    @Override // X.AbstractC68898R2g
    public final void LJIIIZ(String str, List<? extends GifEmoji> list) {
        QLB qlb = this.LIZJ;
        if (list != null) {
            ((XQY) ((InterfaceC84371X9j) qlb.LIZ)).LJLIL.put(str, list);
            return;
        }
        XQY xqy = (XQY) ((InterfaceC84371X9j) qlb.LIZ);
        xqy.getClass();
        str.getClass();
        xqy.LJLIL.remove(str);
    }
}
