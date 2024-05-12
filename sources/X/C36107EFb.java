package X;

import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImpl.task.InitFireBase;
import kotlin.jvm.internal.o;

/* renamed from: X.EFb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36107EFb<TTaskResult, TContinuationResult> implements C10I {
    public static final C36107EFb<TTaskResult, TContinuationResult> LIZ = new C36107EFb<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        C36093EEn c36093EEn = C36093EEn.LIZ;
        if (TasksHolder.LIZJ == null) {
            TasksHolder.LIZJ = new InitFireBase();
        }
        InitFireBase initFireBase = TasksHolder.LIZJ;
        o.LJIIIIZZ(initFireBase, "getInitFireBase()");
        c36093EEn.getClass();
        C36093EEn.LJ(initFireBase);
        C62822Ol8 c62822Ol8 = DV1.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 0) {
            return null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(((Number) c62822Ol8.getValue()).intValue(), "tablet_common_param");
        FMX.LJIIL("track_common_param", c188727au.LIZ);
        return null;
    }
}
