package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import kotlin.jvm.internal.AqS0S0010001_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS45S0110000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144925mS extends AbstractC48231ut<InterfaceC144495ll, C145035md, C144955mV, C144985mY> implements InterfaceC135635Tz, InterfaceC144495ll {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC65784Pro<C144955mV> LJLLJ;
    public final InterfaceC65784Pro<C144985mY> LJLLL;

    static {
        TBT tbt = new TBT(C144925mS.class, "video2StickerModel", "getVideo2StickerModel()Lcom/ss/android/ugc/aweme/creative/model/video2sticker/Video2StickerModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt};
    }

    private final Video2StickerModel LJLZ() {
        return (Video2StickerModel) this.LJLLILLLL.LIZ(this, LJLLLL[0]);
    }

    @Override // X.InterfaceC144495ll
    public void PP() {
        LJJZZI(C144935mT.LJLIL);
    }

    @Override // X.InterfaceC144495ll
    public void xl0() {
        LJJZZI(C144945mU.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C144955mV> LJJLIIIJJI() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C144985mY> LJJLIIIJJIZ() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
    }

    @Override // X.InterfaceC144495ll
    public void vD(Rect rect) {
        o.LJIIIZ(rect, "rect");
        LJJZZI(new AqS168S0100000_2(rect, 208));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144925mS(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = UCI.LJI(getDiContainer(), Video2StickerModel.class, null);
        this.LJLLJ = C144965mW.LJLIL;
        this.LJLLL = C144975mX.LJLIL;
    }

    @Override // X.InterfaceC144495ll
    public void nl(boolean z, float f) {
        LJJZZI(new AqS0S0010001_2(z, f, 1));
    }

    @Override // X.InterfaceC144495ll
    public void wc0(boolean z, float f) {
        RectF LJ = C144025l0.LJ(f);
        float f2 = LJ.right - LJ.left;
        float f3 = LJ.bottom - LJ.top;
        float LIZ = (C144035l1.LIZIZ - C74275TDb.LIZ(32.0f)) - C74275TDb.LIZ(32.0f);
        float LIZ2 = (C144035l1.LIZ - C74275TDb.LIZ(64.0f)) - C74275TDb.LIZ(279.0f);
        Rect rect = new Rect();
        float f4 = 2;
        rect.top = (int) (((LIZ2 - f3) / f4) + ((int) C74275TDb.LIZ(64.0f)));
        int LIZ3 = (int) C1I0.LIZ(LIZ, f2, f4, (int) C74275TDb.LIZ(32.0f));
        rect.left = LIZ3;
        rect.right = (int) (LIZ3 + f2);
        rect.bottom = (int) (rect.top + f3);
        LJJZZI(new AqS45S0110000_2(rect, z, 4));
    }
}
