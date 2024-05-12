package X;

import android.content.MutableContextWrapper;
import android.os.MessageQueue;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;

/* renamed from: X.NrV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60669NrV implements MessageQueue.IdleHandler {
    public final /* synthetic */ C60674Nra LJLIL;
    public final /* synthetic */ C60668NrU LJLILLLLZI;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        WebKitView LIZ;
        synchronized (this.LJLILLLLZI.LIZ) {
            int size = ((ArrayList) this.LJLIL.LIZ).size();
            C60674Nra c60674Nra = this.LJLIL;
            if (size < c60674Nra.LIZJ && (LIZ = c60674Nra.LIZIZ.LIZ(new MutableContextWrapper(this.LJLILLLLZI.LIZIZ), this.LJLIL.LJ)) != null) {
                ((ArrayList) this.LJLIL.LIZ).add(new SoftReference(LIZ));
                LIZ.setTag(R.id.e8q, Boolean.TRUE);
            }
        }
        return false;
    }

    public C60669NrV(C60668NrU c60668NrU, C60674Nra c60674Nra) {
        this.LJLILLLLZI = c60668NrU;
        this.LJLIL = c60674Nra;
    }
}
