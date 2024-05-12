package Y;

import X.AbstractC66014PvW;
import X.BZK;
import X.C65926Pu6;
import X.C78939UyV;
import X.InterfaceC65941PuL;
import X.ORZ;
import X.PFH;
import com.ss.android.agilelogger.ALog;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import java.util.ArrayList;
import java.util.Iterator;
import ujb.o;

/* loaded from: classes12.dex */
public class ARunnableS1S2101000_11 implements Runnable {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Iterator<InterfaceC65941PuL> it = C65926Pu6.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(this.i3, this.s0, this.s1, (Throwable) this.l2);
        }
        String str = this.s1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (str != null && !o.LJJJJJL(str)) {
            int i2 = 0;
            while (i2 < str.length()) {
                int length = str.length();
                int i3 = i2 + 3500;
                if (length > i3) {
                    length = i3;
                }
                String substring = str.substring(i2, length);
                kotlin.jvm.internal.o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                i2 = i3;
            }
        }
        ORZ.LLFII(arrayList);
        int i4 = this.i3;
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    if (i4 != 5) {
                        if (i4 != 6 || arrayList.size() <= 1) {
                            return;
                        }
                        while (i < arrayList.size() - 1) {
                            i++;
                        }
                        return;
                    }
                    if (arrayList.size() <= 1) {
                        return;
                    }
                    while (i < arrayList.size() - 1) {
                        i++;
                    }
                    return;
                }
                if (arrayList.size() <= 1) {
                    return;
                }
                while (i < arrayList.size() - 1) {
                    i++;
                }
                return;
            }
            if (arrayList.size() <= 1) {
                return;
            }
            while (i < arrayList.size() - 1) {
                i++;
            }
            return;
        }
        if (arrayList.size() <= 1) {
            return;
        }
        while (i < arrayList.size() - 1) {
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b A[Catch: JSONException -> 0x011b, TryCatch #4 {JSONException -> 0x011b, blocks: (B:59:0x00e4, B:61:0x010b, B:62:0x0110, B:64:0x0116), top: B:58:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116 A[Catch: JSONException -> 0x011b, TRY_LEAVE, TryCatch #4 {JSONException -> 0x011b, blocks: (B:59:0x00e4, B:61:0x010b, B:62:0x0110, B:64:0x0116), top: B:58:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S2101000_11.LIZ$1():void");
    }

    public static final void run$0(ARunnableS1S2101000_11 aRunnableS1S2101000_11) {
        boolean LIZ;
        try {
            aRunnableS1S2101000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S2101000_11 aRunnableS1S2101000_11) {
        boolean LIZ;
        try {
            try {
                ((CronetWebsocketConnection) aRunnableS1S2101000_11.l2).LIZIZ.LIZ(aRunnableS1S2101000_11.i3, aRunnableS1S2101000_11.s0, aRunnableS1S2101000_11.s1);
            } catch (Exception e) {
                C78939UyV.LJII("Exception in callback: ", e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S2101000_11 aRunnableS1S2101000_11) {
        BZK bzk = (BZK) aRunnableS1S2101000_11.l2;
        int i = aRunnableS1S2101000_11.i3;
        String str = aRunnableS1S2101000_11.s0;
        String str2 = aRunnableS1S2101000_11.s1;
        bzk.getClass();
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6 || AbstractC66014PvW.LIZ == null) {
                            return;
                        }
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
                        return;
                    }
                    if (AbstractC66014PvW.LIZ == null) {
                        return;
                    }
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(str, str2);
                    return;
                }
                if (AbstractC66014PvW.LIZ == null) {
                    return;
                }
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
                return;
            }
            AbstractC66014PvW.LIZ(str, str2);
            return;
        }
        if (AbstractC66014PvW.LIZ == null) {
            return;
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(str, str2);
    }

    public static final void run$3(ARunnableS1S2101000_11 aRunnableS1S2101000_11) {
        boolean LIZ;
        try {
            aRunnableS1S2101000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S2101000_11(PFH pfh, int i, String str, int i2) {
        this.$t = i2;
        this.l2 = pfh;
        this.i3 = i;
        this.s0 = "";
        this.s1 = str;
    }

    public ARunnableS1S2101000_11(int i, String str, String str2, Object obj, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = i;
        this.l2 = obj;
    }
}
