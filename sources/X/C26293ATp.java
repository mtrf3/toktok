package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ATp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26293ATp extends C60094NiE {
    public final boolean LJLLILLLL = true;

    @Override // X.C60094NiE
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.C60094NiE, X.S1E
    public final S1E clone() {
        return new C26293ATp();
    }

    @Override // X.C60094NiE, X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.LEMON8_GENERAL_ANCHOR.getTYPE();
    }

    @Override // X.C60094NiE
    public final String LJJJJJL() {
        return C38943FQd.LIZ();
    }

    @Override // X.C60094NiE
    public final boolean LJJJJLI() {
        return this.LJLLILLLL;
    }

    @Override // X.C60094NiE, X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AnchorCommonStruct) next).getType() == type()) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC26289ATl.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        arrayList2.remove(anchorCommonStruct);
        LJJIJL(anchorCommonStruct);
        LJJ(anchorCommonStruct);
        this.LJLJJL = anchorCommonStruct;
        if (arrayList.size() == 1) {
            return EnumC26289ATl.DONE;
        }
        return EnumC26289ATl.PROCEED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1.length() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // X.HSS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(X.C72209SVp r5) {
        /*
            r4 = this;
            r3 = 0
            com.google.gson.o r0 = new com.google.gson.o     // Catch: java.lang.Exception -> L49
            r0.<init>()     // Catch: java.lang.Exception -> L49
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.LJLJJL     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.getExtra()     // Catch: java.lang.Exception -> L49
        Le:
            com.google.gson.j r0 = com.google.gson.o.LIZ(r0)     // Catch: java.lang.Exception -> L49
            com.google.gson.m r1 = r0.LJIIZILJ()     // Catch: java.lang.Exception -> L49
            java.lang.String r0 = "keyword"
            com.google.gson.j r2 = r1.LJJIJ(r0)     // Catch: java.lang.Exception -> L49
            goto L1f
        L1d:
            r0 = r3
            goto Le
        L1f:
            com.google.gson.Gson r1 = X.C27739Aud.LJFF()     // Catch: com.google.gson.s -> L40 java.lang.Exception -> L49
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.Pkc r0 = X.C65352Pkq.LIZLLL(r0)     // Catch: com.google.gson.s -> L40 java.lang.Exception -> L49
            java.lang.reflect.Type r0 = X.C65330PkU.LIZJ(r0)     // Catch: com.google.gson.s -> L40 java.lang.Exception -> L49
            java.lang.Object r1 = r1.LIZLLL(r2, r0)     // Catch: com.google.gson.s -> L40 java.lang.Exception -> L49
            boolean r0 = r1 instanceof java.lang.String     // Catch: com.google.gson.s -> L40 java.lang.Exception -> L49
            if (r0 != 0) goto L36
            r1 = r3
        L36:
            java.lang.String r1 = (java.lang.String) r1     // Catch: com.google.gson.s -> L40 java.lang.Exception -> L49
            if (r1 == 0) goto L40
            int r0 = r1.length()     // Catch: java.lang.Exception -> L49
            if (r0 != 0) goto L55
        L40:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.LJLJJL     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.getKeyword()     // Catch: java.lang.Exception -> L49
            goto L51
        L49:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r4.LJLJJL
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.getKeyword()
        L51:
            if (r1 != 0) goto L55
        L53:
            java.lang.String r1 = ""
        L55:
            r5.setTitle(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26293ATp.LJJJJ(X.SVp):void");
    }
}
