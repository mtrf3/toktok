package com.ss.android.ugc.aweme.live;

import X.C16880lQ;
import X.C38113ExZ;
import X.C38150EyA;
import X.C38287F0x;
import X.C38943FQd;
import X.C39579Fg7;
import X.C58096Mr6;
import X.C61017Nx7;
import X.FJU;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.main.MainActivity;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class LiveHostOuterService implements ILiveHostOuterService {
    public static ILiveHostOuterService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ILiveHostOuterService.class, false);
        if (LIZ != null) {
            return (ILiveHostOuterService) LIZ;
        }
        if (C58096Mr6.t2 == null) {
            synchronized (ILiveHostOuterService.class) {
                if (C58096Mr6.t2 == null) {
                    C58096Mr6.t2 = new LiveHostOuterService();
                }
            }
        }
        return C58096Mr6.t2;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final String LIZ() {
        FJU.LIZIZ().getClass();
        File file = new File(C38943FQd.LIZLLL().getPath(), C38943FQd.LIZ());
        C39579Fg7.LJFF(file);
        return file.getPath();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final C38113ExZ w2(Context context, C38113ExZ c38113ExZ) {
        C38287F0x c38287F0x = new C38287F0x(context);
        C38150EyA c38150EyA = new C38150EyA(c38113ExZ);
        c38150EyA.LJIIIIZZ = false;
        c38150EyA.LJFF = true;
        c38150EyA.LIZLLL = c38287F0x;
        List namespaces = Arrays.asList("host", "webcast");
        o.LJIIIZ(namespaces, "namespaces");
        C38150EyA.LIZIZ(c38150EyA, namespaces, null, null, 12);
        c38287F0x.setIesJsBridge(c38150EyA, null);
        return c38150EyA.LJII;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void LIZIZ(Activity activity, boolean z, boolean z2) {
        if (z && z2 && !C61017Nx7.LIZ().LIZIZ()) {
            C16880lQ.LIZIZ(activity, new Intent(activity, (Class<?>) MainActivity.class));
        }
    }
}
