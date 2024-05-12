package X;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: X.Ukr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78093Ukr extends AbstractC78073UkX {
    public final C78086Ukk LJZL;

    public final int getTrayNum() {
        return getMIndex();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78093Ukr(Context context) {
        super(context);
        new LinkedHashMap();
        setMTrayType(EnumC78095Ukt.REMOTE);
        this.LJZL = new C78086Ukk(this);
    }

    @Override // X.AbstractC78073UkX
    public EnumC78089Ukn LIZLLL(boolean z) {
        return EnumC78089Ukn.ONE_HOST_MEDIUM_V3;
    }
}
