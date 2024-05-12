package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public final class UMJ extends LayerSpecImpl {
    public UMJ(C1O4 c1o4) {
        super(c1o4);
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.jna);
        List<Integer> list = C11110c7.LJIIIIZZ;
        groupableElementSpecImpl.bindGroups(list);
        int i = UMB.LIZ;
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl);
        C51311zr c51311zr = new C51311zr();
        int i2 = C11110c7.LIZ;
        int i3 = C11110c7.LIZLLL;
        c51311zr.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZ), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(C11110c7.LIZJ)));
        registerElement(c51311zr);
        MultiElementSpecImplKt.groupableElement(this, R.id.j6m, UMN.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.e2q, UMH.LJLIL);
        GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.lfv);
        groupableElementSpecImpl2.bindGroups(list);
        groupableElementSpecImpl2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i)));
        ElementSpecImplKt.onAttach(groupableElementSpecImpl2, C77052ULw.LJLIL);
        registerElement(groupableElementSpecImpl2);
        GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.nji);
        groupableElementSpecImpl3.bindGroups(list);
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl3);
        GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.jz4);
        groupableElementSpecImpl4.bindGroups(list);
        groupableElementSpecImpl4.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        ElementSpecImplKt.onAttach(groupableElementSpecImpl4, C77054ULy.LJLIL);
        registerElement(groupableElementSpecImpl4);
        GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.lkh);
        groupableElementSpecImpl5.bindGroups(list);
        registerElement(groupableElementSpecImpl5);
        GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.jz3);
        groupableElementSpecImpl6.bindGroups(list);
        groupableElementSpecImpl6.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl6);
        MultiElementSpecImplKt.groupableElement(this, R.id.fva, C77073UMr.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.a9s, UMW.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.mz0, UMX.LJLIL);
        GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.frh);
        groupableElementSpecImpl7.bindGroups(list);
        groupableElementSpecImpl7.bindGroups(C47261Igj.LJJIJIL(Integer.valueOf(i3), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl7);
        MultiElementSpecImplKt.groupableElement(this, R.id.gyq, C77069UMn.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.fvk, UMK.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.img, UMQ.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.imh, UMR.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.n4b, UMY.LJLIL);
        if (c1o4.LJIILJJIL != 0) {
            GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.hq2);
            groupableElementSpecImpl8.bindGroup(i2);
            groupableElementSpecImpl8.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZIZ), Integer.valueOf(i)));
            registerElement(groupableElementSpecImpl8);
        }
        MultiElementSpecImplKt.groupableElement(this, R.id.k50, UMS.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.bjy, new AqS179S0100000_13(c1o4, 651));
        MultiElementSpecImplKt.element(this, R.id.bkq);
        GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.lcv);
        groupableElementSpecImpl9.bindGroups(list);
        groupableElementSpecImpl9.bindGroup(i);
        ElementSpecImplKt.onAttach(groupableElementSpecImpl9, new AqS179S0100000_13(c1o4, 652));
        registerElement(groupableElementSpecImpl9);
        MultiElementSpecImplKt.groupableElement(this, R.id.k58, C77072UMq.LJLIL);
    }
}
