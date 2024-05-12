package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138905ck {
    public final /* synthetic */ InterfaceC84497XEf LIZ;

    public C138905ck(InterfaceC84497XEf interfaceC84497XEf) {
        this.LIZ = interfaceC84497XEf;
    }

    public static final List<ReadTextEffectBean> LIZ(List<List<ReadTextEffectBean>> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "beans");
        ArrayList arrayList = new ArrayList();
        Iterator<List<ReadTextEffectBean>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C157816Hh c157816Hh = (C157816Hh) it2.next();
            Iterator it3 = LJ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (o.LJ(((C157816Hh) next).effect.getEffectId(), c157816Hh.effect.getEffectId())) {
                    if (next == null) {
                    }
                }
            }
            LJ.add(c157816Hh);
        }
        return LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC88472Yns<? super com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, java.lang.Boolean> r7, X.InterfaceC67352kd<? super java.util.List<java.util.List<com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C138915cl
            if (r0 == 0) goto L38
            r5 = r8
            X.5cl r5 = (X.C138915cl) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3e
            java.lang.Object r2 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            return r2
        L23:
            java.util.ArrayList r2 = X.C1JX.LJFF(r1)
            X.5cm r1 = new X.5cm
            r0 = 0
            r1.<init>(r6, r7, r2, r0)
            r5.LJLIL = r2
            r5.LJLJJI = r3
            java.lang.Object r0 = X.C48841JEv.LJI(r1, r5)
            if (r0 != r4) goto L22
            return r4
        L38:
            X.5cl r5 = new X.5cl
            r5.<init>(r6, r8)
            goto L12
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138905ck.LIZIZ(X.Yns, X.2kd):java.lang.Object");
    }
}
