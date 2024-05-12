package X;

import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UMD extends LayerSpecImpl {
    public UMD(LayeredElementContext layeredElementContext) {
        super(layeredElementContext);
        MultiElementSpecImplKt.groupableElement(this, R.id.eq5, UME.LJLIL);
        MultiElementSpecImplKt.element(this, R.id.epk);
        MultiElementSpecImplKt.element(this, R.id.h3c);
        MultiElementSpecImplKt.groupableElement(this, R.id.hql, UMF.LJLIL);
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.he7);
        int i = C11110c7.LIZ;
        groupableElementSpecImpl.bindGroup(i);
        int i2 = UMB.LIZ;
        int i3 = C11110c7.LIZJ;
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZIZ), Integer.valueOf(i2), Integer.valueOf(i3)));
        registerElement(groupableElementSpecImpl);
        GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.fvv);
        groupableElementSpecImpl2.bindGroup(i);
        int i4 = C12960f6.LIZ;
        groupableElementSpecImpl2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
        registerElement(groupableElementSpecImpl2);
        GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.fzm);
        groupableElementSpecImpl3.bindGroup(i);
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3)));
        registerElement(groupableElementSpecImpl3);
        MultiElementSpecImplKt.groupableElement(this, R.id.dno, UMC.LJLIL);
    }
}
