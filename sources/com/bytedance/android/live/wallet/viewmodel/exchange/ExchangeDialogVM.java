package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.BZI;
import X.C28787BRn;
import X.C30725C4b;
import X.C74906TaY;
import X.C77410UZq;
import X.ORZ;
import X.UIL;
import X.UIM;
import androidx.lifecycle.ViewModel;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class ExchangeDialogVM extends ViewModel {
    public boolean LJLILLLLZI;
    public long LJLJJI;
    public final /* synthetic */ C74906TaY LJLIL = new C74906TaY();
    public String LJLJI = "";
    public HashMap<String, Long> LJLJJL = new HashMap<>();

    public abstract boolean iv0();

    public abstract boolean jv0();

    public abstract void mv0();

    public abstract void nv0();

    public abstract void onCancel();

    public abstract void onShow();

    public final boolean gv0() {
        if (iv0() && !jv0()) {
            return true;
        }
        return false;
    }

    public final void hv0(String str) {
        long LIZ;
        HashMap<String, Long> hashMap = this.LJLJJL;
        if (o.LJ(str, "loading_duration")) {
            long LIZ2 = C30725C4b.LIZ() - this.LJLJJI;
            Collection<Long> values = this.LJLJJL.values();
            o.LJIIIIZZ(values, "performanceTrackingLogMap.values");
            LIZ = ORZ.LLILLJJLI(values) + LIZ2;
        } else {
            LIZ = C30725C4b.LIZ() - this.LJLJJI;
        }
        hashMap.put(str, Long.valueOf(LIZ));
        this.LJLJJI = C30725C4b.LIZ();
    }

    public final void lv0(int i, String str, Throwable th) {
        String str2;
        String str3;
        String str4;
        if (th != null) {
            UIM.Companion.getClass();
            str2 = String.valueOf(UIL.LIZ(th).getErrorCode());
        } else {
            str2 = null;
        }
        HashMap<String, Long> durationsLogMap = this.LJLJJL;
        String exchangeEntrance = this.LJLJI;
        o.LJIIIZ(durationsLogMap, "durationsLogMap");
        o.LJIIIZ(exchangeEntrance, "exchangeEntrance");
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                } else {
                    str3 = "livesdk_recharge_gift_exchange_second_confirm_popup";
                }
            } else {
                str3 = "livesdk_recharge_gift_exchange_w9_popup";
            }
        } else {
            str3 = "livesdk_recharge_gift_exchange_page_loading_complete";
        }
        BZI LIZ = C28787BRn.LIZ(str3);
        if (str2 == null) {
            str4 = "success";
        } else {
            str4 = "failed";
        }
        LIZ.LJIJJ(str4, "status");
        if (str2 == null) {
            str2 = "";
        }
        LIZ.LJIJJ(str2, "error_code");
        LIZ.LJIJJ(exchangeEntrance, "exchange_entrance");
        LIZ.LJIJJ(str, "charge_reason");
        for (Map.Entry<String, Long> entry : durationsLogMap.entrySet()) {
            LIZ.LJIJJ(String.valueOf(entry.getValue().longValue()), entry.getKey());
        }
        LIZ.LJJIIJZLJL();
    }

    public final void kv0(String str, String str2, Throwable th, boolean z) {
        String str3;
        String str4 = str;
        if (th != null) {
            UIM.Companion.getClass();
            str3 = String.valueOf(UIL.LIZ(th).getErrorCode());
        } else {
            str3 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        C77410UZq.LIZIZ(C30725C4b.LIZ() - this.LJLJJI, str4, z, str2, str3);
    }
}
