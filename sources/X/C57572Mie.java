package X;

import Y.AfS53S0100000_1;
import Y.AfS65S0100000_13;
import Y.IDaS159S0200000_1;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Mie, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57572Mie {
    public static final void LIZ(EnumC58046MqI enumC58046MqI, Context context, C57571Mid trackInfo, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        Class<? extends UPC> LJJIJIIJI;
        EnumC77147UPn enumC77147UPn;
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(enumC58046MqI, "<this>");
        o.LJIIIZ(trackInfo, "trackInfo");
        int[] iArr = C57573Mif.LIZ;
        int i = iArr[enumC58046MqI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJJIJIIJI = C77266UUc.LIZIZ.LJIIJJI();
            } else {
                throw new C162476Zf();
            }
        } else {
            LJJIJIIJI = C77266UUc.LIZIZ.LJJIJIIJI();
        }
        LinkedHashMap linkedHashMap = null;
        if (C52926Kpu.LIZ()) {
            int i2 = iArr[enumC58046MqI.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    enumC77147UPn = EnumC77147UPn.CONTACT;
                } else {
                    throw new C162476Zf();
                }
            } else {
                enumC77147UPn = EnumC77147UPn.FACEBOOK;
            }
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
                XKX.LIZLLL(lifecycleScope, null, null, new C57574Mig(context, enumC77147UPn, trackInfo, interfaceC88472Yns, null), 3);
                return;
            }
            return;
        }
        C34K c34k = new C34K();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        String str = trackInfo.LJLIL;
        String str2 = trackInfo.LJLILLLLZI;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = trackInfo.LJLJJI;
        if (C78685UuP.LJJJZ(str3) && str3 != null) {
            linkedHashMap2.put("position", str3);
        }
        if (!linkedHashMap2.isEmpty()) {
            linkedHashMap = linkedHashMap2;
        }
        T3Q.LIZIZ(context, LJJIJIIJI, curUserId, str, str2, false, linkedHashMap).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS65S0100000_13(c34k, 233), new AfS53S0100000_1(interfaceC88472Yns, 94), new IDaS159S0200000_1(interfaceC88472Yns, c34k, 2));
    }
}
