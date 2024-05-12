package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Nf3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59897Nf3 implements InterfaceC59899Nf5 {
    public LBY LIZ;
    public boolean LIZIZ;
    public Context LIZJ;

    @Override // X.InterfaceC59899Nf5
    public final void LIZ(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        LBY lby = this.LIZ;
        if (lby != null) {
            ImageView backView = lby.getBackView();
            if (backView != null) {
                C16880lQ.LJIILLIIL(backView, aCListenerS30S0100000_10);
                return;
            }
            return;
        }
        o.LJIJI("bulletTitleBar");
        throw null;
    }

    @Override // X.InterfaceC59899Nf5
    public final void LIZIZ(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        LBY lby = this.LIZ;
        if (lby != null) {
            ImageView closeAllView = lby.getCloseAllView();
            if (closeAllView != null) {
                C16880lQ.LJIILLIIL(closeAllView, aCListenerS30S0100000_10);
                return;
            }
            return;
        }
        o.LJIJI("bulletTitleBar");
        throw null;
    }

    @Override // X.InterfaceC59899Nf5
    public final void setDefaultTitle(CharSequence defaultTitle) {
        o.LJIIJ(defaultTitle, "defaultTitle");
        LBY lby = this.LIZ;
        if (lby != null) {
            lby.setDefaultTitle(defaultTitle);
        } else {
            o.LJIJI("bulletTitleBar");
            throw null;
        }
    }

    @Override // X.InterfaceC59899Nf5
    public final View LIZJ(Context context, android.net.Uri uri, C59472NVs c59472NVs) {
        Drawable LIZ;
        Context context2;
        o.LJIIJ(context, "context");
        o.LJIIJ(uri, "uri");
        if (this.LIZIZ) {
            LBY lby = this.LIZ;
            if (lby != null) {
                lby.getTitleBarRoot();
                return lby;
            }
            o.LJIJI("bulletTitleBar");
            throw null;
        }
        this.LIZIZ = true;
        this.LIZJ = context;
        this.LIZ = new LBY(context);
        if (c59472NVs != null) {
            C59439NUl c59439NUl = (C59439NUl) c59472NVs.LJI.getValue();
            if (c59439NUl != null && c59439NUl.LJLIL != -2) {
                LBY lby2 = this.LIZ;
                if (lby2 != null) {
                    lby2.setTitleBarBackgroundColor(c59439NUl.LJLIL);
                } else {
                    o.LJIJI("bulletTitleBar");
                    throw null;
                }
            }
            LBY lby3 = this.LIZ;
            if (lby3 != null) {
                TextView titleView = lby3.getTitleView();
                if (titleView != null) {
                    String str = (String) c59472NVs.LJIIIZ.getValue();
                    if (str == null) {
                        str = "";
                    }
                    titleView.setText(str);
                }
                C59439NUl c59439NUl2 = (C59439NUl) c59472NVs.LJIIJ.getValue();
                if (c59439NUl2 != null && c59439NUl2.LJLIL != -2) {
                    LBY lby4 = this.LIZ;
                    if (lby4 != null) {
                        TextView titleView2 = lby4.getTitleView();
                        if (titleView2 != null) {
                            titleView2.setTextColor(c59439NUl2.LJLIL);
                        }
                        LBY lby5 = this.LIZ;
                        if (lby5 != null) {
                            ImageView backView = lby5.getBackView();
                            if (backView != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    try {
                                        context2 = this.LIZJ;
                                    } catch (Resources.NotFoundException unused) {
                                        Context context3 = this.LIZJ;
                                        if (context3 != null) {
                                            Resources resources = context3.getResources();
                                            Context context4 = this.LIZJ;
                                            if (context4 != null) {
                                                LIZ = C0OW.LIZ(resources, R.drawable.b51, context4.getTheme());
                                                if (LIZ != null) {
                                                    C07820Sk.LJI(LIZ, c59439NUl2.LJLIL);
                                                }
                                            } else {
                                                o.LJIJI("context");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("context");
                                            throw null;
                                        }
                                    }
                                    if (context2 != null) {
                                        Resources resources2 = context2.getResources();
                                        Context context5 = this.LIZJ;
                                        if (context5 != null) {
                                            LIZ = C40681ii.LIZ(resources2, R.drawable.b52, context5.getTheme());
                                            if (LIZ != null) {
                                                LIZ.setTint(c59439NUl2.LJLIL);
                                                backView.setImageDrawable(LIZ);
                                            }
                                            LIZ = null;
                                            backView.setImageDrawable(LIZ);
                                        } else {
                                            o.LJIJI("context");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("context");
                                        throw null;
                                    }
                                } else {
                                    Context context6 = this.LIZJ;
                                    if (context6 != null) {
                                        Resources resources3 = context6.getResources();
                                        Context context7 = this.LIZJ;
                                        if (context7 != null) {
                                            LIZ = C0OW.LIZ(resources3, R.drawable.b51, context7.getTheme());
                                            if (LIZ != null) {
                                                C07820Sk.LJI(LIZ, c59439NUl2.LJLIL);
                                                backView.setImageDrawable(LIZ);
                                            }
                                            LIZ = null;
                                            backView.setImageDrawable(LIZ);
                                        } else {
                                            o.LJIJI("context");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("context");
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            o.LJIJI("bulletTitleBar");
                            throw null;
                        }
                    } else {
                        o.LJIJI("bulletTitleBar");
                        throw null;
                    }
                }
                Boolean value = c59472NVs.LJIJJLI.getValue();
                Boolean bool = Boolean.TRUE;
                if (o.LJ(value, bool)) {
                    LBY lby6 = this.LIZ;
                    if (lby6 != null) {
                        ImageView closeAllView = lby6.getCloseAllView();
                        if (closeAllView != null) {
                            closeAllView.setVisibility(0);
                        }
                    } else {
                        o.LJIJI("bulletTitleBar");
                        throw null;
                    }
                }
                EnumC59901Nf7 enumC59901Nf7 = (EnumC59901Nf7) c59472NVs.LJIIJJI.getValue();
                int i = 8;
                if (enumC59901Nf7 != null) {
                    int i2 = C59898Nf4.LIZ[enumC59901Nf7.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                LBY lby7 = this.LIZ;
                                if (lby7 != null) {
                                    ImageView reportView = lby7.getReportView();
                                    if (reportView != null) {
                                        reportView.setVisibility(8);
                                    }
                                    LBY lby8 = this.LIZ;
                                    if (lby8 != null) {
                                        ImageView shareView = lby8.getShareView();
                                        if (shareView != null) {
                                            shareView.setVisibility(0);
                                        }
                                        LBY lby9 = this.LIZ;
                                        if (lby9 != null) {
                                            ImageView shareView2 = lby9.getShareView();
                                            if (shareView2 != null) {
                                                C16880lQ.LJIILLIIL(shareView2, new ACListenerS30S0100000_10(this, 184));
                                            }
                                        } else {
                                            o.LJIJI("bulletTitleBar");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("bulletTitleBar");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("bulletTitleBar");
                                    throw null;
                                }
                            }
                        } else {
                            LBY lby10 = this.LIZ;
                            if (lby10 != null) {
                                ImageView shareView3 = lby10.getShareView();
                                if (shareView3 != null) {
                                    shareView3.setVisibility(8);
                                }
                                LBY lby11 = this.LIZ;
                                if (lby11 != null) {
                                    ImageView reportView2 = lby11.getReportView();
                                    if (reportView2 != null) {
                                        reportView2.setVisibility(0);
                                    }
                                    LBY lby12 = this.LIZ;
                                    if (lby12 != null) {
                                        ImageView reportView3 = lby12.getReportView();
                                        if (reportView3 != null) {
                                            C16880lQ.LJIILLIIL(reportView3, new ACListenerS30S0100000_10(this, 183));
                                        }
                                    } else {
                                        o.LJIJI("bulletTitleBar");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("bulletTitleBar");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("bulletTitleBar");
                                throw null;
                            }
                        }
                    } else {
                        LBY lby13 = this.LIZ;
                        if (lby13 != null) {
                            ImageView shareView4 = lby13.getShareView();
                            if (shareView4 != null) {
                                shareView4.setVisibility(8);
                            }
                            LBY lby14 = this.LIZ;
                            if (lby14 != null) {
                                ImageView reportView4 = lby14.getReportView();
                                if (reportView4 != null) {
                                    reportView4.setVisibility(8);
                                }
                            } else {
                                o.LJIJI("bulletTitleBar");
                                throw null;
                            }
                        } else {
                            o.LJIJI("bulletTitleBar");
                            throw null;
                        }
                    }
                }
                LBY lby15 = this.LIZ;
                if (lby15 != null) {
                    ImageView moreButtonView = lby15.getMoreButtonView();
                    if (moreButtonView != null) {
                        if (o.LJ(c59472NVs.LJIIL.getValue(), bool)) {
                            i = 0;
                        }
                        moreButtonView.setVisibility(i);
                        C16880lQ.LJIILLIIL(moreButtonView, new ACListenerS30S0100000_10(this, 182));
                    }
                    Integer value2 = c59472NVs.LJJI.getValue();
                    if (value2 != null && value2.intValue() == 1) {
                        LBY lby16 = this.LIZ;
                        if (lby16 != null) {
                            lby16.setTitleBarBackgroundColor(0);
                            LBY lby17 = this.LIZ;
                            if (lby17 != null) {
                                TextView titleView3 = lby17.getTitleView();
                                if (titleView3 != null) {
                                    titleView3.setVisibility(0);
                                }
                            } else {
                                o.LJIJI("bulletTitleBar");
                                throw null;
                            }
                        } else {
                            o.LJIJI("bulletTitleBar");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("bulletTitleBar");
                    throw null;
                }
            } else {
                o.LJIJI("bulletTitleBar");
                throw null;
            }
        }
        LBY lby18 = this.LIZ;
        if (lby18 != null) {
            lby18.getTitleBarRoot();
            return lby18;
        }
        o.LJIJI("bulletTitleBar");
        throw null;
    }
}
