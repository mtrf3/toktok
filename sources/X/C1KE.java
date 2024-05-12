package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.api.ModificationUploadRequest;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectResponse;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtLiveBackgroundSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.PinSoundEffectRequest;

/* renamed from: X.1KE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KE implements InterfaceC12670ed {
    public final C72085SQv LIZ = new C72085SQv();
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C48911vz.INSTANCE);

    @Override // X.InterfaceC12670ed
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC12670ed
    public final void LJFF(boolean z) {
    }

    @Override // X.InterfaceC12670ed
    public final void LIZJ() {
        IFilterManager videoFilterMgr;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) dataChannelGlobal.mv0(C54992Dv.class);
        if (interfaceC21020s6 != null && (videoFilterMgr = interfaceC21020s6.getVideoFilterMgr()) != null) {
            videoFilterMgr.sendEffectMsg(112, 2, 0, "");
        }
        C0LU.LIZ = null;
        C1KC.LIZ.getClass();
        C1KC.LIZLLL = null;
        dataChannelGlobal.jv0(this);
        C40641ie.LJLIL.release();
        ((Handler) this.LIZIZ.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC12670ed
    public final void LIZLLL() {
        IFilterManager videoFilterMgr;
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 != null && (videoFilterMgr = interfaceC21020s6.getVideoFilterMgr()) != null) {
            videoFilterMgr.sendEffectMsg(112, 1, 0, "");
        }
    }

    @Override // X.InterfaceC12670ed
    public final EnumC12660ec LJI() {
        return EnumC12660ec.LONG_TERM;
    }

    @Override // X.InterfaceC12670ed
    public final void LJ(boolean z) {
        if (!z) {
            C0LU.LIZ = null;
            C40641ie.LJLIL.release();
        }
        C1KC.LIZ.getClass();
        C1KC.LIZLLL = null;
    }

    @Override // X.InterfaceC12670ed
    public final void LIZ(Fragment fragment, DataChannel dataChannel) {
        IFilterManager videoFilterMgr;
        o.LJIIIZ(fragment, "fragment");
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 != null && (videoFilterMgr = interfaceC21020s6.getVideoFilterMgr()) != null) {
            videoFilterMgr.sendEffectMsg(112, 3, 0, "");
        }
        C40641ie.LJLIL.JL(fragment, dataChannel);
        C72085SQv c72085SQv = this.LIZ;
        C37 c37 = C37.PREVIEW;
        c72085SQv.getClass();
        C72085SQv.LIZJ(dataChannel, fragment, c37);
        C1KC.LIZ.getClass();
        C1KC.LIZLLL = dataChannel;
    }

    @Override // X.InterfaceC12670ed
    public final void LJII(Fragment fragment, DataChannel dataChannel) {
        InterfaceC70422pa viewModelScope;
        o.LJIIIZ(fragment, "fragment");
        if (TtLiveBackgroundSetting.INSTANCE.enable()) {
            BgEffectViewModel bgEffectViewModel = (BgEffectViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C1Q5(new C39011g1("livebackground"), new C44821pO())).get(BgEffectViewModel.class);
            if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt()) {
                viewModelScope = LifecycleOwnerKt.getLifecycleScope(fragment);
            } else {
                viewModelScope = ViewModelKt.getViewModelScope(bgEffectViewModel);
            }
            XKX.LIZLLL(viewModelScope, null, null, new C54292Bd(bgEffectViewModel, null), 3);
        }
        C1KC.LIZ.getClass();
        C1KC.LIZLLL = dataChannel;
        C40641ie c40641ie = C40641ie.LJLIL;
        c40641ie.JL(fragment, dataChannel);
        C0WZ c0wz = C40641ie.LJLJJLL;
        if (c0wz != null) {
            c0wz.LJFF = false;
        }
        C40641ie.LJLJJLL = null;
        c40641ie.vm0();
        C1A.LIZ.put(EffectRelatedApi.class, new EffectRelatedApi() { // from class: X.1MW
            @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
            public final AbstractC73672Svk<C28467BFf<SoundEffectResponse>> fetchSoundEffect(long j) {
                AbstractC73672Svk<C28467BFf<SoundEffectResponse>> fetchSoundEffect = ((EffectRelatedApi) Q7L.LIZIZ(EffectRelatedApi.class)).fetchSoundEffect(j);
                o.LJIIIIZZ(fetchSoundEffect, "get().getService(EffectR….fetchSoundEffect(roomId)");
                return fetchSoundEffect;
            }

            @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
            public final AbstractC73672Svk<C28467BFf<C76800UCe>> finishEffectTask(int i) {
                return AbstractC73672Svk.LJJIJIL(new C28467BFf());
            }

            @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
            public final AbstractC73672Svk<C28467BFf<Void>> uploadEffectRelatedUseLog(ModificationUploadRequest modificationUploadRequest) {
                return AbstractC73672Svk.LJJIJIL(new C28467BFf());
            }

            @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
            public final AbstractC73672Svk<C28467BFf<Void>> uploadSoundEffectOrder(PinSoundEffectRequest pinSoundEffectRequest) {
                AbstractC73672Svk<C28467BFf<Void>> uploadSoundEffectOrder = ((EffectRelatedApi) Q7L.LIZIZ(EffectRelatedApi.class)).uploadSoundEffectOrder(pinSoundEffectRequest);
                o.LJIIIIZZ(uploadSoundEffectOrder, "get().getService(EffectR…SoundEffectOrder(request)");
                return uploadSoundEffectOrder;
            }

            @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
            public final AbstractC73672Svk<C28467BFf<Void>> uploadBeautyParams(long j, String str, int i, int i2, int i3, int i4, boolean z) {
                return AbstractC73672Svk.LJJIJIL(new C28467BFf());
            }
        });
        DataChannelGlobal.LJLJJI.nv0(this, fragment, BroadcastSceneGlobalChannel.class, new IDqS28S0300000(this, dataChannel, fragment, 12));
    }
}
