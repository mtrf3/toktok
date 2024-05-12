package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFreeGestureSetting;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredTestingConstraintWidget;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UK1 extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UK1(C1O4 layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        MultiElementSpecImplKt.groupableElement(this, R.id.bg2, UK6.LJLIL);
        UKC.LIZ(this, R.id.af3);
        UK5 uk5 = new UK5(R.id.a9s);
        int i = C11110c7.LJII;
        uk5.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        registerElement(uk5);
        UKC.LIZ(this, R.id.c0n);
        MultiElementSpecImplKt.groupableElement(this, R.id.mz0, UK7.LJLIL);
        UKC.LIZ(this, R.id.frh);
        UK5 uk52 = new UK5(R.id.j6m);
        int i2 = C12960f6.LIZLLL;
        uk52.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        registerElement(uk52);
        UK5 uk53 = new UK5(R.id.e2q);
        uk53.setConstraintWidget(new LayeredTestingConstraintWidget());
        uk53.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        uk53.addSceneObserver(new UK2());
        registerElement(uk53);
        UK5 uk54 = new UK5(R.id.img);
        uk54.setConstraintWidget(new LayeredTestingConstraintWidget());
        uk54.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        registerElement(uk54);
        UK5 uk55 = new UK5(R.id.imh);
        uk55.setConstraintWidget(new LayeredTestingConstraintWidget());
        uk55.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        registerElement(uk55);
        UK5 uk56 = new UK5(R.id.chf);
        uk56.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i2), Integer.valueOf(i)));
        registerElement(uk56);
        UK5 uk57 = new UK5(R.id.lfv);
        uk57.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        ElementSpecImplKt.onAttach(uk57, ULF.LJLIL);
        registerElement(uk57);
        UK5 uk58 = new UK5(R.id.nji);
        uk58.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        registerElement(uk58);
        UK5 uk59 = new UK5(R.id.jz4);
        uk59.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i)));
        ElementSpecImplKt.onAttach(uk59, UK3.LJLIL);
        registerElement(uk59);
        UKC.LIZ(this, R.id.lkh);
        UKC.LIZ(this, R.id.afk);
        UKC.LIZ(this, R.id.jz3);
        UK5 uk510 = new UK5(R.id.dqq);
        ElementSpecImplKt.onAttach(uk510, new AqS179S0100000_13(layeredElementContext, 4));
        registerElement(uk510);
        UK5 uk511 = new UK5(R.id.bkq);
        ElementSpecImplKt.onAttach(uk511, new AqS179S0100000_13(layeredElementContext, 5));
        uk511.addSceneObserver(new UK0());
        registerElement(uk511);
        UK5 uk512 = new UK5(R.id.fpq);
        int i3 = C11110c7.LJI;
        uk512.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i3)));
        ElementSpecImplKt.onAttach(uk512, UK4.LJLIL);
        registerElement(uk512);
        UK5 uk513 = new UK5(R.id.j3c);
        uk513.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(i3)));
        ElementSpecImplKt.onAttach(uk513, new AqS179S0100000_13(layeredElementContext, 6));
        uk513.addSceneObserver(new C77003UJz());
        registerElement(uk513);
        UK5 uk514 = new UK5(R.id.aq9);
        ElementSpecImplKt.onAttach(uk514, new AqS179S0100000_13(layeredElementContext, 7));
        registerElement(uk514);
        UK5 uk515 = new UK5(R.id.aq_);
        ElementSpecImplKt.onAttach(uk515, new AqS179S0100000_13(layeredElementContext, 8));
        registerElement(uk515);
        UK5 uk516 = new UK5(R.id.aqa);
        ElementSpecImplKt.onAttach(uk516, new AqS179S0100000_13(layeredElementContext, 9));
        registerElement(uk516);
        UK5 uk517 = new UK5(R.id.jna);
        if (LivePublicScreenFreeGestureSetting.INSTANCE.enableFreeGestureWhenInput()) {
            uk517.removeGroup(C12960f6.LIZ);
        }
        registerElement(uk517);
        MultiElementSpecImplKt.groupableElement(this, R.id.dq9, UKA.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.k58, UKB.LJLIL);
    }
}
