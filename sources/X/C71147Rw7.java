package X;

import X.C71144Rw4;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.internal.b;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rw7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71147Rw7 implements B51 {
    public final /* synthetic */ C71151RwB LIZ;

    public C71147Rw7(C71151RwB c71151RwB) {
        this.LIZ = c71151RwB;
    }

    @Override // X.B51
    public final void LIZ(Fragment fragment, Room room) {
        Long l;
        Object obj;
        o.LJIIIZ(fragment, "fragment");
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        C71166RwQ.LIZIZ(l);
        if (room != null) {
            long id = room.getId();
            C71154RwE.LIZ.remove(Long.valueOf(id));
            InterfaceC68342mE<BaseResponse<PopProductResp>> remove = C71154RwE.LIZIZ.remove(Long.valueOf(id));
            if (remove != null) {
                remove.LIZIZ(null);
            }
        }
        IEventCenter LJ = EventCenter.LJ();
        JSONObject jSONObject = new JSONObject();
        if (room != null) {
            obj = Long.valueOf(room.getId());
        } else {
            obj = "";
        }
        jSONObject.put("room_id", obj);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
        LJ.LIZ("ec_live_shop_widget_on_destroy", jSONObject2);
    }

    @Override // X.B51
    public final void LIZIZ(LivePlayFragment fragment, Room room, long j) {
        boolean z;
        ComponentCallbacks2 componentCallbacks2;
        LifecycleOwner lifecycleOwner;
        boolean z2;
        String str;
        OecInitData oecInitData;
        boolean z3;
        boolean z4;
        int i;
        String str2;
        o.LJIIIZ(fragment, "fragment");
        C71195Rwt.LJIIIZ = System.currentTimeMillis();
        Context context = fragment.getContext();
        C71166RwQ.LIZIZ(Long.valueOf(C71166RwQ.LIZIZ));
        if (room.getId() != 0) {
            C71166RwQ.LIZIZ = room.getId();
            CommerceStruct commerceStruct = room.getCommerceStruct();
            if (commerceStruct != null && commerceStruct.commercePermission == 1) {
                z = true;
            } else {
                z = false;
            }
            C71166RwQ.LIZJ = z;
            C71166RwQ.LIZ = System.currentTimeMillis();
            if (context != null) {
                componentCallbacks2 = C45804HyK.LJIJJ(context);
            } else {
                componentCallbacks2 = null;
            }
            if ((componentCallbacks2 instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) componentCallbacks2) != null) {
                BJ4.LIZ(lifecycleOwner, C71168RwS.LJLIL);
            }
        }
        C71139Rvz c71139Rvz = this.LIZ.LIZ;
        if (c71139Rvz != null) {
            C36746EbW.LIZ(4, "destroy");
            c71139Rvz.LIZIZ = false;
            c71139Rvz.LIZ.set(true);
            XKQ xkq = c71139Rvz.LIZJ;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            c71139Rvz.LIZJ = null;
        }
        this.LIZ.LIZ = new C71139Rvz();
        C71150RwA.LIZ = 0;
        C71150RwA.LIZIZ = String.valueOf(room.getId());
        C71151RwB c71151RwB = this.LIZ;
        c71151RwB.getClass();
        c71151RwB.LIZIZ = System.currentTimeMillis();
        CommerceStruct commerceStruct2 = room.getCommerceStruct();
        if (commerceStruct2 != null && commerceStruct2.commercePermission == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        CommerceStruct commerceStruct3 = room.getCommerceStruct();
        if (commerceStruct3 != null) {
            str = commerceStruct3.oecInitDataString;
        } else {
            str = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(OecInitData.class)));
            if (!(fromJson instanceof OecInitData)) {
                fromJson = null;
            }
            oecInitData = (OecInitData) fromJson;
        } catch (s e) {
            String valueOf = String.valueOf(room.getId());
            String message = e.getMessage();
            if (C71150RwA.LIZJ) {
                EnumC53638L3i enumC53638L3i = EnumC53638L3i.SHOP_BAG_ICON;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (valueOf == null) {
                    valueOf = "";
                }
                linkedHashMap.put("room_id", valueOf);
                C66832jn.LIZIZ("rd_tiktokec_shop_bag_icon_exception", enumC53638L3i, 1009, message, linkedHashMap);
            }
            oecInitData = null;
        }
        if (oecInitData == null) {
            if (z2) {
                CommerceStruct commerceStruct4 = room.getCommerceStruct();
                if (commerceStruct4 == null || (str2 = commerceStruct4.oecInitDataString) == null || str2.length() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                b.LJJIJIIJIL("rd_tiktokec_on_enter_room", new OSZ("room_id", Long.valueOf(room.getId())), new OSZ("is_oec_data_empty", Integer.valueOf(i)), new OSZ("is_oec_data_decode_failed", Integer.valueOf(i ^ 1)));
                return;
            }
            return;
        }
        if (z2) {
            b.LJJIJIIJIL("rd_tiktokec_on_enter_room", new OSZ("room_id", Long.valueOf(room.getId())), new OSZ("is_oec_data_empty", 0), new OSZ("is_oec_data_decode_failed", 0));
        }
        C71140Rw0 c71140Rw0 = new C71140Rw0();
        if (oecInitData.isNewUser && c71140Rw0.LIZ.getLong("next_coupon_show_time", 0L) < c71151RwB.LIZIZ && J9A.LIZIZ("ec_live_pop_product_wait_voucher_max_duration", 3000L) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C71154RwE.LIZ.put(Long.valueOf(room.getId()), oecInitData);
        if (oecInitData.product != null || oecInitData.popProductId != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (oecInitData.productNum > 0 && oecInitData.displayProductNum > 0) {
            C73332uH.LIZ(PageNodeMonitorService.LJIIIZ(), "shop_bag_icon", null, Long.valueOf(j), null, 10);
        }
        if (z3) {
            String roomId = String.valueOf(room.getId());
            long j2 = c71151RwB.LIZIZ;
            o.LJIIIZ(roomId, "roomId");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startWaitForNewUserCoupon roomId = ");
            LIZ.append(roomId);
            C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
            C71144Rw4.LJFF = roomId;
            C71144Rw4.LIZLLL = z4;
            C71144Rw4.LJ = j2;
            C71144Rw4.LIZJ = true;
            C71144Rw4.LIZIZ = null;
            fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommercelive.business.common.room.NewUserCouponInitProvider$startWaitForNewUserCoupon$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C71144Rw4.LIZLLL = false;
                        C71144Rw4.LJ = 0L;
                        C71144Rw4.LIZ = null;
                        C71144Rw4.LIZIZ = null;
                    }
                }
            });
        }
        if (z4 && !z3) {
            C73332uH.LIZ(PageNodeMonitorService.LJIIIZ(), "pop_card", null, Long.valueOf(j), null, 10);
        }
        C71148Rw8 c71148Rw8 = new C71148Rw8(new C71146Rw6(oecInitData, c71151RwB, room, z3, fragment), oecInitData, Long.valueOf(room.getId()), z2, null);
        MBB context2 = MBB.INSTANCE;
        XKY start = XKY.DEFAULT;
        o.LJIIIZ(context2, "context");
        o.LJIIIZ(start, "start");
        XKX.LIZJ(LifecycleOwnerKt.getLifecycleScope(fragment), context2, start, c71148Rw8);
    }
}
