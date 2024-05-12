package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.65u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1548265u extends View {
    public static final /* synthetic */ int LLILII = 0;
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public Point LJLJJL;
    public InterfaceC153045zY LJLJJLL;
    public SafeHandler LJLJL;
    public C153065za LJLJLJ;
    public VideoPublishEditModel LJLJLLL;
    public C82622Wbi LJLL;
    public boolean LJLLI;
    public C66G<C153075zb> LJLLILLLL;
    public C66G<C153075zb> LJLLJ;
    public C66J LJLLL;
    public int LJLLLL;
    public final C66E LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public long LJZI;
    public boolean LJZL;
    public float LL;
    public float LLD;
    public float LLF;
    public float LLFF;
    public boolean LLFFF;
    public AnonymousClass666 LLFII;
    public C66F LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public C1548365v LLIIIILZ;
    public final C89463Z9f LLIIIJ;
    public final PointF LLIIIL;
    public InterfaceC147905rG LLIIIZ;
    public InfoStickerViewModel LLIIJI;
    public int LLIIJLIL;
    public C66T LLIIL;
    public C66N LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public final ARunnableS38S0100000_2 LLIL;

    public final void LIZ() {
        this.LLIIII = false;
        C153065za c153065za = this.LJLJLJ;
        if (c153065za != null) {
            Iterator it = ((ArrayList) c153065za.LIZ).iterator();
            while (it.hasNext()) {
                ((C153075zb) it.next()).LJLJJL = false;
            }
        }
        invalidate();
    }

    public void setStickerOnPlayListener(C66K c66k) {
    }

    public final void LIZJ() {
        InterfaceC153045zY interfaceC153045zY;
        int LIZLLL;
        if ((this.LJLJI == 0 || this.LJLJJI == 0) && (interfaceC153045zY = this.LJLJJLL) != null) {
            VESize LLILZ = interfaceC153045zY.LLILZ();
            this.LJLJI = LLILZ.width;
            this.LJLJJI = LLILZ.height;
            this.LJLIL = (C81184Vtc.LJ(getContext()) - this.LJLJI) >> 1;
            int i = 0;
            if (AnonymousClass668.LIZ()) {
                if (!C141525gy.LIZ(this.LJLJI, this.LJLJJI)) {
                    int LIZIZ = C81184Vtc.LIZIZ(getContext());
                    C157226Fa c157226Fa = C157226Fa.LIZ;
                    int LJI = c157226Fa.LJI();
                    if (c157226Fa.LJIILIIL()) {
                        LIZLLL = c157226Fa.LIZLLL() + LJI;
                    } else {
                        LIZLLL = c157226Fa.LIZLLL();
                    }
                    i = (((LIZIZ - LIZLLL) - c157226Fa.LJIIJ()) - this.LJLJJI) / 2;
                }
                this.LJLILLLLZI = i;
                return;
            }
            if (!C141525gy.LIZ(this.LJLJI, this.LJLJJI)) {
                int LIZIZ2 = C81184Vtc.LIZIZ(getContext());
                C157236Fb c157236Fb = C157236Fb.LIZ;
                i = (((LIZIZ2 - c157236Fb.getBottomMargin()) - c157236Fb.LIZ()) - this.LJLJJI) / 2;
            }
            this.LJLILLLLZI = i;
        }
    }

    public final void LJ() {
        C66E c66e;
        int i;
        if (this.LJLJL == null || this.LJLJLLL == null || (c66e = this.LJLLLLLL) == null || c66e.LIZ == null || (i = this.LJLZ) == -1 || i != 2) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LJLJLLL.getCreationId());
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("prop_id", this.LJLLLLLL.LIZ.LJLJI.stickerId);
        c145995oB.LJI("shoot_way", this.LJLJLLL.mShootWay);
        c145995oB.LIZ(-1, "sticker_type");
        this.LJLLLLLL.getClass();
        c145995oB.LJI("enter_method", "finger_gesture");
        int i2 = this.LJLJLLL.draftId;
        if (i2 != 0) {
            c145995oB.LIZ(i2, "draft_id");
        }
        if (!TextUtils.isEmpty(this.LJLJLLL.newDraftId)) {
            c145995oB.LIZLLL("new_draft_id", this.LJLJLLL.newDraftId);
        }
        if (H7R.LJJLIIIJJIZ(this.LJLJLLL)) {
            C78929UyL.LIZJ(this.LJLJLLL, c145995oB);
        }
        if (this.LJLLLLLL.LIZ.LJLJI.type == 27) {
            c145995oB.LIZLLL("sticker_type", "music_share_story");
        }
        GXR.LIZ("prop_adjust", c145995oB.LIZ);
    }

    public final void LJII() {
        C66E c66e;
        C153075zb c153075zb;
        C153065za c153065za;
        if (this.LJLZ != 1 && (c66e = this.LJLLLLLL) != null && (c153075zb = c66e.LIZ) != null && (c153065za = this.LJLJLJ) != null) {
            if (c66e.LIZIZ) {
                c153075zb.LJLJJL = true;
                c153065za.LIZIZ = c153075zb;
                invalidate();
                return;
            }
            c153065za.LJIILJJIL(c153075zb);
        }
    }

    public int getStickNumber() {
        C153065za c153065za = this.LJLJLJ;
        int i = 0;
        if (c153065za != null) {
            Iterator it = ((ArrayList) c153065za.LIZ).iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        }
        return i;
    }

    public final void LIZLLL() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onClickContent");
        boolean z2 = false;
        if (this.LJLLLLLL.LIZ == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(" ");
        if (this.LJLLLLLL.LIZ == null) {
            z2 = true;
        }
        LIZ.append(z2);
        X1D.LIZIZ(LIZ);
        if (this.LLIILII.LIZ()) {
            return;
        }
        if (this.LJLLLLLL.LIZ.LJLJI.isNowSmallWindowSticker()) {
            ((InterfaceC147905rG) this.LJLL.LJ(InterfaceC147905rG.class, null)).Pf();
            return;
        }
        setShowHelpBox(true);
        this.LJLZ = 1;
        C153065za c153065za = this.LJLJLJ;
        if (c153065za != null) {
            C153075zb c153075zb = this.LJLLLLLL.LIZ;
            C66M c66m = c153065za.LJII;
            if (c66m != null) {
                c66m.LIZ();
            }
            if (c153065za.LIZIZ != c153075zb) {
                c153065za.LIZIZ();
                c153065za.LIZIZ = c153075zb;
            }
            C153075zb c153075zb2 = c153065za.LIZIZ;
            c153075zb2.getClass();
            c153075zb2.LJLJJL = true;
            if (c153065za.LJFF.LJLILLLLZI == null) {
                C122034qd LJJI = C17N.LJJI(c153065za.LJ);
                C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(c153065za.LIZIZ.LJLJI.uuid);
                if (LJJJJLI != null) {
                    LJJJJLI.LIZJ = 0L;
                    LJJJJLI.LIZLLL = c153065za.LJ.getDuration();
                    LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                }
            }
            if (!TextUtils.isEmpty(c153065za.LIZIZ.LJLJI.stickerId) && c153065za.LIZJ.LJLJLLL != null) {
                CommerceToolsMissionService.LJIIJ().LJI(c153065za.LIZJ.LJLJLLL, c153065za.LIZIZ.LJLJI.stickerId);
            }
        }
        if (this.LLIIIZ == null) {
            this.LLIIIZ = (InterfaceC147905rG) this.LJLL.LJ(InterfaceC147905rG.class, null);
        }
        this.LLIIIZ.gg(this.LJLLLLLL.LIZ.LJLJI);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIIIJ.LJIIIZ();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLIIIJ.LJIIJ();
    }

    public C1548365v getGestureListener() {
        return this.LLIIIILZ;
    }

    public final void LJIIIIZZ(C153075zb c153075zb) {
        try {
            InterfaceC153045zY interfaceC153045zY = this.LJLJJLL;
            if (interfaceC153045zY == null) {
                return;
            }
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            float[] LJIIIZ = LJJI.LJIIIIZZ().LIZ().LJIIIZ(c153075zb.LJLJI.uuid);
            float f = -LJJI.LJIIIIZZ().LIZ().LIZLLL(c153075zb.LJLJI.uuid);
            float LJI = LJJI.LJIIIIZZ().LIZ().LJI(c153075zb.LJLJI.uuid);
            if (LJI > 0.0f) {
                c153075zb.LJLJI.scale = LJI;
                c153075zb.LIZLLL(LJI / c153075zb.LJLLILLLL);
            }
            c153075zb.LJLJI.rotateAngle = f;
            c153075zb.LIZJ(f - f);
            RectF rectF = c153075zb.LJLJLJ;
            float f2 = LJIIIZ[2];
            float f3 = LJIIIZ[0];
            float LIZ = (C1I0.LIZ(f2, f3, 2.0f, f3) * this.LJLJI) + this.LJLIL;
            float f4 = LJIIIZ[1];
            float f5 = LJIIIZ[3];
            float LIZ2 = (C1I0.LIZ(f4, f5, 2.0f, f5) * this.LJLJJI) + this.LJLILLLLZI;
            float centerX = LIZ - rectF.centerX();
            float centerY = LIZ2 - rectF.centerY();
            c153075zb.LJLL.postTranslate(centerX, centerY);
            c153075zb.LJLJLJ.offset(centerX, centerY);
            c153075zb.LJLJLLL.offset(centerX, centerY);
            StickerItemModel stickerItemModel = c153075zb.LJLJI;
            stickerItemModel.currentOffsetX = (centerX / this.LJLJI) + stickerItemModel.currentOffsetX;
            stickerItemModel.currentOffsetY = (centerY / this.LJLJJI) + stickerItemModel.currentOffsetY;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c153075zb.LJLJI.uuid);
            LJJI.LJIIIIZZ().LJI(arrayList, Float.valueOf(c153075zb.LJLJI.currentOffsetX), Float.valueOf(c153075zb.LJLJI.currentOffsetY));
        } catch (VEException e) {
            C82891Wg3.LIZLLL().LIZIZ(new RuntimeException("restorePinStickerPositionImpl", e));
        }
    }

    public final void LJIIIZ(boolean z) {
        C153065za c153065za;
        this.LJLLI = z;
        if (!z && (c153065za = this.LJLJLJ) != null && c153065za.LIZIZ != null) {
            c153065za.LIZIZ();
            this.LLIIIJ.LJII();
            StickerHintTextViewModel stickerHintTextViewModel = this.LJLJLJ.LJIIIIZZ;
            if (stickerHintTextViewModel != null) {
                stickerHintTextViewModel.gv0().postValue(Boolean.TRUE);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C153065za c153065za = this.LJLJLJ;
        if (c153065za != null) {
            Iterator it = ((ArrayList) c153065za.LIZ).iterator();
            while (it.hasNext()) {
                C153075zb c153075zb = (C153075zb) it.next();
                c153075zb.getClass();
                RectF rectF = c153075zb.LJLJLLL;
                if (rectF != null) {
                    float f = c153075zb.LJLJJI.LJIIL;
                    rectF.top += f;
                    rectF.bottom += f;
                    if (c153075zb.LJLJJL) {
                        canvas.save();
                        canvas.rotate(c153075zb.LJLJI.rotateAngle, c153075zb.LJLJLLL.centerX(), c153075zb.LJLJLLL.centerY());
                        canvas.drawRect(c153075zb.LJLJLLL, c153075zb.LJLJJLL);
                        canvas.restore();
                        System.currentTimeMillis();
                    }
                    float width = c153075zb.LJLJLJ.width() / 2.0f;
                    float height = c153075zb.LJLJLJ.height() / 2.0f;
                    float centerX = c153075zb.LJLJLJ.centerX();
                    float centerY = c153075zb.LJLJLJ.centerY();
                    float f2 = centerX - width;
                    float f3 = centerY - height;
                    c153075zb.LJLLI[0].set(f2, f3);
                    float f4 = centerX + width;
                    c153075zb.LJLLI[1].set(f4, f3);
                    float f5 = centerY + height;
                    c153075zb.LJLLI[2].set(f4, f5);
                    c153075zb.LJLLI[3].set(f2, f5);
                    RectF rectF2 = c153075zb.LJLJLLL;
                    rectF2.top -= f;
                    rectF2.bottom -= f;
                }
            }
        }
    }

    public void setHavePinEdit(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public void setHaveTimeEdit(boolean z) {
        this.LLI = z;
    }

    public void setITimeEditListener(C66J c66j) {
        this.LJLLL = c66j;
    }

    public void setMotionInterceptor(C66N c66n) {
        this.LLIILII = c66n;
    }

    public void setOnInfoStickerPinEditClick(C66G<C153075zb> c66g) {
        this.LJLLJ = c66g;
    }

    public void setOnInfoStickerTimeEdit(C66G<C153075zb> c66g) {
        this.LJLLILLLL = c66g;
    }

    public void setOnStickerChangeListener(C66F c66f) {
        this.LLFZ = c66f;
    }

    public void setPinHelper(C66T c66t) {
        this.LLIIL = c66t;
    }

    public void setShowHelpBox(boolean z) {
        RectF rectF;
        C153075zb c153075zb;
        SafeHandler safeHandler;
        C153075zb c153075zb2;
        this.LLIIII = z;
        C66E c66e = this.LJLLLLLL;
        if (c66e != null && (c153075zb2 = c66e.LIZ) != null) {
            c153075zb2.LJLJJL = z;
        }
        ARunnableS38S0100000_2 aRunnableS38S0100000_2 = this.LLIL;
        if (aRunnableS38S0100000_2 != null && (safeHandler = this.LJLJL) != null) {
            safeHandler.removeCallbacks(aRunnableS38S0100000_2);
        }
        if (z) {
            SafeHandler safeHandler2 = this.LJLJL;
            if (safeHandler2 != null) {
                safeHandler2.postDelayed(this.LLIL, 3000);
            }
            C66J c66j = this.LJLLL;
            if (c66j != null && !c66j.LJIIIIZZ() && !this.LJLLL.LIZ()) {
                int i = this.LLIIJLIL;
                C66E c66e2 = this.LJLLLLLL;
                if (c66e2 != null && (c153075zb = c66e2.LIZ) != null && c153075zb.LJLJLLL != null) {
                    rectF = new RectF(this.LJLLLLLL.LIZ.LJLJLLL);
                    float f = i;
                    rectF.top += f;
                    rectF.bottom += f;
                } else {
                    rectF = new RectF();
                }
                C89463Z9f c89463Z9f = this.LLIIIJ;
                PointF pointF = this.LLIIIL;
                c89463Z9f.LJIIL(rectF, (int) pointF.x, (int) pointF.y, this.LJLLLLLL.LIZ.LJLJI.rotateAngle, false);
                VideoPublishEditModel model = this.LJLJLLL;
                boolean z2 = this.LJLLLLLL.LIZ.LJLLJ;
                o.LJIIIZ(model, "model");
                FMX.LJIIL("prop_more_click", H8F.LJFF(model, z2, false, 4).LIZ);
            }
        } else {
            this.LLIIIJ.LJII();
        }
        invalidate();
    }

    public void setStickerDataChangeListener(InterfaceC153125zg interfaceC153125zg) {
        C153065za c153065za = this.LJLJLJ;
        if (c153065za != null) {
            c153065za.LJI = interfaceC153125zg;
        }
    }

    public void setStickerHintEnable(boolean z) {
        this.LLIILZL = z;
        C153065za c153065za = this.LJLJLJ;
        if (c153065za != null) {
            c153065za.LJIIJ = z;
        }
    }

    public void setStickerOnMoveListener(AnonymousClass666 anonymousClass666) {
        this.LLFII = anonymousClass666;
    }

    public C1548265u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLI = true;
        this.LJLLLLLL = new C66E();
        this.LLFFF = false;
        this.LLI = true;
        this.LLIFFJFJJ = true;
        this.LLIIIJ = new C89463Z9f(this, new AbstractC38911fr() { // from class: X.660
            @Override // X.C6GI
            public final void LJFF() {
            }

            @Override // X.C6GI
            public final void LJIIIIZZ() {
            }

            @Override // X.C6GI
            public final void LJIIJ() {
            }

            @Override // X.C6GI
            public final void LIZJ() {
                C1548265u.this.LIZLLL();
            }

            @Override // X.C6GI
            public final void LIZLLL() {
                C1548265u c1548265u = C1548265u.this;
                C153075zb c153075zb = c1548265u.LJLLLLLL.LIZ;
                if (c153075zb == null) {
                    c1548265u.setShowHelpBox(false);
                    return;
                }
                int id = c153075zb.LJLJI.getId();
                C153065za c153065za = c1548265u.LJLJLJ;
                if (c153065za != null) {
                    c153065za.LJIIJJI(id);
                }
                c1548265u.setShowHelpBox(false);
            }

            @Override // X.C6GI
            public final void LJ() {
                C1548265u c1548265u = C1548265u.this;
                C153075zb c153075zb = c1548265u.LJLLLLLL.LIZ;
                if (c153075zb == null) {
                    c1548265u.setShowHelpBox(false);
                    return;
                }
                c1548265u.LJLZ = 1;
                C153065za c153065za = c1548265u.LJLJLJ;
                if (c153065za != null) {
                    c153075zb.LJLJJL = false;
                    c153065za.LJIILL();
                }
                C66G<C153075zb> c66g = c1548265u.LJLLJ;
                if (c66g != null) {
                    c66g.LIZJ(c1548265u.LJLLLLLL.LIZ);
                }
                boolean z = c1548265u.LJLLLLLL.LIZ.LJLLJ;
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", "video_edit_page");
                c145995oB.LJI("shoot_way", c1548265u.LJLJLLL.mShootWay);
                c145995oB.LJI("creation_id", c1548265u.LJLJLLL.getCreationId());
                c145995oB.LJI("content_type", c1548265u.LJLJLLL.getAvetParameter().getContentType());
                c145995oB.LJI("content_source", c1548265u.LJLJLLL.getAvetParameter().getContentSource());
                c145995oB.LJI("prop_id", c1548265u.LJLLLLLL.LIZ.LJLJI.stickerId);
                c145995oB.LIZ(z ? 1 : 0, "is_diy_prop");
                GXR.LIZ("prop_pin", c145995oB.LIZ);
            }

            @Override // X.C6GI
            public final void LJIIIZ() {
                C1548265u c1548265u = C1548265u.this;
                C153075zb c153075zb = c1548265u.LJLLLLLL.LIZ;
                if (c153075zb == null) {
                    c1548265u.setShowHelpBox(false);
                    return;
                }
                if (!c1548265u.LLI) {
                    return;
                }
                c1548265u.LJLZ = 1;
                C153065za c153065za = c1548265u.LJLJLJ;
                if (c153065za != null) {
                    c153075zb.LJLJJL = false;
                    c153065za.LIZIZ();
                    c1548265u.LJLJLJ.LJIILL();
                }
                C66G<C153075zb> c66g = c1548265u.LJLLILLLL;
                if (c66g == null) {
                    return;
                }
                c66g.LIZJ(c1548265u.LJLLLLLL.LIZ);
            }
        });
        this.LLIIIL = new PointF();
        this.LLIIJLIL = AnonymousClass668.LIZIZ().LIZ();
        this.LLIILII = AnonymousClass647.LJLIL;
        this.LLIILZL = true;
        this.LLIIZ = false;
        this.LLIL = new ARunnableS38S0100000_2(this, 67);
    }

    public final void LJFF(float f, float f2) {
        int i;
        C153065za c153065za = this.LJLJLJ;
        if (c153065za == null || C32151Nz.LJJIIJZLJL(c153065za.LIZ)) {
            return;
        }
        InterfaceC153045zY interfaceC153045zY = this.LJLJJLL;
        if (interfaceC153045zY != null) {
            i = interfaceC153045zY.LJZL();
        } else {
            i = 0;
        }
        Iterator it = ((ArrayList) this.LJLJLJ.LIZ).iterator();
        while (it.hasNext()) {
            C153075zb c153075zb = (C153075zb) it.next();
            C153065za c153065za2 = this.LJLJLJ;
            c153065za2.getClass();
            StickerItemModel stickerItemModel = c153075zb.LJLJI;
            if ((i >= stickerItemModel.startTime && i <= stickerItemModel.endTime) || c153075zb.equals(c153065za2.LIZIZ)) {
                if (!this.LJLJLJ.LJFF(c153075zb) && LIZIZ(c153075zb, f, f2)) {
                    C153075zb c153075zb2 = this.LJLLLLLL.LIZ;
                    if (c153075zb2 != null) {
                        this.LJLJLJ.getClass();
                        if (c153075zb.LJLJI.layerWeight - c153075zb2.LJLJI.layerWeight > 0) {
                        }
                    }
                    C66E c66e = this.LJLLLLLL;
                    c66e.LIZ = c153075zb;
                    c66e.LIZIZ = c153075zb.LJLJJL;
                }
            }
        }
        this.LJLJLJ.LJIIJ(this.LJLLLLLL.LIZ);
        C66E c66e2 = this.LJLLLLLL;
        if (c66e2 == null || c66e2.LIZ == null) {
            return;
        }
        StickerItemModel stickerItemModel2 = new StickerItemModel();
        C153075zb c153075zb3 = this.LJLLLLLL.LIZ;
        if (c153075zb3 != null) {
            stickerItemModel2 = c153075zb3.LJLJI;
        }
        new C66B(stickerItemModel2.rotateAngle, stickerItemModel2.scale, stickerItemModel2.currentOffsetX, stickerItemModel2.currentOffsetY);
    }

    public final void LJI(final InfoStickerModel infoStickerModel, final boolean z) {
        if (this.LJLJI == 0 || this.LJLJJI == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.663
                public boolean LJLIL;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C153065za c153065za;
                    C1548265u.this.LIZJ();
                    C1548265u c1548265u = C1548265u.this;
                    if (c1548265u.LJLJI > 0 && c1548265u.LJLJJI > 0 && !this.LJLIL && (c153065za = c1548265u.LJLJLJ) != null) {
                        c153065za.LIZ(infoStickerModel, z);
                        this.LJLIL = true;
                        C1548265u.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
            return;
        }
        C153065za c153065za = this.LJLJLJ;
        if (c153065za == null) {
            return;
        }
        c153065za.LIZ(infoStickerModel, z);
    }

    public final boolean LIZIZ(C153075zb c153075zb, float f, float f2) {
        if (c153075zb.LJLJLLL == null) {
            return false;
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = new Point(0, 0);
        }
        this.LJLJJL.set((int) f, (int) f2);
        C77119UOl.LJJIIJ(this.LJLJJL, c153075zb.LJLJLLL.centerX(), c153075zb.LJLJLLL.centerY(), -c153075zb.LJLJI.rotateAngle);
        RectF rectF = c153075zb.LJLJLLL;
        Point point = this.LJLJJL;
        return rectF.contains(point.x, point.y);
    }
}
