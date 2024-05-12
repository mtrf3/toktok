package kotlin.jvm.internal;

import X.ASQ;
import X.ASX;
import X.ASY;
import X.AbstractC029409q;
import X.AbstractC65781Prl;
import X.AbstractC93937aYv;
import X.AbstractC94370afu;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C116414hZ;
import X.C16880lQ;
import X.C1B3;
import X.C25851ACp;
import X.C25859ACx;
import X.C25860ACy;
import X.C32151Nz;
import X.C36636EZk;
import X.C39557Ffl;
import X.C3C5;
import X.C48841JEv;
import X.C61447O9r;
import X.C76732zl;
import X.C76800UCe;
import X.C79863Bm;
import X.C7C3;
import X.C7EG;
import X.C86793Y4n;
import X.C8W0;
import X.C93407aQN;
import X.C93468aRM;
import X.C93643aUB;
import X.C93670aUc;
import X.C93750aVu;
import X.C93819aX1;
import X.C93825aX7;
import X.C93829aXB;
import X.C93837aXJ;
import X.C93886aY6;
import X.C93899aYJ;
import X.C93912aYW;
import X.C93926aYk;
import X.C93939aYx;
import X.C94034aaU;
import X.C94040aaa;
import X.C94048aai;
import X.C94078abC;
import X.C94177acn;
import X.C94192ad2;
import X.C94194ad4;
import X.C94277aeP;
import X.C94282aeU;
import X.C94302aeo;
import X.C94307aet;
import X.C94310aew;
import X.C94314af0;
import X.C94351afb;
import X.C94448ahA;
import X.C94452ahE;
import X.C94498ahy;
import X.C94517aiH;
import X.C94518aiI;
import X.C94550aio;
import X.C94613ajp;
import X.C94700alE;
import X.C94749am1;
import X.C94792ami;
import X.C94793amj;
import X.C94836anQ;
import X.C94855anj;
import X.C94891aoJ;
import X.C94893aoL;
import X.C94895aoN;
import X.C94897aoP;
import X.C94907aoZ;
import X.C94908aoa;
import X.C94942ap8;
import X.EnumC93477aRV;
import X.EnumC93488aRg;
import X.EnumC93620aTo;
import X.EnumC93993aZp;
import X.InterfaceC65350Pko;
import X.InterfaceC65462ha;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC93411aQR;
import X.InterfaceC93645aUD;
import X.InterfaceC93836aXI;
import X.InterfaceC93911aYV;
import X.InterfaceC93923mO;
import X.InterfaceC93942aZ0;
import X.KL2;
import X.O6R;
import X.OSZ;
import X.SY4;
import X.SYL;
import X.T2R;
import X.X1D;
import X.XJL;
import X.XKS;
import X.XKX;
import Y.IDCListenerS139S0100000_42;
import Y.IDCListenerS262S0100000_42;
import Y.IDFactoryS412S0100000_42;
import Y.IDObserverS227S0100000_42;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import com.bytedance.effectcreatormobile.behaviour.BehaviourImpl;
import com.bytedance.effectcreatormobile.behaviour.BehaviourLiveData;
import com.bytedance.effectcreatormobile.behaviour.container.BehaviourContainerFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.ActionFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.TriggerFragment;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.featurepage.FeatureFragment;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.EditViewModel;
import com.bytedance.effectcreatormobile.camera.CameraPreview;
import com.bytedance.effectcreatormobile.camera.CameraRenderLiveData;
import com.bytedance.effectcreatormobile.camera.RecorderViewModel;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionNameViewModel;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;
import com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.bytedance.effectcreatormobile.modelselect.ModelSelectFragment;
import com.bytedance.effectcreatormobile.modelselect.model.ModelViewModel;
import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;
import com.bytedance.effectcreatormobile.objectselect.EffectSelectFragment;
import com.bytedance.effectcreatormobile.objectselect.ObjectSelectFragment;
import com.bytedance.effectcreatormobile.objectselect.StickerFragment;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;
import com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectLiveData;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabContainerFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPageFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.edit.PrefabEditFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.edit.PrefabEditViewModel;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EEStdFeatureList;
import com.bytedance.ies.effectcreator.swig.EEStdUIAnnotationBaseList;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureManager;
import com.bytedance.ies.effectcreator.swig.Model;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBool;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFloat;
import com.bytedance.ies.effectcreator.swig.UIAnnotationPulse;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.InputDspPlaylistSheetFragment;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.MusicDspSheetAssem;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.MusicDspSheetDialogFragment;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell.MusicDspAwemeCell;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell.MusicDspPlaylistCell;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicSettingPage;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.MusicRecognitionFragment;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui.VoiceSearchFragment;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.ui.VoiceSearchLanguageSettingFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ugc.effectcreator.canvas.CanvasViewModel;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import com.ugc.effectcreator.layer.LayerViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes34.dex */
public class IDqS423S0100000_42 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$0();
            case 2:
                return invoke$1();
            case 3:
                return invoke$2();
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$3();
            case 15:
                return invoke$4();
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$5();
            case 22:
                return invoke$6();
            case 23:
                return invoke$7();
            case 24:
                return invoke$8();
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$9();
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$10();
            case 34:
                return invoke$11();
            case 35:
                return invoke$35(this);
            case 36:
                return invoke$12();
            case 37:
                return invoke$13();
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$14();
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$15();
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$16();
            case 46:
                return invoke$17();
            case 47:
                return invoke$18();
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this);
            case C61447O9r.LJIIJ:
                return invoke$49(this);
            case 50:
                return invoke$50(this);
            case 51:
                return invoke$19();
            case 52:
                return invoke$20();
            case 53:
                return invoke$21();
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$22();
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return invoke$85(this);
            case 86:
                return invoke$23();
            case 87:
                return invoke$24();
            case 88:
                return invoke$25();
            case 89:
                return invoke$26();
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$27();
            case 93:
                return invoke$28();
            case 94:
                return invoke$29();
            case 95:
                return invoke$30();
            case 96:
                return invoke$31();
            case 97:
                return invoke$32();
            case 98:
                return invoke$33();
            case 99:
                return invoke$34();
            case 100:
                return invoke$35();
            case 101:
                return invoke$36();
            case 102:
                return invoke$37();
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$38();
            case 108:
                return invoke$39();
            case 109:
                return invoke$40();
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$41();
            case 113:
                return invoke$42();
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                return invoke$120(this);
            case 121:
                return invoke$121(this);
            case 122:
                return invoke$122(this);
            case 123:
                return invoke$123(this);
            case 124:
                return invoke$124(this);
            case 125:
                return invoke$125(this);
            case 126:
                return invoke$126(this);
            case 127:
                return invoke$127(this);
            case 128:
                return invoke$128(this);
            case 129:
                return invoke$129(this);
            case 130:
                return invoke$130(this);
            case 131:
                return invoke$131(this);
            case 132:
                return invoke$132(this);
            case 133:
                return invoke$133(this);
            case 134:
                return invoke$134(this);
            case 135:
                return invoke$135(this);
            case 136:
                return invoke$136(this);
            case 137:
                return invoke$137(this);
            case 138:
                return invoke$138(this);
            case 139:
                return invoke$139(this);
            case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                return invoke$140(this);
            case 141:
                return invoke$141(this);
            case 142:
                return invoke$142(this);
            case 143:
                return invoke$143(this);
            case 144:
                return invoke$144(this);
            case 145:
                return invoke$145(this);
            case 146:
                return invoke$146(this);
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$148(this);
            case 149:
                return invoke$149(this);
            case 150:
                return invoke$150(this);
            case 151:
                return invoke$151(this);
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$153(this);
            case 154:
                return invoke$154(this);
            case 155:
                return invoke$45();
            case 156:
                return invoke$156(this);
            case 157:
                return invoke$157(this);
            case 158:
                return invoke$158(this);
            case 159:
                return invoke$159(this);
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            default:
                return null;
        }
    }

    public final ViewModelStore invoke$0() {
        ActivityC45651qj requireActivity = ((Fragment) this.l0).requireActivity();
        o.LJFF(requireActivity, "requireActivity()");
        ViewModelStore viewModelStore = requireActivity.getViewModelStore();
        o.LJFF(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }

    public final Fragment invoke$1() {
        return (Fragment) this.l0;
    }

    public final Fragment invoke$10() {
        return (Fragment) this.l0;
    }

    public final ViewModelStore invoke$11() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final Fragment invoke$12() {
        return (Fragment) this.l0;
    }

    public final ViewModelStore invoke$13() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final ViewModelStore invoke$14() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final ViewModelStore invoke$15() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final Fragment invoke$16() {
        return (Fragment) this.l0;
    }

    public final ViewModelStore invoke$17() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final ViewModelStore invoke$18() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final ViewModelStore invoke$19() {
        ActivityC45651qj requireActivity = ((Fragment) this.l0).requireActivity();
        o.LJFF(requireActivity, "requireActivity()");
        ViewModelStore viewModelStore = requireActivity.getViewModelStore();
        o.LJFF(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }

    public final ViewModelStore invoke$2() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final Fragment invoke$20() {
        return (Fragment) this.l0;
    }

    public final ViewModelStore invoke$21() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final ViewModelStore invoke$28() {
        ViewModelStore viewModelStore = C86793Y4n.LJIL(((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner()).getViewModelStore();
        o.LJIIIIZZ(viewModelStore, "getFragmentForAssemVm(ge…leOwner()).viewModelStore");
        return viewModelStore;
    }

    public final C7C3 invoke$29() {
        Fragment LJIL = C86793Y4n.LJIL(((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner());
        ActivityC45651qj mo49getActivity = LJIL.mo49getActivity();
        if (mo49getActivity == null) {
            return null;
        }
        return C7EG.LIZ(mo49getActivity).jv0(LJIL);
    }

    public final ViewModelStore invoke$3() {
        ActivityC45651qj requireActivity = ((Fragment) this.l0).requireActivity();
        o.LJFF(requireActivity, "requireActivity()");
        ViewModelStore viewModelStore = requireActivity.getViewModelStore();
        o.LJFF(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }

    public final LifecycleOwner invoke$30() {
        if (((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner() instanceof C8W0) {
            LifecycleOwner currentLifeCycleOwner = ((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner();
            o.LJII(currentLifeCycleOwner, "null cannot be cast to non-null type com.bytedance.assem.arch.core.Assem");
            return currentLifeCycleOwner;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final ViewModelStore invoke$31() {
        if (((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner() instanceof C8W0) {
            LifecycleOwner currentLifeCycleOwner = ((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner();
            o.LJII(currentLifeCycleOwner, "null cannot be cast to non-null type com.bytedance.assem.arch.core.Assem");
            return ((C8W0) currentLifeCycleOwner).getViewModelStore();
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final ViewModelProvider.Factory invoke$32() {
        if (((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner() instanceof C8W0) {
            LifecycleOwner currentLifeCycleOwner = ((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner();
            o.LJII(currentLifeCycleOwner, "null cannot be cast to non-null type com.bytedance.assem.arch.core.Assem");
            return ((C8W0) currentLifeCycleOwner).getDefaultViewModelProviderFactory();
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public final LifecycleOwner invoke$34() {
        return C86793Y4n.LJIJJLI(((InterfaceC93923mO) this.l0).getContext());
    }

    public final ViewModelStore invoke$35() {
        ViewModelStore viewModelStore = C86793Y4n.LJIJJLI(((InterfaceC93923mO) this.l0).getContext()).getViewModelStore();
        o.LJIIIIZZ(viewModelStore, "getFragmentActivityForAs…Context()).viewModelStore");
        return viewModelStore;
    }

    public final C7C3 invoke$36() {
        ActivityC45651qj LJIJJLI = C86793Y4n.LJIJJLI(((InterfaceC93923mO) this.l0).getContext());
        return C7EG.LIZ(LJIJJLI).jv0(LJIJJLI);
    }

    public final LifecycleOwner invoke$37() {
        return C86793Y4n.LJIL(((InterfaceC93923mO) this.l0).getCurrentLifeCycleOwner());
    }

    public final Fragment invoke$39() {
        return (Fragment) this.l0;
    }

    public final ViewModelStore invoke$4() {
        ActivityC45651qj requireActivity = ((Fragment) this.l0).requireActivity();
        o.LJFF(requireActivity, "requireActivity()");
        ViewModelStore viewModelStore = requireActivity.getViewModelStore();
        o.LJFF(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }

    public final ViewModelStore invoke$40() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final Fragment invoke$41() {
        return (Fragment) this.l0;
    }

    public final ViewModelStore invoke$42() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final void invoke$43() {
        InterfaceC93911aYV interfaceC93911aYV = ((C94700alE) this.l0).LJLJI;
        if (interfaceC93911aYV != null) {
            interfaceC93911aYV.LIZ();
        }
        C94700alE c94700alE = (C94700alE) this.l0;
        C16880lQ.LJLLL(c94700alE.LJLJJI, c94700alE.LJLIL.LIZIZ);
    }

    public final void invoke$44() {
        ((C94700alE) ((IDqS423S0100000_42) this.l0).l0).LJLJI.LIZ();
        C94700alE c94700alE = (C94700alE) ((IDqS423S0100000_42) this.l0).l0;
        C16880lQ.LJLLL(c94700alE.LJLJJI, c94700alE.LJLIL.LIZIZ);
    }

    public final Effect[] invoke$45() {
        return new Effect[((InterfaceC65462ha[]) this.l0).length];
    }

    public final ViewModelStore invoke$5() {
        ActivityC45651qj requireActivity = ((Fragment) this.l0).requireActivity();
        o.LJFF(requireActivity, "requireActivity()");
        ViewModelStore viewModelStore = requireActivity.getViewModelStore();
        o.LJFF(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }

    public final ViewModelStore invoke$6() {
        ActivityC45651qj requireActivity = ((Fragment) this.l0).requireActivity();
        o.LJFF(requireActivity, "requireActivity()");
        ViewModelStore viewModelStore = requireActivity.getViewModelStore();
        o.LJFF(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }

    public final Fragment invoke$7() {
        return (Fragment) this.l0;
    }

    public final ViewModelStore invoke$8() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((InterfaceC65784Pro) this.l0).invoke()).getViewModelStore();
        o.LJFF(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }

    public final String invoke$22() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$23() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$24() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$25() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$26() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$27() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$33() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$38() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final InterfaceC93645aUD invoke$9() {
        InterfaceC93645aUD provideStatusPage;
        provideStatusPage = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Large);
        LayoutInflater LLZIL = C16880lQ.LLZIL(((EffectSelectFragment) this.l0).getContext());
        C94040aaa c94040aaa = ((EffectSelectFragment) this.l0).LJLILLLLZI;
        if (c94040aaa != null) {
            FrameLayout frameLayout = c94040aaa.LJLJI;
            o.LJIIIIZZ(frameLayout, "binding.loadingContainer");
            provideStatusPage.LIZ(LLZIL, frameLayout);
            return provideStatusPage;
        }
        o.LJIJI("binding");
        throw null;
    }

    public static final Object invoke$0(IDqS423S0100000_42 iDqS423S0100000_42) {
        ViewModelProvider.Factory defaultViewModelProviderFactory = ((Fragment) iDqS423S0100000_42.l0).getDefaultViewModelProviderFactory();
        o.LJFF(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }

    public static final Object invoke$10(IDqS423S0100000_42 iDqS423S0100000_42) {
        Fragment parentFragment = ((TriggerFragment) iDqS423S0100000_42.l0).getParentFragment();
        if (parentFragment != null) {
            return new ViewModelProvider(parentFragment).get(EditViewModel.class);
        }
        return null;
    }

    public static final Object invoke$103(IDqS423S0100000_42 iDqS423S0100000_42) {
        String string;
        Bundle arguments = ((VoiceSearchLanguageSettingFragment) iDqS423S0100000_42.l0).getArguments();
        if (arguments == null || (string = arguments.getString("current_cluster")) == null) {
            return "";
        }
        return string;
    }

    public static final Object invoke$104(IDqS423S0100000_42 iDqS423S0100000_42) {
        Bundle arguments = ((VoiceSearchLanguageSettingFragment) iDqS423S0100000_42.l0).getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("mob");
        }
        if (!(serializable instanceof HashMap) || serializable == null) {
            return new HashMap();
        }
        return serializable;
    }

    public static final Object invoke$105(IDqS423S0100000_42 iDqS423S0100000_42) {
        String string;
        Bundle arguments = ((VoiceSearchLanguageSettingFragment) iDqS423S0100000_42.l0).getArguments();
        if (arguments == null || (string = arguments.getString("key_random")) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VoiceSearchLanguageSetting");
            LIZ.append(System.currentTimeMillis());
            return X1D.LIZIZ(LIZ);
        }
        return string;
    }

    public static final Object invoke$106(IDqS423S0100000_42 iDqS423S0100000_42) {
        Object randomKey = ((VoiceSearchLanguageSettingFragment) iDqS423S0100000_42.l0).LJLJI.getValue();
        o.LJIIIIZZ(randomKey, "randomKey");
        return randomKey;
    }

    public static final Object invoke$11(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((BehaviourEditFragment) ((IDqS196S0200000_42) iDqS423S0100000_42.l0).l0).Ol(true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$110(IDqS423S0100000_42 iDqS423S0100000_42) {
        CKEffectEditorContext.LJIIIIZZ.observeForever(((CanvasViewModel) iDqS423S0100000_42.l0).LJLJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$111(IDqS423S0100000_42 iDqS423S0100000_42) {
        C94613ajp c94613ajp = (C94613ajp) iDqS423S0100000_42.l0;
        c94613ajp.LLLFF = null;
        c94613ajp.LLLF = EnumC93620aTo.Showing;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$114(IDqS423S0100000_42 iDqS423S0100000_42) {
        C94855anj c94855anj = new C94855anj(((EffectLayerEditorFragment) iDqS423S0100000_42.l0).getData());
        c94855anj.LLFF(false);
        return c94855anj;
    }

    public static final Object invoke$115(IDqS423S0100000_42 iDqS423S0100000_42) {
        C93468aRM.LIZ(C93939aYx.LIZ(), new C94177acn(iDqS423S0100000_42), 3, 4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$116(IDqS423S0100000_42 iDqS423S0100000_42) {
        BehaviourImpl LIZIZ = C94048aai.LIZIZ();
        LiveData<EnumC93993aZp> liveData = null;
        if (LIZIZ != null) {
            liveData = LIZIZ.getPanelStateLiveData();
        }
        if ((liveData instanceof BehaviourLiveData) && liveData != null) {
            liveData.postValue(EnumC93993aZp.Hide);
        }
        FragmentManager fragmentManager = ((BehaviourContainerFragment) iDqS423S0100000_42.l0).getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIJJI(R.anim.i1, R.anim.i5, 0, 0);
            c1b3.LJJI((BehaviourContainerFragment) iDqS423S0100000_42.l0);
            c1b3.LJI();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$117(IDqS423S0100000_42 iDqS423S0100000_42) {
        XJL xjl = (XJL) iDqS423S0100000_42.l0;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
        return c76800UCe;
    }

    public static final Object invoke$118(IDqS423S0100000_42 iDqS423S0100000_42) {
        Feature feature;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            feature = LJI.LJFF(((PrefabEditViewModel) iDqS423S0100000_42.l0).LJLJI);
        } else {
            feature = null;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope((PrefabEditViewModel) iDqS423S0100000_42.l0), null, null, new C94836anQ(iDqS423S0100000_42, feature, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$119(IDqS423S0100000_42 iDqS423S0100000_42) {
        AbstractC94370afu value = ((BehaviourEditFragment) iDqS423S0100000_42.l0).Ll().LJLILLLLZI.LIZ.getValue();
        if (value != null) {
            ((BehaviourEditFragment) iDqS423S0100000_42.l0).Ql(value);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((BehaviourEditFragment) ((IDqS196S0200000_42) iDqS423S0100000_42.l0).l0).Ol(false);
        ((BehaviourEditFragment) ((IDqS196S0200000_42) iDqS423S0100000_42.l0).l0).startPostponedEnterTransition();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$120(IDqS423S0100000_42 iDqS423S0100000_42) {
        RecyclerView recyclerView;
        AbstractC029409q adapter;
        RecyclerView recyclerView2;
        AbstractC029409q adapter2;
        C94192ad2 Al = ((FeatureFragment) iDqS423S0100000_42.l0).Al();
        if (Al != null && (recyclerView2 = Al.LJLJJI) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
            ((FeatureFragment) iDqS423S0100000_42.l0).getClass();
            adapter2.notifyItemRangeChanged(0, adapter2.getItemCount());
        }
        C94192ad2 Al2 = ((FeatureFragment) iDqS423S0100000_42.l0).Al();
        if (Al2 != null && (recyclerView = Al2.LJLJJL) != null && (adapter = recyclerView.getAdapter()) != null) {
            ((FeatureFragment) iDqS423S0100000_42.l0).getClass();
            adapter.notifyItemRangeChanged(0, adapter.getItemCount());
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$121(IDqS423S0100000_42 iDqS423S0100000_42) {
        RecyclerView recyclerView;
        AbstractC029409q adapter;
        C94194ad4 c94194ad4 = (C94194ad4) ((BehaviourPreviewFragment) iDqS423S0100000_42.l0).Al();
        if (c94194ad4 != null && (recyclerView = c94194ad4.LJLJI) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$122(IDqS423S0100000_42 iDqS423S0100000_42) {
        boolean z;
        UIAnnotationBase uiAnnotationAccordingName = ((Feature) iDqS423S0100000_42.l0).getUiAnnotationAccordingName("init_feature");
        if (uiAnnotationAccordingName != null) {
            UIAnnotationBool dynamicCast = UIAnnotationBool.dynamicCast((Element) uiAnnotationAccordingName);
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null) {
                z = LJI.LJII();
            } else {
                z = false;
            }
            dynamicCast.updateValue(z);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$123(IDqS423S0100000_42 iDqS423S0100000_42) {
        InterfaceC93836aXI interfaceC93836aXI = ((C93837aXJ) iDqS423S0100000_42.l0).LIZLLL;
        if (interfaceC93836aXI != null) {
            interfaceC93836aXI.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$124(IDqS423S0100000_42 iDqS423S0100000_42) {
        InterfaceC93836aXI interfaceC93836aXI = ((C93837aXJ) iDqS423S0100000_42.l0).LIZLLL;
        if (interfaceC93836aXI != null) {
            interfaceC93836aXI.LIZIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$125(IDqS423S0100000_42 iDqS423S0100000_42) {
        InterfaceC93836aXI interfaceC93836aXI = ((C93837aXJ) iDqS423S0100000_42.l0).LIZLLL;
        if (interfaceC93836aXI != null) {
            interfaceC93836aXI.LIZIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$126(IDqS423S0100000_42 iDqS423S0100000_42) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((C94277aeP) iDqS423S0100000_42.l0).LJLIL.element;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        C94277aeP c94277aeP = (C94277aeP) iDqS423S0100000_42.l0;
        c94277aeP.LJLIL.element = null;
        MessageCenter.removeListener(c94277aeP);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$127(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((C94282aeU) iDqS423S0100000_42.l0).LIZ(1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$128(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((C94282aeU) iDqS423S0100000_42.l0).LIZ(3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$129(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((EffectLayerEditorFragment) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).xl().iv0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS423S0100000_42 iDqS423S0100000_42) {
        Fragment parentFragment = ((FeatureFragment) iDqS423S0100000_42.l0).getParentFragment();
        if (parentFragment != null) {
            return new ViewModelProvider(parentFragment).get(EditViewModel.class);
        }
        return null;
    }

    public static final Object invoke$130(IDqS423S0100000_42 iDqS423S0100000_42) {
        C94302aeo.LJLIL.LJIIJJI((DspAuthParam) iDqS423S0100000_42.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$131(IDqS423S0100000_42 iDqS423S0100000_42) {
        C94302aeo.LJLIL.LJIIJJI((DspAuthParam) iDqS423S0100000_42.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$132(IDqS423S0100000_42 iDqS423S0100000_42) {
        C94302aeo.LJLIL.LJIIJJI((DspAuthParam) iDqS423S0100000_42.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$133(IDqS423S0100000_42 iDqS423S0100000_42) {
        C93407aQN.LIZ("ve_env_ready");
        CameraPreview cameraPreview = (CameraPreview) iDqS423S0100000_42.l0;
        cameraPreview.getClass();
        CKEffectEditorContext.LJIIIZ.observe(cameraPreview.getViewLifecycleOwner(), new IDObserverS227S0100000_42(cameraPreview, 29));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$134(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((CameraPreview) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).getClass();
        CameraPreview.Ll();
        ((CameraPreview) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).Kl(true, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$135(IDqS423S0100000_42 iDqS423S0100000_42) {
        AbstractC93937aYv abstractC93937aYv;
        Canvas LJ;
        CameraRenderLiveData<AbstractC93937aYv> renderModeData;
        CameraPreview cameraPreview = (CameraPreview) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0;
        CameraRenderImpl LIZ = C93899aYJ.LIZ();
        if (LIZ != null && (renderModeData = LIZ.getRenderModeData()) != null) {
            abstractC93937aYv = renderModeData.getValue();
        } else {
            abstractC93937aYv = null;
        }
        cameraPreview.LJLJLLL = abstractC93937aYv;
        ((CameraPreview) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).getClass();
        CameraPreview.Ll();
        CKEffectEditorContext.LJIILJJIL(null);
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJ = LJI.LJ()) != null) {
            LJ.stopAnimation();
        }
        ((CameraPreview) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).Kl(false, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$136(IDqS423S0100000_42 iDqS423S0100000_42) {
        long effectHandler = ((CameraPreview) iDqS423S0100000_42.l0).xl().LJ().LIZIZ.getEffectHandler();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("effectHandler: ");
        LIZ.append(effectHandler);
        C94034aaU.LIZ("CameraPreview", X1D.LIZIZ(LIZ));
        return Long.valueOf(effectHandler);
    }

    public static final Object invoke$137(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((CameraPreview) iDqS423S0100000_42.l0).Kl(true, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$138(IDqS423S0100000_42 iDqS423S0100000_42) {
        if (((XJL) iDqS423S0100000_42.l0).isActive()) {
            XJL xjl = (XJL) iDqS423S0100000_42.l0;
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            xjl.resumeWith(c76800UCe);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$139(IDqS423S0100000_42 iDqS423S0100000_42) {
        iDqS423S0100000_42.invoke$43();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$140(IDqS423S0100000_42 iDqS423S0100000_42) {
        iDqS423S0100000_42.invoke$44();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$141(IDqS423S0100000_42 iDqS423S0100000_42) {
        C94700alE c94700alE = (C94700alE) iDqS423S0100000_42.l0;
        C93912aYW c93912aYW = c94700alE.LJLIL.LIZ;
        View view = c94700alE.LJLJJI;
        IDqS423S0100000_42 iDqS423S0100000_422 = new IDqS423S0100000_42(iDqS423S0100000_42, UserLevelGeckoUpdateSetting.DEFAULT);
        c93912aYW.getClass();
        C93912aYW.LIZ(view, iDqS423S0100000_422);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$142(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((MainFragment) iDqS423S0100000_42.l0).Ol().jv0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$143(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((C94908aoa) iDqS423S0100000_42.l0).LJLILLLLZI.Ol().jv0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$144(IDqS423S0100000_42 iDqS423S0100000_42) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("cke_technology_loading_watch", C113554cx.LJJL(new OSZ("stage", C93407aQN.LIZJ), new OSZ("keep_time", String.valueOf(System.currentTimeMillis() - C93407aQN.LIZIZ)), new OSZ("flag", "finish")));
        }
        Handler handler = C93407aQN.LIZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C93407aQN.LIZ = null;
        ((MainFragment) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).Ol().getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("-- loadingview isDraftUpgrading = ");
        LIZ2.append(false);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ2));
        ((MainFragment) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).LJLILLLLZI.stopLoading();
        ((MainFragment) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).Wl(true);
        LifecycleOwner viewLifecycleOwner = ((MainFragment) ((IDObserverS227S0100000_42) iDqS423S0100000_42.l0).l0).getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94907aoZ(iDqS423S0100000_42, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$145(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((MainFragment) iDqS423S0100000_42.l0).LJLLLL.LIZ = false;
        CKEffectEditorContext.LJIILJJIL(null);
        ((MainFragment) iDqS423S0100000_42.l0).Ll().jv0();
        LifecycleOwner viewLifecycleOwner = ((MainFragment) iDqS423S0100000_42.l0).getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94942ap8(iDqS423S0100000_42, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$146(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((MainFragment) iDqS423S0100000_42.l0).requireActivity().finish();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$147(IDqS423S0100000_42 iDqS423S0100000_42) {
        ModelViewModel xl = ((ModelSelectFragment) ((IDqS419S0100000_42) iDqS423S0100000_42.l0).l0).xl();
        Context requireContext = ((ModelSelectFragment) ((IDqS419S0100000_42) iDqS423S0100000_42.l0).l0).requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        xl.jv0(requireContext, ((ModelSelectFragment) ((IDqS419S0100000_42) iDqS423S0100000_42.l0).l0).LJLJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$148(IDqS423S0100000_42 iDqS423S0100000_42) {
        ModelViewModel xl = ((ModelSelectFragment) ((IDqS419S0100000_42) iDqS423S0100000_42.l0).l0).xl();
        Context requireContext = ((ModelSelectFragment) ((IDqS419S0100000_42) iDqS423S0100000_42.l0).l0).requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        xl.jv0(requireContext, ((ModelSelectFragment) ((IDqS419S0100000_42) iDqS423S0100000_42.l0).l0).LJLJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$149(IDqS423S0100000_42 iDqS423S0100000_42) {
        ASQ.LJ((InputDspPlaylistSheetFragment) iDqS423S0100000_42.l0, ASX.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$150(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((SY4) ((InputDspPlaylistSheetFragment) iDqS423S0100000_42.l0)._$_findCachedViewById(R.id.kpl)).setLoading(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$151(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((C94351afb) iDqS423S0100000_42.l0).LIZIZ(1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$152(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((C94351afb) iDqS423S0100000_42.l0).LIZIZ(3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$153(IDqS423S0100000_42 iDqS423S0100000_42) {
        Object value = ((MusicDspPlaylistCell) iDqS423S0100000_42.l0).LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-loadingCircle>(...)");
        ((C116414hZ) value).setVisibility(8);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$154(IDqS423S0100000_42 iDqS423S0100000_42) {
        Object value = ((MusicDspPlaylistCell) iDqS423S0100000_42.l0).LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-loadingCircle>(...)");
        ((C116414hZ) value).setVisibility(0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$156(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((LiquefyFragment) ((IDCListenerS262S0100000_42) iDqS423S0100000_42.l0).l0).LJLJJL = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$157(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((LiquefyFragment) iDqS423S0100000_42.l0).LJLJJL = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$158(IDqS423S0100000_42 iDqS423S0100000_42) {
        EEStdUIAnnotationBaseList uiAnnotations = ((C94518aiI) iDqS423S0100000_42.l0).LIZJ.getUiAnnotations();
        o.LJIIIIZZ(uiAnnotations, "feature.uiAnnotations");
        Iterator<UIAnnotationBase> it = uiAnnotations.iterator();
        while (it.hasNext()) {
            UIAnnotationBase it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            String name = it2.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -868933960) {
                    if (hashCode != 1333635459) {
                        if (hashCode == 1772474389 && name.equals("liquify_face_tracking")) {
                            ((C94518aiI) iDqS423S0100000_42.l0).LJIIIIZZ = UIAnnotationBool.dynamicCast((Element) it2);
                        }
                    } else if (name.equals("liquify_mirror")) {
                        ((C94518aiI) iDqS423S0100000_42.l0).LJII = UIAnnotationBool.dynamicCast((Element) it2);
                    }
                } else if (name.equals("select_liquify")) {
                    ((C94518aiI) iDqS423S0100000_42.l0).LJIIIZ = UIAnnotationPulse.dynamicCast((Element) it2);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$159(IDqS423S0100000_42 iDqS423S0100000_42) {
        XJL xjl = (XJL) iDqS423S0100000_42.l0;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
        return c76800UCe;
    }

    public static final Object invoke$16(IDqS423S0100000_42 iDqS423S0100000_42) {
        CameraPreview cameraPreview = (CameraPreview) iDqS423S0100000_42.l0;
        cameraPreview.getClass();
        return new C94307aet(cameraPreview);
    }

    public static final Object invoke$160(IDqS423S0100000_42 iDqS423S0100000_42) {
        ActivityC45651qj mo49getActivity = ((MusicAuthPlatformsSettingPage) iDqS423S0100000_42.l0).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$161(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((MusicAuthPlatformsSettingPage) iDqS423S0100000_42.l0).Gl();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS423S0100000_42 iDqS423S0100000_42) {
        View view = ((CameraPreview) iDqS423S0100000_42.l0).LJLILLLLZI;
        if (view != null) {
            return view.findViewById(R.id.noh);
        }
        o.LJIJI("root");
        throw null;
    }

    public static final Object invoke$18(IDqS423S0100000_42 iDqS423S0100000_42) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS423S0100000_42.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((CameraPreview) iDqS423S0100000_42.l0).Dl();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((RecorderViewModel) ((CameraPreview) iDqS423S0100000_42.l0).LJLJI.getValue()).LJLIL;
    }

    public static final Object invoke$25(IDqS423S0100000_42 iDqS423S0100000_42) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FaceDistortionFragment faceDistortionFragment = (FaceDistortionFragment) iDqS423S0100000_42.l0;
        C94314af0 c94314af0 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af0);
        c94314af0.LJLJL.setGuidelineBegin(KL2.LJIIL(faceDistortionFragment.requireContext()));
        o.LJIIIIZZ(ViewConfiguration.get(faceDistortionFragment.getContext()), "ViewConfiguration.get(context)");
        faceDistortionFragment.LJLLL = r1.getScaledEdgeSlop();
        InterfaceC93411aQR interfaceC93411aQR = faceDistortionFragment.LJLLILLLL;
        LayoutInflater layoutInflater = faceDistortionFragment.getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "layoutInflater");
        C94314af0 c94314af02 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af02);
        FrameLayout frameLayout = c94314af02.LJLJLLL;
        o.LJIIIIZZ(frameLayout, "binding.maskView");
        interfaceC93411aQR.LIZ(layoutInflater, frameLayout);
        InterfaceC93645aUD interfaceC93645aUD = faceDistortionFragment.LJLLJ;
        LayoutInflater layoutInflater2 = faceDistortionFragment.getLayoutInflater();
        o.LJIIIIZZ(layoutInflater2, "layoutInflater");
        C94314af0 c94314af03 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af03);
        FrameLayout frameLayout2 = c94314af03.LJLJLLL;
        o.LJIIIIZZ(frameLayout2, "binding.maskView");
        interfaceC93645aUD.LIZ(layoutInflater2, frameLayout2);
        faceDistortionFragment.LJLLJ.LIZIZ(new IDqS419S0100000_42(faceDistortionFragment, 79));
        ActivityC45651qj mo49getActivity = faceDistortionFragment.mo49getActivity();
        if (mo49getActivity != null && (onBackPressedDispatcher = mo49getActivity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(faceDistortionFragment.getViewLifecycleOwner(), faceDistortionFragment.LJLZ);
        }
        C94314af0 c94314af04 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af04);
        c94314af04.LJLJLJ.setPointActionCallback(new C94310aew(faceDistortionFragment));
        C94314af0 c94314af05 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af05);
        C16880lQ.LJIJI(c94314af05.LJLILLLLZI, new IDCListenerS139S0100000_42(faceDistortionFragment, 20));
        C94314af0 c94314af06 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af06);
        C16880lQ.LJIJI(c94314af06.LJLJJL, new IDCListenerS139S0100000_42(faceDistortionFragment, 21));
        C94314af0 c94314af07 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af07);
        LinearLayout linearLayout = c94314af07.LJLJJI;
        o.LJIIIIZZ(linearLayout, "binding.btnReset");
        C93750aVu.LIZ(linearLayout, 800L, new IDqS419S0100000_42(faceDistortionFragment, 80));
        C94314af0 c94314af08 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af08);
        C16880lQ.LJIIZILJ(c94314af08.LJLJI, new IDCListenerS139S0100000_42(faceDistortionFragment, 22));
        C93886aY6 xl = faceDistortionFragment.xl();
        C94314af0 c94314af09 = faceDistortionFragment.LJLIL;
        o.LJI(c94314af09);
        TextureView textureView = c94314af09.LJLL;
        o.LJIIIIZZ(textureView, "binding.textureView");
        xl.LIZIZ(textureView);
        faceDistortionFragment.LJLLLLLL = !faceDistortionFragment.xl().LJIIJJI;
        faceDistortionFragment.xl().LJFF(true);
        FaceDistortionFragment faceDistortionFragment2 = (FaceDistortionFragment) iDqS423S0100000_42.l0;
        C79863Bm c79863Bm = faceDistortionFragment2.Al().LJLJLLL;
        LifecycleOwner viewLifecycleOwner = faceDistortionFragment2.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        Lifecycle.State state = Lifecycle.State.STARTED;
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94891aoJ(c79863Bm, viewLifecycleOwner, state, null, faceDistortionFragment2), 3);
        C79863Bm c79863Bm2 = faceDistortionFragment2.Al().LJLLI;
        LifecycleOwner viewLifecycleOwner2 = faceDistortionFragment2.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner2, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C94893aoL(c79863Bm2, viewLifecycleOwner2, state, null, faceDistortionFragment2), 3);
        C79863Bm c79863Bm3 = faceDistortionFragment2.Al().LJLLJ;
        LifecycleOwner viewLifecycleOwner3 = faceDistortionFragment2.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner3, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C94895aoN(c79863Bm3, viewLifecycleOwner3, state, null, faceDistortionFragment2), 3);
        FaceDistortionViewModel Al = ((FaceDistortionFragment) iDqS423S0100000_42.l0).Al();
        Long wl = ((FaceDistortionFragment) iDqS423S0100000_42.l0).wl();
        Al.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(Al), null, null, new C94897aoP(Al, wl, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((RecorderViewModel) ((FaceDistortionFragment) iDqS423S0100000_42.l0).LJLJLLL.getValue()).LJLIL;
    }

    public static final Object invoke$27(IDqS423S0100000_42 iDqS423S0100000_42) {
        long j;
        C93886aY6 xl = ((FaceDistortionFragment) iDqS423S0100000_42.l0).xl();
        FaceDistortionFragment faceDistortionFragment = (FaceDistortionFragment) iDqS423S0100000_42.l0;
        String str = faceDistortionFragment.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        String str2 = faceDistortionFragment.LJLJI;
        if (str2 == null) {
            str2 = "";
        }
        String LJIILLIIL = o.LJIILLIIL(Integer.valueOf(((FaceDistortionNameViewModel) faceDistortionFragment.LJLJLJ.getValue()).LJLIL), faceDistortionFragment.LJLJJI);
        FaceDistortionFragment faceDistortionFragment2 = (FaceDistortionFragment) iDqS423S0100000_42.l0;
        String str3 = faceDistortionFragment2.LJLJJL;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = faceDistortionFragment2.LJLJJLL;
        if (str4 == null) {
            str4 = "";
        }
        Long l = faceDistortionFragment2.LJLJL;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        return new C94498ahy(xl, str, str2, LJIILLIIL, str3, str4, j);
    }

    public static final Object invoke$28(IDqS423S0100000_42 iDqS423S0100000_42) {
        C94078abC c94078abC = (C94078abC) iDqS423S0100000_42.l0;
        C76732zl c76732zl = c94078abC.LIZIZ;
        int i = c76732zl.element - 1;
        c76732zl.element = i;
        if (i <= 0) {
            c94078abC.LIZ.getFrameCallBacks().remove((C94078abC) iDqS423S0100000_42.l0);
            ((C94078abC) iDqS423S0100000_42.l0).LIZ.getAssistCallbackMap().remove(((C94078abC) iDqS423S0100000_42.l0).LIZJ);
            ((C94078abC) iDqS423S0100000_42.l0).LIZ.getFrameCallBacks().remove(((C94078abC) iDqS423S0100000_42.l0).LIZJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((InterfaceC93942aZ0) iDqS423S0100000_42.l0).LIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(IDqS423S0100000_42 iDqS423S0100000_42) {
        String str;
        Bundle arguments = ((AssetsFragment) iDqS423S0100000_42.l0).getArguments();
        if (arguments == null || (str = arguments.getString("loki_panel_key")) == null) {
            str = "";
        }
        String Gl = ((AssetsFragment) iDqS423S0100000_42.l0).Gl();
        StickerFragment stickerFragment = new StickerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("loki_panel_key", str);
        bundle.putString("key_effect_category", Gl);
        stickerFragment.setArguments(bundle);
        return stickerFragment;
    }

    public static final Object invoke$32(IDqS423S0100000_42 iDqS423S0100000_42) {
        LiveData<EnumC93488aRg> liveData;
        IObjectSelect LIZIZ = C93819aX1.LIZIZ();
        if (LIZIZ != null) {
            liveData = LIZIZ.getPanelStateLiveData();
        } else {
            liveData = null;
        }
        if ((liveData instanceof ObjectSelectLiveData) && liveData != null) {
            liveData.setValue(EnumC93488aRg.DISMISS);
        }
        FragmentManager fragmentManager = ((ObjectSelectFragment) iDqS423S0100000_42.l0).getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJJLIIIJJIZ(0, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(IDqS423S0100000_42 iDqS423S0100000_42) {
        String str;
        String string;
        Bundle arguments = ((StickerFragment) iDqS423S0100000_42.l0).getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("loki_panel_key")) == null) {
            str = "";
        }
        Bundle arguments2 = ((StickerFragment) iDqS423S0100000_42.l0).getArguments();
        if (arguments2 != null && (string = arguments2.getString("key_effect_category")) != null) {
            str2 = string;
        }
        return new C94517aiH(str, str2);
    }

    public static final Object invoke$38(IDqS423S0100000_42 iDqS423S0100000_42) {
        return new IDFactoryS412S0100000_42(iDqS423S0100000_42, 0);
    }

    public static final Object invoke$39(IDqS423S0100000_42 iDqS423S0100000_42) {
        FragmentManager fragmentManager = ((PrefabContainerFragment) iDqS423S0100000_42.l0).getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIJJI(R.anim.i1, R.anim.i5, 0, 0);
            c1b3.LJJI((PrefabContainerFragment) iDqS423S0100000_42.l0);
            c1b3.LJI();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS423S0100000_42 iDqS423S0100000_42) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI())), null, null, new C94749am1(null), 3);
        ((LiquefyFragment) iDqS423S0100000_42.l0).LJLJJL = null;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((PrefabPageFragment) iDqS423S0100000_42.l0).wl();
    }

    public static final Object invoke$43(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((PrefabPanelFragment) iDqS423S0100000_42.l0).wl();
    }

    public static final Object invoke$44(IDqS423S0100000_42 iDqS423S0100000_42) {
        Object obj;
        boolean z;
        PrefabPanelFragment prefabPanelFragment = (PrefabPanelFragment) iDqS423S0100000_42.l0;
        PrefabData prefabData = prefabPanelFragment.LJLJJLL;
        Bundle arguments = prefabPanelFragment.getArguments();
        Object obj2 = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, "feature_id");
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            obj2 = obj;
        }
        Long l = (Long) obj2;
        if (((PrefabPanelFragment) iDqS423S0100000_42.l0).LJLJJLL != null) {
            z = true;
        } else {
            z = false;
        }
        return new C94448ahA(prefabData, l, z);
    }

    public static final Object invoke$48(IDqS423S0100000_42 iDqS423S0100000_42) {
        StatisticReporter LIZ;
        String str;
        PrefabEditFragment prefabEditFragment = (PrefabEditFragment) iDqS423S0100000_42.l0;
        prefabEditFragment.getClass();
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            Bundle arguments = prefabEditFragment.getArguments();
            o.LJI(arguments);
            Feature LJFF = LJI.LJFF(arguments.getLong("key_feature_id"));
            if (LJFF != null && (LIZ = C93670aUc.LIZ()) != null) {
                OSZ[] oszArr = new OSZ[4];
                oszArr[0] = new OSZ("is_ame_data", "1");
                oszArr[1] = new OSZ("asset_id", C93825aX7.LIZIZ(LJFF));
                oszArr[2] = new OSZ("feature_id", C93825aX7.LJFF(LJFF));
                Bundle arguments2 = prefabEditFragment.getArguments();
                if (arguments2 == null || (str = arguments2.getString("key_category")) == null) {
                    str = "";
                }
                oszArr[3] = new OSZ("category_key", str);
                LIZ.onEvent("general_effect_edit_sliderdrag", C113554cx.LJJL(oszArr));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((PrefabEditFragment) iDqS423S0100000_42.l0).wl();
    }

    public static final Object invoke$5(IDqS423S0100000_42 iDqS423S0100000_42) {
        Model workingModel;
        FeatureManager featureManager;
        ((LiquefyFragment) iDqS423S0100000_42.l0).Gl().getClass();
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (workingModel = LJI.LIZJ.getWorkingModel()) != null && (featureManager = workingModel.featureManager()) != null) {
            featureManager.recoverFeatureEditableStates(true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$50(IDqS423S0100000_42 iDqS423S0100000_42) {
        Bundle arguments = ((PrefabEditFragment) iDqS423S0100000_42.l0).getArguments();
        o.LJI(arguments);
        return new C94452ahE(arguments.getLong("key_feature_id"));
    }

    public static final Object invoke$54(IDqS423S0100000_42 iDqS423S0100000_42) {
        return new IDFactoryS412S0100000_42(iDqS423S0100000_42, 1);
    }

    public static final Object invoke$55(IDqS423S0100000_42 iDqS423S0100000_42) {
        return new C93926aYk(new IDqS423S0100000_42(iDqS423S0100000_42, 56), new IDqS423S0100000_42(iDqS423S0100000_42, 57), new IDqS423S0100000_42(iDqS423S0100000_42, 58));
    }

    public static final Object invoke$56(IDqS423S0100000_42 iDqS423S0100000_42) {
        LifecycleOwner viewLifecycleOwner = ((MainFragment) ((IDqS423S0100000_42) iDqS423S0100000_42.l0).l0).getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        return viewLifecycleOwner;
    }

    public static final Object invoke$57(IDqS423S0100000_42 iDqS423S0100000_42) {
        return MainFragment.vl((MainFragment) ((IDqS423S0100000_42) iDqS423S0100000_42.l0).l0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (((com.bytedance.ugc.effectcreator.main.MainFragment) ((kotlin.jvm.internal.IDqS423S0100000_42) r2.l0).l0).Ol().LJLJJL != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$58(kotlin.jvm.internal.IDqS423S0100000_42 r2) {
        /*
            X.aXB r0 = com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext.LJI()
            if (r0 == 0) goto L22
            boolean r0 = r0.LJIIIZ()
            r1 = 1
            if (r0 != r1) goto L22
            java.lang.Object r0 = r2.l0
            kotlin.jvm.internal.IDqS423S0100000_42 r0 = (kotlin.jvm.internal.IDqS423S0100000_42) r0
            java.lang.Object r0 = r0.l0
            com.bytedance.ugc.effectcreator.main.MainFragment r0 = (com.bytedance.ugc.effectcreator.main.MainFragment) r0
            com.bytedance.ugc.effectcreator.main.MainViewModel r0 = r0.Ol()
            boolean r0 = r0.LJLJJL
            if (r0 == 0) goto L22
        L1d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L22:
            r1 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS423S0100000_42.invoke$58(kotlin.jvm.internal.IDqS423S0100000_42):java.lang.Object");
    }

    public static final Object invoke$59(IDqS423S0100000_42 iDqS423S0100000_42) {
        InterfaceC88472Yns interfaceC88472Yns = ((C94550aio) iDqS423S0100000_42.l0).LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS423S0100000_42 iDqS423S0100000_42) {
        FeatureManager featureManager;
        FeatureManager featureManager2;
        LiquefyViewModel Gl = ((LiquefyFragment) iDqS423S0100000_42.l0).Gl();
        Gl.getClass();
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            Model workingModel = LJI.LIZJ.getWorkingModel();
            if (workingModel != null && (featureManager2 = workingModel.featureManager()) != null) {
                featureManager2.recordFeatureEditableStates();
            }
            C94518aiI c94518aiI = Gl.LJLIL;
            if (c94518aiI != null) {
                Feature feature = c94518aiI.LIZJ;
                o.LJIIIZ(feature, "feature");
                Model workingModel2 = LJI.LIZJ.getWorkingModel();
                if (workingModel2 != null && (featureManager = workingModel2.featureManager()) != null) {
                    EEStdFeatureList eEStdFeatureList = new EEStdFeatureList();
                    eEStdFeatureList.add(feature);
                    featureManager.lockAllFeatureExcept(eEStdFeatureList);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$60(IDqS423S0100000_42 iDqS423S0100000_42) {
        XKX.LIZLLL(((C94792ami) iDqS423S0100000_42.l0).LJLILLLLZI.scope, null, null, new C94793amj(iDqS423S0100000_42, null), 3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$61(IDqS423S0100000_42 iDqS423S0100000_42) {
        ASQ.LJIIJ((InputDspPlaylistSheetFragment) iDqS423S0100000_42.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$62(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspSheetAssem) iDqS423S0100000_42.l0).getContainerView().findViewById(R.id.no_);
    }

    public static final Object invoke$64(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspSheetAssem) iDqS423S0100000_42.l0).getContainerView().findViewById(R.id.noa);
    }

    public static final Object invoke$65(IDqS423S0100000_42 iDqS423S0100000_42) {
        ASQ.LJ((MusicDspSheetDialogFragment) iDqS423S0100000_42.l0, ASY.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$66(IDqS423S0100000_42 iDqS423S0100000_42) {
        ASQ.LJ((MusicDspSheetDialogFragment) iDqS423S0100000_42.l0, ASX.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$67(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspAwemeCell) iDqS423S0100000_42.l0).itemView.findViewById(R.id.npd);
    }

    public static final Object invoke$68(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspAwemeCell) iDqS423S0100000_42.l0).itemView.findViewById(R.id.npw);
    }

    public static final Object invoke$69(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspAwemeCell) iDqS423S0100000_42.l0).itemView.findViewById(R.id.nq0);
    }

    public static final Object invoke$7(IDqS423S0100000_42 iDqS423S0100000_42) {
        UIAnnotationTransform3D.dynamicCast((Element) iDqS423S0100000_42.l0).updateValueFromAMG();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$70(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspPlaylistCell) iDqS423S0100000_42.l0).itemView.findViewById(R.id.nph);
    }

    public static final Object invoke$71(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspPlaylistCell) iDqS423S0100000_42.l0).itemView.findViewById(R.id.np7);
    }

    public static final Object invoke$72(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspPlaylistCell) iDqS423S0100000_42.l0).itemView.findViewById(R.id.npe);
    }

    public static final Object invoke$73(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((MusicDspPlaylistCell) iDqS423S0100000_42.l0).itemView.findViewById(R.id.npm);
    }

    public static final Object invoke$74(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((MusicAuthPlatformsSettingPage) iDqS423S0100000_42.l0).Hl(DspPlatform.APPLE_MUSIC);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$75(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((MusicAuthPlatformsSettingPage) iDqS423S0100000_42.l0).Hl(DspPlatform.AMAZON_MUSIC);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$76(IDqS423S0100000_42 iDqS423S0100000_42) {
        ((MusicAuthPlatformsSettingPage) iDqS423S0100000_42.l0).Hl(DspPlatform.SPOTIFY);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$77(IDqS423S0100000_42 iDqS423S0100000_42) {
        SYL power_list = (SYL) ((MusicAuthPlatformsSettingPage) iDqS423S0100000_42.l0)._$_findCachedViewById(R.id.i04);
        o.LJIIIIZZ(power_list, "power_list");
        return new C25851ACp(power_list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$78(IDqS423S0100000_42 iDqS423S0100000_42) {
        String string = ((MusicSettingPage) iDqS423S0100000_42.l0).getString(R.string.baz);
        MusicSettingPage musicSettingPage = (MusicSettingPage) iDqS423S0100000_42.l0;
        IDCListenerS139S0100000_42 iDCListenerS139S0100000_42 = new IDCListenerS139S0100000_42(musicSettingPage, 6);
        boolean z = musicSettingPage.LJLJJI;
        Context requireContext = ((MusicSettingPage) iDqS423S0100000_42.l0).requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C116414hZ c116414hZ = new C116414hZ(requireContext, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        layoutParams.gravity = 17;
        layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        c116414hZ.setLayoutParams(layoutParams);
        c116414hZ.setVisibility(8);
        o.LJIIIIZZ(string, "getString(R.string.addMu…e_musicPage_sectionTitle)");
        boolean z2 = false;
        return new C25860ACy(new C25859ACx(string, null == true ? 1 : 0, iDCListenerS139S0100000_42, "choose_dsp_platform", true, null == true ? 1 : 0, c116414hZ, null == true ? 1 : 0, z2, z2, null == true ? 1 : 0, null == true ? 1 : 0, z2, z, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 8372130));
    }

    public static final Object invoke$79(IDqS423S0100000_42 iDqS423S0100000_42) {
        ActivityC45651qj mo49getActivity = ((MusicSettingPage) iDqS423S0100000_42.l0).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS423S0100000_42 iDqS423S0100000_42) {
        Feature feature;
        EEStdUIAnnotationBaseList uiAnnotations;
        LiquefyViewModel liquefyViewModel = (LiquefyViewModel) iDqS423S0100000_42.l0;
        C94518aiI c94518aiI = liquefyViewModel.LJLIL;
        if (c94518aiI != null && (feature = c94518aiI.LIZJ) != null && (uiAnnotations = feature.getUiAnnotations()) != null) {
            Iterator<UIAnnotationBase> it = uiAnnotations.iterator();
            while (it.hasNext()) {
                UIAnnotationBase it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                String name = it2.getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case 1072799752:
                            if (!name.equals("liquify_intensity_X")) {
                                break;
                            } else {
                                liquefyViewModel.LJLLJ = UIAnnotationFloat.dynamicCast((Element) it2);
                                break;
                            }
                        case 1072799753:
                            if (!name.equals("liquify_intensity_Y")) {
                                break;
                            } else {
                                liquefyViewModel.LJLLL = UIAnnotationFloat.dynamicCast((Element) it2);
                                break;
                            }
                        case 1333635459:
                            if (!name.equals("liquify_mirror")) {
                                break;
                            } else {
                                liquefyViewModel.LJLLI = UIAnnotationBool.dynamicCast((Element) it2);
                                break;
                            }
                        case 1772474389:
                            if (!name.equals("liquify_face_tracking")) {
                                break;
                            } else {
                                liquefyViewModel.LJLLILLLL = UIAnnotationBool.dynamicCast((Element) it2);
                                break;
                            }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$80(IDqS423S0100000_42 iDqS423S0100000_42) {
        SYL power_list = (SYL) ((MusicSettingPage) iDqS423S0100000_42.l0)._$_findCachedViewById(R.id.i04);
        o.LJIIIIZZ(power_list, "power_list");
        return new C25851ACp(power_list);
    }

    public static final Object invoke$81(IDqS423S0100000_42 iDqS423S0100000_42) {
        int i;
        Bundle arguments = ((VoiceSearchContainerFragment) iDqS423S0100000_42.l0).getArguments();
        if (arguments != null) {
            i = arguments.getInt("enter_page");
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$82(IDqS423S0100000_42 iDqS423S0100000_42) {
        Bundle arguments = ((VoiceSearchContainerFragment) iDqS423S0100000_42.l0).getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("mob");
        }
        if (!(serializable instanceof HashMap) || serializable == null) {
            return new HashMap();
        }
        return serializable;
    }

    public static final Object invoke$83(IDqS423S0100000_42 iDqS423S0100000_42) {
        String string;
        Bundle arguments = ((VoiceSearchContainerFragment) iDqS423S0100000_42.l0).getArguments();
        if (arguments == null || (string = arguments.getString("key_from")) == null) {
            return "";
        }
        return string;
    }

    public static final Object invoke$84(IDqS423S0100000_42 iDqS423S0100000_42) {
        Bundle arguments = ((MusicRecognitionFragment) iDqS423S0100000_42.l0).getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("mob");
        }
        if (!(serializable instanceof HashMap) || serializable == null) {
            return new HashMap();
        }
        return serializable;
    }

    public static final Object invoke$85(IDqS423S0100000_42 iDqS423S0100000_42) {
        String string;
        Bundle arguments = ((MusicRecognitionFragment) iDqS423S0100000_42.l0).getArguments();
        if (arguments == null || (string = arguments.getString("source")) == null) {
            return "";
        }
        return string;
    }

    public static final Object invoke$9(IDqS423S0100000_42 iDqS423S0100000_42) {
        Fragment parentFragment = ((ActionFragment) iDqS423S0100000_42.l0).getParentFragment();
        if (parentFragment != null) {
            return new ViewModelProvider(parentFragment).get(EditViewModel.class);
        }
        return null;
    }

    public static final Object invoke$90(IDqS423S0100000_42 iDqS423S0100000_42) {
        return ((VoiceSearchFragment) iDqS423S0100000_42.l0).LJLJI;
    }

    public static final Object invoke$91(IDqS423S0100000_42 iDqS423S0100000_42) {
        Bundle arguments = ((VoiceSearchFragment) iDqS423S0100000_42.l0).getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("mob");
        }
        if (!(serializable instanceof HashMap) || serializable == null) {
            return new HashMap();
        }
        return serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(InterfaceC93923mO interfaceC93923mO, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC93923mO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(InterfaceC65350Pko interfaceC65350Pko, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC65350Pko;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(XKS xks, int i) {
        super(0);
        this.$t = i;
        this.l0 = xks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C93837aXJ c93837aXJ, int i) {
        super(0);
        this.$t = i;
        this.l0 = c93837aXJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(InterfaceC93942aZ0 interfaceC93942aZ0, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC93942aZ0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94078abC c94078abC, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94078abC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94277aeP c94277aeP, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94277aeP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94282aeU c94282aeU, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94282aeU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94351afb c94351afb, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94351afb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94518aiI c94518aiI, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94518aiI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94550aio c94550aio, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94550aio;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94613ajp c94613ajp, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94613ajp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94700alE c94700alE, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94700alE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94792ami c94792ami, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94792ami;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(C94908aoa c94908aoa, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94908aoa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(IDCListenerS262S0100000_42 iDCListenerS262S0100000_42, int i) {
        super(0);
        this.$t = i;
        this.l0 = iDCListenerS262S0100000_42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(IDObserverS227S0100000_42 iDObserverS227S0100000_42, int i) {
        super(0);
        this.$t = i;
        this.l0 = iDObserverS227S0100000_42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(Fragment fragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(LiquefyFragment liquefyFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = liquefyFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(LiquefyViewModel liquefyViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = liquefyViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(BehaviourContainerFragment behaviourContainerFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = behaviourContainerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(ActionFragment actionFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = actionFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(BehaviourEditFragment behaviourEditFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = behaviourEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(TriggerFragment triggerFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = triggerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(FeatureFragment featureFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = featureFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(BehaviourPreviewFragment behaviourPreviewFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = behaviourPreviewFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(CameraPreview cameraPreview, int i) {
        super(0);
        this.$t = i;
        this.l0 = cameraPreview;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(FaceDistortionFragment faceDistortionFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = faceDistortionFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(AssetsFragment assetsFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = assetsFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(EffectSelectFragment effectSelectFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = effectSelectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(ObjectSelectFragment objectSelectFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = objectSelectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(StickerFragment stickerFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = stickerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(GifsFragment gifsFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = gifsFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(PrefabContainerFragment prefabContainerFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = prefabContainerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(PrefabPageFragment prefabPageFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = prefabPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(PrefabPanelFragment prefabPanelFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = prefabPanelFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(PrefabEditFragment prefabEditFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = prefabEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(PrefabEditViewModel prefabEditViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = prefabEditViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(Feature feature, int i) {
        super(0);
        this.$t = i;
        this.l0 = feature;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(UIAnnotationBase uIAnnotationBase, int i) {
        super(0);
        this.$t = i;
        this.l0 = uIAnnotationBase;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(MainFragment mainFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = mainFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = inputDspPlaylistSheetFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(MusicDspSheetAssem musicDspSheetAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicDspSheetAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(MusicDspSheetDialogFragment musicDspSheetDialogFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicDspSheetDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(MusicDspAwemeCell musicDspAwemeCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicDspAwemeCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(MusicDspPlaylistCell musicDspPlaylistCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicDspPlaylistCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicAuthPlatformsSettingPage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(MusicSettingPage musicSettingPage, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicSettingPage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(DspAuthParam dspAuthParam, int i) {
        super(0);
        this.$t = i;
        this.l0 = dspAuthParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(VoiceSearchContainerFragment voiceSearchContainerFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = voiceSearchContainerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(MusicRecognitionFragment musicRecognitionFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicRecognitionFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(VoiceSearchFragment voiceSearchFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = voiceSearchFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(VoiceSearchLanguageSettingFragment voiceSearchLanguageSettingFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = voiceSearchLanguageSettingFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(CanvasViewModel canvasViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = canvasViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(EffectLayerEditorFragment effectLayerEditorFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = effectLayerEditorFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(LayerViewModel layerViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = layerViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(IDqS196S0200000_42 iDqS196S0200000_42, int i) {
        super(0);
        this.$t = i;
        this.l0 = iDqS196S0200000_42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(IDqS419S0100000_42 iDqS419S0100000_42, int i) {
        super(0);
        this.$t = i;
        this.l0 = iDqS419S0100000_42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(IDqS423S0100000_42 iDqS423S0100000_42, int i) {
        super(0);
        this.$t = i;
        this.l0 = iDqS423S0100000_42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS423S0100000_42(InterfaceC65462ha[] interfaceC65462haArr, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC65462haArr;
    }
}
