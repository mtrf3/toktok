package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.MHt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56561MHt<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C56962MXe LJLIL;
    public final /* synthetic */ CopyOnWriteArraySet<String> LJLILLLLZI;

    public C56561MHt(C56962MXe c56962MXe, CopyOnWriteArraySet<String> copyOnWriteArraySet) {
        this.LJLIL = c56962MXe;
        this.LJLILLLLZI = copyOnWriteArraySet;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<List<Aweme>> interfaceC65052gv) {
        List arrayList;
        C56962MXe c56962MXe = this.LJLIL;
        List LLJI = ORZ.LLJI(this.LJLILLLLZI);
        c56962MXe.getClass();
        try {
            arrayList = JG5.LIZ().LJFF(LLJI.toString()).items;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        } catch (Throwable th) {
            C221018lt.LIZJ("InnerPushPreloadManager", "requestAwemeListReal error", th);
            arrayList = new ArrayList();
        }
        ((C73578SuE) interfaceC65052gv).onSuccess(arrayList);
    }
}
