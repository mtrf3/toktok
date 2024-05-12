package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.IDqS194S0200000_7;
import kotlin.jvm.internal.o;
import ud2.ApS76S0000000_7;

/* renamed from: X.ICz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46245ICz extends ID1 {
    public final C29S LJLLILLLL;
    public final String LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final TEZ LJLLLLLL;
    public final T4P LJLZ;
    public final TIA LJZ;
    public volatile boolean LJZI;
    public Effect LJZL;
    public FrameLayout LL;
    public FragmentManager LLD;
    public final C73318Sq2 LLF;
    public final IAV LLFF;
    public final C82622Wbi LLFFF;
    public final C62822Ol8 LLFII;

    public final void LJFF() {
        this.LJLLLLLL.release();
        this.LLF.LIZLLL();
        if (this.LJLLL.isInitialized()) {
            ((InterfaceC84498XEg) this.LJLLL.getValue()).LJJIJIIJIL();
        }
    }

    @Override // X.InterfaceC82400WVo
    public final TEZ LLLLL() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC82400WVo
    public final InterfaceC46204IBk LLZL() {
        return this.LJZ;
    }

    @Override // X.ID1
    public final T4O ch0() {
        return this.LJLZ;
    }

    public final void LJ(InterfaceC139745e6<InterfaceC45328Hqe> processorSupplier) {
        o.LJIIIZ(processorSupplier, "processorSupplier");
        C29S c29s = this.LJLLILLLL;
        C83534WqQ c83534WqQ = new C83534WqQ();
        C83525WqH c83525WqH = new C83525WqH();
        C83526WqI c83526WqI = new C83526WqI();
        MutableLiveData LJIIIIZZ = this.LJLLLLLL.LJJJJLL().LIZ().LJIIIIZZ();
        LIZ(new UploadPicStickerARPresenter(c29s, null, c83534WqQ, c83525WqH, c83526WqI, new C44944HkS(), null, null, C42583GnT.LJLIL, false, null, null, new IDqS194S0200000_7(this, (C46245ICz) processorSupplier, (InterfaceC139745e6<InterfaceC45328Hqe>) 1), C45329Hqf.LJLIL, null, LJIIIIZZ, this.LJLLLLLL, new ID7(this), null, null, null, null, false, null, C41942Gd8.LIZ(), C60903NvH.LJIIJJI().LJIL().getCurrentScene(this.LJLLILLLL), null, 2146450882, 2), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46245ICz(C29S activity, String panel) {
        super(C60903NvH.LJIIJJI().LJIL().LIZ(activity), C5SL.LIZ);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(panel, "panel");
        this.LJLLILLLL = activity;
        this.LJLLJ = panel;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 776));
        this.LJLLL = LIZIZ;
        this.LJLLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 775));
        TEZ create = C74355TGd.LIZ(activity, new C74385THh("livestreaming", false, true, 0, null, null, 131056), C43961HNd.LIZ, (InterfaceC84497XEf) LIZIZ.getValue(), C74356TGe.LIZ(activity)).create();
        this.LJLLLLLL = create;
        this.LJLZ = T4P.LIZ;
        TIA tia = new TIA(create, null, null);
        this.LJZ = tia;
        new IDL(this);
        this.LJZI = true;
        this.LLF = new C73318Sq2();
        IAV iav = new IAV();
        this.LLFF = iav;
        C82621Wbh c82621Wbh = new C82621Wbh();
        c82621Wbh.LIZLLL(THX.class, null, new ApS76S0000000_7(24));
        c82621Wbh.LIZLLL(TH7.class, null, new THI(this));
        c82621Wbh.LIZLLL(InterfaceC78118UlG.class, null, new ApS76S0000000_7(25));
        C82622Wbi LIZ = c82621Wbh.LIZ();
        this.LLFFF = LIZ;
        this.LLFII = C221108m2.LIZIZ(TGF.LJLIL);
        C74444TJo c74444TJo = new C74444TJo(C221108m2.LIZIZ(new AqS157S0100000_7(this, 777)));
        InterfaceC74429TIz LJFF = create.LJJJJLL().LJFF();
        Context LLLLLIL = C16880lQ.LLLLLIL(activity);
        o.LJIIIIZZ(LLLLLIL, "activity.applicationContext");
        LJFF.LIZIZ(new C74446TJq(c74444TJo, LLLLLIL, true));
        LIZ(new IDB(activity, create, iav, (THX) LIZ.LJ(THX.class, null), (InterfaceC78118UlG) LIZ.LJ(InterfaceC78118UlG.class, null), new AqS157S0100000_7(this, 774)), false);
        tia.LIZLLL(new ID4(this));
        Z7();
    }
}
