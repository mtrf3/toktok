package Y;

import X.C46982IcE;
import X.C47075Idj;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import java.util.List;

/* loaded from: classes9.dex */
public class ARunnableS1S1220000_8 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;

    public final void LIZ$0() {
        try {
            ((EnginePreloader) this.l2).LJIIIIZZ.post(new ARunnableS1S1220000_8(this, ((EnginePreloader) this.l2).LJIIZILJ((List) this.l1, this.z3, this.s0), this.z3, this.z4, this.s0, 0));
        } catch (Exception e) {
            C46982IcE.LJI().ensureNotReachHere(e, "addMedias fail.");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS1S1220000_8 aRunnableS1S1220000_8) {
        ARunnableS1S1220000_8 aRunnableS1S1220000_82 = (ARunnableS1S1220000_8) aRunnableS1S1220000_8.l1;
        List<C47075Idj> list = (List) aRunnableS1S1220000_8.l2;
        boolean z = aRunnableS1S1220000_8.z3;
        boolean z2 = aRunnableS1S1220000_8.z4;
        String str = aRunnableS1S1220000_8.s0;
        aRunnableS1S1220000_82.getClass();
        try {
            ((EnginePreloader) aRunnableS1S1220000_82.l2).LIZ(list, z, z2, str);
        } catch (Exception e) {
            C46982IcE.LJI().ensureNotReachHere(e, "addMedias fail.");
        }
    }

    public static final void run$1(ARunnableS1S1220000_8 aRunnableS1S1220000_8) {
        boolean LIZ;
        try {
            aRunnableS1S1220000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1220000_8(Object obj, Object obj2, boolean z, boolean z2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.z3 = z;
        this.z4 = z2;
        this.s0 = str;
    }
}
