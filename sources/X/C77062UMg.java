package X;

import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;

/* renamed from: X.UMg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77062UMg extends LayerSpecImpl {
    public C77062UMg(LayeredElementContext layeredElementContext) {
        super(layeredElementContext);
        UND und = new UND(R.id.hiz);
        int i = C12960f6.LJ;
        und.bindGroup(i);
        registerElement(und);
        MultiElementSpecImplKt.element(this, R.id.b4h);
        UND und2 = new UND(R.id.eq5);
        int i2 = C12960f6.LIZ;
        und2.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i2)));
        registerElement(und2);
        MultiElementSpecImplKt.element(this, R.id.hql);
        MultiElementSpecImplKt.element(this, R.id.epk);
        MultiElementSpecImplKt.element(this, R.id.aix);
        MultiElementSpecImplKt.element(this, R.id.h3c);
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.he7);
        int i3 = C77068UMm.LIZ;
        int i4 = C11110c7.LIZ;
        int i5 = C11110c7.LIZJ;
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZIZ), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl);
        C77068UMm.LIZ(this, R.id.a1r);
        GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.fvv);
        groupableElementSpecImpl2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        groupableElementSpecImpl2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl2);
        GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.fzm);
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl3);
        UND und3 = new UND(R.id.dno);
        und3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i4)));
        registerElement(und3);
        MultiElementSpecImplKt.element(this, R.id.gl4);
    }
}
