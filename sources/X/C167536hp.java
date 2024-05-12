package X;

import Y.AObjectS84S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167536hp extends AbstractC56012Ht<C167576ht, C167636hz> implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public Effect LJLJJLL;
    public InterfaceC153045zY LJLJL;
    public C81589W0j LJLJLJ;
    public FrameLayout LJLJLLL;
    public final C82632Wbs LJLL;
    public final C5H3 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public String LJLLJ;
    public final C82632Wbs LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public List<? extends NLEModel> LJLZ;

    static {
        TBT tbt = new TBT(C167536hp.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C167536hp.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0, c65351Pkp)};
    }

    public final C167676i3 LLJILJILJ() {
        return (C167676i3) this.LJLILLLLZI.getValue();
    }

    public final C42292Gim LLJJ() {
        return (C42292Gim) this.LJLLILLLL.getValue();
    }

    public final VideoPublishEditModel LLJJI() {
        return (VideoPublishEditModel) this.LJLL.LIZ(this, LJZ[0]);
    }

    public final InterfaceC166716gV LLJJIII() {
        return (InterfaceC166716gV) this.LJLLL.LIZ(this, LJZ[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.ss.ugc.effectplatform.model.Effect, com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    public final Effect LLJJIJI() {
        C68322mC c68322mC = new C68322mC();
        boolean z = false;
        int i = 1;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (LLJJI().veAudioEffectParam == null && LLJJI().creativeModel.streamVoiceConversionModel.vcEffectId.length() == 0) {
            c68322mC.element = new Effect(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
        } else {
            AudioEffectParam audioEffectParam = LLJJI().veAudioEffectParam;
            if (audioEffectParam != null) {
                if (audioEffectParam.getUploadId().length() == 0) {
                    c68322mC.element = null;
                } else {
                    ?? effect = new Effect(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
                    effect.setUnzipPath(audioEffectParam.getEffectPath());
                    effect.setEffectId(audioEffectParam.getUploadId());
                    c68322mC.element = effect;
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initDefaultSelection  selectedEffect is null ? ");
        if (c68322mC.element == 0) {
            z = true;
        }
        LIZ.append(z);
        LIZ.append(" ,id= ");
        EffectTemplate effectTemplate = (EffectTemplate) c68322mC.element;
        if (effectTemplate != null) {
            str = effectTemplate.getEffectId();
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        return (Effect) c68322mC.element;
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLLI.getValue();
    }

    public final void LLJJIJIL() {
        NLEEditor nLEEditor;
        C122034qd LJJI;
        C5MG WS = getEditPreviewApi().WS();
        if (WS != null && (LJJI = C17N.LJJI(WS.LJIJ())) != null) {
            nLEEditor = LJJI.LJIIJ;
        } else {
            nLEEditor = null;
        }
        Effect effect = this.LJLJJLL;
        if (effect != null) {
            C141425go.LIZLLL(getEditPreviewApi());
            LLJJJ();
            C141425go.LIZ(effect, getEditPreviewApi(), new AqS184S0100000_2(this, 16));
            if (nLEEditor != null) {
                nLEEditor.LIZIZ();
                nLEEditor.LIZJ();
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLJJJ() {
        AVChallenge aVChallenge;
        List<AVChallenge> challenges;
        AudioEffectParam audioEffectParam = LLJJI().veAudioEffectParam;
        if (audioEffectParam != null) {
            aVChallenge = audioEffectParam.getChallenge();
        } else {
            aVChallenge = null;
        }
        LLJJI().removeAudioEffectChallengeFromTitleAndStruct(aVChallenge);
        AudioEffectParam audioEffectParam2 = LLJJI().veAudioEffectParam;
        if (audioEffectParam2 != null && (challenges = audioEffectParam2.getChallenges()) != null) {
            Iterator<AVChallenge> it = challenges.iterator();
            while (it.hasNext()) {
                LLJJI().removeAudioEffectChallengeFromTitleAndStruct(it.next());
            }
        }
        C149905uU.LIZLLL(LLJJI());
    }

    @Override // X.WM7
    public final void onDestroy() {
        InterfaceC81592W0m interfaceC81592W0m;
        super.onDestroy();
        LLJILJILJ().onDestroy();
        C81589W0j c81589W0j = this.LJLJLJ;
        if (c81589W0j != null && (interfaceC81592W0m = c81589W0j.LIZJ) != null) {
            interfaceC81592W0m.LJJLIIIJL(true);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C166696gT.LIZ().getClass();
        InterfaceC84498XEg LIZIZ = C166696gT.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.destroy();
        }
        C169416kr.LIZLLL = null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C167536hp(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(C167606hw.LJLIL);
        this.LJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLLILLLL = C221108m2.LIZIZ(C167616hx.LJLIL);
        this.LJLLL = UCI.LJI(diContainer, InterfaceC166716gV.class, null);
        this.LJLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 159));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 160));
        this.LJLZ = C61878OQg.INSTANCE;
    }

    public final void LLJJIJIIJIL(Effect effect) {
        C81589W0j c81589W0j = this.LJLJLJ;
        if (c81589W0j != null) {
            c81589W0j.LIZ(effect);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getEditPreviewApi().sP().observe(this, new AObjectS84S0100000_2(this, 53));
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6hs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C167576ht) obj).LIZ;
            }
        }, null, new AqS168S0100000_2(this, 99), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6hr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C167576ht) obj).LIZIZ);
            }
        }, null, new AqS168S0100000_2(this, 100), 2, null);
    }

    public final void LLJILJIL(LifecycleOwner lifecycleOwner, Effect effect) {
        List<String> challenge;
        ArrayList arrayList = new ArrayList();
        if (effect != null && (challenge = effect.getChallenge()) != null) {
            Iterator<String> it = challenge.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            new C41386GMc(lifecycleOwner, (String) it2.next()).LIZ(new BOC() { // from class: X.6hq
                @Override // X.BOC
                public final void LIZ(AVChallenge challenge2) {
                    List<AVChallenge> challenges;
                    AudioEffectParam audioEffectParam = C167536hp.this.LLJJI().veAudioEffectParam;
                    if (audioEffectParam != null) {
                        audioEffectParam.setChallenge(challenge2);
                    }
                    AudioEffectParam audioEffectParam2 = C167536hp.this.LLJJI().veAudioEffectParam;
                    if (audioEffectParam2 != null && (challenges = audioEffectParam2.getChallenges()) != null) {
                        o.LJIIIIZZ(challenge2, "challenge");
                        challenges.add(challenge2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        this.LJLJLLL = frameLayout;
        return frameLayout;
    }
}
