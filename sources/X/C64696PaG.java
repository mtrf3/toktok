package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: X.PaG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64696PaG {
    public final List<String> LIZ;
    public final List<String> LIZIZ;
    public List<String> LIZJ;
    public List<String> LIZLLL;
    public List<Pattern> LJ;
    public java.util.Set<Integer> LJFF;
    public volatile long LJIIJ = SystemClock.uptimeMillis();
    public volatile int LJIIIZ = 0;
    public int LJII = Integer.MAX_VALUE;
    public int LJI = 0;
    public volatile boolean LJIIJJI = false;
    public final String LJIIIIZZ = UUID.randomUUID().toString();
    public boolean LJIILIIL = false;
    public int LJIIL = LivePlayerResourceReleaseSetting.ENABLE;
    public boolean LJIILJJIL = true;
    public String LJIILL = null;

    public C64696PaG(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
