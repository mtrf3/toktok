package X;

import Y.ACallableS87S0200000_10;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardInsertRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardSceneInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardType;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Nyx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61131Nyx implements InterfaceC54881LgL {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C61135Nz1.LJLIL);
    public volatile int LIZIZ = 1;

    @Override // X.InterfaceC54881LgL
    public void LIZJ() {
    }

    public abstract FeedCardType LJ(FeedCardSceneInfo feedCardSceneInfo);

    public final List<CardTypeRequest> LJFF() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-insertCardTypes>(...)");
        return (List) value;
    }

    @Override // X.InterfaceC54881LgL
    public final String LIZ() {
        if (LJFF().isEmpty()) {
            return "";
        }
        try {
            String LJIILL = GsonHolder.LIZLLL().LIZ().LJIILL(new CardInsertRequest(this.LIZIZ, LJFF()));
            o.LJIIIIZZ(LJIILL, "{\n            val reques…toJson(request)\n        }");
            return LJIILL;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // X.InterfaceC54881LgL
    public void LIZIZ(CardTypeRequest cardTypeRequest) {
        if (cardTypeRequest != null) {
            Iterator<CardTypeRequest> it = LJFF().iterator();
            while (it.hasNext()) {
                if (it.next().cardType == cardTypeRequest.cardType) {
                    return;
                }
            }
            LJFF().add(cardTypeRequest);
        }
    }

    @Override // X.InterfaceC54881LgL
    public final void LIZLLL(FeedItemList feedItemList) {
        if (feedItemList != null && feedItemList.getItems() != null) {
            this.LIZIZ++;
        }
        LJFF().clear();
        C10K.LIZIZ(new ACallableS87S0200000_10(feedItemList, this, 8), C10K.LJI, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJI(com.ss.android.ugc.aweme.feed.model.FeedItemList r13) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61131Nyx.LJI(com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }
}
