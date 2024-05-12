package com.ss.android.ugc.aweme.dsp.arch;

import X.C221108m2;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C5H3;
import X.C8XO;
import X.C91395Ztv;
import X.C91398Zty;
import X.EnumC221088m0;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;

/* loaded from: classes22.dex */
public abstract class BaseDspItemReusedAssem extends ReusedUIContentAssem<BaseDspItemReusedAssem> implements C8XO<C91395Ztv> {
    public final C55749LuL LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final C5H3 LLFF;
    public final C5H3 LLFFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public void unBind() {
    }

    public BaseDspItemReusedAssem() {
        new LinkedHashMap();
        this.LJZL = new C55749LuL(C47704Ins.LJ(this, C91398Zty.class, "PageCardHierarchyData"), checkSupervisorPrepared());
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LL = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 7));
        this.LLD = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 6));
        this.LLF = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 8));
        this.LLFF = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 5));
        this.LLFFF = C221108m2.LIZ(enumC221088m0, new IDqS421S0100000_29(this, 4));
    }

    public final IAudioPlayerAbility Z3() {
        return (IAudioPlayerAbility) this.LLD.getValue();
    }

    public final IContainerUtilityAbility a4() {
        return (IContainerUtilityAbility) this.LL.getValue();
    }

    public final boolean b4() {
        C91398Zty c91398Zty = (C91398Zty) this.LJZL.getValue();
        if (c91398Zty == null || c91398Zty.LJLIL != 1) {
            return false;
        }
        return true;
    }

    public final boolean c4() {
        return ((Boolean) this.LLFF.getValue()).booleanValue();
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
