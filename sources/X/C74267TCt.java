package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TCt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74267TCt extends C74266TCs {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r0.LLIIIL == true) goto L8;
     */
    @Override // X.AbstractC73295Spf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C73365Sqn<com.ss.android.ugc.effectmanager.effect.model.Effect> LJZL(android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.TE0 r0 = r3.LJLJJLL
            r2 = 0
            if (r0 == 0) goto L33
            X.TKR r0 = r0.LJLJLJ
            if (r0 == 0) goto L33
            boolean r0 = r0.LLIIIL
            r1 = 1
            if (r0 != r1) goto L33
        L13:
            r0 = 2131561163(0x7f0d0acb, float:1.8747719E38)
            if (r1 == 0) goto L2e
            android.view.View r2 = X.C28289B8j.LIZ(r4, r0, r4, r2)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.height = r0
        L23:
            java.lang.String r0 = "if (stickerListViewConfi…ent, false)\n            }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            X.TD5 r0 = new X.TD5
            r0.<init>(r2)
            return r0
        L2e:
            android.view.View r2 = X.C28289B8j.LIZ(r4, r0, r4, r2)
            goto L23
        L33:
            r1 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74267TCt.LJZL(android.view.ViewGroup):X.Sqn");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    @Override // X.AbstractC73295Spf
    public final Effect getItem(int i) {
        if (i == getItemCount() - 1) {
            return this.LJLJJI;
        }
        return super.getItem(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74267TCt(TEZ tez, TEF tagHandler, T4I<Effect> listViewModel, TE0 listViewConfigure, T44 t44, InterfaceC74265TCr interfaceC74265TCr, TEJ optionalDependency, EffectCategoryModel effectCategoryModel, int i) {
        super(tez, tagHandler, listViewModel, listViewConfigure, t44, interfaceC74265TCr, optionalDependency, effectCategoryModel, i);
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(listViewModel, "listViewModel");
        o.LJIIIZ(listViewConfigure, "listViewConfigure");
        o.LJIIIZ(optionalDependency, "optionalDependency");
    }
}
