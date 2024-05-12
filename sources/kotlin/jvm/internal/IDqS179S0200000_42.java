package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC93937aYv;
import X.ActivityC45651qj;
import X.C1554968j;
import X.C1B3;
import X.C26045AKb;
import X.C68322mC;
import X.C76800UCe;
import X.C93405aQL;
import X.C93472aRQ;
import X.C93480aRY;
import X.C93566aSw;
import X.C93742aVm;
import X.C93790aWY;
import X.C93792aWa;
import X.C93829aXB;
import X.C93886aY6;
import X.C93899aYJ;
import X.C93971aZT;
import X.C94116abo;
import X.C94256ae4;
import X.C94273aeL;
import X.C94277aeP;
import X.C94302aeo;
import X.C94307aet;
import X.C94309aev;
import X.C94351afb;
import X.C94389agD;
import X.C94462ahO;
import X.C94504ai4;
import X.C94659akZ;
import X.C94846ana;
import X.C94855anj;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC93964aZM;
import X.X1D;
import Y.IDObjectS187S0100000_42;
import Y.IDObserverS227S0100000_42;
import android.content.Context;
import android.graphics.Rect;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.bytedance.effectcreatormobile.camera.CameraPreview;
import com.bytedance.effectcreatormobile.camera.CameraRenderLiveData;
import com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.ISingleLineTips;
import com.bytedance.effectcreatormobile.modelselect.ModelSelectFragment;
import com.bytedance.ies.effectcreator.swig.DataEvent;
import com.bytedance.ies.effectcreator.swig.DataEventRequestReloadEffectResource;
import com.bytedance.ies.effectcreator.swig.EEStdUIAnnotationBaseList;
import com.bytedance.ies.effectcreator.swig.EffectType;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.ProjectState;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBool;
import com.bytedance.news.common.service.manager.IService;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.MusicDspSheetDialogFragment;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.music.app.auth.setting.page.MusicAuthPlatformsSettingPage;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.model.SongInfo;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes34.dex */
public class IDqS179S0200000_42 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
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
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS179S0200000_42 iDqS179S0200000_42) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS179S0200000_42.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        FragmentManager fragmentManager = ((ModelSelectFragment) iDqS179S0200000_42.l0).getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI((ModelSelectFragment) iDqS179S0200000_42.l0);
            c1b3.LJI();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS179S0200000_42 iDqS179S0200000_42) {
        C93472aRQ.LIZ(C93405aQL.LIZ(), (Context) iDqS179S0200000_42.l0, String.valueOf(((C93480aRY) iDqS179S0200000_42.l1).LIZJ), String.valueOf(((C93480aRY) iDqS179S0200000_42.l1).LJ), String.valueOf(((C93480aRY) iDqS179S0200000_42.l1).LJII), null, new C94116abo(), null, String.valueOf(((C93480aRY) iDqS179S0200000_42.l1).LIZIZ), new Rect(C93742aVm.LIZIZ(16), C93742aVm.LIZIZ(24), C93742aVm.LIZIZ(16), C93742aVm.LIZIZ(24)), null, 1616);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS179S0200000_42 iDqS179S0200000_42) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((C68322mC) iDqS179S0200000_42.l0).element;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        ((C68322mC) iDqS179S0200000_42.l0).element = null;
        MessageCenter.removeListener((C94277aeP) iDqS179S0200000_42.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS179S0200000_42 iDqS179S0200000_42) {
        int size = ((C94855anj) iDqS179S0200000_42.l0).LJLIL.size();
        for (int i = 0; i < size; i++) {
            C94389agD c94389agD = (C94389agD) iDqS179S0200000_42.l1;
            if (c94389agD != null) {
                if (i != c94389agD.getAdapterPosition()) {
                    ((C94855anj) iDqS179S0200000_42.l0).notifyItemChanged(i, "tipsPayload");
                }
            } else {
                ((C94855anj) iDqS179S0200000_42.l0).notifyItemChanged(i, "tipsPayload");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS179S0200000_42 iDqS179S0200000_42) {
        DataEventRequestReloadEffectResource dynamicCast = DataEventRequestReloadEffectResource.dynamicCast((DataEvent) iDqS179S0200000_42.l1);
        if (dynamicCast != null) {
            ((C94307aet) iDqS179S0200000_42.l0).LIZ.vl(dynamicCast.getPath());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS179S0200000_42 iDqS179S0200000_42) {
        AbstractC93937aYv abstractC93937aYv;
        CameraRenderLiveData<AbstractC93937aYv> renderModeData;
        CameraPreview cameraPreview = (CameraPreview) ((IDObserverS227S0100000_42) iDqS179S0200000_42.l0).l0;
        CameraRenderImpl LIZ = C93899aYJ.LIZ();
        if (LIZ != null && (renderModeData = LIZ.getRenderModeData()) != null) {
            abstractC93937aYv = renderModeData.getValue();
        } else {
            abstractC93937aYv = null;
        }
        cameraPreview.LJLJLLL = abstractC93937aYv;
        CameraPreview cameraPreview2 = (CameraPreview) ((IDObserverS227S0100000_42) iDqS179S0200000_42.l0).l0;
        C94273aeL c94273aeL = (C94273aeL) iDqS179S0200000_42.l1;
        cameraPreview2.getClass();
        CKEffectEditorContext.LJFF(EffectType.EffectType_ForPreviewOnly);
        cameraPreview2.Al(C94504ai4.LIZ, new IDqS179S0200000_42(cameraPreview2, c94273aeL, 15));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS179S0200000_42 iDqS179S0200000_42) {
        String str;
        C93886aY6 xl = ((CameraPreview) iDqS179S0200000_42.l0).xl();
        C94256ae4 c94256ae4 = (C94256ae4) iDqS179S0200000_42.l1;
        if (c94256ae4 != null) {
            str = c94256ae4.LJLJLJ;
        } else {
            str = null;
        }
        xl.LJI(str);
        ((CameraPreview) iDqS179S0200000_42.l0).Jl(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS179S0200000_42 iDqS179S0200000_42) {
        ((CameraPreview) iDqS179S0200000_42.l0).xl().LJFF(false);
        ((CameraPreview) iDqS179S0200000_42.l0).xl().LJ().LIZIZ.setRenderCacheString("appViewMode", "preview");
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            LJI.LJIIL(ProjectState.ProjectState_Preview);
        }
        CameraPreview cameraPreview = (CameraPreview) iDqS179S0200000_42.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C94273aeL) iDqS179S0200000_42.l1).LJLIL);
        LIZ.append("/effect");
        cameraPreview.vl(X1D.LIZIZ(LIZ));
        CKEffectEditorContext.LIZLLL(new C94659akZ(true));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS179S0200000_42 iDqS179S0200000_42) {
        ISingleLineTips iSingleLineTips = (ISingleLineTips) ((IService) C93971aZT.LIZ().LIZ(ISingleLineTips.class));
        if (iSingleLineTips != null) {
            Context context = (Context) iDqS179S0200000_42.l0;
            o.LJIIIIZZ(context, "this");
            RelativeLayout relativeLayout = MainFragment.vl((MainFragment) ((IDqS419S0100000_42) ((IDqS419S0100000_42) iDqS179S0200000_42.l1).l0).l0).LLILII;
            o.LJIIIIZZ(relativeLayout, "binding.rlLayer");
            String string = ((Context) iDqS179S0200000_42.l0).getString(R.string.fyc);
            o.LJIIIIZZ(string, "this.getString(com.ugc.e…tool_tooltip_objectshere)");
            iSingleLineTips.show(context, relativeLayout, string, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(IDqS179S0200000_42 iDqS179S0200000_42) {
        InterfaceC93964aZM interfaceC93964aZM = ((C94351afb) iDqS179S0200000_42.l0).LIZIZ;
        if (interfaceC93964aZM != null) {
            SongInfo songInfo = (SongInfo) iDqS179S0200000_42.l1;
            interfaceC93964aZM.LIZ(new C94309aev("", songInfo.songName, songInfo.songId, 2), true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(IDqS179S0200000_42 iDqS179S0200000_42) {
        ((MusicAuthPlatformsSettingPage) iDqS179S0200000_42.l0).Il(DspPlatform.UNKNOWN);
        C26045AKb c26045AKb = new C26045AKb((MusicAuthPlatformsSettingPage) iDqS179S0200000_42.l0);
        c26045AKb.LJIIIZ(((MusicAuthPlatformsSettingPage) iDqS179S0200000_42.l0).getString(R.string.bax, ((DspPlatform) iDqS179S0200000_42.l1).getTitle()));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LJIIJ();
        C94302aeo.LJJIII(C94302aeo.LJLIL, "1", "", (DspPlatform) iDqS179S0200000_42.l1, null, null, false, "unlink", "music_setting", "null");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS179S0200000_42 iDqS179S0200000_42) {
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        DspPlatform dspPlatform = (DspPlatform) iDqS179S0200000_42.l0;
        MusicDspSheetDialogFragment musicDspSheetDialogFragment = (MusicDspSheetDialogFragment) iDqS179S0200000_42.l1;
        C94302aeo.LJJIII(c94302aeo, "1", "", dspPlatform, null, null, false, "link", musicDspSheetDialogFragment.LJLILLLLZI, musicDspSheetDialogFragment.LJLJJLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS179S0200000_42 iDqS179S0200000_42) {
        ((MusicDspSheetViewModel) iDqS179S0200000_42.l0).LJLILLLLZI = false;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS179S0200000_42.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS179S0200000_42 iDqS179S0200000_42) {
        return new ViewModelProvider((ViewModelStoreOwner) iDqS179S0200000_42.l0).get((Class) iDqS179S0200000_42.l1);
    }

    public static final Object invoke$5(IDqS179S0200000_42 iDqS179S0200000_42) {
        C1554968j c1554968j = ((C93566aSw) iDqS179S0200000_42.l0).LJLLLLLL;
        if (c1554968j != null) {
            c1554968j.LIZIZ((List) iDqS179S0200000_42.l1);
            return C76800UCe.LIZ;
        }
        o.LJIJI("selectFontLayout");
        throw null;
    }

    public static final Object invoke$6(IDqS179S0200000_42 iDqS179S0200000_42) {
        C93790aWY c93790aWY = C93792aWa.LJII;
        ActivityC45651qj requireActivity = ((BehaviourEditFragment) iDqS179S0200000_42.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C93790aWY.LIZ(c93790aWY, requireActivity, 0, (EditText) iDqS179S0200000_42.l1, new C94462ahO(iDqS179S0200000_42), null, true, 16);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS179S0200000_42 iDqS179S0200000_42) {
        ((C94846ana) iDqS179S0200000_42.l0).LJLJI.removeTextChangedListener((IDObjectS187S0100000_42) iDqS179S0200000_42.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS179S0200000_42 iDqS179S0200000_42) {
        String str;
        String str2;
        EEStdUIAnnotationBaseList uiAnnotations = ((Feature) iDqS179S0200000_42.l0).getUiAnnotations();
        o.LJIIIIZZ(uiAnnotations, "uiAnnotations");
        Iterator<UIAnnotationBase> it = uiAnnotations.iterator();
        while (it.hasNext()) {
            UIAnnotationBase it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            String name = it2.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != 1333635459) {
                    if (hashCode == 1772474389 && name.equals("liquify_face_tracking")) {
                        List list = (List) iDqS179S0200000_42.l1;
                        UIAnnotationBool dynamicCast = UIAnnotationBool.dynamicCast((Element) it2);
                        o.LJIIIIZZ(dynamicCast, "UIAnnotationBool.dynamicCast(it)");
                        if (dynamicCast.getCurrentValueSync()) {
                            str = "follow_face";
                        } else {
                            str = "unfollow_face";
                        }
                        list.add(str);
                    }
                } else if (name.equals("liquify_mirror")) {
                    List list2 = (List) iDqS179S0200000_42.l1;
                    UIAnnotationBool dynamicCast2 = UIAnnotationBool.dynamicCast((Element) it2);
                    o.LJIIIIZZ(dynamicCast2, "UIAnnotationBool.dynamicCast(it)");
                    if (dynamicCast2.getCurrentValueSync()) {
                        str2 = "mirror";
                    } else {
                        str2 = "unmirror";
                    }
                    list2.add(str2);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS179S0200000_42 iDqS179S0200000_42) {
        ((C93829aXB) iDqS179S0200000_42.l0).LIZJ.setProjectState((ProjectState) iDqS179S0200000_42.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS179S0200000_42(C93566aSw c93566aSw, C93566aSw c93566aSw2, List<TextFontStyleData> list) {
        super(0);
        this.$t = list;
        this.l0 = c93566aSw;
        this.l1 = c93566aSw2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(C93829aXB c93829aXB, ProjectState projectState, int i) {
        super(0);
        this.$t = i;
        this.l0 = c93829aXB;
        this.l1 = projectState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(C94277aeP c94277aeP, C68322mC c68322mC, int i) {
        super(0);
        this.$t = i;
        this.l0 = c68322mC;
        this.l1 = c94277aeP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(C94307aet c94307aet, DataEvent dataEvent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94307aet;
        this.l1 = dataEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(C94351afb c94351afb, SongInfo songInfo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94351afb;
        this.l1 = songInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(C94846ana c94846ana, IDObjectS187S0100000_42 iDObjectS187S0100000_42, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94846ana;
        this.l1 = iDObjectS187S0100000_42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(C94855anj c94855anj, C94389agD c94389agD, int i) {
        super(0);
        this.$t = i;
        this.l0 = c94855anj;
        this.l1 = c94389agD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(IDObserverS227S0100000_42 iDObserverS227S0100000_42, C94273aeL c94273aeL, int i) {
        super(0);
        this.$t = i;
        this.l0 = iDObserverS227S0100000_42;
        this.l1 = c94273aeL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(Context context, C93480aRY c93480aRY, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c93480aRY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(Context context, IDqS419S0100000_42 iDqS419S0100000_42, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = iDqS419S0100000_42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(ViewModelStoreOwner viewModelStoreOwner, Class cls, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewModelStoreOwner;
        this.l1 = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(BehaviourEditFragment behaviourEditFragment, EditText editText, int i) {
        super(0);
        this.$t = i;
        this.l0 = behaviourEditFragment;
        this.l1 = editText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(CameraPreview cameraPreview, C94256ae4 c94256ae4, int i) {
        super(0);
        this.$t = i;
        this.l0 = cameraPreview;
        this.l1 = c94256ae4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(CameraPreview cameraPreview, C94273aeL c94273aeL, int i) {
        super(0);
        this.$t = i;
        this.l0 = cameraPreview;
        this.l1 = c94273aeL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(ModelSelectFragment modelSelectFragment, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(0);
        this.$t = i;
        this.l0 = modelSelectFragment;
        this.l1 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(Feature feature, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = feature;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS179S0200000_42(MusicDspSheetViewModel musicDspSheetViewModel, MusicDspSheetViewModel musicDspSheetViewModel2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = musicDspSheetViewModel;
        this.l1 = musicDspSheetViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(MusicAuthPlatformsSettingPage musicAuthPlatformsSettingPage, DspPlatform dspPlatform, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicAuthPlatformsSettingPage;
        this.l1 = dspPlatform;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS179S0200000_42(DspPlatform dspPlatform, MusicDspSheetDialogFragment musicDspSheetDialogFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = dspPlatform;
        this.l1 = musicDspSheetDialogFragment;
    }
}
