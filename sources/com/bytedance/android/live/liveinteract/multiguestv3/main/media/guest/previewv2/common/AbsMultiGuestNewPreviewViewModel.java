package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common;

import X.C0NB;
import X.C0WF;
import X.C19680pw;
import X.C32536Cpo;
import X.C62814Ol0;
import X.C68332mD;
import X.C74600TPo;
import X.C74961TbR;
import X.InterfaceC24140x8;
import X.TQP;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.viewmodel.ViewModelExt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2CloseEvent;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class AbsMultiGuestNewPreviewViewModel extends ViewModelExt {
    public static final /* synthetic */ int LJLL = 0;
    public InterfaceC24140x8 LJLJI;
    public DataChannel LJLJJI;
    public final C68332mD LJLILLLLZI = C62814Ol0.LJII(this, 0);
    public final C68332mD LJLJJL = new C68332mD(new C32536Cpo());
    public final C68332mD LJLJJLL = C62814Ol0.LJIIJJI(this);
    public final C68332mD LJLJL = C62814Ol0.LJIIJJI(this);
    public final C68332mD LJLJLJ = new C68332mD(new C32536Cpo());
    public final C68332mD LJLJLLL = C62814Ol0.LJIIJJI(this);

    public final C0WF gv0() {
        Object obj;
        InterfaceC24140x8 interfaceC24140x8 = this.LJLJI;
        if (interfaceC24140x8 != null) {
            obj = interfaceC24140x8.getAttachedComposerManager();
        } else {
            obj = null;
        }
        if (!(obj instanceof C0WF)) {
            return null;
        }
        return (C0WF) obj;
    }

    public final Channel<Integer> hv0() {
        return (Channel) this.LJLILLLLZI.getValue();
    }

    public final C32536Cpo<C74961TbR> iv0() {
        return (C32536Cpo) this.LJLJJL.getValue();
    }

    public final void kv0() {
        LiveEffect liveEffect;
        C74961TbR c74961TbR = iv0().LIZ;
        if (c74961TbR != null && (liveEffect = c74961TbR.LJ) != null) {
            C19680pw c19680pw = new C19680pw(liveEffect, "liveinteract", "", false);
            DataChannel dataChannel = this.LJLJJI;
            if (dataChannel != null) {
                dataChannel.qv0(MultiGuestSelectedStickerEvent.class, c19680pw);
            }
        }
    }

    public void jv0(String str) {
        C74961TbR c74961TbR;
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null && (c74961TbR = iv0().LIZ) != null) {
            Boolean value = c74961TbR.LIZ.getValue();
            if (value == null) {
                value = Boolean.FALSE;
            }
            o.LJIIIIZZ(value, "previewStateData.isVideoSwitchOn.value ?: false");
            dataChannel.qv0(MultiGuestV3PreviewPanelV2CloseEvent.class, new TQP(new C74600TPo(value.booleanValue(), c74961TbR.LIZJ, c74961TbR.LIZLLL, c74961TbR.LJ, c74961TbR.LJFF), str, null));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this);
            LIZ.append(" syncPreviewStateDataToPushStreamWhenDecided = ");
            LIZ.append(c74961TbR);
            C0NB.LIZIZ("AbsMultiGuestNewPreviewViewModel", X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.TbR, O] */
    public final void lv0(boolean z, boolean z2, boolean z3, int i, LiveEffect liveEffect) {
        iv0().LIZ = new C74961TbR(new MutableLiveData(Boolean.valueOf(z)), new MutableLiveData(Boolean.valueOf(z2)), z3, i, liveEffect, 32);
    }
}
