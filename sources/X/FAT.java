package X;

import Y.ARunnableS18S0201000_15;
import android.app.Activity;
import android.view.ViewTreeObserver;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FAT implements ViewTreeObserver.OnDrawListener {
    public boolean LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ ViewTreeObserver LJLJI;
    public final /* synthetic */ FAU LJLJJI;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        if (FAU.LJLJJLL) {
            FAS fas = this.LJLJJI.LJLIL;
            if (fas != null) {
                fas.LIZ(this.LJLILLLLZI, FAU.LJLJL);
            }
            final FAU fau = this.LJLJJI;
            final String LJLLJ = C16880lQ.LJLLJ(this.LJLILLLLZI.getClass());
            final int i = fau.LJLILLLLZI;
            final long j = fau.LJLJI;
            java.util.Map<String, Object> map = FAU.LJLJL;
            final HashMap hashMap = new HashMap(map);
            final long currentTimeMillis = System.currentTimeMillis();
            C10K.LIZJ(new Callable() { // from class: X.FAP
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    FAU fau2 = FAU.this;
                    java.util.Map map2 = hashMap;
                    int i2 = i;
                    long j2 = j;
                    String str = LJLLJ;
                    long j3 = currentTimeMillis;
                    fau2.getClass();
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map2.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    if (i2 == 1) {
                        j2 = C56662Kg.LIZ().LJIIJ;
                    } else if (i2 != 2) {
                        j2 = 0;
                    }
                    jSONObject.put("cold_boot_type", i2);
                    jSONObject.put("landing_page", str);
                    jSONObject.put("cold_boot_ad_type", C56662Kg.LIZ().LJI);
                    jSONObject.put("cold_boot_source", C56662Kg.LIZ().LJFF);
                    jSONObject.put("cold_boot_time", j3 - j2);
                    AppLogNewUtils.onEventV3("main_boot_type", jSONObject);
                    return null;
                }
            });
            fau.LJLILLLLZI = 1;
            fau.LJLJI = 0L;
            ((ConcurrentHashMap) map).clear();
            FAU.LJLJJLL = false;
        }
        this.LJLJJI.LJLJJI.post(new ARunnableS18S0201000_15(0, this.LJLJI, this, 5));
    }

    public FAT(FAU fau, Activity activity, ViewTreeObserver viewTreeObserver) {
        this.LJLJJI = fau;
        this.LJLILLLLZI = activity;
        this.LJLJI = viewTreeObserver;
    }
}
