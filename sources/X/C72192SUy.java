package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import kotlin.jvm.internal.o;

/* renamed from: X.SUy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72192SUy {
    public final EnumC72191SUx LIZ;
    public final Context LIZIZ;
    public final TTMStoreLink LIZJ;
    public final String LIZLLL;

    public final SV3 LIZ() {
        EnumC72191SUx enumC72191SUx = this.LIZ;
        Context LLLLL = C16880lQ.LLLLL(this.LIZIZ);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        return new SV3(enumC72191SUx, LLLLL, this.LIZJ, this.LIZLLL);
    }

    public C72192SUy(EnumC72191SUx anchorType, Context context, TTMStoreLink tTMStoreLink, String str) {
        o.LJIIIZ(anchorType, "anchorType");
        o.LJIIIZ(context, "context");
        this.LIZ = anchorType;
        this.LIZIZ = context;
        this.LIZJ = tTMStoreLink;
        this.LIZLLL = str;
    }
}
