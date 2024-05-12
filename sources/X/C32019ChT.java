package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveVboostDurationForStartBroadcastSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.VBoostEnableSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.VBoostGoLiveSetting;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ChT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32019ChT {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (!VBoostEnableSetting.INSTANCE.isEnable()) {
            EnumC32018ChS[] values = EnumC32018ChS.values();
            ArrayList arrayList = new ArrayList();
            for (EnumC32018ChS enumC32018ChS : values) {
                if (VBoostGoLiveSetting.INSTANCE.isEnable(enumC32018ChS)) {
                    arrayList.add(enumC32018ChS);
                }
            }
            if (arrayList.size() <= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r4 = r2.getKey();
        r4.LJLJJL = true;
        r3.LIZIZ.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        r1 = (java.util.TreeSet) ((java.util.HashMap) r3.LIZ).get(r4.LJLIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        if (r1.contains(r4) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        r1.remove(r4);
        r0 = r4.LJLLILLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        r0.LJLILLLLZI.cancel(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
    
        if (((java.util.HashMap) r3.LIZJ).get(r4.LJLIL) == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
    
        X.C0YN.LIZ(3);
        r0 = ((X.C0X3) ((java.util.HashMap) r3.LIZJ).get(r4.LJLIL)).LJLLILLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ff, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        r0.LJLILLLLZI.cancel(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        r3.LIZLLL.submit(new X.C0X4(r4));
        r3.LJ.remove(((java.util.HashMap) r3.LIZJ).get(r4.LJLIL));
        ((java.util.HashMap) r3.LIZJ).remove(r4.LJLIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        r3.LIZIZ.unlock();
        r1 = r4.LJLJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        if (r1 == X.C0X5.USE_PROVIDERS) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        if (r1 != X.C0X5.USER_CANCEL) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        r3.LJ.remove(r2.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013b, code lost:
    
        if (r4.LJLJLJ != X.C0X1.DIRECT) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
    
        X.C86793Y4n.LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        r3.LIZLLL.submit(new X.C0X4(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0160, code lost:
    
        r3.LIZIZ.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x002d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32019ChT.LIZJ():void");
    }

    public static void LIZIZ(EnumC32020ChU scene) {
        int i;
        o.LJIIIZ(scene, "scene");
        if (!VBoostEnableSetting.INSTANCE.isEnable()) {
            return;
        }
        if (LIZ()) {
            C01H.LIZ(C15380j0.LIZLLL());
        }
        if (C32021ChV.LIZ[scene.ordinal()] == 1) {
            i = LiveVboostDurationForStartBroadcastSetting.INSTANCE.getValue();
        } else {
            i = 3000;
        }
        C01H.LIZIZ(scene.getTargetScene(), i);
    }
}
