package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;

/* renamed from: X.Peg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64970Peg {
    public EnumC64973Pej LIZIZ;
    public String LIZJ;
    public C64999Pf9 LJI;
    public C1UD LJII;
    public String LIZ = "";
    public final LinkedHashMap<String, String> LIZLLL = new LinkedHashMap<>();
    public final LinkedHashMap<String, String> LJ = new LinkedHashMap<>();
    public final LinkedHashMap<String, String> LJFF = new LinkedHashMap<>();

    public final String LIZJ(String str) {
        String str2 = this.LIZ;
        if (str2 != null && (str2.startsWith("http://") || this.LIZ.startsWith("https://"))) {
            return this.LIZ;
        }
        return UriProtector.parse(str).buildUpon().encodedPath(this.LIZ).build().toString();
    }

    public final void LIZ(String str, String str2, boolean z) {
        if (str != null) {
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(C0ON.LIZJ("Unable to convert query parameter \"", str, "\" value to UTF-8: ", str2), e);
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                this.LJFF.put(str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("field param name must not be null.");
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        if (str != null) {
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(C0ON.LIZJ("Unable to convert query parameter \"", str, "\" value to UTF-8: ", str2), e);
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                this.LJ.put(str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Query param name must not be null.");
    }
}
