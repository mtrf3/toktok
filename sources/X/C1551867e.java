package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import defpackage.a1;

/* renamed from: X.67e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1551867e extends C1551767d {
    public int LLIIIILZ;

    @Override // X.C1551767d
    public final float LJIIJ() {
        return 8.0f;
    }

    @Override // X.C1551767d
    public final int LJIIL(int i, int i2, int i3) {
        return i3;
    }

    @Override // X.C1551767d, X.C65A
    public int getDefaultTextSize() {
        return this.LLIIIILZ;
    }

    @Override // X.C1551767d
    public final int LJII(int i) {
        return i + this.LJLJJLL;
    }

    @Override // X.C1551767d
    public final int LJIIIIZZ(int i) {
        return Math.max(i, getPaddingTop());
    }

    @Override // X.C1551767d
    public final void LJIIIZ(String str) {
        InterfaceC159496Nt interfaceC159496Nt = this.LLFF;
        if (interfaceC159496Nt != null) {
            interfaceC159496Nt.LIZIZ();
        }
    }

    @Override // X.C1551767d, X.C65A
    public void setDefaultTextSize(int i) {
        this.LLIIIILZ = i;
    }

    public final void setSafeAreaHeight(int i) {
        this.LLFII.LIZJ = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1551867e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        setUseAutoTextSize(true);
        this.LLIIIILZ = 20;
    }

    @Override // X.C1551767d
    public final int LJIIJJI(int i, String str) {
        return (int) getPaint().measureText(str);
    }

    @Override // X.C1551767d
    public final void LJIILJJIL(int i, int i2) {
        this.LJLZ = i;
        this.LJZ = i2;
        if (this.LJLLLLLL) {
            setMaskBlurColor(i2);
            this.LJLLI = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.LJLLI = 4;
                    this.LJLL = i2;
                    this.LJLJLJ.setColor(C1553767x.LIZ(i2));
                    setBackground(null);
                    setTextColor(i2);
                    setShadowLayer(12.0f, 0.0f, 0.0f, 0);
                    if (Build.VERSION.SDK_INT < 28) {
                        return;
                    }
                    setFallbackLineSpacing(false);
                    return;
                }
                this.LJLLI = 3;
                this.LJLL = C1551767d.LJIILIIL(i2);
                setTextColor(-1);
                return;
            }
            this.LJLLI = 2;
            this.LJLL = i2;
            if (i2 == -1) {
                setTextColor(-16777216);
                return;
            } else {
                setTextColor(-1);
                return;
            }
        }
        this.LJLLI = 1;
        this.LJLL = i2;
        setBackground(null);
        setTextColor(i2);
    }
}
