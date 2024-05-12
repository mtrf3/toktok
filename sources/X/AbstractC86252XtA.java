package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.XtA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86252XtA implements InterfaceC27436Apk, InterfaceC86221Xsf {
    public final WeakReference<Context> LJLIL;
    public InterfaceC86201XsL LJLJI;
    public short[] LJLJJI;
    public boolean LJLJJL = true;
    public final C86200XsK LJLILLLLZI = new C86200XsK();

    public AbstractC86252XtA(WeakReference<Context> weakReference) {
        this.LJLIL = weakReference;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00e5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(org.json.JSONObject r24) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86252XtA.LIZLLL(org.json.JSONObject):void");
    }

    @Override // X.InterfaceC27436Apk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        InterfaceC86201XsL interfaceC86201XsL;
        if ((i != 1 && i != 600 && i != 700 && i != 800 && i != 900 && i != 10003) || (interfaceC86201XsL = this.LJLJI) == null) {
            LIZ(0, "uploadFailed");
            return true;
        }
        return interfaceC86201XsL.onActivityResult(i, i2, intent);
    }
}
