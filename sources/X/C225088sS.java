package X;

import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8sS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225088sS {
    public final InterfaceC55235Lm3 LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public final C62822Ol8 LJ;
    public final List<String> LJFF;

    public final BottomBarPriorityAbility LIZ() {
        return (BottomBarPriorityAbility) this.LJ.getValue();
    }

    public C225088sS(InterfaceC55235Lm3 vScope) {
        o.LJIIIZ(vScope, "vScope");
        this.LIZ = vScope;
        this.LIZIZ = "";
        this.LJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1712));
        this.LJFF = C47261Igj.LJJIJIIJI("bottom_banner_playlist", "bottom_banner_ec_search_rs", "bottom_banner_search_rs", "bottom_banner_ad_deduction", "bottom_banner_tcm");
    }
}
