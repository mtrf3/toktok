package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.aar, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94057aar extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final java.util.Map<Class<?>, AbstractC93422aQc<?, ?>> LJLIL = new LinkedHashMap();
    public final List<Class<?>> LJLILLLLZI = new ArrayList();
    public List<? extends Object> LJLJI = C61878OQg.INSTANCE;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.size();
    }

    public final AbstractC93422aQc<?, ?> LJLLLLLL(Class<?> cls) {
        for (Map.Entry entry : ((LinkedHashMap) this.LJLIL).entrySet()) {
            if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                return (AbstractC93422aQc) entry.getValue();
            }
        }
        return null;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        int i2 = 0;
        for (Class<?> cls : this.LJLILLLLZI) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (cls.isAssignableFrom(ListProtector.get(this.LJLJI, i).getClass())) {
                    return i2;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        AbstractC93422aQc<?, ?> LJLLLLLL = LJLLLLLL(ListProtector.get(this.LJLJI, i).getClass());
        if (!(LJLLLLLL instanceof AbstractC93422aQc) || LJLLLLLL == null) {
            return;
        }
        Object obj = ListProtector.get(this.LJLJI, i);
        LJLLLLLL.LIZ(holder, obj);
        InterfaceC88473Ynt<? super Integer, ? super Object, ? super Object, C76800UCe> interfaceC88473Ynt = LJLLLLLL.LIZ;
        if (interfaceC88473Ynt == null) {
            return;
        }
        interfaceC88473Ynt.invoke(Integer.valueOf(i), obj, holder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (r2 != 0) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.lang.String r4 = "onCreateViewHolder getParent() != null crash hook, holder "
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            if (r7 < 0) goto L13
            java.util.List<java.lang.Class<?>> r0 = r5.LJLILLLLZI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r7 < r0) goto L40
        L13:
            X.aaq r2 = new X.aaq
            android.view.View r1 = new android.view.View
            android.content.Context r0 = r6.getContext()
            r1.<init>(r0)
            r2.<init>(r1)
        L21:
            android.view.View r3 = r2.itemView
            int r0 = r6.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131378228(0x7f0a4034, float:1.8376683E38)
            r3.setTag(r0, r1)
            android.view.View r3 = r2.itemView
            if (r3 == 0) goto L67
            r1 = 2131364775(0x7f0a0ba7, float:1.8349397E38)
            androidx.fragment.app.Fragment r0 = X.C79234V7u.LJIIIZ(r6)
            r3.setTag(r1, r0)
            goto L67
        L40:
            java.util.List<java.lang.Class<?>> r0 = r5.LJLILLLLZI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            java.lang.Class r0 = (java.lang.Class) r0
            X.aQc r1 = r5.LJLLLLLL(r0)
            if (r1 == 0) goto L58
            r0 = r6
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.LIZIZ(r0)
            if (r2 == 0) goto L58
            goto L21
        L58:
            X.aaq r2 = new X.aaq
            android.view.View r1 = new android.view.View
            android.content.Context r0 = r6.getContext()
            r1.<init>(r0)
            r2.<init>(r1)
            goto L21
        L67:
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lbe
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> Lbe
            if (r0 == 0) goto Lc5
            r3 = 1
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = "catch_onCreateViewHolder_crash"
            r1.getClass()     // Catch: java.lang.Exception -> L7d
            boolean r3 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r3)     // Catch: java.lang.Exception -> L7d
        L7d:
            if (r3 == 0) goto Lc5
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> Lbe
            r1.<init>(r4)     // Catch: java.lang.Exception -> Lbe
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lbe
            r1.append(r0)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = " parent "
            r1.append(r0)     // Catch: java.lang.Exception -> Lbe
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lbe
            r1.append(r0)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = " viewType "
            r1.append(r0)     // Catch: java.lang.Exception -> Lbe
            r1.append(r7)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lbe
            X.C78983UzD.LJIILL(r0)     // Catch: java.lang.Exception -> Lbe
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lbe
            android.view.ViewParent r1 = r0.getParent()     // Catch: java.lang.Exception -> Lbe
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Exception -> Lbe
            if (r1 == 0) goto Lc5
            android.view.View r0 = r2.itemView     // Catch: java.lang.Exception -> Lbe
            X.C16880lQ.LJLLL(r0, r1)     // Catch: java.lang.Exception -> Lbe
            goto Lc5
        Lbe:
            r0 = move-exception
            X.C78946Uyc.LIZIZ(r0)
            X.C36922EeM.LIZ(r0)
        Lc5:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            X.C29127Bbv.LIZ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94057aar.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
