package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.JLa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49002JLa<T> implements InterfaceC49318JXe<C50420Jqa> {
    public final AbstractC029409q<?> LIZ;
    public final java.util.Map<String, OSZ<Integer, Aweme>> LIZIZ;
    public final C62822Ol8 LIZJ;

    @Override // X.InterfaceC49318JXe
    public final Class<C50420Jqa> LIZ() {
        return C50420Jqa.class;
    }

    public C49002JLa(AbstractC029409q<?> adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LIZ = adapter;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = C221108m2.LIZIZ(JJU.LJLIL);
        C49314JXa.LIZJ.LIZ(this);
    }

    @Override // X.InterfaceC49318JXe
    public final void LIZIZ(C50420Jqa c50420Jqa) {
        Integer valueOf;
        Integer valueOf2;
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
                    if (bundle != null && (valueOf2 = Integer.valueOf(bundle.getInt("user_digged"))) != null) {
                        aweme.setUserDigg(valueOf2.intValue());
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
            Iterator<Map.Entry<Object, ContinuousLoadingAwemeList>> it2 = JT6.LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                List<Aweme> list = it2.next().getValue().awemeList;
                if (list != null) {
                    for (Aweme aweme2 : list) {
                        if (o.LJ(aweme2.getAid(), event.LJLILLLLZI)) {
                            Bundle bundle2 = event.LJLJI;
                            if (bundle2 != null && (valueOf = Integer.valueOf(bundle2.getInt("user_digged"))) != null) {
                                aweme2.setUserDigg(valueOf.intValue());
                            }
                            if (i6 != null) {
                                aweme2.setUserDigg(i6.getUserDigg());
                                AwemeStatistics statistics2 = i6.getStatistics();
                                if (statistics2 != null) {
                                    aweme2.getStatistics().setDiggCount(statistics2.getDiggCount());
                                }
                            }
                        }
                    }
                }
            }
            OSZ osz = (OSZ) ((LinkedHashMap) this.LIZIZ).get(event.LJLILLLLZI);
            if (osz != null) {
                this.LIZ.notifyItemChanged(((Number) osz.getFirst()).intValue());
            }
        }
    }

    public final void LIZJ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        ((LinkedHashMap) this.LIZIZ).clear();
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme aweme = (Aweme) interfaceC88472Yns.invoke(obj);
                    if (aweme != null) {
                        java.util.Map<String, OSZ<Integer, Aweme>> map = this.LIZIZ;
                        String aid = aweme.getAid();
                        o.LJIIIIZZ(aid, "it.aid");
                        map.put(aid, new OSZ<>(Integer.valueOf(i), aweme));
                        Object value = this.LIZJ.getValue();
                        o.LJIIIIZZ(value, "<get-mAwemeManager>(...)");
                        ((IAwemeService) value).R1(aweme);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }
}
