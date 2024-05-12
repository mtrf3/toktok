package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public final class UMI extends LayerSpecImpl {
    public UMI(C1O4 c1o4) {
        super(c1o4);
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.jna);
        List<Integer> list = C11110c7.LJIIIIZZ;
        groupableElementSpecImpl.bindGroups(list);
        int i = UMA.LIZ;
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl);
        C51311zr c51311zr = new C51311zr();
        int i2 = C11110c7.LIZ;
        int i3 = C11110c7.LIZLLL;
        c51311zr.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZ), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)));
        registerElement(c51311zr);
        MultiElementSpecImplKt.groupableElement(this, R.id.j6m, UMM.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.e2q, UMG.LJLIL);
        GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.lfv);
        groupableElementSpecImpl2.bindGroups(list);
        groupableElementSpecImpl2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i)));
        ElementSpecImplKt.onAttach(groupableElementSpecImpl2, C77051ULv.LJLIL);
        registerElement(groupableElementSpecImpl2);
        GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.nji);
        groupableElementSpecImpl3.bindGroups(list);
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i3), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl3);
        GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.jz4);
        groupableElementSpecImpl4.bindGroups(list);
        groupableElementSpecImpl4.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        ElementSpecImplKt.onAttach(groupableElementSpecImpl4, C77053ULx.LJLIL);
        registerElement(groupableElementSpecImpl4);
        GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.jz3);
        groupableElementSpecImpl5.bindGroups(list);
        groupableElementSpecImpl5.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl5);
        GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.fzi);
        groupableElementSpecImpl6.bindGroup(i2);
        int i4 = C12960f6.LIZIZ;
        groupableElementSpecImpl6.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i)));
        ElementSpecImplKt.onAttach(groupableElementSpecImpl6, new AqS179S0100000_13(c1o4, 508));
        registerElement(groupableElementSpecImpl6);
        MultiElementSpecImplKt.groupableElement(this, R.id.fva, C77081UMz.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.img, UMO.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.imh, UMP.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.gyq, UMZ.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.fvk, UML.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.a9s, UMT.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.mz0, UMU.LJLIL);
        GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.frh);
        groupableElementSpecImpl7.bindGroups(list);
        groupableElementSpecImpl7.bindGroups(C47261Igj.LJJIJIL(Integer.valueOf(i3), Integer.valueOf(i)));
        registerElement(groupableElementSpecImpl7);
        MultiElementSpecImplKt.groupableElement(this, R.id.n4b, C77070UMo.LJLIL);
        if (c1o4.LJIILJJIL != 0) {
            GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.hq2);
            groupableElementSpecImpl8.bindGroup(i2);
            groupableElementSpecImpl8.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i)));
            registerElement(groupableElementSpecImpl8);
        }
        MultiElementSpecImplKt.groupableElement(this, R.id.k50, UMV.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.bjy, new AqS179S0100000_13(c1o4, 506));
        MultiElementSpecImplKt.element(this, R.id.bkq);
        GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.lcv);
        groupableElementSpecImpl9.bindGroups(list);
        groupableElementSpecImpl9.bindGroup(i);
        ElementSpecImplKt.onAttach(groupableElementSpecImpl9, new AqS179S0100000_13(c1o4, 507));
        registerElement(groupableElementSpecImpl9);
        MultiElementSpecImplKt.groupableElement(this, R.id.k58, C77071UMp.LJLIL);
    }
}
