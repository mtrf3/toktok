package com.ss.android.ugc.aweme.commercialize.feed.assem.product;

import X.AbstractC030309z;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C240999d1;
import X.C38995FSd;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.C90193gN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.KL2;
import X.S5Q;
import X.S5R;
import X.S5T;
import X.S5U;
import X.S5V;
import X.SYL;
import X.TBT;
import Y.ARunnableS31S0200000_12;
import Y.IDrS50S0100000_12;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AdProductTileAssem extends BaseCellSlotComponent<AdProductTileAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIL;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;

    static {
        TBT tbt = new TBT(AdProductTileAssem.class, "tileVM", "getTileVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/product/AdProductTileVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.a_k;
    }

    public AdProductTileAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AdProductTileVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c240999d1, new AqS162S0100000_12(LIZ, 154), null, S5U.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), S5V.INSTANCE);
        this.LLIIJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 155));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 156));
    }

    public final SYL q4() {
        return (SYL) this.LLIIJI.getValue();
    }

    public final FrameLayout r4() {
        return (FrameLayout) this.LLIIJLIL.getValue();
    }

    public final AdProductTileVM u4() {
        return (AdProductTileVM) this.LLFII.LIZ(this, LLIIL[0]);
    }

    public final boolean B4() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AdProductTile productTile;
        VideoItemParams gv0 = u4().gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (productTile = awemeRawAd.getProductTile()) == null || productTile.getShowSeconds() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        Aweme aweme;
        q4().getState().LJFF();
        if (q4().getItemDecorationCount() > 0) {
            q4().LJJLJ(q4().getItemDecorationCount() - 1);
        }
        this.LLI = 0;
        this.LLIFFJFJJ = 0;
        this.LLIIIZ = false;
        VideoItemParams gv0 = u4().gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            aweme.setAdDescMaxLines(4);
        }
        z4();
    }

    public final void z4() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) q4().getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.LJFF(0, 0);
        }
        r4().setAlpha(1.0f);
        this.LLIIII = 0;
        this.LLIIIILZ = 0;
        this.LLIIIJ = Y3().getWidth();
        this.LLIIIL = false;
        this.LLII = false;
    }

    public final void A4(int i) {
        Y3().setVisibility(i);
        getContainerView().setVisibility(i);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        AdProductTile productTile;
        List<AdNativeProduct> productList;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        q4().LLLF.LJZL(AdProductTileCell.class);
        SYL q4 = q4();
        getContext();
        q4.setLayoutManager(new LinearLayoutManager(0, false));
        SYL q42 = q4();
        final int LIZJ = (int) KL2.LIZJ(getContext(), 4.0f);
        q42.LJII(new AbstractC030309z(LIZJ) { // from class: X.4Yl
            public final int LJLIL;

            {
                this.LJLIL = LIZJ;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                int LIZJ2 = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
                if (C90193gN.LIZ()) {
                    if (LIZJ2 != 0) {
                        rect.right = this.LJLIL;
                    }
                } else {
                    if (LIZJ2 == 0) {
                        return;
                    }
                    rect.left = this.LJLIL;
                }
            }
        }, -1);
        r4().setVisibility(8);
        if (C90193gN.LIZIZ(getContext())) {
            r4().setScaleX(-1.0f);
        } else {
            r4().setScaleX(1.0f);
        }
        if (B4()) {
            A4(0);
        } else {
            A4(8);
        }
        AwemeRawAd awemeRawAd = item.getAweme().getAwemeRawAd();
        if (awemeRawAd != null && (productTile = awemeRawAd.getProductTile()) != null && (productList = productTile.getProductList()) != null && (!productList.isEmpty())) {
            productList.size();
            C38995FSd.LIZLLL().execute(new ARunnableS31S0200000_12(this, productList, 27));
            if (B4()) {
                A4(0);
            } else {
                A4(8);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme == null || !C63081OpJ.LLJJL(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        q4().LJIIJJI(new IDrS50S0100000_12(this, 2));
        C8YN.LJII(this, u4(), new TBT() { // from class: X.8al
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C214098aj) obj).LJLIL;
            }
        }, C213688a4.LJ(), S5R.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.S5X
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LJ(), S5T.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.S5Y
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LJ(), S5Q.LJLIL, 4);
    }
}
