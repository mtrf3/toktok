package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.NKq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59184NKq {
    public int LIZ;
    public View LIZIZ;
    public C60193Njp LIZJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZLLL;
    public View LJ;
    public InterfaceC40516FvE LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    public abstract boolean LIZ();

    public abstract String LIZIZ();

    public abstract String LIZJ();

    public final void LJ() {
        int i = this.LIZ;
        String str = "1";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    String LIZJ = LIZJ();
                    C188727au LIZJ2 = C78920UyC.LIZJ(0, "is_successful");
                    LIZJ2.LIZLLL(this.LJIIIIZZ, "is_ever_failed");
                    LIZJ2.LIZLLL(0, "failed_reason");
                    if (!LIZ()) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZJ2.LJIIIZ("is_spark", str);
                    FMX.LJIIL(LIZJ, LIZJ2.LIZ);
                    return;
                }
                String LIZJ3 = LIZJ();
                C188727au LIZJ4 = C78920UyC.LIZJ(1, "is_successful");
                LIZJ4.LIZLLL(this.LJIIIIZZ, "is_ever_failed");
                if (!LIZ()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                LIZJ4.LJIIIZ("is_spark", str);
                FMX.LJIIL(LIZJ3, LIZJ4.LIZ);
                return;
            }
            String LIZJ5 = LIZJ();
            C188727au LIZJ6 = C78920UyC.LIZJ(0, "is_successful");
            LIZJ6.LIZLLL(this.LJIIIIZZ, "is_ever_failed");
            LIZJ6.LIZLLL(3, "failed_reason");
            if (!LIZ()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ6.LJIIIZ("is_spark", str);
            FMX.LJIIL(LIZJ5, LIZJ6.LIZ);
            return;
        }
        String LIZJ7 = LIZJ();
        C188727au LIZJ8 = C78920UyC.LIZJ(0, "is_successful");
        LIZJ8.LIZLLL(this.LJIIIIZZ, "is_ever_failed");
        LIZJ8.LIZLLL(2, "failed_reason");
        if (!LIZ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ8.LJIIIZ("is_spark", str);
        FMX.LJIIL(LIZJ7, LIZJ8.LIZ);
    }

    public AbstractC59184NKq(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
    }

    public final void LIZLLL(int i) {
        String str;
        if (i != this.LIZ) {
            String LIZIZ = LIZIZ();
            C188727au LIZJ = C78920UyC.LIZJ(i, "status");
            LIZJ.LIZLLL(this.LJIIIIZZ, "is_ever_failed");
            if (LIZ()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ.LJIIIZ("is_spark", str);
            FMX.LJIIL(LIZIZ, LIZJ.LIZ);
        }
        this.LIZ = i;
    }
}
