package X;

import android.content.Context;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2A6, reason: invalid class name */
/* loaded from: classes.dex */
public class C2A6 extends C47101t4<C2A6> {
    public final List<C0KI> LIZJ;
    public C30111Gd LIZLLL;

    public final LiveActionSheetDialog LIZ() {
        return new LiveActionSheetDialog(this.LIZ, this);
    }

    public C2A6(Context context) {
        new C40971jB<C47101t4<T>>(context) { // from class: X.1t4
        };
        this.LIZJ = new ArrayList();
    }

    public final void LIZIZ(List list) {
        C0KH c0kh = new C0KH();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c0kh.LIZ((C0KG) it.next());
            }
        }
        C0KI c0ki = new C0KI(c0kh);
        List<C0KG> list2 = c0ki.LIZIZ;
        if (list2 != null && !list2.isEmpty()) {
            ((ArrayList) this.LIZJ).add(c0ki);
        }
    }
}
