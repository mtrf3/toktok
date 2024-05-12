package X;

import Y.IDDListenerS145S0100000_5;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.FinishPreviewBlockInfoEvent;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BwT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30401BwT implements InterfaceC30388BwG {
    public final Fragment LIZ;
    public final DataChannel LIZIZ;
    public InterfaceC30405BwX LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Boolean LJFF;

    @Override // X.InterfaceC30388BwG
    public final boolean LIZ() {
        Boolean bool;
        Boolean bool2;
        InterfaceC30405BwX interfaceC30405BwX;
        LiveDialog dialog;
        LiveMode liveMode;
        if (!this.LIZLLL && !C29306Beo.LJJ(this.LJFF) && this.LJ) {
            DataChannel dataChannel = this.LIZIZ;
            Boolean bool3 = null;
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
                    } else {
                        bool2 = null;
                    }
                    if (C29306Beo.LJJIFFI(bool2)) {
                        if (this.LIZJ == null) {
                            this.LIZJ = ((IGameService) CN1.LIZ(IGameService.class)).JF(this.LIZ);
                        }
                        InterfaceC30405BwX interfaceC30405BwX2 = this.LIZJ;
                        if (interfaceC30405BwX2 != null) {
                            bool3 = Boolean.valueOf(interfaceC30405BwX2.LJJLIIJ());
                        }
                        if (C29306Beo.LJJIFFI(bool3) && (interfaceC30405BwX = this.LIZJ) != null && (dialog = interfaceC30405BwX.getDialog()) != null) {
                            dialog.setOnDismissListener(new IDDListenerS145S0100000_5(this, 0));
                            C29182Bco.LIZ().LIZ(dialog, EnumC30559Bz1.HIGH, new C30404BwW(this), this.LIZIZ, null);
                            this.LIZLLL = true;
                            return true;
                        }
                    }
                }
            }
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

    public C30401BwT(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
        this.LIZIZ = dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(fragment, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 35));
            dataChannel.ov0(fragment, FinishPreviewBlockInfoEvent.class, new AqS171S0100000_5(this, 36));
        }
    }
}
