package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* renamed from: X.F2z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38341F2z<T> implements InterfaceC38301F1l<T> {
    public static final Gson LIZIZ;
    public final Class<T> LIZ;

    static {
        e LIZ = JsonParseUtils.LIZ();
        LIZ.LIZJ(new MusicTypeAdapterFactory());
        LIZ.LIZJ(new UserTypeAdapterFactory());
        if (C52535Kjb.LIZ()) {
            LIZ.LIZJ(new AwemeCollectionTypeAdapterFactory());
        }
        LIZIZ = LIZ.LIZ();
    }

    public C38341F2z(Class<T> cls) {
        this.LIZ = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.ss.android.ugc.aweme.base.api.BaseResponse, X.Ee8] */
    @Override // X.InterfaceC38301F1l
    public final T LIZ(Object obj) {
        BaseResponse.class.isAssignableFrom(this.LIZ);
        try {
            T t = (T) LIZIZ.LJI(obj.toString(), this.LIZ);
            if (t instanceof BaseResponse) {
                try {
                    ?? r1 = (T) ((BaseResponse) t);
                    r1.checkValid();
                    return r1;
                } catch (C38333F2r e) {
                    throw e;
                } catch (Throwable th) {
                    throw new C38306F1q(-1, th);
                }
            }
            return t;
        } catch (Throwable th2) {
            throw new C37067Egh(th2);
        }
    }
}
