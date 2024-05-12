package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.1nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43831nn extends AbstractC36651cD {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ AbstractC269213w LJLJI;

    @Override // X.C10Q
    public final void LIZ() {
        C38531fF c38531fF;
        List<String> list;
        C43861nq LJJJI = C43861nq.LJJJI();
        long uptimeMillis = SystemClock.uptimeMillis() - this.LJLIL;
        LJJJI.getClass();
        try {
            new JSONObject().put("cost", uptimeMillis);
        } catch (Throwable unused) {
        }
        AbstractC38911fr.LJIJI();
        C22750ut c22750ut = C35191Zr.LIZIZ().LIZLLL;
        AbstractC269213w abstractC269213w = this.LJLJI;
        c22750ut.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("track_call_start:");
        LIZ.append(abstractC269213w.toString());
        X1D.LIZIZ(LIZ);
        String str = abstractC269213w.LIZIZ;
        AbstractC004800e abstractC004800e = (AbstractC004800e) ((ConcurrentHashMap) c22750ut.LIZ).get(str);
        if (abstractC004800e == null) {
            C1JX.LJIIIIZZ("track_tracker_invalid:no tracker available for ", str);
            return;
        }
        C30371Hd c30371Hd = (C30371Hd) abstractC004800e;
        if (!(abstractC269213w instanceof C38531fF)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("incompatible event type: ");
            LIZ2.append(abstractC269213w.getClass().getName());
            X1D.LIZIZ(LIZ2);
            return;
        }
        if (!c30371Hd.LIZIZ.LIZ || (list = (c38531fF = (C38531fF) abstractC269213w).LJFF) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (TextUtils.isEmpty(str2) || (!str2.startsWith("http://") && !str2.startsWith("https://"))) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("not a valid http url:");
                LIZ3.append(str2);
                X1D.LIZIZ(LIZ3);
                arrayList.add(str2);
            }
        }
        list.removeAll(arrayList);
        if (list.isEmpty()) {
            return;
        }
        c38531fF.LJFF = list;
        C41201jY.LJJJI().getClass();
        C0E2.LIZLLL.LIZ();
        AbstractC38911fr.LJIJI();
        if (!C0E2.LIZLLL.LIZIZ()) {
            if (!c30371Hd.LIZIZ.LIZIZ) {
                return;
            }
            c38531fF.LJIIIZ++;
            c30371Hd.LIZJ.LJI(c38531fF);
            return;
        }
        c30371Hd.LJFF(c38531fF, false);
    }

    public C43831nn(long j, View view, AbstractC269213w abstractC269213w) {
        this.LJLIL = j;
        this.LJLILLLLZI = view;
        this.LJLJI = abstractC269213w;
    }
}
