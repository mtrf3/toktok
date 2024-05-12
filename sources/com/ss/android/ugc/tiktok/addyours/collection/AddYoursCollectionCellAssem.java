package com.ss.android.ugc.tiktok.addyours.collection;

import X.C16880lQ;
import X.C214298b3;
import X.C219368jE;
import X.C219698jl;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8XO;
import X.C9BE;
import X.InterfaceC65350Pko;
import Y.IDCListenerS296S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class AddYoursCollectionCellAssem extends ReusedUISlotAssem<AddYoursCollectionCellAssem> implements C8XO<C219368jE> {
    public View LLFF;
    public SmartImageView LLFFF;
    public TuxTextView LLFII;
    public TuxTextView LLFZ;
    public View LLI;
    public final C214298b3 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.gm;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AddYoursCollectionCellAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursCollectionListVM.class);
        this.LLIFFJFJJ = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 759), C219698jl.INSTANCE, null);
        this.LLII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1417));
        this.LLIIII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1418));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 760));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r0 != null) goto L17;
     */
    @Override // X.C8XO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(X.C219368jE r8) {
        /*
            r7 = this;
            X.8jE r8 = (X.C219368jE) r8
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.bytedance.tux.input.TuxTextView r2 = r7.LLFII
            if (r2 != 0) goto L55
        Lb:
            com.bytedance.tux.input.TuxTextView r6 = r7.LLFZ
            r5 = 1
            if (r6 != 0) goto L36
        L10:
            com.bytedance.lighten.loader.SmartImageView r2 = r7.LLFFF
            if (r2 == 0) goto L35
            X.Ol8 r0 = r7.LLIIIILZ
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2.setImageDrawable(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.LJLJJI
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C78939UyV.LJ(r0)
            X.W5F r1 = X.W5U.LJII(r0)
            r1.LJJIIJ = r2
            r1.LIZLLL = r5
            X.8jk r0 = new X.8jk
            r0.<init>()
            r1.LJFF(r0)
        L35:
            return
        L36:
            android.view.View r0 = r7.Y3()
            android.content.res.Resources r4 = r0.getResources()
            long r0 = r8.LJLJJL
            int r3 = (int) r0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r1 = X.C77123UOp.LJJIIJ(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 2131689536(0x7f0f0040, float:1.900809E38)
            java.lang.String r0 = r4.getQuantityString(r0, r3, r2)
            r6.setText(r0)
            goto L10
        L55:
            X.8kA r1 = r8.LJLJLLL
            if (r1 == 0) goto L68
            boolean r0 = r8.LJLJLJ
            if (r0 == 0) goto L65
            java.lang.String r0 = r1.LJLJJI
        L5f:
            if (r0 == 0) goto L68
        L61:
            r2.setText(r0)
            goto Lb
        L65:
            java.lang.String r0 = r1.LJLJI
            goto L5f
        L68:
            java.lang.String r0 = r8.LJLJI
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem.F0(java.lang.Object):void");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C219368jE c219368jE) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = view.findViewById(R.id.bhv);
        this.LLFFF = (SmartImageView) view.findViewById(R.id.bhm);
        this.LLFII = (TuxTextView) view.findViewById(R.id.bhy);
        this.LLFZ = (TuxTextView) view.findViewById(R.id.bhz);
        this.LLI = view.findViewById(R.id.bhx);
        view.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 6));
        View view2 = this.LLFF;
        if (view2 != null) {
            C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 24, 42, 42), view2);
        }
        View view3 = this.LLI;
        if (view3 != null) {
            C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 25, 42, 42), view3);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C219368jE c219368jE) {
    }
}
