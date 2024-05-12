package X;

import com.ss.android.ugc.aweme.commercialize.utils.AdOpenHelperImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.IAdOpenHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HSi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44096HSi extends HSS {
    @Override // X.S1E
    public final S1E clone() {
        return new C44096HSi();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ADS_ANCHOR.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", LJJII().getAwemeRawAd());
        LIZLLL.LIZJ("anchor", "refer");
        LIZLLL.LJI();
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        IAdOpenHelper iAdOpenHelper;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        Aweme LJJII = LJJII();
        boolean LJLJJL = C63081OpJ.LJLJJL(LJJII);
        if (!LJJII.isAd() && LJLJJL) {
            C26045AKb c26045AKb = new C26045AKb(LJIIIZ().LIZ());
            c26045AKb.LJIIIIZZ(R.string.b95);
            c26045AKb.LJIIJ();
            return;
        }
        HSS.LJJIZ(this, eventMapBuilder, 6);
        Object LIZ = C58096Mr6.LIZ(IAdOpenHelper.class, false);
        if (LIZ != null) {
            iAdOpenHelper = (IAdOpenHelper) LIZ;
        } else {
            if (C58096Mr6.LLLLZLL == null) {
                synchronized (IAdOpenHelper.class) {
                    if (C58096Mr6.LLLLZLL == null) {
                        C58096Mr6.LLLLZLL = new AdOpenHelperImpl();
                    }
                }
            }
            iAdOpenHelper = C58096Mr6.LLLLZLL;
        }
        if (iAdOpenHelper != null) {
            iAdOpenHelper.LIZ(LJIIIZ().LIZ(), LJJII());
        }
    }
}
