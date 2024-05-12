package X;

import X.InterfaceC213058Xt;
import X.InterfaceC213078Xv;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.feed.homepage.NowListFragmentPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC213048Xs<R extends InterfaceC213058Xt<R, ITEM>, ITEM extends InterfaceC213078Xv> extends AbstractC213068Xu<R, ITEM> {
    public final Fragment LIZJ;
    public final String LIZLLL;

    @Override // X.AbstractC213068Xu, X.C8YB
    public final void LIZ(List list) {
        super.LIZ(list);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Z89.LIZIZ.LIZIZ((Aweme) it.next())) {
                NowListFragmentPanel LIZIZ = NowListFragmentPanel.LJLJLJ.LIZIZ(this.LIZJ, this.LIZ, this.LIZLLL, "feed");
                if (LIZIZ == null) {
                    return;
                }
                List<C197057oL> LLILLL = C44384HbQ.LLILLL(list);
                if (((ArrayList) LLILLL).isEmpty()) {
                    return;
                }
                LIZIZ.getPlayer().LJIJ(LLILLL);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC213048Xs(Fragment fragment, AbstractC55082Lja adapter, String eventType) {
        super(adapter);
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(eventType, "eventType");
        this.LIZJ = fragment;
        this.LIZLLL = eventType;
    }

    @Override // X.AbstractC213068Xu
    public final String LJ(ITEM item, R r, int i) {
        o.LJIIIZ(item, "item");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(item);
        LIZ.append(", position: ");
        LIZ.append(i);
        LIZ.append(", event type: ");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }
}
