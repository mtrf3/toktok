package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: X.Oqf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63165Oqf implements InterfaceC63352Otg<Pair<List<C109544Rq>, C63166Oqg>> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C63220OrY LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // X.InterfaceC63352Otg
    public final Pair<List<C109544Rq>, C63166Oqg> LIZIZ() {
        ArrayList arrayList;
        int i;
        int i2;
        C63322OtC.LJFF("MessageModel initMessageList onRun");
        long uptimeMillis = SystemClock.uptimeMillis();
        String str = this.LJLILLLLZI.LJLIL;
        int i3 = this.LJLIL;
        int i4 = 0;
        if (TextUtils.isEmpty(str)) {
            arrayList = Collections.emptyList();
        } else {
            if (i3 <= 0) {
                i3 = 20;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList2 = new ArrayList();
            InterfaceC63132Oq8 interfaceC63132Oq8 = null;
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("select rowid,* from msg where ");
                    LIZ.append(EnumC63154OqU.COLUMN_CONVERSATION_ID.key);
                    LIZ.append("=? AND ");
                    LIZ.append(EnumC63154OqU.COLUMN_DELETED.key);
                    LIZ.append("=? AND ");
                    LIZ.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                    LIZ.append("=?");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZIZ);
                    LIZ2.append(" order by ");
                    LIZ2.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                    LIZ2.append(" desc, ");
                    LIZ2.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                    LIZ2.append(" desc limit ");
                    LIZ2.append(i3);
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ2), new String[]{str, String.valueOf(0), String.valueOf(0)});
                    if (C63308Osy.LJI().LIZLLL().LJJJJJL) {
                        C63150OqQ.LIZLLL(interfaceC63132Oq8, arrayList2);
                    } else {
                        while (interfaceC63132Oq8.moveToNext()) {
                            arrayList2.add(C63150OqQ.LIZJ(interfaceC63132Oq8));
                        }
                    }
                    C63275OsR.LIZIZ().LJI(currentTimeMillis, "initMessageList");
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    C63322OtC.LJ("IMMsgDao initMessageList", e);
                    C63337OtR.LJFF(e);
                }
                C63143OqJ.LIZ(interfaceC63132Oq8);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("IMMsgDao initMessageList, cid:");
                LIZ3.append(str);
                LIZ3.append(", limit:");
                LIZ3.append(i3);
                LIZ3.append(", count:");
                LIZ3.append(arrayList2.size());
                C63322OtC.LIZJ(X1D.LIZIZ(LIZ3));
                arrayList = arrayList2;
            } catch (Throwable th) {
                C63143OqJ.LIZ(interfaceC63132Oq8);
                throw th;
            }
        }
        C63220OrY c63220OrY = this.LJLILLLLZI;
        c63220OrY.getClass();
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(c63220OrY.LJLIL);
        if (LJIIIZ != null) {
            C63356Otk LJIIIZ2 = C63356Otk.LJIIIZ();
            int inboxType = LJIIIZ.getInboxType();
            EnumC63359Otn enumC63359Otn = EnumC63359Otn.MSG_SHOW;
            LJIIIZ2.getClass();
            C63356Otk.LIZLLL(arrayList, inboxType, enumC63359Otn);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
            C63337OtR.LIZLLL("im_init_msg_duration", jSONObject);
        } catch (Exception unused) {
        }
        C115944go LIZJ = C115944go.LIZJ();
        String str2 = this.LJLILLLLZI.LJLIL;
        LIZJ.getClass();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("LeakMsgRepairManager onModelInit, cid:");
        LIZ4.append(str2);
        LIZ4.append(", list:");
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        LIZ4.append(i);
        LIZ4.append(", repair:");
        LIZ4.append(true);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ4));
        long uptimeMillis2 = SystemClock.uptimeMillis();
        C63166Oqg c63166Oqg = new C63166Oqg();
        if (TextUtils.isEmpty(str2) || V1B.LJJZZIII(arrayList)) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("LeakMsgRepairManager findPreContinue, cid:", str2, ", list:");
            if (arrayList != null) {
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            LIZIZ2.append(i2);
            LIZIZ2.append(", invalid");
            C63322OtC.LJFF(X1D.LIZIZ(LIZIZ2));
            c63166Oqg.LIZIZ = 0;
        } else {
            if (arrayList != null) {
                i4 = arrayList.size();
            }
            c63166Oqg.LIZJ = i4;
            C63291Osh.LIZ().getClass();
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("LeakMsgRepairManager findPreContinue, cid:");
            LIZ5.append(str2);
            LIZ5.append(", no recent mode");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ5));
            c63166Oqg.LIZIZ = 1;
        }
        c63166Oqg.LIZLLL = arrayList.size();
        c63166Oqg.LJ = SystemClock.uptimeMillis() - uptimeMillis2;
        if (TextUtils.isEmpty(str2) || ((CopyOnWriteArraySet) LIZJ.LIZIZ).contains(str2)) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("LeakMsgRepairManager triggerRepair, cid:");
            LIZ6.append(str2);
            LIZ6.append(", already doing");
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ6));
        } else {
            C63291Osh.LIZ().getClass();
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("LeakMsgRepairManager triggerRepair, cid:");
            LIZ7.append(str2);
            LIZ7.append(", no recent mode");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ7));
        }
        return new Pair<>(arrayList, c63166Oqg);
    }

    public C63165Oqf(C63220OrY c63220OrY, int i) {
        this.LJLILLLLZI = c63220OrY;
        this.LJLIL = i;
    }
}
