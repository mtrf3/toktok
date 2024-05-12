package X;

import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import Y.AfS61S0100000_9;
import Y.IDhS102S0100000_9;
import android.os.Handler;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Mdi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57266Mdi {
    public final ConcurrentHashMap<String, User> LIZ = new ConcurrentHashMap<>();
    public final AObserverS77S0100000_9 LIZIZ = new AObserverS77S0100000_9(this, 87);

    public C57266Mdi() {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS45S0100000_9(this, 179));
        UC0.LJ(C57267Mdj.LIZIZ.LJLILLLLZI).LIZJ(true, new InterfaceC68914R2w[0]).LJJJ(T16.LIZ).LJJIJL(new IDhS102S0100000_9(this, 15)).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0100000_9(this, 53));
    }
}
