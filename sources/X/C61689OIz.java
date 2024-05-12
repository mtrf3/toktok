package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OIz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61689OIz {
    public final Object LIZ;

    public /* synthetic */ C61689OIz(C68244QqO c68244QqO) {
        this.LIZ = c68244QqO;
    }

    public C61689OIz() {
        this.LIZ = C113554cx.LJJLIIIIJ(new OSZ("add", new C61682OIs()), new OSZ("array", new C61684OIu()), new OSZ("getProperty", new C61678OIo()), new OSZ("lowcase", new C61680OIq()), new OSZ("upcase", new C61679OIp()), new OSZ("is_start_with", new OJ2()), new OSZ("is_end_with", new OJ0()), new OSZ("is_equal_with", new OJ1()), new OSZ("is_contains_with", new C61688OIy()), new OSZ("is_match_with", new C61687OIx()), new OSZ("is_empty", new C61683OIt()), new OSZ("is_sample_rate", new C61681OIr()), new OSZ("search", new C61677OIn()));
    }

    public final PQ5 LIZ(String symbol) {
        o.LJIIJ(symbol, "symbol");
        return (PQ5) ((java.util.Map) this.LIZ).get(symbol);
    }

    public final void LIZIZ(int i, String str, boolean z, boolean z2, List list) {
        C67281Qar c67281Qar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJIIJJI;
                    } else if (z) {
                        c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJIIIZ;
                    } else if (!z2) {
                        c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJIIJ;
                    } else {
                        c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJIIIIZZ;
                    }
                } else {
                    c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJIILIIL;
                }
            } else if (z) {
                c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJI;
            } else if (!z2) {
                c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJII;
            } else {
                c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJFF;
            }
        } else {
            c67281Qar = ((C68048QnE) this.LIZ).LIZ.LIZJ().LJIIL;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    c67281Qar.LIZ(str);
                    return;
                } else {
                    c67281Qar.LIZLLL(ListProtector.get(list, 0), ListProtector.get(list, 1), ListProtector.get(list, 2), str);
                    return;
                }
            }
            c67281Qar.LIZJ(ListProtector.get(list, 0), ListProtector.get(list, 1), str);
            return;
        }
        c67281Qar.LIZIZ(ListProtector.get(list, 0), str);
    }
}
