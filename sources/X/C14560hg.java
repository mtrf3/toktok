package X;

import Y.IDCListenerS250S0100000;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14560hg {
    public int LIZ;
    public B4Q LIZIZ;
    public InterfaceC92693kP LIZJ;
    public View LIZLLL;
    public View LJ;
    public List<Rect> LJFF;
    public float LJI;
    public final long LJII;
    public final IDCListenerS250S0100000 LJIIIIZZ;

    public C14560hg(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJFF = new ArrayList();
        this.LJII = 800L;
        this.LJIIIIZZ = new IDCListenerS250S0100000(this, 3);
    }

    public final List<Rect> LIZ(List<Rect> list) {
        ArrayList arrayList = new ArrayList();
        Rect rect = new Rect();
        View view = this.LJ;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        B4Q b4q = this.LIZIZ;
        if (b4q != null && b4q.LIZIZ) {
            int i = rect.top;
            int i2 = this.LIZ;
            rect.top = i - i2;
            rect.bottom -= i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(new Rect((Rect) ListProtector.get(list, i3)));
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Rect rect2 = (Rect) it.next();
            if (rect2.intersect(rect)) {
                int i4 = rect2.top - rect.top;
                int width = rect2.width();
                int i5 = rect2.left - rect.left;
                arrayList.add(new Rect(i5, i4, width + i5, rect2.height() + i4));
            }
        }
        return arrayList;
    }
}
