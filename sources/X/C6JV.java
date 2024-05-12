package X;

import Y.ARunnableS21S0200000_2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6JV */
/* loaded from: classes3.dex */
public final class C6JV extends C6BL {
    public final InterfaceC143655kP LLI;
    public final C82622Wbi LLIFFJFJJ;
    public String LLII;
    public String LLIIII;
    public ViewOnClickListenerC158316Jf LLIIIILZ;
    public boolean LLIIIJ;
    public CountDownStickerStruct LLIIIL;
    public final C62822Ol8 LLIIIZ;

    @Override // X.C6BL
    public final int LJIIJ() {
        return R.string.e42;
    }

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 10;
    }

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        if (this.LLIIIL != null) {
            return true;
        }
        return false;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        return ((C63Q) this.LLIIIZ.getValue()).LJIIIIZZ();
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        InteractStickerStruct LJIIL = LJIIL(10);
        if (LJIIL == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("livecd_sticker_id", this.LLII);
        hashMap.put("livecd_sticker_tab_id", this.LLIIII);
        LJIIL.setAttr(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), hashMap));
        LJIIL.setIndex(3);
        LJIIL.setCountDownStickerStruct(this.LLIIIL);
        return LJIIL;
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        C6JW c6jw = new C6JW(context, this.LLIFFJFJJ);
        c6jw.setLockMode(true);
        c6jw.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c6jw;
    }

    @Override // X.C6BL
    public final void LJJIFFI(InteractStickerStruct interactStickerStruct) {
        C6JW c6jw;
        Number number;
        Number number2;
        if (interactStickerStruct != null) {
            LIZLLL(true);
            this.LLIIIL = interactStickerStruct.getCountDownStickerStruct();
            C156426By c156426By = this.LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
            C6JW c6jw2 = (C6JW) c156426By;
            CountDownStickerStruct countDownStickerStruct = this.LLIIIL;
            if (c6jw2.LLIIIZ == null) {
                Context context = c6jw2.getContext();
                o.LJIIIIZZ(context, "context");
                C158326Jg c158326Jg = new C158326Jg(context);
                c6jw2.LLIIIZ = c158326Jg;
                c158326Jg.setTouchEnable(true);
                C158326Jg c158326Jg2 = c6jw2.LLIIIZ;
                o.LJI(c158326Jg2);
                c158326Jg2.setEditEnable(false);
                if (countDownStickerStruct != null) {
                    C158326Jg c158326Jg3 = c6jw2.LLIIIZ;
                    o.LJI(c158326Jg3);
                    c158326Jg3.LIZ(countDownStickerStruct);
                }
                o.LJI(c6jw2.LLIIIZ);
            }
            View view = c6jw2.LJLJL;
            o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view).removeAllViews();
            View view2 = c6jw2.LJLJL;
            o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view2).addView(c6jw2.LLIIIZ);
            c6jw2.setController(this);
            C6BO c6bo = this.LJLLILLLL;
            if (c6bo != null) {
                c6bo.LJII();
            }
            this.LJLL.setVisibility(4);
            HashMap hashMap = (HashMap) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.6JZ
            }.getType());
            this.LLII = (String) hashMap.get("livecd_sticker_id");
            if (hashMap.containsKey("livecd_sticker_tab_id")) {
                this.LLIIII = (String) hashMap.get("livecd_sticker_tab_id");
            }
            NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(interactStickerStruct);
            C156426By c156426By2 = this.LJLL;
            if ((c156426By2 instanceof C6JW) && (c6jw = (C6JW) c156426By2) != null) {
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
                c6jw.setLiveCDStickerTimeEditData(new C1558669u(interactStickerStruct, intValue, number2.intValue()));
            }
        }
        C156426By c156426By3 = this.LJLL;
        if (c156426By3 != null) {
            c156426By3.postDelayed(new ARunnableS21S0200000_2(interactStickerStruct, this, 64), 300L);
        }
    }

    @Override // X.C6BL
    public final boolean LJJIII(C156426By view) {
        C158296Jd c158296Jd;
        o.LJIIIZ(view, "view");
        if (!(view instanceof C6JW)) {
            return false;
        }
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = this.LLIIIILZ;
        if (viewOnClickListenerC158316Jf != null && (c158296Jd = viewOnClickListenerC158316Jf.LLF) != null) {
            c158296Jd.LIZIZ(false);
        }
        boolean LJJIII = super.LJJIII(view);
        this.LLIIIL = null;
        return LJJIII;
    }

    public C6JV(InterfaceC143655kP editPreviewApi, C82622Wbi diContainer) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(diContainer, "diContainer");
        this.LLI = editPreviewApi;
        this.LLIFFJFJJ = diContainer;
        this.LLIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1004));
    }

    @Override // X.C6BL
    public final void LJJIJIIJI(InterfaceC153045zY interfaceC153045zY, InterfaceC143655kP interfaceC143655kP) {
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf;
        super.LJJIJIIJI(interfaceC153045zY, interfaceC143655kP);
        if (interfaceC153045zY == null) {
            return;
        }
        float f = interfaceC153045zY.LLILZ().height;
        if (f > KL2.LIZJ(this.LJLIL.getContext(), 214.0f)) {
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf2 = this.LLIIIILZ;
            if (viewOnClickListenerC158316Jf2 != null) {
                viewOnClickListenerC158316Jf2.setMaxLine(3);
                return;
            }
            return;
        }
        if (f > KL2.LIZJ(this.LJLIL.getContext(), 194.0f)) {
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf3 = this.LLIIIILZ;
            if (viewOnClickListenerC158316Jf3 == null) {
                return;
            }
            viewOnClickListenerC158316Jf3.setMaxLine(2);
            return;
        }
        if (f <= KL2.LIZJ(this.LJLIL.getContext(), 184.0f) || (viewOnClickListenerC158316Jf = this.LLIIIILZ) == null) {
            return;
        }
        viewOnClickListenerC158316Jf.setMaxLine(1);
    }
}
