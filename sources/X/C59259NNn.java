package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.NNn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59259NNn implements Serializable, Cloneable {
    public static final Pattern LJLIL = PatternProtector.compile("(\\d{2}):(\\d{2}):(\\d{2})(\\.(\\d{3}))?");
    public boolean byWrapper;
    public List<C59257NNl> clickList;
    public String duration;
    public List<C59256NNk> iconList;
    public String id;
    public List<C48132Ium> mediaFileList;
    public List<C59261NNp> trackingEventList;

    public long getDurationInMs() {
        if (C2060386t.LIZ(this.duration)) {
            return 0L;
        }
        Matcher matcher = LJLIL.matcher(this.duration);
        if (!matcher.matches()) {
            return 0L;
        }
        long millis = TimeUnit.SECONDS.toMillis(CastLongProtector.parseLong(matcher.group(3))) + TimeUnit.MINUTES.toMillis(CastLongProtector.parseLong(matcher.group(2))) + TimeUnit.HOURS.toMillis(CastLongProtector.parseLong(matcher.group(1))) + 0;
        String group = matcher.group(5);
        if (!C2060386t.LIZ(group)) {
            return millis + CastLongProtector.parseLong(group);
        }
        return millis;
    }
}
