package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xt1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86243Xt1 implements IChooseMediaResultCallback {
    public final /* synthetic */ InterfaceC86244Xt2 LIZ;

    public C86243Xt1(C86261XtJ c86261XtJ) {
        this.LIZ = c86261XtJ;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback
    public final void onFailure(int i, String msg) {
        o.LJIIJ(msg, "msg");
        this.LIZ.onFailure(i, msg);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback
    public final void onSuccess(C86242Xt0 result, String msg) {
        o.LJIIJ(result, "result");
        o.LJIIJ(msg, "msg");
        ArrayList arrayList = new ArrayList();
        List<C86241Xsz> list = result.LIZ;
        if (list != null) {
            for (C86241Xsz c86241Xsz : list) {
                String str = c86241Xsz.LIZJ;
                C86260XtI c86260XtI = new C86260XtI(c86241Xsz.LIZLLL, str, c86241Xsz.LJFF, c86241Xsz.LJ);
                String str2 = c86241Xsz.LIZ;
                if (str2 != null) {
                    c86260XtI.LIZ = str2;
                }
                String str3 = c86241Xsz.LIZIZ;
                if (str3 != null) {
                    c86260XtI.LIZIZ = str3;
                }
                arrayList.add(c86260XtI);
            }
        }
        InterfaceC86244Xt2 interfaceC86244Xt2 = this.LIZ;
        C86262XtK c86262XtK = new C86262XtK();
        c86262XtK.LIZ = arrayList;
        interfaceC86244Xt2.LIZ(c86262XtK, "");
    }
}
