package com.ss.android.ugc.aweme.poi.detail.basicinfo;

import X.C187127Wa;
import X.C189867ck;
import X.C189887cm;
import X.C190497dl;
import X.C214298b3;
import X.C2K0;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.QD3;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class PoiDetailInfoAssem extends PoiDetailBaseAssem implements IPoiDetailInfoVAbility, InterfaceC55102Lju {
    public final C214298b3 LJLLI;
    public final C55749LuL LJLLILLLL;
    public boolean LJLLJ;

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean L3() {
        return true;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1013447067) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0g;
    }

    public PoiDetailInfoAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 707), C189867ck.INSTANCE, null);
        this.LJLLILLLL = new C55749LuL(C47704Ins.LIZJ(this, C190497dl.class, "PoiVideoListHierarchyData"), checkSupervisorPrepared());
    }

    public final C190497dl N3() {
        return (C190497dl) this.LJLLILLLL.getValue();
    }

    public final PoiDetailInfoViewModel O3() {
        return (PoiDetailInfoViewModel) this.LJLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final PoiListApi.PoiDetailResponse EO() {
        return O3().LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final String G20() {
        return N3().LJLJLJ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        String G20 = G20();
        if (G20 != null) {
            PoiDetailInfoViewModel O3 = O3();
            O3.getClass();
            O3.withState(new C189887cm(O3, G20, System.currentTimeMillis()));
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final String vu0() {
        return N3().LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final boolean w4() {
        PoiListApi.PoiDetailResponse poiDetailResponse = O3().LJLILLLLZI;
        if (poiDetailResponse != null) {
            return poiDetailResponse.isCollected;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final boolean in0() {
        return this.LJLLJ;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility
    public final void jm(boolean z) {
        PoiAnchorData poiAnchorData;
        PoiDetailInfoViewModel O3 = O3();
        PoiAnchorData poiAnchorData2 = O3().LJLJI;
        PoiListApi.PoiDetailResponse poiDetailResponse = null;
        if (poiAnchorData2 != null) {
            poiAnchorData = PoiAnchorData.copy$default(poiAnchorData2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, null, null, null, null, null, null, 4161535, null);
        } else {
            poiAnchorData = null;
        }
        O3.LJLJI = poiAnchorData;
        PoiDetailInfoViewModel O32 = O3();
        PoiListApi.PoiDetailResponse poiDetailResponse2 = O3().LJLILLLLZI;
        if (poiDetailResponse2 != null) {
            poiDetailResponse = PoiListApi.PoiDetailResponse.LJ(poiDetailResponse2, null, z, 134217711);
        }
        O32.LJLILLLLZI = poiDetailResponse;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C187127Wa event) {
        o.LJIIIZ(event, "event");
        if (!o.LJ(G20(), event.LJLILLLLZI)) {
            return;
        }
        PoiDetailInfoViewModel O3 = O3();
        PoiListApi.PoiDetailResponse poiDetailResponse = O3().LJLILLLLZI;
        PoiListApi.PoiDetailResponse poiDetailResponse2 = null;
        if (poiDetailResponse != null) {
            poiDetailResponse2 = PoiListApi.PoiDetailResponse.LJ(poiDetailResponse, null, event.LJLIL, 134217711);
        }
        O3.LJLILLLLZI = poiDetailResponse2;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        String str = N3().LJLJLJ;
        if (str == null) {
            return;
        }
        O3().LJLIL = str;
        O3().LJLJI = N3().LJLJI;
        AssemViewModel.asyncSubscribe$default(O3(), new TBT() { // from class: X.7cl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C189907co) obj).LJLIL;
            }
        }, null, new AqS169S0100000_3(this, 379), new AqS153S0100000_3(this, 706), new AqS57S1100000_3(this, str, 9), 2, null);
        PoiDetailInfoViewModel O3 = O3();
        O3.getClass();
        O3.withState(new C189887cm(O3, str, System.currentTimeMillis()));
    }
}
