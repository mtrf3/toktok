package X;

import Y.AObserverS80S0100000_12;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.quickproduct.QuickProductSwitch;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.data.OecInitData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import q03.IDaS481S0100000_1;

/* renamed from: X.Rxr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71255Rxr extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> implements InterfaceC60061Nhh {
    public final Context LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ec_broadcast_quick_product";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(10000);
    }

    public final C71256Rxs LJIIIZ() {
        return (C71256Rxs) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<EnumC29188Bcu> LLJJJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC29188Bcu.LIVE_ROOM_BOTTOM_CONTENT_HEIGHT);
        return arrayList;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        if (this.LJLJJL) {
            LJIIIZ().getClass();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onPause() {
        if (this.LJLJJL) {
            LJIIIZ().getClass();
            EventCenter.LJ().LIZIZ("live_quick_product_post_enable_changed", this);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onResume() {
        EnumC75152xD enumC75152xD;
        if (this.LJLJJL) {
            C71256Rxs LJIIIZ = LJIIIZ();
            if (C78685UuP.LJJJZ(LJIIIZ.LJLLILLLL) && LJIIIZ.LJLLJ) {
                enumC75152xD = EnumC75152xD.ENTRANCE;
            } else {
                enumC75152xD = EnumC75152xD.HIDE;
            }
            LJIIIZ.LJ(enumC75152xD);
            if (C78685UuP.LJJJZ(LJIIIZ.LJLLILLLL) && LJIIIZ.LJLLJ) {
                C72269SXx c72269SXx = LJIIIZ.LJLJJI;
                if (c72269SXx != null) {
                    c72269SXx.post(new ARunnableS48S0100000_12(LJIIIZ, 118));
                } else {
                    o.LJIJI("entranceView");
                    throw null;
                }
            }
            EventCenter.LJ().LIZJ("live_quick_product_post_enable_changed", this);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStart() {
        if (this.LJLJJL) {
            LJIIIZ().getClass();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStop() {
        if (this.LJLJJL) {
            LJIIIZ().getClass();
        }
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return LJIIIZ();
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC31730Cco.SLOT_LIVE_FREE_FRAME;
    }

    public C71255Rxr(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1234));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        LayerDrawable layerDrawable;
        if (this.LJLJJL) {
            final C71256Rxs LJIIIZ = LJIIIZ();
            if (!C78685UuP.LJJJZ(LJIIIZ.LJLLILLLL)) {
                return;
            }
            View view = LJIIIZ.LJLJI;
            if (view != null) {
                View findViewById = view.findViewById(R.id.b5h);
                o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.capture_container)");
                LJIIIZ.LJLJJLL = (C72271SXz) findViewById;
                View view2 = LJIIIZ.LJLJI;
                if (view2 != null) {
                    View findViewById2 = view2.findViewById(R.id.b5j);
                    o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.capture_result)");
                    LJIIIZ.LJLJL = (RelativeLayout) findViewById2;
                    View view3 = LJIIIZ.LJLJI;
                    if (view3 != null) {
                        View findViewById3 = view3.findViewById(R.id.cxo);
                        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.entrance_container)");
                        LJIIIZ.LJLJJI = (C72269SXx) findViewById3;
                        View view4 = LJIIIZ.LJLJI;
                        if (view4 != null) {
                            View findViewById4 = view4.findViewById(R.id.bvv);
                            o.LJIIIIZZ(findViewById4, "contentView.findViewById(R.id.count_down)");
                            C109174Qf c109174Qf = (C109174Qf) findViewById4;
                            LJIIIZ.LJLJLJ = c109174Qf;
                            c109174Qf.setCountDownListener(new InterfaceC75072x5() { // from class: X.2x4
                                @Override // X.InterfaceC75072x5
                                public final void LIZ() {
                                    C71256Rxs c71256Rxs = C71256Rxs.this;
                                    c71256Rxs.getClass();
                                    c71256Rxs.LJ(EnumC75152xD.ENTRANCE);
                                    IFrameSlot.SlotViewModel slotViewModel = c71256Rxs.LJLLLLLL;
                                    if (slotViewModel != null) {
                                        XKX.LIZLLL(ViewModelKt.getViewModelScope(slotViewModel), (MB6) c71256Rxs.LJLLL.getValue(), null, new C31971Cgh(c71256Rxs, null), 2);
                                    } else {
                                        o.LJIJI("viewModel");
                                        throw null;
                                    }
                                }
                            });
                            View view5 = LJIIIZ.LJLJI;
                            if (view5 != null) {
                                View findViewById5 = view5.findViewById(R.id.cxn);
                                o.LJIIIIZZ(findViewById5, "contentView.findViewById(R.id.entrance_btn)");
                                ImageButton imageButton = (ImageButton) findViewById5;
                                LJIIIZ.LJLJJL = imageButton;
                                Context context = LJIIIZ.LJLIL;
                                if (context != null) {
                                    C2068389v c2068389v = new C2068389v();
                                    c2068389v.LIZ = R.drawable.b37;
                                    c2068389v.LIZIZ = C7MY.LIZIZ(24);
                                    c2068389v.LIZJ = C7MY.LIZIZ(24);
                                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                                    SY9 LIZ = c2068389v.LIZ(context);
                                    C110614Vt c110614Vt = new C110614Vt();
                                    c110614Vt.LIZ = Integer.valueOf(C86V.LIZIZ(R.color.cs));
                                    c110614Vt.LIZJ = C61328O5c.LIZJ(24);
                                    c110614Vt.LJII = C7MY.LIZIZ(48);
                                    c110614Vt.LJI = C7MY.LIZIZ(48);
                                    layerDrawable = C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
                                } else {
                                    layerDrawable = null;
                                }
                                imageButton.setImageDrawable(layerDrawable);
                                ImageButton imageButton2 = LJIIIZ.LJLJJL;
                                if (imageButton2 != null) {
                                    C16880lQ.LJIIJ(new IDaS481S0100000_1(LJIIIZ, 2), imageButton2);
                                    return;
                                } else {
                                    o.LJIJI("entranceBtn");
                                    throw null;
                                }
                            }
                            o.LJIJI("contentView");
                            throw null;
                        }
                        o.LJIJI("contentView");
                        throw null;
                    }
                    o.LJIJI("contentView");
                    throw null;
                }
                o.LJIJI("contentView");
                throw null;
            }
            o.LJIJI("contentView");
            throw null;
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        if ((iMessage instanceof ECommerceMessage) && ((ECommerceMessage) iMessage).actionType == 8) {
            C52258Kf8.LIZ.getClass();
            if (C52258Kf8.LIZ()) {
                C71256Rxs LJIIIZ = LJIIIZ();
                LJIIIZ.LJLLJ = false;
                LJIIIZ.LJ(EnumC75152xD.HIDE);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        IFrameSlot.SlotViewModel viewModel2 = (IFrameSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        C71256Rxs LJIIIZ = LJIIIZ();
        LJIIIZ.getClass();
        LJIIIZ.LJLLLLLL = viewModel2;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(LJIIIZ.LJLIL);
        if (LJJIFFI != null) {
            IFrameSlot.SlotViewModel slotViewModel = LJIIIZ.LJLLLLLL;
            if (slotViewModel != null) {
                LiveData liveData = (LiveData) ((ConcurrentHashMap) slotViewModel.LJLJI).get(EnumC29188Bcu.LIVE_ROOM_BOTTOM_CONTENT_HEIGHT);
                if (liveData != null) {
                    liveData.observe(LJJIFFI, new AObserverS80S0100000_12(LJIIIZ, 149));
                    return;
                }
                return;
            }
            o.LJIJI("viewModel");
            throw null;
        }
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        String str;
        OecInitData oecInitData;
        boolean z;
        CommerceStruct commerceStruct;
        o.LJIIIZ(params, "params");
        boolean z2 = params.get("param_room") instanceof Room;
        C71256Rxs LJIIIZ = LJIIIZ();
        LJIIIZ.getClass();
        Object obj = params.get("param_room");
        String str2 = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        LJIIIZ.LJLLI = room;
        Object obj2 = params.get("param_is_hidden_ec_widget");
        if (!(obj2 instanceof Boolean)) {
            obj2 = null;
        }
        Room room2 = LJIIIZ.LJLLI;
        if (room2 != null && (commerceStruct = room2.getCommerceStruct()) != null) {
            str = commerceStruct.oecInitDataString;
        } else {
            str = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(OecInitData.class)));
            if (!(fromJson instanceof OecInitData)) {
                fromJson = null;
            }
            oecInitData = (OecInitData) fromJson;
            if (oecInitData != null) {
                str2 = oecInitData.quickProductSchema;
            }
        } catch (s unused) {
            oecInitData = null;
        }
        LJIIIZ.LJLLILLLL = str2;
        boolean z3 = false;
        if (oecInitData != null && oecInitData.quickProductEntrance) {
            z = true;
        } else {
            z = false;
        }
        LJIIIZ.LJLLJ = z;
        if (C78685UuP.LJJJZ(str2) && !o.LJ(obj2, Boolean.TRUE)) {
            z3 = true;
        }
        this.LJLJJL = z3;
        interfaceC25704A6y.LIZ(z3);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        EnumC75152xD enumC75152xD;
        o.LJIIIZ(eventName, "eventName");
        if (this.LJLJJL && TextUtils.equals(eventName, "live_quick_product_post_enable_changed")) {
            QuickProductSwitch quickProductSwitch = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LIZLLL(QuickProductSwitch.class)));
                if (!(fromJson instanceof QuickProductSwitch)) {
                    fromJson = null;
                }
                quickProductSwitch = (QuickProductSwitch) fromJson;
            } catch (s unused) {
            }
            boolean z = true;
            if (quickProductSwitch == null) {
                quickProductSwitch = new QuickProductSwitch(1);
            }
            C71256Rxs LJIIIZ = LJIIIZ();
            if (quickProductSwitch.result != 1) {
                z = false;
            }
            LJIIIZ.LJLLJ = z;
            if (z) {
                enumC75152xD = EnumC75152xD.ENTRANCE;
            } else {
                enumC75152xD = EnumC75152xD.HIDE;
            }
            LJIIIZ.LJ(enumC75152xD);
        }
    }
}
