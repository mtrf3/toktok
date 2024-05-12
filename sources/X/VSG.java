package X;

import Y.ARunnableS50S0100000_14;
import Y.IDLListenerS199S0100000_14;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSG {
    public boolean LIZ;
    public final VNU LIZIZ;
    public IDLListenerS199S0100000_14 LIZJ;
    public IDLListenerS199S0100000_14 LIZLLL;
    public C41997Ge1 LJ;
    public final VPF LJFF;
    public Rect LJI;
    public int LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public final LynxBaseInputView LJIJJLI;

    public final boolean LIZ() {
        if (C78996UzQ.LJIIJJI(this.LIZIZ) != null && this.LJIIJJI && !TextUtils.equals(this.LJIIIIZZ, LiveGiftNewGifterBadgeSetting.DEFAULT) && LIZIZ() != O0Q.NONE && this.LJFF.LJ != null) {
            return true;
        }
        return false;
    }

    public final O0Q LIZIZ() {
        Activity LJIIJJI = C78996UzQ.LJIIJJI(this.LIZIZ);
        if (LJIIJJI != null) {
            Window window = LJIIJJI.getWindow();
            o.LJFF(window, "context.window");
            int i = window.getAttributes().softInputMode & 240 & 240;
            if (i != 16) {
                if (i != 32) {
                    if (i != 48) {
                        return O0Q.NONE;
                    }
                    return O0Q.NOTHING;
                }
                return O0Q.NONE;
            }
            Activity LJIIJJI2 = C78996UzQ.LJIIJJI(this.LIZIZ);
            if (LJIIJJI2 != null) {
                Window window2 = LJIIJJI2.getWindow();
                o.LJFF(window2, "context.window");
                View decorView = window2.getDecorView();
                o.LJFF(decorView, "context.window.decorView");
                if ((decorView.getSystemUiVisibility() & 1024) != 0) {
                    return O0Q.IMMERSIVE;
                }
            }
            return O0Q.NORMAL;
        }
        return O0Q.NONE;
    }

    public final void LIZJ() {
        if (this.LIZ) {
            LLog.LIZLLL(1, "LynxInputScrollHelper", "inputScrollerHelper has already initialized");
            return;
        }
        if (this.LJFF.LJ == null) {
            LLog.LIZLLL(1, "LynxInputScrollHelper", "keyboardMonitor has not been created");
            return;
        }
        C41997Ge1 c41997Ge1 = this.LJIJJLI.LJLIL;
        if (c41997Ge1 != null) {
            this.LJ = c41997Ge1;
            if (LIZIZ() != O0Q.NONE) {
                IDLListenerS199S0100000_14 iDLListenerS199S0100000_14 = new IDLListenerS199S0100000_14(this, 2);
                this.LIZJ = iDLListenerS199S0100000_14;
                VPF vpf = this.LJFF;
                vpf.LJIIJ.put(this.LJ, iDLListenerS199S0100000_14);
                vpf.LIZ();
            }
            this.LIZLLL = new IDLListenerS199S0100000_14(this, 3);
            this.LIZ = true;
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028b A[LOOP:1: B:134:0x0287->B:136:0x028b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VSG.LJ():void");
    }

    public final void LJFF() {
        VPF vpf = this.LJFF;
        this.LJII = vpf.LJFF;
        Rect rect = vpf.LJII;
        o.LJFF(rect, "mKeyboardEvent.displayFrame");
        this.LJI = rect;
        if (rect.bottom == 0) {
            SYK syk = this.LJFF.LJ;
            if (syk != null) {
                syk.LIZJ().getWindowVisibleDisplayFrame(this.LJI);
                Rect rect2 = this.LJI;
                this.LJII = rect2.bottom - rect2.top;
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    public VSG(LynxBaseInputView inputView) {
        o.LJIIJ(inputView, "inputView");
        this.LJIJJLI = inputView;
        VNU vnu = inputView.mContext;
        o.LJFF(vnu, "inputView.lynxContext");
        this.LIZIZ = vnu;
        VNS LJI = vnu.LJI();
        o.LJFF(LJI, "lynxContext.lynxView");
        VPF keyboardEvent = LJI.getKeyboardEvent();
        o.LJFF(keyboardEvent, "lynxContext.lynxView.keyboardEvent");
        this.LJFF = keyboardEvent;
        this.LJI = new Rect();
        this.LJIIIIZZ = "end";
        this.LJIIIZ = true;
        this.LJIIJJI = true;
        this.LJIILIIL = -1;
        this.LJIJI = -1;
        if (C78996UzQ.LJIIJJI(vnu) != null) {
            if (!keyboardEvent.LIZLLL) {
                if (!C79411VEp.LIZ()) {
                    C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, UserLevelGeckoUpdateSetting.DEFAULT));
                    return;
                } else {
                    keyboardEvent.LIZ();
                    LIZJ();
                    return;
                }
            }
            LIZJ();
            return;
        }
        LLog.LIZLLL(4, "LynxInputScrollHelper", "input's smart-scroll doesn't work properly since the context is not an activity");
    }

    public final boolean LIZLLL(Rect rect) {
        int i;
        int[] iArr = {-1, -1};
        C41997Ge1 c41997Ge1 = this.LJ;
        if (c41997Ge1 != null) {
            c41997Ge1.getLocationOnScreen(iArr);
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        C41997Ge1 c41997Ge12 = this.LJ;
        if (c41997Ge12 != null) {
            int width = c41997Ge12.getWidth() + i2;
            int i4 = iArr[1];
            C41997Ge1 c41997Ge13 = this.LJ;
            if (c41997Ge13 != null) {
                Rect rect2 = new Rect(i2, i3, width, c41997Ge13.getHeight() + i4);
                if (TextUtils.equals(this.LJIIIIZZ, "center")) {
                    int i5 = this.LJIILIIL;
                    if (i5 == -1) {
                        this.LJIILL = true;
                        SYK syk = this.LJFF.LJ;
                        if (syk != null) {
                            syk.LIZJ().requestLayout();
                            return true;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    this.LJIILL = false;
                    i = (this.LJI.bottom - rect2.bottom) - ((i5 - rect.height()) / 2);
                } else {
                    i = (this.LJI.bottom - rect2.bottom) - this.LJIIJ;
                }
                if (i < 0) {
                    return false;
                }
                return true;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }
}
