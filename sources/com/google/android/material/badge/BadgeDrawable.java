package com.google.android.material.badge;

import X.C16310kV;
import X.C80229VeD;
import X.C80240VeO;
import X.C80244VeS;
import X.C80268Veq;
import X.C80418VhG;
import X.InterfaceC80242VeQ;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* loaded from: classes15.dex */
public final class BadgeDrawable extends Drawable implements InterfaceC80242VeQ {
    public final WeakReference<Context> LJLIL;
    public final C80418VhG LJLILLLLZI;
    public final C80240VeO LJLJI;
    public final Rect LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public final float LJLJL;
    public final SavedState LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public int LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public WeakReference<View> LJLLLL;
    public WeakReference<FrameLayout> LJLLLLLL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final FrameLayout LIZLLL() {
        WeakReference<FrameLayout> weakReference = this.LJLLLLLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean LJFF() {
        if (this.LJLJLJ.number != -1) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ() {
        int i;
        float f;
        float f2;
        float f3;
        FrameLayout frameLayout;
        Context context = this.LJLIL.get();
        WeakReference<View> weakReference = this.LJLLLL;
        View view = null;
        if (weakReference != null) {
            view = weakReference.get();
        }
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.LJLJJI);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.LJLLLLLL;
        if (weakReference2 != null && (frameLayout = weakReference2.get()) != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        int i2 = this.LJLJLJ.badgeGravity;
        if (i2 != 8388691 && i2 != 8388693) {
            this.LJLL = rect2.top + r7.verticalOffset;
        } else {
            this.LJLL = rect2.bottom - r7.verticalOffset;
        }
        if (LJ() <= 9) {
            if (!LJFF()) {
                f3 = this.LJLJJL;
            } else {
                f3 = this.LJLJJLL;
            }
            this.LJLLILLLL = f3;
            this.LJLLL = f3;
            this.LJLLJ = f3;
        } else {
            float f4 = this.LJLJJLL;
            this.LJLLILLLL = f4;
            this.LJLLL = f4;
            this.LJLLJ = (this.LJLJI.LIZ(LIZIZ()) / 2.0f) + this.LJLJL;
        }
        Resources resources = context.getResources();
        if (LJFF()) {
            i = R.dimen.zm;
        } else {
            i = R.dimen.zj;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int i3 = this.LJLJLJ.badgeGravity;
        if (i3 != 8388659 && i3 != 8388691) {
            if (C16310kV.LIZLLL(view) == 0) {
                f2 = ((rect2.right + this.LJLLJ) - dimensionPixelSize) - this.LJLJLJ.horizontalOffset;
            } else {
                f2 = (rect2.left - this.LJLLJ) + dimensionPixelSize + this.LJLJLJ.horizontalOffset;
            }
            this.LJLJLLL = f2;
        } else {
            if (C16310kV.LIZLLL(view) == 0) {
                f = (rect2.left - this.LJLLJ) + dimensionPixelSize + this.LJLJLJ.horizontalOffset;
            } else {
                f = ((rect2.right + this.LJLLJ) - dimensionPixelSize) - this.LJLJLJ.horizontalOffset;
            }
            this.LJLJLLL = f;
        }
        Rect rect3 = this.LJLJJI;
        float f5 = this.LJLJLLL;
        float f6 = this.LJLL;
        float f7 = this.LJLLJ;
        float f8 = this.LJLLL;
        rect3.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
        C80418VhG c80418VhG = this.LJLILLLLZI;
        c80418VhG.setShapeAppearanceModel(c80418VhG.LJLIL.LIZ.LJ(this.LJLLILLLL));
        if (rect.equals(this.LJLJJI)) {
            return;
        }
        this.LJLILLLLZI.setBounds(this.LJLJJI);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLJLJ.alpha;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJLJJI.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJLJJI.width();
    }

    public final String LIZIZ() {
        if (LJ() <= this.LJLLI) {
            return NumberFormat.getInstance().format(LJ());
        }
        Context context = this.LJLIL.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.i9q, Integer.valueOf(this.LJLLI), "+");
    }

    public final CharSequence LIZJ() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (LJFF()) {
            if (this.LJLJLJ.contentDescriptionQuantityStrings <= 0 || (context = this.LJLIL.get()) == null) {
                return null;
            }
            int LJ = LJ();
            int i = this.LJLLI;
            if (LJ <= i) {
                return context.getResources().getQuantityString(this.LJLJLJ.contentDescriptionQuantityStrings, LJ(), Integer.valueOf(LJ()));
            }
            return context.getString(this.LJLJLJ.contentDescriptionExceedsMaxBadgeNumberRes, Integer.valueOf(i));
        }
        return this.LJLJLJ.contentDescriptionNumberless;
    }

    public final int LJ() {
        if (!LJFF()) {
            return 0;
        }
        return this.LJLJLJ.number;
    }

    @Override // X.InterfaceC80242VeQ
    public final void LIZ() {
        invalidateSelf();
    }

    /* loaded from: classes15.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80268Veq();
        public int alpha;
        public int backgroundColor;
        public int badgeGravity;
        public int badgeTextColor;
        public int contentDescriptionExceedsMaxBadgeNumberRes;
        public CharSequence contentDescriptionNumberless;
        public int contentDescriptionQuantityStrings;
        public int horizontalOffset;
        public boolean isVisible;
        public int maxCharacterCount;
        public int number;
        public int verticalOffset;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(Parcel parcel) {
            boolean z;
            this.alpha = 255;
            this.number = -1;
            this.backgroundColor = parcel.readInt();
            this.badgeTextColor = parcel.readInt();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = parcel.readInt();
            this.horizontalOffset = parcel.readInt();
            this.verticalOffset = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.isVisible = z;
        }

        public SavedState(Context context) {
            this.alpha = 255;
            this.number = -1;
            this.badgeTextColor = new C80229VeD(context, R.style.nw).LIZ.getDefaultColor();
            this.contentDescriptionNumberless = context.getString(R.string.i9n);
            this.contentDescriptionQuantityStrings = R.plurals.j0;
            this.contentDescriptionExceedsMaxBadgeNumberRes = R.string.i9p;
            this.isVisible = true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.backgroundColor);
            parcel.writeInt(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeString(this.contentDescriptionNumberless.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeInt(this.badgeGravity);
            parcel.writeInt(this.horizontalOffset);
            parcel.writeInt(this.verticalOffset);
            parcel.writeInt(this.isVisible ? 1 : 0);
        }
    }

    public BadgeDrawable(Context context) {
        C80229VeD c80229VeD;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.LJLIL = weakReference;
        C80244VeS.LIZJ(context, C80244VeS.LIZIZ, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.LJLJJI = new Rect();
        this.LJLILLLLZI = new C80418VhG();
        this.LJLJJL = resources.getDimensionPixelSize(R.dimen.zl);
        this.LJLJL = resources.getDimensionPixelSize(R.dimen.zk);
        this.LJLJJLL = resources.getDimensionPixelSize(R.dimen.zq);
        C80240VeO c80240VeO = new C80240VeO(this);
        this.LJLJI = c80240VeO;
        c80240VeO.LIZ.setTextAlign(Paint.Align.CENTER);
        this.LJLJLJ = new SavedState(context);
        Context context3 = weakReference.get();
        if (context3 == null || c80240VeO.LJFF == (c80229VeD = new C80229VeD(context3, R.style.nw)) || (context2 = weakReference.get()) == null) {
            return;
        }
        c80240VeO.LIZIZ(c80229VeD, context2);
        LJIIIZ();
    }

    public final void LJI(int i) {
        FrameLayout frameLayout;
        SavedState savedState = this.LJLJLJ;
        if (savedState.badgeGravity != i) {
            savedState.badgeGravity = i;
            WeakReference<View> weakReference = this.LJLLLL;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.LJLLLL.get();
                WeakReference<FrameLayout> weakReference2 = this.LJLLLLLL;
                if (weakReference2 != null) {
                    frameLayout = weakReference2.get();
                } else {
                    frameLayout = null;
                }
                LJIIIIZZ(view, frameLayout);
            }
        }
    }

    public final void LJII(int i) {
        SavedState savedState = this.LJLJLJ;
        if (savedState.maxCharacterCount != i) {
            savedState.maxCharacterCount = i;
            this.LJLLI = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
            this.LJLJI.LIZLLL = true;
            LJIIIZ();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.LJLJLJ.alpha == 0 || !isVisible()) {
            return;
        }
        this.LJLILLLLZI.draw(canvas);
        if (!LJFF()) {
            return;
        }
        Rect rect = new Rect();
        String LIZIZ = LIZIZ();
        this.LJLJI.LIZ.getTextBounds(LIZIZ, 0, LIZIZ.length(), rect);
        canvas.drawText(LIZIZ, this.LJLJLLL, this.LJLL + (rect.height() / 2), this.LJLJI.LIZ);
    }

    @Override // android.graphics.drawable.Drawable, X.InterfaceC80242VeQ
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLJLJ.alpha = i;
        this.LJLJI.LIZ.setAlpha(i);
        invalidateSelf();
    }

    public final void LJIIIIZZ(View view, FrameLayout frameLayout) {
        this.LJLLLL = new WeakReference<>(view);
        this.LJLLLLLL = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        LJIIIZ();
        invalidateSelf();
    }
}
