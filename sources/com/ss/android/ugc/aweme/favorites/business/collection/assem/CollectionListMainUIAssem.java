package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.AbstractC029409q;
import X.C0A2;
import X.C192157gR;
import X.C192697hJ;
import X.C192727hM;
import X.C192777hR;
import X.C1FJ;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C42625Go9;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8HS;
import X.C9BE;
import X.C9XU;
import X.G27;
import X.LFH;
import X.O6R;
import X.QD3;
import X.TBT;
import Y.IDcS7S0200000_3;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class CollectionListMainUIAssem extends UIContentAssem implements G27 {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public CollectionListMainUIAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 257), C192777hR.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 255));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 256));
    }

    public final VideoCollectionListViewModel v3() {
        return (VideoCollectionListViewModel) this.LJLIL.getValue();
    }

    public final int x3() {
        return LFH.LIZIZ.LIZLLL().LJIIIZ().LJJIZ(2, 0);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
        C9XU.LIZLLL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.MK7, X.7hJ, X.09q] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        RecyclerView recyclerView = (RecyclerView) view;
        C26338AVi.LJIIIZ(recyclerView, C1FJ.LIZIZ(12), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, 26);
        ?? r2 = new C8HS<C192727hM>() { // from class: X.7hJ
            {
                super(false, 1, null);
            }

            @Override // X.C4II
            public final int getBasicItemViewType(int i) {
                C192727hM c192727hM;
                List<C192727hM> data = getData();
                if (data != null && (c192727hM = (C192727hM) ORZ.LJLLLLLL(i, data)) != null) {
                    return c192727hM.LJLILLLLZI;
                }
                return 2;
            }

            @Override // X.C4II
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C192727hM c192727hM;
                final int i2;
                String str;
                String str2;
                UrlModel urlModel;
                List<String> urlList;
                Integer num;
                CollectionDetail.Status status;
                Integer num2;
                List<C192727hM> data = getData();
                if (data == null || (c192727hM = (C192727hM) ORZ.LJLLLLLL(i, data)) == null) {
                    return;
                }
                if (viewHolder instanceof C192717hL) {
                    C192717hL c192717hL = (C192717hL) viewHolder;
                    View itemView = c192717hL.itemView;
                    o.LJIIIIZZ(itemView, "itemView");
                    C16880lQ.LJIIJ(new IDaS483S0100000_3(c192717hL.LJLIL, 30, 42, 42), itemView);
                    return;
                }
                if (viewHolder instanceof C192707hK) {
                    final C192707hK c192707hK = (C192707hK) viewHolder;
                    final CollectionDetail detail = c192727hM.LJLIL;
                    List<C192727hM> data2 = getData();
                    Long l = null;
                    int i3 = 0;
                    if (data2 != null) {
                        if (data2.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator<C192727hM> it = data2.iterator();
                            i2 = 0;
                            while (it.hasNext()) {
                                if (it.next().LJLILLLLZI == 2 && (i2 = i2 + 1) < 0) {
                                    C47261Igj.LJJJJIZL();
                                    throw null;
                                }
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    c192707hK.getClass();
                    o.LJIIIZ(detail, "detail");
                    int i4 = 4;
                    if (C99W.LIZ) {
                        c192707hK.LJLIL.setRadius(C32151Nz.LJIIZILJ(4));
                    }
                    if (!((Boolean) c192707hK.LJLJJLL.LJLJI.getValue()).booleanValue() || (((status = detail.status) != null && (num2 = status.state) != null && num2.intValue() == 3) || !C192307gg.LIZ())) {
                        c192707hK.LJLJJL.setVisibility(4);
                    } else {
                        c192707hK.LJLJJL.setVisibility(0);
                    }
                    OSZ[] oszArr = new OSZ[5];
                    oszArr[0] = new OSZ("collection_id", detail.id);
                    oszArr[1] = new OSZ("collection_name", detail.name);
                    oszArr[2] = new OSZ("enter_from", c192707hK.LJLJJLL.v3().LJLJI);
                    CollectionDetail.Statistic statistic = detail.statistic;
                    if (statistic != null) {
                        l = statistic.total;
                    }
                    oszArr[3] = new OSZ("video_cnt", String.valueOf(l));
                    CollectionDetail.Status status2 = detail.status;
                    if (status2 == null || (num = status2.state) == null || num.intValue() != 3) {
                        str = "off";
                    } else {
                        str = "on";
                    }
                    oszArr[4] = new OSZ("public_status", str);
                    final java.util.Map LJJL = C113554cx.LJJL(oszArr);
                    FMX.LJIIL("show_collection", LJJL);
                    c192707hK.LJLILLLLZI.setText(detail.name);
                    TextView textView = c192707hK.LJLILLLLZI;
                    if (!C90193gN.LIZIZ(c192707hK.LJLJJLL.getContext())) {
                        i4 = 3;
                    }
                    textView.setTextDirection(i4);
                    List<UrlModel> list = detail.covers;
                    if (list == null || (urlModel = (UrlModel) ORZ.LJLLLLLL(0, list)) == null || (urlList = urlModel.getUrlList()) == null || (str2 = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
                        str2 = "";
                    }
                    View view2 = c192707hK.LJLJJI;
                    if (str2.length() != 0) {
                        i3 = 8;
                    }
                    view2.setVisibility(i3);
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                    LJIIIIZZ.LJJIIJ = c192707hK.LJLJI;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                    View view3 = c192707hK.itemView;
                    final CollectionListMainUIAssem collectionListMainUIAssem = c192707hK.LJLJJLL;
                    C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7h7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            Integer num3;
                            long j;
                            Long l2;
                            M8L.LIZ("click collection");
                            FMX.LJIIL("click_collection", LJJL);
                            HT5.LIZ = true;
                            SmartRoute buildRoute = SmartRouter.buildRoute(collectionListMainUIAssem.getContext(), "//favorite/videos/collections/content");
                            buildRoute.withParam("name", detail.name);
                            buildRoute.withParam("collectionCount", i2);
                            buildRoute.withParam("collection_id", detail.id);
                            buildRoute.withParam("enter_from", collectionListMainUIAssem.v3().LJLJI);
                            CollectionDetail.Status status3 = detail.status;
                            if (status3 != null) {
                                num3 = status3.state;
                            } else {
                                num3 = null;
                            }
                            buildRoute.withParam("state", num3);
                            CollectionDetail.Statistic statistic2 = detail.statistic;
                            if (statistic2 != null && (l2 = statistic2.total) != null) {
                                j = l2.longValue();
                            } else {
                                j = 0;
                            }
                            buildRoute.withParam("total", j);
                            buildRoute.withParam("uid", collectionListMainUIAssem.v3().LJLIL);
                            buildRoute.withParam("creator_name", detail.creatorName);
                            buildRoute.withParam("index", c192707hK.getLayoutPosition());
                            buildRoute.open();
                        }
                    }, view3);
                    return;
                }
                throw new Exception("not match view type");
            }

            @Override // X.C4II
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
                o.LJIIIZ(parent, "parent");
                if (i == 0) {
                    return new C192717hL(CollectionListMainUIAssem.this, parent);
                }
                if (i == 2) {
                    return new C192707hK(CollectionListMainUIAssem.this, parent);
                }
                throw new Exception("not match view type");
            }
        };
        r2.setLoadMoreListener(new AqS150S0200000_3((C192697hJ) r2, this, 32));
        r2.spanSizeLookup = new IDcS7S0200000_3(r2, this, 1);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(x3()));
        recyclerView.setAdapter(r2);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.7hQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192847hY) obj).LJLIL;
            }
        }, null, new AqS169S0100000_3(recyclerView, 125), new AqS150S0200000_3(recyclerView, (C192697hJ) r2, 31), new AqS107S0300000_3((C192697hJ) r2, recyclerView, this, 9), 2, null);
        C42625Go9.LIZIZ(this);
        C9XU.LIZJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void updateVideoCollectionPrivacy(C192157gR event) {
        RecyclerView recyclerView;
        C8HS c8hs;
        C192727hM c192727hM;
        int i;
        Object obj;
        CollectionDetail collectionDetail;
        CollectionDetail.Status status;
        int i2;
        o.LJIIIZ(event, "event");
        View containerView = getContainerView();
        if (!(containerView instanceof RecyclerView) || (recyclerView = (RecyclerView) containerView) == null) {
            return;
        }
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (!(adapter instanceof C192697hJ) || (c8hs = (C8HS) adapter) == null) {
            return;
        }
        List data = c8hs.getData();
        if (data != null) {
            Iterator it = data.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((C192727hM) obj).LJLIL.id, event.LJLIL)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c192727hM = (C192727hM) obj;
            if (c192727hM != null && (collectionDetail = c192727hM.LJLIL) != null && (status = collectionDetail.status) != null) {
                if (event.LJLILLLLZI) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
                status.state = i2;
            }
        } else {
            c192727hM = null;
        }
        List data2 = c8hs.getData();
        if (data2 != null) {
            i = data2.indexOf(c192727hM);
        } else {
            i = 0;
        }
        c8hs.notifyItemChanged(i);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        GridLayoutManager gridLayoutManager;
        RecyclerView recyclerView;
        o.LJIIIZ(newConfig, "newConfig");
        View containerView = getContainerView();
        C0A2 c0a2 = null;
        if ((containerView instanceof RecyclerView) && (recyclerView = (RecyclerView) containerView) != null) {
            c0a2 = recyclerView.getLayoutManager();
        }
        if (!(c0a2 instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) c0a2) == null) {
            return;
        }
        gridLayoutManager.LLJLIL(x3());
    }
}
