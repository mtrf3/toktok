package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.lang.ref.WeakReference;

/* renamed from: X.Bgf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29421Bgf implements InterfaceC38012Evw {
    public final WeakReference<Context> LJLIL;
    public final InterfaceC29424Bgi LJLILLLLZI;

    public final ActivityC45651qj LIZ() {
        ActivityC45651qj LIZ = C29306Beo.LIZ(this.LJLIL.get());
        if (LIZ == null) {
            return ((IHostAction) CN1.LIZ(IHostAction.class)).getTopFragmentActivity();
        }
        return LIZ;
    }

    public C29421Bgf(WeakReference<Context> weakReference, InterfaceC29424Bgi interfaceC29424Bgi) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = interfaceC29424Bgi;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019e, code lost:
    
        if (r7 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    @Override // X.InterfaceC38012Evw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void call(X.C38048EwW r20, org.json.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 1974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29421Bgf.call(X.EwW, org.json.JSONObject):void");
    }
}
