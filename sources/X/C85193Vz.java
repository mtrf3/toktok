package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.profile.model.User;
import djb.IDaS20S0000000_1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.3Vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85193Vz {
    public static final /* synthetic */ int LJIIL = 0;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public final MutableLiveData<List<C3W5>> LIZ = new MutableLiveData<>();
    public final MutableLiveData<List<C3W5>> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<List<C3W5>> LIZJ = new MutableLiveData<>();
    public String LIZLLL = "";
    public long LJ = -1;
    public final C84673XKz LJIIIIZZ = C79146V4k.LJIILIIL();
    public final IDaS20S0000000_1 LJIIIZ = new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 3);
    public final List<SummonFriendItem> LJIIJ = new ArrayList();
    public final List<C3W5> LJIIJJI = new ArrayList();

    public static boolean LIZ(User user) {
        C60903NvH.LJIIJJI().getRegionService();
        String LIZ = C44296Ha0.LIZ();
        String region = user.getRegion();
        if (LIZ != null && LIZ.length() != 0 && o.LJ(LIZ, region)) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(String searchKey, boolean z) {
        o.LJIIIZ(searchKey, "searchKey");
        if (searchKey.length() == 0) {
            return false;
        }
        this.LIZLLL = searchKey;
        if (!z) {
            this.LJII = 0L;
            this.LJI = false;
        } else if (!this.LJI) {
            return false;
        }
        XKX.LIZLLL(C48841JEv.LIZ(EXT.LIZ.plus(this.LJIIIIZZ).plus(this.LJIIIZ)), null, null, new C3W4(this, searchKey, z, null), 3);
        return true;
    }

    public static void LIZIZ(C85193Vz c85193Vz, boolean z, C3W0 c3w0, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            c3w0 = null;
        }
        c85193Vz.getClass();
        if (!z) {
            c85193Vz.LJ = System.currentTimeMillis() / 1000;
            c85193Vz.LJFF = false;
        } else if (!c85193Vz.LJFF) {
            if (c3w0 == null) {
                return;
            }
            c3w0.invoke(Boolean.FALSE);
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(EXT.LIZ.plus(c85193Vz.LJIIIIZZ).plus(new C69442o0(CoroutineExceptionHandler.LJJJJIZL, z, c3w0))), null, null, new C65902iI(c85193Vz, z, null), 3);
    }
}
