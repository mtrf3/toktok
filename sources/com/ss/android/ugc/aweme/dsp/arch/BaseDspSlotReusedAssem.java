package com.ss.android.ugc.aweme.dsp.arch;

import X.C221108m2;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C5H3;
import X.C8XO;
import X.C91395Ztv;
import X.C91398Zty;
import X.C91473ZvB;
import X.EnumC221088m0;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;

/* loaded from: classes22.dex */
public abstract class BaseDspSlotReusedAssem extends ReusedUISlotAssem<BaseDspSlotReusedAssem> implements C8XO<C91395Ztv> {
    public final C55749LuL LLFF;
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public void unBind() {
    }

    public BaseDspSlotReusedAssem() {
        new LinkedHashMap();
        this.LLFF = new C55749LuL(C47704Ins.LJ(this, C91398Zty.class, "PageCardHierarchyData"), checkSupervisorPrepared());
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LLFFF = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 11));
        this.LLFII = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 10));
        this.LLFZ = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 9));
    }

    public final IContainerUtilityAbility m4() {
        return (IContainerUtilityAbility) this.LLFFF.getValue();
    }

    public final boolean n4() {
        C91398Zty c91398Zty = (C91398Zty) this.LLFF.getValue();
        if (c91398Zty == null || c91398Zty.LJLIL != 1) {
            return false;
        }
        return true;
    }

    public final C91473ZvB x5() {
        IContainerUtilityAbility m4 = m4();
        if (m4 != null) {
            return m4.x5();
        }
        return null;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C91395Ztv c91395Ztv) {
        return true;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C91395Ztv c91395Ztv) {
    }
}
