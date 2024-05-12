package X;

import Y.ACallableS40S1100000_15;
import android.content.Context;
import android.os.Environment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.io.File;
import java.io.ObjectOutputStream;
import java.util.Collection;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XPa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84778XPa implements InterfaceC72081SQr<String> {
    public final XQ6 LIZ;
    public final C84382X9u LIZIZ;

    @Override // X.InterfaceC72081SQr
    public final Collection<Aweme> values() {
        return this.LIZ.LJLIL.values();
    }

    public C84778XPa() {
        XQ5 xq5 = new XQ5();
        xq5.LIZIZ(100L);
        xq5.LIZJ(new C84781XPd(this));
        this.LIZ = xq5.LIZ();
        try {
            File LIZIZ = LIZIZ(EF7.LIZIZ());
            if (LIZIZ.exists()) {
                C37246Eja c37246Eja = C37247Ejb.LIZIZ;
                String absolutePath = LIZIZ.getAbsolutePath();
                o.LJIIIIZZ(absolutePath, "awemeCache.absolutePath");
                c37246Eja.getClass();
                C36871EdX.LJ(absolutePath);
            }
            this.LIZIZ = C84382X9u.LJI(LIZIZ, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppVersionCode(), 52428800L);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC72081SQr
    public final void clear() {
        try {
            File LIZIZ = LIZIZ(EF7.LIZIZ());
            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
            String absolutePath = LIZIZ.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "awemeCache.absolutePath");
            c37246Eja.getClass();
            C36871EdX.LJ(absolutePath);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final File LIZIZ(Context context) {
        String path;
        if (o.LJ("mounted", C16880lQ.LLLLLLLZIL()) || !Environment.isExternalStorageRemovable()) {
            File LLIIIZ = C16880lQ.LLIIIZ(context);
            o.LJI(LLIIIZ);
            path = LLIIIZ.getPath();
            o.LJIIIIZZ(path, "{\n            context.ex…CacheDir!!.path\n        }");
        } else {
            path = C16880lQ.LLIIIL(context).getPath();
            o.LJIIIIZZ(path, "{\n            context.cacheDir.path\n        }");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(path);
        return new File(JBR.LJFF(LIZ, File.separator, "awemeCache", LIZ));
    }

    @Override // X.InterfaceC72081SQr
    public final boolean containsKey(String str) {
        String str2 = str;
        boolean containsKey = this.LIZ.LJLIL.containsKey(str2);
        if (!containsKey) {
            C84382X9u c84382X9u = this.LIZIZ;
            if (c84382X9u != null) {
                if (c84382X9u.LJLJLJ != null) {
                    try {
                        C39717FiL LJ = c84382X9u.LJ(str2);
                        if (LJ != null) {
                            LJ.close();
                            return true;
                        }
                        return false;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            return false;
        }
        return containsKey;
    }

    @Override // X.InterfaceC72081SQr
    public final Aweme get(String str) {
        Aweme aweme;
        String str2 = str;
        try {
            aweme = (Aweme) this.LIZ.LIZ(str2, new ACallableS40S1100000_15(this, str2, 1));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            aweme = null;
        }
        if (aweme == null) {
            try {
                JSONObject jSONObject = new JSONObject();
                String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
                o.LJIIIIZZ(stackTraceString, "getStackTraceString(Throwable())");
                if (stackTraceString.length() > 4096) {
                    stackTraceString = stackTraceString.substring(0, 4096);
                    o.LJIIIIZZ(stackTraceString, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("aid", str2);
                FUA.LIZJ("aweme_manager_get_aweme_is_null", jSONObject);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        return aweme;
    }

    @Override // X.InterfaceC72081SQr
    public final void LIZ(Aweme aweme, Object obj) {
        this.LIZ.LJLIL.put(obj, aweme);
    }

    public final void LIZJ(Aweme aweme, String str) {
        ObjectOutputStream objectOutputStream;
        C84384X9w LIZLLL;
        C79564VKm c79564VKm;
        C84382X9u c84382X9u = this.LIZIZ;
        if (c84382X9u == null) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                LIZLLL = c84382X9u.LIZLLL(str);
                if (LIZLLL != null) {
                    c79564VKm = LIZLLL.LIZJ();
                } else {
                    c79564VKm = null;
                }
                objectOutputStream = new ObjectOutputStream(c79564VKm);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            objectOutputStream.writeObject(aweme);
            if (LIZLLL != null) {
                LIZLLL.LIZIZ();
            }
            C38891fp.LJIIJJI(objectOutputStream);
        } catch (Exception e2) {
            e = e2;
            objectOutputStream2 = objectOutputStream;
            C16880lQ.LLLLIIL(e);
            C38891fp.LJIIJJI(objectOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            C38891fp.LJIIJJI(objectOutputStream);
            throw th;
        }
    }
}
