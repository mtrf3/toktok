package com.ss.android.ugc.aweme.shortvideo.effectdiscover;

import X.AbstractC46187IAt;
import X.AbstractC73672Svk;
import X.C145995oB;
import X.C29901Fi;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C73320Sq4;
import X.C73815Sy3;
import X.C73969T1h;
import X.C74413TIj;
import X.C78999UzT;
import X.C82622Wbi;
import X.GXR;
import X.I0N;
import X.InterfaceC115514g7;
import X.InterfaceC135635Tz;
import X.InterfaceC65784Pro;
import X.InterfaceC73650SvO;
import X.InterfaceC74236TBo;
import X.T16;
import X.TBT;
import X.TF1;
import X.TF7;
import X.TFM;
import X.TFN;
import X.TFR;
import X.TFT;
import X.TFU;
import X.TFX;
import X.THU;
import X.UCI;
import Y.AfS64S0100000_12;
import Y.IDhS105S0100000_12;
import androidx.lifecycle.LiveDataReactiveStreams;
import com.bytedance.als.LiveEvent;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EffectDiscoverViewModel extends LifecycleAwareViewModel<EffectDiscoverPanelState> implements THU, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLJL;
    public final C73318Sq2 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public long LJLLI;
    public final InterfaceC73650SvO<C74413TIj<SearchEffectResponseV2>> LJLLILLLL;
    public final InterfaceC73650SvO<TF7> LJLLJ;
    public final C29901Fi<AbstractC46187IAt> LJLLL;

    static {
        TBT tbt = new TBT(EffectDiscoverViewModel.class, "searchStickViewModel", "getSearchStickViewModel()Lcom/ss/android/ugc/aweme/sticker/view/internal/search/ISearchStickerViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(EffectDiscoverViewModel.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp)};
    }

    private final I0N Mv0() {
        return (I0N) this.LJLL.LIZ(this, LJLLLL[1]);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public EffectDiscoverPanelState kv0() {
        return new EffectDiscoverPanelState(null, false, null, null, 15, null);
    }

    public final TF1 Lv0() {
        return (TF1) this.LJLJLLL.LIZ(this, LJLLLL[0]);
    }

    @Override // X.THU
    public void hide() {
        setStateImmediate(TFT.LJLIL);
    }

    @Override // X.THU
    public void show() {
        setStateImmediate(TFU.LJLIL);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.LJLJLJ.LIZLLL();
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJL;
    }

    @Override // X.THU
    public LiveEvent<AbstractC46187IAt> rV() {
        return this.LJLLL;
    }

    public final void Kv0(AbstractC46187IAt event) {
        o.LJIIIZ(event, "event");
        this.LJLLL.LJII(event);
    }

    public final void Nv0(TFX tfx) {
        if (tfx instanceof TFR) {
            withState(new AqS143S0200000_12(tfx, this, 61));
        } else {
            setStateImmediate(new AqS178S0100000_12(tfx, 285));
        }
    }

    public EffectDiscoverViewModel(C82622Wbi diContainer, AbstractC73672Svk<String> searchStream) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(searchStream, "searchStream");
        this.LJLJL = diContainer;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLJLJ = c73318Sq2;
        this.LJLJLLL = UCI.LJI(getDiContainer(), TF1.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), I0N.class, null);
        InterfaceC73650SvO<C74413TIj<SearchEffectResponseV2>> publisher = LiveDataReactiveStreams.toPublisher(this, Mv0().LLLLL().LJJJJLL().LIZ().LJI());
        o.LJIIIIZZ(publisher, "toPublisher(this,\n      …searchStickersLiveData())");
        this.LJLLILLLL = publisher;
        InterfaceC73650SvO<TF7> publisher2 = LiveDataReactiveStreams.toPublisher(this, Lv0().r30());
        o.LJIIIIZZ(publisher2, "toPublisher(this,\n      …el.recommendtrendingData)");
        this.LJLLJ = publisher2;
        this.LJLLL = new C29901Fi<>();
        C78999UzT.LJFF(searchStream.LJJIJL(TFM.LJLIL).LJIILIIL().LJJJJZI(new AfS64S0100000_12(this, 34)), c73318Sq2);
        C78999UzT.LJFF(searchStream.LJIILIIL().LJJJJZI(new AfS64S0100000_12(this, 35)), c73318Sq2);
        C78999UzT.LJFF(searchStream.LJJIFFI(TFN.LJLIL).LJIIJJI(500L, TimeUnit.MILLISECONDS).LJJL(T16.LIZIZ).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, 36), new AfS64S0100000_12(this, 37)), c73318Sq2);
        C73320Sq4.LIZ(publisher, "publisher is null");
        C78999UzT.LJFF(new C73815Sy3(publisher).LJJIII(new IDhS105S0100000_12(this, 12), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, 38), new AfS64S0100000_12(this, 39)), c73318Sq2);
    }

    private final void Ov0(String str, InterfaceC65784Pro<? extends HashMap<String, String>> interfaceC65784Pro) {
        ShortVideoContext shortVideoContext = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("music_id", shortVideoContext.getMusicId());
        c145995oB.LJI("shoot_tab_name", shortVideoContext.LJIJI());
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (interfaceC65784Pro != null) {
            c145995oB.LJFF(interfaceC65784Pro.invoke());
        }
        GXR.LIZ(str, c145995oB.LIZ);
    }
}
