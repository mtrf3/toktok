package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.VuO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81232VuO extends FrameLayout {
    public static final int LLIIJLIL = C78885Uxd.LJFF;
    public static final int LLIIL = ColorProtector.parseColor("#80000000");
    public static final int LLIILII = R.color.b7;
    public C81233VuP LJLIL;
    public C80924VpQ LJLILLLLZI;
    public LinearLayout LJLJI;
    public ImageView LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public FrameLayout LJLJL;
    public ImageView LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public int LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public Animation LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public Drawable LLFII;
    public String LLFZ;
    public int LLI;
    public Drawable LLIFFJFJJ;
    public Drawable LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public LinearLayout LLIIJI;

    public final void LJFF() {
        int i;
        Drawable LIZJ;
        int i2;
        int i3;
        int i4;
        V8L v8l = new V8L();
        V92 LIZ = new C79077V1t(getResources()).LIZ();
        int i5 = this.LLIIIZ;
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.e2, context2);
        getAvTextView().setStatusTextColor(LJIIIIZZ);
        if (this.LL || C58B.LIZ()) {
            i = this.LJLLJ + this.LJZI;
        } else {
            i = this.LJLLJ;
        }
        this.LJLLL = i;
        int i6 = 0;
        if (this.LJLLI) {
            v8l.LIZIZ = true;
            LIZ.LJIL(v8l);
            if (this.LLIFFJFJJ == null) {
                this.LLIFFJFJJ = C78127UlP.LIZ(i5, i5, 0);
            }
        } else {
            v8l.LIZIZ = false;
            v8l.LJFF(this.LJLLJ);
            if (this.LLIFFJFJJ == null) {
                this.LLIFFJFJJ = C78127UlP.LIZJ(i5, i5, 0, this.LJLLJ);
            }
        }
        if (this.LJLLILLLL) {
            LIZJ = C78127UlP.LIZ(LJIIIIZZ, 0, this.LJZI);
            this.LLII = C78127UlP.LIZ(i5, i5, 0);
        } else {
            LIZJ = C78127UlP.LIZJ(LJIIIIZZ, 0, this.LJZI, this.LJLLL);
            this.LLII = C78127UlP.LIZJ(i5, i5, 0, this.LJLLJ);
        }
        LIZ.LJIL(v8l);
        LIZ.LJIILL(this.LLIFFJFJJ, 1);
        LIZ.LJIILL(this.LLIFFJFJJ, 5);
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            c81233VuP.setImageHierarchy(LIZ);
            C81233VuP c81233VuP2 = this.LJLIL;
            if (c81233VuP2 != null) {
                boolean z = this.LLFF;
                ImageView imageView = c81233VuP2.LJLJJI;
                if (imageView != null) {
                    if (z) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    imageView.setVisibility(i2);
                    C81233VuP c81233VuP3 = this.LJLIL;
                    if (c81233VuP3 != null) {
                        int i7 = this.LLI;
                        c81233VuP3.setPadding(i7, i7, i7, i7);
                        if (this.LLIIIILZ) {
                            C81233VuP c81233VuP4 = this.LJLIL;
                            if (c81233VuP4 != null) {
                                c81233VuP4.setBackground(this.LLII);
                            } else {
                                o.LJIJI("imageView");
                                throw null;
                            }
                        }
                        View view = this.LJLJJL;
                        if (view != null) {
                            view.setBackground(LIZJ);
                            View view2 = this.LJLJJL;
                            if (view2 != null) {
                                view2.setVisibility(8);
                                ImageView imageView2 = this.LJLJJI;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(8);
                                    LinearLayout linearLayout = this.LJLJI;
                                    if (linearLayout != null) {
                                        if (this.LJLLLLLL) {
                                            i3 = 0;
                                        } else {
                                            i3 = 8;
                                        }
                                        linearLayout.setVisibility(i3);
                                        C80924VpQ avTextView = getAvTextView();
                                        if (this.LJLLLLLL) {
                                            i4 = 0;
                                        } else {
                                            i4 = 8;
                                        }
                                        avTextView.setVisibility(i4);
                                        if (this.LLIIII) {
                                            this.LLIIII = true;
                                            getAvTextView().setSingleLine();
                                            getAvTextView().setHorizontalFadingEdgeEnabled(true);
                                            C80924VpQ avTextView2 = getAvTextView();
                                            Context context3 = getContext();
                                            o.LJIIIIZZ(context3, "context");
                                            avTextView2.setFadingEdgeLength((int) C74275TDb.LIZIZ(context3, 4.0f));
                                        }
                                        if (HWY.LIZ() && !this.LJLLLLLL) {
                                            getAvTextView().setTuxFont(41);
                                        } else {
                                            getAvTextView().setTuxFont(71);
                                        }
                                        getAvTextView().setOldPanelStyle(this.LJZL);
                                        Drawable LIZ2 = C78127UlP.LIZ(LJIIIIZZ2, LJIIIIZZ2, this.LJZI);
                                        View view3 = this.LJLJJLL;
                                        if (view3 != null) {
                                            view3.setBackground(LIZ2);
                                            View view4 = this.LJLJJLL;
                                            if (view4 != null) {
                                                view4.setVisibility(8);
                                                Drawable drawable = this.LLFII;
                                                if (drawable != null) {
                                                    this.LLFII = C78885Uxd.LIZLLL(drawable);
                                                    C81233VuP c81233VuP5 = this.LJLIL;
                                                    if (c81233VuP5 != null) {
                                                        c81233VuP5.setIconImageViewScaleType(InterfaceC78716Uuu.LJJLIIIJILLIZJL);
                                                        C81233VuP c81233VuP6 = this.LJLIL;
                                                        if (c81233VuP6 != null) {
                                                            c81233VuP6.LIZ(this.LLFII);
                                                            C81233VuP c81233VuP7 = this.LJLIL;
                                                            if (c81233VuP7 != null) {
                                                                c81233VuP7.setBackground(this.LLII);
                                                            } else {
                                                                o.LJIJI("imageView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("imageView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("imageView");
                                                        throw null;
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(this.LLFZ)) {
                                                    setText(this.LLFZ);
                                                }
                                                boolean z2 = this.LJLZ;
                                                FrameLayout frameLayout = this.LJLJL;
                                                if (frameLayout != null) {
                                                    if (!z2) {
                                                        i6 = 8;
                                                    }
                                                    frameLayout.setVisibility(i6);
                                                    return;
                                                }
                                                o.LJIJI("bottomDotLayout");
                                                throw null;
                                            }
                                            o.LJIJI("dotView");
                                            throw null;
                                        }
                                        o.LJIJI("dotView");
                                        throw null;
                                    }
                                    o.LJIJI("textLayout");
                                    throw null;
                                }
                                o.LJIJI("loadingImageView");
                                throw null;
                            }
                            o.LJIJI("borderView");
                            throw null;
                        }
                        o.LJIJI("borderView");
                        throw null;
                    }
                    o.LJIJI("imageView");
                    throw null;
                }
                o.LJIJI("downloadImg");
                throw null;
            }
            o.LJIJI("imageView");
            throw null;
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final C80924VpQ getAvTextView() {
        C80924VpQ c80924VpQ = this.LJLILLLLZI;
        if (c80924VpQ != null) {
            return c80924VpQ;
        }
        o.LJIJI("avTextView");
        throw null;
    }

    public final void LIZ(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            c81233VuP.LIZ(drawable);
        } else {
            o.LJIJI("imageView");
            throw null;
        }
    }

    public final void LIZIZ(android.net.Uri uri) {
        if (uri == null) {
            return;
        }
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            if (c81233VuP.LJLIL) {
                W5F LJFF = W5U.LJFF(uri);
                S3I s3i = new S3I();
                s3i.LIZ = true;
                LJFF.LJIJJLI = new S3L(s3i);
                SmartImageView smartImageView = c81233VuP.LJLJI;
                if (smartImageView != null) {
                    LJFF.LJJIIJ = smartImageView;
                    C16880lQ.LLJJJ(LJFF);
                    return;
                } else {
                    o.LJIJI("smartImageView");
                    throw null;
                }
            }
            C72790ShW c72790ShW = c81233VuP.LJLILLLLZI;
            if (c72790ShW != null) {
                C78764Uvg.LJIIIZ(c72790ShW, uri.toString(), -1, -1);
                return;
            } else {
                o.LJIJI("iconImageView");
                throw null;
            }
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final void LIZJ(String str) {
        if (str == null) {
            return;
        }
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            if (c81233VuP.LJLIL) {
                W5F LJI = W5U.LJI(new File(str));
                S3I s3i = new S3I();
                s3i.LIZ = true;
                LJI.LJIJJLI = new S3L(s3i);
                SmartImageView smartImageView = c81233VuP.LJLJI;
                if (smartImageView != null) {
                    LJI.LJJIIJ = smartImageView;
                    C16880lQ.LLJJJ(LJI);
                    return;
                } else {
                    o.LJIJI("smartImageView");
                    throw null;
                }
            }
            C72790ShW c72790ShW = c81233VuP.LJLILLLLZI;
            if (c72790ShW != null) {
                C78764Uvg.LJIIIZ(c72790ShW, new File(str).toURI().toString(), -1, -1);
                return;
            } else {
                o.LJIJI("iconImageView");
                throw null;
            }
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final void LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            if (c81233VuP.LJLIL) {
                if (str == null) {
                    return;
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                S3I s3i = new S3I();
                s3i.LIZ = true;
                LJIIIIZZ.LJIJJLI = new S3L(s3i);
                SmartImageView smartImageView = c81233VuP.LJLJI;
                if (smartImageView != null) {
                    LJIIIIZZ.LJJIIJ = smartImageView;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                    return;
                } else {
                    o.LJIJI("smartImageView");
                    throw null;
                }
            }
            C72790ShW c72790ShW = c81233VuP.LJLILLLLZI;
            if (c72790ShW != null) {
                C78764Uvg.LJIIIZ(c72790ShW, str, -1, -1);
                return;
            } else {
                o.LJIJI("iconImageView");
                throw null;
            }
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final void LJ(boolean z) {
        int i;
        if (this.LJLLLLLL) {
            C80924VpQ avTextView = getAvTextView();
            avTextView.LJZL = z;
            if (z) {
                if (avTextView.LJLLLL) {
                    avTextView.setTextColor(avTextView.LJZ);
                }
            } else {
                avTextView.setTextColor(avTextView.LJLZ);
            }
            getAvTextView().setSelected(z);
        }
        if (this.LJLLLL) {
            View view = this.LJLJJL;
            if (view != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            } else {
                o.LJIJI("borderView");
                throw null;
            }
        }
        if (z && this.LLIIII) {
            getAvTextView().setEllipsize(TextUtils.TruncateAt.MARQUEE);
        } else {
            getAvTextView().setEllipsize(null);
        }
    }

    public final void LJI(boolean z) {
        if (z) {
            ImageView imageView = this.LJLJJI;
            if (imageView != null) {
                imageView.clearAnimation();
                ImageView imageView2 = this.LJLJJI;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    ImageView imageView3 = this.LJLJJI;
                    if (imageView3 != null) {
                        imageView3.startAnimation(this.LLF);
                        return;
                    } else {
                        o.LJIJI("loadingImageView");
                        throw null;
                    }
                }
                o.LJIJI("loadingImageView");
                throw null;
            }
            o.LJIJI("loadingImageView");
            throw null;
        }
        ImageView imageView4 = this.LJLJJI;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            ImageView imageView5 = this.LJLJJI;
            if (imageView5 != null) {
                imageView5.clearAnimation();
                return;
            } else {
                o.LJIJI("loadingImageView");
                throw null;
            }
        }
        o.LJIJI("loadingImageView");
        throw null;
    }

    public final void setAvTextView(C80924VpQ c80924VpQ) {
        o.LJIIIZ(c80924VpQ, "<set-?>");
        this.LJLILLLLZI = c80924VpQ;
    }

    public final void setClickStatusColor(int i) {
        Drawable LIZJ;
        if (this.LJLLI) {
            LIZJ = C78127UlP.LIZ(i, 0, this.LJZI);
        } else {
            LIZJ = C78127UlP.LIZJ(i, 0, this.LJZI, this.LJLLL);
        }
        View view = this.LJLJJL;
        if (view != null) {
            view.setBackground(LIZJ);
            getAvTextView().setStatusTextColor(i);
        } else {
            o.LJIJI("borderView");
            throw null;
        }
    }

    public final void setEnableUI(boolean z) {
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            c81233VuP.setEnableUI(z);
            getAvTextView().setEnableUI(z);
            if (z) {
                ImageView imageView = this.LJLJLJ;
                if (imageView != null) {
                    imageView.clearColorFilter();
                    return;
                } else {
                    o.LJIJI("bottomDotView");
                    throw null;
                }
            }
            ImageView imageView2 = this.LJLJLJ;
            if (imageView2 != null) {
                imageView2.setColorFilter(R.color.dx, PorterDuff.Mode.DST_IN);
                return;
            } else {
                o.LJIJI("bottomDotView");
                throw null;
            }
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final void setIconImagePadding(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, i);
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            c81233VuP.setPadding(LIZIZ, LIZIZ, LIZIZ, LIZIZ);
        } else {
            o.LJIJI("imageView");
            throw null;
        }
    }

    public final void setImageViewPadding(int i) {
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            c81233VuP.setPadding(i, i, i, i);
        } else {
            o.LJIJI("imageView");
            throw null;
        }
    }

    public final void setImgBackground(int i) {
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            c81233VuP.setImageBackground(i);
        } else {
            o.LJIJI("imageView");
            throw null;
        }
    }

    public final void setOnlyTextClickStatusColor(int i) {
        getAvTextView().setStatusTextColor(i);
    }

    public final void setRoundRadius(int i) {
        int i2;
        this.LJLLJ = i;
        if (this.LL || C58B.LIZ()) {
            i2 = this.LJLLJ + this.LJZI;
        } else {
            i2 = this.LJLLJ;
        }
        this.LJLLL = i2;
        LJFF();
    }

    public final void setShowDownloadIcon(boolean z) {
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            c81233VuP.setShowDownloadIcon(z);
        } else {
            o.LJIJI("imageView");
            throw null;
        }
    }

    public final void setShowDownloadStateIcon(boolean z) {
        int i;
        C81233VuP c81233VuP = this.LJLIL;
        if (c81233VuP != null) {
            ImageView imageView = c81233VuP.LJLJJI;
            if (imageView != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            o.LJIJI("downloadImg");
            throw null;
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final void setText(CharSequence charSequence) {
        int i;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int measureText = (int) getAvTextView().getPaint().measureText(charSequence, 0, charSequence.length());
        if (this.LJZ) {
            i = (int) ((Number) C81441Vxl.LJFF.getValue()).floatValue();
        } else {
            i = this.LJLJLLL;
        }
        if (measureText > i) {
            if (this.LLIIII) {
                getAvTextView().setGravity(8388611);
            } else {
                getAvTextView().setGravity(17);
            }
        } else {
            getAvTextView().setGravity(17);
        }
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            getAvTextView().setVisibility(0);
            getAvTextView().setText(charSequence);
            return;
        }
        o.LJIJI("textLayout");
        throw null;
    }

    public final void setTextColor(int i) {
        getAvTextView().setSelectTextColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81232VuO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        LinearLayout.LayoutParams layoutParams;
        int dimension;
        int i3;
        a1.LJFF(context, "context");
        this.LLFFF = true;
        this.LLIIII = true;
        this.LJZI = (int) C74275TDb.LIZIZ(context, 2.0f);
        this.LLF = AnimationUtils.loadAnimation(context, R.anim.gf);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ym, R.attr.z5, R.attr.a3n, R.attr.ab5, R.attr.ad8, R.attr.aew, R.attr.ai5, R.attr.ai6, R.attr.ai7, R.attr.ai8, R.attr.aib, R.attr.aic, R.attr.aid, R.attr.aie, R.attr.aif, R.attr.aig, R.attr.aih, R.attr.aii, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.ajb, R.attr.akq, R.attr.aol, R.attr.ay2, R.attr.b1l, R.attr.b25, R.attr.b36, R.attr.b3k, R.attr.b4p, R.attr.b4q, R.attr.b8z, R.attr.b_d, R.attr.b_p, R.attr.baf, R.attr.bag, R.attr.bff, R.attr.bi_, R.attr.bii, R.attr.bin, R.attr.biw, R.attr.bj3, R.attr.bjp, R.attr.bkc, R.attr.bvl, R.attr.bvx, R.attr.bvz});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
            this.LJLJLLL = (int) obtainStyledAttributes.getDimension(19, 0.0f);
            this.LJLL = (int) obtainStyledAttributes.getDimension(18, 0.0f);
            boolean z = obtainStyledAttributes.getBoolean(8, false);
            this.LJLLI = z;
            this.LJLLILLLL = obtainStyledAttributes.getBoolean(9, z);
            if (C58B.LIZ()) {
                dimension = C7MY.LIZIZ(4);
            } else {
                dimension = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            }
            this.LJLLJ = dimension;
            this.LJLLLL = obtainStyledAttributes.getBoolean(12, true);
            this.LJLLLLLL = obtainStyledAttributes.getBoolean(16, true);
            this.LJLZ = obtainStyledAttributes.getBoolean(13, false);
            this.LLFF = obtainStyledAttributes.getBoolean(15, true);
            this.LLFFF = obtainStyledAttributes.getBoolean(14, true);
            this.LLFZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 42);
            this.LLFII = obtainStyledAttributes.getDrawable(24);
            this.LLI = (int) obtainStyledAttributes.getDimension(28, 0.0f);
            this.LJZL = obtainStyledAttributes.getBoolean(27, false);
            this.LL = obtainStyledAttributes.getBoolean(26, false);
            this.LLD = obtainStyledAttributes.getBoolean(25, false);
            this.LLIIII = obtainStyledAttributes.getBoolean(38, true);
            this.LLIIIILZ = obtainStyledAttributes.getBoolean(35, false);
            Drawable drawable = obtainStyledAttributes.getDrawable(29);
            this.LLIFFJFJJ = drawable;
            this.LLIFFJFJJ = C78885Uxd.LJ(drawable, C78885Uxd.LIZIZ);
            if (this.LL) {
                i3 = LLIIL;
            } else if (HWY.LIZ() && !this.LJLLLLLL) {
                i3 = LLIILII;
            } else {
                i3 = LLIIJLIL;
            }
            this.LLIIIZ = obtainStyledAttributes.getColor(30, i3);
            this.LJZ = obtainStyledAttributes.getBoolean(45, false);
            this.LLIIIJ = (int) obtainStyledAttributes.getDimension(39, C74275TDb.LIZIZ(context, 4.0f));
            this.LLIIIL = (int) obtainStyledAttributes.getDimension(1, C74275TDb.LIZIZ(context, 4.0f));
            obtainStyledAttributes.recycle();
        }
        this.LLIIJI = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = this.LLIIJI;
        if (linearLayout != null) {
            linearLayout.setLayoutParams(layoutParams2);
            LinearLayout linearLayout2 = this.LLIIJI;
            if (linearLayout2 != null) {
                linearLayout2.setOrientation(1);
                this.LJLIL = new C81233VuP(context, this.LL, this.LLD, this.LJZ);
                setAvTextView(new C80924VpQ(context));
                this.LJLJJL = new View(context);
                FrameLayout frameLayout = new FrameLayout(context);
                if (this.LJLLLL) {
                    int i4 = this.LJZI * 2;
                    i = this.LJLJLLL + i4;
                    i2 = i4 + this.LJLL;
                } else {
                    i = this.LJLJLLL;
                    i2 = this.LJLL;
                }
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i, i2);
                layoutParams3.gravity = 1;
                frameLayout.setLayoutParams(layoutParams3);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(this.LJLJLLL, this.LJLL);
                layoutParams4.gravity = 17;
                C81233VuP c81233VuP = this.LJLIL;
                if (c81233VuP != null) {
                    c81233VuP.setLayoutParams(layoutParams4);
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(i, i2);
                    View view = this.LJLJJL;
                    if (view != null) {
                        view.setLayoutParams(layoutParams5);
                        this.LJLJJI = new ImageView(context);
                        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams6.gravity = 17;
                        ImageView imageView = this.LJLJJI;
                        if (imageView != null) {
                            imageView.setImageDrawable(getResources().getDrawable(R.drawable.awk));
                            ImageView imageView2 = this.LJLJJI;
                            if (imageView2 != null) {
                                imageView2.setLayoutParams(layoutParams6);
                                C81233VuP c81233VuP2 = this.LJLIL;
                                if (c81233VuP2 != null) {
                                    frameLayout.addView(c81233VuP2);
                                    View view2 = this.LJLJJL;
                                    if (view2 != null) {
                                        frameLayout.addView(view2);
                                        ImageView imageView3 = this.LJLJJI;
                                        if (imageView3 != null) {
                                            frameLayout.addView(imageView3);
                                            if (this.LJZ) {
                                                layoutParams = new LinearLayout.LayoutParams((int) ((Number) C81441Vxl.LJFF.getValue()).floatValue(), -2);
                                            } else {
                                                layoutParams = new LinearLayout.LayoutParams(this.LJLJLLL, -2);
                                            }
                                            layoutParams.gravity = 1;
                                            layoutParams.topMargin = this.LLIIIJ;
                                            LinearLayout linearLayout3 = new LinearLayout(context);
                                            this.LJLJI = linearLayout3;
                                            linearLayout3.setLayoutParams(layoutParams);
                                            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                                            layoutParams7.weight = 1.0f;
                                            layoutParams7.gravity = 1;
                                            getAvTextView().setLayoutParams(layoutParams7);
                                            getAvTextView().setGravity(17);
                                            LinearLayout linearLayout4 = this.LJLJI;
                                            if (linearLayout4 != null) {
                                                linearLayout4.addView(getAvTextView());
                                                this.LJLJJLL = new View(context);
                                                int LIZIZ = (int) C74275TDb.LIZIZ(context, 6.0f);
                                                if (this.LLFFF) {
                                                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(LIZIZ, LIZIZ);
                                                    layoutParams8.gravity = 8388661;
                                                    if (this.LL) {
                                                        int LIZIZ2 = (int) C74275TDb.LIZIZ(context, 4.0f);
                                                        View view3 = this.LJLJJLL;
                                                        if (view3 != null) {
                                                            if (C16310kV.LIZLLL(view3) == 1) {
                                                                layoutParams8.leftMargin = LIZIZ2;
                                                            } else {
                                                                layoutParams8.rightMargin = LIZIZ2;
                                                            }
                                                            layoutParams8.topMargin = LIZIZ2;
                                                            View view4 = this.LJLJJLL;
                                                            if (view4 != null) {
                                                                view4.setLayoutParams(layoutParams8);
                                                                C81233VuP c81233VuP3 = this.LJLIL;
                                                                if (c81233VuP3 != null) {
                                                                    View view5 = this.LJLJJLL;
                                                                    if (view5 != null) {
                                                                        c81233VuP3.addView(view5);
                                                                    } else {
                                                                        o.LJIJI("dotView");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("imageView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("dotView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("dotView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        View view6 = this.LJLJJLL;
                                                        if (view6 != null) {
                                                            view6.setLayoutParams(layoutParams8);
                                                            View view7 = this.LJLJJLL;
                                                            if (view7 != null) {
                                                                frameLayout.addView(view7);
                                                            } else {
                                                                o.LJIJI("dotView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("dotView");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(LIZIZ, LIZIZ);
                                                    layoutParams9.gravity = 8388661;
                                                    layoutParams9.weight = 0.0f;
                                                    View view8 = this.LJLJJLL;
                                                    if (view8 != null) {
                                                        view8.setLayoutParams(layoutParams9);
                                                        LinearLayout linearLayout5 = this.LJLJI;
                                                        if (linearLayout5 != null) {
                                                            View view9 = this.LJLJJLL;
                                                            if (view9 != null) {
                                                                linearLayout5.addView(view9);
                                                            } else {
                                                                o.LJIJI("dotView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("textLayout");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("dotView");
                                                        throw null;
                                                    }
                                                }
                                                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(this.LJLJLLL, -2);
                                                layoutParams10.gravity = 1;
                                                layoutParams10.topMargin = this.LLIIIL;
                                                FrameLayout frameLayout2 = new FrameLayout(context);
                                                this.LJLJL = frameLayout2;
                                                frameLayout2.setLayoutParams(layoutParams10);
                                                ImageView imageView4 = new ImageView(context);
                                                this.LJLJLJ = imageView4;
                                                imageView4.setImageResource(R.drawable.t3);
                                                int LIZIZ3 = (int) C74275TDb.LIZIZ(context, 4.0f);
                                                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(LIZIZ3, LIZIZ3);
                                                layoutParams11.gravity = 1;
                                                ImageView imageView5 = this.LJLJLJ;
                                                if (imageView5 != null) {
                                                    imageView5.setLayoutParams(layoutParams11);
                                                    FrameLayout frameLayout3 = this.LJLJL;
                                                    if (frameLayout3 != null) {
                                                        ImageView imageView6 = this.LJLJLJ;
                                                        if (imageView6 != null) {
                                                            frameLayout3.addView(imageView6);
                                                            if (HWY.LIZ() && !this.LJLLLLLL) {
                                                                LinearLayout linearLayout6 = this.LLIIJI;
                                                                if (linearLayout6 != null) {
                                                                    linearLayout6.addView(frameLayout);
                                                                } else {
                                                                    o.LJIJI("rootViewLayout");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                LinearLayout linearLayout7 = this.LLIIJI;
                                                                if (linearLayout7 != null) {
                                                                    linearLayout7.addView(frameLayout);
                                                                    LinearLayout linearLayout8 = this.LLIIJI;
                                                                    if (linearLayout8 != null) {
                                                                        LinearLayout linearLayout9 = this.LJLJI;
                                                                        if (linearLayout9 != null) {
                                                                            linearLayout8.addView(linearLayout9);
                                                                        } else {
                                                                            o.LJIJI("textLayout");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("rootViewLayout");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("rootViewLayout");
                                                                    throw null;
                                                                }
                                                            }
                                                            LinearLayout linearLayout10 = this.LLIIJI;
                                                            if (linearLayout10 != null) {
                                                                FrameLayout frameLayout4 = this.LJLJL;
                                                                if (frameLayout4 != null) {
                                                                    linearLayout10.addView(frameLayout4);
                                                                    LinearLayout linearLayout11 = this.LLIIJI;
                                                                    if (linearLayout11 != null) {
                                                                        addView(linearLayout11);
                                                                        LJFF();
                                                                        return;
                                                                    } else {
                                                                        o.LJIJI("rootViewLayout");
                                                                        throw null;
                                                                    }
                                                                }
                                                                o.LJIJI("bottomDotLayout");
                                                                throw null;
                                                            }
                                                            o.LJIJI("rootViewLayout");
                                                            throw null;
                                                        }
                                                        o.LJIJI("bottomDotView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("bottomDotLayout");
                                                    throw null;
                                                }
                                                o.LJIJI("bottomDotView");
                                                throw null;
                                            }
                                            o.LJIJI("textLayout");
                                            throw null;
                                        }
                                        o.LJIJI("loadingImageView");
                                        throw null;
                                    }
                                    o.LJIJI("borderView");
                                    throw null;
                                }
                                o.LJIJI("imageView");
                                throw null;
                            }
                            o.LJIJI("loadingImageView");
                            throw null;
                        }
                        o.LJIJI("loadingImageView");
                        throw null;
                    }
                    o.LJIJI("borderView");
                    throw null;
                }
                o.LJIJI("imageView");
                throw null;
            }
            o.LJIJI("rootViewLayout");
            throw null;
        }
        o.LJIJI("rootViewLayout");
        throw null;
    }
}
