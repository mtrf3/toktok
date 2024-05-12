package X;

import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;

/* renamed from: X.UMf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77061UMf extends LayerSpecImpl {
    public C77061UMf(LayeredElementContext layeredElementContext) {
        super(layeredElementContext);
        UNC unc = new UNC(R.id.hiz);
        int i = C12960f6.LJ;
        unc.bindGroup(i);
        registerElement(unc);
        MultiElementSpecImplKt.element(this, R.id.b4h);
        UNC unc2 = new UNC(R.id.eq5);
        int i2 = C12960f6.LIZ;
        unc2.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i2)));
        registerElement(unc2);
        MultiElementSpecImplKt.element(this, R.id.hql);
        MultiElementSpecImplKt.element(this, R.id.epk);
        MultiElementSpecImplKt.element(this, R.id.aix);
        MultiElementSpecImplKt.element(this, R.id.h3c);
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.he7);
        int i3 = C77067UMl.LIZ;
        int i4 = C11110c7.LIZ;
        int i5 = C11110c7.LIZJ;
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZIZ), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl);
        C77067UMl.LIZ(this, R.id.a1r);
        GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.fvv);
        groupableElementSpecImpl2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        groupableElementSpecImpl2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl2);
        GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.fzm);
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl3);
        UNC unc3 = new UNC(R.id.dno);
        unc3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i4)));
        registerElement(unc3);
        MultiElementSpecImplKt.element(this, R.id.gl4);
    }
}
