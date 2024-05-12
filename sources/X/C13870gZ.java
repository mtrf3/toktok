package X;

import android.content.Context;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.0gZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13870gZ {
    public static InterfaceC46732IVs LIZ() {
        Object value = IZ8.I.getValue();
        o.LJIIIIZZ(value, "<get-enableUsePreloadVideoMgrV2>(...)");
        if (((Number) value).intValue() == 1) {
            return (InterfaceC46732IVs) ESN.LIZ("com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2");
        }
        if (C47335Ihv.LIZ().getExperiment().enableMDLInitAsync() || ((Boolean) IZ8.LJLJJLL.getValue()).booleanValue()) {
            return (InterfaceC46732IVs) ESN.LIZ("com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager");
        }
        return (InterfaceC46732IVs) ESN.LIZ("com.ss.android.ugc.aweme.video.preload.VideoPreloadManager");
    }

    public static C31808Ce4 LIZIZ(Context context, int i, int i2) {
        C31808Ce4 c31808Ce4 = new C31808Ce4(context);
        c31808Ce4.setId(i);
        c31808Ce4.setVisibility(i2);
        return c31808Ce4;
    }

    public static void LIZJ(StringBuilder sb, String str, StringBuilder sb2, int i, String str2) {
        sb.append(str);
        LLog.LIZLLL(i, str2, X1D.LIZIZ(sb2));
    }
}
