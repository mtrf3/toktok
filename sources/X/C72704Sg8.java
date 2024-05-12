package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.liveinteract.platform.common.api.LogReportApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Sg8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C72704Sg8 implements InterfaceC48038ItG {
    public static C252659vp LIZ(int i) {
        C252659vp c252659vp = new C252659vp();
        c252659vp.LIZJ(i);
        return c252659vp;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        return ((LogReportApi) Q7L.LIZIZ(LogReportApi.class)).logReport("a", obj);
    }

    public static boolean LIZIZ(View view, String str) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return C26338AVi.LIZJ(context);
    }
}
