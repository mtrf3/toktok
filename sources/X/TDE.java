package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TDE extends TDG {
    public static final int LLJJI = (int) C74275TDb.LIZIZ(C82891Wg3.LIZ(), 2.0f);
    public static final int LLJJIII = (int) C74275TDb.LIZIZ(C82891Wg3.LIZ(), 3.0f);
    public TDU LLILLIZIL;
    public ImageView LLILLJJLI;
    public ImageView LLILLL;
    public final C62822Ol8 LLILZ;
    public final Animation LLILZIL;
    public final Animation LLILZLL;
    public boolean LLIZ;
    public final C62822Ol8 LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final int LLJJ;

    private final ImageView getDownloadImgCenterOpt() {
        return (ImageView) this.LLILZ.getValue();
    }

    private final ViewStub getLibraryLayoutStub() {
        return (ViewStub) this.LLIZLLLIL.getValue();
    }

    @Override // X.TDG
    public int LJI() {
        return R.layout.cre;
    }

    public final void LJIJJ() {
        if (this.LLJILJILJ) {
            LJIIL(false);
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            imageView.setVisibility(8);
            TDU tdu = this.LLILLIZIL;
            if (tdu != null) {
                tdu.setVisibility(4);
                return;
            } else {
                o.LJIJI("progressView");
                throw null;
            }
        }
        o.LJIJI("downloadImg");
        throw null;
    }

    public final void LJIJJLI() {
        int i;
        if (this.LLJILJILJ && !this.LLJILLL) {
            LJIIL(true);
            return;
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            if (!this.LLJILLL) {
                i = 4;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            TDU tdu = this.LLILLIZIL;
            if (tdu != null) {
                tdu.setVisibility(0);
                TDU tdu2 = this.LLILLIZIL;
                if (tdu2 != null) {
                    tdu2.setProgress(0);
                    return;
                } else {
                    o.LJIJI("progressView");
                    throw null;
                }
            }
            o.LJIJI("progressView");
            throw null;
        }
        o.LJIJI("downloadImg");
        throw null;
    }

    public final void LJIL() {
        if (this.LLIZ && this.LLJILJIL && !this.LLJILJILJ && !this.LLJILLL) {
            ImageView imageView = this.LLILLJJLI;
            if (imageView != null) {
                imageView.setVisibility(0);
            } else {
                o.LJIJI("downloadImg");
                throw null;
            }
        } else {
            ImageView imageView2 = this.LLILLJJLI;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            } else {
                o.LJIJI("downloadImg");
                throw null;
            }
        }
        if (this.LLJILJILJ) {
            LJIIL(false);
        }
        TDU tdu = this.LLILLIZIL;
        if (tdu != null) {
            tdu.setVisibility(4);
        } else {
            o.LJIJI("progressView");
            throw null;
        }
    }

    private final ImageView getDownloadImgCenter() {
        if (getEnableSimplifyLayout()) {
            LJIILL();
            return getDownloadImgCenterOpt();
        }
        return this.LLILLL;
    }

    public final void LJIILL() {
        ViewStub libraryLayoutStub;
        ViewStub libraryLayoutStub2 = getLibraryLayoutStub();
        if (libraryLayoutStub2 != null && libraryLayoutStub2.getParent() != null && (libraryLayoutStub = getLibraryLayoutStub()) != null) {
            libraryLayoutStub.inflate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL() {
        /*
            r5 = this;
            r0 = 2131368664(0x7f0a1ad8, float:1.8357284E38)
            android.view.View r2 = r5.findViewById(r0)
            r1 = r2
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            boolean r0 = r5.LLJILLL
            r4 = 8
            if (r0 == 0) goto Lbf
            r0 = 8
        L12:
            r1.setVisibility(r0)
            int r0 = r5.LLJ
            r1.setImageResource(r0)
            java.lang.String r0 = "findViewById<ImageView>(…es)\n                    }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5.LLILLJJLI = r2
            boolean r0 = r5.LLJILLL
            r2 = 0
            if (r0 == 0) goto L30
            android.view.View r1 = r5.getImageViewContainer()
            boolean r0 = r1 instanceof android.widget.FrameLayout
            if (r0 != 0) goto L7c
        L30:
            r0 = 2131369494(0x7f0a1e16, float:1.8358968E38)
            android.view.View r3 = r5.findViewById(r0)
            r4 = r3
            X.TDU r4 = (X.TDU) r4
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131100495(0x7f06034f, float:1.7813373E38)
            int r0 = r1.getColor(r0)
            r4.setBgCircleColor(r0)
            r0 = -1
            r4.setProgressColor(r0)
            int r0 = X.TDE.LLJJI
            r4.setCircleWidth(r0)
            int r0 = X.TDE.LLJJIII
            r4.setBgCircleWidth(r0)
            java.lang.String r0 = "findViewById<CircleProgr…(bgCircleWidth)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            X.TDU r3 = (X.TDU) r3
        L5d:
            r5.LLILLIZIL = r3
            X.Wg6 r0 = X.C82894Wg6.LIZIZ
            boolean r0 = r0.LJIIIIZZ()
            if (r0 != 0) goto L7b
            r0 = 2131369495(0x7f0a1e17, float:1.835897E38)
            android.view.View r1 = r5.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L79
            r0 = 2131231032(0x7f080138, float:1.8078134E38)
            r1.setImageResource(r0)
            r2 = r1
        L79:
            r5.LLILLL = r2
        L7b:
            return
        L7c:
            if (r1 == 0) goto L30
            X.TDV r3 = new X.TDV
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.<init>(r1, r2)
            r0 = 2131369497(0x7f0a1e19, float:1.8358974E38)
            r3.setId(r0)
            int r0 = r5.LLJJ
            float r0 = (float) r0
            float r0 = X.C74275TDb.LIZ(r0)
            int r0 = (int) r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            r3.setLayoutParams(r1)
            r3.setVisibility(r4)
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = X.C74275TDb.LIZ(r0)
            r3.setCircleRadius(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.C74275TDb.LIZ(r0)
            r3.setViewBorderRadius(r0)
            r5.addView(r3)
            goto L5d
        Lbf:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TDE.LJIILLIIL():void");
    }

    public final boolean getEnableSimplifyLayout() {
        if (getSimpleLayoutMode() && C82894Wg6.LIZIZ.LJIIIIZZ()) {
            return true;
        }
        return false;
    }

    public final int getCircleLoadingV2Size() {
        return this.LLJJ;
    }

    public final int getDownloadIconRes() {
        return this.LLJ;
    }

    public final boolean getEnableDotView() {
        return this.LLJIJIL;
    }

    public final int getLoadingIconRes() {
        return this.LLJI;
    }

    public final boolean getShouldShowDownloadImg() {
        return this.LLJILJIL;
    }

    public final boolean getUseCenterLoadingImg() {
        return this.LLJILJILJ;
    }

    @Override // X.TDG
    public View LJFF(Context context) {
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(context, "context");
        if (!getEnableSimplifyLayout()) {
            return super.LJFF(context);
        }
        View LJIILIIL = LJIILIIL(context);
        if (this.LLIIJI) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(getImgWidth(), getImgHeight());
        }
        LJIILIIL.setLayoutParams(layoutParams);
        return LJIILIIL;
    }

    @Override // X.TDG
    public View LJII(Context context) {
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        C74253TCf c74253TCf = new C74253TCf(context);
        c74253TCf.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c74253TCf.setHorizontalFadingEdgeEnabled(true);
        c74253TCf.setMaxEms(4);
        c74253TCf.setLayoutParams(layoutParams);
        c74253TCf.setGravity(17);
        if (this.LLIILII) {
            c74253TCf.setSingleLine();
            c74253TCf.setEllipsize(TextUtils.TruncateAt.END);
        }
        return c74253TCf;
    }

    public final void LJIIL(boolean z) {
        ImageView downloadImgCenter;
        ImageView downloadImgCenter2;
        if (z) {
            Animation animation = this.LLILZLL;
            if ((animation == null || !animation.hasStarted()) && (downloadImgCenter2 = getDownloadImgCenter()) != null) {
                downloadImgCenter2.clearAnimation();
                downloadImgCenter2.setVisibility(0);
                downloadImgCenter2.startAnimation(this.LLILZLL);
                return;
            }
            return;
        }
        Animation animation2 = this.LLILZLL;
        if ((animation2 == null || animation2.hasStarted()) && (downloadImgCenter = getDownloadImgCenter()) != null) {
            downloadImgCenter.setVisibility(4);
            downloadImgCenter.clearAnimation();
        }
    }

    public View LJIILIIL(Context context) {
        o.LJIIIZ(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.crm);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C72790ShW c72790ShW = new C72790ShW(context);
        c72790ShW.setId(R.id.csp);
        c72790ShW.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        c72790ShW.setLayoutParams(layoutParams);
        frameLayout.addView(c72790ShW);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.nc4);
        viewStub.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        viewStub.setLayoutResource(R.layout.cs3);
        frameLayout.addView(viewStub);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.ek3);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        int LIZ = (int) C74275TDb.LIZ(16.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(LIZ, LIZ);
        layoutParams2.gravity = 8388693;
        int LIZ2 = (int) C74275TDb.LIZ(1.0f);
        layoutParams2.setMargins(LIZ2, LIZ2, LIZ2, LIZ2);
        imageView.setLayoutParams(layoutParams2);
        imageView.setVisibility(0);
        imageView.setImageDrawable(imageView.getResources().getDrawable(R.drawable.tf));
        frameLayout.addView(imageView);
        TDU tdu = new TDU(context, null);
        tdu.setId(R.id.f6h);
        int LIZ3 = (int) C74275TDb.LIZ(16.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(LIZ3, LIZ3);
        layoutParams3.gravity = 8388693;
        int LIZ4 = (int) C74275TDb.LIZ(1.0f);
        layoutParams3.setMargins(LIZ4, LIZ4, LIZ4, LIZ4);
        tdu.setLayoutParams(layoutParams3);
        tdu.setVisibility(8);
        tdu.setBackground(tdu.getResources().getDrawable(R.drawable.tg));
        tdu.setCircleRadius(C74275TDb.LIZ(5.0f));
        frameLayout.addView(tdu);
        return frameLayout;
    }

    public final void LJIIZILJ(boolean z) {
        LJIILL();
        if (z) {
            View findViewById = findViewById(R.id.jsc);
            o.LJIIIIZZ(findViewById, "findViewById<View>(R.id.shadow_text_view)");
            findViewById.setVisibility(0);
        } else {
            View findViewById2 = findViewById(R.id.jsc);
            o.LJIIIIZZ(findViewById2, "findViewById<View>(R.id.shadow_text_view)");
            findViewById2.setVisibility(8);
        }
    }

    public final void LJIJ(Long l) {
        LJIILL();
        if (l != null && l.longValue() > 0) {
            int longValue = (int) (l.longValue() / 1000);
            View findViewById = findViewById(R.id.mnw);
            o.LJIIIIZZ(findViewById, "findViewById<TextView>(R.id.tv_time_stamp)");
            String LLLZ = C16880lQ.LLLZ("%2d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(longValue / 60), Integer.valueOf(longValue % 60)}, 2));
            o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
            ((TextView) findViewById).setText(LLLZ);
            View findViewById2 = findViewById(R.id.mnw);
            o.LJIIIIZZ(findViewById2, "findViewById<TextView>(R.id.tv_time_stamp)");
            findViewById2.setVisibility(0);
            return;
        }
        View findViewById3 = findViewById(R.id.mnw);
        o.LJIIIIZZ(findViewById3, "findViewById<TextView>(R.id.tv_time_stamp)");
        findViewById3.setVisibility(8);
    }

    public final void LJIJI(int i) {
        int i2;
        if (this.LLJILJILJ) {
            LJIIL(true);
            return;
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            if (!this.LLJILLL) {
                i2 = 4;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            TDU tdu = this.LLILLIZIL;
            if (tdu != null) {
                if (tdu.getVisibility() != 0) {
                    TDU tdu2 = this.LLILLIZIL;
                    if (tdu2 != null) {
                        tdu2.setVisibility(0);
                    } else {
                        o.LJIJI("progressView");
                        throw null;
                    }
                }
                TDU tdu3 = this.LLILLIZIL;
                if (tdu3 != null) {
                    tdu3.setProgress(i);
                    return;
                } else {
                    o.LJIJI("progressView");
                    throw null;
                }
            }
            o.LJIJI("progressView");
            throw null;
        }
        o.LJIJI("downloadImg");
        throw null;
    }

    public final void setShowDownloadIcon(boolean z) {
        this.LLIZ = z;
    }

    public final void LJIILJJIL(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        LJIJI(i2);
                        return;
                    }
                    LJIJJ();
                    return;
                }
                LJIL();
                return;
            }
            LJIJJLI();
            return;
        }
        LJIJJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TDE(android.content.Context r46, boolean r47, int r48, int r49, int r50, int r51, int r52, int r53, boolean r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, boolean r62, boolean r63, int r64, int r65, int r66, int r67, int r68, int r69, int r70, boolean r71, boolean r72, boolean r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80, int r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TDE.<init>(android.content.Context, boolean, int, int, int, int, int, int, boolean, int, int, int, int, int, int, int, boolean, boolean, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, int):void");
    }
}
