package X;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes29.dex */
public class ZY4 {
    public final ZY2 LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public String LJ;
    public android.net.Uri LJFF;
    public boolean LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public Bundle LJIIZILJ;
    public IntentSender LJIJ;
    public C90089ZXh LJIJI;
    public C1HQ LJIJJLI;
    public final ArrayList<IntentFilter> LJIIIZ = new ArrayList<>();
    public int LJIILLIIL = -1;
    public List<ZY4> LJIJJ = new ArrayList();

    public final List<ZY4> LIZIZ() {
        return Collections.unmodifiableList(this.LJIJJ);
    }

    public final AbstractC90097ZXp LIZJ() {
        ZY2 zy2 = this.LIZ;
        zy2.getClass();
        ZY5.LIZIZ();
        return zy2.LIZ;
    }

    public final boolean LJFF() {
        if (this.LJIJI != null && this.LJI) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaRouter.RouteInfo{ uniqueId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", name=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", description=");
        LIZ.append(this.LJ);
        LIZ.append(", iconUri=");
        LIZ.append(this.LJFF);
        LIZ.append(", enabled=");
        LIZ.append(this.LJI);
        LIZ.append(", connectionState=");
        LIZ.append(this.LJII);
        LIZ.append(", canDisconnect=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", playbackType=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", playbackStream=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", deviceType=");
        LIZ.append(this.LJIIL);
        LIZ.append(", volumeHandling=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", volume=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", volumeMax=");
        LIZ.append(this.LJIILL);
        LIZ.append(", presentationDisplayId=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(", extras=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(", settingsIntent=");
        LIZ.append(this.LJIJ);
        LIZ.append(", providerPackageName=");
        LIZ.append(this.LIZ.LIZJ.LIZ.getPackageName());
        sb.append(X1D.LIZIZ(LIZ));
        if (LJ()) {
            sb.append(", members=[");
            int size = ((ArrayList) this.LJIJJ).size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (ListProtector.get(this.LJIJJ, i) != this) {
                    sb.append(((ZY4) ListProtector.get(this.LJIJJ, i)).LIZJ);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }

    public final boolean LIZLLL() {
        ZY5.LIZIZ();
        ZY4 zy4 = ZY5.LIZJ.LJIILJJIL;
        if (zy4 != null) {
            if (zy4 == this || this.LJIIL == 3) {
                return true;
            }
            if (TextUtils.equals(LIZJ().LJLILLLLZI.LIZ.getPackageName(), "android") && LJIIL("android.media.intent.category.LIVE_AUDIO") && !LJIIL("android.media.intent.category.LIVE_VIDEO")) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final boolean LJ() {
        if (LIZIZ().size() >= 1) {
            return true;
        }
        return false;
    }

    public final boolean LJI() {
        ZY5.LIZIZ();
        if (ZY5.LIZJ.LJFF() == this) {
            return true;
        }
        return false;
    }

    public final void LJIIJJI() {
        ZY5.LIZIZ();
        ZY5.LIZJ.LJIIIIZZ(this, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ZY3 LIZ(ZY4 zy4) {
        C1HQ c1hq = this.LJIJJLI;
        if (c1hq == null || !c1hq.containsKey(zy4.LIZJ)) {
            return null;
        }
        return new ZY3((C90092ZXk) this.LJIJJLI.getOrDefault(zy4.LIZJ, null));
    }

    public final boolean LJII(C90101ZXt c90101ZXt) {
        if (c90101ZXt != null) {
            ZY5.LIZIZ();
            ArrayList<IntentFilter> arrayList = this.LJIIIZ;
            if (arrayList == null) {
                return false;
            }
            c90101ZXt.LIZ();
            int size = c90101ZXt.LIZIZ.size();
            if (size == 0) {
                return false;
            }
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                IntentFilter intentFilter = (IntentFilter) ListProtector.get(arrayList, i);
                if (intentFilter != null) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (intentFilter.hasCategory((String) ListProtector.get(c90101ZXt.LIZIZ, i2))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x024d, code lost:
    
        if (r8.hasNext() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIIIZZ(X.C90089ZXh r12) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ZY4.LJIIIIZZ(X.ZXh):int");
    }

    public final void LJIIIZ(int i) {
        AbstractC90096ZXo abstractC90096ZXo;
        ZY5.LIZIZ();
        C90605ZhB c90605ZhB = ZY5.LIZJ;
        int min = Math.min(this.LJIILL, Math.max(0, i));
        if (this == c90605ZhB.LJIILLIIL && (abstractC90096ZXo = c90605ZhB.LJIIZILJ) != null) {
            abstractC90096ZXo.LJI(min);
        } else {
            if (((HashMap) c90605ZhB.LJIJJ).isEmpty()) {
                return;
            }
            AbstractC90096ZXo abstractC90096ZXo2 = (AbstractC90096ZXo) ((HashMap) c90605ZhB.LJIJJ).get(this.LIZJ);
            if (abstractC90096ZXo2 == null) {
                return;
            }
            abstractC90096ZXo2.LJI(min);
        }
    }

    public final void LJIIJ(int i) {
        AbstractC90096ZXo abstractC90096ZXo;
        ZY5.LIZIZ();
        if (i != 0) {
            C90605ZhB c90605ZhB = ZY5.LIZJ;
            if (this == c90605ZhB.LJIILLIIL && (abstractC90096ZXo = c90605ZhB.LJIIZILJ) != null) {
                abstractC90096ZXo.LJIIIZ(i);
            } else {
                if (((HashMap) c90605ZhB.LJIJJ).isEmpty()) {
                    return;
                }
                AbstractC90096ZXo abstractC90096ZXo2 = (AbstractC90096ZXo) ((HashMap) c90605ZhB.LJIJJ).get(this.LIZJ);
                if (abstractC90096ZXo2 == null) {
                    return;
                }
                abstractC90096ZXo2.LJIIIZ(i);
            }
        }
    }

    public final boolean LJIIL(String str) {
        ZY5.LIZIZ();
        int size = this.LJIIIZ.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) ListProtector.get(this.LJIIIZ, i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIILIIL(Collection<C90092ZXk> collection) {
        ((ArrayList) this.LJIJJ).clear();
        if (this.LJIJJLI == null) {
            this.LJIJJLI = new C1HQ();
        }
        this.LJIJJLI.clear();
        for (C90092ZXk c90092ZXk : collection) {
            ZY4 LIZ = this.LIZ.LIZ(c90092ZXk.LIZ.LIZLLL());
            if (LIZ != null) {
                this.LJIJJLI.put(LIZ.LIZJ, c90092ZXk);
                int i = c90092ZXk.LIZIZ;
                if (i == 2 || i == 3) {
                    ((ArrayList) this.LJIJJ).add(LIZ);
                }
            }
        }
        ZY5.LIZJ.LJIIJ.LIZIZ(259, this);
    }

    public ZY4(ZY2 zy2, String str, String str2) {
        this.LIZ = zy2;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
