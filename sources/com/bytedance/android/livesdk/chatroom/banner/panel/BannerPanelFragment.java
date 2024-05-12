package com.bytedance.android.livesdk.chatroom.banner.panel;

import X.C0CM;
import X.C0KB;
import X.C0KK;
import X.C0KV;
import X.C117144ik;
import X.C15380j0;
import X.C1JD;
import X.C29706BlG;
import X.C30880CAa;
import X.C32044Chs;
import X.C32I;
import X.C61878OQg;
import X.C78496UrM;
import X.CAZ;
import X.InterfaceC40159FpT;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BannerPanelFragment extends LiveSheetFragment implements InterfaceC40159FpT {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public String LLD;
    public List<BannerPanelItem> LLF;
    public boolean LLFF;
    public C0CM LLFFF;
    public List<? extends C0KK> LLFZ;
    public final Map<Integer, View> LLI = new LinkedHashMap();
    public final SparseBooleanArray LLFII = new SparseBooleanArray();

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // X.NV7
    public final void refresh() {
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC40159FpT
    public final void close() {
        C32044Chs.LJFF(this.LJLZ.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<? extends X.0KK>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.OQg] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C0CM c0cm;
        int i;
        ?? arrayList;
        C0KV c0kv;
        View view = getView();
        if (view != null) {
            c0cm = (C0CM) view.findViewById(R.id.nb6);
        } else {
            c0cm = null;
        }
        this.LLFFF = c0cm;
        if (c0cm != null) {
            c0cm.LIZIZ(new CAZ(this));
        }
        C0CM c0cm2 = this.LLFFF;
        if (c0cm2 != null) {
            c0cm2.setUserInputEnabled(false);
        }
        List<BannerPanelItem> list = this.LLF;
        int i2 = -1;
        if (list != null && (!list.isEmpty())) {
            i = list.size();
        } else {
            i = -1;
        }
        C0KB c0kb = new C0KB();
        List<BannerPanelItem> list2 = this.LLF;
        if (list2 != null) {
            Iterator<BannerPanelItem> it = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(this.LLD, it.next().bannerId)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        List<BannerPanelItem> list3 = this.LLF;
        if (list3 == null) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            arrayList = new ArrayList(C32I.LJJL(list3, 10));
            for (BannerPanelItem bannerPanelItem : list3) {
                String str = bannerPanelItem.schema;
                SparkFragment sparkFragment = new SparkFragment();
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJIJLIJ(C29706BlG.LIZIZ(str));
                sparkContext.LJIJJ(this);
                Bundle bundle = new Bundle();
                bundle.putString("SparkContextContainerId", sparkContext.containerId);
                sparkFragment.setArguments(bundle);
                C117144ik.LIZIZ.getClass();
                C117144ik.LIZIZ(sparkContext);
                C0KK c0kk = new C0KK(sparkFragment, bannerPanelItem.title);
                c0kk.LJ = bannerPanelItem.isLight;
                c0kk.LJFF = true;
                c0kk.LIZLLL = bannerPanelItem.color;
                c0kk.LJI = 1;
                c0kk.LJII = C15380j0.LIZ(246.0f);
                arrayList.add(c0kk);
            }
        }
        this.LLFZ = arrayList;
        C0CM c0cm3 = this.LLFFF;
        c0kb.LJII = arrayList;
        c0kb.LJIIIIZZ = c0cm3;
        c0kb.LJIIIZ = i2;
        c0kb.LJIIJ = false;
        c0kb.LJIIJJI = i;
        c0kb.LIZ = null;
        c0kb.LIZIZ = null;
        c0kb.LJIIL = false;
        c0kb.LJI = false;
        View view2 = getView();
        if (view2 != null && (c0kv = (C0KV) view2.findViewById(R.id.kyt)) != null) {
            c0kv.setTabVisibilityChangeListener(new C30880CAa(this));
        }
        return c0kb;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        SparkFragment sparkFragment;
        super.onDestroy();
        C1JD.LJJIJL("live_banner_panel_dismiss", null, 6);
        List<? extends C0KK> list = this.LLFZ;
        if (list != null) {
            Iterator<? extends C0KK> it = list.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().LIZJ;
                if ((fragment instanceof SparkFragment) && (sparkFragment = (SparkFragment) fragment) != null) {
                    sparkFragment.finish();
                }
            }
        }
        this.LLFZ = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        ArrayList arrayList = null;
        if (arguments != null) {
            str = arguments.getString("focus_banner_id");
        } else {
            str = null;
        }
        this.LLD = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arrayList = arguments2.getParcelableArrayList("banner_list");
        }
        this.LLF = arrayList;
        Bundle arguments3 = getArguments();
        boolean z = false;
        if (arguments3 != null) {
            z = arguments3.getBoolean("is_anchor", false);
        }
        this.LLFF = z;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.dg2, viewGroup, false, "inflater.inflate(R.layou…banner, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
    }
}
