package X;

import Y.ARunnableS30S0200000_11;
import android.content.Context;
import com.ss.android.ugc.aweme.legoImp.task.LogCleanTask;
import kotlin.jvm.internal.o;

/* renamed from: X.PPa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64394PPa implements InterfaceC64395PPb {
    public final /* synthetic */ LogCleanTask LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C64394PPa(LogCleanTask logCleanTask, Context context) {
        this.LIZ = logCleanTask;
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC64395PPb
    public final void LIZ(String lastIdc, String currentIdc) {
        o.LJIIIZ(lastIdc, "lastIdc");
        o.LJIIIZ(currentIdc, "currentIdc");
        if (lastIdc.length() > 0 && !o.LJ(lastIdc, currentIdc)) {
            LogCleanTask logCleanTask = this.LIZ;
            Context context = this.LIZIZ;
            logCleanTask.getClass();
            C82544WaS.LIZ(new ARunnableS30S0200000_11(context, logCleanTask, 16));
        }
    }
}
