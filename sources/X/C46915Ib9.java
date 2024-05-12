package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Ib9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46915Ib9 implements InterfaceC46867IaN {
    public C47164IfA LIZ;

    @Override // X.InterfaceC46867IaN
    public final String LJ() {
        C47163If9 c47163If9;
        C47164IfA c47164IfA = this.LIZ;
        if (c47164IfA != null && (c47163If9 = c47164IfA.LIZJ) != null) {
            return c47163If9.LJIJJ;
        }
        return null;
    }

    @Override // X.InterfaceC46867IaN
    public final List<Pair<EnumC47177IfN, SimBitRate>> LJFF() {
        C47163If9 c47163If9;
        List<C47160If6> LJIIIIZZ;
        ArrayList arrayList = new ArrayList();
        C47164IfA c47164IfA = this.LIZ;
        if (c47164IfA != null && (c47163If9 = c47164IfA.LIZJ) != null && (LJIIIIZZ = c47163If9.LJIIIIZZ()) != null && LJIIIIZZ.size() > 0) {
            for (C47160If6 c47160If6 : LJIIIIZZ) {
                if (c47160If6.LIZ() == 0 || !IZ8.LJIILLIIL()) {
                    SimBitRate simBitRate = new SimBitRate();
                    simBitRate.setBitRate(c47160If6.LIZLLL(3));
                    simBitRate.setQualityType(c47160If6.LIZLLL(41));
                    simBitRate.setQuality(c47160If6.LIZIZ(18));
                    arrayList.add(new Pair(C47169IfF.LIZIZ(c47160If6.getResolution()), simBitRate));
                }
            }
        }
        if (IZ8.LJIIZILJ()) {
            Collections.sort(arrayList, new C46919IbD(1));
        }
        return arrayList;
    }

    @Override // X.InterfaceC46867IaN
    public final int getDuration() {
        C47164IfA c47164IfA = this.LIZ;
        if (c47164IfA != null) {
            return c47164IfA.LJII(3);
        }
        return 0;
    }

    @Override // X.InterfaceC46867IaN
    public final List<Pair<EnumC47177IfN, Integer>> LIZLLL() {
        C47163If9 c47163If9;
        List<C47160If6> LJIIIIZZ;
        C47163If9 c47163If92;
        if (IZ8.LJIIIIZZ()) {
            ArrayList arrayList = new ArrayList();
            C47164IfA c47164IfA = this.LIZ;
            C47160If6 c47160If6 = null;
            if (c47164IfA != null && (c47163If92 = c47164IfA.LIZJ) != null) {
                List<C47160If6> LJIIIIZZ2 = c47163If92.LJIIIIZZ();
                List LJFF = c47163If92.LJFF();
                if (LJIIIIZZ2 != null && !LJIIIIZZ2.isEmpty()) {
                    if (LJFF != null && !((ArrayList) LJFF).isEmpty()) {
                        c47160If6 = (C47160If6) ListProtector.get(LJFF, 0);
                    }
                    for (C47160If6 c47160If62 : LJIIIIZZ2) {
                        if (c47160If62 != null && c47160If62.LIZ() == 0) {
                            int LIZLLL = c47160If62.LIZLLL(3);
                            if (c47160If6 != null) {
                                LIZLLL += c47160If6.LIZLLL(3);
                            }
                            arrayList.add(new Pair(C47169IfF.LIZIZ(c47160If62.getResolution()), Integer.valueOf(LIZLLL)));
                        }
                    }
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        C47164IfA c47164IfA2 = this.LIZ;
        if (c47164IfA2 != null && (c47163If9 = c47164IfA2.LIZJ) != null && (LJIIIIZZ = c47163If9.LJIIIIZZ()) != null && LJIIIIZZ.size() > 0) {
            for (C47160If6 c47160If63 : LJIIIIZZ) {
                if (c47160If63.LIZ() == 0 || !IZ8.LJIILLIIL()) {
                    arrayList2.add(new Pair(C47169IfF.LIZIZ(c47160If63.getResolution()), Integer.valueOf(c47160If63.LIZLLL(3))));
                }
            }
        }
        if (IZ8.LJIIZILJ()) {
            Collections.sort(arrayList2, new C46918IbC(1));
        }
        return arrayList2;
    }

    @Override // X.InterfaceC46867IaN
    public final C47164IfA getTag() {
        return this.LIZ;
    }

    public C46915Ib9(C47164IfA c47164IfA) {
        C47163If9 c47163If9;
        this.LIZ = c47164IfA;
        if (c47164IfA != null && (c47163If9 = c47164IfA.LIZJ) != null && !TextUtils.isEmpty(c47163If9.LJIJJ)) {
            List<C47160If6> LJIIIIZZ = c47163If9.LJIIIIZZ();
            if (LJIIIIZZ != null && LJIIIIZZ.size() > 0) {
                for (C47160If6 c47160If6 : LJIIIIZZ) {
                    C46901Iav.LIZIZ(c47160If6.LJIJJLI, c47163If9.LJIJJ, c47160If6.LJIILL, c47160If6.LJJII, new C46920IbE(c47160If6.getResolution().toString(0)));
                }
            }
            List LJFF = c47163If9.LJFF();
            if (LJFF != null) {
                ArrayList arrayList = (ArrayList) LJFF;
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C47160If6 c47160If62 = (C47160If6) it.next();
                        C46901Iav.LIZIZ(c47160If62.LJIJJLI, c47163If9.LJIJJ, c47160If62.LJIILL, c47160If62.LJJII, new C46913Ib7(c47160If62.getResolution().toString(1)));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC46867IaN
    public final EnumC47177IfN LIZ(EnumC47177IfN enumC47177IfN) {
        return C47169IfF.LIZIZ(TTVideoEngine.LJIIJJI(this.LIZ, C47169IfF.LIZ(enumC47177IfN), 1));
    }

    @Override // X.InterfaceC46867IaN
    public final Pair<EnumC47177IfN, String> LIZIZ(int i) {
        C47163If9 c47163If9;
        List<C47160If6> LJIIIIZZ;
        Pair<EnumC47177IfN, String> pair = new Pair<>(EnumC47177IfN.Undefine, "");
        C47164IfA c47164IfA = this.LIZ;
        if (c47164IfA != null && (c47163If9 = c47164IfA.LIZJ) != null && (LJIIIIZZ = c47163If9.LJIIIIZZ()) != null && LJIIIIZZ.size() > 0) {
            for (C47160If6 c47160If6 : LJIIIIZZ) {
                if (c47160If6.LIZLLL(3) == i) {
                    return new Pair<>(C47169IfF.LIZIZ(c47160If6.getResolution()), c47160If6.LIZIZ(18));
                }
            }
        }
        return pair;
    }

    @Override // X.InterfaceC46867IaN
    public final void LIZJ(SimVideoUrlModel simVideoUrlModel, List<SimBitRate> list, List<SimAudioBitrate> list2) {
        String LIZ = IZ4.LIZ(simVideoUrlModel, list, list2);
        if (!TextUtils.isEmpty(LIZ)) {
            C47164IfA c47164IfA = new C47164IfA();
            try {
                c47164IfA.LJJIIZI(new JSONObject(LIZ));
                this.LIZ = c47164IfA;
            } catch (Throwable unused) {
            }
        }
    }
}
