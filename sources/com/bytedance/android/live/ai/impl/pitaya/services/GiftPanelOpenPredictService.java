package com.bytedance.android.live.ai.impl.pitaya.services;

import X.C141335gf;
import X.C22810uz;
import X.C22820v0;
import X.C29044Baa;
import X.C32101Cin;
import X.C35201Zs;
import X.C3C5;
import X.C46721sS;
import X.C46731sT;
import X.C5H3;
import X.C78996UzQ;
import X.CN1;
import X.InterfaceC20980s2;
import X.InterfaceC22790ux;
import X.InterfaceC22840v2;
import X.InterfaceC34931Yr;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.ai.impl.pitaya.services.GiftPanelOpenPredictService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class GiftPanelOpenPredictService implements GenericLifecycleObserver, InterfaceC34931Yr {
    public static final GiftPanelOpenPredictService LJLIL = new GiftPanelOpenPredictService();
    public static final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(C46731sT.LJLIL);
    public static final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(C46721sS.LJLIL);
    public static final CopyOnWriteArrayList<InterfaceC20980s2> LJLJJI = new CopyOnWriteArrayList<>();
    public static boolean LJLJJL;

    @Override // X.InterfaceC34931Yr
    public final void VX() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            startWhenResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            stopWhenPause();
        }
    }

    public static com.bytedance.android.livesdk.livesetting.other.GiftPanelOpenPredictService LIZ() {
        return (com.bytedance.android.livesdk.livesetting.other.GiftPanelOpenPredictService) LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC34931Yr
    /* renamed from: do */
    public final void mo3do() {
        if (LJLJJL) {
            LIZLLL(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void startWhenResume() {
        if (LJLJJL) {
            LIZJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void stopWhenPause() {
        if (LJLJJL) {
            LIZLLL(false);
        }
    }

    @Override // X.InterfaceC34931Yr
    public final void Ga0() {
        if (o.LJ(LIZ().config.get("auto_execute"), 1)) {
            LIZIZ(new InterfaceC20980s2() { // from class: X.1Fl
                @Override // X.InterfaceC20980s2
                public final void LIZ(boolean z) {
                    C10S.LIZ("predict result == ", z, "GiftPanelOpenPredictService");
                }

                @Override // X.InterfaceC20980s2
                public final void onError(int i) {
                    C012403c.LJ("predict error, code == ", i, "GiftPanelOpenPredictService");
                }
            });
        }
    }

    public final void LIZJ() {
        Boolean bool;
        Object LIZ;
        int i;
        User owner;
        int i2 = 1;
        if (LIZ().enable <= 0 || LIZ().businessName.length() == 0) {
            return;
        }
        LJLJJL = true;
        IWalletCenter walletCenter = ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Object obj = null;
        if (room != null && (owner = room.getOwner()) != null) {
            bool = Boolean.valueOf(owner.isFollowing());
        } else {
            bool = null;
        }
        InterfaceC22790ux interfaceC22790ux = (InterfaceC22790ux) LJLJI.getValue();
        String str = LIZ().businessName;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("avaliable_diamonds", (int) ((WalletCenter) walletCenter).LIZ());
            if (!o.LJ(bool, Boolean.TRUE)) {
                i2 = 0;
            }
            C3C5.m7constructorimpl(jSONObject.put("follow_status", i2));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        C22820v0 c22820v0 = new C22820v0(false, jSONObject);
        InterfaceC22840v2 interfaceC22840v2 = new InterfaceC22840v2() { // from class: X.1Fm
            @Override // X.InterfaceC22840v2
            public final void LJIILIIL(C22830v1 outputData) {
                boolean z;
                o.LJIIIZ(outputData, "outputData");
                GiftPanelOpenPredictService.LJLIL.getClass();
                if (outputData.LIZ()) {
                    Iterator<InterfaceC20980s2> it = GiftPanelOpenPredictService.LJLJJI.iterator();
                    while (it.hasNext()) {
                        InterfaceC20980s2 next = it.next();
                        JSONObject jSONObject2 = outputData.LIZIZ;
                        if (jSONObject2 != null) {
                            z = true;
                            if (jSONObject2.optInt("result") == 1) {
                                next.LIZ(z);
                            }
                        }
                        z = false;
                        next.LIZ(z);
                    }
                    return;
                }
                Iterator<InterfaceC20980s2> it2 = GiftPanelOpenPredictService.LJLJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(outputData.LIZ);
                }
            }
        };
        long j = LIZ().period * 1000;
        try {
            LJLIL.getClass();
            Object obj2 = LIZ().config.get("start_delay");
            if (obj2 instanceof Integer) {
                LIZ = (Integer) obj2;
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 60;
        }
        interfaceC22790ux.LIZJ(new C22810uz(str, c22820v0, interfaceC22840v2, 2, new C35201Zs(0, true, -1, j, i, 0L, 33)));
    }

    public final void LIZIZ(InterfaceC20980s2 interfaceC20980s2) {
        if (interfaceC20980s2 == null) {
            return;
        }
        CopyOnWriteArrayList<InterfaceC20980s2> copyOnWriteArrayList = LJLJJI;
        copyOnWriteArrayList.add(interfaceC20980s2);
        if (copyOnWriteArrayList.size() == 1) {
            LIZJ();
        }
    }

    public final void LIZLLL(boolean z) {
        if (LIZ().enable > 0) {
            LJLJJL = false;
            ((InterfaceC22790ux) LJLJI.getValue()).LJ(LIZ().businessName, z);
        }
    }

    public final void LJ(C32101Cin c32101Cin) {
        if (c32101Cin == null) {
            return;
        }
        CopyOnWriteArrayList<InterfaceC20980s2> copyOnWriteArrayList = LJLJJI;
        copyOnWriteArrayList.remove(c32101Cin);
        if (copyOnWriteArrayList.isEmpty()) {
            LIZLLL(true);
        }
    }
}
