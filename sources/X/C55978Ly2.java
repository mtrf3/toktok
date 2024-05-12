package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ly2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55978Ly2 implements C33Q {
    public final AbstractC72932td<C56054LzG> LJLIL;
    public final AbstractC72932td<EnumC56041Lz3> LJLILLLLZI;
    public final boolean LJLJI;
    public final EnumC55984Ly8 LJLJJI;
    public final AbstractC72932td<C55817LvR> LJLJJL;
    public final AbstractC72932td<C55964Lxo> LJLJJLL;
    public final Boolean LJLJL;
    public final Boolean LJLJLJ;
    public final AbstractC72932td<List<ToolEntryVO>> LJLJLLL;
    public final AbstractC72932td<List<ToolEntryVO>> LJLL;
    public final AbstractC72932td<C38584FCi> LJLLI;
    public final AbstractC72932td<C38585FCj> LJLLILLLL;

    public C55978Ly2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55978Ly2)) {
            return false;
        }
        C55978Ly2 c55978Ly2 = (C55978Ly2) obj;
        return o.LJ(this.LJLIL, c55978Ly2.LJLIL) && o.LJ(this.LJLILLLLZI, c55978Ly2.LJLILLLLZI) && this.LJLJI == c55978Ly2.LJLJI && this.LJLJJI == c55978Ly2.LJLJJI && o.LJ(this.LJLJJL, c55978Ly2.LJLJJL) && o.LJ(this.LJLJJLL, c55978Ly2.LJLJJLL) && o.LJ(this.LJLJL, c55978Ly2.LJLJL) && o.LJ(this.LJLJLJ, c55978Ly2.LJLJLJ) && o.LJ(this.LJLJLLL, c55978Ly2.LJLJLLL) && o.LJ(this.LJLL, c55978Ly2.LJLL) && o.LJ(this.LJLLI, c55978Ly2.LJLLI) && o.LJ(this.LJLLILLLL, c55978Ly2.LJLLILLLL);
    }

    public final String toString() {
        return "ShopMainState(lynxData=" + this.LJLIL + ", loadDataStatus=" + this.LJLILLLLZI + ", isRefreshingOrLoading=" + this.LJLJI + ", networkState=" + this.LJLJJI + ", shoppingCartCard=" + this.LJLJJL + ", hamburgerCard=" + this.LJLJJLL + ", hamburgerTopTabVis=" + this.LJLJL + ", hamburgerTwoTabVis=" + this.LJLJLJ + ", toolPanelEntryOldUser=" + this.LJLJLLL + ", toolPanelEntryNewUser=" + this.LJLL + ", promotionImgInfo=" + this.LJLLI + ", recommendImgInfo=" + this.LJLLILLLL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LIZ2 = C03090Af.LIZ(this.LJLJJLL, C03090Af.LIZ(this.LJLJJL, (this.LJLJJI.hashCode() + ((LIZ + i) * 31)) * 31, 31), 31);
        Boolean bool = this.LJLJL;
        int i2 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i3 = (LIZ2 + hashCode) * 31;
        Boolean bool2 = this.LJLJLJ;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return this.LJLLILLLL.hashCode() + C03090Af.LIZ(this.LJLLI, C03090Af.LIZ(this.LJLL, C03090Af.LIZ(this.LJLJLLL, (i3 + i2) * 31, 31), 31), 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C55978Ly2(int r14) {
        /*
            r13 = this;
            X.33X r1 = X.C33X.LIZ
            r3 = 0
            X.Ly8 r4 = X.EnumC55984Ly8.DEFAULT
            r7 = 0
            r0 = r13
            r2 = r1
            r5 = r1
            r6 = r1
            r8 = r7
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55978Ly2.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C55978Ly2(AbstractC72932td<C56054LzG> lynxData, AbstractC72932td<? extends EnumC56041Lz3> loadDataStatus, boolean z, EnumC55984Ly8 networkState, AbstractC72932td<C55817LvR> shoppingCartCard, AbstractC72932td<C55964Lxo> hamburgerCard, Boolean bool, Boolean bool2, AbstractC72932td<? extends List<ToolEntryVO>> toolPanelEntryOldUser, AbstractC72932td<? extends List<ToolEntryVO>> toolPanelEntryNewUser, AbstractC72932td<C38584FCi> promotionImgInfo, AbstractC72932td<C38585FCj> recommendImgInfo) {
        o.LJIIIZ(lynxData, "lynxData");
        o.LJIIIZ(loadDataStatus, "loadDataStatus");
        o.LJIIIZ(networkState, "networkState");
        o.LJIIIZ(shoppingCartCard, "shoppingCartCard");
        o.LJIIIZ(hamburgerCard, "hamburgerCard");
        o.LJIIIZ(toolPanelEntryOldUser, "toolPanelEntryOldUser");
        o.LJIIIZ(toolPanelEntryNewUser, "toolPanelEntryNewUser");
        o.LJIIIZ(promotionImgInfo, "promotionImgInfo");
        o.LJIIIZ(recommendImgInfo, "recommendImgInfo");
        this.LJLIL = lynxData;
        this.LJLILLLLZI = loadDataStatus;
        this.LJLJI = z;
        this.LJLJJI = networkState;
        this.LJLJJL = shoppingCartCard;
        this.LJLJJLL = hamburgerCard;
        this.LJLJL = bool;
        this.LJLJLJ = bool2;
        this.LJLJLLL = toolPanelEntryOldUser;
        this.LJLL = toolPanelEntryNewUser;
        this.LJLLI = promotionImgInfo;
        this.LJLLILLLL = recommendImgInfo;
    }

    public static C55978Ly2 LIZ(C55978Ly2 c55978Ly2, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, boolean z, EnumC55984Ly8 enumC55984Ly8, AbstractC72932td abstractC72932td3, AbstractC72932td abstractC72932td4, Boolean bool, Boolean bool2, AbstractC72932td abstractC72932td5, C72912tb c72912tb, C72912tb c72912tb2, C72912tb c72912tb3, int i) {
        AbstractC72932td<C38585FCj> recommendImgInfo = c72912tb3;
        AbstractC72932td<C38584FCi> promotionImgInfo = c72912tb2;
        AbstractC72932td<List<ToolEntryVO>> toolPanelEntryNewUser = c72912tb;
        AbstractC72932td toolPanelEntryOldUser = abstractC72932td5;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        AbstractC72932td loadDataStatus = abstractC72932td2;
        AbstractC72932td lynxData = abstractC72932td;
        boolean z2 = z;
        EnumC55984Ly8 networkState = enumC55984Ly8;
        AbstractC72932td shoppingCartCard = abstractC72932td3;
        AbstractC72932td hamburgerCard = abstractC72932td4;
        if ((i & 1) != 0) {
            lynxData = c55978Ly2.LJLIL;
        }
        if ((i & 2) != 0) {
            loadDataStatus = c55978Ly2.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = c55978Ly2.LJLJI;
        }
        if ((i & 8) != 0) {
            networkState = c55978Ly2.LJLJJI;
        }
        if ((i & 16) != 0) {
            shoppingCartCard = c55978Ly2.LJLJJL;
        }
        if ((i & 32) != 0) {
            hamburgerCard = c55978Ly2.LJLJJLL;
        }
        if ((i & 64) != 0) {
            bool4 = c55978Ly2.LJLJL;
        }
        if ((i & 128) != 0) {
            bool3 = c55978Ly2.LJLJLJ;
        }
        if ((i & 256) != 0) {
            toolPanelEntryOldUser = c55978Ly2.LJLJLLL;
        }
        if ((i & 512) != 0) {
            toolPanelEntryNewUser = c55978Ly2.LJLL;
        }
        if ((i & 1024) != 0) {
            promotionImgInfo = c55978Ly2.LJLLI;
        }
        if ((i & 2048) != 0) {
            recommendImgInfo = c55978Ly2.LJLLILLLL;
        }
        c55978Ly2.getClass();
        o.LJIIIZ(lynxData, "lynxData");
        o.LJIIIZ(loadDataStatus, "loadDataStatus");
        o.LJIIIZ(networkState, "networkState");
        o.LJIIIZ(shoppingCartCard, "shoppingCartCard");
        o.LJIIIZ(hamburgerCard, "hamburgerCard");
        o.LJIIIZ(toolPanelEntryOldUser, "toolPanelEntryOldUser");
        o.LJIIIZ(toolPanelEntryNewUser, "toolPanelEntryNewUser");
        o.LJIIIZ(promotionImgInfo, "promotionImgInfo");
        o.LJIIIZ(recommendImgInfo, "recommendImgInfo");
        return new C55978Ly2(lynxData, loadDataStatus, z2, networkState, shoppingCartCard, hamburgerCard, bool4, bool3, toolPanelEntryOldUser, toolPanelEntryNewUser, promotionImgInfo, recommendImgInfo);
    }
}
