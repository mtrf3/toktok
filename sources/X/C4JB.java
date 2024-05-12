package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4JB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JB extends AbstractC65781Prl implements InterfaceC65784Pro<C4JC> {
    public static final C4JB LJLIL = new C4JB();

    public C4JB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4JC] */
    @Override // X.InterfaceC65784Pro
    public final C4JC invoke() {
        return new C8HS<C4JA>() { // from class: X.4JC
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
            
                if (X.C76800UCe.LIZ == null) goto L24;
             */
            @Override // X.C4II
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
                /*
                    r11 = this;
                    boolean r0 = r12 instanceof X.C4JD
                    if (r0 == 0) goto L8c
                    if (r12 == 0) goto L8c
                    java.util.List<T> r0 = r11.mmItems
                    if (r0 == 0) goto L8c
                    java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r13)
                    X.4JA r4 = (X.C4JA) r4
                    if (r4 == 0) goto L8c
                    r8 = 0
                    if (r13 != 0) goto L2d
                    android.view.View r1 = r12.itemView
                    r0 = 2131367152(0x7f0a14f0, float:1.8354218E38)
                    android.view.View r0 = r1.findViewById(r0)
                    android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                    boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
                    if (r0 == 0) goto L2d
                    android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
                    if (r1 == 0) goto L2d
                    X.C16530kr.LJII(r1, r8)
                L2d:
                    int r0 = r4.LIZIZ
                    r2 = 2131380174(0x7f0a47ce, float:1.838063E38)
                    r3 = 2131364245(0x7f0a0995, float:1.8348322E38)
                    if (r0 <= 0) goto L8d
                    android.view.View r0 = r12.itemView
                    android.view.View r1 = r0.findViewById(r3)
                    X.4Vt r3 = new X.4Vt
                    r3.<init>()
                    r0 = 2130968605(0x7f04001d, float:1.7545868E38)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r3.LIZIZ = r0
                    r0 = 20
                    float r0 = X.C1DF.LJIIIIZZ(r0)
                    java.lang.Float r0 = java.lang.Float.valueOf(r0)
                    r3.LIZJ = r0
                    android.content.Context r1 = r1.getContext()
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                    r3.LIZ(r1)
                    X.4i4 r3 = new X.4i4
                    r3.<init>()
                    java.lang.String r0 = "+"
                    r3.LJ(r0)
                    int r0 = r4.LIZIZ
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r3.LIZIZ(r0)
                    android.view.View r0 = r12.itemView
                    android.view.View r1 = r0.findViewById(r2)
                    android.widget.TextView r1 = (android.widget.TextView) r1
                    X.4i3 r0 = r3.LIZ
                    r1.setText(r0)
                    android.view.View r0 = r12.itemView
                    android.view.View r0 = r0.findViewById(r2)
                    r0.setVisibility(r8)
                L8c:
                    return
                L8d:
                    com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.LIZ
                    r1 = 2131232668(0x7f08079c, float:1.8081452E38)
                    if (r4 == 0) goto Lc0
                    com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.getDisplayAvatar()
                    com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r0)
                    X.W5F r5 = X.W5U.LJII(r0)
                    android.view.View r0 = r12.itemView
                    android.view.View r0 = r0.findViewById(r3)
                    com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
                    r5.LJJIIJ = r0
                    r5.LJIILL = r1
                    X.Ob1 r0 = X.EnumC62195Ob1.SMALL
                    r5.LJJIII = r0
                    java.lang.String r6 = "GroupGreetingsViewHolder"
                    java.lang.String r7 = r4.getUid()
                    r9 = 0
                    r10 = 28
                    X.C43659HBn.LJIIZILJ(r5, r6, r7, r8, r9, r10)
                    X.UCe r0 = X.C76800UCe.LIZ
                    if (r0 != 0) goto Ld1
                Lc0:
                    X.W5F r1 = X.W5U.LJ(r1)
                    android.view.View r0 = r12.itemView
                    android.view.View r0 = r0.findViewById(r3)
                    com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
                    r1.LJJIIJ = r0
                    X.C16880lQ.LLJJJ(r1)
                Ld1:
                    android.view.View r0 = r12.itemView
                    android.view.View r1 = r0.findViewById(r2)
                    r0 = 8
                    r1.setVisibility(r0)
                    goto L8c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4JC.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }

            @Override // X.C4II
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(final ViewGroup parent, int i) {
                o.LJIIIZ(parent, "parent");
                return new RecyclerView.ViewHolder(parent) { // from class: X.4JD
                    {
                        super(C06490Nh.LIZIZ(parent, "parent", R.layout.b3y, parent, false));
                    }
                };
            }
        };
    }
}
