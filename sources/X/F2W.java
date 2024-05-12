package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes7.dex */
public final class F2W implements IJsonConverter {
    public final Gson LIZ;

    public F2W(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> String convertObjToJson(T t) {
        if (t == null) {
            return null;
        }
        return GsonProtectorUtils.toJson(this.LIZ, t);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> T convertJsonToObj(InputStream inputStream, Class<T> cls) {
        C65385PlN c65385PlN;
        C65385PlN c65385PlN2 = null;
        try {
            try {
                c65385PlN = new C65385PlN(new InputStreamReader(inputStream));
            } catch (Throwable th) {
                th = th;
            }
        } catch (s e) {
            e = e;
        }
        try {
            T t = (T) this.LIZ.LJIIIIZZ(c65385PlN, cls);
            try {
                c65385PlN.close();
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            return t;
        } catch (s e3) {
            e = e3;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JsonConvertImpl convert fail : ");
            LIZ.append(e.toString());
            H78.LIZJ(X1D.LIZIZ(LIZ));
            throw e;
        } catch (Throwable th2) {
            th = th2;
            c65385PlN2 = c65385PlN;
            if (c65385PlN2 != null) {
                try {
                    c65385PlN2.close();
                } catch (IOException e4) {
                    C16880lQ.LLLLIIL(e4);
                }
            }
            throw th;
        }
    }
}
