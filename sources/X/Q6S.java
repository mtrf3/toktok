package X;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class Q6S {
    public final WeakReference<Context> LIZ;
    public final AtomicReference<AnonymousClass003> LIZIZ = new AtomicReference<>();
    public final CountDownLatch LIZJ = new CountDownLatch(1);
    public Q6R LIZLLL;

    public Q6S(Context context) {
        this.LIZ = new WeakReference<>(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.008] */
    public final AnonymousClass004 LIZ(android.net.Uri... uriArr) {
        ?? arrayList;
        AnonymousClass008 anonymousClass008 = null;
        try {
            this.LIZJ.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Q6T.LIZIZ().LIZJ(4, "Interrupted while waiting for browser connection", null, new Object[0]);
            this.LIZJ.countDown();
        }
        AnonymousClass003 anonymousClass003 = this.LIZIZ.get();
        if (anonymousClass003 != null) {
            ?? LIZIZ = anonymousClass003.LIZIZ(null);
            if (LIZIZ == 0) {
                Q6T.LIZLLL("Failed to create custom tabs session through custom tabs client", new Object[0]);
            } else {
                if (uriArr.length > 0) {
                    if (uriArr.length <= 1) {
                        arrayList = Collections.emptyList();
                    } else {
                        arrayList = new ArrayList(uriArr.length - 1);
                        for (int i = 1; i < uriArr.length; i++) {
                            if (uriArr[i] == null) {
                                Q6T.LIZLLL("Null URI in possibleUris list - ignoring", new Object[0]);
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("android.support.customtabs.otherurls.URL", uriArr[i]);
                                arrayList.add(bundle);
                            }
                        }
                    }
                    LIZIZ.LIZ(uriArr[0], arrayList);
                }
                anonymousClass008 = LIZIZ;
            }
        }
        return new AnonymousClass004(anonymousClass008);
    }
}
