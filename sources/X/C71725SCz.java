package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SCz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71725SCz implements SEI {
    public String LIZ = "";
    public final boolean LIZIZ;
    public TuxIconView LIZJ;
    public boolean LIZLLL;

    @Override // X.SEI
    public final void LIZIZ(boolean z) {
    }

    @Override // X.SEI
    public final void LJ(boolean z) {
    }

    public C71725SCz() {
        C28121B1x.LIZ.getClass();
        this.LIZIZ = C28121B1x.LIZ();
    }

    @Override // X.SDK
    public final C71729SDd LIZ(SDF sdf) {
        int i;
        boolean z;
        CharSequence LIZIZ;
        C71729SDd<C71740SDo> LIZ = sdf.LIZ(sdf.LIZIZ);
        int i2 = 0;
        if (C52969Kqb.LIZ() && C71691SBr.LJFF.contains(this.LIZ)) {
            InterfaceC71722SCw interfaceC71722SCw = LIZ.LIZ.LJIIJ;
            if (interfaceC71722SCw != null && (LIZIZ = interfaceC71722SCw.LIZIZ()) != null) {
                i = LIZIZ.length();
            } else {
                i = 0;
            }
            if (!this.LIZIZ && i == 0) {
                z = true;
            } else {
                z = false;
            }
            SE0 se0 = LIZ.LIZ.LIZLLL;
            if (!o.LJ(Boolean.valueOf(z), Boolean.TRUE)) {
                i2 = 8;
            }
            SE0 LIZ2 = SE0.LIZ(se0, i2, null, 126);
            if (!this.LIZLLL && z) {
                this.LIZLLL = true;
                C28112B1o.LJ("card_number_ocr", null);
            }
            return new C71729SDd(C71740SDo.LIZ(LIZ.LIZ, null, LIZ2, null, null, null, null, 16375));
        }
        return new C71729SDd(C71740SDo.LIZ(LIZ.LIZ, null, new SE0(0, 0, 0, null, 127), null, null, null, null, 16375));
    }

    @Override // X.SEI
    public final void LIZJ(InterfaceC71708SCi item) {
        o.LJIIIZ(item, "item");
        String str = item.getElementDTO().id;
        if (str == null) {
            str = "";
        }
        this.LIZ = str;
    }

    @Override // X.SDK
    public final void LIZLLL(View view) {
        if (!C52969Kqb.LIZ() || !C71691SBr.LJFF.contains(this.LIZ) || !this.LIZIZ) {
            return;
        }
        if (this.LIZJ == null) {
            this.LIZJ = (TuxIconView) view.findViewById(R.id.heg);
            C28112B1o.LJ("card_number_ocr", null);
        }
        TuxIconView tuxIconView = this.LIZJ;
        if (tuxIconView == null) {
            return;
        }
        C71745SDt.LIZIZ(tuxIconView, new SE0(0, R.raw.icon_camera_fill, 0, null, 118));
    }
}
