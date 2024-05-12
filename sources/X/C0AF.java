package X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.Arrays;

/* renamed from: X.0AF, reason: invalid class name */
/* loaded from: classes.dex */
public class C0AF {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int[] LJFF;
    public final /* synthetic */ StaggeredGridLayoutManager LJI;

    public final void LIZ() {
        this.LIZ = -1;
        this.LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        int[] iArr = this.LJFF;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public C0AF(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.LJI = staggeredGridLayoutManager;
        LIZ();
    }
}
