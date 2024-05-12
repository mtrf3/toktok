package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* renamed from: X.NkW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60236NkW {
    public static final ConcurrentHashMap<String, Pattern> LIZ = new ConcurrentHashMap<>();

    public static C60235NkV LIZ(String str, List prefixList) {
        o.LJIIJ(prefixList, "prefixList");
        C60235NkV c60235NkV = new C60235NkV();
        if (str == null || str.length() == 0) {
            return c60235NkV;
        }
        android.net.Uri parse = UriProtector.parse(str);
        o.LJFF(parse, "Uri.parse(uri)");
        String path = parse.getPath();
        if (path == null || path.length() == 0) {
            return c60235NkV;
        }
        try {
            Iterator it = prefixList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2.length() != 0) {
                    ConcurrentHashMap<String, Pattern> concurrentHashMap = LIZ;
                    Pattern pattern = concurrentHashMap.get(str2);
                    if (pattern == null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str2);
                        LIZ2.append("/(([^/]+)/([^?]*))");
                        pattern = PatternProtector.compile(X1D.LIZIZ(LIZ2));
                        o.LJFF(pattern, "pattern");
                        concurrentHashMap.put(str2, pattern);
                    }
                    Matcher matcher = pattern.matcher(path);
                    if (matcher.find() && matcher.groupCount() == 3) {
                        String channel = matcher.group(2);
                        String bundlePath = matcher.group(3);
                        if (channel != null && channel.length() > 0 && bundlePath != null && bundlePath.length() > 0) {
                            o.LJFF(channel, "channel");
                            c60235NkV.LJLIL = channel;
                            o.LJFF(bundlePath, "bundlePath");
                            c60235NkV.LJLILLLLZI = bundlePath;
                            c60235NkV.LJLJI = true;
                            return c60235NkV;
                        }
                    }
                    if (!c60235NkV.LJLJI) {
                        Matcher matcher2 = pattern.matcher(str);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String channel2 = matcher2.group(2);
                            String bundlePath2 = matcher2.group(3);
                            if (channel2 != null && channel2.length() > 0 && bundlePath2 != null && bundlePath2.length() > 0) {
                                o.LJFF(channel2, "channel");
                                c60235NkV.LJLIL = channel2;
                                o.LJFF(bundlePath2, "bundlePath");
                                c60235NkV.LJLILLLLZI = bundlePath2;
                                c60235NkV.LJLJI = true;
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return c60235NkV;
    }
}
