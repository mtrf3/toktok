package X;

import android.text.TextUtils;
import android.util.Pair;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.Ia1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46845Ia1 extends QXX {
    public String LJLIL;

    public C46845Ia1() {
        super((Object) null);
    }

    public final String toString() {
        return "VideoModelDataSource";
    }

    @Override // X.QXX, X.IZY
    public final void LJJIJIL(java.util.Map<String, String> map) {
        ((HashMap) map).put("bitrate_set", this.LJLIL);
    }

    @Override // X.IZY
    public final void LJIIJ(C46882Iac c46882Iac, IXO ixo, String str, java.util.Map map) {
        EnumC47176IfM LJIIJJI;
        EnumC47176IfM LJIIJJI2;
        c46882Iac.LJLLLL(203, 1);
        c46882Iac.LJLLLL(160, 1);
        C47164IfA LJL = C78685UuP.LJL(ixo.LIZIZ);
        C46914Ib8 c46914Ib8 = ixo.LIZIZ;
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ArrayList) c46914Ib8.LIZLLL()).iterator();
        while (it.hasNext()) {
            Object obj = ((Pair) it.next()).first;
            if (obj != null) {
                jSONArray.put(((EnumC47177IfN) obj).toString());
            }
        }
        this.LJLIL = jSONArray.toString();
        c46882Iac.LLJJIJIIJIL(LJL);
        if (ixo.LJIILIIL) {
            c46882Iac.LJLLLL(29, 1);
            QXX.LLLLJ(c46882Iac, ixo);
        } else if (IZ8.LJJIJIIJI()) {
            HashMap hashMap = new HashMap();
            EnumC47176IfM enumC47176IfM = EnumC47176IfM.H_High;
            if (ixo.LJIIIZ != null && !TextUtils.isEmpty(ixo.LJIIJ)) {
                enumC47176IfM = C47165IfB.LIZ(ixo.LJIIIZ);
                hashMap.put(18, ixo.LJIIJ);
            } else {
                EnumC47177IfN enumC47177IfN = ixo.LJIIIZ;
                if (enumC47177IfN != null) {
                    enumC47176IfM = C47165IfB.LIZ(enumC47177IfN);
                } else {
                    C47160If6 LJIIL = TTVideoEngine.LJIIL(LJL, 0);
                    if (LJIIL != null) {
                        if (LJIIL.getResolution() != null) {
                            enumC47176IfM = LJIIL.getResolution();
                        }
                        String LIZIZ = LJIIL.LIZIZ(18);
                        if (!TextUtils.isEmpty(LIZIZ)) {
                            hashMap.put(18, LIZIZ);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(ixo.LJJIFFI)) {
                hashMap.put(49, ixo.LJJIFFI);
            }
            c46882Iac.LJI(enumC47176IfM, hashMap);
        } else if (!TextUtils.isEmpty(ixo.LJIIJ)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(18, ixo.LJIIJ);
            if (!TextUtils.isEmpty(ixo.LJJIFFI)) {
                hashMap2.put(49, ixo.LJJIFFI);
            }
            EnumC47177IfN enumC47177IfN2 = ixo.LJIIIZ;
            if (enumC47177IfN2 != null) {
                LJIIJJI2 = C47165IfB.LIZ(enumC47177IfN2);
            } else {
                LJIIJJI2 = TTVideoEngine.LJIIJJI(LJL, EnumC47176IfM.H_High, 1);
            }
            c46882Iac.LJI(LJIIJJI2, hashMap2);
        } else {
            EnumC47177IfN enumC47177IfN3 = ixo.LJIIIZ;
            if (enumC47177IfN3 != null) {
                LJIIJJI = C47165IfB.LIZ(enumC47177IfN3);
            } else {
                LJIIJJI = TTVideoEngine.LJIIJJI(LJL, EnumC47176IfM.H_High, 1);
            }
            c46882Iac.LJII(LJIIJJI);
        }
        c46882Iac.LJLLLL(33, 1);
        c46882Iac.LJLLLL(17, 1);
    }
}
