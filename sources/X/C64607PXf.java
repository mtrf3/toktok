package X;

import com.ss.android.ugc.aweme.net.INetReleaseInterceptor;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.Request;

/* renamed from: X.PXf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64607PXf implements INetReleaseInterceptor {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        ArrayList arrayList;
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        java.util.Map LIZ = C66952QPk.LIZ(request.url().LJIIIIZZ);
        C64606PXe headers = request.headers();
        if (LIZ != null && !LIZ.isEmpty()) {
            if (headers == null) {
                String[] strArr = new String[LIZ.size() * 2];
                int i = 0;
                for (Map.Entry entry : LIZ.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        String trim = ((String) entry.getKey()).trim();
                        String trim2 = ((String) entry.getValue()).trim();
                        C64606PXe.LIZIZ(trim);
                        C64606PXe.LIZJ(trim2, trim);
                        strArr[i] = trim;
                        strArr[i + 1] = trim2;
                        i += 2;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                headers = new C64606PXe(strArr);
            } else {
                C64605PXd LJI = headers.LJI();
                for (Map.Entry entry2 : LIZ.entrySet()) {
                    LJI.LIZ((String) entry2.getKey(), (String) entry2.getValue());
                }
                headers = new C64606PXe(LJI);
            }
        }
        C64618PXq newBuilder = request.newBuilder();
        if (headers == null) {
            headers = request.headers();
        }
        newBuilder.getClass();
        newBuilder.LIZJ = headers.LJI();
        C64598PWw LIZ2 = pw8.LIZ(newBuilder.LIZIZ());
        C64606PXe c64606PXe = LIZ2.LJLJJLL;
        if (c64606PXe != null) {
            arrayList = new ArrayList();
            for (String str : c64606PXe.LJFF()) {
                arrayList.add(new FBY(str, c64606PXe.LIZLLL(str)));
            }
        } else {
            arrayList = null;
        }
        C66952QPk.LIZIZ(request.url().LJIIIIZZ, arrayList);
        return LIZ2;
    }
}
