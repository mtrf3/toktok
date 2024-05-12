package X;

import Y.ARunnableS12S0101000_8;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.vesdk.VESize;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.6BL, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BL implements InterfaceC147435qV, InterfaceC156096Ar {
    public FrameLayout LJLIL;
    public boolean LJLJI;
    public AnonymousClass655 LJLJJI;
    public Rect LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public InterfaceC153045zY LJLJLJ;
    public InterfaceC143655kP LJLJLLL;
    public C156426By LJLL;
    public C6BO LJLLILLLL;
    public AnonymousClass671 LJLLJ;
    public C6BN LJLLL;
    public String LJLLLL;
    public VESize LJLLLLLL;
    public C6C0 LJZ;
    public C66N LJZI;
    public Context LJZL;
    public StickerHintTextViewModel LL;
    public C6BQ<C156426By, C156426By> LLFII;
    public boolean LJLILLLLZI = true;
    public final List<C156426By> LJLLI = new ArrayList();
    public boolean LJLZ = true;
    public boolean LLD = false;
    public boolean LLF = true;
    public boolean LLFF = false;
    public C6CA LLFFF = null;
    public boolean LLFZ = false;

    public void LJII(AnonymousClass671 anonymousClass671) {
    }

    public abstract C156426By LJIIIZ(Context context);

    public abstract int LJIIJ();

    public int LJIIJJI() {
        return 2;
    }

    public abstract int LJIILIIL();

    public abstract boolean LJIILLIIL();

    public boolean LJIJJLI() {
        return false;
    }

    private void LJJIJL() {
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        this.LJLJJL = new Rect(0, 0, layoutParams.width, layoutParams.height);
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.LJIILLIIL(this.LJLJJLL, this.LJLJL);
        }
        AnonymousClass671 anonymousClass671 = this.LJLLJ;
        if (anonymousClass671 != null) {
            C16880lQ.LJLLLL(anonymousClass671.getContentView(), this.LJLIL);
        }
        if (this.LJLJI) {
            this.LJLLJ = null;
            return;
        }
        InterfaceC150675vj interfaceC150675vj = C6PB.LIZLLL().LIZLLL;
        if (interfaceC150675vj == null) {
            return;
        }
        AnonymousClass671 LIZLLL = interfaceC150675vj.LIZLLL(this.LJLJJLL, this.LJZL);
        this.LJLLJ = LIZLLL;
        LJII(LIZLLL);
        this.LJLIL.addView(this.LJLLJ.getContentView());
    }

    public boolean LJ() {
        if (this.LJLL == null) {
            return true;
        }
        return false;
    }

    public final void LJFF() {
        ViewGroup viewGroup;
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout == null || this.LJLL == null || this.LJLLJ == null) {
            return;
        }
        if (frameLayout.getChildCount() > 1) {
            FrameLayout frameLayout2 = this.LJLIL;
            View childAt = frameLayout2.getChildAt(frameLayout2.getChildCount() - 1);
            C156426By c156426By = this.LJLL;
            if (childAt != c156426By) {
                C16880lQ.LJLLLL(c156426By, this.LJLIL);
                this.LJLIL.addView(this.LJLL);
            }
        }
        if (((ArrayList) this.LJLLI).size() > 1) {
            Object obj = ListProtector.get(this.LJLLI, 0);
            C156426By c156426By2 = this.LJLL;
            if (obj != c156426By2) {
                ((ArrayList) this.LJLLI).remove(c156426By2);
                ListProtector.add(this.LJLLI, 0, this.LJLL);
            }
        }
        AnonymousClass671 anonymousClass671 = this.LJLLJ;
        if (anonymousClass671 != null && (viewGroup = (ViewGroup) anonymousClass671.getContentView().getParent()) != null) {
            C16880lQ.LJLLL(this.LJLLJ.getContentView(), viewGroup);
            viewGroup.addView(this.LJLLJ.getContentView());
        }
        if (((ArrayList) this.LJLLI).size() <= 0) {
            return;
        }
        C156426By c156426By3 = (C156426By) ListProtector.get(this.LJLLI, 0);
        C6BQ<C156426By, C156426By> c6bq = this.LLFII;
        if (c6bq == null) {
            return;
        }
        c6bq.LIZ(c156426By3, this.LJLL);
    }

    public C6C0 LJIIIIZZ() {
        return new C6C0(this);
    }

    public String LJIILL() {
        String str = this.LJLLLL;
        if (str == null) {
            return "";
        }
        return str.replace("interact_sticker.png", "");
    }

    public final void LJIIZILJ() {
        C156426By c156426By = this.LJLL;
        if (c156426By == null) {
            return;
        }
        c156426By.LJFF(false);
        StickerHintTextViewModel stickerHintTextViewModel = this.LL;
        if (stickerHintTextViewModel != null) {
            stickerHintTextViewModel.gv0().postValue(Boolean.TRUE);
        }
    }

    public C6BN LJIJI() {
        return new C6BN();
    }

    public final boolean LJIL() {
        C156426By c156426By = this.LJLL;
        if (c156426By == null) {
            return false;
        }
        return c156426By.LJLJJLL.LJLLJ;
    }

    public final void LJJ() {
        C6BO c6bo = this.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LIZJ();
        }
    }

    public void LJJII() {
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            LJJIII(c156426By);
        }
    }

    public final void LJJIJIL() {
        VESize LLILZ;
        int i;
        int i2;
        InterfaceC153045zY interfaceC153045zY = this.LJLJLJ;
        if (interfaceC153045zY == null || (i = (LLILZ = interfaceC153045zY.LLILZ()).width) == 0 || (i2 = LLILZ.height) == 0) {
            return;
        }
        int[] LJJIJLIJ = V3N.LJJIJLIJ(i, i2, this.LJLIL);
        this.LJLJJLL = LJJIJLIJ[0];
        this.LJLJL = LJJIJLIJ[1];
        LJJIJL();
    }

    public static float LJIILJJIL(float f) {
        return new BigDecimal(f).setScale(4, 1).floatValue();
    }

    public final PointF LIZIZ(PointF pointF) {
        int i;
        int i2;
        PointF pointF2 = new PointF();
        VESize vESize = this.LJLLLLLL;
        if (vESize == null) {
            i = C81184Vtc.LJ(this.LJLL.getContext());
            i2 = C81184Vtc.LIZLLL(this.LJLL.getContext());
        } else {
            i = vESize.width;
            i2 = vESize.height;
        }
        pointF2.set(LJIILJJIL(pointF.x / i), LJIILJJIL(pointF.y / i2));
        return pointF2;
    }

    public void LIZJ(C156426By c156426By) {
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            frameLayout.addView(c156426By, 0);
        }
    }

    public void LIZLLL(boolean z) {
        if (!LJ()) {
            return;
        }
        C6BO c6bo = this.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LIZ();
        }
        C156426By LJIIIZ = LJIIIZ(this.LJZL);
        this.LJLL = LJIIIZ;
        LJIIIZ.getClass();
        C66N c66n = this.LJZI;
        if (c66n != null) {
            LJIIIZ.setMotionInterceptor(c66n);
        }
        LIZJ(this.LJLL);
        C156426By c156426By = this.LJLL;
        if (c156426By == null) {
            return;
        }
        c156426By.LJIILLIIL(this.LJLJJLL, this.LJLJL);
        this.LJLL.setStickerEditListener(new C6BM(this));
        ListProtector.add(this.LJLLI, 0, this.LJLL);
        if (this.LLF && !z && this.LL != null && LJIIJ() != 0) {
            this.LJLL.postDelayed(new ARunnableS12S0101000_8(7, this, 5), 500L);
        }
    }

    public final InteractStickerStruct LJIIL(int i) {
        if (LJIILLIIL() && this.LJLL != null) {
            InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(i);
            LinkedList linkedList = new LinkedList();
            NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            normalTrackTimeStamp.setRotation(LJIILJJIL(this.LJLL.getRotateAngle()));
            normalTrackTimeStamp.setScale(Float.valueOf(this.LJLL.getScale()));
            PointF LIZIZ = LIZIZ(this.LJLL.getCenterViewPoint());
            normalTrackTimeStamp.setX(LIZIZ.x);
            normalTrackTimeStamp.setY(LIZIZ.y);
            normalTrackTimeStamp.setStartTime(this.LJLL.getStartTime());
            normalTrackTimeStamp.setEndTime(this.LJLL.getEndTime());
            PointF LIZIZ2 = LIZIZ(new PointF(this.LJLL.getContentViewWidth(), this.LJLL.getContentViewHeight()));
            normalTrackTimeStamp.setWidth(LIZIZ2.x);
            normalTrackTimeStamp.setHeight(LIZIZ2.y);
            linkedList.add(normalTrackTimeStamp);
            C78609UtB.LJJJLZIJ(interactStickerStruct, linkedList);
            return interactStickerStruct;
        }
        return null;
    }

    public final Point LJJI(PointF pointF) {
        int i;
        int i2;
        Point point = new Point();
        VESize vESize = this.LJLLLLLL;
        if (vESize == null) {
            i = C81184Vtc.LJ(this.LJLL.getContext());
            i2 = C81184Vtc.LIZLLL(this.LJLL.getContext());
        } else {
            i = vESize.width;
            i2 = vESize.height;
        }
        point.set((int) (i * pointF.x), (int) (i2 * pointF.y));
        return point;
    }

    public void LJJIFFI(InteractStickerStruct interactStickerStruct) {
        LJJIIJZLJL(interactStickerStruct, Boolean.TRUE);
    }

    public boolean LJJIII(C156426By c156426By) {
        if (c156426By == null || this.LJLIL == null) {
            return false;
        }
        if (c156426By.getParent() != null && c156426By.getParent() != this.LJLIL) {
            return false;
        }
        C16880lQ.LJLLLL(c156426By, this.LJLIL);
        this.LJLL = null;
        C6BO c6bo = this.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LIZIZ();
        }
        ((ArrayList) this.LJLLI).remove(c156426By);
        this.LLD = true;
        return true;
    }

    public void LJJIIJ(float f) {
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.setAlpha(f);
        }
    }

    public final void LJJIIZ(boolean z) {
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.setLockMode(z);
        }
    }

    public final void LJJIIZI(C66N c66n) {
        this.LJZI = c66n;
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.setMotionInterceptor(c66n);
        }
    }

    public void LJJIJ(String str) {
        this.LJLLLL = str;
    }

    public final void LJJIJIIJIL(Long l) {
        C156426By c156426By;
        if (LJIILLIIL() && (c156426By = this.LJLL) != null) {
            c156426By.setPlayPosition(l.longValue());
            if (this.LLFF) {
                this.LJLL.LJIILL();
            } else {
                this.LJLL.LJIILIIL();
            }
        }
    }

    @Override // X.InterfaceC147435qV
    public boolean Rc(RectF rectF) {
        if (!C32151Nz.LJJIIJZLJL(this.LJLLI)) {
            Iterator it = ((ArrayList) this.LJLLI).iterator();
            while (it.hasNext()) {
                RectF LJIILJJIL = C1E4.LJIILJJIL(((C156426By) it.next()).getFourAnglePoint());
                if (LJIILJJIL.top < rectF.top || LJIILJJIL.bottom > rectF.bottom) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void LJIJ(Context context, FrameLayout frameLayout) {
        this.LJZL = context;
        this.LJLIL = frameLayout;
        this.LJZ = LJIIIIZZ();
        this.LL = (StickerHintTextViewModel) C165706es.LIZLLL(this.LJLIL).get(StickerHintTextViewModel.class);
        this.LJLLL = LJIJI();
    }

    public final void LJIJJ(Context context, FrameLayout frameLayout) {
        this.LJZL = context;
        this.LJLIL = frameLayout;
        this.LJZ = LJIIIIZZ();
        this.LL = (StickerHintTextViewModel) C165706es.LIZLLL(this.LJLIL).get(StickerHintTextViewModel.class);
        this.LJLLL = LJIJI();
    }

    public final void LJJIIJZLJL(InteractStickerStruct interactStickerStruct, Boolean bool) {
        NormalTrackTimeStamp LIZIZ;
        if (interactStickerStruct != null && (LIZIZ = C164826dS.LIZIZ(interactStickerStruct)) != null && this.LJLL != null) {
            Point LJJI = LJJI(new PointF(LIZIZ.getX(), LIZIZ.getY()));
            PointF centerViewPoint = this.LJLL.getCenterViewPoint();
            this.LJLL.LJIL(LJJI.x - centerViewPoint.x, LJJI.y - centerViewPoint.y, bool);
            this.LJLL.LJIJJLI();
            this.LJLL.LJIJI(-LIZIZ.getRotation(), bool);
            this.LJLL.LJIJJ(LIZIZ.getScale().floatValue());
        }
    }

    public void LJJIJIIJI(InterfaceC153045zY interfaceC153045zY, InterfaceC143655kP interfaceC143655kP) {
        VESize LLILZ;
        int i;
        int i2;
        this.LJLJLLL = interfaceC143655kP;
        if (interfaceC153045zY == null || this.LJLJLJ != null || (i = (LLILZ = interfaceC153045zY.LLILZ()).width) == 0 || (i2 = LLILZ.height) == 0) {
            return;
        }
        this.LJLJLJ = interfaceC153045zY;
        if ((i * 1.0f) / i2 != 0.75f) {
            int[] LJJIJLIJ = V3N.LJJIJLIJ(i, i2, this.LJLIL);
            this.LJLJJLL = LJJIJLIJ[0];
            this.LJLJL = LJJIJLIJ[1];
        } else {
            this.LJLJJLL = 0;
            this.LJLJL = C6IA.LIZLLL(this.LJZL);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LLILZ.width, LLILZ.height);
            layoutParams.setMargins(0, C6IA.LIZLLL(this.LJZL), 0, 0);
            this.LJLIL.setLayoutParams(layoutParams);
        }
        LJJIJL();
    }

    public final C10K LJI(int i, int i2, int i3, int i4, String str) {
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.LJFF(false);
            this.LJLL.LJIILL();
        }
        return this.LJLLL.LIZ(this.LJLL, this.LJLIL, str, i, i2, i3, i4);
    }
}
