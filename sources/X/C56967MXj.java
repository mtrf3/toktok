package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.MXj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56967MXj extends C56968MXk {
    public static final int LL = (int) KL2.LIZJ(EF7.LIZIZ(), 12.0f);
    public final int LJLL;
    public final int LJLLI;
    public int LJLLILLLL;
    public final boolean LJLLJ;
    public boolean LJLLL;
    public final C62822Ol8 LJLLLL;
    public final float LJLLLLLL;
    public final int LJLZ;
    public final Drawable LJZ;
    public final int LJZI;
    public final Drawable LJZL;

    @Override // X.C56968MXk
    public int getLayout() {
        return R.layout.v5;
    }

    private final int getVerticalOutsidePadding() {
        return ((Number) this.LJLLLL.getValue()).intValue();
    }

    public static void LIZJ(C56967MXj c56967MXj) {
        int i;
        Context context = c56967MXj.getContext();
        float f = C25815ABf.LIZ;
        float f2 = 0.0f;
        if (f > 0.0f) {
            i = (int) f;
        } else {
            if (context != null) {
                int[] iArr = {R.string.ibm, R.string.exk, R.string.ie7, R.string.ibq, R.string.iwz, R.string.iy1, R.string.exm, R.string.gix};
                Paint paint = new Paint();
                paint.setTextSize(KL2.LIZJ(context, 14.0f));
                float LIZJ = KL2.LIZJ(context, 88.0f);
                float LIZJ2 = KL2.LIZJ(context, 120.0f);
                for (int i2 = 0; i2 < 8; i2++) {
                    float measureText = paint.measureText(context.getString(iArr[i2])) - 0.5f;
                    if (measureText > f2) {
                        f2 = measureText;
                    }
                }
                f2 += KL2.LIZJ(context, 16.0f) - 0.5f;
                if (f2 > LIZJ2) {
                    f2 = LIZJ2;
                } else if (f2 < LIZJ) {
                    f2 = LIZJ;
                }
            }
            C25815ABf.LIZ = f2;
            i = (int) f2;
        }
        C56970MXm c56970MXm = c56967MXj.LJLIL;
        if (c56970MXm == null) {
            return;
        }
        int i3 = c56967MXj.LJLLILLLL;
        c56970MXm.setPadding(i3, 0, i3, 0);
        if (!c56967MXj.LJLLL) {
            C56970MXm mMainBtn = c56967MXj.LJLIL;
            o.LJIIIIZZ(mMainBtn, "mMainBtn");
            C51736KSe.LIZ(mMainBtn, c56967MXj.LJLLI, c56967MXj.LJLL, i);
        }
        c56967MXj.LJLIL.setFontType("medium");
    }

    @Override // X.C56968MXk, X.InterfaceC56973MXp
    public final int LIZ(TextView textView) {
        o.LJIIIZ(textView, "textView");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.gkd));
        arrayList.add(Integer.valueOf(R.string.exk));
        arrayList.add(Integer.valueOf(R.string.gk4));
        arrayList.add(Integer.valueOf(R.string.exm));
        arrayList.add(Integer.valueOf(R.string.gix));
        int LJJIJIIJI = C78983UzD.LJJIJIIJI(textView, arrayList, (int) KL2.LIZJ(getContext(), this.LJLLLLLL), (int) KL2.LIZJ(getContext(), this.LJLLLLLL));
        int i = this.LJLJJI;
        if (LJJIJIIJI > i) {
            return LJJIJIIJI;
        }
        return i;
    }

    public final void setButtonHorizontalPadding(int i) {
        this.LJLLILLLL = (int) KL2.LIZJ(EF7.LIZIZ(), i);
    }

    @Override // X.C56968MXk
    public void setDoubleFollowButtonText(String str) {
        Long l;
        String LIZ;
        if (this.LJLLJ) {
            if (str != null) {
                l = C38350F3i.LJJIZ(str);
            } else {
                l = null;
            }
            if (l == null) {
                LIZ = getResources().getString(R.string.i3_);
                o.LJIIIIZZ(LIZ, "{\n                resour…age_button)\n            }");
            } else {
                InterfaceC57106Mb8 imSayHiService = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
                Context context = getContext();
                o.LJIIIIZZ(context, "this.context");
                LIZ = C57107Mb9.LIZ(imSayHiService, context, str, (getLayoutParams().width - getPaddingLeft()) - getPaddingRight(), 4);
                if (LIZ == null) {
                    LIZ = getResources().getString(R.string.i3_);
                    o.LJIIIIZZ(LIZ, "resources.getString(R.string.message_button)");
                }
            }
            this.LJLIL.setText(LIZ);
            return;
        }
        this.LJLIL.setText(getResources().getText(R.string.exk));
    }

    @Override // X.C56968MXk
    public void setFollowButtonTextAndIcon(int i) {
        if (i == 1) {
            if (getResources() == null) {
                return;
            } else {
                this.LJLIL.setText(getResources().getText(R.string.gix));
            }
        } else {
            super.setFollowButtonTextAndIcon(i);
        }
        LIZJ(this);
    }

    @Override // X.C56968MXk
    public void setFollowStatus(int i) {
        super.setFollowStatus(i);
        LIZJ(this);
        post(new C9AF(this, getVerticalOutsidePadding(), getVerticalOutsidePadding()));
    }

    @Override // X.C56968MXk
    public void setText(String text) {
        o.LJIIIZ(text, "text");
        setVisibility(0);
        setFollowButtonStyle(-1);
        this.LJLIL.setText(text);
        this.LJLIL.setTextColor(this.LJLZ);
        this.LJLIL.setBackground(this.LJZL);
    }

    public final void setTextSize(float f) {
        this.LJLIL.setTextSize(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56967MXj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2;
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLL = 14;
        this.LJLLI = 10;
        this.LJLLILLLL = LL;
        this.LJLLJ = !C78966Uyw.LJJIJ().LIZIZ();
        this.LJLLLL = C221108m2.LIZIZ(C92X.LJLIL);
        this.LJLLLLLL = 64.0f;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C25600zU LJII = C78605Ut7.LJII(context2, false);
        Integer LJI = C79045V0n.LJI(R.attr.dj, LJII);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LJLZ = i;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        this.LJZ = c110614Vt.LIZ(LJII);
        Integer LJI2 = C79045V0n.LJI(R.attr.go, LJII);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        this.LJZI = i2;
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZ = 0;
        c110614Vt2.LIZJ = C61328O5c.LIZJ(2);
        c110614Vt2.LJII = C7MY.LIZIZ(35);
        c110614Vt2.LJI = C7MY.LIZIZ(18);
        c110614Vt2.LJFF = Integer.valueOf(R.attr.dz);
        c110614Vt2.LIZLLL = AnonymousClass391.LIZJ(1);
        this.LJZL = c110614Vt2.LIZ(LJII);
    }

    @Override // X.C56968MXk, X.InterfaceC51700KQu
    public final void LJJI(int i, int i2) {
        setVisibility(0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            setFollowButtonStyle(-1);
                            this.LJLIL.setText(getResources().getText(R.string.gk4));
                            this.LJLIL.setTextColor(this.LJZI);
                            this.LJLIL.setBackground(this.LJZL);
                            if (Build.VERSION.SDK_INT >= 23) {
                                this.LJLIL.setForeground(null);
                            }
                        }
                    } else {
                        setVisibility(8);
                    }
                } else {
                    setFollowButtonStyle(-1);
                    setDoubleFollowButtonText(null);
                    this.LJLIL.setTextColor(this.LJZI);
                    this.LJLIL.setBackground(this.LJZL);
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.LJLIL.setForeground(null);
                    }
                }
            } else {
                setFollowButtonStyle(-1);
                this.LJLIL.setText(getResources().getText(R.string.gkd));
                this.LJLIL.setTextColor(this.LJZI);
                this.LJLIL.setBackground(this.LJZL);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.LJLIL.setForeground(null);
                }
            }
        } else {
            setFollowButtonTextAndIcon(i2);
            this.LJLIL.setTextColor(this.LJLZ);
            this.LJLIL.setBackground(this.LJZ);
            C56970MXm mMainBtn = this.LJLIL;
            o.LJIIIIZZ(mMainBtn, "mMainBtn");
            C78897Uxp.LJJJJJL(mMainBtn, C32151Nz.LJIIZILJ(2));
        }
        this.LJLILLLLZI = i;
        post(new C9AF(this, getVerticalOutsidePadding(), getVerticalOutsidePadding()));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C56970MXm mMainBtn = this.LJLIL;
        o.LJIIIIZZ(mMainBtn, "mMainBtn");
        C56971MXn.LIZ(C56967MXj.class, new C56972MXo(LIZ(mMainBtn)));
    }

    @Override // X.C56968MXk
    public final void LIZIZ(Context context, AttributeSet attributeSet, int i) {
        C56970MXm c56970MXm = (C56970MXm) C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), getLayout(), this, true).findViewById(R.id.awa);
        this.LJLIL = c56970MXm;
        c56970MXm.LJLJL = this;
        c56970MXm.setBackground(this.LJZ);
        C56970MXm mMainBtn = this.LJLIL;
        o.LJIIIIZZ(mMainBtn, "mMainBtn");
        C78897Uxp.LJJJJJL(mMainBtn, C32151Nz.LJIIZILJ(2));
        this.LJLILLLLZI = 0;
        this.LJLIL.setCompoundDrawablePadding((int) KL2.LIZJ(context, 2.0f));
    }
}
