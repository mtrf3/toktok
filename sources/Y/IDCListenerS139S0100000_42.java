package Y;

import X.C113554cx;
import X.C1539962p;
import X.C188727au;
import X.C68M;
import X.C6ZT;
import X.C76800UCe;
import X.C78127UlP;
import X.C93566aSw;
import X.C93670aUc;
import X.C93736aVg;
import X.C93825aX7;
import X.C93854aXa;
import X.C94036aaW;
import X.C94178aco;
import X.C94441ah3;
import X.C94450ahC;
import X.C94506ai6;
import X.C94507ai7;
import X.C94708alM;
import X.C94855anj;
import X.C94896aoO;
import X.C94898aoQ;
import X.EnumC93590aTK;
import X.FMX;
import X.InterfaceC139695e1;
import X.InterfaceC88472Yns;
import X.InterfaceC93565aSv;
import X.InterfaceC93654aUM;
import X.InterfaceC93955aZD;
import X.K55;
import X.OSZ;
import X.XKQ;
import X.XKX;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel;
import com.bytedance.effectcreatormobile.objectselect.prefab.edit.PrefabEditFragment;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFacePoints;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicSettingPage;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.MusicRecognitionFragment;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.viewmodel.MusicRecognitionVM;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui.VoiceSearchFragment;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDCListenerS139S0100000_42 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            case 19:
                onClick$19(this, view);
                return;
            case 20:
                onClick$20(this, view);
                return;
            case 21:
                onClick$21(this, view);
                return;
            case 22:
                onClick$22(this, view);
                return;
            case 23:
                onClick$23(this, view);
                return;
            case 24:
                onClick$24(this, view);
                return;
            case 25:
                onClick$25(this, view);
                return;
            case 26:
                onClick$26(this, view);
                return;
            case 27:
                onClick$27(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS139S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        C94036aaW c94036aaW = ((GifsFragment) iDCListenerS139S0100000_42.l0).LJLIL;
        o.LJI(c94036aaW);
        c94036aaW.LJLJLJ.getEditText().setText("");
        C94036aaW c94036aaW2 = ((GifsFragment) iDCListenerS139S0100000_42.l0).LJLIL;
        o.LJI(c94036aaW2);
        c94036aaW2.LJLJLJ.getEditText().clearFocus();
        ((GifsFragment) iDCListenerS139S0100000_42.l0).xl(false);
        C93736aVg.LIZ(((GifsFragment) iDCListenerS139S0100000_42.l0).requireContext());
    }

    public static final void onClick$1(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        ((PrefabEditFragment) iDCListenerS139S0100000_42.l0).vl();
    }

    public static final void onClick$10(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        C1539962p.LIZIZ().LIZJ();
        View view2 = ((C93566aSw) iDCListenerS139S0100000_42.l0).LJLZ;
        if (view2 != null) {
            view2.setBackground(C78127UlP.LIZIZ(C1539962p.LIZIZ().LIZ().LIZ));
        }
        ((C93566aSw) iDCListenerS139S0100000_42.l0).getClass();
    }

    public static final void onClick$11(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        C93566aSw c93566aSw = (C93566aSw) iDCListenerS139S0100000_42.l0;
        int i = c93566aSw.LJLJLJ;
        int i2 = 1;
        if (i != 1) {
            if (i != 2 && i == 3) {
                i2 = 2;
            }
        } else {
            i2 = 3;
        }
        c93566aSw.LJLJLJ = i2;
        c93566aSw.LIZIZ();
        C94441ah3 c94441ah3 = c93566aSw.LJLILLLLZI;
        if (c94441ah3 != null) {
            c94441ah3.setAligin(c93566aSw.LJLJLJ);
            InterfaceC139695e1 interfaceC139695e1 = c93566aSw.LL;
            if (interfaceC139695e1 != null) {
                interfaceC139695e1.LJFF(0, String.valueOf(c93566aSw.LJLJLJ), "text", null);
                return;
            }
            return;
        }
        o.LJIJI("simpleEditText");
        throw null;
    }

    public static final void onClick$12(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        C93566aSw c93566aSw = (C93566aSw) iDCListenerS139S0100000_42.l0;
        InputMethodManager inputMethodManager = c93566aSw.LJLLI;
        if (inputMethodManager != null) {
            C94441ah3 c94441ah3 = c93566aSw.LJLILLLLZI;
            if (c94441ah3 != null) {
                inputMethodManager.hideSoftInputFromWindow(c94441ah3.getWindowToken(), 0);
            } else {
                o.LJIJI("simpleEditText");
                throw null;
            }
        }
        C94441ah3 c94441ah32 = ((C93566aSw) iDCListenerS139S0100000_42.l0).LJLILLLLZI;
        if (c94441ah32 != null) {
            c94441ah32.clearFocus();
            C93566aSw c93566aSw2 = (C93566aSw) iDCListenerS139S0100000_42.l0;
            InterfaceC93565aSv interfaceC93565aSv = c93566aSw2.LLF;
            if (interfaceC93565aSv != null) {
                String editTextStr = c93566aSw2.getEditTextStr();
                C93566aSw c93566aSw3 = (C93566aSw) iDCListenerS139S0100000_42.l0;
                int i = c93566aSw3.LJLJLJ;
                int i2 = c93566aSw3.LJLJLLL;
                String LJI = C68M.LJIIJ().LJI(((C93566aSw) iDCListenerS139S0100000_42.l0).getScene());
                o.LJIIIIZZ(LJI, "getInstance().getCurTypeface(scene)");
                C93566aSw c93566aSw4 = (C93566aSw) iDCListenerS139S0100000_42.l0;
                int i3 = c93566aSw4.LJLJJLL;
                C94441ah3 c94441ah33 = c93566aSw4.LJLILLLLZI;
                if (c94441ah33 != null) {
                    interfaceC93565aSv.LJLL(editTextStr, i, i2, LJI, i3, c94441ah33);
                    return;
                } else {
                    o.LJIJI("simpleEditText");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("simpleEditText");
        throw null;
    }

    public static final void onClick$13(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        InterfaceC93565aSv interfaceC93565aSv = ((C93566aSw) iDCListenerS139S0100000_42.l0).LLF;
        if (interfaceC93565aSv != null) {
            interfaceC93565aSv.onCancel();
        }
    }

    public static final void onClick$14(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        if (!C6ZT.LIZIZ(view, 500L) && ((MusicRecognitionFragment) iDCListenerS139S0100000_42.l0).isResumed()) {
            MusicRecognitionVM vl = ((MusicRecognitionFragment) iDCListenerS139S0100000_42.l0).vl();
            vl.getClass();
            vl.hv0(EnumC93590aTK.BUTTON_CLICK);
        }
    }

    public static final void onClick$15(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        VoiceSearchContainerFragment voiceSearchContainerFragment;
        MusicRecognitionVM vl = ((MusicRecognitionFragment) iDCListenerS139S0100000_42.l0).vl();
        vl.getClass();
        vl.hv0(EnumC93590aTK.X_CLICK);
        Fragment parentFragment = ((MusicRecognitionFragment) iDCListenerS139S0100000_42.l0).getParentFragment();
        if ((parentFragment instanceof VoiceSearchContainerFragment) && (voiceSearchContainerFragment = (VoiceSearchContainerFragment) parentFragment) != null) {
            voiceSearchContainerFragment.vl();
            K55 k55 = voiceSearchContainerFragment.LJLJJLL;
            if (k55 != null) {
                k55.onDismiss();
            }
        }
    }

    public static final void onClick$16(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("modelphoto_mismatch_alert_click");
        }
        ToastService toastService = ToastService.INSTANCE;
        Context context = ((C94855anj) iDCListenerS139S0100000_42.l0).getContext();
        String string = ((C94855anj) iDCListenerS139S0100000_42.l0).getContext().getString(R.string.fya);
        o.LJIIIIZZ(string, "this.context.getString(c…tool_toast_modelmismatch)");
        toastService.showToast(context, string);
    }

    public static final void onClick$17(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("modelphoto_mismatch_alert_click");
        }
        ToastService toastService = ToastService.INSTANCE;
        Context context = ((C94855anj) iDCListenerS139S0100000_42.l0).getContext();
        String string = ((C94855anj) iDCListenerS139S0100000_42.l0).getContext().getString(R.string.fya);
        o.LJIIIIZZ(string, "this.context.getString(c…tool_toast_modelmismatch)");
        toastService.showToast(context, string);
    }

    public static final void onClick$18(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        if (EffectLayerEditorFragment.vl((EffectLayerEditorFragment) iDCListenerS139S0100000_42.l0).isChecked()) {
            StatisticReporter LIZ = C93670aUc.LIZ();
            if (LIZ != null) {
                LIZ.onEvent("layer_objectdetail_open");
                return;
            }
            return;
        }
        ((EffectLayerEditorFragment) iDCListenerS139S0100000_42.l0).onEventLayerDetailsClose("switch_click");
    }

    public static final void onClick$19(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        EffectLayerEditorFragment.vl((EffectLayerEditorFragment) iDCListenerS139S0100000_42.l0).performClick();
    }

    public static final void onClick$2(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        String str;
        StatisticReporter LIZ;
        Feature feature = ((PrefabViewModel) ((PrefabEditFragment) iDCListenerS139S0100000_42.l0).LJLJI.getValue()).LJLLL;
        FeatureType featureType = null;
        if (feature != null) {
            str = C93825aX7.LJFF(feature);
        } else {
            str = null;
        }
        if (str != null && (LIZ = C93670aUc.LIZ()) != null) {
            LIZ.onEvent("general_effect_confirm", C113554cx.LJJL(new OSZ("is_ame_data", "1"), new OSZ("feature_id", str)));
        }
        if (((PrefabViewModel) ((PrefabEditFragment) iDCListenerS139S0100000_42.l0).LJLJI.getValue()).iv0()) {
            PrefabEditFragment prefabEditFragment = (PrefabEditFragment) iDCListenerS139S0100000_42.l0;
            prefabEditFragment.getClass();
            IStore LIZ2 = C93854aXa.LIZ();
            if (LIZ2 != null && LIZ2.shouldShowSplitScreenDialog()) {
                Feature feature2 = ((PrefabViewModel) prefabEditFragment.LJLJI.getValue()).LJLLL;
                if (feature2 != null) {
                    featureType = feature2.getFeatureType();
                }
                if (featureType == FeatureType.FeatureType_LegacyFeature) {
                    prefabEditFragment.xl();
                    IStore LIZ3 = C93854aXa.LIZ();
                    if (LIZ3 != null) {
                        LIZ3.markSplitScreenDialogShown();
                    }
                }
            }
            InterfaceC93955aZD interfaceC93955aZD = ((PrefabEditFragment) iDCListenerS139S0100000_42.l0).LJLIL;
            if (interfaceC93955aZD != null) {
                interfaceC93955aZD.dismiss();
            }
        }
    }

    public static final void onClick$20(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        ((FaceDistortionFragment) iDCListenerS139S0100000_42.l0).Dl();
    }

    public static final void onClick$21(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        FaceDistortionFragment faceDistortionFragment = (FaceDistortionFragment) iDCListenerS139S0100000_42.l0;
        faceDistortionFragment.onEventObjectAction("save");
        LifecycleOwner viewLifecycleOwner = faceDistortionFragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94896aoO(faceDistortionFragment, null), 3);
    }

    public static final void onClick$22(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        String str;
        FaceDistortionFragment faceDistortionFragment = (FaceDistortionFragment) iDCListenerS139S0100000_42.l0;
        String str2 = "mirror";
        if (!((Boolean) faceDistortionFragment.Al().LJLLJ.getValue()).booleanValue()) {
            str = "mirror";
        } else {
            str = "unmirror";
        }
        faceDistortionFragment.onEventObjectAction(str);
        FaceDistortionViewModel Al = ((FaceDistortionFragment) iDCListenerS139S0100000_42.l0).Al();
        boolean z = !((Boolean) ((FaceDistortionFragment) iDCListenerS139S0100000_42.l0).Al().LJLLJ.getValue()).booleanValue();
        Al.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(Al), null, null, new C94898aoQ(Al, z, null), 3);
        Feature feature = Al.LJLLLLLL;
        if (feature != null) {
            if (!z) {
                str2 = "unmirror";
            }
            feature.setExtraInfo("cke_distortion_status", str2);
        }
        if (z) {
            UIAnnotationFacePoints uIAnnotationFacePoints = Al.LJLLLL;
            if (uIAnnotationFacePoints != null) {
                uIAnnotationFacePoints.symmetrization();
            }
            Al.jv0();
        }
    }

    public static final void onClick$23(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        if (C6ZT.LIZIZ(view, 500L) || !((VoiceSearchFragment) iDCListenerS139S0100000_42.l0).isResumed()) {
            return;
        }
        VoiceSearchFragment voiceSearchFragment = (VoiceSearchFragment) iDCListenerS139S0100000_42.l0;
        int i = voiceSearchFragment.Dl().getState().LJLIL;
        C188727au c188727au = new C188727au();
        c188727au.LJII(voiceSearchFragment.xl());
        c188727au.LIZLLL(i, "status");
        FMX.LJIIL("fail_button_click", c188727au.LIZ);
        if (((VoiceSearchFragment) iDCListenerS139S0100000_42.l0).Dl().getState().LJLIL == 2) {
            ((VoiceSearchFragment) iDCListenerS139S0100000_42.l0).Dl().hv0(((VoiceSearchFragment) iDCListenerS139S0100000_42.l0).vl());
            VoiceSearchFragment voiceSearchFragment2 = (VoiceSearchFragment) iDCListenerS139S0100000_42.l0;
            voiceSearchFragment2.LJZ = 2;
            voiceSearchFragment2.Il();
            return;
        }
        ((VoiceSearchFragment) iDCListenerS139S0100000_42.l0).Dl().iv0(1, false, false);
    }

    public static final void onClick$24(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        VoiceSearchContainerFragment voiceSearchContainerFragment;
        if (!C6ZT.LIZ(view)) {
            C188727au c188727au = new C188727au();
            c188727au.LJII(((VoiceSearchFragment) iDCListenerS139S0100000_42.l0).xl());
            FMX.LJIIL("song_search_button_click", c188727au.LIZ);
            VoiceSearchFragment voiceSearchFragment = (VoiceSearchFragment) iDCListenerS139S0100000_42.l0;
            voiceSearchFragment.LL = true;
            VoiceSearchViewModel Dl = voiceSearchFragment.Dl();
            XKQ xkq = Dl.LJLILLLLZI;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            Dl.LJLIL.LIZIZ(1);
            Dl.setState(C94708alM.LJLIL);
            Fragment parentFragment = ((VoiceSearchFragment) iDCListenerS139S0100000_42.l0).getParentFragment();
            if ((parentFragment instanceof VoiceSearchContainerFragment) && (voiceSearchContainerFragment = (VoiceSearchContainerFragment) parentFragment) != null) {
                voiceSearchContainerFragment.wl();
            }
        }
    }

    public static final void onClick$25(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        VoiceSearchContainerFragment voiceSearchContainerFragment;
        if (!C6ZT.LIZ(view)) {
            VoiceSearchFragment voiceSearchFragment = (VoiceSearchFragment) iDCListenerS139S0100000_42.l0;
            voiceSearchFragment.LJZL = true;
            Fragment parentFragment = voiceSearchFragment.getParentFragment();
            if ((parentFragment instanceof VoiceSearchContainerFragment) && (voiceSearchContainerFragment = (VoiceSearchContainerFragment) parentFragment) != null) {
                voiceSearchContainerFragment.vl();
                K55 k55 = voiceSearchContainerFragment.LJLJJLL;
                if (k55 != null) {
                    k55.onDismiss();
                }
            }
        }
    }

    public static final void onClick$26(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        C94506ai6 c94506ai6 = (C94506ai6) iDCListenerS139S0100000_42.l0;
        InterfaceC88472Yns<TT2DSPPlatformInfo, C76800UCe> interfaceC88472Yns = c94506ai6.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c94506ai6.LJLILLLLZI);
        }
    }

    public static final void onClick$27(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        C94507ai7 c94507ai7 = (C94507ai7) iDCListenerS139S0100000_42.l0;
        InterfaceC88472Yns<TT2DSPSongInfo, C76800UCe> interfaceC88472Yns = c94507ai7.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c94507ai7.LJLIL);
        }
    }

    public static final void onClick$3(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        InterfaceC93654aUM interfaceC93654aUM = (InterfaceC93654aUM) iDCListenerS139S0100000_42.l0;
        if (interfaceC93654aUM != null) {
            interfaceC93654aUM.onCancel();
        }
    }

    public static final void onClick$4(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        InterfaceC93654aUM interfaceC93654aUM = (InterfaceC93654aUM) iDCListenerS139S0100000_42.l0;
        if (interfaceC93654aUM != null) {
            interfaceC93654aUM.LIZ();
        }
    }

    public static final void onClick$5(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        InterfaceC93654aUM interfaceC93654aUM = (InterfaceC93654aUM) iDCListenerS139S0100000_42.l0;
        if (interfaceC93654aUM != null) {
            interfaceC93654aUM.LIZ();
        }
    }

    public static final void onClick$6(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        if (((MusicSettingPage) iDCListenerS139S0100000_42.l0).LJLJJI || C6ZT.LIZ(view)) {
            return;
        }
        SmartRouter.buildRoute(((MusicSettingPage) iDCListenerS139S0100000_42.l0).getContext(), "//music/settings/auth").open();
    }

    public static final void onClick$7(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        C94450ahC c94450ahC = (C94450ahC) iDCListenerS139S0100000_42.l0;
        C94178aco c94178aco = c94450ahC.LJLJLLL;
        if (c94178aco != null) {
            c94450ahC.LJLL.invoke(c94178aco, Integer.valueOf(c94450ahC.getAdapterPosition()));
        }
    }

    public static final void onClick$8(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        InterfaceC93955aZD interfaceC93955aZD;
        String LJFF;
        StatisticReporter LIZ;
        Feature feature = ((PrefabPanelFragment) iDCListenerS139S0100000_42.l0).Al().LJLLL;
        if (feature != null && (LJFF = C93825aX7.LJFF(feature)) != null && (LIZ = C93670aUc.LIZ()) != null) {
            LIZ.onEvent("general_effect_back", C113554cx.LJJL(new OSZ("is_ame_data", "1"), new OSZ("feature_id", LJFF)));
        }
        if (((PrefabPanelFragment) iDCListenerS139S0100000_42.l0).Al().gv0() && (interfaceC93955aZD = ((PrefabPanelFragment) iDCListenerS139S0100000_42.l0).LJLIL) != null) {
            interfaceC93955aZD.dismiss();
        }
    }

    public static final void onClick$9(IDCListenerS139S0100000_42 iDCListenerS139S0100000_42, View view) {
        String str;
        StatisticReporter LIZ;
        Feature feature = ((PrefabPanelFragment) iDCListenerS139S0100000_42.l0).Al().LJLLL;
        FeatureType featureType = null;
        if (feature != null) {
            str = C93825aX7.LJFF(feature);
        } else {
            str = null;
        }
        if (str != null && (LIZ = C93670aUc.LIZ()) != null) {
            LIZ.onEvent("general_effect_confirm", C113554cx.LJJL(new OSZ("is_ame_data", "1"), new OSZ("feature_id", str)));
        }
        if (((PrefabPanelFragment) iDCListenerS139S0100000_42.l0).Al().iv0()) {
            PrefabPanelFragment prefabPanelFragment = (PrefabPanelFragment) iDCListenerS139S0100000_42.l0;
            prefabPanelFragment.getClass();
            IStore LIZ2 = C93854aXa.LIZ();
            if (LIZ2 != null && LIZ2.shouldShowSplitScreenDialog()) {
                Feature feature2 = prefabPanelFragment.Al().LJLLL;
                if (feature2 != null) {
                    featureType = feature2.getFeatureType();
                }
                if (featureType == FeatureType.FeatureType_LegacyFeature) {
                    prefabPanelFragment.xl();
                    IStore LIZ3 = C93854aXa.LIZ();
                    if (LIZ3 != null) {
                        LIZ3.markSplitScreenDialogShown();
                    }
                }
            }
            InterfaceC93955aZD interfaceC93955aZD = ((PrefabPanelFragment) iDCListenerS139S0100000_42.l0).LJLIL;
            if (interfaceC93955aZD != null) {
                interfaceC93955aZD.dismiss();
            }
        }
    }
}
