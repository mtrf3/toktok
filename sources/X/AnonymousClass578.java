package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.578, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass578 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<C57L> LJLIL = new ArrayList();
    public C53W LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r4 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.54S, X.57K] */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, final int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "viewHolder"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.53W r3 = r5.LJLILLLLZI
            r4 = 0
            if (r3 == 0) goto L24
            java.util.List<X.57L> r0 = r5.LJLIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.57L r0 = (X.C57L) r0
            java.lang.String r2 = r0.LJLIL
            java.util.List<X.57L> r0 = r5.LJLIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.57L r0 = (X.C57L) r0
            long r0 = r0.LJLILLLLZI
            android.graphics.Bitmap r4 = r3.LIZ(r0, r2)
            if (r4 != 0) goto L39
        L24:
            X.57K r1 = new X.57K
            r1.<init>()
            boolean r0 = r6 instanceof X.C1292155h
            if (r0 == 0) goto L32
            r0 = r6
            X.55h r0 = (X.C1292155h) r0
            if (r0 != 0) goto L7c
        L32:
            X.53W r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L39
            r0.LIZIZ(r1)
        L39:
            java.util.List<X.57L> r0 = r5.LJLIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.57L r0 = (X.C57L) r0
            float r1 = r0.LJLJI
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L6c
            int r3 = X.C57X.LIZIZ
        L4b:
            boolean r0 = r6 instanceof X.C1292155h
            if (r0 == 0) goto L62
            X.55h r6 = (X.C1292155h) r6
            if (r6 == 0) goto L62
            android.widget.ImageView r2 = r6.LJLIL
            if (r2 == 0) goto L62
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 != 0) goto L63
        L5d:
            if (r4 == 0) goto L62
            r2.setImageBitmap(r4)
        L62:
            return
        L63:
            r0 = -5
            if (r3 == r0) goto L68
            r1.width = r3
        L68:
            r2.setLayoutParams(r1)
            goto L5d
        L6c:
            int r0 = X.C57X.LIZIZ
            float r1 = (float) r0
            java.util.List<X.57L> r0 = r5.LJLIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            X.57L r0 = (X.C57L) r0
            float r0 = r0.LJLJI
            float r1 = r1 * r0
            int r3 = (int) r1
            goto L4b
        L7c:
            r0.LJLILLLLZI = r1
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass578.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.asm, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C1292155h c1292155h = new C1292155h(view);
        C0AX.LIZ(viewGroup, c1292155h.itemView, R.id.lj7);
        View view2 = c1292155h.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c1292155h.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1292155h.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1292155h.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c1292155h.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C1292155h.class.getName();
        return c1292155h;
    }
}
