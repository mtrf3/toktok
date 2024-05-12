package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.StringBadge;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CWv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31473CWv extends AbstractC31462CWk<C31475CWx> implements InterfaceC29517BiD {
    public final int LIZIZ;
    public final BadgeStruct LIZJ;
    public final Context LIZLLL;

    @Override // X.AbstractC31462CWk
    public final C31475CWx LIZLLL() {
        String str;
        StringBadge stringBadge;
        C31475CWx c31475CWx = new C31475CWx(this.LIZLLL);
        BadgeStruct badgeStruct = this.LIZJ;
        if (badgeStruct == null || (stringBadge = badgeStruct.stringBadge) == null || (str = stringBadge.contentStr) == null) {
            str = "";
        }
        c31475CWx.LJIIIZ = str;
        c31475CWx.LJIIJ = -1;
        c31475CWx.LJI = C259910h.LIZIZ(R.attr.bmr, c31475CWx.LIZ);
        c31475CWx.LJII = C15380j0.LIZ(4.0f);
        c31475CWx.LJIIIIZZ = C15380j0.LIZ(6.0f);
        c31475CWx.LIZLLL = 8;
        c31475CWx.LJIIL = 600;
        return c31475CWx;
    }

    @Override // X.InterfaceC29517BiD
    public final BadgeStruct LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC31462CWk
    public final int LIZJ() {
        return this.LIZIZ;
    }

    public C31473CWv(int i, BadgeStruct badgeStruct, Context context) {
        o.LJIIIZ(context, "context");
        this.LIZIZ = i;
        this.LIZJ = badgeStruct;
        this.LIZLLL = context;
    }
}
