package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredTestingConstraintWidget;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.UMb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77057UMb extends LayerSpecImpl {
    public C77057UMb(C1O4 c1o4) {
        super(c1o4);
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.jna);
        int i = C77068UMm.LIZ;
        int i2 = C11110c7.LIZ;
        int i3 = C11110c7.LIZJ;
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        int i4 = C12960f6.LIZ;
        int i5 = C12960f6.LJ;
        groupableElementSpecImpl.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i5)));
        registerElement(groupableElementSpecImpl);
        C51311zr c51311zr = new C51311zr();
        c51311zr.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        int i6 = C11110c7.LIZLLL;
        int i7 = C77068UMm.LIZIZ;
        c51311zr.bindGroups(C47261Igj.LJJIJIL(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(c51311zr);
        UND und = new UND(R.id.j6m);
        int i8 = C12960f6.LIZLLL;
        int i9 = C11110c7.LJ;
        und.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i5)));
        registerElement(und);
        UND und2 = new UND(R.id.e2q);
        und2.setConstraintWidget(new LayeredTestingConstraintWidget());
        und2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i5)));
        und2.addSceneObserver(new UM2());
        registerElement(und2);
        GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.fvk);
        groupableElementSpecImpl2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        List<Integer> LJJIJIL = C47261Igj.LJJIJIL(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i5));
        LiveCenterLayoutStyleSetting liveCenterLayoutStyleSetting = LiveCenterLayoutStyleSetting.INSTANCE;
        if (!liveCenterLayoutStyleSetting.enableNewStyle()) {
            LJJIJIL.add(Integer.valueOf(i6));
            LJJIJIL.add(Integer.valueOf(i7));
        }
        groupableElementSpecImpl2.bindGroups(LJJIJIL);
        registerElement(groupableElementSpecImpl2);
        GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.lfv);
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        ElementSpecImplKt.onAttach(groupableElementSpecImpl3, UM1.LJLIL);
        registerElement(groupableElementSpecImpl3);
        GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.nji);
        groupableElementSpecImpl4.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl4.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(groupableElementSpecImpl4);
        registerElement(new C77066UMk());
        C77068UMm.LIZ(this, R.id.lkh);
        GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.jz3);
        groupableElementSpecImpl5.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl5.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i5)));
        registerElement(groupableElementSpecImpl5);
        C77068UMm.LIZ(this, R.id.guv);
        MultiElementSpecImplKt.groupableElement(this, R.id.fva, C77079UMx.LJLIL);
        UND und3 = new UND(R.id.img);
        und3.setConstraintWidget(new LayeredTestingConstraintWidget());
        und3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(und3);
        UND und4 = new UND(R.id.imh);
        und4.setConstraintWidget(new LayeredTestingConstraintWidget());
        und4.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(und4);
        UND und5 = new UND(R.id.gyq);
        if (!liveCenterLayoutStyleSetting.enableNewStyle()) {
            und5.bindGroup(C11110c7.LIZIZ);
        }
        und5.bindGroups(C47261Igj.LJJIJIL(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i5)));
        registerElement(und5);
        UND und6 = new UND(R.id.a9s);
        und6.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(und6);
        UND und7 = new UND(R.id.mz0);
        und7.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(und7);
        UND und8 = new UND(R.id.frh);
        und8.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(und8);
        UND und9 = new UND(R.id.n4b);
        int i10 = C12960f6.LIZIZ;
        und9.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i10), Integer.valueOf(i3)));
        registerElement(und9);
        if (c1o4.LJIILJJIL != 0) {
            GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.hq2);
            groupableElementSpecImpl6.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
            groupableElementSpecImpl6.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i10), Integer.valueOf(C12960f6.LJI)));
            registerElement(groupableElementSpecImpl6);
        }
        GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.k50);
        groupableElementSpecImpl7.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        int i11 = C12960f6.LJFF;
        groupableElementSpecImpl7.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i10), Integer.valueOf(i11)));
        registerElement(groupableElementSpecImpl7);
        GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.bjy);
        groupableElementSpecImpl8.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl8.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i10), Integer.valueOf(i11)));
        ElementSpecImplKt.animation(groupableElementSpecImpl8, new C32261Ok(groupableElementSpecImpl8.getId(), c1o4));
        registerElement(groupableElementSpecImpl8);
        GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.e0e);
        groupableElementSpecImpl9.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl9.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i10), Integer.valueOf(i11)));
        ElementSpecImplKt.animation(groupableElementSpecImpl9, new UN1(groupableElementSpecImpl9.getId(), c1o4));
        registerElement(groupableElementSpecImpl9);
        MultiElementSpecImplKt.groupableElement(this, R.id.ch9, C77080UMy.LJLIL);
        UN7 un7 = new UN7(c1o4);
        un7.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(C77068UMm.LIZJ), Integer.valueOf(i5), Integer.valueOf(i3)));
        registerElement(un7);
        GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.jz6);
        groupableElementSpecImpl10.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl10.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZJ), Integer.valueOf(i5)));
        registerElement(groupableElementSpecImpl10);
        MultiElementSpecImplKt.element(this, R.id.jz8);
        GroupableElementSpecImpl groupableElementSpecImpl11 = new GroupableElementSpecImpl(R.id.k58);
        groupableElementSpecImpl11.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl11.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i10), Integer.valueOf(i11)));
        registerElement(groupableElementSpecImpl11);
        MultiElementSpecImplKt.groupableElement(this, R.id.bkq, UN3.LJLIL);
    }
}
