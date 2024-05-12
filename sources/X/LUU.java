package X;

import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;

/* loaded from: classes10.dex */
public final class LUU implements LEA {
    public final /* synthetic */ UserAccountImpl LJLIL;

    public LUU(UserAccountImpl userAccountImpl) {
        this.LJLIL = userAccountImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT) != false) goto L8;
     */
    @Override // X.LEA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAccountResult(int r4, boolean r5, int r6, com.ss.android.ugc.aweme.profile.model.User r7) {
        /*
            r3 = this;
            com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r2 = r3.LJLIL
            if (r7 == 0) goto L15
            java.lang.String r1 = r7.getUid()
            if (r1 == 0) goto L15
            r2.getClass()
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L17
        L15:
            java.lang.String r1 = "unlogin"
        L17:
            r2.LIZIZ = r1
            com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r0 = r3.LJLIL
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.ref.WeakReference<X.LUV>> r0 = r0.LIZ
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L25:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r2.next()
            com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r0 = r3.LJLIL
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.ref.WeakReference<X.LUV>> r0 = r0.LIZ
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L47
            java.lang.Object r0 = r0.get()
            X.LUV r0 = (X.LUV) r0
            if (r0 == 0) goto L47
            r0.LIZ()
            goto L25
        L47:
            com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r0 = r3.LJLIL
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.ref.WeakReference<X.LUV>> r0 = r0.LIZ
            r0.remove(r1)
            goto L25
        L4f:
            com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl r0 = r3.LJLIL
            java.lang.String r0 = r0.LIZIZ
            X.C09190Xr.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LUU.onAccountResult(int, boolean, int, com.ss.android.ugc.aweme.profile.model.User):void");
    }
}
