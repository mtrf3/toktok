package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.AqS163S0100000_13;

/* loaded from: classes14.dex */
public final class TSY {
    public static TSY LJIIJ;
    public final Room LIZ;
    public final User LIZIZ;
    public final Context LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public SparkContext LJIIIIZZ;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C74685TSv.LJLIL);
    public String LJFF = "";
    public String LJI = "";
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C74689TSz.LJLIL);
    public final TTF LJIIIZ = new TTF(this);

    public final void LIZ() {
        InterfaceC40159FpT LJIILL;
        SparkContext sparkContext = this.LJIIIIZZ;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        this.LJIIIIZZ = null;
    }

    public TSY(Room room, User user, Context context, AqS163S0100000_13 aqS163S0100000_13) {
        this.LIZ = room;
        this.LIZIZ = user;
        this.LIZJ = context;
        this.LIZLLL = aqS163S0100000_13;
    }
}
