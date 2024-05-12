package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeiFormatErrIntervalSetting;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Tje, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75470Tje {
    public long LIZ;
    public boolean LIZIZ;
    public final long LIZJ = LinkMicSeiFormatErrIntervalSetting.INSTANCE.getValue();
    public final java.util.Map<String, Integer> LIZLLL = new ConcurrentHashMap();
    public InterfaceC75478Tjm LJ;

    public final boolean LIZIZ() {
        InterfaceC75478Tjm interfaceC75478Tjm = this.LJ;
        if (interfaceC75478Tjm == null || interfaceC75478Tjm.LIZLLL()) {
            return false;
        }
        return true;
    }

    public final int LIZ(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LIZLLL).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
