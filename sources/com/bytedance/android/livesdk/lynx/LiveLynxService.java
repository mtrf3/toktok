package com.bytedance.android.livesdk.lynx;

import X.ActivityC45651qj;
import X.C141335gf;
import X.C31243CNz;
import X.C31933Cg5;
import X.C31954CgQ;
import X.C3C5;
import X.CN1;
import X.CO7;
import X.CXL;
import X.InterfaceC31935Cg7;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.lynx.ui.TTLiveLynxFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LiveLynxService implements ILiveLynxService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.lynx.ILiveLynxService
    public final void Mn() {
        ((IHostAction) CN1.LIZ(IHostAction.class)).initLynxEnv();
    }

    @Override // com.bytedance.android.livesdk.lynx.ILiveLynxService
    public final Fragment P(Context context, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bundle, "bundle");
        TTLiveLynxFragment tTLiveLynxFragment = new TTLiveLynxFragment();
        tTLiveLynxFragment.setArguments(bundle);
        return tTLiveLynxFragment;
    }

    @Override // com.bytedance.android.livesdk.lynx.ILiveLynxService
    public final CO7 tq(ActivityC45651qj activityC45651qj, Integer num, String str, C31243CNz c31243CNz, String str2) {
        Object LIZ;
        try {
            LIZ = new C31954CgQ(activityC45651qj, null, num, str, null, c31243CNz, false, str2, 82);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            CXL cxl = CXL.INIT_FAILED;
            StringWriter stringWriter = new StringWriter();
            m10exceptionOrNullimpl.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            o.LJIIIIZZ(stringWriter2, "StringWriter().also {\n  …             }.toString()");
            C31933Cg5.LIZIZ(cxl, stringWriter2, "", 0);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (CO7) LIZ;
    }

    @Override // com.bytedance.android.livesdk.lynx.ILiveLynxService
    public final CO7 GY(ActivityC45651qj activityC45651qj, String url, Integer num, String str, String str2, InterfaceC31935Cg7 interfaceC31935Cg7) {
        Object LIZ;
        o.LJIIIZ(url, "url");
        try {
            LIZ = new C31954CgQ(activityC45651qj, url, num, str, str2, interfaceC31935Cg7, true, null, 128);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            CXL cxl = CXL.INIT_FAILED;
            StringWriter stringWriter = new StringWriter();
            m10exceptionOrNullimpl.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            o.LJIIIIZZ(stringWriter2, "StringWriter().also {\n  …             }.toString()");
            C31933Cg5.LIZIZ(cxl, stringWriter2, "", 0);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (CO7) LIZ;
    }
}
