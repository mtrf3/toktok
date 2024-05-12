package X;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.List;

/* renamed from: X.Pc9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64813Pc9 {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final WeakHandler LJFF;

    static {
        C16880lQ.LJLLJ(C64813Pc9.class);
    }

    public final void LIZ(Message message) {
        Bundle bundle = new Bundle();
        bundle.putString("dnsrecord_host", this.LIZ);
        message.setData(bundle);
    }

    public C64813Pc9(String str, long j, List<String> list, List<String> list2, int i) {
        this.LIZ = str;
        this.LJ = j;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = i;
        C64811Pc7.LJ().getClass();
        this.LJFF = new WeakHandler(C64811Pc7.LL.getLooper(), C64811Pc7.LJ());
    }
}
