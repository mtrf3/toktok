package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BUw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28874BUw {
    public static int LIZJ;
    public static long LJFF;
    public static boolean LJII;
    public static int LJIIIIZZ;
    public static final C28874BUw LIZ = new C28874BUw();
    public static boolean LIZIZ = true;
    public static int LIZLLL = 1;
    public static final List<QuestionEx> LJ = new ArrayList();
    public static final C73318Sq2 LJI = new C73318Sq2();

    public static void LIZ() {
        LJI.LIZLLL();
        LIZIZ = true;
        LIZJ = 0;
        LIZLLL = 1;
        ((ArrayList) LJ).clear();
    }

    public static final void LIZIZ(int i, int i2, InterfaceC88472Yns<? super List<QuestionEx>, C76800UCe> interfaceC88472Yns) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || LJFF != room.getId() || LJIIIIZZ != i2) {
            LIZ();
            LJIIIIZZ = i2;
        }
        ArrayList arrayList = (ArrayList) LJ;
        if (arrayList.size() < i) {
            LIZJ(arrayList.isEmpty(), i2, new C28873BUv(i, i2, interfaceC88472Yns), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            List<QuestionEx> list = LJ;
            arrayList2.add(ListProtector.get(list, LIZJ));
            int i4 = LIZJ + 1;
            LIZJ = i4;
            if (i4 >= ((ArrayList) list).size()) {
                LIZJ = 0;
            }
        }
        int i5 = LIZJ + 4;
        ArrayList arrayList3 = (ArrayList) LJ;
        if (i5 >= arrayList3.size() && LIZIZ && !LJII) {
            LIZJ(arrayList3.isEmpty(), i2, null, null);
        }
        if (interfaceC88472Yns == null) {
            return;
        }
        interfaceC88472Yns.invoke(arrayList2);
    }

    public static void LIZJ(boolean z, int i, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        if (z) {
            LIZ();
        }
        if (!LIZIZ) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(new ArrayList());
                return;
            }
            return;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(null);
                return;
            }
            return;
        }
        if (LJFF != room.getId()) {
            LIZ();
            LJFF = room.getId();
        }
        LJII = true;
        QAApi qAApi = (QAApi) C1A.LIZJ(QAApi.class);
        long id = room.getId();
        int i2 = LIZLLL;
        if (!C30184Bsy.LIZ) {
            i = 2;
        }
        LJI.LIZ(C1EW.LIZ(qAApi.getRecommendQuestion(id, i2, i)).LJJJLIIL(new AfS54S0200000_5(interfaceC88472Yns, interfaceC88472Yns2, 48), new AfS57S0100000_5(interfaceC88472Yns2, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 248)));
    }
}
