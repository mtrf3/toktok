package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.IaL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46865IaL {
    public final java.util.Map<String, C46872IaS> LIZ = new ConcurrentHashMap();
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public SimVideoUrlModel LJ;

    public final SimVideoUrlModel LIZ() {
        if (this.LJ == null && !TextUtils.isEmpty(this.LIZLLL)) {
            this.LJ = LIZIZ(this.LIZLLL);
        }
        return this.LJ;
    }

    public C46865IaL() {
        ITV itv = ITV.LIZJ;
        ((CopyOnWriteArraySet) itv.LIZ).add(new IUK() { // from class: X.IaP
            @Override // X.IUK
            public final void accept(Object obj) {
                C46865IaL c46865IaL = C46865IaL.this;
                IX4 ix4 = (IX4) obj;
                c46865IaL.getClass();
                if (ix4 == null || TextUtils.isEmpty(ix4.LJIIIZ) || ix4.LJJ) {
                    return;
                }
                String str = ix4.LJIIIZ;
                c46865IaL.LIZLLL = str;
                c46865IaL.LJ = c46865IaL.LIZIZ(str);
            }
        });
        ITH ith = ITH.LIZJ;
        ((CopyOnWriteArraySet) ith.LIZ).add(new IUK() { // from class: X.IaR
            @Override // X.IUK
            public final void accept(Object obj) {
                C46865IaL c46865IaL = C46865IaL.this;
                String str = (String) obj;
                c46865IaL.getClass();
                if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, c46865IaL.LIZLLL)) {
                    c46865IaL.LIZLLL = str;
                    c46865IaL.LJ = c46865IaL.LIZIZ(str);
                }
            }
        });
        ITO ito = ITO.LIZJ;
        ((CopyOnWriteArraySet) ito.LIZ).add(new IUK() { // from class: X.IaU
            @Override // X.IUK
            public final void accept(Object obj) {
                C46865IaL c46865IaL = C46865IaL.this;
                if (TextUtils.equals((String) obj, c46865IaL.LIZLLL)) {
                    c46865IaL.LIZLLL = null;
                    c46865IaL.LJ = null;
                }
            }
        });
    }

    public final SimVideoUrlModel LIZIZ(String str) {
        SimVideoUrlModel simVideoUrlModel;
        String str2 = this.LIZJ;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || ((ConcurrentHashMap) this.LIZ).isEmpty()) {
            return null;
        }
        C46872IaS c46872IaS = (C46872IaS) ((ConcurrentHashMap) this.LIZ).get(str2);
        if (c46872IaS == null || TextUtils.isEmpty(str) || (simVideoUrlModel = (SimVideoUrlModel) ((ConcurrentHashMap) c46872IaS.LIZIZ).get(str)) == null) {
            for (C46872IaS c46872IaS2 : ((ConcurrentHashMap) this.LIZ).values()) {
                c46872IaS2.getClass();
                if (!TextUtils.isEmpty(str) && ((ConcurrentHashMap) c46872IaS2.LIZIZ).containsKey(str)) {
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    return (SimVideoUrlModel) ((ConcurrentHashMap) c46872IaS2.LIZIZ).get(str);
                }
            }
            return null;
        }
        return simVideoUrlModel;
    }
}
