package X;

import Y.ACListenerS21S0100000_1;
import Y.IDCListenerS166S0100000_15;
import Y.IDCListenerS289S0100000_15;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y47 implements InterfaceC46081I6r {
    public final ActivityC45651qj LIZ;
    public final ShortVideoContext LIZIZ;
    public final I3X LIZJ;
    public C6NJ LIZLLL;
    public final Y48 LJ;

    @Override // X.InterfaceC46081I6r
    public final void LIZ() {
        HZ2.LIZ(this.LIZJ, false, 3);
    }

    @Override // X.InterfaceC46081I6r
    public final void LJ() {
        CommerceToolsStickerServiceImpl.LJIIL().LJ(this.LIZIZ);
        this.LIZJ.Ti0(true);
    }

    @Override // X.InterfaceC46081I6r
    public final void closeRecording() {
        CommerceToolsStickerServiceImpl.LJIIL().LJ(this.LIZIZ);
        this.LIZJ.Ti0(false);
    }

    @Override // X.InterfaceC46081I6r
    public final void LIZLLL(AqS74S1100000_7 aqS74S1100000_7) {
        Window window;
        C62905OmT c62905OmT = new C62905OmT(this.LIZ);
        c62905OmT.LIZ(R.string.psi);
        c62905OmT.LJII(R.string.cg_, null);
        c62905OmT.LJIIJ(R.string.grs, new IDCListenerS166S0100000_15(aqS74S1100000_7, 8));
        Dialog LJ = new C62906OmU(c62905OmT).LJ();
        if (!C60178Nja.LIZIZ(this.LIZ) && LJ != null && (window = LJ.getWindow()) != null) {
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        C16880lQ.LIZ(LJ);
    }

    public Y47(ActivityC45651qj activity, I3X recordControlApi, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        this.LIZ = activity;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = recordControlApi;
        this.LJ = new Y48(this);
    }

    @Override // X.InterfaceC46081I6r
    public final void LIZIZ(View view, boolean z, AqS157S0100000_7 aqS157S0100000_7) {
        int i;
        o.LJIIIZ(view, "view");
        boolean LIZ = C140445fE.LIZ();
        int i2 = R.string.e32;
        boolean z2 = false;
        if (LIZ) {
            C6NJ c6nj = this.LIZLLL;
            if (c6nj != null && c6nj.LIZIZ()) {
                c6nj.LIZ();
            }
            ArrayList arrayList = new ArrayList();
            if (this.LIZIZ.cameraComponentModel.mRestoreType == 1) {
                z2 = true;
            }
            if (z2) {
                i = R.string.e2u;
            } else {
                i = R.string.e32;
            }
            arrayList.add(new C6NK(R.raw.icon_trash_bin, i, R.attr.e7, R.attr.e7, new AqS165S0100000_15(this, 677), 176));
            arrayList.add(new C6NK(R.raw.icon_arrow_turn_left, R.string.e39, 0, 0, new AqS165S0100000_15(this, 678), 188));
            if (z) {
                arrayList.add(new C6NK(R.raw.icon_draft, R.string.e38, 0, 0, new AqS165S0100000_15(aqS157S0100000_7, 679), 188));
            }
            C6NJ c6nj2 = new C6NJ(view, arrayList, this.LJ);
            this.LIZLLL = c6nj2;
            c6nj2.LIZJ();
            return;
        }
        C60903NvH.LJJIFFI(this.LIZIZ);
        ArrayList arrayList2 = new ArrayList();
        C252669vq c252669vq = new C252669vq();
        if (this.LIZIZ.cameraComponentModel.mRestoreType == 1) {
            i2 = R.string.e2u;
        }
        c252669vq.LIZ(i2);
        c252669vq.LJ = new ACListenerS21S0100000_1(new AqS181S0100000_15(this, 196), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        arrayList2.add(c252669vq);
        C252669vq c252669vq2 = new C252669vq();
        c252669vq2.LIZ(R.string.e39);
        c252669vq2.LJ = new ACListenerS21S0100000_1(new AqS181S0100000_15(this, 197), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        arrayList2.add(c252669vq2);
        if (z) {
            C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.e38);
            LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS146S0200000_15(this, aqS157S0100000_7, 32), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList2.add(LIZIZ);
        }
        C245319jz c245319jz = new C245319jz();
        C252669vq[] c252669vqArr = (C252669vq[]) arrayList2.toArray(new C252669vq[0]);
        c245319jz.LIZIZ((C252669vq[]) Arrays.copyOf(c252669vqArr, c252669vqArr.length));
        c245319jz.LIZ.LJLIL = new IDCListenerS289S0100000_15(this, 4);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager supportFragmentManager = this.LIZ.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        LIZJ.show(supportFragmentManager, "Save Draft Dialog");
    }

    @Override // X.InterfaceC46081I6r
    public final void LIZJ(C46091I7b cancel, AqS74S1100000_7 aqS74S1100000_7, AqS157S0100000_7 aqS157S0100000_7) {
        o.LJIIIZ(cancel, "cancel");
        try {
            AnonymousClass025 anonymousClass025 = new AnonymousClass025(this.LIZ, R.style.a75);
            anonymousClass025.LIZIZ(R.string.e7c);
            anonymousClass025.LIZJ(R.string.g7j, new IDCListenerS166S0100000_15(cancel, 5));
            anonymousClass025.LIZLLL(R.string.e7_, new IDCListenerS166S0100000_15(aqS157S0100000_7, 6));
            IDCListenerS166S0100000_15 iDCListenerS166S0100000_15 = new IDCListenerS166S0100000_15(aqS74S1100000_7, 7);
            C008901t c008901t = anonymousClass025.LIZ;
            c008901t.LJIIJ = c008901t.LIZ.getText(R.string.e7a);
            anonymousClass025.LIZ.LJIIJJI = iDCListenerS166S0100000_15;
            anonymousClass025.LJ();
        } catch (Exception e) {
            C170666ms.LIZIZ(e.toString());
        }
    }

    @Override // X.InterfaceC46081I6r
    public final void LJFF(C46092I7c cancel, AqS74S1100000_7 aqS74S1100000_7, AqS157S0100000_7 aqS157S0100000_7) {
        o.LJIIIZ(cancel, "cancel");
        C245319jz c245319jz = new C245319jz();
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.byk);
        LIZIZ.LIZJ = 1;
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS181S0100000_15(aqS157S0100000_7, 194), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.byr);
        LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS181S0100000_15(aqS74S1100000_7, 195), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZIZ(LIZIZ, LIZIZ2);
        c245319jz.LIZLLL(R.string.cg_);
        IDCListenerS289S0100000_15 iDCListenerS289S0100000_15 = new IDCListenerS289S0100000_15(cancel, 3);
        TuxActionSheet tuxActionSheet = c245319jz.LIZ;
        tuxActionSheet.LJLIL = iDCListenerS289S0100000_15;
        tuxActionSheet.LJLILLLLZI = Y49.LJLIL;
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager supportFragmentManager = this.LIZ.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        LIZJ.show(supportFragmentManager, "record action sheet");
    }

    @Override // X.InterfaceC46081I6r
    public final void LJI(View view, boolean z, AqS157S0100000_7 aqS157S0100000_7) {
        int i;
        o.LJIIIZ(view, "view");
        boolean LIZ = C140445fE.LIZ();
        int i2 = R.string.e32;
        boolean z2 = false;
        if (LIZ) {
            C6NJ c6nj = this.LIZLLL;
            if (c6nj != null && c6nj.LIZIZ()) {
                c6nj.LIZ();
            }
            ArrayList arrayList = new ArrayList();
            if (this.LIZIZ.cameraComponentModel.mRestoreType == 1) {
                z2 = true;
            }
            if (z2) {
                i = R.string.e2u;
            } else {
                i = R.string.e32;
            }
            arrayList.add(new C6NK(R.raw.icon_trash_bin, i, R.attr.e7, R.attr.e7, new AqS165S0100000_15(this, 680), 176));
            if (!z2) {
                arrayList.add(new C6NK(R.raw.icon_video_split, R.string.e3z, 0, 0, new AqS165S0100000_15(this, 681), 188));
            }
            if (this.LIZIZ.LJIIIIZZ() > 0) {
                arrayList.add(new C6NK(R.raw.icon_arrow_turn_left, R.string.e40, 0, 0, new AqS165S0100000_15(this, 682), 188));
                if (z) {
                    arrayList.add(new C6NK(R.raw.icon_draft, R.string.e38, 0, 0, new AqS165S0100000_15(aqS157S0100000_7, 683), 188));
                }
            }
            C6NJ c6nj2 = new C6NJ(view, arrayList, this.LJ);
            this.LIZLLL = c6nj2;
            c6nj2.LIZJ();
            return;
        }
        C60903NvH.LJJIFFI(this.LIZIZ);
        ArrayList arrayList2 = new ArrayList();
        C252669vq c252669vq = new C252669vq();
        if (this.LIZIZ.cameraComponentModel.mRestoreType == 1) {
            i2 = R.string.e2u;
        }
        c252669vq.LIZ(i2);
        c252669vq.LJ = new ACListenerS21S0100000_1(new AqS181S0100000_15(this, 198), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        arrayList2.add(c252669vq);
        if (this.LIZIZ.cameraComponentModel.mRestoreType != 1) {
            C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.e3z);
            LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS181S0100000_15(this, 199), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList2.add(LIZIZ);
        }
        if (this.LIZIZ.LJIIIIZZ() > 0) {
            C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.e40);
            LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS181S0100000_15(this, 200), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList2.add(LIZIZ2);
        }
        if (z) {
            C252669vq LIZIZ3 = C06530Nl.LIZIZ(R.string.e38);
            LIZIZ3.LJ = new ACListenerS21S0100000_1(new AqS146S0200000_15(this, aqS157S0100000_7, 31), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList2.add(LIZIZ3);
        }
        C245319jz c245319jz = new C245319jz();
        C252669vq[] c252669vqArr = (C252669vq[]) arrayList2.toArray(new C252669vq[0]);
        c245319jz.LIZIZ((C252669vq[]) Arrays.copyOf(c252669vqArr, c252669vqArr.length));
        c245319jz.LIZ.LJLIL = new IDCListenerS289S0100000_15(this, 2);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager supportFragmentManager = this.LIZ.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        LIZJ.show(supportFragmentManager, "Save Draft Dialog For Stitch");
    }

    @Override // X.InterfaceC46081I6r
    public final void LJII(C46090I7a cancel, AqS74S1100000_7 aqS74S1100000_7, AqS74S1100000_7 aqS74S1100000_72) {
        o.LJIIIZ(cancel, "cancel");
        try {
            AnonymousClass025 anonymousClass025 = new AnonymousClass025(this.LIZ, R.style.a75);
            anonymousClass025.LIZIZ(R.string.e7b);
            anonymousClass025.LIZJ(R.string.g7j, new IDCListenerS166S0100000_15(cancel, 2));
            anonymousClass025.LIZLLL(R.string.e79, new IDCListenerS166S0100000_15(aqS74S1100000_72, 3));
            IDCListenerS166S0100000_15 iDCListenerS166S0100000_15 = new IDCListenerS166S0100000_15(aqS74S1100000_7, 4);
            C008901t c008901t = anonymousClass025.LIZ;
            c008901t.LJIIJ = c008901t.LIZ.getText(R.string.e7a);
            anonymousClass025.LIZ.LJIIJJI = iDCListenerS166S0100000_15;
            anonymousClass025.LJ();
        } catch (Exception e) {
            C170666ms.LIZIZ(e.toString());
        }
    }
}
