package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.InputDialogShowingChannel;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UXl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77353UXl implements UXG {
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C77356UXo.LJLIL);
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final java.util.Set<UXT> LIZJ;
    public boolean LIZLLL;

    @Override // X.UXG
    public final void LJFF() {
        ((Keva) C33664DJc.LIZ.getValue()).clear();
        ((Keva) C33666DJe.LIZ.getValue()).clear();
    }

    @Override // X.UXG
    public final void LJIIIIZZ() {
        boolean isEmpty;
        if (((Keva) C33664DJc.LIZ.getValue()).getInt(C77354UXm.LIZ(), 0) >= LJIIJJI().dailyCloseCount) {
            C62822Ol8 c62822Ol8 = C33670DJi.LIZ;
            if (((Keva) c62822Ol8.getValue()).getInt(C77354UXm.LIZ(), 0) > 0) {
                return;
            }
            ((Keva) c62822Ol8.getValue()).storeInt(C77354UXm.LIZ(), 1);
            Long valueOf = Long.valueOf(UXR.LIZ());
            if (valueOf == null) {
                java.util.Map<String, ?> all = C33668DJg.LIZ().getAll();
                o.LJIIIIZZ(all, "kv.all");
                isEmpty = all.isEmpty();
            } else {
                String LIZIZ = C77354UXm.LIZIZ(valueOf.longValue());
                java.util.Set<String> keySet = C33668DJg.LIZ().getAll().keySet();
                ArrayList arrayList = new ArrayList();
                for (String str : keySet) {
                    if (!o.LJ(str, LIZIZ)) {
                        arrayList.add(str);
                    }
                }
                isEmpty = arrayList.isEmpty();
            }
            if (!isEmpty) {
                ((Keva) C33662DJa.LIZ.getValue()).storeInt("count", 1);
                C33668DJg.LIZ().clear();
            } else {
                C62822Ol8 c62822Ol82 = C33662DJa.LIZ;
                ((Keva) c62822Ol82.getValue()).storeInt("count", ((Keva) c62822Ol82.getValue()).getInt("count", 0) + 1);
                C33668DJg.LIZ().erase(C77354UXm.LIZIZ(UXR.LIZ()));
            }
            C62822Ol8 c62822Ol83 = C33662DJa.LIZ;
            if (((Keva) c62822Ol83.getValue()).getInt("count", 0) < LJIIJJI().consecutiveActiveDaysCount) {
                return;
            }
            C36702Eao.LIZIZ(TimeUnit.HOURS.toMillis(LJIIJJI().consecutiveActiveDaysDailyCloseCoolDownHrs), "e");
            C33668DJg.LIZ().clear();
            ((Keva) C33670DJi.LIZ.getValue()).clear();
            ((Keva) c62822Ol83.getValue()).clear();
            return;
        }
        C33668DJg.LIZ().storeInt(C77354UXm.LIZIZ(UXR.LIZ()), 1);
    }

    public final HotWordGiftStruct.FrequencyControl LJIIJJI() {
        return (HotWordGiftStruct.FrequencyControl) this.LIZ.getValue();
    }

    public final java.util.Set<UXT> LJIIL() {
        return (java.util.Set) this.LIZIZ.getValue();
    }

    @Override // X.UXG
    public final void clearData() {
        if (C30922CBq.LIZIZ) {
            LJIIL().clear();
            this.LIZJ.clear();
            ((Keva) C33662DJa.LIZ.getValue()).clear();
            ((Keva) C33664DJc.LIZ.getValue()).clear();
            ((Keva) C33666DJe.LIZ.getValue()).clear();
            C33668DJg.LIZ().clear();
            ((Keva) C33670DJi.LIZ.getValue()).clear();
            C36702Eao.LIZ().clear();
            InterfaceC30442Bx8.LIZ.LIZ(-1L);
            C30868C9o.LJI("Cleared all frequency control data");
        }
    }

    @Override // X.UXG
    public final boolean LIZIZ() {
        if (LJIIL().size() >= LJIIJJI().sessionMaxDistinctGift) {
            return true;
        }
        return false;
    }

    @Override // X.UXG
    public final String LIZLLL() {
        long j = C36702Eao.LIZ().getLong("fc_cool_down_end_ms", 0L);
        if (j > 0 && UXR.LIZ() < j) {
            String it = C36702Eao.LIZ().getString("fc_cool_down_type", "");
            o.LJIIIIZZ(it, "it");
            if (it.length() > 0) {
                return it;
            }
        }
        return null;
    }

    @Override // X.UXG
    public final void LJIIIZ() {
        LJIIL().clear();
    }

    @Override // X.UXG
    public final boolean LIZ(long j) {
        int i;
        java.util.Set<UXT> LJIIL = LJIIL();
        if ((LJIIL instanceof Collection) && LJIIL.isEmpty()) {
            i = 0;
        } else {
            Iterator<UXT> it = LJIIL.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().LJLJI.LJLILLLLZI == j && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        if (i < LJIIJJI().sessionMaxSingleGift) {
            return false;
        }
        return true;
    }

    @Override // X.UXG
    public final void LIZJ(boolean z) {
        if (z) {
            C62822Ol8 c62822Ol8 = C33664DJc.LIZ;
            ((Keva) c62822Ol8.getValue()).getInt(C77354UXm.LIZ(), 0);
            int i = ((Keva) c62822Ol8.getValue()).getInt(C77354UXm.LIZ(), 0) + 1;
            ((Keva) c62822Ol8.getValue()).storeInt(C77354UXm.LIZ(), i);
            if (i >= LJIIJJI().dailyCloseCount) {
                C36702Eao.LIZIZ(TimeUnit.HOURS.toMillis(LJIIJJI().dailyCloseCoolDownHrs), "d");
            }
            ((Keva) C33666DJe.LIZ.getValue()).clear();
            return;
        }
        C62822Ol8 c62822Ol82 = C33666DJe.LIZ;
        ((Keva) c62822Ol82.getValue()).getInt(C77354UXm.LIZ(), 0);
        int i2 = ((Keva) c62822Ol82.getValue()).getInt(C77354UXm.LIZ(), 0) + 1;
        ((Keva) c62822Ol82.getValue()).storeInt(C77354UXm.LIZ(), i2);
        if (i2 < LJIIJJI().dailyNoInteractionCount) {
            return;
        }
        C36702Eao.LIZIZ(TimeUnit.HOURS.toMillis(LJIIJJI().dailyNoInteractionCoolDownHrs), "c");
    }

    @Override // X.UXG
    public final void LJ(boolean z) {
        if (z) {
            this.LIZLLL = true;
        }
        ((Keva) C33666DJe.LIZ.getValue()).clear();
    }

    @Override // X.UXG
    public final boolean LJI(UXT matchResult) {
        o.LJIIIZ(matchResult, "matchResult");
        if (this.LIZJ.contains(matchResult)) {
            return false;
        }
        this.LIZJ.add(matchResult);
        return true;
    }

    @Override // X.UXG
    public final boolean LJII(UXT matchResult) {
        o.LJIIIZ(matchResult, "matchResult");
        for (UXT uxt : LJIIL()) {
            UXT uxt2 = uxt;
            if (uxt2.LJLIL == matchResult.LJLIL && uxt2.LJLILLLLZI == matchResult.LJLILLLLZI && o.LJ(uxt2.LJLJI.LJLIL, matchResult.LJLJI.LJLIL)) {
                if (uxt == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.UXG
    public final void LJIIJ(UXT matchResult) {
        o.LJIIIZ(matchResult, "matchResult");
        java.util.Set<UXT> LJIIL = LJIIL();
        if (!(LJIIL instanceof Collection) || !LJIIL.isEmpty()) {
            Iterator<UXT> it = LJIIL.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().LJLJI.LJLILLLLZI == matchResult.LJLJI.LJLILLLLZI && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        LJIIL().add(matchResult);
    }

    public C77353UXl(LifecycleOwner owner, DataChannel dataChannel) {
        o.LJIIIZ(owner, "owner");
        this.LIZ = C221108m2.LIZIZ(C77355UXn.LJLIL);
        this.LIZIZ = C221108m2.LIZIZ(C77352UXk.LJLIL);
        this.LIZJ = new LinkedHashSet();
        dataChannel.lv0(owner, InputDialogShowingChannel.class, new AqS179S0100000_13(this, 653));
    }
}
