package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.view.ViewGroup;
import com.bytedance.helios.statichook.config.ApiHookConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0Dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03880Dg {
    public Object LIZ;

    public /* synthetic */ C03880Dg() {
    }

    public C03880Dg(int i) {
        if (i != 2) {
            this.LIZ = C113554cx.LJJLIIIIJ(new OSZ("+", new C66350Q2g()), new OSZ("-", new C66349Q2f()), new OSZ("==", new C66345Q2b()), new OSZ("!=", new C66346Q2c()), new OSZ("&&", new C66358Q2o()), new OSZ("||", new C66364Q2u()), new OSZ("<=", new Q2Z()), new OSZ("<", new C66344Q2a()), new OSZ(">=", new Q2X()), new OSZ(">", new Q2Y()), new OSZ("!", new C66365Q2v()), new OSZ("*", new C66348Q2e()), new OSZ("/", new C66347Q2d()), new OSZ("%", new C66351Q2h()), new OSZ("out", new C66353Q2j()), new OSZ("in", new C66352Q2i()), new OSZ("&", new C66356Q2m()), new OSZ("|", new C66357Q2n()), new OSZ("^", new C66355Q2l()), new OSZ("isIntersect", new C66354Q2k()), new OSZ("startwith", new C66363Q2t()), new OSZ("endwith", new C66362Q2s()), new OSZ("notendwith", new C66359Q2p()), new OSZ("contains", new C66361Q2r()), new OSZ("matches", new C66360Q2q()));
        } else {
            this.LIZ = new ArrayList();
        }
    }

    public /* synthetic */ C03880Dg(C73893SzJ operatorSubject) {
        o.LJIIIZ(operatorSubject, "operatorSubject");
        this.LIZ = operatorSubject;
    }

    public /* synthetic */ C03880Dg(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    public /* synthetic */ C03880Dg(ViewGroup viewGroup) {
        this.LIZ = viewGroup.getOverlay();
    }

    public static void LIZ(Context context, String str, C39316Fbs preInstallResult, String str2, String str3, int i) {
        long j;
        PackageInfo LLLLLLZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(preInstallResult, "preInstallResult");
        SQLiteDatabase writableDatabase = new C66860QLw(context).getWritableDatabase();
        writableDatabase.execSQL("delete from preinstall_tb");
        ContentValues contentValues = new ContentValues();
        C39310Fbm c39310Fbm = preInstallResult.LIZ;
        String str4 = preInstallResult.LIZJ.LJLILLLLZI;
        contentValues.put("preinstall_channel_af", str2);
        contentValues.put("preinstall_campaign_af", str3);
        contentValues.put("preinstall_channel_tt", c39310Fbm.LJLIL);
        contentValues.put("system_file_channel", c39310Fbm.LJLJJLL);
        contentValues.put("file_path", c39310Fbm.LJLJL);
        contentValues.put("name_in_manifest", c39310Fbm.LJLL);
        contentValues.put("install_referrer", str4);
        contentValues.put("app_channel", str);
        contentValues.put("apk_first_install_time", Long.valueOf(C37114EhS.LIZ(context)));
        try {
            LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (LLLLLLZ != null) {
            j = LLLLLLZ.lastUpdateTime;
            contentValues.put("apk_last_update_time", Long.valueOf(j));
            contentValues.put("is_factory_uninstall", Integer.valueOf(c39310Fbm.LJLJLLL ? 1 : 0));
            contentValues.put("preinstall_method", Integer.valueOf(c39310Fbm.LJLLILLLL));
            contentValues.put("df_code", Integer.valueOf(i));
            writableDatabase.insert("preinstall_tb", null, contentValues);
            writableDatabase.close();
        }
        j = -1;
        contentValues.put("apk_last_update_time", Long.valueOf(j));
        contentValues.put("is_factory_uninstall", Integer.valueOf(c39310Fbm.LJLJLLL ? 1 : 0));
        contentValues.put("preinstall_method", Integer.valueOf(c39310Fbm.LJLLILLLL));
        contentValues.put("df_code", Integer.valueOf(i));
        writableDatabase.insert("preinstall_tb", null, contentValues);
        writableDatabase.close();
    }

    public final C39519Ff9 LIZJ(int i, String str, String str2, Object obj, Object[] objArr, String str3, C65300Pk0 c65300Pk0) {
        InterfaceC39518Ff8[] interfaceC39518Ff8Arr;
        C39519Ff9 preInvoke;
        C65987Pv5 c65987Pv5 = ApiHookConfig.LIZIZ.get(Integer.valueOf(i));
        if (c65987Pv5 != null) {
            interfaceC39518Ff8Arr = c65987Pv5.LJIIIIZZ;
        } else {
            interfaceC39518Ff8Arr = ApiHookConfig.LIZJ;
        }
        for (InterfaceC39518Ff8 interfaceC39518Ff8 : interfaceC39518Ff8Arr) {
            try {
                preInvoke = interfaceC39518Ff8.preInvoke(i, str, str2, obj, objArr, str3, c65300Pk0);
            } catch (Exception unused) {
            }
            if (!preInvoke.LIZ) {
                ((List) this.LIZ).add(interfaceC39518Ff8);
            } else {
                return preInvoke;
            }
        }
        return new C39519Ff9(null, false);
    }

    public final void LIZIZ(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C65300Pk0 c65300Pk0, boolean z) {
        int size = ((List) this.LIZ).size();
        while (true) {
            size--;
            if (size >= 0) {
                try {
                    ((InterfaceC39518Ff8) ListProtector.get((List) this.LIZ, size)).postInvoke(i, str, str2, obj2, objArr, obj, c65300Pk0, z);
                } catch (Exception unused) {
                }
            } else {
                return;
            }
        }
    }
}
