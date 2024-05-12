package X;

import android.content.Context;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import kotlin.jvm.internal.o;

/* renamed from: X.Frq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40306Frq extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C40306Frq INSTANCE = new C40306Frq();

    public C40306Frq() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Context context;
        AwemeHostApplication LIZ = FKM.LIZ();
        if (LIZ != null) {
            context = C16880lQ.LLLLJI(LIZ);
        } else {
            context = null;
        }
        o.LJI(context);
        return Integer.valueOf(C17N.LJJJJI(C61410O8g.LIZIZ(context)));
    }
}
