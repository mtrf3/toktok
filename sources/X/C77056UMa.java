package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredTestingConstraintWidget;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.UMa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77056UMa extends LayerSpecImpl {
    public C77056UMa(C1O4 c1o4) {
        super(c1o4);
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.jna);
        int i = C77067UMl.LIZ;
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
        int i7 = C77067UMl.LIZIZ;
        c51311zr.bindGroups(C47261Igj.LJJIJIL(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(c51311zr);
        UNC unc = new UNC(R.id.j6m);
        int i8 = C12960f6.LIZLLL;
        int i9 = C11110c7.LJ;
        unc.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i5)));
        registerElement(unc);
        UNC unc2 = new UNC(R.id.e2q);
        unc2.setConstraintWidget(new LayeredTestingConstraintWidget());
        unc2.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i5)));
        unc2.addSceneObserver(new UM0());
        registerElement(unc2);
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
        ElementSpecImplKt.onAttach(groupableElementSpecImpl3, C77055ULz.LJLIL);
        registerElement(groupableElementSpecImpl3);
        GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.nji);
        groupableElementSpecImpl4.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl4.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(groupableElementSpecImpl4);
        registerElement(new C77065UMj());
        C77067UMl.LIZ(this, R.id.lkh);
        GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.jz3);
        groupableElementSpecImpl5.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl5.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i5)));
        registerElement(groupableElementSpecImpl5);
        C77067UMl.LIZ(this, R.id.guv);
        MultiElementSpecImplKt.groupableElement(this, R.id.fva, UM3.LJLIL);
        UNC unc3 = new UNC(R.id.img);
        unc3.setConstraintWidget(new LayeredTestingConstraintWidget());
        unc3.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(unc3);
        UNC unc4 = new UNC(R.id.imh);
        unc4.setConstraintWidget(new LayeredTestingConstraintWidget());
        unc4.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(unc4);
        UNC unc5 = new UNC(R.id.gyq);
        if (!liveCenterLayoutStyleSetting.enableNewStyle()) {
            unc5.bindGroup(C11110c7.LIZIZ);
        }
        unc5.bindGroups(C47261Igj.LJJIJIL(Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i5)));
        registerElement(unc5);
        UNC unc6 = new UNC(R.id.llr);
        unc6.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(unc6);
        UNC unc7 = new UNC(R.id.mz0);
        unc7.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(unc7);
        UNC unc8 = new UNC(R.id.frh);
        unc8.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i5)));
        registerElement(unc8);
        UNC unc9 = new UNC(R.id.n4b);
        int i10 = C12960f6.LIZIZ;
        unc9.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i10), Integer.valueOf(i3)));
        registerElement(unc9);
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
        MultiElementSpecImplKt.groupableElement(this, R.id.ch9, C77076UMu.LJLIL);
        UN6 un6 = new UN6(c1o4);
        un6.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(C77067UMl.LIZJ), Integer.valueOf(i5), Integer.valueOf(i3)));
        registerElement(un6);
        GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.jz6);
        groupableElementSpecImpl9.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl9.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZJ), Integer.valueOf(i5)));
        registerElement(groupableElementSpecImpl9);
        MultiElementSpecImplKt.element(this, R.id.jz8);
        GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.k58);
        groupableElementSpecImpl10.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        groupableElementSpecImpl10.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i10), Integer.valueOf(i11)));
        registerElement(groupableElementSpecImpl10);
        MultiElementSpecImplKt.groupableElement(this, R.id.bkq, UN2.LJLIL);
    }
}
