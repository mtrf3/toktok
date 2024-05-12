package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.legoImp.task.CovodeCollectTask;
import java.io.File;
import java.net.MalformedURLException;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F3K implements F3N {
    public final /* synthetic */ CovodeCollectTask LIZ;

    public F3K(CovodeCollectTask covodeCollectTask) {
        this.LIZ = covodeCollectTask;
    }

    @Override // X.F3N
    public final void LIZ(File file) {
        CovodeCollectTask covodeCollectTask = this.LIZ;
        covodeCollectTask.getClass();
        if (C38686FGg.LJ) {
            Object value = C36157EGz.LIZIZ.getValue();
            o.LJIIIIZZ(value, "isFirstLaunch.value");
            if (((Boolean) value).booleanValue()) {
                C62822Ol8 c62822Ol8 = C36157EGz.LIZ;
                if (((Number) c62822Ol8.getValue()).intValue() == 2 || ((Number) c62822Ol8.getValue()).intValue() == 3) {
                    return;
                }
            }
        }
        long j = covodeCollectTask.LJLIL.getLong("covode_upload_version_code", 0L);
        long LJFF = EF7.LJFF();
        if (j == LJFF) {
            if (System.currentTimeMillis() - covodeCollectTask.LJLIL.getLong("covode_upload_time", 0L) < covodeCollectTask.LJLIL.getInt("upload_interval_day", 0) * 86400000) {
                return;
            }
        } else {
            covodeCollectTask.LJLIL.storeLong("covode_upload_version_code", LJFF);
            covodeCollectTask.LJLIL.storeInt("upload_interval_day", 0);
            covodeCollectTask.LJLIL.storeLong("covode_upload_time", 0L);
        }
        String str = EF7.LJIIJJI;
        if (o.LJ("", str)) {
            try {
                String substring = EF7.LJ().substring(0, 7);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                str = substring;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        String absolutePath = file.getAbsolutePath();
        String valueOf = String.valueOf(EF7.LJIIIZ);
        String valueOf2 = String.valueOf(EF7.LJFF());
        String str2 = EF7.LJIILIIL;
        F3L f3l = new F3L(covodeCollectTask);
        if (TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(valueOf2) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            C78983UzD.LJIILL("Missing required parameters");
            return;
        }
        List<String> list = C39038FTu.LIZJ;
        if (C17N.LJJIIZI(list)) {
            C78983UzD.LJIILL("need host");
            return;
        }
        try {
            String host = new java.net.URL((String) ListProtector.get(list, 0)).getHost();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            LIZ.append(host);
            LIZ.append("/monitor/collect/c/code_coverage");
            UCH.LJLJJLL = X1D.LIZIZ(LIZ);
            F9U.LIZ.LJII(new F3I(valueOf, valueOf2, str2, str, absolutePath, f3l));
        } catch (MalformedURLException unused) {
            C78983UzD.LJIILL("MalformedURLException");
        }
    }
}
