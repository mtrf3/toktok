package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.MLx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56669MLx implements LDY {
    public final /* synthetic */ C56671MLz LJLIL;
    public final /* synthetic */ HomeTabAbility LJLILLLLZI;

    public C56669MLx(HomeTabAbility homeTabAbility, C56671MLz c56671MLz) {
        this.LJLIL = c56671MLz;
        this.LJLILLLLZI = homeTabAbility;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        if (o.LJ(to, "HOME")) {
            C56671MLz c56671MLz = this.LJLIL;
            c56671MLz.LJLJLLL.postDelayed(new RunnableC56668MLw(c56671MLz, this.LJLILLLLZI, this), 500L);
        } else {
            this.LJLILLLLZI.Q6(this);
            this.LJLIL.LJZI = true;
        }
    }
}
