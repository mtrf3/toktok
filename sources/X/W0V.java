package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS438S0100000_14;

/* loaded from: classes15.dex */
public final class W0V implements InterfaceC81593W0n {
    public static final /* synthetic */ int LJFF = 0;
    public final InterfaceC65784Pro<Gson> LIZ;
    public final C82622Wbi LIZIZ;
    public final List<InterfaceC88473Ynt<Effect, ExtraParams, Gson, InterfaceC81592W0m>> LIZJ;
    public final List<InterfaceC88473Ynt<Effect, ExtraParams, Gson, InterfaceC81592W0m>> LIZLLL;
    public W0O LJ;

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    @Override // X.InterfaceC81593W0n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC81592W0m LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L8
            X.W0q r0 = new X.W0q
            r0.<init>()
            return r0
        L8:
            X.Pro<com.google.gson.Gson> r0 = r5.LIZ
            java.lang.Object r4 = r0.invoke()
            com.google.gson.Gson r4 = (com.google.gson.Gson) r4
            java.lang.String r1 = r6.getExtra()
            r3 = 1
            if (r1 == 0) goto L1d
            int r0 = r1.length()
            if (r0 != 0) goto L5a
        L1d:
            r0 = 1
        L1e:
            r2 = 0
            if (r0 == 0) goto L47
        L21:
            r1 = r2
        L22:
            java.util.List<X.Ynt<com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams, com.google.gson.Gson, X.W0m>> r0 = r5.LIZJ
        L24:
            java.util.Iterator r3 = r0.iterator()
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r3.next()
            X.Ynt r0 = (X.InterfaceC88473Ynt) r0
            java.lang.Object r2 = r0.invoke(r6, r1, r4)
            X.W0m r2 = (X.InterfaceC81592W0m) r2
            if (r2 == 0) goto L28
        L3c:
            return r2
        L3d:
            X.W0d r2 = new X.W0d
            X.W0c r0 = X.C60903NvH.LJI(r6)
            r2.<init>(r0)
            goto L3c
        L47:
            java.lang.Class<com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams> r0 = com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams.class
            java.lang.Object r1 = r4.LJI(r1, r0)     // Catch: java.lang.Exception -> L21
            com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams r1 = (com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams) r1     // Catch: java.lang.Exception -> L21
            if (r1 == 0) goto L22
            boolean r0 = r1.enableNewPrompt()
            if (r3 != r0) goto L22
            java.util.List<X.Ynt<com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams, com.google.gson.Gson, X.W0m>> r0 = r5.LIZLLL
            goto L24
        L5a:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0V.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect):X.W0m");
    }

    public W0V(W0X w0x, C82622Wbi c82622Wbi) {
        this.LIZ = w0x;
        this.LIZIZ = c82622Wbi;
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LIZLLL = arrayList2;
        arrayList.add(new IDqS438S0100000_14(this, 7));
        arrayList.add(new IDqS438S0100000_14(this, 8));
        arrayList2.add(new IDqS438S0100000_14(this, 9));
        arrayList2.add(new IDqS438S0100000_14(this, 10));
    }

    @Override // X.InterfaceC81593W0n
    public final InterfaceC81592W0m LIZ(Effect effect, W10 w10, C81603W0x c81603W0x) {
        return new C81596W0q();
    }
}
