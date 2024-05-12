package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$ProgressBarInfo;
import com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$Stage;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.2OE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2OE {
    public static String LIZ;
    public static WeakReference<C57602Nw> LIZIZ;
    public static WeakReference<BaseListFragmentPanel> LIZJ;
    public static final Keva LIZLLL;
    public static final HashMap<String, Object> LJ;
    public static final HashMap<String, Object> LJFF;
    public static final HashMap<String, Object> LJI;
    public static final HashMap<String, Object> LJII;
    public static final HashSet<Integer> LJIIIIZZ;
    public static NewUserProgressModel$ProgressBarInfo LJIIIZ;
    public static String LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;
    public static int LJIILIIL;
    public static EnumC61772bd LJIILJJIL;
    public static List<NewUserProgressModel$Stage> LJIILL;
    public static CountDownTimer LJIILLIIL;
    public static int LJIIZILJ;
    public static int LJIJ;
    public static final C73893SzJ<C2O2> LJIJI;
    public static final C73893SzJ<C76800UCe> LJIJJ;
    public static C73318Sq2 LJIJJLI;
    public static long LJIL;
    public static boolean LJJ;
    public static boolean LJJI;

    static {
        new C2OF();
        LIZLLL = Keva.getRepo("guidance_progress_bar");
        LJ = new HashMap<>();
        LJFF = new HashMap<>();
        LJI = new HashMap<>();
        LJII = new HashMap<>();
        LJIIIIZZ = new HashSet<>();
        LJIIJ = CardStruct.IStatusCode.DEFAULT;
        LJIIJJI = 5;
        LJIIL = 2;
        LJIIZILJ = 2;
        LJIJI = new C73893SzJ<>();
        LJIJJ = new C73893SzJ<>();
        LJIJJLI = new C73318Sq2();
        LJIL = -1L;
        C2OF.LJ(false);
    }

    public static final void LIZ(double d) {
        Number valueOf;
        long currentTimeMillis = System.currentTimeMillis();
        long j = LJIL;
        if (j != -1) {
            valueOf = Long.valueOf(currentTimeMillis - j);
        } else {
            valueOf = Double.valueOf(d);
        }
        if (LJIILJJIL == EnumC61772bd.PERCENTAGE && valueOf.doubleValue() / 1000 > LJIIZILJ) {
            int i = LJIIJJI;
            if (i <= 100) {
                LJIIJJI = i + 5;
            }
            HashMap<String, Object> hashMap = LJ;
            hashMap.put(LJIIJ, Integer.valueOf(LJIIJJI));
            LIZLLL.storeString("progress_map_key", new JSONObject(hashMap).toString());
        }
        LJIL = currentTimeMillis;
        LJIILIIL = 0;
        LJIIIIZZ.clear();
    }

    public static final void LIZIZ(double d, int i) {
        if (C2OF.LJFF()) {
            return;
        }
        LJIJI.onNext(new C2O2(d, i));
    }
}
