package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Jth, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC50613Jth extends Handler {
    public WeakReference<ActivityC45651qj> LIZ;
    public C73411SrX LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final C62822Ol8 LJ;

    public final void LIZJ() {
        removeCallbacksAndMessages(null);
        LIZ(false);
        C73411SrX c73411SrX = this.LIZIZ;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LIZIZ;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            this.LIZIZ = null;
        }
    }

    public HandlerC50613Jth(Looper looper) {
        super(looper);
        this.LJ = C221108m2.LIZIZ(C50592JtM.LJLIL);
    }

    public final void LIZ(boolean z) {
        ActivityC45651qj activityC45651qj;
        WeakReference<ActivityC45651qj> weakReference = this.LIZ;
        if (weakReference != null && (activityC45651qj = weakReference.get()) != null) {
            FeedSearchIconViewModel feedSearchIconViewModel = (FeedSearchIconViewModel) ViewModelProviders.of(activityC45651qj).get(FeedSearchIconViewModel.class);
            ((LiveData) feedSearchIconViewModel.LJLILLLLZI.getValue()).postValue(Boolean.valueOf(z));
            if (z) {
                ((LiveData) feedSearchIconViewModel.LJLJI.getValue()).postValue(Boolean.FALSE);
            }
        }
    }

    public final void LIZIZ(long j) {
        ActivityC45651qj activityC45651qj;
        removeMessages(1);
        long j2 = 0;
        if (j >= 0) {
            j2 = j;
        }
        sendEmptyMessageDelayed(1, j2);
        LIZ(true);
        this.LIZLLL = SystemClock.elapsedRealtime();
        StringBuilder LIZJ = V10.LIZJ("Starting timer for ", j, "ms, activity: ");
        WeakReference<ActivityC45651qj> weakReference = this.LIZ;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        LIZJ.append(activityC45651qj);
        X1D.LIZIZ(LIZJ);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        ActivityC45651qj activityC45651qj;
        ActivityC45651qj activityC45651qj2;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((Number) this.LJ.getValue()).longValue());
            LIZ.append("ms timer completed, activity: ");
            WeakReference<ActivityC45651qj> weakReference = this.LIZ;
            if (weakReference != null) {
                activityC45651qj = weakReference.get();
            } else {
                activityC45651qj = null;
            }
            LIZ.append(activityC45651qj);
            X1D.LIZIZ(LIZ);
            LIZJ();
            WeakReference<ActivityC45651qj> weakReference2 = this.LIZ;
            if (weakReference2 == null || (activityC45651qj2 = weakReference2.get()) == null) {
                return;
            }
            ((LiveData) ((FeedSearchIconViewModel) ViewModelProviders.of(activityC45651qj2).get(FeedSearchIconViewModel.class)).LJLJI.getValue()).postValue(Boolean.TRUE);
        }
    }
}
