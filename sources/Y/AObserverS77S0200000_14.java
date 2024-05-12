package Y;

import X.C44529Hdl;
import X.C62Q;
import X.C6QQ;
import X.C74275TDb;
import X.C82432WWu;
import X.C82435WWx;
import X.C83146WkA;
import X.I9L;
import X.TGD;
import X.WX5;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateActivity;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS103S0300000_14;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes15.dex */
public class AObserverS77S0200000_14 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS77S0200000_14 aObserverS77S0200000_14, Object obj) {
        C6QQ.LIZ(new AqS103S0300000_14((C83146WkA) aObserverS77S0200000_14.l0, (C62Q) aObserverS77S0200000_14.l1, (Integer) obj, 0));
    }

    public static final void onChanged$1(AObserverS77S0200000_14 aObserverS77S0200000_14, Object obj) {
        String sdkExtra;
        EffectTemplate effectTemplate = (EffectTemplate) obj;
        if (effectTemplate != null && (sdkExtra = effectTemplate.getSdkExtra()) != null && s.LJJJLZIJ(sdkExtra, "imgK", false) && !((TGD) aObserverS77S0200000_14.l0).LJLLI.LLF) {
            View view = ((FavoriteSticker) aObserverS77S0200000_14.l1).LJLJJI;
            if (view != null) {
                view.setPadding((int) C74275TDb.LIZ(15.0f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            return;
        }
        View view2 = ((FavoriteSticker) aObserverS77S0200000_14.l1).LJLJJI;
        if (view2 == null) {
            return;
        }
        view2.setPadding((int) C74275TDb.LIZ(12.0f), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
    }

    public static final void onChanged$2(AObserverS77S0200000_14 aObserverS77S0200000_14, Object obj) {
        PNSAgeGateBaseFragment fragment = (PNSAgeGateBaseFragment) aObserverS77S0200000_14.l0;
        PNSAgeGateActivity this$0 = (PNSAgeGateActivity) aObserverS77S0200000_14.l1;
        Integer num = (Integer) obj;
        o.LJIIIZ(fragment, "$fragment");
        o.LJIIIZ(this$0, "this$0");
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        String quantityString = this$0.getResources().getQuantityString(R.plurals.b7, intValue, Integer.valueOf(intValue));
        o.LJIIIIZZ(quantityString, "resources.getQuantityStr…                        )");
        fragment.Hl(quantityString);
    }

    public static final void onChanged$3(AObserverS77S0200000_14 aObserverS77S0200000_14, Object obj) {
        C82432WWu c82432WWu = (C82432WWu) aObserverS77S0200000_14.l0;
        WX5 wx5 = (WX5) aObserverS77S0200000_14.l1;
        Pair pair = (Pair) obj;
        c82432WWu.getClass();
        if (pair == null || !((Boolean) pair.first).booleanValue()) {
            return;
        }
        ShortVideoContext LIZLLL = c82432WWu.LIZLLL();
        long LIZIZ = C44529Hdl.LIZIZ();
        if (LIZLLL.LJJJI()) {
            CameraComponentModel cameraComponentModel = LIZLLL.cameraComponentModel;
            if (cameraComponentModel.recordMode != 1) {
                LIZIZ = cameraComponentModel.mMaxDuration;
                if (TimeSpeedModelExtension.calculateRealTime(c82432WWu.LIZ.getEndFrameTimeUS() / 1000, 1.0d) + c82432WWu.LIZLLL().cameraComponentModel.mTotalRecordingTime >= LIZIZ || !c82432WWu.LJFF) {
                    return;
                }
                c82432WWu.LJFF = false;
                c82432WWu.LJIIIIZZ = true;
                c82432WWu.LIZLLL().gameScore = ((Integer) pair.second).intValue();
                C82435WWx c82435WWx = (C82435WWx) wx5;
                c82435WWx.getClass();
                I9L i9l = new I9L("game_record_full");
                i9l.LIZ = 2;
                c82435WWx.LIZ.Ec0(i9l);
            }
        }
        if (LIZLLL.LJJIJIIJI()) {
            LIZIZ = 3000;
        }
        if (TimeSpeedModelExtension.calculateRealTime(c82432WWu.LIZ.getEndFrameTimeUS() / 1000, 1.0d) + c82432WWu.LIZLLL().cameraComponentModel.mTotalRecordingTime >= LIZIZ) {
            return;
        }
        c82432WWu.LJFF = false;
        c82432WWu.LJIIIIZZ = true;
        c82432WWu.LIZLLL().gameScore = ((Integer) pair.second).intValue();
        C82435WWx c82435WWx2 = (C82435WWx) wx5;
        c82435WWx2.getClass();
        I9L i9l2 = new I9L("game_record_full");
        i9l2.LIZ = 2;
        c82435WWx2.LIZ.Ec0(i9l2);
    }

    public AObserverS77S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
