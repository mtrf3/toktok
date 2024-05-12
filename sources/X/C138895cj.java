package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.5cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138895cj {
    public final InterfaceC139755e7 LIZ;
    public final String LIZIZ;

    public C138895cj(CreativeInfo creativeInfo, InterfaceC139755e7 interfaceC139755e7) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LIZ = interfaceC139755e7;
        this.LIZIZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJJIZL(creativeInfo);
    }

    public static C73454SsE LIZ(final C138895cj c138895cj, final String originFilePath, final boolean z, String str, boolean z2, boolean z3, int i) {
        final String compressDir;
        final boolean z4 = z3;
        final String srcFilePath = str;
        final boolean z5 = z2;
        if ((i & 4) != 0) {
            compressDir = c138895cj.LIZIZ;
        } else {
            compressDir = null;
        }
        if ((i & 8) != 0) {
            srcFilePath = "";
        }
        if ((i & 16) != 0) {
            z5 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        o.LJIIIZ(originFilePath, "originFilePath");
        o.LJIIIZ(compressDir, "compressDir");
        o.LJIIIZ(srcFilePath, "srcFilePath");
        return AbstractC73672Svk.LJJIIJZLJL(new Callable() { // from class: X.6ef
            /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
            
                if (r19 == false) goto L31;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 345
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC165576ef.call():java.lang.Object");
            }
        }).LJJJ(T16.LIZ());
    }
}
