package X;

import Y.ACallableS83S0200000_6;
import Y.AgS123S0100000_6;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ehi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37130Ehi extends AbstractC38521fE {
    @Override // X.AbstractC38521fE
    public final boolean LJIIIZ() {
        AbstractC40550Fvm abstractC40550Fvm;
        Activity validTopActivity;
        C37124Ehc dynamicAbstractTask = (C37124Ehc) ((AbstractC37134Ehm) this.LJLILLLLZI);
        o.LJIIIZ(dynamicAbstractTask, "dynamicAbstractTask");
        try {
            C09900aA.LJI("df_install_start", new JSONObject(dynamicAbstractTask.LJ()), null, null);
        } catch (Exception unused) {
        }
        Locale locale = dynamicAbstractTask.LJIILLIIL;
        if (LJIIL(locale)) {
            C37099EhD.LIZIZ(5, dynamicAbstractTask);
            dynamicAbstractTask.LIZIZ(1);
            return true;
        }
        String packageName = dynamicAbstractTask.LIZIZ;
        o.LJIIIZ(packageName, "packageName");
        ConcurrentHashMap<String, AbstractC40550Fvm> concurrentHashMap = C37101EhF.LIZIZ;
        synchronized (concurrentHashMap) {
            abstractC40550Fvm = concurrentHashMap.get(packageName);
        }
        if (abstractC40550Fvm != null) {
            C37099EhD.LIZIZ(abstractC40550Fvm.LJIIJJI(), dynamicAbstractTask);
            if (abstractC40550Fvm.LJIIJJI() == 2 || abstractC40550Fvm.LJIIJJI() == 4) {
                F5V.LIZLLL().LJ(dynamicAbstractTask.LIZ).LIZ(dynamicAbstractTask);
                return false;
            }
        } else {
            C37099EhD.LIZIZ(0, dynamicAbstractTask);
        }
        if (TextUtils.equals("ceb", locale.getLanguage())) {
            try {
                if (C16880lQ.LLLLLLZ(EF7.LIZIZ().getPackageManager(), "com.android.vending", 0).versionCode < 81510000) {
                    if (!dynamicAbstractTask.LJFF && (validTopActivity = ActivityStack.getValidTopActivity()) != null) {
                        C62905OmT c62905OmT = new C62905OmT(validTopActivity);
                        c62905OmT.LIZ(R.string.jsy);
                        c62905OmT.LJIIJJI(R.string.dsg, null, false);
                        C279017q.LIZLLL(c62905OmT);
                    }
                    dynamicAbstractTask.LIZ(3, dynamicAbstractTask.LJIIIIZZ);
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        F5V LIZLLL = F5V.LIZLLL();
        LIZLLL.getClass();
        C10K.LIZIZ(new ACallableS83S0200000_6(LIZLLL, dynamicAbstractTask, 14), LIZLLL.LJLIL, null).LIZLLL(new AgS123S0100000_6(dynamicAbstractTask, 13));
        return false;
    }

    public C37130Ehi(C37124Ehc c37124Ehc) {
        super(c37124Ehc);
    }

    public static boolean LJIIL(Locale locale) {
        try {
            String language = locale.getLanguage();
            if (TextUtils.equals("en", language)) {
                return true;
            }
            return F5W.LIZIZ.LJ().contains(language);
        } catch (Throwable unused) {
            return false;
        }
    }
}
