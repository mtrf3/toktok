package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.HsU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45442HsU implements InterfaceC82275WQt {
    @Override // X.InterfaceC82275WQt
    public final void LIZ(C79155V4t filterMeta, String str, long j, AbstractC48314Ixi abstractC48314Ixi, long j2) {
        String str2;
        o.LJIIIZ(filterMeta, "filterMeta");
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("tools_use_downloader", Boolean.valueOf(abstractC48314Ixi instanceof C45452Hse));
        c6bk.LIZ.put("url", str);
        c6bk.LIZ.put("duration", String.valueOf(j));
        LJJIIZI.LJIIL(0, "filter_download_error_rate", c6bk.LJ());
        C145995oB c145995oB = new C145995oB();
        if (C140465fG.LIZ()) {
            str2 = "composer_filter";
        } else {
            str2 = "color_filter";
        }
        c145995oB.LJI("resource_type", str2);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(0, "status");
        c145995oB.LIZ(filterMeta.LIZ, "resource_id");
        c145995oB.LIZIZ(j2, "source_file_size");
        GXR.LIZ("tool_performance_resource_download", c145995oB.LIZ);
    }

    @Override // X.InterfaceC82275WQt
    public final void LIZIZ(C79155V4t filterMeta, String str, long j, AbstractC48314Ixi abstractC48314Ixi, Exception exc, Integer num) {
        String str2;
        o.LJIIIZ(filterMeta, "filterMeta");
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        C6BK c6bk = new C6BK();
        String LJFF = H78.LJFF(exc);
        o.LJIIIIZZ(LJFF, "getStackTraceString(e)");
        c6bk.LIZ.put("exception", LJFF);
        c6bk.LIZ.put("tools_use_downloader", Boolean.valueOf(abstractC48314Ixi instanceof C45452Hse));
        c6bk.LIZ.put("url", str);
        c6bk.LIZ.put("filter_id", Integer.valueOf(filterMeta.LIZ));
        c6bk.LIZ.put("filter_name", filterMeta.LIZJ);
        LJJIIZI.LJIIL(1, "filter_download_error_rate", c6bk.LJ());
        C145995oB c145995oB = new C145995oB();
        if (C140465fG.LIZ()) {
            str2 = "composer_filter";
        } else {
            str2 = "color_filter";
        }
        c145995oB.LJI("resource_type", str2);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZ(1, "status");
        c145995oB.LIZ(filterMeta.LIZ, "resource_id");
        c145995oB.LIZJ(ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0), "error_domain");
        c145995oB.LIZJ(num, "error_code");
        String message = exc.getMessage();
        if (message == null) {
            message = "empty_error_msg";
        }
        c145995oB.LJI("error_msg", message);
        GXR.LIZ("tool_performance_resource_download", c145995oB.LIZ);
    }
}
