package X;

import android.app.Activity;
import android.database.Cursor;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v5.n;

/* renamed from: X.HyY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45818HyY {
    public static final /* synthetic */ int LJFF = 0;
    public final DataCenter LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public Cursor LJ;

    static {
        C16880lQ.LJLLJ(C45818HyY.class);
    }

    public C45818HyY(DataCenter dataCenter) {
        this.LIZ = dataCenter;
    }

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C84934XVa(861, null, null, null));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C84934XVa(0, (MusicModel) it.next(), null, null));
        }
        return arrayList;
    }

    public final C10K<List<MusicModel>> LIZIZ(WeakReference<Activity> weakReference) {
        n nVar = new n();
        C36922EeM.LIZLLL(3, "Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        if (weakReference.get() != null) {
            try {
                C38995FSd.LIZLLL().execute(new RunnableC45816HyW(this, weakReference, arrayList, nVar, 1));
            } catch (Exception e) {
                C36922EeM.LIZLLL(3, "Local Sound", "Scan Music throw a Exception");
                C36922EeM.LJFF(e);
            }
        }
        return nVar.LIZ;
    }
}
