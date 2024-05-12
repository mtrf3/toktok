package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.VuP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81233VuP extends FrameLayout {
    public final boolean LJLIL;
    public C72790ShW LJLILLLLZI;
    public SmartImageView LJLJI;
    public ImageView LJLJJI;
    public C5EP LJLJJL;
    public boolean LJLJJLL;
    public View LJLJL;

    public final void LIZ(Drawable drawable) {
        if (this.LJLIL) {
            SmartImageView smartImageView = this.LJLJI;
            if (smartImageView != null) {
                smartImageView.setImageDrawable(drawable);
                return;
            } else {
                o.LJIJI("smartImageView");
                throw null;
            }
        }
        C72790ShW c72790ShW = this.LJLILLLLZI;
        if (c72790ShW != null) {
            c72790ShW.setImageDrawable(drawable);
        } else {
            o.LJIJI("iconImageView");
            throw null;
        }
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.LJLIL) {
                SmartImageView smartImageView = this.LJLJI;
                if (smartImageView != null) {
                    smartImageView.clearColorFilter();
                    return;
                } else {
                    o.LJIJI("smartImageView");
                    throw null;
                }
            }
            C72790ShW c72790ShW = this.LJLILLLLZI;
            if (c72790ShW != null) {
                c72790ShW.clearColorFilter();
                return;
            } else {
                o.LJIJI("iconImageView");
                throw null;
            }
        }
        if (this.LJLIL) {
            SmartImageView smartImageView2 = this.LJLJI;
            if (smartImageView2 != null) {
                smartImageView2.setColorFilter(R.color.dx, PorterDuff.Mode.DST_IN);
                return;
            } else {
                o.LJIJI("smartImageView");
                throw null;
            }
        }
        C72790ShW c72790ShW2 = this.LJLILLLLZI;
        if (c72790ShW2 != null) {
            c72790ShW2.setColorFilter(R.color.dx, PorterDuff.Mode.DST_IN);
        } else {
            o.LJIJI("iconImageView");
            throw null;
        }
    }

    public final void setIconImageViewScaleType(InterfaceC78716Uuu interfaceC78716Uuu) {
        if (this.LJLIL) {
            SmartImageView smartImageView = this.LJLJI;
            if (smartImageView != null) {
                smartImageView.getHierarchy().LJIILJJIL(interfaceC78716Uuu);
                return;
            } else {
                o.LJIJI("smartImageView");
                throw null;
            }
        }
        C72790ShW c72790ShW = this.LJLILLLLZI;
        if (c72790ShW != null) {
            c72790ShW.getHierarchy().LJIILJJIL(interfaceC78716Uuu);
        } else {
            o.LJIJI("iconImageView");
            throw null;
        }
    }

    public final void setImageBackground(int i) {
        if (this.LJLIL) {
            SmartImageView smartImageView = this.LJLJI;
            if (smartImageView != null) {
                smartImageView.setBackgroundResource(i);
                return;
            } else {
                o.LJIJI("smartImageView");
                throw null;
            }
        }
        C72790ShW c72790ShW = this.LJLILLLLZI;
        if (c72790ShW != null) {
            c72790ShW.setBackgroundResource(i);
        } else {
            o.LJIJI("iconImageView");
            throw null;
        }
    }

    public final void setImageHierarchy(V92 v92) {
        if (this.LJLIL) {
            SmartImageView smartImageView = this.LJLJI;
            if (smartImageView != null) {
                smartImageView.setHierarchy(v92);
                return;
            } else {
                o.LJIJI("smartImageView");
                throw null;
            }
        }
        C72790ShW c72790ShW = this.LJLILLLLZI;
        if (c72790ShW != null) {
            c72790ShW.setHierarchy(v92);
        } else {
            o.LJIJI("iconImageView");
            throw null;
        }
    }

    public final void setShowDownloadIcon(boolean z) {
        this.LJLJJLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81233VuP(Context context, boolean z, boolean z2, boolean z3) {
        super(context, null);
        int i;
        a1.LJFF(context, "context");
        this.LJLIL = z3;
        if (z) {
            i = R.layout.bi7;
        } else if (z2) {
            i = R.layout.bi6;
        } else {
            i = R.layout.bi5;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(i, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(layoutId, null)");
        this.LJLJL = LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.ek1);
        o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.img_sticker_icon)");
        this.LJLILLLLZI = (C72790ShW) findViewById;
        View view = this.LJLJL;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.k18);
            o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R.id.siv_sticker_icon)");
            this.LJLJI = (SmartImageView) findViewById2;
            V92 LIZ = new C79077V1t(getResources()).LIZ();
            LIZ.LJIILL(null, 1);
            LIZ.LJIILL(null, 5);
            if (z3) {
                SmartImageView smartImageView = this.LJLJI;
                if (smartImageView != null) {
                    smartImageView.setVisibility(0);
                    C72790ShW c72790ShW = this.LJLILLLLZI;
                    if (c72790ShW != null) {
                        c72790ShW.setVisibility(8);
                        SmartImageView smartImageView2 = this.LJLJI;
                        if (smartImageView2 != null) {
                            smartImageView2.setHierarchy(LIZ);
                        } else {
                            o.LJIJI("smartImageView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("iconImageView");
                        throw null;
                    }
                } else {
                    o.LJIJI("smartImageView");
                    throw null;
                }
            } else {
                SmartImageView smartImageView3 = this.LJLJI;
                if (smartImageView3 != null) {
                    smartImageView3.setVisibility(8);
                    C72790ShW c72790ShW2 = this.LJLILLLLZI;
                    if (c72790ShW2 != null) {
                        c72790ShW2.setVisibility(0);
                        C72790ShW c72790ShW3 = this.LJLILLLLZI;
                        if (c72790ShW3 != null) {
                            c72790ShW3.setHierarchy(LIZ);
                        } else {
                            o.LJIJI("iconImageView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("iconImageView");
                        throw null;
                    }
                } else {
                    o.LJIJI("smartImageView");
                    throw null;
                }
            }
            View view2 = this.LJLJL;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.ek3);
                o.LJIIIIZZ(findViewById3, "mRootView.findViewById(R.id.img_sticker_loading)");
                this.LJLJJI = (ImageView) findViewById3;
                View view3 = this.LJLJL;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(R.id.f6h);
                    o.LJIIIIZZ(findViewById4, "mRootView.findViewById(R.id.iv_loading)");
                    C5EP c5ep = (C5EP) findViewById4;
                    this.LJLJJL = c5ep;
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "this.context");
                    c5ep.setBgCircleColor(AnonymousClass636.LJIIIIZZ(R.attr.ei, context2));
                    C5EP c5ep2 = this.LJLJJL;
                    if (c5ep2 != null) {
                        c5ep2.setProgressColor(-1);
                        C5EP c5ep3 = this.LJLJJL;
                        if (c5ep3 != null) {
                            c5ep3.setMaxProgress(100);
                            C5EP c5ep4 = this.LJLJJL;
                            if (c5ep4 != null) {
                                c5ep4.setCircleWidth((int) C74275TDb.LIZIZ(context, 2.0f));
                                C5EP c5ep5 = this.LJLJJL;
                                if (c5ep5 != null) {
                                    c5ep5.setBgCircleWidth((int) C74275TDb.LIZIZ(context, 3.0f));
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                    View view4 = this.LJLJL;
                                    if (view4 != null) {
                                        view4.setLayoutParams(layoutParams);
                                        View view5 = this.LJLJL;
                                        if (view5 != null) {
                                            addView(view5);
                                            return;
                                        } else {
                                            o.LJIJI("mRootView");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("mRootView");
                                    throw null;
                                }
                                o.LJIJI("progressView");
                                throw null;
                            }
                            o.LJIJI("progressView");
                            throw null;
                        }
                        o.LJIJI("progressView");
                        throw null;
                    }
                    o.LJIJI("progressView");
                    throw null;
                }
                o.LJIJI("mRootView");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }
}
