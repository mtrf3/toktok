package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27737Aub;
import X.C40126Fow;
import X.C40342FsQ;
import X.C40343FsR;
import X.C42193GhB;
import X.C60704Ns4;
import X.C60737Nsb;
import X.C71188Rwm;
import X.C76800UCe;
import X.InterfaceC88473Ynt;
import X.QXX;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class IDqS431S0100000_6 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS431S0100000_6(QXX qxx, int i) {
        super(3);
        this.$t = i;
        this.l0 = qxx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS431S0100000_6(C71188Rwm c71188Rwm, int i) {
        super(3);
        this.$t = i;
        this.l0 = c71188Rwm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS431S0100000_6(SparkContext sparkContext, int i) {
        super(3);
        this.$t = i;
        this.l0 = sparkContext;
    }

    public static final Object invoke$0(IDqS431S0100000_6 iDqS431S0100000_6, Object obj, Object obj2, Object obj3) {
        int i;
        C60704Ns4 hybridKitError = (C60704Ns4) obj3;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        o.LJIIIZ(hybridKitError, "hybridKitError");
        SparkContext sparkContext = (SparkContext) iDqS431S0100000_6.l0;
        int status = C40126Fow.LIZ.getStatus();
        Integer num = hybridKitError.LIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        String str = hybridKitError.LIZIZ;
        if (str == null) {
            str = "unknown";
        }
        C27737Aub.LIZJ(sparkContext, status, i, str, 0L, 132);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS431S0100000_6 iDqS431S0100000_6, Object obj, Object map, Object obj2) {
        ((Boolean) obj2).booleanValue();
        o.LJIIIZ(map, "map");
        QXX qxx = (QXX) iDqS431S0100000_6.l0;
        if (qxx != null) {
            qxx.LLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS431S0100000_6 iDqS431S0100000_6, Object obj, Object obj2, Object obj3) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;
        Context context1 = (Context) obj;
        String schema = (String) obj2;
        C60737Nsb c60737Nsb = (C60737Nsb) obj3;
        o.LJIIIZ(context1, "context1");
        o.LJIIIZ(schema, "schema");
        HashMap hashMap = new HashMap();
        hashMap.put("reload_time", Long.valueOf(System.currentTimeMillis()));
        C71188Rwm c71188Rwm = (C71188Rwm) iDqS431S0100000_6.l0;
        if (c60737Nsb instanceof SparkContext) {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = (SparkContext) c60737Nsb;
            sparkContext.usePreload = true;
            sparkContext.LJJIIJ("enable_pending_js_task", "1");
            sparkContext.LJJIJ(hashMap);
            c40342FsQ.getClass();
            LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(context1, sparkContext));
        } else {
            C40342FsQ c40342FsQ2 = C40343FsR.LJIILJJIL;
            SparkContext LIZIZ = C42193GhB.LIZIZ(schema);
            LIZIZ.usePreload = true;
            LIZIZ.LJJIIJ("enable_pending_js_task", "1");
            LIZIZ.LJJIJ(hashMap);
            c40342FsQ2.getClass();
            LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(context1, LIZIZ));
        }
        c71188Rwm.LLIILII = LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = ((C71188Rwm) iDqS431S0100000_6.l0).LLIILII;
        o.LJII(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkView");
        return sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }
}
