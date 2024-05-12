package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.ErP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37731ErP {
    public volatile List<C37732ErQ> LIZ;

    public final String LIZ(android.net.Uri uri) {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = new ArrayList();
                    throw null;
                }
            }
        }
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (true) {
            try {
            } catch (Exception e) {
                e.toString();
                C78949Uyf.LJIJJ("AddressParam");
            }
            if (it.hasNext()) {
                C37732ErQ c37732ErQ = (C37732ErQ) it.next();
                if (c37732ErQ.LIZ == null) {
                    c37732ErQ.LIZ = PatternProtector.compile(null);
                }
                Matcher matcher = c37732ErQ.LIZ.matcher(uri.toString());
                while (matcher.find()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("match str = ");
                    LIZ.append(matcher.group());
                    LIZ.append(" matcher.start() ");
                    LIZ.append(matcher.start());
                    X1D.LIZIZ(LIZ);
                    C78949Uyf.LJIJJ("AddressParam");
                    if (matcher.start() == 0) {
                        return null;
                    }
                }
            } else if (!it.hasNext()) {
                return null;
            }
        }
    }
}
