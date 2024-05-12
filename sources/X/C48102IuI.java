package X;

import Y.ARunnableS44S0100000_8;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Request;

/* renamed from: X.IuI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48102IuI implements InterfaceC48121Iub {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        long j;
        Request request = ((PW8) pxz).LJFF;
        C64618PXq newBuilder = request.newBuilder();
        synchronized (C47455Ijr.class) {
            long j2 = C47455Ijr.LJIL;
            j = 1;
            if (j2 < Long.MAX_VALUE) {
                j = 1 + j2;
            }
            C47455Ijr.LJIL = j;
        }
        C47456Ijs c47456Ijs = new C47456Ijs();
        c47456Ijs.LIZ = request.header("Vpwp-Raw-Key");
        c47456Ijs.LIZLLL = request.url().LJIIIIZZ;
        try {
            if (request.header("local_url_index") != null) {
                c47456Ijs.LJIIL = CastIntegerProtector.valueOf(request.header("local_url_index")).intValue();
            }
            if (request.header("local_url_count") != null) {
                c47456Ijs.LJIILIIL = CastIntegerProtector.valueOf(request.header("local_url_count")).intValue();
            }
        } catch (Exception unused) {
        }
        Long valueOf = Long.valueOf(j);
        newBuilder.getClass();
        newBuilder.LJI(Object.class, valueOf);
        if (!C47455Ijr.LJJIII) {
            newBuilder.LJFF("Vpwp-Raw-Key");
        }
        newBuilder.LJFF("local_url_index");
        newBuilder.LJFF("local_url_count");
        ((ConcurrentHashMap) C48103IuJ.LIZIZ).put(Long.valueOf(j), c47456Ijs);
        Request LIZIZ = newBuilder.LIZIZ();
        try {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C64598PWw LIZ = ((PW8) pxz).LIZ(LIZIZ);
                c47456Ijs.LJIIIIZZ = SystemClock.elapsedRealtime() - elapsedRealtime;
                c47456Ijs.LJIIJJI = LIZ.LJLJI;
                try {
                    c47456Ijs.LJIIIZ = Integer.parseInt(LIZ.LIZ("Content-Length", CardStruct.IStatusCode.DEFAULT));
                } catch (Exception unused2) {
                    c47456Ijs.LJIIIZ = 0;
                }
                try {
                    HashMap hashMap = new HashMap();
                    c47456Ijs.LJIIJ = hashMap;
                    hashMap.put("X-Cache", LIZ.LIZ("X-Cache", null));
                    ((HashMap) c47456Ijs.LJIIJ).put("X-M-Cache", LIZ.LIZ("X-M-Cache", null));
                    ((HashMap) c47456Ijs.LJIIJ).put("X-Cache-Remote", LIZ.LIZ("X-Cache-Remote", null));
                    ((HashMap) c47456Ijs.LJIIJ).put("Server-Timing", C48103IuJ.LIZIZ(LIZ.LJLJJLL));
                } catch (Exception unused3) {
                    c47456Ijs.LJIIJ = null;
                }
                return LIZ;
            } finally {
                ((ConcurrentHashMap) C48103IuJ.LIZIZ).remove(LIZIZ.tag());
                Pair pair = (Pair) ((ConcurrentHashMap) C48103IuJ.LIZJ).remove(LIZIZ.tag());
                if (pair != null) {
                    c47456Ijs.LIZIZ = (String) pair.first;
                    Object obj = pair.second;
                    if (obj != null) {
                        c47456Ijs.LIZJ = obj.toString();
                    }
                }
                C48100IuG.LJIIIIZZ(new ARunnableS44S0100000_8(c47456Ijs, 176));
            }
        } catch (IOException e) {
            if ((e instanceof SocketTimeoutException) || (e instanceof ConnectException)) {
                c47456Ijs.LJIIJJI = -104;
            } else {
                c47456Ijs.LJIIJJI = -10000;
            }
            throw e;
        }
    }
}
