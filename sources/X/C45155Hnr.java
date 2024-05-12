package X;

import com.bytedance.ies.smartmovie.jni.SmartMovie;
import com.bytedance.ies.smartmovie.jni.SmartMovieConfig;
import java.util.HashMap;

/* renamed from: X.Hnr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45155Hnr {
    public static final /* synthetic */ InterfaceC74236TBo[] LJ;
    public SmartMovie LIZ;
    public SmartMovieConfig LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C45157Hnt.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C45156Hns.LJLIL);

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C45155Hnr.class), "storeHelper", "getStoreHelper()Lcom/bytedance/ies/smartmovie/core/SmartMovieStoreHelper;");
        C65352Pkq.LIZ.getClass();
        LJ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C45155Hnr.class), "execMap", "getExecMap()Ljava/util/HashMap;")};
    }

    public final HashMap<String, Long> LIZ() {
        return (HashMap) this.LIZLLL.getValue();
    }
}
