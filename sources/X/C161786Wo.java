package X;

import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.6Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161786Wo extends AbstractC48231ut<InterfaceC146185oU, WLJ, C161796Wp, C124354uN> implements InterfaceC146185oU, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;
    public final InterfaceC65784Pro<C76800UCe> LJLLLL;
    public boolean LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;

    static {
        TBT tbt = new TBT(C161786Wo.class, "nowModel", "getNowModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt};
    }

    private final NowsShootModel LJZI() {
        return (NowsShootModel) this.LJLZ.LIZ(this, LJZ[0]);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C161796Wp> LJJLIIIJJI() {
        return new AqS152S0100000_2(this, 113);
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<WLJ> LJLJJLL() {
        return new AqS152S0100000_2(this, 114);
    }

    public final int LJLZ() {
        int isPrivate = ((VideoPublishEditModel) getDiContainer().LJ(VideoPublishEditModel.class, null)).isPrivate();
        if (isPrivate != 0) {
            if (isPrivate != 2) {
                return 2;
            }
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        if (!this.LJLLLLLL) {
            LJJZZI(new AqS168S0100000_2(this, 77));
        }
        this.LJLLLLLL = false;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C124354uN> LJJLIIIJJIZ() {
        return C146195oV.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC146185oU
    public void a80(int i) {
        LJJZZI(new AqS27S0001000_2(i, 8));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C161786Wo(WMH parentScene, C82622Wbi diContainer, boolean z, boolean z2, boolean z3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = z;
        this.LJLLJ = z2;
        this.LJLLL = z3;
        this.LJLLLL = interfaceC65784Pro;
        this.LJLLLLLL = true;
        this.LJLZ = UCI.LJI(getDiContainer(), NowsShootModel.class, null);
    }

    public /* synthetic */ C161786Wo(WMH wmh, C82622Wbi c82622Wbi, boolean z, boolean z2, boolean z3, InterfaceC65784Pro interfaceC65784Pro, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wmh, c82622Wbi, z, z2, z3, (i & 32) != 0 ? null : interfaceC65784Pro);
    }
}
