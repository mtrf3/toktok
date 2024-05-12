package X;

import Y.ACallableS1S1000000_2;
import Y.AgS107S0200000_2;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6LR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LR {
    public static final C6LR LIZIZ = C6LS.LIZ;
    public C6LT LIZ;

    public final void LIZ(List list, InterfaceC149485to musicDataListener) {
        o.LJIIIZ(musicDataListener, "musicDataListener");
        if (C38891fp.LJJI(list) || list == null) {
            C6LT c6lt = this.LIZ;
            if (c6lt != null) {
                c6lt.LIZ(null, false);
                return;
            }
            return;
        }
        String str = (String) ListProtector.get(list, 0);
        if (TextUtils.isEmpty(str)) {
            C6LT c6lt2 = this.LIZ;
            if (c6lt2 != null) {
                c6lt2.LIZ(null, false);
                return;
            }
            return;
        }
        C10K.LIZJ(new ACallableS1S1000000_2(str, 1)).LJ(new AgS107S0200000_2(this, musicDataListener, 7), C10K.LJIIIIZZ, null);
    }
}
