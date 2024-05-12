package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KUE implements AttachUserData {
    public static final KUF<Object> LIZ;
    public static final KUF<KUB> LIZIZ;

    static {
        new KUD();
        LIZ = new KUF<>(200);
        LIZIZ = new KUF<>(10);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (KUH.LIZ) {
                KUF<Object> kuf = LIZ;
                if (kuf.LIZIZ.size() != 0) {
                    KUG<KUB> kug = LIZIZ.LIZLLL.LIZLLL;
                    if (kug != null) {
                        Npth.addTag("online_feed_last_scene", kug.LIZ);
                        KUB kub = kug.LIZIZ;
                        if (kub != null) {
                            String[] strArr = (String[]) kub.LJFF.getValue();
                            if (strArr != null) {
                                str = strArr[strArr.length - 1];
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                Npth.addTag("online_feed_last_aid", str);
                            }
                            String str2 = kub.LJ;
                            if (str2 != null) {
                                Npth.addTag("online_feed_last_bind_aid", str2);
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator<KUG<Object>> it = kuf.LIZ(kuf.LIZIZ.size()).iterator();
                    while (it.hasNext()) {
                        KUG<Object> next = it.next();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(next.LIZ);
                        LIZ2.append(':');
                        LIZ2.append(next.LIZIZ);
                        LIZ2.append(" \n");
                        sb.append(X1D.LIZIZ(LIZ2));
                    }
                    KUF<KUB> kuf2 = LIZIZ;
                    Iterator<KUG<KUB>> it2 = kuf2.LIZ(kuf2.LIZIZ.size()).iterator();
                    while (it2.hasNext()) {
                        KUG<KUB> next2 = it2.next();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(next2.LIZ);
                        LIZ3.append(':');
                        LIZ3.append(next2.LIZIZ);
                        LIZ3.append(" \n");
                        sb.append(X1D.LIZIZ(LIZ3));
                    }
                    String sb2 = sb.toString();
                    o.LJIIIIZZ(sb2, "stringBuilder.toString()");
                    linkedHashMap.put("Feed_Component_Core_Data", sb2);
                }
            }
        } catch (Exception unused) {
            C60392Yp.LIZ("LComponent", "FeedComponentLogData >>>getUserData error", 12);
        }
        return linkedHashMap;
    }
}
