package X;

import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215788dS extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends C215678dH>, C76800UCe> {
    public static final C215788dS LJLIL = new C215788dS();

    public C215788dS() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends C215678dH> c43i) {
        C215678dH c215678dH;
        C216678et c216678et;
        C216678et c216678et2;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        C43I<? extends C215678dH> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c215678dH = (C215678dH) c43i2.LIZ) != null) {
            int i = C215778dR.LIZ[c215678dH.LJLILLLLZI.LIZLLL.ordinal()];
            if (i != 1) {
                if (i == 2 && (c216678et2 = selectSubscribe.LLIIIILZ) != null) {
                    List LJFF = C79004UzY.LJFF(c215678dH.LJLILLLLZI);
                    C216298eH c216298eH = c216678et2.LIZJ;
                    c216298eH.getClass();
                    c216298eH.LIZ.addAll(LJFF);
                    c216678et2.LJFF();
                }
            } else {
                C216678et c216678et3 = selectSubscribe.LLIIIILZ;
                if (c216678et3 != null) {
                    List LJFF2 = C79004UzY.LJFF(c215678dH.LJLILLLLZI);
                    long j = c215678dH.LJLIL;
                    C216298eH c216298eH2 = c216678et3.LIZJ;
                    c216298eH2.getClass();
                    c216298eH2.LIZ.clear();
                    c216298eH2.LIZ.addAll(LJFF2);
                    if (j > 0) {
                        c216678et3.LIZJ.LIZIZ(j);
                    }
                }
                C215498cz c215498cz = selectSubscribe.r4().LJLL;
                if (c215498cz != null) {
                    c215498cz.LIZIZ = false;
                }
            }
            if (c215678dH.LJLILLLLZI.LIZLLL != EnumC215768dQ.NONE && (c216678et = selectSubscribe.LLIIIILZ) != null) {
                c216678et.LJFF();
            }
        }
        return C76800UCe.LIZ;
    }
}
