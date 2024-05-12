package X;

import android.os.Looper;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class S52 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C64797Pbt c64797Pbt, String str, boolean z) {
        if (!C53175Ktv.LIZ() || str == null || str.length() == 0) {
            return;
        }
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LIZIZ(c64797Pbt, str, z);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZ), null, null, new C75172xF(c64797Pbt, str, z, null), 3);
        }
    }

    public static void LIZIZ(C64797Pbt c64797Pbt, String str, boolean z) {
        C36910EeA c36910EeA;
        TypedInput typedInput;
        InputStream in;
        BufferedReader bufferedReader;
        String str2 = null;
        if (c64797Pbt != null && (c36910EeA = c64797Pbt.LIZ) != null && (typedInput = c36910EeA.LJ) != null && (in = typedInput.in()) != null) {
            try {
                Reader inputStreamReader = new InputStreamReader(in, PVC.LIZ);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
                }
                try {
                    String LJIILJJIL = C77321UWf.LJIILJJIL(bufferedReader);
                    AnonymousClass636.LJFF(bufferedReader, null);
                    str2 = LJIILJJIL;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass636.LJFF(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
            if (str2 != null) {
                String string = JSONObjectProtectorUtils.getString(new JSONObject(str2), "data");
                if (z) {
                    IEventCenter LJ = EventCenter.LJ();
                    JSONObject LIZLLL = C770830u.LIZLLL("action_type", 1);
                    LIZLLL.put("data", C65232Piu.LIZJ("pin_product_data", string));
                    String jSONObject = LIZLLL.toString();
                    o.LJIIIIZZ(jSONObject, "JSONObject().apply {\n   …\n            }.toString()");
                    LJ.LIZ("ec_audience_message_event", jSONObject);
                }
                C71284RyK.LIZIZ("pin_product", str, string);
            }
        }
    }
}
