package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40651if extends C1EB implements Animatable {
    public final C0FJ LJLILLLLZI;
    public final Context LJLJI;
    public final C0FI LJLJJI;

    public C40651if() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return C07820Sk.LIZIZ(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return C07810Sj.LIZ(drawable);
        }
        return this.LJLILLLLZI.LIZ.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.LJLILLLLZI.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.LJLIL != null && Build.VERSION.SDK_INT >= 24) {
            final Drawable.ConstantState constantState = this.LJLIL.getConstantState();
            return new Drawable.ConstantState(constantState) { // from class: X.0FK
                public final Drawable.ConstantState LIZ;

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final boolean canApplyTheme() {
                    return this.LIZ.canApplyTheme();
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final int getChangingConfigurations() {
                    return this.LIZ.getChangingConfigurations();
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable() {
                    C40651if c40651if = new C40651if();
                    Drawable newDrawable = this.LIZ.newDrawable();
                    c40651if.LJLIL = newDrawable;
                    newDrawable.setCallback(c40651if.LJLJJI);
                    return c40651if;
                }

                {
                    this.LIZ = constantState;
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable(Resources resources) {
                    C40651if c40651if = new C40651if();
                    Drawable newDrawable = this.LIZ.newDrawable(resources);
                    c40651if.LJLIL = newDrawable;
                    newDrawable.setCallback(c40651if.LJLJJI);
                    return c40651if;
                }

                @Override // android.graphics.drawable.Drawable.ConstantState
                public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
                    C40651if c40651if = new C40651if();
                    Drawable newDrawable = this.LIZ.newDrawable(resources, theme);
                    c40651if.LJLIL = newDrawable;
                    newDrawable.setCallback(c40651if.LJLJJI);
                    return c40651if;
                }
            };
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.LJLILLLLZI.LIZ.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.LJLILLLLZI.LIZ.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.LJLILLLLZI.LIZ.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return C07810Sj.LIZLLL(drawable);
        }
        return this.LJLILLLLZI.LIZ.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.LJLILLLLZI.LIZIZ.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.LJLILLLLZI.LIZ.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.LJLILLLLZI.LIZIZ.isStarted()) {
                return;
            }
            this.LJLILLLLZI.LIZIZ.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.LJLILLLLZI.LIZIZ.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0FI] */
    public C40651if(Context context) {
        ?? r1 = new Drawable.Callback() { // from class: X.0FI
            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                C40651if.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C40651if.this.unscheduleSelf(runnable);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C40651if.this.scheduleSelf(runnable, j);
            }
        };
        this.LJLJJI = r1;
        this.LJLJI = context;
        this.LJLILLLLZI = new C0FJ(r1);
    }

    @Override // X.C1EB, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LIZ(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.LJLILLLLZI.LIZ.draw(canvas);
        if (this.LJLILLLLZI.LIZIZ.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.LJLILLLLZI.LIZ.setBounds(rect);
        }
    }

    @Override // X.C1EB, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.LJLILLLLZI.LIZ.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.LJLILLLLZI.LIZ.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.LJLILLLLZI.LIZ.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07810Sj.LJ(drawable, z);
        } else {
            this.LJLILLLLZI.LIZ.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.LJLILLLLZI.LIZ.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LJI(drawable, i);
        } else {
            this.LJLILLLLZI.LIZ.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LJII(drawable, colorStateList);
        } else {
            this.LJLILLLLZI.LIZ.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LJIIIIZZ(drawable, mode);
        } else {
            this.LJLILLLLZI.LIZ.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.LJLILLLLZI.LIZ.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator LIZ;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            C07820Sk.LIZLLL(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray LJI = C06720Oe.LJI(resources, theme, attributeSet, C0FG.LJ);
                    int resourceId = LJI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C40681ii LIZ2 = C40681ii.LIZ(resources, resourceId, theme);
                        LIZ2.LJLJJLL = false;
                        LIZ2.setCallback(this.LJLJJI);
                        C40681ii c40681ii = this.LJLILLLLZI.LIZ;
                        if (c40681ii != null) {
                            c40681ii.setCallback(null);
                        }
                        this.LJLILLLLZI.LIZ = LIZ2;
                    }
                    LJI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0FG.LJFF);
                    String LLLZLZ = C16880lQ.LLLZLZ(obtainAttributes, 0);
                    int resourceId2 = obtainAttributes.getResourceId(i, 0);
                    if (resourceId2 != 0) {
                        Context context = this.LJLJI;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                LIZ = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                        try {
                                            try {
                                                try {
                                                    LIZ = C0FM.LIZ(context, resources2, theme2, animation, android.util.Xml.asAttributeSet(animation), null, 0);
                                                    animation.close();
                                                } catch (IOException e) {
                                                    e = e;
                                                    StringBuilder LIZ3 = X1D.LIZ();
                                                    LIZ3.append("Can't load animation resource ID #0x");
                                                    LIZ3.append(Integer.toHexString(resourceId2));
                                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(X1D.LIZIZ(LIZ3));
                                                    notFoundException.initCause(e);
                                                    throw notFoundException;
                                                } catch (XmlPullParserException e2) {
                                                    e = e2;
                                                    StringBuilder LIZ4 = X1D.LIZ();
                                                    LIZ4.append("Can't load animation resource ID #0x");
                                                    LIZ4.append(Integer.toHexString(resourceId2));
                                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(X1D.LIZIZ(LIZ4));
                                                    notFoundException2.initCause(e);
                                                    throw notFoundException2;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                xmlResourceParser = animation;
                                                if (xmlResourceParser != null) {
                                                    xmlResourceParser.close();
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                        } catch (XmlPullParserException e4) {
                                            e = e4;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e5) {
                                    e = e5;
                                } catch (XmlPullParserException e6) {
                                    e = e6;
                                }
                            }
                            LIZ.setTarget(this.LJLILLLLZI.LIZ.LJLILLLLZI.LIZIZ.LJIILJJIL.getOrDefault(LLLZLZ, null));
                            C0FJ c0fj = this.LJLILLLLZI;
                            if (c0fj.LIZJ == null) {
                                c0fj.LIZJ = new ArrayList<>();
                                this.LJLILLLLZI.LIZLLL = new C1HQ<>();
                            }
                            this.LJLILLLLZI.LIZJ.add(LIZ);
                            this.LJLILLLLZI.LIZLLL.put(LIZ, LLLZLZ);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C0FJ c0fj2 = this.LJLILLLLZI;
        if (c0fj2.LIZIZ == null) {
            c0fj2.LIZIZ = new AnimatorSet();
        }
        c0fj2.LIZIZ.playTogether(c0fj2.LIZJ);
    }
}
