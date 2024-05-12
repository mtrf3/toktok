package X;

import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.service.protection.TooltipProtectionSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSE {
    public static final /* synthetic */ int LJIIL = 0;
    public final InterfaceC82086WJm LIZ;
    public final Object LIZIZ;
    public final boolean LIZJ;
    public final List<WSI> LIZLLL;
    public C40871j1<WS0> LJ;
    public C29901Fi<String> LJFF;
    public C81438Vxi LJI;
    public ViewOnTouchListenerC81419VxP LJII;
    public ShortVideoContext LJIIIIZZ;
    public InterfaceC81422VxS LJIIIZ;
    public String LJIIJ;
    public WSF LJIIJJI;

    public final String LIZLLL() {
        String str;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJII;
        if (viewOnTouchListenerC81419VxP == null) {
            return "";
        }
        Object LIZLLL = viewOnTouchListenerC81419VxP.LIZLLL(viewOnTouchListenerC81419VxP.getCurrentIndex());
        if (!(LIZLLL instanceof String) || (str = (String) LIZLLL) == null) {
            return "";
        }
        return str;
    }

    public final void LJIIIIZZ() {
        C81438Vxi c81438Vxi = this.LJI;
        if (c81438Vxi != null) {
            C81440Vxk.LJ(c81438Vxi.LIZ, c81438Vxi.LJFF, c81438Vxi.LJII);
        } else {
            o.LJIJI("tabConfig");
            throw null;
        }
    }

    public final void LJIIJJI() {
        H78.LIZ("BottomTabPresenter dispatchEvent BottomTabIndexChangeEvent");
        String string = C44172HVg.LIZ.getString(R.string.pvy);
        o.LJIIIIZZ(string, "application.getString(R.…cord_mode_combine_15_tag)");
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            WSF wsf = ((WSI) it.next()).LIZ;
            if (wsf.LIZLLL) {
                string = wsf.LIZIZ;
            }
        }
        boolean z = this.LIZJ;
        Object obj = this.LIZIZ;
        if (obj == null) {
            obj = string;
        }
        WS0 ws0 = new WS0(null, string, 0, false, false, z, obj, 24);
        ws0.LJII = true;
        LJ(ws0);
        C40871j1<WS0> c40871j1 = this.LJ;
        if (c40871j1 != null) {
            c40871j1.LJI(ws0);
        } else {
            o.LJIJI("bottomTabIndexChangeEvent");
            throw null;
        }
    }

    public final void LJIIL() {
        C81366VwY c81366VwY;
        C81438Vxi c81438Vxi = this.LJI;
        Context context = null;
        if (c81438Vxi != null) {
            if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled()) {
                E6D e6d = new E6D(new WeakReference(c81438Vxi.LJ));
                C81366VwY c81366VwY2 = c81438Vxi.LJ;
                if (c81366VwY2 != null) {
                    context = c81366VwY2.getContext();
                }
                LUK luk = new LUK(e6d, new WeakReference(context));
                if (luk.shouldShow()) {
                    luk.LIZ(new AqS164S0100000_14(c81438Vxi, 156));
                    return;
                }
                return;
            }
            if (c81438Vxi.LIZJ.LIZ() || !c81438Vxi.LIZJ.LIZIZ() || c81438Vxi.LJ == null || c81438Vxi.LIZLLL != null || !C45991I3f.LIZJ() || (c81366VwY = c81438Vxi.LJ) == null) {
                return;
            }
            C45989I3d c45989I3d = c81438Vxi.LIZJ;
            c45989I3d.getClass();
            String currentUserID = C44172HVg.LJIJ.getCurrentUserID();
            Keva keva = c45989I3d.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("has_live_tab_pop_up_show");
            LIZ.append(currentUserID);
            keva.storeBoolean(X1D.LIZIZ(LIZ), true);
            Context context2 = c81366VwY.getContext();
            o.LJIIIIZZ(context2, "it.context");
            C139825eE c139825eE = new C139825eE(context2);
            c139825eE.LJIIJJI(R.string.hv3);
            C82682Wcg c82682Wcg = c139825eE.LIZ;
            c82682Wcg.LJII = 3000L;
            c82682Wcg.LIZIZ = c81366VwY;
            c139825eE.LJI(WHL.TOP);
            c81438Vxi.LIZLLL = c139825eE.LIZJ();
            C81366VwY c81366VwY3 = c81438Vxi.LJ;
            if (c81366VwY3 == null) {
                return;
            }
            c81366VwY3.postDelayed(new ARunnableS50S0100000_14(c81438Vxi, 97), 100L);
            return;
        }
        o.LJIJI("tabConfig");
        throw null;
    }

    public /* synthetic */ WSE(InterfaceC82086WJm interfaceC82086WJm) {
        this(interfaceC82086WJm, null, false);
    }

    public final void LIZJ(boolean z) {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJII;
        if (viewOnTouchListenerC81419VxP != null) {
            viewOnTouchListenerC81419VxP.setUISwitchEnabled(z);
        } else {
            o.LJIJI("bottomTabHost");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        if (r1 != X.I0E.NON_COVER_SCENE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0186, code lost:
    
        if (r11 == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.WS0 r13) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSE.LJ(X.WS0):void");
    }

    public final void LJII(String tag) {
        o.LJIIIZ(tag, "tag");
        C81438Vxi c81438Vxi = this.LJI;
        if (c81438Vxi != null) {
            if (c81438Vxi.LIZIZ.getChildAt(c81438Vxi.LIZIZ(tag)) != null) {
                C119344mI c119344mI = c81438Vxi.LIZIZ;
                int LIZIZ = c81438Vxi.LIZIZ(tag);
                try {
                    if (C78996UzQ.LJJIIJZLJL(c119344mI.getChildAt(LIZIZ))) {
                        C78996UzQ.LJI();
                    }
                } catch (Throwable unused) {
                }
                c119344mI.removeViewAt(LIZIZ);
            }
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJII;
            if (viewOnTouchListenerC81419VxP != null) {
                viewOnTouchListenerC81419VxP.requestLayout();
                return;
            } else {
                o.LJIJI("bottomTabHost");
                throw null;
            }
        }
        o.LJIJI("tabConfig");
        throw null;
    }

    public final void LJIIJ(java.util.Set<String> set) {
        java.util.Set LJZI;
        C81438Vxi c81438Vxi = this.LJI;
        if (c81438Vxi != null) {
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = c81438Vxi.LIZ;
            C119344mI tabContainer = c81438Vxi.LIZIZ;
            o.LJIIIIZZ(tabContainer, "tabContainer");
            C81440Vxk.LJFF(set, viewOnTouchListenerC81419VxP, tabContainer, c81438Vxi.LJFF, c81438Vxi.LJII);
            if (set == null || (LJZI = ORZ.LJZI(set, c81438Vxi.LJFF)) == null || LJZI.size() < 2 || c81438Vxi.LJI.LIZ.getBoolean("has_enable_switch_duration_after_shooting_tip_shown", false)) {
                return;
            }
            C119344mI tabContainer2 = c81438Vxi.LIZIZ;
            o.LJIIIIZZ(tabContainer2, "tabContainer");
            View LIZJ = C81440Vxk.LIZJ(tabContainer2, LJZI);
            Context context = c81438Vxi.LIZIZ.getContext();
            o.LJIIIIZZ(context, "tabContainer.context");
            Activity LIZ = C105574Cj.LIZ(context);
            if (LIZ == null || LIZ.isFinishing() || LIZJ == null) {
                return;
            }
            Context context2 = c81438Vxi.LIZIZ.getContext();
            o.LJIIIIZZ(context2, "tabContainer.context");
            Activity LIZ2 = C105574Cj.LIZ(context2);
            o.LJI(LIZ2);
            C139825eE c139825eE = new C139825eE(LIZ2);
            c139825eE.LIZ.LIZIZ = LIZJ;
            c139825eE.LJI(WHL.TOP);
            c139825eE.LJIIJJI(R.string.cld);
            c139825eE.LIZ.LJII = 5000L;
            c139825eE.LIZJ().show();
            c81438Vxi.LJI.LIZ.storeBoolean("has_enable_switch_duration_after_shooting_tip_shown", true);
            return;
        }
        o.LJIJI("tabConfig");
        throw null;
    }

    public final void LIZIZ(int i, WSI bottomTabModel) {
        o.LJIIIZ(bottomTabModel, "bottomTabModel");
        WSF wsf = bottomTabModel.LIZ;
        String text = wsf.LIZ;
        String tag = wsf.LIZIZ;
        C81438Vxi c81438Vxi = this.LJI;
        if (c81438Vxi != null) {
            boolean z = wsf.LJFF;
            o.LJIIIZ(text, "text");
            o.LJIIIZ(tag, "tag");
            c81438Vxi.LIZ(i, text, tag, z);
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJII;
            if (viewOnTouchListenerC81419VxP != null) {
                viewOnTouchListenerC81419VxP.requestLayout();
                return;
            } else {
                o.LJIJI("bottomTabHost");
                throw null;
            }
        }
        o.LJIJI("tabConfig");
        throw null;
    }

    public final void LJI(ShortVideoContext shortVideoContext, ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJIIIIZZ = shortVideoContext;
        this.LJII = viewOnTouchListenerC81419VxP;
        C81438Vxi c81438Vxi = new C81438Vxi(shortVideoContext, viewOnTouchListenerC81419VxP);
        List<WSI> list = this.LIZLLL;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((WSI) next).LIZ.LIZ.length() > 0) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WSF wsf = ((WSI) it2.next()).LIZ;
            c81438Vxi.LIZ(-1, wsf.LIZ, wsf.LIZIZ, wsf.LJFF);
        }
        this.LJI = c81438Vxi;
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJII;
        if (viewOnTouchListenerC81419VxP2 != null) {
            viewOnTouchListenerC81419VxP2.setOnIndexChangedListener(new WSD(this));
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP3 = this.LJII;
            if (viewOnTouchListenerC81419VxP3 != null) {
                viewOnTouchListenerC81419VxP3.setSharedARTabChangeListener(new WSG(this));
                ShortVideoContext shortVideoContext2 = this.LJIIIIZZ;
                if (shortVideoContext2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = ((ArrayList) this.LIZLLL).iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((WSI) it3.next()).LIZ.LIZJ);
                    }
                    shortVideoContext2.LJI();
                    o.LJIIIIZZ(arrayList2.toString(), "list.toString()");
                    return;
                }
                o.LJIJI("shortVideoContext");
                throw null;
            }
            o.LJIJI("bottomTabHost");
            throw null;
        }
        o.LJIJI("bottomTabHost");
        throw null;
    }

    public WSE(InterfaceC82086WJm cameraApi, Object obj, boolean z) {
        o.LJIIIZ(cameraApi, "cameraApi");
        this.LIZ = cameraApi;
        this.LIZIZ = obj;
        this.LIZJ = z;
        this.LIZLLL = new ArrayList();
    }

    public final WSI LIZ(C45850Hz4 c45850Hz4, int i, WSH bottomTab) {
        o.LJIIIZ(bottomTab, "bottomTab");
        bottomTab.initialize(c45850Hz4);
        WSI wsi = new WSI(bottomTab.createBottomTabItem(c45850Hz4), bottomTab.provideScene());
        ListProtector.add(this.LIZLLL, i, wsi);
        WSF wsf = wsi.LIZ;
        String text = wsf.LIZ;
        String tag = wsf.LIZIZ;
        C81438Vxi c81438Vxi = this.LJI;
        if (c81438Vxi != null) {
            boolean enable = bottomTab.enable();
            o.LJIIIZ(text, "text");
            o.LJIIIZ(tag, "tag");
            c81438Vxi.LIZ(i, text, tag, enable);
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJII;
            if (viewOnTouchListenerC81419VxP != null) {
                viewOnTouchListenerC81419VxP.requestLayout();
                return wsi;
            }
            o.LJIJI("bottomTabHost");
            throw null;
        }
        o.LJIJI("tabConfig");
        throw null;
    }

    public final void LJIIIZ(String tag, boolean z, int i) {
        o.LJIIIZ(tag, "tag");
        C81438Vxi c81438Vxi = this.LJI;
        if (c81438Vxi != null) {
            int LIZIZ = c81438Vxi.LIZIZ(tag);
            if (LIZIZ >= 0) {
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJII;
                if (viewOnTouchListenerC81419VxP != null) {
                    viewOnTouchListenerC81419VxP.LJIIIZ(true, false, LIZIZ, i, z);
                    return;
                } else {
                    o.LJIJI("bottomTabHost");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("tabConfig");
        throw null;
    }

    public final void LJFF(C45850Hz4 c45850Hz4, List<? extends WSH> bottoms, C40871j1<WS0> bottomTabIndexChangeEvent, C29901Fi<String> sharedARTabIndexChangeEvent) {
        o.LJIIIZ(bottoms, "bottoms");
        o.LJIIIZ(bottomTabIndexChangeEvent, "bottomTabIndexChangeEvent");
        o.LJIIIZ(sharedARTabIndexChangeEvent, "sharedARTabIndexChangeEvent");
        this.LJ = bottomTabIndexChangeEvent;
        this.LJFF = sharedARTabIndexChangeEvent;
        for (WSH wsh : bottoms) {
            wsh.initialize(c45850Hz4);
            ((ArrayList) this.LIZLLL).add(new WSI(wsh.createBottomTabItem(c45850Hz4), wsh.provideScene()));
        }
    }
}
