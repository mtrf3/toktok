package com.ss.android.ugc.aweme.music.artist.ui;

import X.AbstractC030309z;
import X.C214298b3;
import X.C221108m2;
import X.C236139On;
import X.C236609Qi;
import X.C236629Qk;
import X.C236639Ql;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.C9BK;
import X.C9BM;
import X.C9GN;
import X.InterfaceC198557ql;
import X.KL2;
import X.SYL;
import X.TBT;
import Y.IDcS36S0100000_4;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.music.artist.powerlist.ArtistMusicAwemeCell;
import com.ss.android.ugc.aweme.music.artist.powerlist.ArtistMusicAwemeLisHintCell;
import com.ss.android.ugc.aweme.music.artist.powerlist.ArtistMusicStartRecordCell;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArtistMusicAwemeListAssem extends UIListContentAssem<ArtistMusicFeaturedVideoViewModel> implements C9GN {
    public static final C236629Qk LJLJJLL = new Object() { // from class: X.9Qk
    };
    public WrapGridLayoutManager LJLJI;
    public final C214298b3 LJLJJL;
    public final C5H3 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 393));
    public final C5H3 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 391));
    public final C55749LuL LJLJJI = new C55749LuL(C47704Ins.LJ(this, C236139On.class, "hierarchy_data_artist_music"), checkSupervisorPrepared());

    public ArtistMusicAwemeListAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ArtistMusicFeaturedVideoViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 392), C236609Qi.INSTANCE, null);
    }

    @Override // X.C9GN, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final AbstractC030309z E3() {
        final int LIZJ = (int) KL2.LIZJ(getContainerView().getContext(), 1.5f);
        return new AbstractC030309z(LIZJ) { // from class: X.4lN
            public final int LJLIL;

            {
                this.LJLIL = LIZJ;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
                GridLayoutManager gridLayoutManager;
                AbstractC028509h abstractC028509h;
                o.LJIIIZ(outRect, "outRect");
                o.LJIIIZ(view, "view");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                C0A2 layoutManager = parent.getLayoutManager();
                if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null || (abstractC028509h = gridLayoutManager.LLIILII) == null) {
                    return;
                }
                int LJJJJIZL = RecyclerView.LJJJJIZL(view);
                int i = gridLayoutManager.LLIIIL;
                if (abstractC028509h.LJFF(LJJJJIZL) == 1) {
                    int LJ = abstractC028509h.LJ(LJJJJIZL, i);
                    int i2 = this.LJLIL;
                    outRect.left = (LJ * i2) / i;
                    outRect.right = i2 - (((LJ + 1) * i2) / i);
                    if (abstractC028509h.LIZLLL(LJJJJIZL, i) > 0) {
                        outRect.top = this.LJLIL;
                    }
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9Ql] */
    @Override // X.C8VB
    /* renamed from: C3, reason: merged with bridge method [inline-methods] */
    public C236639Ql defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9Ql
        };
    }

    public final C236139On F3() {
        return (C236139On) this.LJLJJI.getValue();
    }

    public final C73305Spp H3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: I3, reason: merged with bridge method [inline-methods] */
    public ArtistMusicFeaturedVideoViewModel A3() {
        return (ArtistMusicFeaturedVideoViewModel) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public SYL v3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = true;
        c57939MoZ.LIZ = 3;
        return c57939MoZ;
    }

    private final void K3() {
        SYL v3 = v3();
        v3.LLLF.LJZL(ArtistMusicAwemeLisHintCell.class, ArtistMusicStartRecordCell.class, ArtistMusicAwemeCell.class);
        v3.setItemAnimator(null);
        getContainerView().getContext();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 1, false);
        wrapGridLayoutManager.LLIILII = new IDcS36S0100000_4(wrapGridLayoutManager, 1);
        this.LJLJI = wrapGridLayoutManager;
        v3().setLayoutManager(this.LJLJI);
        v3().LJII(E3(), -1);
    }

    @Override // X.C9GN
    public String Zk() {
        return A3().LJLJI;
    }

    public final void d6(boolean z) {
        ((C9BK) C8VC.LIZ(this, C65352Pkq.LIZ(C9BK.class), null)).d6(z);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        K3();
        super.onViewCreated(view);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9Qj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239839b9) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 105), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9Fv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239839b9) obj).LJLILLLLZI;
            }
        }, null, new AqS186S0100000_4(this, 106), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9Gh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239839b9) obj).LJLJI;
            }
        }, null, new AqS186S0100000_4(this, 107), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9CB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239839b9) obj).LJLJJI;
            }
        }, null, C9BM.LJLIL, 6);
    }

    public static /* synthetic */ void L3(ArtistMusicAwemeListAssem artistMusicAwemeListAssem, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        artistMusicAwemeListAssem.d6(z);
    }
}
