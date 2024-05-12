package X;

import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GxN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43197GxN extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "fyp_auto_scroll";
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        try {
            FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
            String str = "[isOpen=" + LJIIZILJ.LJII() + ",state=" + LJIIZILJ.LJIIIZ() + ",login=" + ((RBX) HG3.LJIILL()).isLogin() + "]";
            o.LJIIIIZZ(str, "{\n            val servic…  sb.toString()\n        }");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }
}
