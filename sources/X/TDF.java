package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TDF extends TDE {
    @Override // X.TDE, X.TDG
    public final int LJI() {
        return R.layout.cre;
    }

    @Override // X.TDG
    public final void LIZ() {
        int imgWidth;
        int imgHeight;
        int i;
        int imgLayoutWidth;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, getBorderWidth());
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int LIZIZ2 = (int) C74275TDb.LIZIZ(context2, getBorderPadding());
        if (getEnableBorder() && !getEnableExpandBorder()) {
            imgWidth = getImgWidth() + (LIZIZ2 * 2) + (LIZIZ * 2);
        } else {
            imgWidth = getImgWidth();
        }
        setImgLayoutWidth(imgWidth);
        if (getEnableBorder() && !getEnableExpandBorder()) {
            imgHeight = getImgHeight() + (LIZIZ2 * 2) + (LIZIZ * 2);
        } else {
            imgHeight = getImgHeight();
        }
        setImgLayoutHeight(imgHeight);
        if (getEnableBorder()) {
            if (getEnableExpandBorder()) {
                float containerWidth = getContainerWidth();
                Context context3 = getContext();
                o.LJIIIIZZ(context3, "context");
                float LIZ = (containerWidth - (C146035oF.LIZ(context3, getImageMarginLeft()) * 2)) - (LIZIZ * 2);
                if (LIZ > 0) {
                    if (getEnableCellStyle()) {
                        i = -1;
                    } else {
                        i = (int) LIZ;
                    }
                    setImgLayoutWidth(i);
                    if (getEnableCellStyle()) {
                        imgLayoutWidth = -2;
                    } else {
                        imgLayoutWidth = getImgLayoutWidth();
                    }
                    setImgLayoutHeight(imgLayoutWidth);
                }
            }
            if (getEnableNewStickerPanel() && this.LLILIL) {
                setImgLayoutWidth(-1);
                setImgLayoutHeight(getImgLayoutWidth());
            }
        }
    }

    public final ViewGroup.LayoutParams LJJ() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, getBorderWidth());
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int containerWidth = (getContainerWidth() - (LIZIZ * 2)) - (((int) C74275TDb.LIZIZ(context2, getBorderPadding())) * 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (getEnableCellStyle() && !this.LLILIL) {
            layoutParams.topMargin = LIZIZ;
            return new FrameLayout.LayoutParams(containerWidth, containerWidth);
        }
        if (LJIIJJI()) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return new FrameLayout.LayoutParams(getImgWidth(), getImgHeight());
    }

    @Override // X.TDG
    public View getBorderLayout() {
        if (getEnableBorder() && getBorderView() == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            View LIZLLL = LIZLLL(context);
            addView(LIZLLL);
            setBorderView(LIZLLL);
        }
        return getBorderView();
    }

    @Override // X.TDG
    public final View LIZLLL(Context context) {
        int imgWidth;
        float roundRadius;
        GradientDrawable LIZ;
        int LIZIZ = (int) C74275TDb.LIZIZ(context, getBorderWidth());
        int LIZIZ2 = (int) C74275TDb.LIZIZ(context, getBorderPadding());
        int i = -1;
        if (getEnableCellStyle() && !this.LLILIL) {
            imgWidth = getContainerWidth();
        } else if (LJIIJJI()) {
            imgWidth = -1;
        } else {
            imgWidth = getImgWidth() + (LIZIZ2 * 2) + (LIZIZ * 2);
        }
        if (getEnableCellStyle() && !this.LLILIL) {
            i = getContainerWidth();
        } else if (!LJIIJJI()) {
            i = getImgHeight() + (LIZIZ2 * 2) + (LIZIZ * 2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(imgWidth, i);
        layoutParams.gravity = 1;
        View view = new View(context);
        view.setLayoutParams(layoutParams);
        int color = context.getResources().getColor(getBorderColorRes());
        if (this.LJLLL) {
            TDY tdy = new TDY();
            tdy.LIZLLL(1);
            tdy.LIZIZ(0);
            tdy.LJ(color, LIZIZ);
            LIZ = tdy.LIZ();
        } else {
            TDY tdy2 = new TDY();
            tdy2.LIZLLL(0);
            tdy2.LIZIZ(0);
            tdy2.LJ(color, LIZIZ);
            if (this.LLILIL) {
                roundRadius = C74275TDb.LIZIZ(context, 12.0f);
            } else {
                roundRadius = getRoundRadius();
            }
            tdy2.LIZJ(roundRadius);
            LIZ = tdy2.LIZ();
        }
        view.setBackground(LIZ);
        return view;
    }

    @Override // X.TDE, X.TDG
    public final View LJFF(Context context) {
        int imgWidth;
        int imgHeight;
        o.LJIIIZ(context, "context");
        if (!getEnableSimplifyLayout()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            View content = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cre, frameLayout, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            o.LJIIIIZZ(content, "content");
            content.setLayoutParams(layoutParams);
            frameLayout.addView(content);
            View findViewById = content.findViewById(R.id.csp);
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            if (LJIIJJI()) {
                imgWidth = getImgLayoutWidth();
            } else {
                imgWidth = getImgWidth();
            }
            if (getEnableCellStyle()) {
                imgHeight = imgWidth;
            } else if (LJIIJJI()) {
                imgHeight = getImgLayoutHeight();
            } else {
                imgHeight = getImgHeight();
            }
            layoutParams2.width = (int) (imgWidth * 1.2d);
            layoutParams2.height = (int) (imgHeight * 1.2d);
            findViewById.setLayoutParams(layoutParams2);
            frameLayout.setLayoutParams(LJJ());
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new C74260TCm(this));
            return frameLayout;
        }
        return LJIILIIL(context);
    }

    @Override // X.TDE
    public final View LJIILIIL(Context context) {
        int imgHeight;
        o.LJIIIZ(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.crm);
        frameLayout.setLayoutParams(LJJ());
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new C74261TCn(this));
        C72790ShW c72790ShW = new C72790ShW(context);
        c72790ShW.setId(R.id.csp);
        c72790ShW.setScaleType(ImageView.ScaleType.FIT_XY);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context2, getBorderWidth());
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        int containerWidth = (getContainerWidth() - (LIZIZ * 2)) - (((int) C74275TDb.LIZIZ(context3, getBorderPadding())) * 2);
        if (getEnableCellStyle() && this.LLILIL) {
            containerWidth = getImgLayoutWidth();
        } else if (!getEnableCellStyle()) {
            if (LJIIJJI()) {
                containerWidth = getImgLayoutWidth();
            } else {
                containerWidth = getImgWidth();
            }
        }
        if (getEnableCellStyle()) {
            imgHeight = containerWidth;
        } else if (LJIIJJI()) {
            imgHeight = getImgLayoutHeight();
        } else {
            imgHeight = getImgHeight();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (containerWidth * 1.2d), (int) (imgHeight * 1.2d));
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

    @Override // X.TDG
    public final void LIZIZ(LinearLayout linearLayout, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        if (getEnableCellStyle()) {
            if (this.LLILIL) {
                i = -1;
            } else {
                i = -2;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i);
            layoutParams2.gravity = 17;
            linearLayout.setLayoutParams(layoutParams2);
            linearLayout.setOrientation(1);
            return;
        }
        int containerWidth = getContainerWidth();
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "context");
        int LIZ = containerWidth - (((int) C146035oF.LIZ(context, getBorderWidth())) * 2);
        int containerHeight = getContainerHeight();
        Context context2 = linearLayout.getContext();
        o.LJIIIIZZ(context2, "context");
        int LIZ2 = containerHeight - (((int) C146035oF.LIZ(context2, getBorderWidth())) * 2);
        if (getEnableExpandBorder() && !this.LLILIL) {
            layoutParams = new FrameLayout.LayoutParams(LIZ, LIZ2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        if (getEnableExpandBorder()) {
            TDY tdy = new TDY();
            tdy.LIZLLL(0);
            Context context3 = linearLayout.getContext();
            o.LJIIIIZZ(context3, "context");
            tdy.LIZIZ(context3.getResources().getColor(R.color.b4));
            tdy.LIZJ(getRoundRadius());
            linearLayout.setBackground(tdy.LIZ());
        }
    }

    @Override // X.TDG
    public final void LJIIIIZZ(boolean z, boolean z2) {
        super.LJIIIIZZ(z, z2);
        View imageViewContainer = getImageViewContainer();
        imageViewContainer.setClipToOutline(true);
        imageViewContainer.setOutlineProvider(new C74262TCo(this, z));
    }

    @Override // X.TDG
    public final void LJIIIZ(View imageViewContainer, FrameLayout frameLayout, int i, int i2, boolean z) {
        o.LJIIIZ(imageViewContainer, "imageViewContainer");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.gravity = 1;
        if (getEnableExpandBorder() && !this.LLILIL && !getEnableCellStyle()) {
            Context context = frameLayout.getContext();
            o.LJIIIIZZ(context, "imageLayoutContainer.context");
            layoutParams.topMargin = (int) C74275TDb.LIZIZ(context, getImageMarginTop());
            Context context2 = frameLayout.getContext();
            o.LJIIIIZZ(context2, "imageLayoutContainer.context");
            layoutParams.setMarginStart((int) C74275TDb.LIZIZ(context2, getImageMarginLeft()));
            Context context3 = frameLayout.getContext();
            o.LJIIIIZZ(context3, "imageLayoutContainer.context");
            layoutParams.leftMargin = (int) C74275TDb.LIZIZ(context3, getImageMarginLeft());
            Context context4 = frameLayout.getContext();
            o.LJIIIIZZ(context4, "imageLayoutContainer.context");
            layoutParams.rightMargin = (int) C74275TDb.LIZIZ(context4, getImageMarginLeft());
            Context context5 = frameLayout.getContext();
            o.LJIIIIZZ(context5, "imageLayoutContainer.context");
            layoutParams.setMarginEnd((int) C74275TDb.LIZIZ(context5, getImageMarginLeft()));
        }
        if (getEnableCellStyle() && !this.LLILIL) {
            Context context6 = frameLayout.getContext();
            o.LJIIIIZZ(context6, "imageLayoutContainer.context");
            layoutParams.topMargin = (int) C74275TDb.LIZIZ(context6, 3.0f);
        }
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(imageViewContainer.getLayoutParams());
        layoutParams2.gravity = 17;
        imageViewContainer.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TDF(Context context, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, int i8, int i9, int i10, int i11, boolean z3, boolean z4, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(context, z, i, i2, i3, i4, i5, i6, z2, i7, i8, i9, i10, 0, 0, i11, z3, z4, i12, i13, i14, i15, i16, i17, i18, z5, z6, false, false, z7, z8, false, z9, z10, z12, 0, -1744830464, 16);
        o.LJIIIZ(context, "context");
        LJIILLIIL();
    }
}
