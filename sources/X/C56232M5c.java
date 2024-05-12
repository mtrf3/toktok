package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import defpackage.i0;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.M5c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56232M5c extends M61 {
    public C56232M5c() {
        super(false);
    }

    @Override // X.M61
    public final void LIZIZ(M5X m5x) {
        boolean z;
        String LJFF;
        List list;
        int i;
        List subList;
        android.net.Uri uri = m5x.LJLILLLLZI;
        if (C56243M5n.LIZIZ(uri.getScheme()) && C55878LwQ.LIZ()) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            if (lastPathSegment.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (DeeplinkPrefetchImpl.LIZLLL().LIZIZ(lastPathSegment)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(uri.getScheme());
                    LIZ.append("://");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    String host = uri.getHost();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('?');
                    String query = uri.getQuery();
                    if (query == null || query.length() == 0) {
                        LJFF = i0.LJFF("id=", lastPathSegment);
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(uri.getQuery());
                        LIZ3.append("&id=");
                        LIZ3.append(lastPathSegment);
                        LJFF = X1D.LIZIZ(LIZ3);
                    }
                    LIZ2.append(LJFF);
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    String path = uri.getPath();
                    String str = null;
                    if (path != null) {
                        list = s.LJLJJL(path, new String[]{"/"}, 0, 6);
                        if (list != null) {
                            i = list.size();
                            StringBuilder LIZ4 = X1D.LIZ();
                            if (list != null && (subList = list.subList(0, i - 1)) != null) {
                                str = ORZ.LLD(subList, "/", null, null, null, 62);
                            }
                            String LIZIZ3 = q.LIZIZ(LIZ4, str, '/', LIZ4);
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append(LIZIZ);
                            LIZ5.append(host);
                            LIZ5.append(LIZIZ3);
                            LIZ5.append(LIZIZ2);
                            android.net.Uri resultUri = UriProtector.parse(X1D.LIZIZ(LIZ5));
                            o.LJIIIIZZ(resultUri, "resultUri");
                            m5x.LJLJJI = resultUri;
                            return;
                        }
                    } else {
                        list = null;
                    }
                    i = 0;
                    StringBuilder LIZ42 = X1D.LIZ();
                    if (list != null) {
                        str = ORZ.LLD(subList, "/", null, null, null, 62);
                    }
                    String LIZIZ32 = q.LIZIZ(LIZ42, str, '/', LIZ42);
                    StringBuilder LIZ52 = X1D.LIZ();
                    LIZ52.append(LIZIZ);
                    LIZ52.append(host);
                    LIZ52.append(LIZIZ32);
                    LIZ52.append(LIZIZ2);
                    android.net.Uri resultUri2 = UriProtector.parse(X1D.LIZIZ(LIZ52));
                    o.LJIIIIZZ(resultUri2, "resultUri");
                    m5x.LJLJJI = resultUri2;
                    return;
                }
                android.net.Uri uri2 = m5x.LJLILLLLZI;
                o.LJIIIZ(uri2, "<set-?>");
                m5x.LJLJJI = uri2;
                return;
            }
            android.net.Uri uri3 = m5x.LJLILLLLZI;
            o.LJIIIZ(uri3, "<set-?>");
            m5x.LJLJJI = uri3;
        }
    }
}
