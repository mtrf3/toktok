package X;

import Y.ARunnableS2S0100002_14;
import Y.ARunnableS39S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224038ql implements Y1E {
    public final int LJLIL;
    public final Context LJLILLLLZI;
    public final View LJLJI;
    public C245649kW LJLJJI;
    public C81259Vup LJLJJL;
    public ARunnableS2S0100002_14 LJLJJLL;
    public InterfaceC82683Wch LJLJL;
    public boolean LJLJLJ;
    public InteractStickerStruct LJLJLLL;
    public final List<? extends NormalTrackTimeStamp> LJLL;

    @Override // X.Y1E
    public void LJI(int i, int i2) {
    }

    @Override // X.Y1E
    public boolean LJIIJ() {
        return false;
    }

    public void LJIILJJIL(C81259Vup c81259Vup) {
    }

    public abstract View LJIILLIIL();

    public int LJIIZILJ(C6DL c6dl) {
        o.LJIIIZ(c6dl, "<this>");
        return 0;
    }

    public abstract void LJIJI();

    public abstract void LJIJJ();

    @Override // X.Y1I
    public void onPause() {
    }

    @Override // X.Y1I
    public void onResume() {
    }

    @Override // X.Y1I
    public void LIZJ() {
        Y1Q y1q;
        ARunnableS2S0100002_14 aRunnableS2S0100002_14 = this.LJLJJLL;
        if (aRunnableS2S0100002_14 != null) {
            C38816FLg.LIZ(aRunnableS2S0100002_14);
            this.LJLJJLL = null;
        }
        C81259Vup c81259Vup = this.LJLJJL;
        if (c81259Vup != null) {
            c81259Vup.dismiss();
            this.LJLJJL = null;
        }
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null && (y1q = c245649kW.LJIILJJIL) != null) {
            y1q.LIZIZ(getStickerType(), false);
        }
    }

    public final void LJIJ() {
        InterfaceC82683Wch interfaceC82683Wch;
        InterfaceC82683Wch interfaceC82683Wch2 = this.LJLJL;
        if (interfaceC82683Wch2 != null && interfaceC82683Wch2.isShowing() && (interfaceC82683Wch = this.LJLJL) != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.Y1E
    public final int LJ() {
        return hashCode();
    }

    @Override // X.Y1E
    public final InteractStickerStruct LJFF() {
        return this.LJLJLLL;
    }

    @Override // X.Y1E
    public void LIZLLL(InteractStickerStruct interactStickerStruct) {
        this.LJLJLLL = interactStickerStruct;
    }

    public void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
    }

    @Override // X.Y1I
    public void LJIIIIZZ(int i) {
        ARunnableS2S0100002_14 aRunnableS2S0100002_14 = this.LJLJJLL;
        if (aRunnableS2S0100002_14 != null) {
            C38816FLg.LIZ(aRunnableS2S0100002_14);
            this.LJLJJLL = null;
        }
        C81259Vup c81259Vup = this.LJLJJL;
        if (c81259Vup != null) {
            c81259Vup.LIZLLL();
        }
        this.LJLJJL = null;
    }

    public boolean LJIJJLI(float f, float f2) {
        C2U8.LIZ(new C223728qG(hashCode()));
        C81259Vup c81259Vup = this.LJLJJL;
        if (c81259Vup != null && c81259Vup.isShowing()) {
            C2U8.LIZ(new C223728qG());
            return false;
        }
        LJIJI();
        this.LJLJJLL = new ARunnableS2S0100002_14(this, f, f2, 2);
        this.LJLJI.post(new ARunnableS39S0100000_3(this, 214));
        return true;
    }

    public final boolean LJIL(float f, float f2) {
        C2U8.LIZ(new C223728qG(hashCode()));
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJL;
        if ((interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) || this.LJLJLJ) {
            C2U8.LIZ(new C223728qG());
            InterfaceC82683Wch interfaceC82683Wch2 = this.LJLJL;
            if (interfaceC82683Wch2 != null) {
                interfaceC82683Wch2.dismiss();
            }
            return false;
        }
        LJIJI();
        int LJIILL = C17N.LJIILL(58.0d);
        int LJIILL2 = C17N.LJIILL(16.0d);
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = C17N.LJIILL(10.0d);
        C76732zl c76732zl2 = new C76732zl();
        int[] iArr = new int[2];
        this.LJLJI.getLocationOnScreen(iArr);
        Activity LJIJJ = C45804HyK.LJIJJ(this.LJLILLLLZI);
        o.LJI(LJIJJ);
        C6DJ c6dj = new C6DJ(LJIJJ);
        C82682Wcg c82682Wcg = c6dj.LIZ;
        c82682Wcg.LJII = -1001L;
        c82682Wcg.LJIIJ = 300L;
        c82682Wcg.LJIIIIZZ = LJIILL2;
        c6dj.LJIIJJI(new AqS107S0300000_3(c76732zl2, this, c76732zl, 38));
        c6dj.LJ(new AqS153S0100000_3(this, 1716));
        if (f2 < c76732zl.element + LJIILL + LJIILL2) {
            c6dj.LJI(WHL.BOTTOM);
            if (f2 > LJIILL - LJIILL2) {
                c6dj.LIZ.LJFF = LJIILL2;
            } else {
                f2 = LJIILL;
            }
        } else {
            c6dj.LJI(WHL.TOP);
            c6dj.LIZ.LJFF = -LJIILL2;
        }
        c6dj.LIZ(((int) f) + iArr[0], ((int) f2) + iArr[1]);
        if (c76732zl2.element <= 0) {
            return false;
        }
        InterfaceC82683Wch LIZJ = c6dj.LIZJ();
        this.LJLJL = LIZJ;
        LIZJ.show();
        this.LJLJLJ = true;
        return true;
    }

    public AbstractC224038ql(int i, Context context, View contentView, InteractStickerStruct stickerStruct, C245649kW c245649kW) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(stickerStruct, "stickerStruct");
        this.LJLIL = i;
        this.LJLILLLLZI = context;
        this.LJLJI = contentView;
        this.LJLJJI = c245649kW;
        this.LJLJLLL = stickerStruct;
        try {
            Gson LIZ = GsonHolder.LIZLLL().LIZ();
            InteractStickerStruct interactStickerStruct = this.LJLJLLL;
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            this.LJLL = (List) GsonProtectorUtils.fromJson(LIZ, str, new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.8n7
            }.getType());
        } catch (s unused) {
        }
    }
}
