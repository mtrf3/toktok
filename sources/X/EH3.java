package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.INUJDebugService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EH3 extends AbstractC39351FcR {
    public final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 113));

    @Override // X.AbstractC39351FcR
    public final int LIZJ() {
        return 1;
    }

    @Override // X.AbstractC39351FcR
    public final String LJ() {
        return "new";
    }

    @Override // X.AbstractC39351FcR
    public final int LIZIZ() {
        ((INUJDebugService) ServiceManager.get().getService(INUJDebugService.class)).LIZ();
        if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
            return 2;
        }
        return 0;
    }

    @Override // X.AbstractC39351FcR
    public final C40865G2b LIZLLL(Context context, Boolean bool, boolean z) {
        int i;
        int i2;
        if (z) {
            i = R.string.sfw;
        } else {
            i = R.string.ip0;
        }
        String string = context.getString(R.string.iot);
        String string2 = context.getString(i);
        if (o.LJ(bool, Boolean.TRUE)) {
            i2 = R.string.hib;
        } else {
            i2 = R.string.ioy;
        }
        return new C40865G2b(string, string2, context.getString(i2));
    }
}
