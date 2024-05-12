package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.a1;
import java.util.HashSet;

/* loaded from: classes12.dex */
public final class QIO implements Application.ActivityLifecycleCallbacks {
    public int LJLIL;
    public QID LJLILLLLZI;
    public String LJLJI;
    public final QI3 LJLJJL;
    public final HashSet<Integer> LJLJJI = new HashSet<>(8);
    public boolean LJLJJLL = true;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public QIO(QI3 qi3) {
        this.LJLJJL = qi3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.LJLJJI.remove(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        QIX qix = this.LJLJJL.LJJIZ;
        Object[] objArr = new Object[1];
        if (activity != null) {
            str = activity.getClass().getName();
        } else {
            str = "";
        }
        objArr[0] = str;
        qix.LJIIL("onActivityPaused:{}", objArr);
        QID qid = this.LJLILLLLZI;
        if (qid != null) {
            this.LJLJI = qid.LLF;
            QID qid2 = (QID) qid.clone();
            qid2.LJIIL(currentTimeMillis);
            long j = currentTimeMillis - qid.LJLILLLLZI;
            if (j <= 0) {
                j = 1000;
            }
            qid2.LL = j;
            this.LJLJJL.LJIIJJI(qid2);
            this.LJLILLLLZI = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLJJL.LJJIZ.LJIIL("onActivityResumed: {}", activity.getClass().getName());
        String name = activity.getClass().getName();
        String str = this.LJLJI;
        QID qid = new QID();
        if (!TextUtils.isEmpty("")) {
            qid.LLF = a1.LJ(name, ":", "");
        } else {
            qid.LLF = name;
        }
        qid.LJIIL(currentTimeMillis);
        qid.LL = -1L;
        if (str == null) {
            str = "";
        }
        qid.LLD = str;
        this.LJLJJL.LJIIJJI(qid);
        this.LJLILLLLZI = qid;
        qid.LLFF = !this.LJLJJI.remove(Integer.valueOf(activity.hashCode())) ? 1 : 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.LJLIL == 0) {
            if (!this.LJLJJLL) {
                this.LJLJJL.LJJIZ.LJIIL("App back to frontend...", new Object[0]);
                if (this.LJLJJL.LJ() != null) {
                    this.LJLJJL.LJ().getClass();
                }
            } else {
                this.LJLJJL.LJJIZ.LJIIL("App first to frontend...", new Object[0]);
            }
        }
        this.LJLIL++;
        this.LJLJJLL = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.LJLJI != null) {
            int i = this.LJLIL - 1;
            this.LJLIL = i;
            if (i <= 0) {
                this.LJLJI = null;
                this.LJLJJL.LJJIZ.LJIIL("App enter to background...", new Object[0]);
                if (this.LJLJJL.LJ() != null) {
                    this.LJLJJL.LJ().getClass();
                }
                if (this.LJLJJL.LJ() != null) {
                    this.LJLJJL.LJ().getClass();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.LJLJJI.add(Integer.valueOf(activity.hashCode()));
    }
}
