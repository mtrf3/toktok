package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.9t7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250979t7 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC60833Nu9, C76800UCe> {
    public static final C250979t7 LJLIL = new C250979t7();

    public C250979t7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC60833Nu9 interfaceC60833Nu9) {
        SparkContext sparkContext;
        String str;
        Object LIZ;
        Object LIZ2;
        Object LIZ3;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60833Nu9 iHybridView = interfaceC60833Nu9;
        o.LJIIIZ(iHybridView, "iHybridView");
        Object obj = null;
        if ((iHybridView instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && iHybridView != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) iHybridView) != null) {
            sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
        } else {
            sparkContext = null;
        }
        if (sparkContext == null) {
            str = null;
        } else {
            try {
                str = sparkContext.url;
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (parse != null) {
            LIZ = UriProtector.getQueryParameter(parse, "url");
        } else {
            LIZ = null;
        }
        C3C5.m7constructorimpl(LIZ);
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str2 = (String) LIZ;
        try {
            LIZ2 = UriProtector.getQueryParameter(UriProtector.parse(str2), "enter_from");
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        try {
            LIZ3 = UriProtector.getQueryParameter(UriProtector.parse(str2), "region");
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th3) {
            LIZ3 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ3);
        }
        if (!C3C5.m12isFailureimpl(LIZ3)) {
            obj = LIZ3;
        }
        FMX.LJIIL("stay_active_task_page_exist", C113554cx.LJJLIIIIJ(new OSZ("enter_from", LIZ2), new OSZ("region", obj)));
        return C76800UCe.LIZ;
    }
}
