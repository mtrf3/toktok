package o53;

import X.AbstractC59922Wu;
import X.C0NB;
import X.C16880lQ;
import X.C47061t0;
import X.C75357Thp;
import X.C76175Tv1;
import X.C78720Uuy;
import X.C79284V9s;
import X.C81392Vwy;
import X.InterfaceC75158Tec;
import X.InterfaceC81599W0t;
import X.U46;
import X.UYF;
import X.UYG;
import X.W0K;
import X.W4V;
import X.W4W;
import X.W5A;
import X.W5C;
import X.W5G;
import X.X1D;
import Y.ACListenerS21S0101000_2;
import Y.ARunnableS16S0201000_13;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes14.dex */
public class IDdS198S0200000_13 extends W4V {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.W4V, X.W4Z
    public final void LIZIZ(String str, Throwable th) {
        switch (this.$t) {
            case 4:
                LIZIZ$0(this, str, th);
                return;
            default:
                super.LIZIZ(str, th);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LIZLLL(Object obj, String str) {
        switch (this.$t) {
            case 3:
                LIZLLL$0(this, obj, str);
                return;
            default:
                super.LIZLLL(obj, str);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, th);
                return;
            case 1:
                LJ$1(this, str, th);
                return;
            case 2:
            case 3:
            default:
                super.LJ(str, th);
                return;
            case 4:
                LJ$2(this, str, th);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, str, obj, animatable);
                return;
            case 1:
                LJFF$1(this, str, obj, animatable);
                return;
            case 2:
                LJFF$2(this, str, obj, animatable);
                return;
            case 3:
                LJFF$3(this, str, obj, animatable);
                return;
            case 4:
                LJFF$4(this, str, obj, animatable);
                return;
            default:
                super.LJFF(str, obj, animatable);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        switch (this.$t) {
            case 4:
                LJI$0(this, obj, str);
                return;
            default:
                super.LJI(obj, str);
                return;
        }
    }

    public IDdS198S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LIZIZ$0(IDdS198S0200000_13 iDdS198S0200000_13, String str, Throwable th) {
        Object obj;
        List<Uri> LIZ;
        InterfaceC75158Tec interfaceC75158Tec = (InterfaceC75158Tec) iDdS198S0200000_13.l0;
        if (interfaceC75158Tec != null) {
            AbstractC59922Wu abstractC59922Wu = ((C78720Uuy) iDdS198S0200000_13.l1).LIZJ;
            RuntimeException runtimeException = null;
            if (abstractC59922Wu != null && (LIZ = abstractC59922Wu.LIZ()) != null) {
                obj = ListProtector.get(LIZ, 0);
            } else {
                obj = null;
            }
            String valueOf = String.valueOf(obj);
            if (th != null) {
                runtimeException = new RuntimeException(th);
            }
            interfaceC75158Tec.LJIILL(runtimeException, valueOf);
        }
    }

    public static final void LIZLLL$0(IDdS198S0200000_13 iDdS198S0200000_13, Object obj, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" Intermediate load image id is ");
        LIZ.append(str);
        LIZ.append(", update view size");
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ));
        U46 u46 = (U46) iDdS198S0200000_13.l0;
        W5G w5g = (W5G) iDdS198S0200000_13.l1;
        u46.getClass();
        U46.LJIILL((InterfaceC81599W0t) obj, w5g);
    }

    public static final void LJ$0(IDdS198S0200000_13 iDdS198S0200000_13, String str, Throwable th) {
        C47061t0 c47061t0 = (C47061t0) iDdS198S0200000_13.l0;
        if (c47061t0 != null && c47061t0.getId() == R.id.hb4) {
            ((C75357Thp) iDdS198S0200000_13.l1).LJLL = false;
        } else {
            C47061t0 c47061t02 = (C47061t0) iDdS198S0200000_13.l0;
            if (c47061t02 != null && c47061t02.getId() == R.id.i1g) {
                ((C75357Thp) iDdS198S0200000_13.l1).LJLLILLLL = false;
            }
        }
        C76175Tv1.LIZ.LIZ(40008, String.valueOf(th), null);
    }

    public static final void LJ$1(IDdS198S0200000_13 iDdS198S0200000_13, String str, Throwable th) {
        ConstraintLayout constraintLayout;
        UYG uyg = (UYG) iDdS198S0200000_13.l1;
        UYF uyf = uyg.LJLJL;
        if (uyf != null) {
            uyf.LIZ(false, uyg.LJLIL, W0K.GIF);
        }
        UYG uyg2 = (UYG) iDdS198S0200000_13.l1;
        if (uyg2.LJLJLJ && (constraintLayout = uyg2.LJLJJL) != null) {
            constraintLayout.postDelayed(uyg2.LJLLILLLL, 5000L);
        }
    }

    public static final void LJ$2(IDdS198S0200000_13 iDdS198S0200000_13, String str, Throwable th) {
        Object obj;
        List<Uri> LIZ;
        InterfaceC75158Tec interfaceC75158Tec = (InterfaceC75158Tec) iDdS198S0200000_13.l0;
        if (interfaceC75158Tec != null) {
            AbstractC59922Wu abstractC59922Wu = ((C78720Uuy) iDdS198S0200000_13.l1).LIZJ;
            RuntimeException runtimeException = null;
            if (abstractC59922Wu != null && (LIZ = abstractC59922Wu.LIZ()) != null) {
                obj = ListProtector.get(LIZ, 0);
            } else {
                obj = null;
            }
            String valueOf = String.valueOf(obj);
            if (th != null) {
                runtimeException = new RuntimeException(th);
            }
            interfaceC75158Tec.LJIILL(runtimeException, valueOf);
        }
    }

    public static final void LJI$0(IDdS198S0200000_13 iDdS198S0200000_13, Object obj, String str) {
        System.currentTimeMillis();
        InterfaceC75158Tec interfaceC75158Tec = (InterfaceC75158Tec) iDdS198S0200000_13.l0;
        if (interfaceC75158Tec != null) {
            interfaceC75158Tec.LJ();
        }
    }

    public static final void LJFF$0(IDdS198S0200000_13 iDdS198S0200000_13, String str, Object obj, Animatable animatable) {
        C47061t0 c47061t0 = (C47061t0) iDdS198S0200000_13.l0;
        if (c47061t0 != null && c47061t0.getId() == R.id.hb4) {
            ((C75357Thp) iDdS198S0200000_13.l1).LJLL = false;
            return;
        }
        C47061t0 c47061t02 = (C47061t0) iDdS198S0200000_13.l0;
        if (c47061t02 == null || c47061t02.getId() != R.id.i1g) {
            return;
        }
        ((C75357Thp) iDdS198S0200000_13.l1).LJLLILLLL = false;
    }

    public static final void LJFF$1(IDdS198S0200000_13 iDdS198S0200000_13, String str, Object obj, Animatable animatable) {
        View view;
        ((FrameLayout) iDdS198S0200000_13.l0).setBackgroundResource(R.drawable.a72);
        UYG uyg = (UYG) iDdS198S0200000_13.l1;
        ExtraParams extraParams = uyg.LJLILLLLZI;
        View view2 = uyg.LJLJI;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.kho);
            if (1 == extraParams.manualClose) {
                findViewById.setVisibility(0);
                C16880lQ.LJIIJ(new ACListenerS21S0101000_2(3, uyg, 3), findViewById);
            } else {
                findViewById.setVisibility(8);
            }
        }
        if (animatable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            animatedDrawable2.LJLIL = 2;
            animatedDrawable2.LJLILLLLZI = true;
            animatable.start();
            long LIZLLL = ((AnimatedDrawable2) animatable).LIZLLL();
            if (LIZLLL > 0 && (view = ((UYG) iDdS198S0200000_13.l1).LJLJI) != null) {
                view.postDelayed(new ARunnableS16S0201000_13(2, iDdS198S0200000_13, animatable, 1), LIZLLL * 2);
            }
        }
        UYG uyg2 = (UYG) iDdS198S0200000_13.l1;
        UYF uyf = uyg2.LJLJL;
        if (uyf != null) {
            uyf.LIZ(true, uyg2.LJLIL, W0K.GIF);
        }
    }

    public static final void LJFF$2(IDdS198S0200000_13 iDdS198S0200000_13, String str, Object obj, Animatable animatable) {
        C81392Vwy c81392Vwy;
        Bitmap underlyingBitmap;
        try {
            c81392Vwy = (C81392Vwy) ((W4W) iDdS198S0200000_13.l0).getResult();
            if (c81392Vwy != null) {
                try {
                    W5A w5a = (W5A) c81392Vwy.LJI();
                    if ((w5a instanceof W5C) && (underlyingBitmap = ((W5C) w5a).getUnderlyingBitmap()) != null) {
                        ((C79284V9s) iDdS198S0200000_13.l1).setImageBitmap(underlyingBitmap);
                    }
                } catch (Throwable th) {
                    th = th;
                    ((W4W) iDdS198S0200000_13.l0).close();
                    C81392Vwy.LJ(c81392Vwy);
                    throw th;
                }
            }
            ((W4W) iDdS198S0200000_13.l0).close();
            C81392Vwy.LJ(c81392Vwy);
        } catch (Throwable th2) {
            th = th2;
            c81392Vwy = null;
        }
    }

    public static final void LJFF$3(IDdS198S0200000_13 iDdS198S0200000_13, String str, Object obj, Animatable animatable) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" final load image id is ");
        LIZ.append(str);
        LIZ.append(", update view size");
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ));
        U46 u46 = (U46) iDdS198S0200000_13.l0;
        W5G w5g = (W5G) iDdS198S0200000_13.l1;
        u46.getClass();
        U46.LJIILL((InterfaceC81599W0t) obj, w5g);
    }

    public static final void LJFF$4(IDdS198S0200000_13 iDdS198S0200000_13, String str, Object obj, Animatable animatable) {
        InterfaceC75158Tec interfaceC75158Tec;
        Object obj2;
        List<Uri> LIZ;
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        if (interfaceC81599W0t != null) {
            InterfaceC75158Tec interfaceC75158Tec2 = (InterfaceC75158Tec) iDdS198S0200000_13.l0;
            C78720Uuy c78720Uuy = (C78720Uuy) iDdS198S0200000_13.l1;
            if (interfaceC75158Tec2 != null) {
                AbstractC59922Wu abstractC59922Wu = c78720Uuy.LIZJ;
                if (abstractC59922Wu != null && (LIZ = abstractC59922Wu.LIZ()) != null) {
                    obj2 = ListProtector.get(LIZ, 0);
                } else {
                    obj2 = null;
                }
                interfaceC75158Tec2.LJIILJJIL(interfaceC81599W0t.getWidth(), interfaceC81599W0t.getHeight(), String.valueOf(obj2));
            }
        }
        if (animatable != null && (interfaceC75158Tec = (InterfaceC75158Tec) iDdS198S0200000_13.l0) != null) {
            interfaceC75158Tec.LJFF(animatable);
        }
    }
}
