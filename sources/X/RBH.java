package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class RBH {
    public static final Pattern LIZ = PatternProtector.compile(".*[A-Za-z].*");
    public static final Pattern LIZIZ = PatternProtector.compile(".*[\\d].*");
    public static final Pattern LIZJ = PatternProtector.compile(".*[_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\].*");
}
