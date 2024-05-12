package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS34S0001000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class OJD implements Serializable {
    public static final OJH Companion = new OJH();
    public java.util.Set<? extends EnumC249289qO> LJLIL;
    public final Pattern nativePattern;

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        o.LJIIIIZZ(pattern, "nativePattern.pattern()");
        return new OJF(pattern, this.nativePattern.flags());
    }

    public final java.util.Set<EnumC249289qO> getOptions() {
        java.util.Set set = this.LJLIL;
        if (set == null) {
            int flags = this.nativePattern.flags();
            EnumSet fromInt$lambda$1 = EnumSet.allOf(EnumC249289qO.class);
            o.LJIIIIZZ(fromInt$lambda$1, "fromInt$lambda$1");
            ORS.LJJLIIIJLJLI(fromInt$lambda$1, new AqS34S0001000_10(flags, 5), false);
            java.util.Set<EnumC249289qO> unmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
            o.LJIIIIZZ(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
            this.LJLIL = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        o.LJIIIIZZ(pattern, "nativePattern.pattern()");
        return pattern;
    }

    public String toString() {
        String pattern = this.nativePattern.toString();
        o.LJIIIIZZ(pattern, "nativePattern.toString()");
        return pattern;
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OJD(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r3)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OJD.<init>(java.lang.String):void");
    }

    public final boolean containsMatchIn(CharSequence input) {
        o.LJIIIZ(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public final InterfaceC59973NgH matchEntire(CharSequence input) {
        o.LJIIIZ(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        o.LJIIIIZZ(matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            return null;
        }
        return new C61675OIl(matcher, input);
    }

    public final boolean matches(CharSequence input) {
        o.LJIIIZ(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public OJD(Pattern nativePattern) {
        o.LJIIIZ(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OJD(java.lang.String r5, java.util.Set<? extends X.EnumC249289qO> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.OJH r3 = X.OJD.Companion
            java.util.Iterator r2 = r6.iterator()
            r1 = 0
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            X.OJI r0 = (X.OJI) r0
            int r0 = r0.getValue()
            r1 = r1 | r0
            goto L11
        L23:
            r3.getClass()
            r0 = r1 & 2
            if (r0 == 0) goto L2c
            r1 = r1 | 64
        L2c:
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r5, r1)
            java.lang.String r0 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OJD.<init>(java.lang.String, java.util.Set):void");
    }

    public final InterfaceC59973NgH find(CharSequence input, int i) {
        o.LJIIIZ(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        o.LJIIIIZZ(matcher, "nativePattern.matcher(input)");
        if (!matcher.find(i)) {
            return null;
        }
        return new C61675OIl(matcher, input);
    }

    public final InterfaceC1039145z<InterfaceC59973NgH> findAll(CharSequence input, int i) {
        o.LJIIIZ(input, "input");
        if (i >= 0 && i <= input.length()) {
            OJG ojg = new OJG(this, input, i);
            OJE nextFunction = OJE.LJLIL;
            o.LJIIIZ(nextFunction, "nextFunction");
            return new OJL(ojg, nextFunction);
        }
        StringBuilder LJ = C7MY.LJ("Start index out of bounds: ", i, ", input length: ");
        LJ.append(input.length());
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
    }

    public final InterfaceC59973NgH matchAt(CharSequence input, int i) {
        o.LJIIIZ(input, "input");
        Matcher region = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i, input.length());
        if (region.lookingAt()) {
            return new C61675OIl(region, input);
        }
        return null;
    }

    public final boolean matchesAt(CharSequence input, int i) {
        o.LJIIIZ(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i, input.length()).lookingAt();
    }

    public final String replace(CharSequence input, InterfaceC88472Yns<? super InterfaceC59973NgH, ? extends CharSequence> transform) {
        o.LJIIIZ(input, "input");
        o.LJIIIZ(transform, "transform");
        int i = 0;
        InterfaceC59973NgH find$default = find$default(this, input, 0, 2, null);
        if (find$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, i, find$default.LIZIZ().getStart().intValue());
            sb.append(transform.invoke(find$default));
            i = find$default.LIZIZ().LJIIIIZZ().intValue() + 1;
            find$default = find$default.next();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(input, i, length);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public final String replaceFirst(CharSequence input, String replacement) {
        o.LJIIIZ(input, "input");
        o.LJIIIZ(replacement, "replacement");
        String replaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        o.LJIIIIZZ(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final List<String> split(CharSequence input, int i) {
        o.LJIIIZ(input, "input");
        s.LJLILLLLZI(i);
        Matcher matcher = this.nativePattern.matcher(input);
        if (i == 1 || !matcher.find()) {
            return C47261Igj.LJJIJ(input.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(input.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i4, input.length()).toString());
        return arrayList;
    }

    public final InterfaceC1039145z<String> splitToSequence(CharSequence input, int i) {
        o.LJIIIZ(input, "input");
        s.LJLILLLLZI(i);
        return new C37655EqB(new C37680Eqa(this, input, i, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OJD(java.lang.String r3, X.EnumC249289qO r4) {
        /*
            r2 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.OJH r0 = X.OJD.Companion
            int r1 = r4.getValue()
            r0.getClass()
            r0 = r1 & 2
            if (r0 == 0) goto L19
            r1 = r1 | 64
        L19:
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r3, r1)
            java.lang.String r0 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OJD.<init>(java.lang.String, X.9qO):void");
    }

    public final String replace(CharSequence input, String replacement) {
        o.LJIIIZ(input, "input");
        o.LJIIIZ(replacement, "replacement");
        String replaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        o.LJIIIIZZ(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public static /* synthetic */ InterfaceC59973NgH find$default(OJD ojd, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ojd.find(charSequence, i);
    }

    public static /* synthetic */ InterfaceC1039145z findAll$default(OJD ojd, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ojd.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(OJD ojd, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ojd.split(charSequence, i);
    }

    public static /* synthetic */ InterfaceC1039145z splitToSequence$default(OJD ojd, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ojd.splitToSequence(charSequence, i);
    }
}
