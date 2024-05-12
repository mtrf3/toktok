package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Oqn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC63173Oqn implements Runnable {
    public final /* synthetic */ C109544Rq LJLIL;
    public final /* synthetic */ java.util.Map LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ C63120Opw LJLJJLL;

    public final void LIZ() {
        List singletonList = Collections.singletonList(this.LJLIL);
        HashMap hashMap = new HashMap();
        if (this.LJLILLLLZI != null) {
            hashMap.put(String.valueOf(this.LJLIL.getMsgId()), this.LJLILLLLZI);
        }
        C63309Osz.LIZLLL().LJIIL(hashMap, -1, singletonList);
        if (this.LJLJI) {
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            C109544Rq c109544Rq = this.LJLIL;
            LIZLLL.getClass();
            if (c109544Rq != null && !TextUtils.isEmpty(c109544Rq.getConversationId())) {
                LIZLLL.LIZJ(c109544Rq.getConversationId(), new C63247Orz(c109544Rq));
            }
        }
        if (this.LJLJJI || this.LJLJJL || this.LJLJI) {
            C115284fk.LJIILIIL().LJIJI(2, this.LJLJJLL);
        }
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

    public RunnableC63173Oqn(C109544Rq c109544Rq, java.util.Map map, boolean z, boolean z2, boolean z3, C63120Opw c63120Opw) {
        this.LJLIL = c109544Rq;
        this.LJLILLLLZI = map;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = c63120Opw;
    }
}
