package X;

import android.content.Context;
import android.os.FileObserver;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.legoimpl.service.Dex2OatTask;
import kotlin.jvm.internal.o;

/* renamed from: X.Edj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class FileObserverC36883Edj extends FileObserver {
    public final Context LIZ;
    public final /* synthetic */ Dex2OatTask LIZIZ;

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 2) {
            Dex2OatTask dex2OatTask = this.LIZIZ;
            if (dex2OatTask.LJLILLLLZI) {
                return;
            }
            dex2OatTask.LJLILLLLZI = true;
            try {
                SystemClock.elapsedRealtime();
                stopWatching();
                this.LIZIZ.LJLIL = null;
                if (((Boolean) C36887Edn.LIZ.getValue()).booleanValue()) {
                    this.LIZIZ.LJII(this.LIZ);
                } else {
                    Dex2OatTask dex2OatTask2 = this.LIZIZ;
                    Context context = this.LIZ;
                    dex2OatTask2.getClass();
                    Dex2OatTask.LJ(context);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC36883Edj(Dex2OatTask dex2OatTask, Context context, String path) {
        super(path);
        o.LJIIIZ(path, "path");
        this.LIZIZ = dex2OatTask;
        this.LIZ = context;
    }
}
