package com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1;

import X.C16880lQ;
import X.C1DF;
import X.C221108m2;
import X.C32I;
import X.C44416Hbw;
import X.C4K2;
import X.C56584MIq;
import X.C58881N8z;
import X.C59010NDy;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.EnumC58762N4k;
import X.InterfaceC41034G8o;
import X.InterfaceC74236TBo;
import X.N4C;
import X.N4D;
import X.N4L;
import X.N4N;
import X.N4O;
import X.N5B;
import X.N5D;
import X.N5E;
import X.N5G;
import X.OF1;
import X.TBT;
import X.XLM;
import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceMusicSubstituteMusicVideoFragment extends Fragment implements InterfaceC41034G8o<N5D> {
    public static final N5G LJLJJLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public N5D LJLIL;
    public final OF1 LJLILLLLZI;
    public final OF1 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    static {
        TBT tbt = new TBT(CommerceMusicSubstituteMusicVideoFragment.class, "musicDetail", "getMusicDetail()Lcom/ss/android/ugc/aweme/music/model/MusicDetail;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, new TBT(CommerceMusicSubstituteMusicVideoFragment.class, "logger", "getLogger()Lcom/ss/android/ugc/aweme/commercialize/media/impl/logging/CommerceMusicLogger;", 0)};
        LJLJJLL = new N5G();
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public CommerceMusicSubstituteMusicVideoFragment() {
        super(R.layout.a8c);
        this.LJLILLLLZI = C1DF.LJJIFFI(this, N5E.LJLIL);
        this.LJLJI = C1DF.LJJIFFI(this, N5B.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 87));
    }

    @Override // X.InterfaceC41034G8o
    public final N5D L9() {
        N5D n5d = this.LJLIL;
        if (n5d != null) {
            return n5d;
        }
        o.LJIJI("depend");
        throw null;
    }

    public final CommerceMusicLogger vl() {
        return (CommerceMusicLogger) this.LJLJI.LIZ(this, LJLJL[1]);
    }

    public final CommerceMusicSubstituteMusicVideoViewModel wl() {
        return (CommerceMusicSubstituteMusicVideoViewModel) this.LJLJJI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        CommerceMusicSubstituteMusicVideoViewModel wl = wl();
        XLM xlm = wl.LJLJI;
        N4O n4o = (N4O) xlm.getValue();
        List<N4N> list = ((N4O) wl.LJLJI.getValue()).LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<N4N> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(N4N.L(it.next(), N4L.PAUSED));
        }
        xlm.setValue(N4O.L(n4o, arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ?? r4;
        String str;
        super.onCreate(bundle);
        CommerceMusicSubstituteMusicVideoViewModel wl = wl();
        MusicDetail musicDetail = (MusicDetail) this.LJLILLLLZI.LIZ(this, LJLJL[0]);
        wl.getClass();
        o.LJIIIZ(musicDetail, "musicDetail");
        wl.LJLIL = musicDetail;
        XLM xlm = wl.LJLJI;
        List<Aweme> list = musicDetail.aiRecommendVideoList;
        if (list != null) {
            r4 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                r4.add(new N4N(it.next(), N4L.INITIAL));
            }
        } else {
            r4 = C61878OQg.INSTANCE;
        }
        Music music = musicDetail.music;
        if (music == null || (str = music.getMusicName()) == null) {
            str = "";
        }
        xlm.setValue(new N4O(r4, str));
        CommerceMusicLogger vl = vl();
        N4D.LIZ.getClass();
        vl.LJII(N4D.LJIIJJI, EnumC58762N4k.NEW_UI_2_MV_LIST_SHEET);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        CommerceMusicLogger vl = vl();
        N4C.LIZ.getClass();
        vl.LIZIZ(N4C.LJI);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C59010NDy(this, (TextView) view.findViewById(R.id.krn), null));
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 23), view.findViewById(R.id.krm));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.iqj);
        recyclerView.setAdapter(new C58881N8z(wl(), this, vl(), new AqS141S0200000_10(this, recyclerView, 6)));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "context");
        C44416Hbw.LJ(recyclerView, new C4K2(8.0f, context));
        C56584MIq.LIZ(vl(), N4C.LJII, recyclerView, new AqS192S0100000_10(this, 7));
    }
}
