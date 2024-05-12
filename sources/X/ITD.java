package X;

import java.util.Collection;
import java.util.TreeMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ITD {
    public final C46648ISm LIZ;
    public final TreeMap<Double, String> LIZIZ = new TreeMap<>();

    public final JSONObject LIZIZ() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C46648ISm c46648ISm = this.LIZ;
        long j = c46648ISm.LJJI;
        long j2 = c46648ISm.LJJIFFI;
        long j3 = c46648ISm.LJJII;
        long j4 = c46648ISm.LJJIII;
        long j5 = c46648ISm.LJJIIJ;
        long j6 = c46648ISm.LJJIIJZLJL;
        long j7 = c46648ISm.LJJIIZ;
        if (j7 > 0 && j7 == j6) {
            LIZ(j, "tcp");
            LIZ(j7, "http");
            LIZ(j6, "open_input");
        } else {
            LIZ(j6, "open_input");
            LIZ(j, "tcp");
            LIZ(j7, "http");
        }
        LIZ(j5, "receive_ff");
        LIZ(j2, "decode_ff");
        LIZ(j3, "render_ff");
        Collection<String> values = this.LIZIZ.values();
        o.LJIIIIZZ(values, "actionSequences.values");
        if (!values.isEmpty()) {
            str = values.toString();
        } else {
            str = "[none]";
        }
        String str2 = (String) str.subSequence(1, str.length() - 1);
        if (values.size() >= 2) {
            i5 = 0;
            if (ujb.o.LJJJLIIL("open_input, tcp, http, receive_ff, decode_ff, render_ff", str2, false)) {
                if (j > 0 && j6 > 0) {
                    i = (int) (j - j6);
                } else {
                    i = -1;
                }
                if (j7 > 0 && j > 0) {
                    i5 = (int) (j7 - j);
                } else {
                    i5 = -1;
                }
                if (j5 > 0 && j7 > 0) {
                    i3 = (int) (j5 - j7);
                } else {
                    i3 = -1;
                }
                if (j2 > 0 && j5 > 0) {
                    i2 = (int) (j2 - j5);
                } else {
                    i2 = -1;
                }
                if (j3 > 0 && j2 > 0) {
                    i4 = (int) (j3 - j2);
                } else {
                    i4 = -1;
                }
            } else if (ujb.o.LJJJLIIL("tcp, open_input, http, receive_ff, decode_ff, render_ff", str2, false)) {
                if (j7 > 0 && j6 > 0) {
                    i5 = (int) (j7 - j6);
                } else {
                    i5 = -1;
                }
                if (j5 > 0 && j7 > 0) {
                    i3 = (int) (j5 - j7);
                } else {
                    i3 = -1;
                }
                if (j2 > 0 && j5 > 0) {
                    i2 = (int) (j2 - j5);
                } else {
                    i2 = -1;
                }
                if (j3 > 0 && j2 > 0) {
                    i4 = (int) (j3 - j2);
                    i = 0;
                }
                i = 0;
                i4 = -1;
            } else if (ujb.o.LJJJLIIL("tcp, http, open_input, receive_ff, decode_ff, render_ff", str2, false)) {
                if (j5 > 0 && j6 > 0) {
                    i3 = (int) (j5 - j6);
                } else {
                    i3 = -1;
                }
                if (j2 > 0 && j5 > 0) {
                    i2 = (int) (j2 - j5);
                } else {
                    i2 = -1;
                }
                if (j3 > 0 && j2 > 0) {
                    i4 = (int) (j3 - j2);
                    i = 0;
                }
                i = 0;
                i4 = -1;
            } else if (ujb.o.LJJJLIIL("open_input, receive_ff, tcp, http, decode_ff, render_ff", str2, false) || ujb.o.LJJJLIIL("open_input, receive_ff, decode_ff, tcp, http, render_ff", str2, false) || ujb.o.LJJJLIIL("open_input, receive_ff, decode_ff, render_ff, tcp, http", str2, false) || ujb.o.LJJJLIIL("open_input, receive_ff, tcp, decode_ff, http, render_ff", str2, false) || ujb.o.LJJJLIIL("open_input, receive_ff, decode_ff, tcp, render_ff, http", str2, false) || ujb.o.LJJJLIIL("open_input, receive_ff, tcp, decode_ff, render_ff, http", str2, false)) {
                if (j6 > 0 && j5 > 0) {
                    i3 = (int) (j5 - j6);
                } else {
                    i3 = -1;
                }
                if (j2 > 0 && j5 > 0) {
                    i2 = (int) (j2 - j5);
                } else {
                    i2 = -1;
                }
                if (j3 > 0 && j2 > 0) {
                    i4 = (int) (j3 - j2);
                    i = 0;
                }
                i = 0;
                i4 = -1;
            }
            if (j6 <= 0 && j4 > 0 && j4 >= j6) {
                i6 = (int) (j4 - j6);
            } else {
                i6 = -1;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_to_tcp_cnt", i);
            jSONObject.put("open_to_prepared", i6);
            jSONObject.put("tcp_cnt_to_http_res", i5);
            jSONObject.put("http_res_to_rev_ff", i3);
            jSONObject.put("rev_ff_to_decode_ff", i2);
            jSONObject.put("decode_ff_to_render_ff", i4);
            return jSONObject;
        }
        i = -1;
        i2 = -1;
        i3 = -1;
        i4 = -1;
        i5 = -1;
        if (j6 <= 0) {
        }
        i6 = -1;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("open_to_tcp_cnt", i);
        jSONObject2.put("open_to_prepared", i6);
        jSONObject2.put("tcp_cnt_to_http_res", i5);
        jSONObject2.put("http_res_to_rev_ff", i3);
        jSONObject2.put("rev_ff_to_decode_ff", i2);
        jSONObject2.put("decode_ff_to_render_ff", i4);
        return jSONObject2;
    }

    public ITD(C46648ISm c46648ISm) {
        this.LIZ = c46648ISm;
    }

    public final void LIZ(long j, String str) {
        if (j <= 0 || str.length() == 0) {
            return;
        }
        double d = j;
        while (this.LIZIZ.containsKey(Double.valueOf(d))) {
            d += 0.1d;
        }
        this.LIZIZ.put(Double.valueOf(d), str);
    }
}
