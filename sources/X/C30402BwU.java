package X;

import Y.IDDListenerS145S0100000_5;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.FinishPreviewBlockInfoEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveContinueDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BwU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30402BwU implements InterfaceC30388BwG {
    public final Fragment LIZ;
    public final DataChannel LIZIZ;
    public InterfaceC30405BwX LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Boolean LJFF;

    @Override // X.InterfaceC30388BwG
    public final boolean LIZ() {
        Boolean bool;
        LiveMode liveMode;
        if (!this.LIZLLL && !C29306Beo.LJJ(this.LJFF) && this.LJ) {
            DataChannel dataChannel = this.LIZIZ;
            Boolean bool2 = null;
            if (dataChannel == null || dataChannel.kv0(PreviewBlockInfoChannel.class) == null) {
                DataChannel dataChannel2 = this.LIZIZ;
                if (dataChannel2 != null) {
                    bool = (Boolean) dataChannel2.kv0(LiveAccessTipsShowChannel.class);
                } else {
                    bool = null;
                }
                if (!C29306Beo.LJJIFFI(bool)) {
                    DataChannel dataChannel3 = this.LIZIZ;
                    if (dataChannel3 != null && (liveMode = (LiveMode) dataChannel3.kv0(BCX.class)) != null) {
                        bool2 = Boolean.valueOf(C28509BGv.LJ(liveMode));
                    }
                    if (C29306Beo.LJJIFFI(bool2)) {
                        return LIZIZ();
                    }
                }
            }
        }
        return false;
    }

    public final boolean LIZIZ() {
        Boolean bool;
        InterfaceC30405BwX interfaceC30405BwX;
        LiveDialog dialog;
        if (this.LIZJ == null) {
            this.LIZJ = ((IGameService) CN1.LIZ(IGameService.class)).uE(this.LIZ);
        }
        InterfaceC30405BwX interfaceC30405BwX2 = this.LIZJ;
        if (interfaceC30405BwX2 != null) {
            bool = Boolean.valueOf(interfaceC30405BwX2.LJJLIIJ());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && (interfaceC30405BwX = this.LIZJ) != null && (dialog = interfaceC30405BwX.getDialog()) != null) {
            dialog.setOnDismissListener(new IDDListenerS145S0100000_5(this, 1));
            this.LIZLLL = true;
            C29182Bco.LIZ().LIZ(dialog, EnumC30559Bz1.HIGH, new C30403BwV(this), this.LIZIZ, null);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC30388BwG
    public final void dismiss() {
        InterfaceC30405BwX interfaceC30405BwX = this.LIZJ;
        if (interfaceC30405BwX != null) {
            interfaceC30405BwX.dismiss();
        }
    }

    public C30402BwU(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
        this.LIZIZ = dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(fragment, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 37));
            dataChannel.ov0(fragment, FinishPreviewBlockInfoEvent.class, new AqS171S0100000_5(this, 38));
            dataChannel.ov0(fragment, GameLiveContinueDialogShowChannel.class, new AqS171S0100000_5(this, 39));
        }
    }
}
