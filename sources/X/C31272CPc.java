package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CPc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31272CPc extends CQJ {
    @Override // X.CQK
    public final boolean LLIIJI() {
        return false;
    }

    public final List<BadgeStruct> LLILLJJLI() {
        List<BadgeStruct> badgeList;
        ArrayList arrayList = new ArrayList();
        User user = getUser();
        if (user != null && (badgeList = user.getBadgeList()) != null) {
            for (BadgeStruct badgeStruct : badgeList) {
                if (badgeStruct.badgeScene == 6) {
                    arrayList.add(badgeStruct);
                }
            }
        }
        return arrayList;
    }

    @Override // X.CQL, X.CXK
    public final int LJIIL() {
        return C15380j0.LIZIZ(R.color.a13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31272CPc(ChatMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
    }

    @Override // X.AbstractC31075CHn, X.CQK, X.CQL, X.InterfaceC31341CRt
    public final void LJIILLIIL(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        super.LJIILLIIL(publicScreenContext);
        LLII(LLILLJJLI(), publicScreenContext, 8);
    }

    @Override // X.CQK, X.CQL, X.InterfaceC31341CRt
    public final void LJJJI(CQQ publicScreenContext) {
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        super.LJJJI(publicScreenContext);
        LLII(LLILLJJLI(), publicScreenContext, 8);
    }
}
