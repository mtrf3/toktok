package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.GdB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41945GdB<T> implements InterfaceC66992k3 {
    public final /* synthetic */ HQ7 LJLIL;

    public C41945GdB(HQ7 hq7) {
        this.LJLIL = hq7;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Boolean> interfaceC65052gv) {
        boolean z;
        String uid = this.LJLIL.getCurrentUserID();
        o.LJIIIZ(uid, "uid");
        if (!C41946GdC.LIZIZ) {
            z = false;
        } else {
            z = ((Keva) C41946GdC.LIZ.getValue()).getBoolean(C173376rF.LJI(uid), true);
            C41946GdC.LIZIZ = z;
        }
        ((C73578SuE) interfaceC65052gv).onSuccess(Boolean.valueOf(z));
    }
}
