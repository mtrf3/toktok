package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.ClickDanmakuEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC216668es implements InterfaceC217168fg, InterfaceC216988fO, InterfaceC216998fP {
    public final C216678et LIZ;
    public final InterfaceC216738ez LIZIZ;
    public final C216758f1 LIZJ;
    public final LinkedList<AbstractC216708ew<AbstractC216018dp>> LIZLLL;
    public AbstractC216708ew<AbstractC216018dp> LJ;
    public final RectF LJFF;
    public final PointF LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.8dp, T extends X.8dp, java.lang.Object] */
    @Override // X.InterfaceC216998fP
    public final void LIZIZ(C216948fK c216948fK) {
        switch (c216948fK.LIZ) {
            case 1001:
                AbstractC216018dp abstractC216018dp = c216948fK.LIZIZ;
                if (abstractC216018dp == null) {
                    return;
                }
                Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LIZLLL.iterator();
                while (it.hasNext()) {
                    AbstractC216708ew<AbstractC216018dp> next = it.next();
                    if (o.LJ(next.LIZ, abstractC216018dp)) {
                        next.LJIIIZ = true;
                    }
                }
                return;
            case 1002:
                AbstractC216018dp abstractC216018dp2 = c216948fK.LIZIZ;
                if (abstractC216018dp2 == null) {
                    return;
                }
                Iterator<AbstractC216708ew<AbstractC216018dp>> it2 = this.LIZLLL.iterator();
                while (it2.hasNext()) {
                    AbstractC216708ew<AbstractC216018dp> next2 = it2.next();
                    if (o.LJ(next2.LIZ, abstractC216018dp2)) {
                        next2.LJIIIZ = false;
                    }
                }
                return;
            case 1003:
                ?? r4 = c216948fK.LIZIZ;
                if (r4 == 0) {
                    return;
                }
                Iterator<AbstractC216708ew<AbstractC216018dp>> it3 = this.LIZLLL.iterator();
                while (it3.hasNext()) {
                    AbstractC216708ew next3 = it3.next();
                    if (o.LJ(next3.LIZ, r4)) {
                        next3.LIZ = r4;
                        next3.LJI(r4);
                        next3.LJFF(this.LIZJ);
                        C216678et c216678et = this.LIZ;
                        RectF rectF = this.LJFF;
                        rectF.left = next3.LIZLLL();
                        rectF.top = next3.LJ();
                        rectF.right = next3.LIZLLL() + next3.LIZLLL;
                        rectF.bottom = next3.LJ() + next3.LJ;
                        C216958fL LIZIZ = C216828f8.LIZ.LIZIZ();
                        if (LIZIZ == null) {
                            LIZIZ = new C216958fL(1002, r4, rectF);
                        } else {
                            LIZIZ.LIZ = 1002;
                            LIZIZ.LIZIZ = r4;
                            LIZIZ.LIZJ = rectF;
                        }
                        c216678et.LJI(LIZIZ);
                    }
                }
                return;
            case 1004:
                AbstractC216018dp abstractC216018dp3 = c216948fK.LIZIZ;
                if (abstractC216018dp3 == null) {
                    return;
                }
                Iterator<AbstractC216708ew<AbstractC216018dp>> it4 = this.LIZLLL.iterator();
                while (it4.hasNext()) {
                    AbstractC216708ew<AbstractC216018dp> next4 = it4.next();
                    if (o.LJ(next4.LIZ, abstractC216018dp3)) {
                        LinkedList<AbstractC216708ew<AbstractC216018dp>> linkedList = this.LIZLLL;
                        if (linkedList != null) {
                            C65777Prh.LIZ(linkedList).remove(next4);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                    }
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC216988fO
    public final boolean LJIIIIZZ(MotionEvent event) {
        AbstractC216018dp abstractC216018dp;
        InterfaceC215558d5 interfaceC215558d5;
        DanmakuPresentAssem danmakuPresentAssem;
        Context context;
        Aweme aweme;
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew = this.LJ;
                String str = null;
                if (abstractC216708ew == null) {
                    this.LJ = null;
                } else {
                    float LIZLLL = abstractC216708ew.LIZLLL();
                    float LIZLLL2 = abstractC216708ew.LIZLLL() + abstractC216708ew.LIZLLL;
                    float x = event.getX();
                    if (LIZLLL <= x && x <= LIZLLL2) {
                        float x2 = event.getX();
                        float y = event.getY();
                        C216478eZ c216478eZ = this.LIZ.LIZIZ;
                        if (c216478eZ != null && (abstractC216018dp = abstractC216708ew.LIZ) != null) {
                            RectF rectF = this.LJFF;
                            rectF.left = abstractC216708ew.LIZLLL();
                            rectF.top = abstractC216708ew.LJ();
                            rectF.right = abstractC216708ew.LIZLLL() + abstractC216708ew.LIZLLL;
                            rectF.bottom = abstractC216708ew.LJ() + abstractC216708ew.LJ;
                            PointF pointF = this.LJI;
                            pointF.x = x2;
                            pointF.y = y;
                            if ((abstractC216018dp instanceof InterfaceC215558d5) && (interfaceC215558d5 = (InterfaceC215558d5) abstractC216018dp) != null) {
                                int i = C215888dc.LIZ[interfaceC215558d5.getType().ordinal()];
                                if (i != 1) {
                                    if (i == 2 && (context = (danmakuPresentAssem = c216478eZ.LIZ).getContext()) != null) {
                                        int[] iArr = new int[2];
                                        danmakuPresentAssem.getContainerView().getLocationInWindow(iArr);
                                        C6DJ c6dj = new C6DJ(context);
                                        c6dj.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(R.attr.gy, context));
                                        c6dj.LJIIJJI(new AqS134S0200000_3(danmakuPresentAssem, interfaceC215558d5, 228));
                                        c6dj.LJ(new AqS150S0200000_3(danmakuPresentAssem, interfaceC215558d5, 85));
                                        c6dj.LJI(WHL.BOTTOM);
                                        c6dj.LIZ((int) pointF.x, ((int) rectF.bottom) + iArr[1]);
                                        c6dj.LIZ.LJII = 3000L;
                                        InterfaceC82683Wch LIZJ = c6dj.LIZJ();
                                        danmakuPresentAssem.LLIIIL = LIZJ;
                                        if (LIZJ instanceof PopupWindow) {
                                            PopupWindow popupWindow = (PopupWindow) LIZJ;
                                            popupWindow.setTouchable(true);
                                            popupWindow.setFocusable(true);
                                        }
                                        C216678et c216678et = danmakuPresentAssem.LLIIIILZ;
                                        if (c216678et != null) {
                                            C216678et.LJ(c216678et, 1001, interfaceC215558d5.getData());
                                        }
                                        interfaceC215558d5.LIZ(true);
                                        danmakuPresentAssem.u4().invalidate();
                                        InterfaceC82683Wch interfaceC82683Wch = danmakuPresentAssem.LLIIIL;
                                        if (interfaceC82683Wch != null) {
                                            interfaceC82683Wch.show();
                                        }
                                        VideoItemParams gv0 = danmakuPresentAssem.r4().gv0();
                                        if (gv0 != null) {
                                            aweme = gv0.getAweme();
                                        } else {
                                            aweme = null;
                                        }
                                        VideoItemParams gv02 = danmakuPresentAssem.r4().gv0();
                                        if (gv02 != null) {
                                            str = gv02.mEventType;
                                        }
                                        String str2 = "";
                                        if (str == null) {
                                            str = "";
                                        }
                                        String LIZJ2 = interfaceC215558d5.LIZJ();
                                        if (LIZJ2 != null) {
                                            str2 = LIZJ2;
                                        }
                                        C214788bq.LIZ(new ClickDanmakuEvent(), C47261Igj.LJJIJ(new C215008cC(str2, o.LJ(interfaceC215558d5.LJI(), ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0)), aweme, str);
                                    }
                                } else {
                                    C214778bp c214778bp = C214778bp.LIZ;
                                    ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(c216478eZ.LIZ);
                                    DanmakuViewModel r4 = c216478eZ.LIZ.r4();
                                    InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(c216478eZ.LIZ);
                                    EnumC214798br enumC214798br = EnumC214798br.IS_INTRO_SHOW;
                                    c214778bp.getClass();
                                    C214778bp.LIZLLL(LJIIIIZZ, r4, LJIIZILJ, enumC214798br);
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        } else {
            Iterator<T> it = ORS.LJJLIIIJL(this.LIZLLL).iterator();
            while (it.hasNext()) {
                AbstractC216708ew<AbstractC216018dp> abstractC216708ew2 = (AbstractC216708ew) it.next();
                if (event.getX() >= abstractC216708ew2.LIZLLL() && event.getX() <= abstractC216708ew2.LIZLLL() + abstractC216708ew2.LIZLLL) {
                    this.LJ = abstractC216708ew2;
                    return true;
                }
            }
        }
        return false;
    }

    public AbstractC216668es(C216678et c216678et, InterfaceC216738ez mLayer) {
        o.LJIIIZ(mLayer, "mLayer");
        this.LIZ = c216678et;
        this.LIZIZ = mLayer;
        this.LIZJ = c216678et.LIZ;
        this.LIZLLL = new LinkedList<>();
        C221108m2.LIZIZ(C216838f9.LJLIL);
        this.LJFF = new RectF();
        this.LJI = new PointF();
    }
}
