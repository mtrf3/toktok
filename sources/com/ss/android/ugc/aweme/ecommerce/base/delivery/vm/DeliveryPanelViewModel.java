package com.ss.android.ugc.aweme.ecommerce.base.delivery.vm;

import X.C26943Ahn;
import X.C26944Aho;
import X.C26951Ahv;
import X.C26952Ahw;
import X.C27090AkA;
import X.C27739Aud;
import X.C61878OQg;
import X.C76800UCe;
import X.EnumC26931Ahb;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.os.Parcelable;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DeliveryPanelViewModel extends JediViewModel<DeliveryPanelState> {
    public Parcelable LJLJJLL;
    public DeliveryData LJLJLLL;
    public Integer LJLL;
    public String LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public InterfaceC65784Pro<C76800UCe> LJLJL = C26951Ahv.LJLIL;
    public InterfaceC65784Pro<Boolean> LJLJLJ = C26944Aho.LJLIL;
    public String LJLLI = "continue";
    public int LJLLLL = -1;

    public void Iv0(List<Object> list) {
    }

    public void Jv0() {
    }

    public DeliveryPanelStarter.PackedDeliverySelectResult Nv0(DeliveryPanelState state) {
        o.LJIIIZ(state, "state");
        return null;
    }

    public void Pv0() {
        this.LJLLL = false;
    }

    public final String Ov0() {
        String str;
        List<LogisticDTO> list;
        String str2;
        Parcelable parcelable = this.LJLJJLL;
        boolean z = parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            DeliveryData deliveryData = this.LJLJLLL;
            if (deliveryData != null && (list = deliveryData.logistics) != null) {
                Iterator<LogisticDTO> it = list.iterator();
                while (it.hasNext()) {
                    Map<String, String> map = it.next().eventTrackInfo;
                    if (map != null) {
                        str2 = map.get("is_next_day_delivery");
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, "1")) {
                        str3 = "1";
                    }
                }
            }
        } else if (parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) {
            Iterator<LogisticDTO> it2 = ((DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable).logisticList.iterator();
            while (it2.hasNext()) {
                Map<String, String> map2 = it2.next().eventTrackInfo;
                if (map2 != null) {
                    str = map2.get("is_next_day_delivery");
                } else {
                    str = null;
                }
                if (o.LJ(str, "1")) {
                    str3 = "1";
                }
            }
        }
        return str3;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final DeliveryPanelState kv0() {
        return new DeliveryPanelState(null, false, null, null, null, 0, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Lv0(String str) {
        String str2 = str;
        C27090AkA.LJLILLLLZI = str2;
        if (str2 != null) {
            C27090AkA.LJLJJI.clear();
        }
        IEventCenter LJ = EventCenter.LJ();
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJ.LIZ("ec_address_select", C27739Aud.LJI(new AddressPageStarter.AddressEvent(str2, 3, null, 4, 0 == true ? 1 : 0)));
    }

    public void Hv0(List<Object> list) {
        List list2;
        List list3;
        C26943Ahn.LIZ.getClass();
        if (C26943Ahn.LIZ()) {
            DeliveryData deliveryData = this.LJLJLLL;
            if (deliveryData == null || (list3 = deliveryData.logistics) == null) {
                list3 = C61878OQg.INSTANCE;
            }
            ((ArrayList) list).add(new C26952Ahw(list3, null));
            return;
        }
        DeliveryData deliveryData2 = this.LJLJLLL;
        if (deliveryData2 == null || (list2 = deliveryData2.logistics) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        ((ArrayList) list).addAll(list2);
    }

    public final void Kv0(EnumC26931Ahb changePage) {
        o.LJIIIZ(changePage, "changePage");
        setState(new AqS170S0100000_4(changePage, 241));
    }

    public final void Mv0(Context context) {
        Parcelable parcelable = this.LJLJJLL;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            withState(new AqS135S0200000_4(this, context, parcelable, 27));
        } else if (parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) {
            setState(new AqS170S0100000_4(parcelable, 242));
        } else {
            setState(new AqS29S0001000_4(3, 27));
        }
    }

    public static void Qv0(DeliveryPanelViewModel deliveryPanelViewModel, Context context, Object obj) {
        deliveryPanelViewModel.getClass();
        deliveryPanelViewModel.setState(new AqS170S0100000_4(obj, 1644));
        deliveryPanelViewModel.Mv0(context);
        C27090AkA.LJLJJL = null;
    }
}
