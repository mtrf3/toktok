package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MM1 implements LDY {
    public final /* synthetic */ HomeTabAbility LJLIL;
    public final /* synthetic */ C56671MLz LJLILLLLZI;

    public MM1(HomeTabAbility homeTabAbility, C56671MLz c56671MLz) {
        this.LJLIL = homeTabAbility;
        this.LJLILLLLZI = c56671MLz;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        if (!o.LJ(to, "For You")) {
            this.LJLIL.a2(this);
            this.LJLILLLLZI.LJZI = true;
        }
    }
}
