package X;

import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EKB implements EIE {
    public final /* synthetic */ PumbaaTask LIZ;

    public EKB(PumbaaTask pumbaaTask) {
        this.LIZ = pumbaaTask;
    }

    @Override // X.EIE
    public final void LIZ(java.util.Map<String, String> map) {
        String str;
        int i;
        String str2 = null;
        if (map != null) {
            str = map.get("url");
        } else {
            str = null;
        }
        if (str != null) {
            i = s.LJJLIIIJL(str, "?", 0, false, 6);
        } else {
            i = -1;
        }
        PumbaaTask pumbaaTask = this.LIZ;
        if (i > 0) {
            if (str != null) {
                str = str.substring(0, i);
                o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = null;
            }
        }
        pumbaaTask.LJLIL = str;
        PumbaaTask pumbaaTask2 = this.LIZ;
        if (map != null) {
            str2 = map.get("x-tt-logid");
        }
        pumbaaTask2.LJLILLLLZI = str2;
    }
}
