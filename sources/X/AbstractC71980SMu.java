package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SMu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71980SMu extends SLJ {
    public final SKL LJLL;
    public final C62822Ol8 LJLLI;

    public abstract String LLII();

    public void LLIIII() {
    }

    public final PrivacySettingsRestrictionItem LLIFFJFJJ() {
        return (PrivacySettingsRestrictionItem) this.LJLLI.getValue();
    }

    @Override // X.SLJ
    public boolean LL() {
        return SN3.LIZJ(LLIFFJFJJ()).LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC71980SMu(Context context, SKL toastHolder) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLL = toastHolder;
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1143));
    }

    public static void LLFZ(AbstractC71980SMu abstractC71980SMu, SK9 sk9) {
        abstractC71980SMu.getClass();
        sk9.LJIIIZ = new AqS162S0100000_12(abstractC71980SMu, 1144);
        sk9.LJIIJ = new C53391KxP(abstractC71980SMu);
        sk9.LJIIIIZZ = new AqS178S0100000_12(abstractC71980SMu, 564);
        sk9.LJII = new C71985SMz(abstractC71980SMu, false);
    }
}
