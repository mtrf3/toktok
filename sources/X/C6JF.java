package X;

import Y.ARunnableS13S0300000_2;
import Y.ARunnableS21S0200000_2;
import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6JF */
/* loaded from: classes3.dex */
public final class C6JF extends C6BL {
    public final InterfaceC143655kP LLI;
    public final VideoPublishEditModel LLIFFJFJJ;
    public final C82622Wbi LLII;
    public final String LLIIII;
    public final String LLIIIILZ;
    public PollStruct LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public C6JI LLIIJI;
    public boolean LLIIJLIL;
    public final int LLIIL;
    public final int LLIILII;
    public final int LLIILZL;
    public final int LLIIZ;
    public final C62822Ol8 LLIL;

    @Override // X.C6BL
    public final int LJIIJ() {
        return R.string.e42;
    }

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.6JH, T] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.6Bm] */
    public final void LJJIL() {
        this.LLIIJLIL = true;
        this.LLI.U2(false, false, false);
        C6JI c6ji = this.LLIIJI;
        if (c6ji != null) {
            float height = this.LJLIL.getHeight();
            float top = this.LJLIL.getTop();
            PointF pointF = c6ji.LJLLILLLL;
            pointF.x = height;
            pointF.y = top;
        }
        LJIIZILJ();
        if (this.LJLL instanceof C6JG) {
            C68322mC c68322mC = new C68322mC();
            C156426By c156426By = this.LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            c68322mC.element = ((C6JG) c156426By).getBaseView();
            C156426By c156426By2 = this.LJLL;
            o.LJII(c156426By2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            ((C6JG) c156426By2).LLIIJLIL = r1.LJLJL.getMeasuredHeight();
            C68322mC c68322mC2 = new C68322mC();
            ?? c156306Bm = new C156306Bm(0);
            c68322mC2.element = c156306Bm;
            c156306Bm.LJLJJLL = ((C6JH) c68322mC.element).getLastTouchedIndex();
            ((C156306Bm) c68322mC2.element).LJLJI = C6BL.LJIILJJIL(this.LJLL.getRotateAngle());
            ((C156306Bm) c68322mC2.element).LJLIL = this.LJLL.getContentView().getScaleX();
            ((C156306Bm) c68322mC2.element).LJLILLLLZI = this.LJLL.getContentView().getScaleY();
            ((C156306Bm) c68322mC2.element).LJLJJI = this.LJLIL.getX() + this.LJLL.getContentView().getX();
            ((C156306Bm) c68322mC2.element).LJLJJL = this.LJLIL.getY() + this.LJLL.getContentView().getY();
            C6JI c6ji2 = this.LLIIJI;
            if (c6ji2 != null) {
                c6ji2.post(new ARunnableS13S0300000_2(this, c68322mC, c68322mC2, 22));
            }
        }
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        InteractStickerStruct LJIIL = LJIIL(3);
        if (LJIIL == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.LLIIII, this.LLIIIL);
        hashMap.put(this.LLIIIILZ, this.LLIIIZ);
        LJIIL.setAttr(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), hashMap));
        LJIIL.setPollStruct(this.LLIIIJ);
        LJIIL.setIndex(1);
        return LJIIL;
    }

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        if (this.LLIIIJ != null) {
            return true;
        }
        return false;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        return ((C63R) this.LLIL.getValue()).LJIIIIZZ();
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        C6JG c6jg = new C6JG(context, this.LLII);
        c6jg.setLockMode(true);
        c6jg.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c6jg;
    }

    @Override // X.C6BL
    public final void LJJIFFI(InteractStickerStruct interactStickerStruct) {
        C6JG c6jg;
        Number number;
        Number number2;
        if (interactStickerStruct != null) {
            this.LLIIIJ = interactStickerStruct.getPollStruct();
            LIZLLL(true);
            C156426By c156426By = this.LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            C6JG c6jg2 = (C6JG) c156426By;
            PollStruct pollStruct = this.LLIIIJ;
            if (c6jg2.LLIIIZ == null) {
                C6JH c6jh = new C6JH(c6jg2.getContext());
                c6jg2.LLIIIZ = c6jh;
                c6jh.setTouchEnable(true);
                c6jg2.LLIIIZ.setEditEnable(false);
                if (pollStruct != null && !C79004UzY.LJJIFFI(pollStruct.getOptions())) {
                    c6jg2.LLIIIZ.LIZIZ(pollStruct);
                }
                c6jg2.LLIIIZ.LJFF();
            }
            ((ViewGroup) c6jg2.LJLJL).removeAllViews();
            ((ViewGroup) c6jg2.LJLJL).addView(c6jg2.LLIIIZ);
            c6jg2.setController(this);
            C6BO c6bo = this.LJLLILLLL;
            if (c6bo != null) {
                c6bo.LJII();
            }
            this.LJLL.setVisibility(4);
            HashMap hashMap = (HashMap) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.6JN
            }.getType());
            if (hashMap != null) {
                this.LLIIIL = (String) hashMap.get(this.LLIIII);
                if (hashMap.containsKey(this.LLIIIILZ)) {
                    this.LLIIIZ = (String) hashMap.get(this.LLIIIILZ);
                }
            }
            NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(interactStickerStruct);
            C156426By c156426By2 = this.LJLL;
            if ((c156426By2 instanceof C6JG) && (c6jg = (C6JG) c156426By2) != null) {
                if (LIZIZ != null) {
                    number = Float.valueOf(LIZIZ.getStartTime());
                } else {
                    number = 0;
                }
                int intValue = number.intValue();
                if (LIZIZ != null) {
                    number2 = Float.valueOf(LIZIZ.getEndTime());
                } else {
                    number2 = 0;
                }
                c6jg.setPollStickerTimeEditData(new C1558669u(interactStickerStruct, intValue, number2.intValue()));
            }
        }
        C156426By c156426By3 = this.LJLL;
        if (c156426By3 != null) {
            c156426By3.postDelayed(new ARunnableS21S0200000_2(interactStickerStruct, this, 74), 300L);
        }
    }

    @Override // X.C6BL
    public final boolean LJJIII(C156426By view) {
        o.LJIIIZ(view, "view");
        if (view instanceof C6JG) {
            boolean LJJIII = super.LJJIII(view);
            this.LLIIIJ = null;
            return LJJIII;
        }
        return false;
    }

    @Override // X.C6BL
    public final void LJJIJIIJI(InterfaceC153045zY interfaceC153045zY, InterfaceC143655kP interfaceC143655kP) {
        C6JI c6ji;
        super.LJJIJIIJI(interfaceC153045zY, interfaceC143655kP);
        if (interfaceC153045zY == null) {
            return;
        }
        float f = interfaceC153045zY.LLILZ().height;
        if (f > KL2.LIZJ(this.LJLIL.getContext(), this.LLIILZL + this.LLIIZ)) {
            C6JI c6ji2 = this.LLIIJI;
            if (c6ji2 != null) {
                c6ji2.setMaxLine(3);
                return;
            }
            return;
        }
        if (f > KL2.LIZJ(this.LJLIL.getContext(), this.LLIILII + this.LLIIZ)) {
            C6JI c6ji3 = this.LLIIJI;
            if (c6ji3 == null) {
                return;
            }
            c6ji3.setMaxLine(2);
            return;
        }
        if (f <= KL2.LIZJ(this.LJLIL.getContext(), this.LLIIL + this.LLIIZ) || (c6ji = this.LLIIJI) == null) {
            return;
        }
        c6ji.setMaxLine(1);
    }

    public C6JF(InterfaceC143655kP editPreviewApi, VideoPublishEditModel publishEditModel, C82622Wbi diContainer) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(diContainer, "diContainer");
        this.LLI = editPreviewApi;
        this.LLIFFJFJJ = publishEditModel;
        this.LLII = diContainer;
        this.LLIIII = "poll_sticker_id";
        this.LLIIIILZ = "poll_sticker_tab_id";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pi_start");
        LIZ.append("(.*?)");
        LIZ.append("pi_end");
        X1D.LIZIZ(LIZ);
        this.LLIIL = 160;
        this.LLIILII = 170;
        this.LLIILZL = 190;
        this.LLIIZ = 24;
        this.LLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1080));
    }
}
