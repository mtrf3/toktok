package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.C192727hM;
import X.C192737hN;
import X.C192817hV;
import X.C192827hW;
import X.C192857hZ;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8HS;
import X.C9BE;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListChooseAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionListChooseAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C55749LuL LJLJI;

    public CollectionListChooseAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 254), C192827hW.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 253));
        this.LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C192817hV.class, null), checkSupervisorPrepared());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.7hN, X.MK7, X.09q] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        RecyclerView recyclerView = (RecyclerView) view;
        ?? r2 = new C8HS<C192727hM>() { // from class: X.7hN
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
                long j;
                String str;
                UrlModel urlModel;
                List<String> urlList;
                Long l;
                CollectionDetail.Status status;
                Integer num;
                List<C192727hM> data = getData();
                if (data == null || (c192727hM = (C192727hM) ORZ.LJLLLLLL(i, data)) == null) {
                    return;
                }
                if (viewHolder instanceof C192757hP) {
                    C192757hP c192757hP = (C192757hP) viewHolder;
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(c192757hP.LJLIL, 53), c192757hP.itemView);
                    return;
                }
                if (viewHolder instanceof C192747hO) {
                    C192747hO c192747hO = (C192747hO) viewHolder;
                    CollectionDetail t = c192727hM.LJLIL;
                    c192747hO.getClass();
                    o.LJIIIZ(t, "t");
                    c192747hO.LJLIL.setText(t.name);
                    int i2 = 3;
                    if (C192307gg.LIZ() && (status = t.status) != null && (num = status.state) != null && 1 == num.intValue()) {
                        Context context = c192747hO.LJLJJI.getContext();
                        if (context != null) {
                            SY9 sy9 = new SY9(context, R.raw.icon_lock_small);
                            sy9.setBounds(0, 0, C17N.LJIILL(15.0d), C17N.LJIILL(15.0d));
                            C8FR c8fr = new C8FR(sy9, 2);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  a");
                            spannableStringBuilder.setSpan(c8fr, 2, 3, 18);
                            c192747hO.LJLIL.append(spannableStringBuilder);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    TextView textView = c192747hO.LJLIL;
                    if (C90193gN.LIZIZ(c192747hO.LJLJJI.getContext())) {
                        i2 = 4;
                    }
                    textView.setTextDirection(i2);
                    CollectionDetail.Statistic statistic = t.statistic;
                    if (statistic != null && (l = statistic.total) != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    TextView textView2 = c192747hO.LJLJI;
                    textView2.setText(textView2.getContext().getResources().getQuantityString(R.plurals.fj, (int) j, String.valueOf(j)));
                    List<UrlModel> list = t.covers;
                    if (list == null || (urlModel = (UrlModel) ORZ.LJLLLLLL(0, list)) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
                        str = "";
                    }
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                    LJIIIIZZ.LJJIIJ = c192747hO.LJLILLLLZI;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                    C16880lQ.LJIIJ(new ACListenerS38S0200000_3(c192747hO.LJLJJI, t, 29), c192747hO.itemView);
                    return;
                }
                throw new Exception("not match view type");
            }

            @Override // X.C4II
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
                o.LJIIIZ(parent, "parent");
                if (i == 0) {
                    return new C192757hP(CollectionListChooseAssem.this, parent);
                }
                if (i == 2) {
                    return new C192747hO(CollectionListChooseAssem.this, parent);
                }
                throw new Exception("not match view type");
            }
        };
        r2.setLoadMoreListener(new AqS150S0200000_3((C192737hN) r2, this, 30));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(r2);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.7hU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192847hY) obj).LJLIL;
            }
        }, null, new AqS169S0100000_3(recyclerView, 124), new AqS150S0200000_3(recyclerView, (C192737hN) r2, 29), new AqS107S0300000_3((C192737hN) r2, recyclerView, this, 8), 2, null);
        VideoCollectionListViewModel videoCollectionListViewModel = (VideoCollectionListViewModel) this.LJLIL.getValue();
        videoCollectionListViewModel.withState(new C192857hZ(true, videoCollectionListViewModel, ((C192817hV) this.LJLJI.getValue()).LJLILLLLZI, ((C192817hV) this.LJLJI.getValue()).LJLJI));
    }
}
