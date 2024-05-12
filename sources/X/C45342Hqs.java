package X;

import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hqs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45342Hqs extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C45342Hqs LJLIL = new C45342Hqs();

    public C45342Hqs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<SharePlatform> LIZIZ;
        List<SharePlatform> list;
        if (C62397OeH.LIZJ().LIZ == null || ((list = C62397OeH.LIZJ().LIZ) != null && list.size() == 0)) {
            LIZIZ = C62759Ok7.LIZIZ();
        } else {
            LIZIZ = C62397OeH.LIZJ().LIZ;
        }
        if (LIZIZ != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LIZIZ, 10));
            Iterator<SharePlatform> it = LIZIZ.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().platformId);
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }
}
