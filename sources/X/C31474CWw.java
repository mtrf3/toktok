package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.TextBadge;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CWw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31474CWw extends AbstractC31462CWk<C31475CWx> implements InterfaceC29517BiD {
    public final int LIZIZ;
    public final BadgeStruct LIZJ;
    public final Context LIZLLL;

    @Override // X.AbstractC31462CWk
    public final C31475CWx LIZLLL() {
        TextBadge textBadge;
        String str;
        C31475CWx c31475CWx = new C31475CWx(this.LIZLLL);
        BadgeStruct badgeStruct = this.LIZJ;
        if (badgeStruct != null) {
            textBadge = badgeStruct.textBadge;
        } else {
            textBadge = null;
        }
        CharSequence LJJJJIZL = C77357UXp.LJJJJIZL(textBadge);
        if (LJJJJIZL == null || (str = LJJJJIZL.toString()) == null) {
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

    public C31474CWw(int i, BadgeStruct badgeStruct, Context context) {
        o.LJIIIZ(context, "context");
        this.LIZIZ = i;
        this.LIZJ = badgeStruct;
        this.LIZLLL = context;
    }
}
