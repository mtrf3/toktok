package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.30n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C770130n {
    static {
        C16880lQ.LJLLJ(C770130n.class);
    }

    public static boolean LIZ(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            if (charArray.length > 0 && charArray.length <= 255) {
                for (char c : charArray) {
                    if (c >= 'A') {
                        if (c <= 'Z') {
                            continue;
                        } else if (c >= 'a') {
                            if (c > 'z') {
                                return false;
                            }
                        }
                    }
                    if (c >= '0') {
                        if (c > '9') {
                            return false;
                        }
                    } else {
                        if (c != '.' && c != '-') {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ(List<String> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i < ((ArrayList) list).size()) {
                sb.append((String) ListProtector.get(list, i));
                if (i != r1.size() - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
