package X;

import com.bytedance.android.live.effect.api.FetchGreenScreenLiveGoalInterfaceEvent;
import com.bytedance.android.live.effect.api.GreenScreenLiveGoalBlockGlobalChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.j;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CM1 extends CM3 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        int i;
        o.LJIIIZ(type, "type");
        CM2 cm2 = (CM2) ED5.LIZJ(CM2.class, null);
        j LJJIJ = InterfaceC30442Bx8.g2.LIZJ().LJJIJ("effect_position");
        if (LJJIJ != null) {
            i = LJJIJ.LJIILJJIL();
        } else {
            i = 0;
        }
        cm2.setLiveGoalBackgroundPosition(Integer.valueOf(i));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        cm2.setEffectDisabled((Boolean) dataChannelGlobal.mv0(GreenScreenLiveGoalBlockGlobalChannel.class));
        if (C29306Beo.LJJIFFI(cm2.isEffectDisabled())) {
            dataChannelGlobal.rv0(FetchGreenScreenLiveGoalInterfaceEvent.class);
        }
        cm2.setEffectDisabledToastText((String) dataChannelGlobal.mv0(C54552Cd.class));
        c37356ElM.onSuccess(cm2, "");
    }
}
