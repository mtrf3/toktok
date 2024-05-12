package X;

import Y.ARunnableS44S0100000_8;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.strategy.IStrategyEventListener;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Iku, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47520Iku implements IStrategyEventListener {
    public final WeakReference<C47529Il3> LIZ;
    public final /* synthetic */ C47529Il3 LIZIZ;

    public C47520Iku(C47529Il3 c47529Il3, C47529Il3 c47529Il32) {
        this.LIZIZ = c47529Il3;
        this.LIZ = new WeakReference<>(c47529Il32);
    }

    @Override // com.bytedance.vcloud.strategy.IStrategyEventListener
    public final void onEventLog(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("eventName: ");
        LIZ.append(str);
        LIZ.append(", logInfo: ");
        LIZ.append(str2);
        TTVideoEngineLog.d("VCStrategy", X1D.LIZIZ(LIZ));
        if (!TextUtils.isEmpty(str2)) {
            try {
                EnumC47567Ilf.instance.addEventV2(true, new JSONObject(str2), str);
            } catch (JSONException e) {
                TTVideoEngineLog.d(e);
            }
        }
    }

    @Override // com.bytedance.vcloud.strategy.IStrategyEventListener
    public final void onEvent(String str, int i, int i2, String str2) {
        C47521Ikv c47521Ikv;
        StringBuilder LJ = AnonymousClass028.LJ("on event, videoID = ", str, ", key = ", i, ", value = ");
        LJ.append(i2);
        LJ.append(", info = ");
        LJ.append(str2);
        C78253UnR.LJI("VCStrategy", X1D.LIZIZ(LJ));
        if (i == 2019) {
            C47529Il3 c47529Il3 = this.LIZ.get();
            if (c47529Il3 == null || (c47521Ikv = c47529Il3.LJIILL) == null) {
                return;
            }
            switch (i2) {
                case 1:
                    try {
                        if (!c47521Ikv.LIZ()) {
                            C78253UnR.LIZLLL("VCStrategy", "create db fail.");
                        } else {
                            c47521Ikv.LIZIZ();
                        }
                        return;
                    } catch (Throwable th) {
                        TTVideoEngineLog.d(th);
                        return;
                    }
                case 2:
                    try {
                        c47521Ikv.LIZ.add(str);
                        if (c47521Ikv.LIZ.size() > 2000) {
                            c47521Ikv.LIZIZ.LIZ((String) ListProtector.remove(c47521Ikv.LIZ, 0));
                        }
                        c47521Ikv.LIZJ();
                        c47521Ikv.LIZIZ.putString(str, str2);
                        return;
                    } catch (Throwable th2) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("save data fail. ");
                        LIZ.append(th2.toString());
                        C78253UnR.LIZLLL("VCStrategy", X1D.LIZIZ(LIZ));
                        return;
                    }
                case 3:
                    try {
                        c47521Ikv.LIZ.remove(str);
                        c47521Ikv.LIZIZ.LIZ(str);
                        c47521Ikv.LIZJ();
                        return;
                    } catch (Throwable th3) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("remove data fail. ");
                        LIZ2.append(th3.toString());
                        C78253UnR.LIZLLL("VCStrategy", X1D.LIZIZ(LIZ2));
                        return;
                    }
                case 4:
                    try {
                        c47521Ikv.LIZIZ.putString(str, str2);
                        return;
                    } catch (Throwable th4) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("save key value fail. ");
                        LIZ3.append(th4.toString());
                        C78253UnR.LIZLLL("VCStrategy", X1D.LIZIZ(LIZ3));
                        return;
                    }
                case 5:
                    try {
                        if (!c47521Ikv.LIZ()) {
                            C78253UnR.LIZLLL("VCStrategy", "create db fail.");
                        } else {
                            C47529Il3 c47529Il32 = c47521Ikv.LIZLLL.get();
                            if (c47529Il32 != null) {
                                c47529Il32.LJ().businessEvent(31212, c47521Ikv.LIZIZ.getString(str));
                            }
                        }
                        return;
                    } catch (Throwable th5) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("load key value fail. ");
                        LIZ4.append(th5.toString());
                        C78253UnR.LIZLLL("VCStrategy", X1D.LIZIZ(LIZ4));
                        return;
                    }
                case 6:
                    try {
                        c47521Ikv.LIZIZ.clear();
                        return;
                    } catch (Throwable th6) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("clear fail. ");
                        LIZ5.append(th6.toString());
                        C78253UnR.LIZLLL("VCStrategy", X1D.LIZIZ(LIZ5));
                        return;
                    }
                default:
                    return;
            }
        }
        C47524Iky c47524Iky = this.LIZIZ.LJIIZILJ;
        c47524Iky.getClass();
        try {
            c47524Iky.LIZIZ(i, i2, str, str2);
        } catch (Throwable th7) {
            ((ConcurrentLinkedQueue) c47524Iky.LIZJ).add(new C32175Cjz(str, i, i2, str2, th7));
        }
        this.LIZIZ.LJIILJJIL.lock();
        C47529Il3 c47529Il33 = this.LIZIZ;
        if (c47529Il33.LIZLLL != null) {
            c47529Il33.LJIILJJIL.unlock();
            if (i == 2012 || i >= 2500) {
                C47088Idw c47088Idw = (C47088Idw) this.LIZIZ.LIZLLL;
                c47088Idw.getClass();
                Object value = IZ8.o1.getValue();
                o.LJIIIIZZ(value, "<get-strategyCenterOnEventOpt>(...)");
                if (((Boolean) value).booleanValue()) {
                    return;
                }
                C46982IcE.LJ.post(new ARunnableS44S0100000_8(c47088Idw, str, i, i2, str2, 57));
                return;
            }
            return;
        }
        c47529Il33.LJIILJJIL.unlock();
    }
}
