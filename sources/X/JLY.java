package X;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JLY<T> implements InterfaceC49318JXe<C50420Jqa> {
    public final RecyclerView LIZ;
    public final java.util.Map<String, OSZ<Integer, Aweme>> LIZIZ;
    public final C62822Ol8 LIZJ;

    @Override // X.InterfaceC49318JXe
    public final Class<C50420Jqa> LIZ() {
        return C50420Jqa.class;
    }

    public JLY(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LIZ = recyclerView;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = C221108m2.LIZIZ(JKD.LJLIL);
        C49314JXa.LIZJ.LIZ(this);
    }

    @Override // X.InterfaceC49318JXe
    public final void LIZIZ(C50420Jqa c50420Jqa) {
        C48887JGp Q;
        C49153JQv mScrollStateManager;
        Integer valueOf;
        C50420Jqa event = c50420Jqa;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 13) {
            Object value = this.LIZJ.getValue();
            o.LJIIIIZZ(value, "<get-mAwemeManager>(...)");
            IAwemeService iAwemeService = (IAwemeService) value;
            String str = (String) event.LJLILLLLZI;
            if (str == null) {
                str = "";
            }
            Aweme i6 = iAwemeService.i6(str);
            Iterator it = ((LinkedHashMap) this.LIZIZ).entrySet().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) ((OSZ) ((Map.Entry) it.next()).getValue()).getSecond();
                if (o.LJ(aweme.getAid(), event.LJLILLLLZI)) {
                    Bundle bundle = event.LJLJI;
                    if (bundle != null && (valueOf = Integer.valueOf(bundle.getInt("user_digged"))) != null) {
                        aweme.setUserDigg(valueOf.intValue());
                    }
                    if (i6 != null) {
                        aweme.setUserDigg(i6.getUserDigg());
                        AwemeStatistics statistics = i6.getStatistics();
                        if (statistics != null) {
                            aweme.getStatistics().setDiggCount(statistics.getDiggCount());
                        }
                    }
                }
            }
            OSZ osz = (OSZ) ((LinkedHashMap) this.LIZIZ).get(event.LJLILLLLZI);
            if (osz != null) {
                RecyclerView.ViewHolder LJJIZ = this.LIZ.LJJIZ(((Number) osz.getFirst()).intValue());
                if (LJJIZ != null && (LJJIZ instanceof JKB) && (Q = ((AbstractC48958JJi) LJJIZ).Q()) != null && (mScrollStateManager = Q.getMScrollStateManager()) != null) {
                    mScrollStateManager.LJIIIIZZ(Q.getMScrollStateObserver());
                }
                AbstractC029409q adapter = this.LIZ.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(((Number) osz.getFirst()).intValue());
                }
            }
        }
    }
}
