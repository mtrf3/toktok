package X;

import Y.IDAListenerS73S0000000_4;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9tA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251009tA extends ViewOnTouchListenerC251379tl {
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public boolean LL;
    public View LLD;
    public TextView LLF;
    public final C62822Ol8 LLFF;
    public View LLFFF;
    public TextView LLFII;
    public View LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public String LLII;
    public String LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public int LLIIJLIL;
    public C251349ti LLIIL;
    public InterfaceC251479tv LLIILII;

    private final TuxIconView getArrowView() {
        return (TuxIconView) this.LJZL.getValue();
    }

    private final C72832SiC getNormalLottieView() {
        return (C72832SiC) this.LJLLLL.getValue();
    }

    private final TuxTextView getPendantBottomTextView() {
        return (TuxTextView) this.LJLLLLLL.getValue();
    }

    private final View getPendantLayout() {
        return (View) this.LJZI.getValue();
    }

    private final SmartImageView getSmallSmartImageView() {
        return (SmartImageView) this.LJLZ.getValue();
    }

    private final SmartImageView getSmartImageView() {
        return (SmartImageView) this.LJLLL.getValue();
    }

    public final void LJI() {
        setCanDrag(true);
        this.LL = false;
        getSmartImageView().setVisibility(0);
        getSmallSmartImageView().setVisibility(8);
        getNormalLottieView().setVisibility(8);
        getPendantBottomTextView().setVisibility(8);
        LJ(80.0f);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.LLI);
        LJIIIIZZ.LJJIIJZLJL = getSmartImageView();
        LJIIIIZZ.LIZLLL(new AbstractC72439Sbr() { // from class: X.9tF
            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                C251009tA.this.LLIIIL = false;
                C251009tA.LIZJ(0);
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                C251009tA c251009tA = C251009tA.this;
                c251009tA.LLIIIL = true;
                c251009tA.setCloseViewStatus(!c251009tA.LLIIIILZ);
                C251009tA.this.getClass();
                C251009tA.LIZJ(1);
            }
        });
    }

    public final ImageView getCloseView() {
        return (ImageView) this.LJZ.getValue();
    }

    public final View getLongBubbleLayout() {
        return (View) this.LLFF.getValue();
    }

    public final void LJII() {
        if (getVisibility() == 0) {
            getSmartImageView().setVisibility(8);
            getSmallSmartImageView().setVisibility(8);
            getNormalLottieView().setVisibility(0);
            if (this.LLII.length() > 0) {
                getPendantBottomTextView().setVisibility(0);
                getPendantBottomTextView().setText(this.LLII);
                TuxTextView pendantBottomTextView = getPendantBottomTextView();
                C247489nU c247489nU = C247489nU.LIZ;
                pendantBottomTextView.setTextColor(C247489nU.LIZIZ(c247489nU, this.LLII));
                TuxTextView pendantBottomTextView2 = getPendantBottomTextView();
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZ = Integer.valueOf(C247489nU.LIZIZ(c247489nU, this.LLIIII));
                c110614Vt.LIZJ = C61328O5c.LIZJ(90);
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                pendantBottomTextView2.setBackground(c110614Vt.LIZ(context));
            }
            LJ(80.0f);
            C251069tG.LIZ(getNormalLottieView());
        }
    }

    public final int getNormalPendantSubType() {
        return this.LLIIJLIL;
    }

    public final boolean getStaticPendantIsFold() {
        return this.LL;
    }

    public final int getSubType() {
        return this.LLIIJLIL;
    }

    public final InterfaceC251479tv getSubViewListener() {
        return this.LLIILII;
    }

    public C251009tA(Context context) {
        super(context, null, 0);
        this.LJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1000));
        this.LJLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 996));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 997));
        this.LJLZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 999));
        this.LJZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 994));
        this.LJZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 998));
        this.LJZL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 993));
        this.LLFF = C221108m2.LIZIZ(new AqS154S0100000_4(this, 995));
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLII = "";
        this.LLIIII = "#E75300";
        this.LLIIIJ = true;
        this.LLIIJLIL = 1;
        if (C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ctg, this, true) != null) {
            if (C251659uD.LIZ()) {
                getArrowView().setRotation(180.0f);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public static void LIZJ(int i) {
        int i2;
        C95U LIZLLL = C2MW.LIZ().LIZLLL(1);
        if (LIZLLL != null) {
            int i3 = LIZLLL.LIZ;
            Integer num = LIZLLL.LIZJ;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            C247749nu.LIZIZ(i, i3, i2);
        }
    }

    public final void LJ(float f) {
        int i;
        int LJIILL = KL2.LJIILL(getContext(), KL2.LJIIL(getContext()) + 0.0f);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C248069oQ.LIZ(context)) {
            i = 80;
        } else {
            i = 70;
        }
        int i2 = LJIILL + i;
        ViewGroup.LayoutParams layoutParams = getPendantLayout().getLayoutParams();
        layoutParams.width = (int) KL2.LIZJ(getContext(), f);
        getPendantLayout().setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).topMargin = (int) KL2.LIZJ(getContext(), i2);
        }
        setLayoutParams(layoutParams2);
    }

    public final void LJFF(final InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LLIIJLIL = 1;
        this.LLIIIJ = true;
        getSmartImageView().setVisibility(0);
        getSmallSmartImageView().setVisibility(8);
        getNormalLottieView().setVisibility(8);
        getPendantBottomTextView().setVisibility(8);
        LJ(80.0f);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.LLI);
        LJIIIIZZ.LJJIIJZLJL = getSmartImageView();
        LJIIIIZZ.LIZLLL(new AbstractC72439Sbr() { // from class: X.9tC
            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                C251009tA.this.LLIIIL = false;
                InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Boolean.FALSE);
                }
                C251009tA.this.getClass();
                C251009tA.LIZJ(0);
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                int i;
                C251009tA c251009tA = C251009tA.this;
                c251009tA.LLIIIL = true;
                ImageView closeView = c251009tA.getCloseView();
                if (!C251009tA.this.LLIIIILZ) {
                    i = 0;
                } else {
                    i = 8;
                }
                closeView.setVisibility(i);
                InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Boolean.TRUE);
                }
                C251009tA.this.getClass();
                C251009tA.LIZJ(1);
            }
        });
    }

    public final void setCloseViewStatus(boolean z) {
        int i;
        ImageView closeView = getCloseView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        closeView.setVisibility(i);
    }

    public final void setLottieStatus(boolean z) {
        this.LLIIJI = z;
    }

    public final void setSubType(int i) {
        this.LLIIJLIL = i;
    }

    public final void setSubViewListener(InterfaceC251479tv interfaceC251479tv) {
        this.LLIILII = interfaceC251479tv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        if (r8 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006c, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
    
        if (r8 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        r0 = new X.C251589u6();
        r1 = r0.LIZIZ(r4, r3, r6);
        r0 = (X.C251629uA) r0.LIZ.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        r0 = r0.LIZJ(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009b, code lost:
    
        LIZIZ(r1, r0, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
    
        r5.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0078, code lost:
    
        r0 = r8.lottieName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007a, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007c, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0074, code lost:
    
        r3 = r8.lottieFileMd5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0076, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0072, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.9tH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.touchpoint.core.model.NormalPendant r8, final X.C249929rQ r9) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251009tA.LIZ(com.bytedance.touchpoint.core.model.NormalPendant, X.9rQ):void");
    }

    public final void LIZLLL(String imgUrl, boolean z) {
        float width;
        o.LJIIIZ(imgUrl, "imgUrl");
        getSmartImageView().setVisibility(8);
        getNormalLottieView().setVisibility(8);
        getPendantBottomTextView().setVisibility(8);
        getSmallSmartImageView().setVisibility(0);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(imgUrl);
        LJIIIIZZ.LJJIIJZLJL = getSmallSmartImageView();
        LJIIIIZZ.LIZLLL(new AbstractC72439Sbr() { // from class: X.9tB
            @Override // X.InterfaceC70769Rq1
            public final void s2(android.net.Uri uri, View view, Throwable th) {
                C251009tA.this.LLIIIZ = false;
                C251009tA.LIZJ(0);
            }

            @Override // X.InterfaceC70769Rq1
            public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                int i;
                C251009tA c251009tA = C251009tA.this;
                c251009tA.LLIIIZ = true;
                ImageView closeView = c251009tA.getCloseView();
                if (C251009tA.this.LLIIIJ) {
                    i = 0;
                } else {
                    i = 8;
                }
                closeView.setVisibility(i);
                C250209rs LIZ = C95J.LIZ(1);
                if (LIZ == null || !(LIZ instanceof C250659sb)) {
                    C247669nm.LIZ().LJJJ(0, "non_tracker", "finished");
                }
                C251009tA.this.getClass();
                C251009tA.LIZJ(1);
            }
        });
        LJ(32.0f);
        if (getParent() == null) {
            return;
        }
        Object parent = getParent();
        if (parent != null) {
            View view = (View) parent;
            if (!z) {
                width = KL2.LIZJ(getContext(), -8.0f);
            } else {
                width = view.getWidth() - KL2.LIZJ(getContext(), 32.0f);
            }
            animate().setListener(new IDAListenerS73S0000000_4(1)).x(width).y(getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public final void LIZIZ(final InputStream inputStream, String str, final C251079tH c251079tH, String str2) {
        final C72832SiC lottieView = getNormalLottieView();
        o.LJIIIZ(lottieView, "lottieView");
        try {
            C0GU<C0GY> LJI = C04650Gf.LJI(inputStream, str2);
            LJI.LIZIZ(new InterfaceC04760Gq() { // from class: X.9tI
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    C0GY it = (C0GY) obj;
                    C72832SiC c72832SiC = C72832SiC.this;
                    o.LJIIIIZZ(it, "it");
                    c72832SiC.setComposition(it);
                    InterfaceC251569u4 interfaceC251569u4 = c251079tH;
                    if (interfaceC251569u4 != null) {
                        interfaceC251569u4.LIZ();
                    }
                }
            });
            LJI.LIZ(new InterfaceC04760Gq() { // from class: X.9te
                @Override // X.InterfaceC04760Gq
                public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                }
            });
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
