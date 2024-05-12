package X;

import android.content.MutableContextWrapper;
import android.os.MessageQueue;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;

/* renamed from: X.No8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60460No8 implements MessageQueue.IdleHandler {
    public final /* synthetic */ C60461No9 LJLIL;
    public final /* synthetic */ C60459No7 LJLILLLLZI;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        synchronized (this.LJLILLLLZI.LIZ) {
            int size = ((ArrayList) this.LJLIL.LIZ).size();
            C60461No9 c60461No9 = this.LJLIL;
            if (size < c60461No9.LIZJ) {
                C59614NaU create = c60461No9.LIZIZ.create(new MutableContextWrapper(this.LJLILLLLZI.LIZIZ));
                ((ArrayList) this.LJLIL.LIZ).add(new SoftReference(create));
                if (create != null) {
                    create.setTag(R.id.ni6, Boolean.TRUE);
                }
            }
        }
        return false;
    }

    public C60460No8(C60459No7 c60459No7, C60461No9 c60461No9) {
        this.LJLILLLLZI = c60459No7;
        this.LJLIL = c60461No9;
    }
}
