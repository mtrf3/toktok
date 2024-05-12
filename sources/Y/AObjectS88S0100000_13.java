package Y;

import X.C145995oB;
import X.C30581Hy;
import X.C5NP;
import X.C78789Uw5;
import X.C78801UwH;
import X.C78880UxY;
import X.C78886Uxe;
import X.C78921UyD;
import X.C81633W2b;
import X.C82891Wg3;
import X.C8HR;
import X.HJ3;
import X.InterfaceC29911Fj;
import X.ORZ;
import X.TN4;
import X.W2W;
import X.X1D;
import com.ss.android.ugc.aweme.sticker.presenter.handler.MicStickerAudioController;
import com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelViewModel;
import defpackage.g0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AObjectS88S0100000_13 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;

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
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            default:
                return;
        }
    }

    public AObjectS88S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS88S0100000_13 aObjectS88S0100000_13, Object obj) {
        C8HR c8hr = ((W2W) aObjectS88S0100000_13.l0).LJLLJ.LJLJLLL;
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(8);
    }

    public static final void onChanged$1(AObjectS88S0100000_13 aObjectS88S0100000_13, Object obj) {
        OptionCategoryPanelFragment optionCategoryPanelFragment;
        String str;
        C8HR c8hr;
        C81633W2b c81633W2b = ((W2W) aObjectS88S0100000_13.l0).LJLLJ;
        Effect effect = c81633W2b.LJLJLJ;
        int i = 1;
        if (effect != null && C78886Uxe.LJJIJIIJI(effect) && (c8hr = c81633W2b.LJLJLLL) != null) {
            c8hr.setVisibility(0);
        }
        WeakReference<OptionCategoryPanelFragment> weakReference = c81633W2b.LJLLI;
        if (weakReference != null && (optionCategoryPanelFragment = weakReference.get()) != null) {
            OptionCategoryPanelViewModel optionCategoryPanelViewModel = optionCategoryPanelFragment.LJLJL;
            if (optionCategoryPanelViewModel != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) optionCategoryPanelViewModel.LJLJJL.LJFF).iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    for (C78789Uw5 c78789Uw5 : ((C78801UwH) it.next()).LJ) {
                        Effect effect2 = c78789Uw5.LJFF;
                        if (effect2 != null && c78789Uw5.LJIIJ) {
                            arrayList.add(effect2.getEffectId());
                            EffectCategoryResponse LIZLLL = TN4.LIZIZ().LIZLLL(effect2.getEffectId());
                            if (LIZLLL != null) {
                                str = LIZLLL.getKey();
                            } else {
                                str = null;
                            }
                            if (C30581Hy.LJJIIJ(str)) {
                                i2 = 1;
                            }
                        }
                    }
                }
                C145995oB c145995oB = new C145995oB();
                Effect effect3 = optionCategoryPanelViewModel.LJLILLLLZI;
                if (effect3 == null || !C78886Uxe.LJJIJL(effect3)) {
                    i = 0;
                }
                c145995oB.LIZ(i, "is_lalaland_effect");
                c145995oB.LJI("stackable_item_list", ORZ.LLD(arrayList, ",", null, null, null, 62));
                c145995oB.LIZ(i2, "prop_selected_from_trending");
                Map<String, String> eventMap = c145995oB.LIZ;
                o.LJIIIIZZ(eventMap, "eventMap");
                C78880UxY.LJJLIIIJL("record_video", eventMap);
                return;
            }
            o.LJIJI("vm");
            throw null;
        }
    }

    public static final void onChanged$2(AObjectS88S0100000_13 aObjectS88S0100000_13, Object obj) {
        int i;
        Boolean isVisible = (Boolean) obj;
        C8HR c8hr = ((C81633W2b) aObjectS88S0100000_13.l0).LJLJLLL;
        if (c8hr == null) {
            return;
        }
        o.LJIIIIZZ(isVisible, "isVisible");
        if (isVisible.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        c8hr.setVisibility(i);
    }

    public static final void onChanged$3(AObjectS88S0100000_13 aObjectS88S0100000_13, Object obj) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = (TTEPEffectPreviewActivity) aObjectS88S0100000_13.l0;
        tTEPEffectPreviewActivity.getClass();
        g0.LJJIJIL(tTEPEffectPreviewActivity, (HJ3) obj, new AObjectS56S0101000_13(6, tTEPEffectPreviewActivity, 1), new AObjectS56S0101000_13(4, tTEPEffectPreviewActivity, 4), new AObjectS56S0101000_13(5, tTEPEffectPreviewActivity, 3), new AObjectS137S0100000_8(tTEPEffectPreviewActivity, 2));
    }

    public static final void onChanged$4(AObjectS88S0100000_13 aObjectS88S0100000_13, Object obj) {
        Boolean it = (Boolean) obj;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((MicStickerAudioController) aObjectS88S0100000_13.l0).LJLJI);
        LIZ.append(" observe isStop ");
        LIZ.append(it);
        LIZ.append(" currentSticker ");
        LIZ.append(((MicStickerAudioController) aObjectS88S0100000_13.l0).LJLIL);
        LIZ.append(" needStopAudioRecorderAfter ");
        LIZ.append(((MicStickerAudioController) aObjectS88S0100000_13.l0).LJLILLLLZI);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue() && ((MicStickerAudioController) aObjectS88S0100000_13.l0).LJLIL == null && ((MicStickerAudioController) aObjectS88S0100000_13.l0).LJLILLLLZI) {
            ((MicStickerAudioController) aObjectS88S0100000_13.l0).LIZ(C78921UyD.LIZ);
            ((MicStickerAudioController) aObjectS88S0100000_13.l0).LJLILLLLZI = false;
        }
    }

    public static final void onChanged$5(AObjectS88S0100000_13 aObjectS88S0100000_13, Object obj) {
        Boolean it = (Boolean) obj;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((VoiceRecognizeStickerHandler) aObjectS88S0100000_13.l0).LJLJJI);
        LIZ.append(" observe isStop ");
        LIZ.append(it);
        LIZ.append(" currentSticker ");
        LIZ.append(((VoiceRecognizeStickerHandler) aObjectS88S0100000_13.l0).LJLILLLLZI);
        LIZ.append(" needStopAudioRecorderAfter ");
        LIZ.append(((VoiceRecognizeStickerHandler) aObjectS88S0100000_13.l0).LJLJI);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue() && ((VoiceRecognizeStickerHandler) aObjectS88S0100000_13.l0).LJLILLLLZI == null && ((VoiceRecognizeStickerHandler) aObjectS88S0100000_13.l0).LJLJI) {
            VoiceRecognizeStickerHandler voiceRecognizeStickerHandler = (VoiceRecognizeStickerHandler) aObjectS88S0100000_13.l0;
            voiceRecognizeStickerHandler.LJLJJLL.LIZ(C78921UyD.LIZ);
            ((VoiceRecognizeStickerHandler) aObjectS88S0100000_13.l0).LJLJI = false;
        }
    }
}
