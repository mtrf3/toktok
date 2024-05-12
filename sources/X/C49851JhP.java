package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JhP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49851JhP {
    public final C49854JhS LIZ;
    public C49847JhL LIZIZ;
    public final InterfaceC88472Yns<C49851JhP, C76800UCe> LIZJ;
    public String LIZLLL;
    public final ArrayList<C49862Jha> LJ;
    public C49854JhS LJFF;

    public final void LIZ(C49849JhN contentItem, C49847JhL updatedRoot) {
        o.LJIIIZ(contentItem, "contentItem");
        o.LJIIIZ(updatedRoot, "updatedRoot");
        this.LJ.clear();
        this.LJFF = this.LIZ;
        this.LIZIZ = updatedRoot;
        this.LIZJ.invoke(this);
        String str = this.LIZLLL;
        o.LJIIIZ(str, "<set-?>");
        contentItem.LJIIIIZZ = str;
        C49854JhS c49854JhS = this.LJFF;
        o.LJIIIZ(c49854JhS, "<set-?>");
        contentItem.LJIIIZ = c49854JhS;
        contentItem.LJIL();
        List<C49848JhM> list = contentItem.LJIIJ;
        o.LJII(list, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.search.algo.stream.InnerItem>");
        ArrayList arrayList = (ArrayList) list;
        arrayList.clear();
        Iterator<C49862Jha> it = this.LJ.iterator();
        C49848JhM c49848JhM = null;
        while (it.hasNext()) {
            C49862Jha next = it.next();
            next.getClass();
            C49848JhM c49848JhM2 = new C49848JhM(next.LIZJ, contentItem.LIZ, contentItem);
            if (c49848JhM != null) {
                c49848JhM.LIZLLL = c49848JhM2;
            }
            c49848JhM2.LJ = c49848JhM;
            arrayList.add(c49848JhM2);
            c49848JhM = c49848JhM2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49851JhP(C49854JhS defaultConfig, C49847JhL streamRoot, InterfaceC88472Yns<? super C49851JhP, C76800UCe> outDsl) {
        o.LJIIIZ(defaultConfig, "defaultConfig");
        o.LJIIIZ(streamRoot, "streamRoot");
        o.LJIIIZ(outDsl, "outDsl");
        this.LIZ = defaultConfig;
        this.LIZIZ = streamRoot;
        this.LIZJ = outDsl;
        this.LIZLLL = "";
        this.LJ = new ArrayList<>();
        this.LJFF = defaultConfig;
    }
}
