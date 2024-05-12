package X;

import Y.ARunnableS4S1200000_5;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.performance.degrade.AudioFocusControllerAsyncOptSetting;
import java.util.HashSet;

/* renamed from: X.BPo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28736BPo {
    public static final C28747BPz LJIIIIZZ = new C28747BPz();
    public int LIZ;
    public final InterfaceC28737BPp LIZJ;
    public Context LJI;
    public String LJII;
    public final C28739BPr LIZIZ = new C28739BPr(this);
    public boolean LIZLLL = false;
    public long LJ = -1;
    public boolean LJFF = false;

    public C28736BPo(InterfaceC28738BPq interfaceC28738BPq) {
        this.LIZJ = interfaceC28738BPq;
    }

    public final void LIZIZ(boolean z) {
        this.LIZLLL = z;
        if (z && this.LIZ != 1) {
            this.LJ = System.currentTimeMillis();
            LIZJ(this.LJI, this.LJII, true);
            C73943T0h.LIZ().LIZIZ(new B44(true, true));
        }
    }

    public final void LJ(String str) {
        if (AudioFocusControllerAsyncOptSetting.INSTANCE.getEnable()) {
            LJIIIIZZ.LIZ().execute(new RunnableC28744BPw(this, str));
            return;
        }
        LIZJ(null, str, true);
        C28739BPr c28739BPr = this.LIZIZ;
        HashSet hashSet = (HashSet) C28742BPu.LIZJ;
        hashSet.remove(c28739BPr);
        if (hashSet.isEmpty()) {
            try {
                C28742BPu.LIZ.abandonAudioFocus(C28742BPu.LIZIZ);
            } catch (Exception unused) {
                C0NB.LJIIL("AudioFocusUtil", "returnFocus error");
            }
        }
        try {
            C28742BPu.LIZ.abandonAudioFocus(C28742BPu.LIZIZ);
        } catch (Exception unused2) {
            C0NB.LJIIL("AudioFocusUtil", "returnFocus error");
        }
    }

    public final void LIZ(Context context, String str) {
        int i;
        this.LJI = context;
        this.LJII = str;
        ((HashSet) C28742BPu.LIZJ).add(this.LIZIZ);
        boolean z = false;
        try {
            i = C16880lQ.LLJJJJLIIL(C28742BPu.LIZ, C28742BPu.LIZIZ, 3, 2);
        } catch (Exception unused) {
            C0NB.LJIIL("AudioFocusUtil", "gainFocus error");
            i = 0;
        }
        if (i != 1) {
            if (this.LIZLLL) {
                this.LJ = System.currentTimeMillis();
                z = true;
            } else {
                this.LJ = -1L;
            }
        } else {
            this.LIZ = 1;
            this.LJ = -1L;
        }
        LIZJ(context, str, z);
    }

    public final void LIZLLL(Context context, String str) {
        if (AudioFocusControllerAsyncOptSetting.INSTANCE.getEnable()) {
            LJIIIIZZ.LIZ().execute(new ARunnableS4S1200000_5(this, context, str, 0));
        } else {
            LIZ(context, str);
        }
    }

    public final void LIZJ(Context context, String str, boolean z) {
        InterfaceC28737BPp interfaceC28737BPp = this.LIZJ;
        if (interfaceC28737BPp != null) {
            if (interfaceC28737BPp instanceof InterfaceC28738BPq) {
                ((InterfaceC28738BPq) interfaceC28737BPp).LJJJJ(str, "audio focus", z);
            } else {
                interfaceC28737BPp.LJJJJZ(context, "audio focus", z);
            }
        }
    }
}
