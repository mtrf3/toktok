package X;

import com.ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.EeP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36925EeP implements C8V7 {
    @Override // X.C8V7
    public final void LIZ(Exception exc, String message) {
        o.LJIIIZ(message, "message");
        C36922EeM.LIZIZ(exc, message);
    }

    @Override // X.C8V7
    public final void log(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        C36922EeM.LIZLLL(4, str, msg);
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = AssemInitTask.LJLIL;
            if (copyOnWriteArrayList.size() <= 100) {
                copyOnWriteArrayList.add("Assem tag: " + str + ", msg: " + msg);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
