package X;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;

/* renamed from: X.OIl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61675OIl implements InterfaceC59973NgH {
    public final Matcher LIZ;
    public final CharSequence LIZIZ;
    public final C61674OIk LIZJ;
    public C61676OIm LIZLLL;

    @Override // X.InterfaceC59973NgH
    public final List<String> LIZ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new C61676OIm(this);
        }
        C61676OIm c61676OIm = this.LIZLLL;
        o.LJI(c61676OIm);
        return c61676OIm;
    }

    @Override // X.InterfaceC59973NgH
    public final C40517FvF LIZIZ() {
        Matcher matcher = this.LIZ;
        return C78842Uww.LJJ(matcher.start(), matcher.end());
    }

    @Override // X.InterfaceC59973NgH
    public final String getValue() {
        String group = this.LIZ.group();
        o.LJIIIIZZ(group, "matchResult.group()");
        return group;
    }

    @Override // X.InterfaceC59973NgH
    public final C61675OIl next() {
        int i;
        int end = this.LIZ.end();
        if (this.LIZ.end() == this.LIZ.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.LIZIZ.length()) {
            return null;
        }
        Matcher matcher = this.LIZ.pattern().matcher(this.LIZIZ);
        o.LJIIIIZZ(matcher, "matcher.pattern().matcher(input)");
        CharSequence charSequence = this.LIZIZ;
        if (!matcher.find(i2)) {
            return null;
        }
        return new C61675OIl(matcher, charSequence);
    }

    @Override // X.InterfaceC59973NgH
    public final C61674OIk getGroups() {
        return this.LIZJ;
    }

    public C61675OIl(Matcher matcher, CharSequence input) {
        o.LJIIIZ(input, "input");
        this.LIZ = matcher;
        this.LIZIZ = input;
        this.LIZJ = new C61674OIk(this);
    }
}
