package X;

import android.os.SystemClock;
import defpackage.b1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OrQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63212OrQ implements InterfaceC63353Oth<java.util.Map<String, List<C109544Rq>>> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ C63281OsX LJLJJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(java.util.Map<String, List<C109544Rq>> map) {
        int size;
        boolean z;
        boolean z2;
        java.util.Map<String, List<C109544Rq>> map2 = map;
        this.LJLJJI.LJIIZILJ += SystemClock.uptimeMillis() - this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetMsgByUserHandler saveMsg onCallback, result:");
        if (map2 == null) {
            size = 0;
        } else {
            size = map2.size();
        }
        LIZ.append(size);
        LIZ.append(", seqId:");
        LIZ.append(this.LJLILLLLZI);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        long uptimeMillis = SystemClock.uptimeMillis();
        if (map2 != null && !map2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str : map2.keySet()) {
                List<C109544Rq> list = map2.get(str);
                C63309Osz.LIZLLL().LJFF(list, 3, new C107074Id());
                for (C109544Rq c109544Rq : list) {
                    C63193Or7 LIZIZ = C63198OrC.LIZIZ(c109544Rq.getMsgId());
                    if (LIZIZ != null && this.LJLJJI.LJ != 0) {
                        C63308Osy.LJI().getClass();
                        long LJ = C63308Osy.LJ();
                        LIZIZ.LJFF = LJ - LIZIZ.LIZLLL;
                        LIZIZ.LJI = LJ - LIZIZ.LIZJ;
                        C63198OrC.LIZLLL(c109544Rq);
                        C63198OrC.LIZJ(c109544Rq);
                    }
                }
                StringBuilder LIZJ = b1.LIZJ(str, ", messageList:");
                LIZJ.append(Integer.valueOf(list.size()));
                LIZJ.append(", seqId:");
                LIZJ.append(this.LJLILLLLZI);
                C63322OtC.LJI("GetMsgByUserHandler saveMsg onCallback onGetMessage, conversationId:", X1D.LIZIZ(LIZJ), null);
                C63308Osy.LJI().LIZLLL().getClass();
                List<C109544Rq> LIZ2 = C63162Oqc.LIZ(str, map2.get(str));
                if (LIZ2 != null) {
                    arrayList.addAll(LIZ2);
                }
                if (!C63269OsL.LJI(this.LJLJJI.LIZJ, str)) {
                    StringBuilder LIZJ2 = b1.LIZJ(str, ", seqId:");
                    LIZJ2.append(this.LJLILLLLZI);
                    C63322OtC.LJI("GetMsgByUserHandler  saveMsg onCallback onUpdateConversation, conversationId:", X1D.LIZIZ(LIZJ2), null);
                    C115284fk.LJIILIIL().LJIJJ(false, 2, C115284fk.LJIILIIL().LJIIIZ(str));
                }
            }
            if (!arrayList.isEmpty()) {
                C63308Osy.LJI().LIZIZ().LJIIZILJ();
            }
        }
        this.LJLJJI.LJIJ += SystemClock.uptimeMillis() - uptimeMillis;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C63308Osy.LJI().LIZLLL().LJIJJLI == 1) {
            if (this.LJLJJI.LIZLLL == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C63269OsL.LIZLLL(z2);
        } else if (!this.LJLJI.booleanValue()) {
            if (this.LJLJJI.LIZLLL == 0) {
                z = true;
            } else {
                z = false;
            }
            C63269OsL.LIZLLL(z);
            if (!C63269OsL.LJII(this.LJLJJI.LIZJ)) {
                C63269OsL.LJIIL(this.LJLJJI.LIZJ, 1);
            }
        }
        this.LJLJJI.LJIJI += SystemClock.uptimeMillis() - uptimeMillis2;
        if (!this.LJLJI.booleanValue()) {
            this.LJLJJI.LJIILIIL(true, null);
        }
    }

    public C63212OrQ(C63281OsX c63281OsX, long j, long j2, Boolean bool) {
        this.LJLJJI = c63281OsX;
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = bool;
    }
}
