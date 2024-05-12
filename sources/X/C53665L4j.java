package X;

import Y.ACListenerS44S0200000_9;
import Y.ARunnableS20S0300000_9;
import Y.ARunnableS6S0310000_9;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.view.View;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.avatar.vm.AvatarControllerVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.L4j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53665L4j implements L6A, L5U, Observer<java.util.Map<L4T, ? extends L4W>> {
    public L69 LJLIL;
    public C71799SFv LJLILLLLZI;
    public Context LJLJI;
    public C53668L4m LJLJJI;
    public AU2 LJLJJL;
    public AUU LJLJJLL;
    public String LJLL;
    public Object LJLLI;
    public boolean LJLLL;
    public AtomicBoolean LJLLLL;
    public boolean LJLLLLLL;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C53659L4d.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C53662L4g.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C53660L4e.LJLIL);
    public int LJLLILLLL = 64;
    public int LJLLJ = 84;
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C53681L4z.LJLIL);
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(C53661L4f.LJLIL);
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(C53677L4v.LJLIL);
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 0));

    @Override // X.L6A
    public final void LJ(int i, int i2, int i3, int i4) {
    }

    @Override // X.L6A
    public final void LJIILLIIL(int i, int i2) {
    }

    @Override // X.L6A
    public final int LIZLLL() {
        return C7MY.LIZIZ(this.LJLLJ);
    }

    public final ConcurrentHashMap<EnumC53663L4h, L21<?, ?>> LJIJJLI() {
        return (ConcurrentHashMap) this.LJLJLLL.getValue();
    }

    public final AvatarControllerVM LJIL() {
        return (AvatarControllerVM) this.LJLJL.getValue();
    }

    public final ConcurrentHashMap<EnumC53663L4h, L4O> LJJ() {
        return (ConcurrentHashMap) this.LJLJLJ.getValue();
    }

    @Override // X.L6A
    public final void LIZIZ() {
        AbstractC53462KyY abstractC53462KyY;
        C53461KyX c53461KyX;
        L50 l50;
        L50 l502;
        C53514KzO c53514KzO;
        C53461KyX c53461KyX2;
        F9E LIZIZ;
        L50 l503;
        C53513KzN c53513KzN;
        C53461KyX c53461KyX3;
        L4P l4p;
        java.util.Map map = (java.util.Map) LJIL().LJLJLLL.getValue();
        if (map == null) {
            return;
        }
        C53668L4m c53668L4m = this.LJLJJI;
        if (c53668L4m != null) {
            for (Map.Entry entry : map.entrySet()) {
                L4T l4t = (L4T) entry.getKey();
                L4W l4w = (L4W) entry.getValue();
                if (l4w != null && (l4p = l4w.LIZJ) != null) {
                    abstractC53462KyY = l4p.LIZ();
                } else {
                    abstractC53462KyY = null;
                }
                if ((abstractC53462KyY instanceof C53461KyX) && (c53461KyX = (C53461KyX) abstractC53462KyY) != null && (l50 = c53461KyX.LIZIZ) != null) {
                    View view = c53668L4m.LIZIZ().get(Integer.valueOf(C79234V7u.LJIIJJI(l4w.LIZ, l4t, l50, null)));
                    if (l50 instanceof C53513KzN) {
                        C53667L4l c53667L4l = C53667L4l.LIZJ;
                        L69 rootView = c53668L4m.LIZ;
                        c53667L4l.getClass();
                        o.LJIIIZ(rootView, "rootView");
                        AbstractC53462KyY LIZ = l4w.LIZJ.LIZ();
                        if ((LIZ instanceof C53461KyX) && (c53461KyX3 = (C53461KyX) LIZ) != null) {
                            l503 = c53461KyX3.LIZIZ;
                        } else {
                            l503 = null;
                        }
                        if ((l503 instanceof C53513KzN) && (c53513KzN = (C53513KzN) l503) != null && view != null) {
                            c53667L4l.LIZJ(view, rootView.getAvatar(), rootView, c53513KzN.LIZ, c53513KzN.LIZLLL);
                        }
                    } else if (l50 instanceof C53514KzO) {
                        AbstractC53666L4k abstractC53666L4k = (AbstractC53666L4k) c53668L4m.LJFF.getValue();
                        L69 rootView2 = c53668L4m.LIZ;
                        abstractC53666L4k.getClass();
                        o.LJIIIZ(rootView2, "rootView");
                        AbstractC53462KyY LIZ2 = l4w.LIZJ.LIZ();
                        if ((LIZ2 instanceof C53461KyX) && (c53461KyX2 = (C53461KyX) LIZ2) != null) {
                            l502 = c53461KyX2.LIZIZ;
                        } else {
                            l502 = null;
                        }
                        if ((l502 instanceof C53514KzO) && (c53514KzO = (C53514KzO) l502) != null && view != null) {
                            abstractC53666L4k.LIZJ(view, rootView2.getAvatar(), rootView2, c53514KzO.LJIIJ, c53514KzO.LJIIJJI);
                        }
                    }
                    if (l50 instanceof InterfaceC53481Kyr) {
                        if (l50.LIZ()) {
                            LIZIZ = C53671L4p.LIZ(l50.LIZIZ(), l50.getPosition(), l50.getSize(), c53668L4m.LIZ, C2WB.LJLIL);
                        } else {
                            LIZIZ = C53671L4p.LIZIZ(l50.LIZIZ(), l50.getPosition(), l50.getSize(), c53668L4m.LIZ);
                        }
                        ((java.util.Map) c53668L4m.LJII.getValue()).put(l4t, LIZIZ);
                    }
                }
            }
            return;
        }
        o.LJIJI("avatarUIExecutor");
        throw null;
    }

    @Override // X.L6A
    public final java.util.Map<EnumC53663L4h, L4O> LJFF() {
        return LJJ();
    }

    @Override // X.L6A
    public final int LJIILJJIL() {
        return this.LJLLILLLL;
    }

    @Override // X.L5U
    public final String LJIJ() {
        return this.LJLL;
    }

    @Override // X.L6A
    public final boolean LJIJJ() {
        return this.LJLLL;
    }

    @Override // X.L6A
    public final void LIZ(AUU auu) {
        Integer num;
        Integer num2;
        AUV auv;
        java.util.Set<? extends InterfaceC53590L1m<?>> set;
        AvatarControllerVM LJIL = LJIL();
        LJIL.getClass();
        LJIL.LJLJI = auu;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AUU auu2 = LJIL.LJLJI;
        if (auu2 != null && (auv = auu2.LIZIZ) != null && (set = auv.LIZ) != null) {
            for (InterfaceC53590L1m<?> interfaceC53590L1m : set) {
                EnumC53663L4h tag = interfaceC53590L1m.LIZ();
                o.LJIIIZ(tag, "tag");
                AbstractC53585L1h<?, ?> abstractC53585L1h = (AbstractC53585L1h) ((LinkedHashMap) C53583L1f.LIZ).get(tag);
                if (abstractC53585L1h != null) {
                    InterfaceC53587L1j<?, ?> LIZJ = abstractC53585L1h.LIZJ(interfaceC53590L1m.LIZIZ());
                    AbstractC53588L1k<?, ?> LIZIZ = abstractC53585L1h.LIZIZ(interfaceC53590L1m.LIZIZ());
                    LJIL.gv0().put(tag, abstractC53585L1h);
                    linkedHashMap.put(tag, LIZIZ);
                    ((java.util.Map) LJIL.LJLJJL.getValue()).put(tag, interfaceC53590L1m.LIZIZ());
                    ((java.util.Map) LJIL.LJLJJLL.getValue()).put(tag, LIZJ);
                    if ((LIZJ instanceof InterfaceC53591L1n) && LIZJ != null) {
                        LJIL.hv0().put(tag, LIZJ);
                    }
                }
            }
        }
        L4L l4l = (L4L) LJIL.LJLILLLLZI.getValue();
        AUV config = auu.LIZIZ;
        java.util.Map<EnumC53663L4h, AbstractC53585L1h<?, ?>> businessAdapters = LJIL.gv0();
        java.util.Map<EnumC53663L4h, ? extends InterfaceC53587L1j<?, ?>> dataAdapters = (java.util.Map) LJIL.LJLJJLL.getValue();
        l4l.getClass();
        o.LJIIIZ(config, "config");
        o.LJIIIZ(businessAdapters, "businessAdapters");
        o.LJIIIZ(dataAdapters, "dataAdapters");
        l4l.LIZIZ = l4l.LIZ.get(Integer.valueOf(config.LIZIZ.getValue()));
        l4l.LIZJ = businessAdapters;
        l4l.LIZLLL = dataAdapters;
        l4l.LJ = linkedHashMap;
        this.LJLJJLL = auu;
        AU2 au2 = auu.LIZ;
        this.LJLJJL = au2;
        if (au2 != null && (num2 = au2.LIZLLL) != null) {
            LJIIIZ(num2.intValue());
        }
        AU2 au22 = this.LJLJJL;
        if (au22 != null && (num = au22.LJ) != null) {
            this.LJLLJ = num.intValue();
        }
    }

    @Override // X.L6A
    public final ACListenerS44S0200000_9 LJII(View.OnClickListener onClickListener) {
        C53668L4m c53668L4m = this.LJLJJI;
        if (c53668L4m != null) {
            c53668L4m.LJIIJJI = onClickListener;
            return new ACListenerS44S0200000_9(c53668L4m, onClickListener, 4);
        }
        o.LJIJI("avatarUIExecutor");
        throw null;
    }

    @Override // X.L6A
    public final void LJIIIZ(int i) {
        if (this.LJLLILLLL != i) {
            this.LJLLILLLL = i;
            L69 l69 = this.LJLIL;
            if (l69 != null) {
                l69.getAvatar().setSize(i);
                int i2 = this.LJLLILLLL;
                int i3 = 32;
                if (i2 > 24) {
                    if (i2 <= 28) {
                        i3 = 38;
                    } else if (i2 <= 32) {
                        i3 = 43;
                    } else if (i2 <= 40) {
                        i3 = 54;
                    } else {
                        i3 = 64;
                        if (i2 > 48) {
                            if (i2 <= 56) {
                                i3 = 75;
                            } else if (i2 <= 64) {
                                i3 = 86;
                            } else {
                                i3 = 96;
                                if (i2 > 72) {
                                    if (i2 <= 84) {
                                        i3 = 116;
                                    } else if (i2 <= 96) {
                                        i3 = 128;
                                    } else if (i2 <= 120) {
                                        i3 = 160;
                                    } else {
                                        i3 = i2 + 20;
                                    }
                                }
                            }
                        }
                    }
                }
                this.LJLLJ = i3;
                return;
            }
            o.LJIJI("containerView");
            throw null;
        }
    }

    @Override // X.L6A
    public final void LJIIJJI(View.OnClickListener onClickListener) {
        C53668L4m c53668L4m = this.LJLJJI;
        if (c53668L4m != null) {
            ((java.util.Set) c53668L4m.LJIIJ.getValue()).add(onClickListener);
            c53668L4m.LIZ.setOnClickListener(new ViewOnClickListenerC13880ga(c53668L4m.LJIIJJI));
        } else {
            o.LJIJI("avatarUIExecutor");
            throw null;
        }
    }

    @Override // X.L6A
    public final void LJIILIIL(C62562cu c62562cu) {
        C71799SFv c71799SFv = this.LJLILLLLZI;
        if (c71799SFv != null) {
            AU3.LIZJ(c71799SFv, c62562cu, null, AU8.LJLIL);
        } else {
            o.LJIJI("avatarView");
            throw null;
        }
    }

    public final void LJJI(AtomicBoolean atomicBoolean) {
        if (!o.LJ(this.LJLLLL, atomicBoolean)) {
            this.LJLLLL = atomicBoolean;
            if (atomicBoolean != null && !atomicBoolean.get()) {
                for (Runnable runnable : (List) this.LJLZ.getValue()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                ((List) this.LJLZ.getValue()).clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0093  */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.L50] */
    /* JADX WARN: Type inference failed for: r0v95, types: [X.L50] */
    /* JADX WARN: Type inference failed for: r10v10, types: [X.L4k] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.L4l] */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.L4n] */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.L4k] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.L50] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.L4W] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.L4W] */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(java.util.Map<X.L4T, ? extends X.L4W> r23) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53665L4j.onChanged(java.lang.Object):void");
    }

    @Override // X.L6A
    public void onEvent(AU0 event) {
        o.LJIIIZ(event, "event");
        Iterator it = ((java.util.Set) this.LJZI.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC88472Yns) it.next()).invoke(event);
        }
    }

    @Override // X.L6A
    public final void LJI(EnumC53663L4h tag, InterfaceC88472Yns<? super L4O, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(tag, "tag");
        java.util.Map map = (java.util.Map) this.LJZ.getValue();
        Object obj = map.get(tag);
        if (obj == null) {
            obj = new ArrayList();
            map.put(tag, obj);
        }
        ((List) obj).add(interfaceC88472Yns);
    }

    @Override // X.L6A
    public final void LJIIJ(Canvas canvas, AqS156S0200000_9 aqS156S0200000_9) {
        C53461KyX c53461KyX;
        L50 l50;
        L50 l502;
        C53513KzN c53513KzN;
        float f;
        RectF LJJLI;
        Integer num;
        C53679L4x c53679L4x;
        C53461KyX c53461KyX2;
        L50 l503;
        C53480Kyq c53480Kyq;
        C53674L4s LIZ;
        float f2;
        C53674L4s LIZ2;
        int LIZIZ;
        C53461KyX c53461KyX3;
        java.util.Map map = (java.util.Map) LJIL().LJLJLLL.getValue();
        C53668L4m c53668L4m = this.LJLJJI;
        if (c53668L4m != null) {
            if (map == null || map.isEmpty() || canvas == null) {
                aqS156S0200000_9.invoke();
                return;
            }
            canvas.saveLayer(0.0f, 0.0f, c53668L4m.LIZ.getWidth(), c53668L4m.LIZ.getHeight(), null);
            boolean z = false;
            for (L4T l4t : c53668L4m.LIZLLL) {
                L4W l4w = (L4W) map.get(l4t);
                if (l4w != null) {
                    AbstractC53462KyY LIZ3 = l4w.LIZJ.LIZ();
                    if ((LIZ3 instanceof C53461KyX) && (c53461KyX = (C53461KyX) LIZ3) != null && (l50 = c53461KyX.LIZIZ) != null) {
                        if (!z && l4t == L4T.BADGE) {
                            aqS156S0200000_9.invoke();
                            z = true;
                        }
                        if (l50 instanceof C53480Kyq) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("onDraw: AvatarDotUIData, state = ");
                            LIZ4.append(l4w.LIZJ.LIZ());
                            X1D.LIZIZ(LIZ4);
                            Object value = c53668L4m.LJ.getValue();
                            Paint paint = (Paint) c53668L4m.LJI.getValue();
                            Context context = c53668L4m.LIZJ;
                            L69 avatarComponentView = c53668L4m.LIZ;
                            value.getClass();
                            o.LJIIIZ(paint, "paint");
                            o.LJIIIZ(context, "context");
                            o.LJIIIZ(avatarComponentView, "avatarComponentView");
                            AbstractC53462KyY LIZ5 = l4w.LIZJ.LIZ();
                            if ((LIZ5 instanceof C53461KyX) && (c53461KyX3 = (C53461KyX) LIZ5) != null) {
                                l503 = c53461KyX3.LIZIZ;
                            } else {
                                l503 = null;
                            }
                            if ((l503 instanceof C53480Kyq) && (c53480Kyq = (C53480Kyq) l503) != null) {
                                avatarComponentView.getAvatarSizePx();
                                paint.reset();
                                paint.setStyle(Paint.Style.FILL);
                                L4X l4x = l4w.LIZLLL;
                                if (c53480Kyq.LJ) {
                                    paint.setXfermode((Xfermode) L53.LIZ.getValue());
                                    if (!(l4x instanceof C53674L4s) || (LIZ = (C53674L4s) l4x) == null) {
                                        LIZ = C53671L4p.LIZ(c53480Kyq.LJI, c53480Kyq.LIZJ, c53480Kyq.LIZLLL, avatarComponentView, c53480Kyq.LJFF);
                                    }
                                    C53447KyJ LJ = C78929UyL.LJ(avatarComponentView);
                                    float f3 = LIZ.LJLJI;
                                    InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns = c53480Kyq.LJFF;
                                    if (interfaceC88472Yns != null) {
                                        f2 = interfaceC88472Yns.invoke(LJ).floatValue();
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    canvas.drawCircle(LIZ.LJLIL, LIZ.LJLILLLLZI, f3 + f2, paint);
                                    canvas.restore();
                                }
                                L4X l4x2 = l4w.LIZLLL;
                                Integer num2 = c53480Kyq.LIZ;
                                if (num2 != null) {
                                    paint.setColor(num2.intValue());
                                }
                                Integer num3 = c53480Kyq.LIZIZ;
                                if (num3 != null) {
                                    int intValue = num3.intValue();
                                    try {
                                        Integer LJI = C79045V0n.LJI(intValue, context);
                                        if (LJI != null) {
                                            LIZIZ = LJI.intValue();
                                        } else {
                                            LIZIZ = C04330Ez.LIZIZ(context, intValue);
                                        }
                                        paint.setColor(LIZIZ);
                                    } catch (Resources.NotFoundException e) {
                                        StringBuilder LIZ6 = X1D.LIZ();
                                        LIZ6.append("drawDot: e: ");
                                        LIZ6.append(e);
                                        X1D.LIZIZ(LIZ6);
                                    }
                                }
                                paint.setXfermode(null);
                                if (!(l4x2 instanceof C53674L4s) || (LIZ2 = (C53674L4s) l4x2) == null) {
                                    LIZ2 = C53671L4p.LIZ(c53480Kyq.LJI, c53480Kyq.LIZJ, c53480Kyq.LIZLLL, avatarComponentView, c53480Kyq.LJFF);
                                }
                                canvas.drawCircle(LIZ2.LJLIL, LIZ2.LJLILLLLZI, LIZ2.LJLJI, paint);
                            }
                        } else if (l50 instanceof C53513KzN) {
                            View view = c53668L4m.LIZIZ().get(Integer.valueOf(C79234V7u.LJIIJJI(l4w.LIZ, l4t, l50, null)));
                            if (view != null && view.getVisibility() == 0) {
                                C53667L4l c53667L4l = C53667L4l.LIZJ;
                                Paint paint2 = (Paint) c53668L4m.LJI.getValue();
                                Context context2 = c53668L4m.LIZJ;
                                L69 avatarComponentView2 = c53668L4m.LIZ;
                                c53667L4l.getClass();
                                o.LJIIIZ(paint2, "paint");
                                o.LJIIIZ(context2, "context");
                                o.LJIIIZ(avatarComponentView2, "avatarComponentView");
                                AbstractC53462KyY LIZ7 = l4w.LIZJ.LIZ();
                                if ((LIZ7 instanceof C53461KyX) && (c53461KyX2 = (C53461KyX) LIZ7) != null) {
                                    l502 = c53461KyX2.LIZIZ;
                                } else {
                                    l502 = null;
                                }
                                if ((l502 instanceof C53513KzN) && (c53513KzN = (C53513KzN) l502) != null && c53513KzN.LJIIIIZZ && c53513KzN.LJII) {
                                    InterfaceC88472Yns<Integer, Float> interfaceC88472Yns2 = c53513KzN.LJIIIZ;
                                    if (interfaceC88472Yns2 != null) {
                                        f = interfaceC88472Yns2.invoke(Integer.valueOf(avatarComponentView2.getWidth())).floatValue();
                                    } else {
                                        f = 0.0f;
                                    }
                                    paint2.reset();
                                    paint2.setXfermode((Xfermode) L53.LIZ.getValue());
                                    paint2.setAntiAlias(true);
                                    paint2.setStyle(Paint.Style.STROKE);
                                    paint2.setStrokeWidth(f);
                                    L4X l4x3 = l4w.LIZLLL;
                                    if ((l4x3 instanceof C53679L4x) && (c53679L4x = (C53679L4x) l4x3) != null) {
                                        LJJLI = C78897Uxp.LJJLI(c53679L4x);
                                    } else {
                                        LJJLI = C78897Uxp.LJJLI(C53671L4p.LIZIZ(c53513KzN.LIZLLL, c53513KzN.LIZ, c53513KzN.LIZIZ, avatarComponentView2));
                                    }
                                    StringBuilder LIZ8 = X1D.LIZ();
                                    LIZ8.append("draw: rect = ");
                                    LIZ8.append(LJJLI);
                                    LIZ8.append(" \n, avatarRight = ");
                                    LIZ8.append(avatarComponentView2.getAvatar().getRight());
                                    LIZ8.append(", viewRight = ");
                                    StringBuilder LIZ9 = X1D.LIZ();
                                    LIZ9.append(l4w.LIZ);
                                    LIZ9.append(l4w.LIZJ.getNodeType().getString());
                                    View findViewById = avatarComponentView2.findViewById(X1D.LIZIZ(LIZ9).hashCode());
                                    if (findViewById != null) {
                                        num = Integer.valueOf(findViewById.getRight());
                                    } else {
                                        num = null;
                                    }
                                    LIZ8.append(num);
                                    X1D.LIZIZ(LIZ8);
                                    canvas.drawArc(LJJLI, -90.0f, 360.0f, false, paint2);
                                    canvas.restore();
                                }
                            }
                        }
                        if (!z && l4t == L4T.RING) {
                            aqS156S0200000_9.invoke();
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            aqS156S0200000_9.invoke();
            return;
        }
        o.LJIJI("avatarUIExecutor");
        throw null;
    }

    @Override // X.L6A
    public final void LJIIL(int i, Integer num) {
        boolean z;
        if (i != this.LJLLILLLL || (num != null && this.LJLLJ != num.intValue())) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLL = true;
        LJIIIZ(i);
        if (num != null) {
            this.LJLLJ = num.intValue();
            L69 l69 = this.LJLIL;
            if (l69 != null) {
                l69.getLayoutParams().width = num.intValue();
                L69 l692 = this.LJLIL;
                if (l692 != null) {
                    l692.getLayoutParams().height = num.intValue();
                } else {
                    o.LJIJI("containerView");
                    throw null;
                }
            } else {
                o.LJIJI("containerView");
                throw null;
            }
        }
        if (z) {
            L69 l693 = this.LJLIL;
            if (l693 != null) {
                l693.requestLayout();
            } else {
                o.LJIJI("containerView");
                throw null;
            }
        }
    }

    @Override // X.L6A
    public final void LJIILL(EnumC53663L4h businessTag, L59 command) {
        o.LJIIIZ(businessTag, "businessTag");
        o.LJIIIZ(command, "command");
        ARunnableS20S0300000_9 aRunnableS20S0300000_9 = new ARunnableS20S0300000_9(this, businessTag, command, 0);
        AtomicBoolean atomicBoolean = this.LJLLLL;
        if (atomicBoolean != null && atomicBoolean.get()) {
            ((List) this.LJLZ.getValue()).add(aRunnableS20S0300000_9);
        } else {
            aRunnableS20S0300000_9.run();
        }
    }

    @Override // X.L6A
    public final void LJIJI(L69 rootView, Context context) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(context, "context");
        this.LJLIL = rootView;
        C71799SFv avatar = rootView.getAvatar();
        this.LJLILLLLZI = avatar;
        this.LJLJI = context;
        L69 l69 = this.LJLIL;
        if (l69 != null) {
            if (avatar != null) {
                this.LJLJJI = new C53668L4m(l69, avatar, context);
                return;
            } else {
                o.LJIJI("avatarView");
                throw null;
            }
        }
        o.LJIJI("containerView");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    @Override // X.L6A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r13, java.lang.Object r14, androidx.lifecycle.LifecycleOwner r15) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53665L4j.LIZJ(java.lang.String, java.lang.Object, androidx.lifecycle.LifecycleOwner):void");
    }

    @Override // X.L6A
    public final void LJIIIIZZ(Object obj, boolean z, EnumC53663L4h enumC53663L4h) {
        if (obj == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.LJLLLL;
        if (atomicBoolean != null && atomicBoolean.get()) {
            ((List) this.LJLZ.getValue()).add(new ARunnableS6S0310000_9(this, obj, enumC53663L4h, 0));
            return;
        }
        LJJI(new AtomicBoolean(true));
        AvatarControllerVM LJIL = LJIL();
        LJIL.iv0(enumC53663L4h, obj, LJIL.LJLIL, false);
    }

    @Override // X.L5U
    public final void LJIIZILJ(String uid, Object obj, EnumC53663L4h enumC53663L4h, boolean z, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns) {
        Object LIZIZ;
        Object LIZIZ2;
        o.LJIIIZ(uid, "uid");
        if (obj != null && enumC53663L4h != null && o.LJ(obj, LJJ().get(enumC53663L4h))) {
            return;
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LJLLI);
        }
        if (LJJ().get(enumC53663L4h) == null && obj == null) {
            return;
        }
        AvatarControllerVM LJIL = LJIL();
        LJIL.getClass();
        if (enumC53663L4h != null) {
            if (obj instanceof L4O) {
                AbstractC53585L1h<?, ?> abstractC53585L1h = LJIL.gv0().get(enumC53663L4h);
                if (abstractC53585L1h != null) {
                    LIZIZ2 = abstractC53585L1h.LJ((L4O) obj);
                } else {
                    return;
                }
            } else {
                InterfaceC53591L1n<?, ?> interfaceC53591L1n = LJIL.hv0().get(enumC53663L4h);
                if (interfaceC53591L1n == null) {
                    return;
                } else {
                    LIZIZ2 = interfaceC53591L1n.LIZIZ(obj);
                }
            }
            if (LIZIZ2 == null) {
                return;
            }
            LJIL.iv0(enumC53663L4h, LIZIZ2, uid, z);
            return;
        }
        for (Map.Entry<EnumC53663L4h, InterfaceC53591L1n<?, ?>> entry : LJIL.hv0().entrySet()) {
            EnumC53663L4h key = entry.getKey();
            InterfaceC53591L1n<?, ?> value = entry.getValue();
            if (value != null && (LIZIZ = value.LIZIZ(obj)) != null) {
                LJIL.iv0(key, LIZIZ, uid, z);
                return;
            }
        }
    }
}
