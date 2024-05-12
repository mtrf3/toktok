package X;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OIk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61674OIk extends OQZ<C59258NNm> {
    public final /* synthetic */ C61675OIl LJLIL;

    @Override // X.OQZ, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLIL.LIZ.groupCount() + 1;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C59258NNm> iterator() {
        return new C110564Vo(OJ4.LJJJJLL(ORZ.LJLIIIL(C47261Igj.LJJ(this)), new AqS176S0100000_10(this, 244)));
    }

    public C61674OIk(C61675OIl c61675OIl) {
        this.LJLIL = c61675OIl;
    }

    public final C59258NNm LJII(int i) {
        Matcher matcher = this.LJLIL.LIZ;
        C40517FvF LJJ = C78842Uww.LJJ(matcher.start(i), matcher.end(i));
        if (LJJ.getStart().intValue() >= 0) {
            String group = this.LJLIL.LIZ.group(i);
            o.LJIIIIZZ(group, "matchResult.group(index)");
            return new C59258NNm(group, LJJ);
        }
        return null;
    }

    @Override // X.OQZ, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C59258NNm)) {
            return super.contains(obj);
        }
        return false;
    }
}
