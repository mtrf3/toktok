package X;

import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GxI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43192GxI extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return false;
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "launch_on_mute";
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        try {
            IOpenOnMuteSpi LJIILL = OpenOnMuteImpl.LJIILL();
            String str = "[setting_state=" + LJIILL.LJIIJJI() + ",temp_state=" + LJIILL.LJFF() + "]";
            o.LJIIIIZZ(str, "sb.toString()");
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
