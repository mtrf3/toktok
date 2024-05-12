package X;

import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class EBJ implements InterfaceC35929E8f {
    public final /* synthetic */ C50669Jub LIZ;
    public final /* synthetic */ List<SearchHistory> LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC35929E8f
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC35929E8f
    public final void LIZ() {
        C50669Jub c50669Jub = this.LIZ;
        List<SearchHistory> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<SearchHistory> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().keyword);
        }
        c50669Jub.LIZJ(this.LIZJ, arrayList, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EBJ(C50669Jub c50669Jub, List<? extends SearchHistory> list, String str) {
        this.LIZ = c50669Jub;
        this.LIZIZ = list;
        this.LIZJ = str;
    }
}
