package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C3C8;
import X.C76800UCe;
import X.C8LU;
import X.InterfaceC88472Yns;
import X.TCM;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;

/* loaded from: classes4.dex */
public class AqS4S0501000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS4S0501000_3 aqS4S0501000_3, Object obj) {
        Assembler assembleTree = (Assembler) obj;
        o.LJIIIZ(assembleTree, "$this$assembleTree");
        assembleTree.rv0((BaseContainer) aqS4S0501000_3.l0, new AqS11S0401000_3((C8LU) aqS4S0501000_3.l1, (C8LU) aqS4S0501000_3.i5, (int) aqS4S0501000_3.l2, (ViewGroup) aqS4S0501000_3.l3, (ReusedUIAssem<? extends C3C8>) aqS4S0501000_3.l4, (RootCellCommonAbility) 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS4S0501000_3 aqS4S0501000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        ReusedUIAssem<? extends C3C8> reusedUIAssem = (ReusedUIAssem) aqS4S0501000_3.l0;
        if (reusedUIAssem instanceof BaseCellTriggerComponent) {
            TCM.LJIILJJIL(assemble, (BaseContainer) aqS4S0501000_3.l1, new AqS11S0401000_3((C8LU) aqS4S0501000_3.l2, (C8LU) aqS4S0501000_3.i5, (int) aqS4S0501000_3.l3, (ViewGroup) reusedUIAssem, (ReusedUIAssem<? extends C3C8>) aqS4S0501000_3.l4, (RootCellCommonAbility) 4));
        } else if (reusedUIAssem instanceof BaseCellSlotComponent) {
            assemble.sv0((BaseContainer) aqS4S0501000_3.l1, new AqS11S0401000_3((C8LU) aqS4S0501000_3.l2, (C8LU) aqS4S0501000_3.i5, (int) aqS4S0501000_3.l3, (ViewGroup) reusedUIAssem, (ReusedUIAssem<? extends C3C8>) aqS4S0501000_3.l4, (RootCellCommonAbility) 5));
        } else if (reusedUIAssem instanceof BaseCellPlaceHolderComponent) {
            View LIZIZ = ((C8LU) aqS4S0501000_3.l2).LIZIZ(aqS4S0501000_3.i5, (ViewGroup) aqS4S0501000_3.l3, reusedUIAssem, (RootCellCommonAbility) aqS4S0501000_3.l4);
            ReusedUIAssem reusedUIAssem2 = (ReusedUIAssem) aqS4S0501000_3.l0;
            BaseContainer baseContainer = (BaseContainer) aqS4S0501000_3.l1;
            if (((BaseCellPlaceHolderComponent) reusedUIAssem2).b4()) {
                assemble.rv0(baseContainer, new AqS134S0200000_3(LIZIZ, (View) reusedUIAssem2, (ReusedUIAssem<? extends C3C8>) 275));
            }
        } else {
            throw new IllegalStateException("The type implementing InteractAreaIndexProtocol is not supported!");
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS4S0501000_3(int r3, android.view.ViewGroup r4, com.bytedance.assem.arch.reused.ReusedUIAssem r5, com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility r6, X.C8LU r7, com.ss.android.ugc.feed.platform.container.core.BaseContainer r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            switch(r9) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r8
            r1.l2 = r7
            r1.i5 = r3
            r1.l3 = r4
            r1.l4 = r6
            r0 = 1
        L13:
            r1.<init>(r0)
            return
        L17:
            r1 = r2
            r1.l0 = r8
            r1.l1 = r7
            r1.i5 = r3
            r1.l2 = r4
            r1.l3 = r5
            r1.l4 = r6
            r0 = 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS4S0501000_3.<init>(int, android.view.ViewGroup, com.bytedance.assem.arch.reused.ReusedUIAssem, com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility, X.8LU, com.ss.android.ugc.feed.platform.container.core.BaseContainer, int):void");
    }
}
