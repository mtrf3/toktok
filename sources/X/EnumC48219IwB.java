package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.IwB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC48219IwB {
    public static final EnumC48219IwB INS;
    public static final /* synthetic */ EnumC48219IwB[] LJLJJLL;
    public boolean LJLIL = true;
    public final java.util.Map<C79985VaH, C48222IwE> LJLILLLLZI = new HashMap();
    public final java.util.Map<C79985VaH, C48222IwE> LJLJI = new HashMap();
    public final Queue<C79985VaH> LJLJJI = new LinkedList();
    public final Queue<C79985VaH> LJLJJL = new LinkedList();

    public synchronized List<C48222IwE> getTraceInfoList() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        while (!this.LJLJJI.isEmpty()) {
            arrayList.add(((HashMap) this.LJLILLLLZI).remove(((LinkedList) this.LJLJJI).poll()));
        }
        return arrayList;
    }

    static {
        EnumC48219IwB enumC48219IwB = new EnumC48219IwB();
        INS = enumC48219IwB;
        LJLJJLL = new EnumC48219IwB[]{enumC48219IwB};
    }

    public static EnumC48219IwB[] values() {
        return (EnumC48219IwB[]) LJLJJLL.clone();
    }

    public boolean isEnable() {
        return this.LJLIL;
    }

    public static EnumC48219IwB valueOf(String str) {
        return (EnumC48219IwB) V0N.LJJJ(EnumC48219IwB.class, str);
    }

    public final C48222IwE LIZLLL(C79985VaH c79985VaH) {
        if (((HashMap) this.LJLILLLLZI).containsKey(c79985VaH)) {
            return (C48222IwE) ((HashMap) this.LJLILLLLZI).get(c79985VaH);
        }
        if (((HashMap) this.LJLJI).containsKey(c79985VaH)) {
            return (C48222IwE) ((HashMap) this.LJLJI).get(c79985VaH);
        }
        return null;
    }

    public void setEnable(boolean z) {
        this.LJLIL = z;
    }

    public final boolean LJ(C79985VaH c79985VaH, YSM ysm) {
        Object poll;
        if (c79985VaH == null) {
            return false;
        }
        if (!this.LJLIL) {
            ((HashMap) this.LJLILLLLZI).clear();
            ((LinkedList) this.LJLJJI).clear();
            ((LinkedList) this.LJLJJL).clear();
            ((HashMap) this.LJLJI).clear();
            return false;
        }
        if (!((LinkedList) this.LJLJJI).contains(c79985VaH)) {
            if (!((LinkedList) this.LJLJJL).contains(c79985VaH)) {
                if (((LinkedList) this.LJLJJL).size() >= 5) {
                    ((HashMap) this.LJLJI).remove(((LinkedList) this.LJLJJL).poll());
                }
                ((LinkedList) this.LJLJJL).offer(c79985VaH);
                ((HashMap) this.LJLJI).put(c79985VaH, new C48222IwE());
            }
            if (ysm == YSM.LAYER_HOST_PLAY && (poll = ((LinkedList) this.LJLJJL).poll()) != null) {
                if (((LinkedList) this.LJLJJI).size() >= 3) {
                    ((HashMap) this.LJLILLLLZI).remove(((LinkedList) this.LJLJJI).poll());
                }
                ((LinkedList) this.LJLJJI).offer(poll);
                ((HashMap) this.LJLILLLLZI).put(poll, ((HashMap) this.LJLJI).remove(poll));
            }
        }
        if (!((HashMap) this.LJLILLLLZI).containsKey(c79985VaH) && !((HashMap) this.LJLJI).containsKey(c79985VaH)) {
            return false;
        }
        return true;
    }

    public synchronized void updateVolume(C79985VaH c79985VaH, float f, float f2) {
        if (!LJ(c79985VaH, null)) {
            return;
        }
        LIZLLL(c79985VaH);
    }

    public static void LIZJ(C48222IwE c48222IwE, C79985VaH c79985VaH, YSM ysm, InterfaceC48221IwD interfaceC48221IwD) {
        if (c79985VaH == null) {
            return;
        }
        int i = C48220IwC.LIZ[ysm.ordinal()];
        if (i != 1) {
            if (i != 2 || interfaceC48221IwD == null) {
                return;
            }
            C47160If6 currentVideoInfo = interfaceC48221IwD.getCurrentVideoInfo();
            if (currentVideoInfo != null) {
                currentVideoInfo.LIZIZ(7);
                currentVideoInfo.LIZIZ(8);
                currentVideoInfo.LIZIZ(6);
            }
            interfaceC48221IwD.getResolution();
            return;
        }
        if (c79985VaH.LIZLLL != null) {
            new Pair("video_model", c79985VaH.LIZ);
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            new Pair("local_url", null);
        } else if (!TextUtils.isEmpty(c79985VaH.LJ)) {
            new Pair("video_url", c79985VaH.LJ);
        } else {
            new Pair("vid", c79985VaH.LIZ);
        }
    }

    public synchronized void trace(C79985VaH c79985VaH, YSM ysm, String str, Object obj, InterfaceC48221IwD interfaceC48221IwD) {
        if (!LJ(c79985VaH, ysm)) {
            return;
        }
        C48222IwE LIZLLL = LIZLLL(c79985VaH);
        if (LIZLLL != null) {
            List list = LIZLLL.LIZ;
            LIZJ(LIZLLL, c79985VaH, ysm, interfaceC48221IwD);
            if (list == null) {
                list = new ArrayList();
                LIZLLL.LIZ = list;
            }
            list.add(new F75(ysm, str, obj));
        }
    }

    public synchronized void updateTextureSize(C79985VaH c79985VaH, int i, int i2, int i3, int i4, float f, Context context) {
        YSM ysm = YSM.TEXTURE_SIZE;
        if (!LJ(c79985VaH, ysm)) {
            return;
        }
        C48222IwE LIZLLL = LIZLLL(c79985VaH);
        if (LIZLLL != null) {
            List list = LIZLLL.LIZ;
            if (list == null) {
                list = new ArrayList();
                LIZLLL.LIZ = list;
            }
            int LIZLLL2 = C48671J8h.LIZLLL(context);
            int LIZJ = C48671J8h.LIZJ(context);
            int LIZIZ = C48671J8h.LIZIZ(context);
            if (i <= i3 && i2 <= i4 && LIZIZ != 1 && LIZIZ != 9 && LIZIZ != 0 && LIZIZ != 8) {
                Math.max(i3, i4);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("texture:[");
            LIZ.append(i);
            LIZ.append(",");
            LIZ.append(i2);
            LIZ.append("];parent:[");
            LIZ.append(i3);
            LIZ.append(",");
            LIZ.append(i4);
            LIZ.append("];screen:[");
            LIZ.append(LIZLLL2);
            LIZ.append(",");
            LIZ.append(LIZJ);
            LIZ.append("];scale:");
            LIZ.append(f);
            list.add(new F75(ysm, X1D.LIZIZ(LIZ), null));
        }
    }
}
