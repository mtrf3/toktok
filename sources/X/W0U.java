package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS438S0100000_14;

/* loaded from: classes15.dex */
public final class W0U implements InterfaceC81593W0n {
    public static final /* synthetic */ int LIZLLL = 0;
    public final List<InterfaceC88473Ynt<Effect, ExtraParams, Gson, InterfaceC81592W0m>> LIZ;
    public W0N LIZIZ;
    public final InterfaceC65784Pro<Gson> LIZJ;

    public W0U(C77877UhN c77877UhN) {
        this.LIZJ = c77877UhN;
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.add(new IDqS438S0100000_14(this, 1));
        arrayList.add(new IDqS438S0100000_14(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // X.InterfaceC81593W0n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC81592W0m LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L8
            X.W0q r0 = new X.W0q
            r0.<init>()
            return r0
        L8:
            X.Pro<com.google.gson.Gson> r0 = r4.LIZJ
            java.lang.Object r3 = r0.invoke()
            com.google.gson.Gson r3 = (com.google.gson.Gson) r3
            java.lang.String r2 = r5.getExtra()
            if (r2 == 0) goto L1c
            int r0 = r2.length()
            if (r0 != 0) goto L51
        L1c:
            r0 = 1
        L1d:
            r1 = 0
            if (r0 == 0) goto L48
        L20:
            r0 = r1
        L21:
            java.util.List<X.Ynt<com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams, com.google.gson.Gson, X.W0m>> r1 = r4.LIZ
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r2 = r1.iterator()
        L29:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            X.Ynt r1 = (X.InterfaceC88473Ynt) r1
            java.lang.Object r1 = r1.invoke(r5, r0, r3)
            X.W0m r1 = (X.InterfaceC81592W0m) r1
            if (r1 == 0) goto L29
        L3d:
            return r1
        L3e:
            X.W0d r1 = new X.W0d
            X.W0c r0 = X.C60903NvH.LJI(r5)
            r1.<init>(r0)
            goto L3d
        L48:
            java.lang.Class<com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams> r0 = com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams.class
            java.lang.Object r0 = r3.LJI(r2, r0)     // Catch: java.lang.Exception -> L20
            com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams r0 = (com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams) r0     // Catch: java.lang.Exception -> L20
            goto L21
        L51:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0U.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect):X.W0m");
    }

    @Override // X.InterfaceC81593W0n
    public final InterfaceC81592W0m LIZ(Effect effect, W10 w10, C81603W0x c81603W0x) {
        return new C81596W0q();
    }
}
