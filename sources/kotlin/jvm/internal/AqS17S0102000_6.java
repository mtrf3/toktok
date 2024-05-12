package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C40700FyC;
import X.C66532Q9g;
import X.C76800UCe;
import X.ER6;
import X.F9J;
import X.InterfaceC65784Pro;
import X.ORY;
import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.convergence.dredge.IntervalDredgeAbility;
import com.ss.android.ugc.bytex.pthread.base.convergence.executor.AdaptiveThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.NewThreadPoolHelper;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m43.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AqS17S0102000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0();
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public final ThreadPoolExecutor invoke$0() {
        ThreadPoolExecutor newThreadPool = NewThreadPoolHelper.INSTANCE.newThreadPool(this.i1, this.i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory(), new RejectedExecutionHandler() { // from class: com.ss.android.ugc.bytex.pthread.base.convergence.executor.AdaptiveThreadPoolExecutor$mExecutor$2$1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                throw new RuntimeException("reject handler");
            }
        });
        newThreadPool.allowCoreThreadTimeOut(true);
        ((AdaptiveThreadPoolExecutor) this.l0).mDredgeHandler.bindDredgeAbility(new IntervalDredgeAbility(newThreadPool, 0, 2, null));
        return newThreadPool;
    }

    public static final Object invoke$1(AqS17S0102000_6 aqS17S0102000_6) {
        String[] strArr = (String[]) aqS17S0102000_6.l0;
        int i = aqS17S0102000_6.i1;
        int i2 = aqS17S0102000_6.i2;
        if (!C40700FyC.LIZ(u.class)) {
            if (strArr == null) {
                try {
                    strArr = new String[0];
                } catch (Throwable unused) {
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data_processing_options", new JSONArray((Collection) ORY.LJJZZIII(strArr)));
            jSONObject.put("data_processing_options_country", i);
            jSONObject.put("data_processing_options_state", i2);
            Context context = u.LJII;
            if (context != null) {
                F9J.LIZIZ(context, 0, "com.facebook.sdk.DataProcessingOptions").edit().putString("data_processing_options", jSONObject.toString()).apply();
            } else {
                o.LJIJI("applicationContext");
                throw null;
            }
        }
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$2(AqS17S0102000_6 aqS17S0102000_6) {
        int i = aqS17S0102000_6.i1;
        if (i == 0) {
            if (aqS17S0102000_6.i2 == 0) {
                ((ER6) aqS17S0102000_6.l0).LJLIL.setValue(Boolean.TRUE);
            }
        } else if (i == 1 && aqS17S0102000_6.i2 == 1) {
            ((ER6) aqS17S0102000_6.l0).LJLIL.setValue(Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0102000_6(int i, int i2, ER6 er6, int i3) {
        super(0);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = er6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0102000_6(int i, int i2, String[] strArr, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = strArr;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0102000_6(AdaptiveThreadPoolExecutor adaptiveThreadPoolExecutor, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = adaptiveThreadPoolExecutor;
        this.i1 = i;
        this.i2 = i2;
    }
}
