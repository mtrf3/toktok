package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public class WML implements InterfaceC82169WMr {
    public final WM7 LIZ;
    public final boolean LIZIZ;
    public final /* synthetic */ WMI LIZJ;

    @Override // X.InterfaceC82169WMr
    public final void execute() {
        Drawable drawable;
        Record record;
        WME wme;
        this.LIZJ.LIZJ();
        if (this.LIZJ.LIZIZ()) {
            WMI wmi = this.LIZJ;
            WM7 wm7 = this.LIZ;
            Iterator it = ((ArrayList) wmi.LIZIZ.LIZ).iterator();
            while (true) {
                drawable = null;
                if (it.hasNext()) {
                    record = (Record) it.next();
                    if (record.LJLIL == wm7) {
                        break;
                    }
                } else {
                    record = null;
                    break;
                }
            }
            boolean z = record.LJLILLLLZI;
            boolean z2 = this.LIZIZ;
            if (z == z2) {
                return;
            }
            record.LJLILLLLZI = z2;
            if (record.LJLJJLL) {
                WM7 wm72 = this.LIZ;
                View view = wm72.mView;
                if (!z2) {
                    int i = this.LIZJ.LIZ.LJLJI.LJ;
                    if (i > 0) {
                        drawable = wm72.requireSceneContext().getResources().getDrawable(i);
                    } else {
                        drawable = C78932UyO.LIZLLL(wm72.requireSceneContext());
                    }
                }
                view.setBackgroundDrawable(drawable);
            }
            List<Record> LIZIZ = this.LIZJ.LIZIZ.LIZIZ();
            ArrayList arrayList = (ArrayList) LIZIZ;
            if (arrayList.size() == 1) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            boolean z3 = false;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Record record2 = (Record) ListProtector.get(LIZIZ, size);
                if (!z3) {
                    if (record2 == record) {
                        z3 = true;
                    }
                } else {
                    arrayList2.add(record2);
                    if (!record2.LJLILLLLZI) {
                        break;
                    }
                }
            }
            if (arrayList2.size() > 1) {
                Collections.reverse(arrayList2);
            }
            WME wme2 = record.LJLIL.mState;
            if (this.LIZIZ) {
                wme = WME.STARTED;
            } else {
                wme = WME.ACTIVITY_CREATED;
            }
            if (wme2.value > wme.value) {
                wme2 = wme;
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                WMI.LJI(this.LIZJ.LIZ, ((Record) ListProtector.get(arrayList2, i2)).LJLIL, wme2, null, false, null);
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Can't change translucent, current NavigationScene state ");
        LIZ.append(this.LIZJ.LIZ.mState.name);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public WML(WMI wmi, WM7 wm7, boolean z) {
        this.LIZJ = wmi;
        this.LIZ = wm7;
        this.LIZIZ = z;
    }
}
