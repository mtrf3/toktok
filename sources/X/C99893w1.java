package X;

import Y.IDcS364S0100000_1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoCard;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSug;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoSugResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS8S0211000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99893w1 {
    public final C99033ud LIZ;
    public final ChatRoomViewModel LIZIZ;
    public final C99873vz LIZJ = C96963rI.LJI().LIZ;

    public final void LIZJ(boolean z) {
        C99873vz c99873vz = this.LIZJ;
        if (c99873vz != null) {
            c99873vz.LJII = false;
        }
        C99933w5 c99933w5 = new C99933w5(false, z, this.LIZ.getDisableLocateMsgWhenEnter());
        C57082Lw.LIZ.LIZJ("#UPDATE_SUG_EVENT").setValue(c99933w5);
        if (c99933w5.LJLIL || !c99933w5.LJLILLLLZI) {
            ChatRoomViewModel chatRoomViewModel = this.LIZIZ;
            C99963w8 event = C99963w8.LIZ;
            chatRoomViewModel.getClass();
            o.LJIIIZ(event, "event");
            chatRoomViewModel.LJLLLL.onNext(event);
        }
    }

    public C99893w1(C99033ud c99033ud, ChatRoomViewModel chatRoomViewModel) {
        this.LIZ = c99033ud;
        this.LIZIZ = chatRoomViewModel;
    }

    public final void LIZ(TakoSugResponse takoSugResponse, boolean z) {
        Integer num;
        List<C109544Rq> LJIIJJI;
        List<TakoSug> list;
        String str = null;
        if (takoSugResponse != null) {
            num = takoSugResponse.getSugScene();
        } else {
            num = null;
        }
        int value = EnumC99913w3.CARD.getValue();
        if (num == null || num.intValue() != value) {
            if (takoSugResponse != null) {
                list = takoSugResponse.getSugList();
            } else {
                list = null;
            }
            C99873vz c99873vz = this.LIZJ;
            if (c99873vz == null || list == null || !(!list.isEmpty()) || c99873vz.LJII || !c99873vz.LJIIIIZZ()) {
                return;
            }
            TakoSug takoSug = (TakoSug) ORZ.LJLLLL(list);
            if (takoSug != null && !takoSug.LIZ) {
                TakoSug takoSug2 = (TakoSug) ORZ.LJLLLL(list);
                if (takoSug2 != null) {
                    str = takoSug2.LIZIZ;
                }
                if (!o.LJ(str, C93793mB.LIZJ((C109544Rq) ORZ.LJLLLL(c99873vz.LIZIZ.LJ())))) {
                    return;
                }
            }
            c99873vz.LJII = true;
            c99873vz.LJIIIIZZ = list;
            c99873vz.LJIIJ().setUuid(UUID.randomUUID().toString());
            c99873vz.LJIIJ().setCreatedAt(System.currentTimeMillis());
            C99933w5 c99933w5 = new C99933w5(true, z, this.LIZ.getDisableLocateMsgWhenEnter());
            C57082Lw.LIZ.LIZJ("#UPDATE_SUG_EVENT").setValue(c99933w5);
            if (!c99933w5.LJLIL && c99933w5.LJLILLLLZI) {
                return;
            }
            ChatRoomViewModel chatRoomViewModel = this.LIZIZ;
            C99963w8 event = C99963w8.LIZ;
            chatRoomViewModel.getClass();
            o.LJIIIZ(event, "event");
            chatRoomViewModel.LJLLLL.onNext(event);
            return;
        }
        List<TakoCard> takoCards = takoSugResponse.getTakoCards();
        try {
            C99873vz c99873vz2 = this.LIZJ;
            if (c99873vz2 == null || (LJIIJJI = c99873vz2.LJIIJJI(takoCards)) == null || !C1GE.LJIILIIL(LJIIJJI)) {
                return;
            }
            LIZIZ(0, z, LJIIJJI);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get or add tako card fake messages fail, exception: ");
            LIZ.append(e);
            V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZIZ(int i, boolean z, List list) {
        if (i >= list.size()) {
            return;
        }
        C109544Rq c109544Rq = (C109544Rq) ListProtector.get(list, i);
        AqS8S0211000_1 aqS8S0211000_1 = new AqS8S0211000_1(i, this, list, z, 0);
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe.LIZIZ.LJFF(new IDcS364S0100000_1(aqS8S0211000_1, 23), c109544Rq);
    }
}
