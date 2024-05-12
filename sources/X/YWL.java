package X;

import com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase;

/* loaded from: classes16.dex */
public final class YWL extends C1CG<C43189GxF> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR ABORT INTO `runtimeBehaviorEntity` (`id`,`type`,`time`,`msg`) VALUES (nullif(?, 0),?,?,?)";
    }

    public YWL(RuntimeBehaviorDataBase runtimeBehaviorDataBase) {
        super(runtimeBehaviorDataBase);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C43189GxF c43189GxF) {
        C43189GxF c43189GxF2 = c43189GxF;
        interfaceC37591dj.LJIIIZ(1, c43189GxF2.LIZ);
        String str = c43189GxF2.LIZIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJJII(2, str);
        }
        interfaceC37591dj.LJIIIZ(3, c43189GxF2.LIZJ);
        String str2 = c43189GxF2.LIZLLL;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(4);
        } else {
            interfaceC37591dj.LJJII(4, str2);
        }
    }
}
