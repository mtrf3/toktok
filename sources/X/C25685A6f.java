package X;

import Y.ACallableS3S1000000_4;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.A6f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25685A6f {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        try {
            C16880lQ.LLLLLLZ(context.getPackageManager(), "com.tiktok.android.music", 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void LIZIZ(Context context, String str, boolean z) {
        if (str == null || str.length() == 0) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
        try {
            C16880lQ.LIZJ(context, intent);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        if (!z || !((Boolean) C27935Axn.LIZ.getValue()).booleanValue() || str.length() == 0) {
            return;
        }
        AbstractC73672Svk.LJJIIJZLJL(new ACallableS3S1000000_4(str, 0)).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9EK
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9EL
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public static void LIZJ(Context context, String str, String str2) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 23) {
            if (str.length() == 0) {
                return;
            } else {
                intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
            }
        } else {
            if (str2.length() == 0) {
                return;
            }
            intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str2)).setPackage("com.tiktok.android.music");
            o.LJIIIIZZ(intent, "{\n            // default…M_PACKAGE_NAME)\n        }");
        }
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("pns.sandbox.dataflow_id", 1207968001);
        try {
            C16880lQ.LIZJ(context, intent);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
