package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.3rF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96933rF implements InterfaceC1041146t {
    public static final C96933rF LIZIZ = new C96933rF();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C89643fU.LJLIL);

    /* JADX WARN: Type inference failed for: r1v0, types: [X.4M7] */
    public final C4M7 LIZ(final C119624mk c119624mk, final String str) {
        final C4MC c4mc = (C4MC) LIZJ.getValue();
        return new C4M3(str, c4mc, c119624mk) { // from class: X.4M7
            public final C119624mk LJ;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C4M3
            public final void LJFF(String str2, UrlModel urlModel) {
                if (urlModel != 0) {
                    str2 = urlModel;
                }
                C45S.LIZ(str2, this.LJ);
            }

            {
                o.LJIIIZ(c4mc, "resManager");
                this.LJ = c119624mk;
            }

            @Override // X.C4M3
            public final void LJIIIIZZ(UrlModel urlModel, int i, int i2, int i3, final C4M5 c4m5) {
                C45S.LJI(this.LJ, false);
                C4AS.LIZLLL(this.LJ, urlModel, this.LIZ, i2, i3, null, new C4AY() { // from class: X.4MB
                    @Override // X.C4AY
                    public final /* synthetic */ void LIZ() {
                    }

                    @Override // X.W4Z
                    public final /* synthetic */ void LIZIZ(String str2, Throwable th) {
                    }

                    @Override // X.W4Z
                    public final /* synthetic */ void LIZJ(String str2) {
                    }

                    @Override // X.W4Z
                    public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str2) {
                        LIZ();
                    }

                    @Override // X.W4Z
                    public final /* synthetic */ void LJI(Object obj, String str2) {
                    }

                    @Override // X.W4Z
                    public final void LJ(String str2, Throwable th) {
                        C4M5 c4m52 = C4M5.this;
                        if (c4m52 != null) {
                            c4m52.LIZIZ();
                        }
                    }

                    @Override // X.W4Z
                    /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJFF(String str2, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
                        C4M5 c4m52 = C4M5.this;
                        if (c4m52 != null) {
                            c4m52.LIZ();
                        }
                    }
                }, i, i, null);
            }

            @Override // X.C4M3
            public final void LJI(String str2, UrlModel urlModel, int i, int i2, int i3, final C4M5 c4m5) {
                UrlModel urlModel2 = urlModel;
                if (urlModel2 == null) {
                    if (str2 != null) {
                        urlModel2 = C4AS.LJIIJ(str2);
                    } else {
                        urlModel2 = null;
                    }
                }
                C45S.LJFF(this.LJ, urlModel2, this.LIZ, i2, i3, new C4AY() { // from class: X.4MA
                    @Override // X.C4AY
                    public final /* synthetic */ void LIZ() {
                    }

                    @Override // X.W4Z
                    public final /* synthetic */ void LIZIZ(String str3, Throwable th) {
                    }

                    @Override // X.W4Z
                    public final /* synthetic */ void LIZJ(String str3) {
                    }

                    @Override // X.W4Z
                    public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str3) {
                        LIZ();
                    }

                    @Override // X.W4Z
                    public final /* synthetic */ void LJI(Object obj, String str3) {
                    }

                    @Override // X.W4Z
                    public final void LJ(String str3, Throwable th) {
                        C4M5 c4m52 = C4M5.this;
                        if (c4m52 != null) {
                            c4m52.LIZIZ();
                        }
                    }

                    @Override // X.W4Z
                    /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
                    public final void LJFF(String str3, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
                        C4M5 c4m52 = C4M5.this;
                        if (c4m52 != null) {
                            c4m52.LIZ();
                        }
                    }
                }, null, 928);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.4M4] */
    public final C4M4 LIZIZ(final SmartAvatarImageView view, final String str) {
        o.LJIIIZ(view, "view");
        final C4MC c4mc = (C4MC) LIZJ.getValue();
        return new C4M3(str, c4mc, view) { // from class: X.4M4
            public final InterfaceC85013Vh LJ;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C4M3
            public final void LJFF(String str2, UrlModel urlModel) {
                VA8 va8;
                if (urlModel != 0) {
                    str2 = urlModel;
                }
                Object obj = this.LJ;
                if (obj instanceof VA8) {
                    va8 = (VA8) obj;
                } else {
                    va8 = null;
                }
                C45S.LIZ(str2, va8);
            }

            {
                o.LJIIIZ(c4mc, "resManager");
                o.LJIIIZ(view, "imageView");
                this.LJ = view;
            }

            @Override // X.C4M3
            public final void LJIIIIZZ(UrlModel urlModel, int i, int i2, int i3, final C4M5 c4m5) {
                VA8 va8;
                Object obj = this.LJ;
                if ((obj instanceof VA8) && (va8 = (VA8) obj) != null) {
                    C45S.LJI(va8, false);
                }
                final String str2 = this.LIZ;
                C81929WDl c81929WDl = new C81929WDl(str2) { // from class: X.4M9
                    @Override // X.C81929WDl, X.InterfaceC70769Rq1
                    public final void s2(android.net.Uri uri, View view2, Throwable th) {
                        super.s2(uri, view2, th);
                        C4M5 c4m52 = C4M5.this;
                        if (c4m52 != null) {
                            c4m52.LIZIZ();
                        }
                    }

                    @Override // X.C81929WDl, X.InterfaceC70769Rq1
                    public final void U0(android.net.Uri uri, View view2, C2047581v c2047581v, Animatable animatable) {
                        super.U0(uri, view2, c2047581v, animatable);
                        C4M5 c4m52 = C4M5.this;
                        if (c4m52 != null) {
                            c4m52.LIZ();
                        }
                    }
                };
                if (urlModel == null) {
                    W5F LJ = W5U.LJ(i2);
                    LJ.LJJIIJ = this.LJ;
                    LJ.LIZLLL(c81929WDl);
                    return;
                }
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                LJII.LJJIIJ = this.LJ;
                if (i2 > 0) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = i2;
                    Object obj2 = this.LJ;
                    o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
                    Context context = ((View) obj2).getContext();
                    o.LJIIIIZZ(context, "imageView as SmartAvatarImageView).context");
                    LJII.LJIILLIIL = c2068389v.LIZ(context);
                }
                if (i3 > 0) {
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = i3;
                    Object obj3 = this.LJ;
                    o.LJII(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
                    Context context2 = ((View) obj3).getContext();
                    o.LJIIIIZZ(context2, "imageView as SmartAvatarImageView).context");
                    LJII.LJIILIIL = c2068389v2.LIZ(context2);
                }
                if (i > 0) {
                    LJII.LJII = i;
                    LJII.LJIIIIZZ = i;
                }
                LJII.LJJIII = EnumC62195Ob1.SMALL;
                LJII.LIZLLL(c81929WDl);
            }

            @Override // X.C4M3
            public final void LJI(String str2, UrlModel urlModel, int i, int i2, int i3, final C4M5 c4m5) {
                final String str3 = this.LIZ;
                C81929WDl c81929WDl = new C81929WDl(str3) { // from class: X.4M8
                    @Override // X.C81929WDl, X.InterfaceC70769Rq1
                    public final void s2(android.net.Uri uri, View view2, Throwable th) {
                        super.s2(uri, view2, th);
                        C4M5 c4m52 = C4M5.this;
                        if (c4m52 != null) {
                            c4m52.LIZIZ();
                        }
                    }

                    @Override // X.C81929WDl, X.InterfaceC70769Rq1
                    public final void U0(android.net.Uri uri, View view2, C2047581v c2047581v, Animatable animatable) {
                        super.U0(uri, view2, c2047581v, animatable);
                        C4M5 c4m52 = C4M5.this;
                        if (c4m52 != null) {
                            c4m52.LIZ();
                        }
                    }
                };
                if (urlModel != null) {
                    W5F LJ = C45S.LJ(this.LJ, C78939UyV.LJ(urlModel), i2, i3, null, 16);
                    LJ.LJJIII = EnumC62195Ob1.SMALL;
                    LJ.LIZLLL(c81929WDl);
                } else if (str2 == null || str2.length() == 0) {
                    W5F LJ2 = W5U.LJ(i2);
                    LJ2.LJJIIJ = this.LJ;
                    C16880lQ.LLJJJ(LJ2);
                } else {
                    W5F LIZIZ2 = C45S.LIZIZ(this.LJ, str2, i, i, i2, i3);
                    LIZIZ2.LJJIII = EnumC62195Ob1.SMALL;
                    LIZIZ2.LIZLLL(c81929WDl);
                }
            }
        };
    }
}
