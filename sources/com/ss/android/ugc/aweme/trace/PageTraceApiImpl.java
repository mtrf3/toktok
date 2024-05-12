package com.ss.android.ugc.aweme.trace;

import X.C16880lQ;
import X.C64375POh;
import X.C64384POq;
import X.C64390POw;
import X.EnumC64385POr;
import X.InterfaceC64383POp;
import X.NDG;
import X.OSZ;
import X.POS;
import X.POX;
import X.POZ;
import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PageTraceApiImpl implements IPageTraceApi, InterfaceC64383POp {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Map<String, C64384POq> LIZ = new LinkedHashMap();
    public final Handler LIZIZ;
    public volatile C64384POq LIZJ;

    public static boolean LJIIIIZZ() {
        return !C64390POw.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC64383POp
    public final void LIZ() {
        this.LIZIZ.post(new ARunnableS47S0100000_11(this, 52));
    }

    public PageTraceApiImpl() {
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.LIZIZ = handler;
        if (!LJIIIIZZ()) {
            handler.postDelayed(new ARunnableS47S0100000_11(this, 51), 30000L);
        }
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final String LIZIZ(String str) {
        C64384POq c64384POq;
        if (LJIIIIZZ()) {
            return "";
        }
        if (str != null) {
            c64384POq = (C64384POq) ((LinkedHashMap) this.LIZ).get(str);
        } else {
            c64384POq = this.LIZJ;
        }
        if (c64384POq == null || c64384POq.LIZIZ.length() == 0) {
            return "";
        }
        return POX.LIZIZ.LJII(c64384POq.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final OSZ<String, String> LIZLLL(String str) {
        C64384POq c64384POq;
        if (LJIIIIZZ()) {
            return null;
        }
        if (str != null) {
            c64384POq = (C64384POq) ((LinkedHashMap) this.LIZ).get(str);
        } else {
            c64384POq = this.LIZJ;
        }
        if (c64384POq == null || c64384POq.LIZIZ.length() == 0) {
            return null;
        }
        return new OSZ<>(c64384POq.LIZ, c64384POq.LIZIZ);
    }

    public static void LJII(C64384POq c64384POq, JSONObject jSONObject) {
        String str;
        int i = c64384POq.LJ + 1;
        POX pox = POX.LIZIZ;
        String LJII = pox.LJII(c64384POq.LIZIZ);
        POZ poz = POZ.ORIGIN_LOG;
        POS pos = new POS(LJII);
        pos.LIZJ = c64384POq.LIZ;
        pos.LIZLLL = Boolean.FALSE;
        pos.LJ = i;
        pos.LIZIZ = jSONObject;
        pox.LIZ(poz, pos);
        String str2 = c64384POq.LIZIZ;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (i <= 1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pox.LJFF(str2, "status", str);
        String str4 = c64384POq.LIZIZ;
        if (C64375POh.LIZLLL()) {
            str3 = "1";
        }
        pox.LJFF(str4, "is_force", str3);
        pox.LIZIZ(c64384POq.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LIZJ(NDG ndg, JSONObject jSONObject) {
        if (LJIIIIZZ()) {
            return;
        }
        C64384POq c64384POq = (C64384POq) ((LinkedHashMap) this.LIZ).get(ndg.LJLILLLLZI);
        if (c64384POq == null || c64384POq.LIZLLL - c64384POq.LJ != 1) {
            return;
        }
        if (c64384POq.LIZJ == EnumC64385POr.VISIBLE) {
            LJII(c64384POq, jSONObject);
        }
        c64384POq.LJI = jSONObject;
        c64384POq.LJ++;
        EnumC64385POr enumC64385POr = EnumC64385POr.INVISIBLE;
        o.LJIIIZ(enumC64385POr, "<set-?>");
        c64384POq.LIZJ = enumC64385POr;
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJ(NDG ndg, JSONObject jSONObject) {
        C64384POq remove;
        if (LJIIIIZZ() || (remove = this.LIZ.remove(ndg.LJLILLLLZI)) == null) {
            return;
        }
        if (remove.LJ != remove.LIZLLL) {
            POX.LIZIZ.LIZJ(remove.LIZIZ);
        } else if (remove.LIZJ == EnumC64385POr.CREATED) {
            LJII(remove, jSONObject);
        }
        EnumC64385POr enumC64385POr = EnumC64385POr.DESTROYED;
        o.LJIIIZ(enumC64385POr, "<set-?>");
        remove.LIZJ = enumC64385POr;
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJFF(NDG ndg, JSONObject jSONObject) {
        if (LJIIIIZZ()) {
            return;
        }
        C64384POq c64384POq = (C64384POq) ((LinkedHashMap) this.LIZ).get(ndg.LJLILLLLZI);
        if (c64384POq == null || c64384POq.LIZLLL - c64384POq.LJ != 0) {
            return;
        }
        if (c64384POq.LIZJ == EnumC64385POr.INVISIBLE) {
            LJIIIZ(c64384POq, jSONObject);
        }
        c64384POq.LJFF = jSONObject;
        c64384POq.LIZLLL++;
        EnumC64385POr enumC64385POr = EnumC64385POr.VISIBLE;
        o.LJIIIZ(enumC64385POr, "<set-?>");
        c64384POq.LIZJ = enumC64385POr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJI(NDG ndg, JSONObject jSONObject) {
        if (LJIIIIZZ()) {
            return;
        }
        C64384POq c64384POq = new C64384POq((String) ndg.LJLJI, EnumC64385POr.CREATED);
        this.LIZ.put(ndg.LJLILLLLZI, c64384POq);
        LJIIIZ(c64384POq, jSONObject);
    }

    public final void LJIIIZ(C64384POq c64384POq, JSONObject jSONObject) {
        this.LIZJ = c64384POq;
        POX pox = POX.LIZIZ;
        String LJIIIZ = pox.LJIIIZ(c64384POq.LIZ);
        o.LJIIIZ(LJIIIZ, "<set-?>");
        c64384POq.LIZIZ = LJIIIZ;
        String LJII = pox.LJII(LJIIIZ);
        POZ poz = POZ.ORIGIN_LOG;
        POS pos = new POS(LJII);
        pos.LIZJ = c64384POq.LIZ;
        pos.LIZLLL = Boolean.TRUE;
        pos.LJ = c64384POq.LIZLLL + 1;
        pos.LIZIZ = jSONObject;
        pox.LIZ(poz, pos);
    }
}
