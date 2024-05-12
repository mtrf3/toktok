package X;

import android.graphics.Matrix;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.VPe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79686VPe extends ClickableSpan implements VPY {
    public final int LJLIL;
    public int LJLILLLLZI;
    public WeakReference<VPY> LJLJI;
    public final java.util.Map<String, VNA> LJLJJI;
    public final boolean LJLJJL;
    public final EnumC79647VNr LJLJJLL;
    public final boolean LJLJL;

    @Override // X.VPY
    public final boolean blockNativeEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.VPY
    public final boolean consumeSlideEvent(float f) {
        return false;
    }

    @Override // X.VPY
    public final boolean dispatchEvent(C40154FpO c40154FpO) {
        return false;
    }

    @Override // X.VPY
    public final boolean dispatchTouch(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.VPY
    public final boolean isFocusable() {
        return false;
    }

    @Override // X.VPY
    public final void offResponseChain() {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
    }

    @Override // X.VPY
    public final void onFocusChanged(boolean z, boolean z2) {
    }

    @Override // X.VPY
    public final void onResponseChain() {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // X.VPY
    public final boolean eventThrough() {
        VPY parent;
        EnumC79647VNr enumC79647VNr = this.LJLJJLL;
        if (enumC79647VNr == EnumC79647VNr.Enable) {
            return true;
        }
        if (enumC79647VNr == EnumC79647VNr.Disable || (parent = parent()) == null) {
            return false;
        }
        return parent.eventThrough();
    }

    @Override // X.VPY
    public final VPY parent() {
        return this.LJLJI.get();
    }

    @Override // X.VPY
    public final boolean enableTouchPseudoPropagation() {
        return this.LJLJL;
    }

    @Override // X.VPY
    public final java.util.Map<String, VNA> getEvents() {
        return this.LJLJJI;
    }

    @Override // X.VPY
    public final int getPseudoStatus() {
        return this.LJLILLLLZI;
    }

    @Override // X.VPY
    public final int getSign() {
        return this.LJLIL;
    }

    @Override // X.VPY
    public final boolean ignoreFocus() {
        return this.LJLJJL;
    }

    @Override // X.VPY
    public final void onPseudoStatusChanged(int i, int i2) {
        this.LJLILLLLZI = i2;
    }

    public C79686VPe(int i, java.util.Map<String, VNA> map, boolean z, boolean z2, EnumC79647VNr enumC79647VNr) {
        new Matrix();
        this.LJLIL = i;
        this.LJLJI = null;
        this.LJLJJL = z;
        this.LJLJJLL = enumC79647VNr;
        this.LJLJL = z2;
        if (map != null) {
            HashMap hashMap = new HashMap();
            this.LJLJJI = hashMap;
            hashMap.putAll(map);
            return;
        }
        this.LJLJJI = null;
    }
}
