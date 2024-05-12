package com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2;

import X.AbstractC030309z;
import X.C0A6;
import X.C16880lQ;
import X.C1DF;
import X.C221108m2;
import X.C32I;
import X.C44416Hbw;
import X.C56584MIq;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.EnumC58762N4k;
import X.InterfaceC41034G8o;
import X.InterfaceC74236TBo;
import X.N4C;
import X.N4D;
import X.N4T;
import X.N4Z;
import X.N5C;
import X.N5D;
import X.N5F;
import X.N5H;
import X.N90;
import X.NE2;
import X.NFK;
import X.OF1;
import X.TBT;
import X.V0N;
import X.XKX;
import X.XLM;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceMusicSubstituteMusicListFragment extends Fragment implements InterfaceC41034G8o<N5D> {
    public static final N5H LJLJJLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public N5D LJLIL;
    public final OF1 LJLILLLLZI;
    public final OF1 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    static {
        TBT tbt = new TBT(CommerceMusicSubstituteMusicListFragment.class, "musicDetail", "getMusicDetail()Lcom/ss/android/ugc/aweme/music/model/MusicDetail;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, new TBT(CommerceMusicSubstituteMusicListFragment.class, "logger", "getLogger()Lcom/ss/android/ugc/aweme/commercialize/media/impl/logging/CommerceMusicLogger;", 0)};
        LJLJJLL = new N5H();
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public CommerceMusicSubstituteMusicListFragment() {
        super(R.layout.a8a);
        this.LJLILLLLZI = C1DF.LJJIFFI(this, N5F.LJLIL);
        this.LJLJI = C1DF.LJJIFFI(this, N5C.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 90));
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ScopedMusicPlayer scopedMusicPlayer = ((CommerceMusicSubstituteMusicListViewModel) this.LJLJJI.getValue()).LJLILLLLZI;
        if (scopedMusicPlayer != null) {
            scopedMusicPlayer.pause();
        } else {
            o.LJIJI("musicPlayer");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ?? r6;
        String str;
        super.onCreate(bundle);
        CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel = (CommerceMusicSubstituteMusicListViewModel) this.LJLJJI.getValue();
        MusicDetail musicDetail = (MusicDetail) this.LJLILLLLZI.LIZ(this, LJLJL[0]);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "this.requireContext()");
        ScopedMusicPlayer scopedMusicPlayer = new ScopedMusicPlayer(requireContext, this);
        CommerceMusicLogger logger = vl();
        commerceMusicSubstituteMusicListViewModel.getClass();
        o.LJIIIZ(musicDetail, "musicDetail");
        o.LJIIIZ(logger, "logger");
        commerceMusicSubstituteMusicListViewModel.LJLIL = musicDetail;
        commerceMusicSubstituteMusicListViewModel.LJLILLLLZI = scopedMusicPlayer;
        commerceMusicSubstituteMusicListViewModel.LJLJI = logger;
        XLM xlm = commerceMusicSubstituteMusicListViewModel.LJLJJLL;
        List<Music> list = musicDetail.recommendMusicList;
        if (list != null) {
            r6 = new ArrayList(C32I.LJJL(list, 10));
            for (Music music : list) {
                String musicName = music.getMusicName();
                o.LJIIIIZZ(musicName, "music.musicName");
                String authorName = music.getAuthorName();
                o.LJIIIIZZ(authorName, "music.authorName");
                int duration = music.getDuration();
                int userCount = music.getUserCount();
                String recommendTag = music.getRecommendTag();
                UrlModel coverMedium = music.getCoverMedium();
                o.LJIIIIZZ(coverMedium, "music.coverMedium");
                String LJIILL = V0N.LJIILL(coverMedium);
                if (LJIILL == null) {
                    UrlModel coverLarge = music.getCoverLarge();
                    o.LJIIIIZZ(coverLarge, "music.coverLarge");
                    LJIILL = V0N.LJIILL(coverLarge);
                    if (LJIILL == null) {
                        UrlModel coverThumb = music.getCoverThumb();
                        o.LJIIIIZZ(coverThumb, "music.coverThumb");
                        LJIILL = V0N.LJIILL(coverThumb);
                    }
                }
                r6.add(new NFK(musicName, authorName, duration, userCount, recommendTag, LJIILL, N4Z.PAUSED));
            }
        } else {
            r6 = C61878OQg.INSTANCE;
        }
        Music music2 = musicDetail.music;
        if (music2 == null || (str = music2.getMusicName()) == null) {
            str = "";
        }
        xlm.setValue(new N4T(str, r6, true));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(commerceMusicSubstituteMusicListViewModel), null, null, new NE2(commerceMusicSubstituteMusicListViewModel, null), 3);
        CommerceMusicLogger vl = vl();
        N4D.LIZ.getClass();
        vl.LJII(N4D.LJIIJJI, EnumC58762N4k.NEW_UI_2_MUSIC_LIST_SHEET);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        CommerceMusicLogger vl = vl();
        N4C.LIZ.getClass();
        vl.LIZIZ(N4C.LJI);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.iqj);
        final View findViewById = view.findViewById(R.id.krm);
        recyclerView.setAdapter(new N90((CommerceMusicSubstituteMusicListViewModel) this.LJLJJI.getValue(), this, vl(), new AqS141S0200000_10(this, recyclerView, 7)));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        C44416Hbw.LJ(recyclerView, new AbstractC030309z() { // from class: X.49Q
            public final int LJLIL;
            public final int LJLILLLLZI;

            {
                Float valueOf = Float.valueOf(0.0f);
                this.LJLIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
                this.LJLILLLLZI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                T28.LJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state");
                super.LJ(rect, view2, recyclerView2, c0ac);
                AbstractC029409q adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    int itemCount = adapter.getItemCount();
                    int LJJJJIZL = RecyclerView.LJJJJIZL(view2);
                    if (LJJJJIZL == 0) {
                        rect.top = this.LJLILLLLZI;
                        rect.bottom = this.LJLIL / 2;
                    } else if (LJJJJIZL == itemCount - 1) {
                        int i = this.LJLIL;
                        rect.top = i / 2;
                        rect.bottom = i;
                    } else {
                        int i2 = this.LJLIL / 2;
                        rect.top = i2;
                        rect.bottom = i2;
                    }
                }
            }
        });
        recyclerView.setVisibility(0);
        C56584MIq.LIZ(vl(), N4C.LJIIIZ, recyclerView, new AqS192S0100000_10(this, 8));
        recyclerView.LJIIJJI(new C0A6() { // from class: X.8HM
            public int LJLIL;

            @Override // X.C0A6
            public final void LJIILL(RecyclerView recyclerView2, int i, int i2) {
                o.LJIIIZ(recyclerView2, "recyclerView");
                this.LJLIL += i2;
                View view2 = findViewById;
                GradientDrawable gradientDrawable = new GradientDrawable();
                RecyclerView recyclerView3 = recyclerView;
                gradientDrawable.setShape(1);
                Context context = recyclerView3.getContext();
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.cf, context);
                if (LJI != null) {
                    LJI.intValue();
                }
                gradientDrawable.setColor(Integer.valueOf(Color.argb(C78842Uww.LJIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(this.LJLIL))) / 2, 0, 16), 22, 24, 35)).intValue());
                view2.setBackground(gradientDrawable);
            }
        });
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 31), findViewById);
    }
}
