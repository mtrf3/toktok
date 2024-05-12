package X;

import Y.ARunnableS15S1000000_10;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.Oqz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63185Oqz implements InterfaceC63353Oth<Pair<List<C109544Rq>, C63166Oqg>> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC86963bA LJLJI;
    public final /* synthetic */ C63220OrY LJLJJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Pair<List<C109544Rq>, C63166Oqg> pair) {
        C63120Opw LJIIIZ;
        Object obj;
        Pair<List<C109544Rq>, C63166Oqg> pair2 = pair;
        if (pair2 == null) {
            this.LJLJJI.LJLL.set(false);
            return;
        }
        C63322OtC.LJFF("MessageModel initMessageList onCallback");
        C63220OrY c63220OrY = this.LJLJJI;
        c63220OrY.LJLJLLL = true;
        List list = (List) pair2.first;
        C63166Oqg c63166Oqg = (C63166Oqg) pair2.second;
        int i = this.LJLIL;
        String str = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel onPerformInit start, result:");
        LIZ.append(list.size());
        LIZ.append(", pageLimit:");
        LIZ.append(i);
        LIZ.append(", info:");
        LIZ.append(c63166Oqg);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (i <= 0) {
            i = c63220OrY.LJLJI;
        }
        if (!c63220OrY.LJZ && c63220OrY.LJLZ > 0) {
            C47922IrO.LIZ();
            String str2 = c63220OrY.LJLIL;
            long uptimeMillis = SystemClock.uptimeMillis() - c63220OrY.LJLZ;
            try {
                C63323OtD c63323OtD = new C63323OtD();
                c63323OtD.LIZJ("im_sdk_init_msg_list");
                c63323OtD.LIZ(str2, "conversation_id");
                String str3 = CardStruct.IStatusCode.DEFAULT;
                c63323OtD.LIZ(CardStruct.IStatusCode.DEFAULT, "use_msg_flag");
                c63323OtD.LIZ(Long.valueOf(uptimeMillis), "duration");
                if (c63166Oqg == null) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                c63323OtD.LIZ(obj, "is_from_location");
                if (c63166Oqg != null) {
                    c63323OtD.LIZ(String.valueOf(c63166Oqg.LIZIZ), "step");
                    if (c63166Oqg.LIZ) {
                        str3 = "1";
                    }
                    c63323OtD.LIZ(str3, "is_full_continue");
                    c63323OtD.LIZ(Integer.valueOf(c63166Oqg.LIZJ), "origin_size");
                    c63323OtD.LIZ(Integer.valueOf(c63166Oqg.LIZLLL), "continue_size");
                    c63323OtD.LIZ(0L, "max_index");
                    c63323OtD.LIZ(0L, "base_index");
                    c63323OtD.LIZ(C63272OsO.LJIILJJIL(null), "index_range");
                    c63323OtD.LIZ(C63272OsO.LJIILJJIL(null), "leak_range");
                    c63323OtD.LIZ(C63272OsO.LJIILJJIL(null), "continue_range");
                    c63323OtD.LIZ(C63272OsO.LJIILIIL(null), "repaired_before");
                    c63323OtD.LIZ(C63272OsO.LJIILIIL(null), "repaired_after");
                    c63323OtD.LIZ(Long.valueOf(c63166Oqg.LJ), "continue_cost");
                }
                c63323OtD.LJ();
            } catch (Exception e) {
                C63322OtC.LJ("IMPerfMonitor monitorMsgInit", e);
            }
        }
        c63220OrY.LJZ = true;
        c63220OrY.LJLILLLLZI.clear();
        c63220OrY.LJLILLLLZI.addAll(list);
        c63220OrY.LJLL.set(false);
        if (c63166Oqg.LIZ && list.size() < i && c63220OrY.LJLJLLL) {
            C63322OtC.LJFF("MessageModel onPerformInit, less than limit, loadHistory");
            c63220OrY.LJIILLIIL();
        }
        c63220OrY.K7(1, str, list);
        String str4 = c63220OrY.LJLIL;
        if (!TextUtils.isEmpty(str4) && C63314Ot4.LJFF() && !(true ^ ((CopyOnWriteArraySet) C63269OsL.LIZJ).isEmpty()) && C63309Osz.LJIIJJI && (LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str4)) != null && !LJIIIZ.isDissolved() && LJIIIZ.isMember()) {
            C63346Ota.LIZIZ().execute(new ARunnableS15S1000000_10(LJIIIZ, str4, 0));
        }
        int i2 = c63220OrY.LJLJI;
        String conversationId = c63220OrY.LJLIL;
        ArrayList arrayList = new ArrayList(list);
        o.LJIIIZ(conversationId, "conversationId");
        C63383OuB LJFF = C63308Osy.LJI().LJFF();
        LJFF.getClass();
        XKX.LIZLLL(LJFF.LJIIL, null, null, new C75352xX(LJFF, i2, conversationId, arrayList, null), 3);
        if (!c63166Oqg.LIZ) {
            int i3 = c63166Oqg.LIZJ;
            int i4 = c63166Oqg.LIZLLL;
            if (i3 - i4 >= 10 || i4 <= 15) {
                c63220OrY.LJIIJJI();
            }
        }
        InterfaceC86963bA interfaceC86963bA = this.LJLJI;
        if (interfaceC86963bA == null) {
            return;
        }
        interfaceC86963bA.onSuccess(null);
    }

    public C63185Oqz(C63220OrY c63220OrY, int i, String str, InterfaceC86963bA interfaceC86963bA) {
        this.LJLJJI = c63220OrY;
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC86963bA;
    }
}
