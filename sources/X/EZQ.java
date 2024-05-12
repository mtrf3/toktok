package X;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class EZQ {
    public final java.util.Map<String, List<String>> LIZ = new LinkedHashMap();
    public final String LIZIZ;

    public final String LIZLLL() {
        String encode;
        if (this.LIZ.isEmpty()) {
            return this.LIZIZ;
        }
        java.util.Map<String, List<String>> map = this.LIZ;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            try {
                String encode2 = URLEncoder.encode((String) entry.getKey(), "UTF-8");
                List<String> list = (List) entry.getValue();
                if (list != null && list.size() > 0) {
                    for (String str : list) {
                        if (str != null) {
                            try {
                                encode = URLEncoder.encode(str, "UTF-8");
                            } catch (UnsupportedEncodingException e) {
                                throw new IllegalArgumentException(e);
                            }
                        } else {
                            encode = "";
                        }
                        if (sb.length() > 0) {
                            sb.append("&");
                        }
                        sb.append(encode2);
                        if (!encode.isEmpty()) {
                            sb.append("=");
                            sb.append(encode);
                        }
                    }
                }
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        String sb2 = sb.toString();
        String str2 = this.LIZIZ;
        if (str2 == null || str2.length() == 0) {
            return sb2;
        }
        if (this.LIZIZ.indexOf(63) >= 0) {
            StringBuilder LIZ = X1D.LIZ();
            return C025908h.LIZIZ(LIZ, this.LIZIZ, "&", sb2, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C025908h.LIZIZ(LIZ2, this.LIZIZ, "?", sb2, LIZ2);
    }

    public final String toString() {
        return LIZLLL();
    }

    public EZQ(String str) {
        this.LIZIZ = str;
    }

    public final void LIZ(int i, String str) {
        List<String> list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(i));
        this.LIZ.put(str, list);
    }

    public final void LIZIZ(String str, double d) {
        List<String> list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(d));
        this.LIZ.put(str, list);
    }

    public final void LIZJ(String str, String str2) {
        List<String> list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(str2));
        this.LIZ.put(str, list);
    }
}
