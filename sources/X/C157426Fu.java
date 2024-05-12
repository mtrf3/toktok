package X;

import Y.ARunnableS13S0300000_2;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.HashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6Fu */
/* loaded from: classes3.dex */
public final class C157426Fu extends C6BL {
    public final InterfaceC143655kP LLI;
    public final VideoPublishEditModel LLIFFJFJJ;
    public final C157436Fv LLII;
    public final C82622Wbi LLIIII;
    public QaStruct LLIIIILZ;
    public C6G0 LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public InterfaceC65784Pro<C76800UCe> LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public HashMap<String, Float> LLIIL;

    @Override // X.C6BL
    public final int LJIIJ() {
        return 0;
    }

    @Override // X.C6BL
    public final int LJIILIIL() {
        return 17;
    }

    @Override // X.C6BL
    public final void LJJII() {
        this.LLIIIILZ = null;
        LJJJ();
        super.LJJII();
    }

    @Override // X.C6BL
    public final boolean LJIILLIIL() {
        if (this.LLIIIILZ != null) {
            return true;
        }
        return false;
    }

    @Override // X.C6BL
    public final boolean LJIJJLI() {
        return ((C63K) this.LLIIJLIL.getValue()).LJIIIIZZ();
    }

    public final void LJJIZ() {
        this.LLI.U2(false, false, false);
        LJIIZILJ();
        C156426By c156426By = this.LJLL;
        if (c156426By instanceof C157406Fs) {
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            C157416Ft qaStickerView = ((C157406Fs) c156426By).getQaStickerView();
            C6G2 c6g2 = new C6G2(0.0f, 0.0f, 63);
            c6g2.LIZJ = C6BL.LJIILJJIL(this.LJLL.getRotateAngle());
            c6g2.LIZ = this.LJLL.getContentView().getScaleX();
            c6g2.LIZIZ = this.LJLL.getContentView().getScaleY();
            c6g2.LIZLLL = this.LJLIL.getX() + this.LJLL.getContentView().getX();
            c6g2.LJ = this.LJLIL.getY() + this.LJLL.getContentView().getY();
            C6G0 c6g0 = this.LLIIIJ;
            if (c6g0 != null) {
                c6g0.post(new ARunnableS13S0300000_2(this, qaStickerView, c6g2, 0));
            }
        }
    }

    public final void LJJJ() {
        C156426By c156426By = this.LJLL;
        if (c156426By != null) {
            c156426By.getClass();
            HashMap<String, Float> hashMap = new HashMap<>();
            PointF centerViewPoint = c156426By.getCenterViewPoint();
            float f = c156426By.LJLJI;
            while (f > 180.0f) {
                f -= 360.0f;
            }
            while (f < -180.0f) {
                f += 360.0f;
            }
            hashMap.put("sticker_size", Float.valueOf(c156426By.LJLILLLLZI));
            hashMap.put("sticker_X", Float.valueOf(centerViewPoint.x));
            hashMap.put("sticker_Y", Float.valueOf(centerViewPoint.y));
            float f2 = 0.0f;
            if (f != 0.0f) {
                f2 = -f;
            }
            hashMap.put("sticker_angle", Float.valueOf(f2));
            this.LLIIL = hashMap;
        }
    }

    @Override // X.InterfaceC156096Ar
    public final InteractStickerStruct getInteractStickerStruct() {
        QaStruct qaStruct;
        InteractStickerStruct LJIIL = LJIIL(17);
        if (LJIIL == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qa_sticker_id", this.LLIIIL);
        hashMap.put("qa_sticker_tab_id", this.LLIIIZ);
        LJIIL.setAttr(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), hashMap));
        if ((this.LJLL instanceof C157406Fs) && (qaStruct = this.LLIIIILZ) != null) {
            JSONObject jSONObject = new JSONObject();
            C156426By c156426By = this.LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            jSONObject.put("answer_btn_height", Float.valueOf(((C157406Fs) c156426By).getAnswerBtnHeightRate()));
            qaStruct.setExtra(jSONObject.toString());
        }
        LJIIL.setQaStruct(this.LLIIIILZ);
        LJIIL.setIndex(12);
        return LJIIL;
    }

    @Override // X.C6BL
    public final C156426By LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        C157406Fs c157406Fs = new C157406Fs(context, this.LLIIII);
        c157406Fs.setLockMode(true);
        c157406Fs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c157406Fs;
    }

    @Override // X.C6BL
    public final void LJJIFFI(InteractStickerStruct interactStickerStruct) {
        C157406Fs c157406Fs;
        Number number;
        Number number2;
        this.LLIIIILZ = interactStickerStruct.getQaStruct();
        LIZLLL(true);
        C156426By c156426By = this.LJLL;
        o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
        C157406Fs c157406Fs2 = (C157406Fs) c156426By;
        QaStruct qaStruct = this.LLIIIILZ;
        if (c157406Fs2.LLIIIZ == null) {
            Context context = c157406Fs2.getContext();
            o.LJIIIIZZ(context, "context");
            C157416Ft c157416Ft = new C157416Ft(context, null, 6, 0);
            c157406Fs2.LLIIIZ = c157416Ft;
            if (qaStruct != null) {
                c157416Ft.LJJZZIII(qaStruct);
            }
        }
        View view = c157406Fs2.LJLJL;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).removeAllViews();
        View view2 = c157406Fs2.LJLJL;
        o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(c157406Fs2.LLIIIZ);
        c157406Fs2.setController(this);
        C6BO c6bo = this.LJLLILLLL;
        if (c6bo != null) {
            c6bo.LJII();
        }
        this.LJLL.setVisibility(4);
        HashMap hashMap = (HashMap) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.6Fx
        }.getType());
        this.LLIIIL = (String) hashMap.get("qa_sticker_id");
        if (hashMap.containsKey("qa_sticker_tab_id")) {
            this.LLIIIZ = (String) hashMap.get("qa_sticker_tab_id");
        }
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(interactStickerStruct);
        C156426By c156426By2 = this.LJLL;
        if ((c156426By2 instanceof C157406Fs) && (c157406Fs = (C157406Fs) c156426By2) != null) {
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
            c157406Fs.setQaStickerTimeEditData(new C1558669u(interactStickerStruct, intValue, number2.intValue()));
        }
        C156426By c156426By3 = this.LJLL;
        if (c156426By3 != null) {
            c156426By3.postDelayed(new ARunnableS21S0200000_2(interactStickerStruct, this, 0), 300L);
        }
    }

    @Override // X.C6BL
    public final boolean LJJIII(C156426By c156426By) {
        this.LLIFFJFJJ.qaPermissionDialogShownStatus = false;
        super.LJJIII(c156426By);
        this.LLIIIILZ = null;
        return true;
    }

    public final void LJJIL(C157416Ft c157416Ft) {
        QaStruct qaStruct = null;
        if (this.LJLL == null) {
            LIZLLL(false);
            double d = C6G3.LIZ;
            if (d != 1.0d && this.LLIFFJFJJ.qaStickerModel == null) {
                if (d > 1.0d) {
                    d = 1.0d;
                } else if (d < 0.5d) {
                    d = 0.5d;
                }
                this.LJLL.LJIJJ((float) d);
            }
            this.LLIFFJFJJ.qaStickerModel = null;
        }
        if (this.LJLL instanceof C157406Fs) {
            if (c157416Ft != null) {
                qaStruct = c157416Ft.getQaStruct();
            }
            this.LLIIIILZ = qaStruct;
            C156426By c156426By = this.LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            C157406Fs c157406Fs = (C157406Fs) c156426By;
            if (c157416Ft != null) {
                c157406Fs.LLIIIZ = c157416Ft;
                View view = c157406Fs.LJLJL;
                o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) view).removeAllViews();
                View view2 = c157406Fs.LJLJL;
                o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) view2).addView(c157416Ft);
            }
            C156426By c156426By2 = this.LJLL;
            if (c156426By2 != null) {
                c156426By2.post(new ARunnableS38S0100000_2(this, 2));
            }
            C156426By c156426By3 = this.LJLL;
            o.LJII(c156426By3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.EditQaStickerView");
            ((C157406Fs) c156426By3).setController(this);
        }
    }

    public C157426Fu(InterfaceC143655kP editPreviewApi, VideoPublishEditModel publishEditModel, C157436Fv mobHelper, C82622Wbi diContainer) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(mobHelper, "mobHelper");
        o.LJIIIZ(diContainer, "diContainer");
        this.LLI = editPreviewApi;
        this.LLIFFJFJJ = publishEditModel;
        this.LLII = mobHelper;
        this.LLIIII = diContainer;
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 5));
        this.LLIIL = new HashMap<>();
    }
}
