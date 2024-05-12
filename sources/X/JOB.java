package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JOB<T> implements InterfaceC15040iS {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ JVP LIZIZ;
    public final /* synthetic */ C50420Jqa LIZJ;
    public final /* synthetic */ Aweme LIZLLL;

    public JOB(boolean z, JVP jvp, C50420Jqa c50420Jqa, Aweme aweme) {
        this.LIZ = z;
        this.LIZIZ = jvp;
        this.LIZJ = c50420Jqa;
        this.LIZLLL = aweme;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        SearchVideoHolder searchVideoHolder;
        String str;
        long j;
        Aweme aweme;
        String aid;
        long j2;
        Aweme aweme2;
        String aid2;
        JP9 jp9;
        JQO LIZ;
        JOA joa;
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
        Long l = null;
        if ((viewHolder instanceof SearchVideoHolder) && (searchVideoHolder = (SearchVideoHolder) viewHolder) != null) {
            boolean z = this.LIZ;
            JVP jvp = this.LIZIZ;
            C50420Jqa event = this.LIZJ;
            Aweme aweme3 = this.LIZLLL;
            if (z) {
                C49068JNo.LJLJLJ.getClass();
                if (C49068JNo.LJJIZ() == 0) {
                    JOA joa2 = searchVideoHolder.LLILLIZIL;
                    if (joa2 != null && (LIZ = joa2.LIZ()) != null && LIZ.getVisibility() == 0 && (joa = searchVideoHolder.LLILLIZIL) != null) {
                        JQO LIZ2 = joa.LIZ();
                        if (LIZ2 != null) {
                            LIZ2.LIZ();
                        }
                        joa.LIZ.reset();
                    }
                } else {
                    ClickSearchViewModel clickSearchViewModel = jvp.LJLLJ;
                    if (clickSearchViewModel != null && (jp9 = clickSearchViewModel.LJLJJL) != null) {
                        ((SearchServiceCenter$AdapterControlAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIJ(searchVideoHolder), SearchServiceCenter$AdapterControlAbility.class)).c10(jp9);
                    }
                }
            }
            if (C50989Jzl.LJI(jvp.LJLIL.getContext())) {
                if (aweme3 == null || (str = aweme3.getAid()) == null) {
                    str = "";
                }
                jvp.LJZ(str);
                o.LJIIIZ(event, "event");
                searchVideoHolder.F0();
                if (!C46446IKs.LJLJLJ) {
                    JQT jqt = searchVideoHolder.LLJILJIL;
                    if (jqt != null) {
                        Object obj2 = event.LJLILLLLZI;
                        if (!(obj2 instanceof Aweme) || (aweme2 = (Aweme) obj2) == null || (aid2 = aweme2.getAid()) == null) {
                            j2 = -1;
                        } else {
                            Object obj3 = ((java.util.Map) jqt.LJLJLLL.getValue()).get(aid2);
                            if (obj3 == null) {
                                obj3 = -1L;
                            }
                            j2 = ((Number) obj3).longValue();
                        }
                        l = Long.valueOf(j2);
                    }
                } else {
                    JOD p0 = searchVideoHolder.p0();
                    Object obj4 = event.LJLILLLLZI;
                    if (!(obj4 instanceof Aweme) || (aweme = (Aweme) obj4) == null || (aid = aweme.getAid()) == null) {
                        p0.getClass();
                        j = -1;
                    } else {
                        Object obj5 = ((java.util.Map) p0.LJLJI.getValue()).get(aid);
                        if (obj5 == null) {
                            obj5 = -1L;
                        }
                        j = ((Number) obj5).longValue();
                    }
                    l = Long.valueOf(j);
                }
                long j3 = event.LJLJJLL;
                long j4 = 0;
                if (j3 > 0 || (l != null && l.longValue() > 0)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (l != null && l.longValue() > 0) {
                        j3 = l.longValue();
                    }
                    j4 = currentTimeMillis - j3;
                }
                if (C49111JPf.LIZIZ(searchVideoHolder.LJLIL)) {
                    return;
                }
                searchVideoHolder.H0(j4);
            }
        }
    }
}
