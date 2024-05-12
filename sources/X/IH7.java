package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IH7 implements IHC {
    public final String LIZ;
    public final ArrayList<IHA> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ;

    public IH7() {
        this(null, 3);
    }

    @Override // X.IHC
    public final void LIZIZ() {
    }

    @Override // X.IHC
    public final void LIZJ() {
    }

    public final void LIZLLL() {
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = "";
        Iterator<IHA> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        this.LIZIZ.clear();
    }

    public final void LJII() {
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = "";
        Iterator<IHA> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            IHA next = it.next();
            AbstractC48384Iyq abstractC48384Iyq = next.LIZLLL;
            if (abstractC48384Iyq != null) {
                abstractC48384Iyq.close();
            }
            String str = null;
            next.LIZLLL = null;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop preload ");
            Aweme aweme = next.LIZ.get();
            if (aweme != null) {
                str = aweme.getAid();
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
        }
    }

    @Override // X.IHC
    public final void LIZ() {
        int i = this.LIZLLL;
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        this.LIZLLL = i2;
        if (i2 < this.LIZIZ.size()) {
            int i3 = this.LIZLLL;
            if ((i3 - this.LIZJ) + 1 <= IH1.LJFF.preloadCoverCnt) {
                ((IHA) ListProtector.get(this.LIZIZ, i3)).LIZIZ();
                return;
            }
        }
        LJFF();
    }

    public final void LJFF() {
        if (this.LIZIZ.size() <= 0) {
            return;
        }
        for (int size = this.LIZIZ.size() - 1; -1 < size; size--) {
            if (((IHA) ListProtector.get(this.LIZIZ, size)).LIZ.get() == null) {
                ListProtector.remove(this.LIZIZ, size);
            }
        }
    }

    @Override // X.IHC
    public final void onFailure() {
        LJFF();
    }

    public final int LJ(String sourceId) {
        String str;
        o.LJIIIZ(sourceId, "sourceId");
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            Aweme aweme = ((IHA) ListProtector.get(this.LIZIZ, i)).LIZ.get();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (TextUtils.equals(sourceId, str)) {
                return i;
            }
        }
        return -1;
    }

    public final void LJI(String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        int LJ = LJ(sourceId);
        if (LJ < 0 || o.LJ(this.LJ, sourceId)) {
            return;
        }
        this.LJ = sourceId;
        int i = LJ;
        do {
            ((IHA) ListProtector.get(this.LIZIZ, i)).LIZ();
            if (i < LJ) {
                ListProtector.remove(this.LIZIZ, i);
            }
            i--;
        } while (-1 < i);
        int i2 = LJ + 1;
        this.LIZJ = i2;
        this.LIZLLL = i2;
        if (i2 < this.LIZIZ.size()) {
            ((IHA) ListProtector.get(this.LIZIZ, this.LIZLLL)).LIZIZ();
        }
    }

    public IH7(String scene, int i) {
        ArrayList<IHA> preloadTasks;
        scene = (i & 1) != 0 ? "" : scene;
        if ((i & 2) != 0) {
            preloadTasks = new ArrayList<>();
        } else {
            preloadTasks = null;
        }
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(preloadTasks, "preloadTasks");
        this.LIZ = scene;
        this.LIZIZ = preloadTasks;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = "";
    }
}
