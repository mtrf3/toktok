package X;

import com.ss.android.ugc.aweme.ecomsearch.utils.EcSearchShopResultPreload;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9C implements InterfaceC80653En {
    public static K9C LJLJL;
    public final Integer LJLIL;
    public final ECSearchEntranceData LJLILLLLZI;
    public KAK LJLJI;
    public SearchResultParam LJLJJL;
    public List<K9A> LJLJJI = new ArrayList();
    public List<K9A> LJLJJLL = new ArrayList();

    public final K9A LIZ() {
        if (!this.LJLJJLL.isEmpty()) {
            return (K9A) ORZ.LLFF(this.LJLJJLL);
        }
        if (!this.LJLJJI.isEmpty()) {
            return (K9A) ORZ.LLFF(this.LJLJJI);
        }
        return null;
    }

    public final void LIZIZ(K9A k9a) {
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((K9A) next).LJLIL == k9a.LJLIL) {
                if (next != null) {
                    ((ArrayList) this.LJLJJLL).remove(next);
                }
            }
        }
        ((ArrayList) this.LJLJJLL).add(k9a);
    }

    public final void LIZJ(SearchResultParam searchResultParam) {
        int i;
        KAJ kaj;
        if (o.LJ(this.LJLJJL, searchResultParam)) {
            return;
        }
        this.LJLJJL = searchResultParam;
        this.LJLJJI = this.LJLJJLL;
        this.LJLJJLL = new ArrayList();
        K9A LIZ = LIZ();
        if (LIZ != null && (kaj = LIZ.LJLIL) != null) {
            kaj.getValue();
        }
        KAK kak = this.LJLJI;
        if (kak != null) {
            i = C51214K8c.LIZJ(kak);
        } else {
            i = -1;
        }
        KFM kfm = EcSearchShopResultPreload.Companion;
        int LIZJ = C51214K8c.LIZJ(KAK.SHOP);
        kfm.getClass();
        KFM.LIZJ(searchResultParam, true, false, LIZJ, i);
    }

    public K9C(ECSearchEntranceData eCSearchEntranceData, Integer num) {
        this.LJLIL = num;
        this.LJLILLLLZI = eCSearchEntranceData;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }
}
