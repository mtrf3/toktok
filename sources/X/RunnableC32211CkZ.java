package X;

import Y.AfS36S0101000_5;
import Y.AfS4S0100100_5;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.RequestAudienceApiExperiment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CkZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32211CkZ implements Runnable {
    public boolean LJLIL;
    public final Long LJLILLLLZI;
    public final Long LJLJI;
    public java.util.Set<Long> LJLJJI;
    public final List<InterfaceC64592gB<java.util.Map<Long, Long>>> LJLJJL;
    public final String LJLJJLL;
    public final /* synthetic */ C55077LjV LJLJL;

    public final void LIZ() {
        Long l;
        this.LJLIL = true;
        Long l2 = this.LJLILLLLZI;
        if (l2 != null && (l = this.LJLJI) != null) {
            this.LJLJL.LIZJ.put(l2, l);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        if (this.LJLILLLLZI.longValue() != 0) {
            Long l3 = (Long) ((HashMap) this.LJLJL.LIZIZ).get(Long.valueOf(this.LJLILLLLZI.longValue()));
            if (l3 != null) {
                j = l3.longValue();
            }
            if (currentTimeMillis - Long.valueOf(j).longValue() < C55077LjV.LIZJ()) {
                LIZIZ();
                return;
            }
        }
        this.LJLJJI = new HashSet(this.LJLJL.LIZJ.snapshot().keySet());
        StringBuilder sb = new StringBuilder();
        ((HashSet) this.LJLJJI).add(this.LJLILLLLZI);
        if (!C79004UzY.LJJIFFI(this.LJLJJI)) {
            Iterator it = ((HashSet) this.LJLJJI).iterator();
            while (it.hasNext()) {
                sb.append(String.valueOf(it.next()));
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",")) {
            sb2 = C79061V1d.LJ(sb2, 1, 0);
        }
        this.LJLJL.LJII.liveStates(sb2, this.LJLJJLL, RequestAudienceApiExperiment.INSTANCE.getValue()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS4S0100100_5(currentTimeMillis, this, 22), new AfS36S0101000_5(2, this, 48));
    }

    public final void LIZIZ() {
        this.LJLIL = false;
        java.util.Map<Long, Long> map = this.LJLJL.LIZ;
        if (!C79004UzY.LJJIFFI(this.LJLJJL)) {
            Iterator it = ((ArrayList) this.LJLJJL).iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC64592gB) it.next()).accept(map);
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onResult:");
                    LIZ.append(android.util.Log.getStackTraceString(e));
                    C36922EeM.LIZLLL(2, "LiveStateManager", X1D.LIZIZ(LIZ));
                }
            }
        }
        this.LJLJL.LJIIJ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC32211CkZ(C55077LjV c55077LjV, Long l, Long l2, InterfaceC64592gB<java.util.Map<Long, Long>> interfaceC64592gB, String str) {
        this.LJLJL = c55077LjV;
        ArrayList arrayList = new ArrayList(3);
        this.LJLJJL = arrayList;
        this.LJLILLLLZI = l;
        this.LJLJI = l2;
        this.LJLJJLL = str;
        arrayList.add(interfaceC64592gB);
    }
}
