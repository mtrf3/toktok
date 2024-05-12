package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.ETb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36471ETb implements TE1 {
    public final InterfaceC36472ETc LIZJ = C36473ETd.LIZ;
    public final HashMap<String, Boolean> LIZ = new HashMap<>();
    public final ArrayList<String> LIZIZ = new ArrayList<>();

    @Override // X.TE1
    public final void LIZ(List<? extends Effect> list, List<String> list2, List<Integer> list3) {
    }

    @Override // X.TE1
    public final void LIZLLL(int i) {
    }

    @Override // X.TE1
    public final void clear(String str) {
        for (String effectId : this.LIZ.keySet()) {
            HashMap<String, Boolean> hashMap = this.LIZ;
            o.LJIIIIZZ(effectId, "effectId");
            hashMap.put(effectId, Boolean.FALSE);
        }
    }

    @Override // X.TE1
    public final void LIZJ(int i, String str, Bundle bundle, InterfaceC88472Yns<? super Integer, ? extends Effect> interfaceC88472Yns) {
        String adRawData;
        Effect invoke = interfaceC88472Yns.invoke(Integer.valueOf(i + 1));
        if (invoke == null || (adRawData = invoke.getAdRawData()) == null || adRawData.length() == 0) {
            return;
        }
        String effectId = invoke.getEffectId();
        Boolean bool = this.LIZ.get(effectId);
        if (bool == null || !bool.booleanValue()) {
            this.LIZJ.LIZ(invoke);
        }
        this.LIZ.put(effectId, Boolean.TRUE);
    }

    @Override // X.TE1
    public final void LIZIZ(int i, int i2, String str, Bundle bundle, AqS143S0200000_12 aqS143S0200000_12) {
        String adRawData;
        this.LIZIZ.clear();
        int i3 = i2 + 1;
        for (int i4 = i + 1; i4 < i3; i4++) {
            Effect effect = (Effect) aqS143S0200000_12.invoke(Integer.valueOf(i4));
            if (effect != null && (adRawData = effect.getAdRawData()) != null && adRawData.length() != 0) {
                String effectId = effect.getEffectId();
                Boolean bool = this.LIZ.get(effectId);
                if (bool == null || !bool.booleanValue()) {
                    this.LIZJ.LIZ(effect);
                }
                this.LIZ.put(effectId, Boolean.TRUE);
                this.LIZIZ.add(effectId);
            }
        }
        for (String effectId2 : this.LIZ.keySet()) {
            if (!this.LIZIZ.contains(effectId2)) {
                HashMap<String, Boolean> hashMap = this.LIZ;
                o.LJIIIIZZ(effectId2, "effectId");
                hashMap.put(effectId2, Boolean.FALSE);
            }
        }
    }
}
