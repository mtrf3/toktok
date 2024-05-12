package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3MB, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3MB implements InterfaceC83073Nv {
    public abstract int LIZIZ();

    @Override // X.InterfaceC83073Nv
    public void LIZ(java.util.Map<String, Long> map, java.util.Map<String, Boolean> map2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isMainProcess : ");
        LIZ.append(C36839Ed1.LIZIZ(EF7.LIZIZ()));
        C34B.LJI("IConversationUnreadCountUploadObserver", X1D.LIZIZ(LIZ));
        if (!C36839Ed1.LIZIZ(EF7.LIZIZ())) {
            return;
        }
        String uid = C80763Ey.LIZ(false);
        uid.toString();
        int LIZIZ = LIZIZ();
        o.LJIIIZ(uid, "uid");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upload unread count : ");
        LIZ2.append(LIZIZ);
        C34B.LJI("IConversationUnreadCountUploadObserver", X1D.LIZIZ(LIZ2));
        C82213Kn.LIZ().LJFF(LIZIZ, uid);
    }
}
