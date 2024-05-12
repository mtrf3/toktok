package X;

import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS27S1000000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4uB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124234uB implements InterfaceC138605cG {
    public final /* synthetic */ InterfaceC65784Pro<InterfaceC143655kP> LIZ;

    @Override // X.InterfaceC138605cG
    public final void LJJJJL() {
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC153045zY value;
        InterfaceC143655kP invoke = this.LIZ.invoke();
        if (invoke != null && (Kh = invoke.Kh()) != null && (value = Kh.getValue()) != null) {
            value.stop();
        }
    }

    @Override // X.InterfaceC138605cG
    public final void k3() {
        InterfaceC143655kP invoke;
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC153045zY value;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        if (!C84763XOl.LJIIJJI && (invoke = this.LIZ.invoke()) != null && (Kh = invoke.Kh()) != null && (value = Kh.getValue()) != null) {
            value.LLJILJIL(true);
            value.play();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C124234uB(InterfaceC65784Pro<? extends InterfaceC143655kP> interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC138605cG
    public final void l3(C122004qa c122004qa) {
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC153045zY value;
        InterfaceC143655kP invoke = this.LIZ.invoke();
        if (invoke != null && (Kh = invoke.Kh()) != null && (value = Kh.getValue()) != null) {
            C78841Uwv.LJJIIJZLJL("EditStickerScene#setupAudioTrack_TextStickerData", value, new AqS168S0100000_2(c122004qa, 226));
        }
    }

    @Override // X.InterfaceC138605cG
    public final void m3(String id) {
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC153045zY value;
        o.LJIIIZ(id, "id");
        InterfaceC143655kP invoke = this.LIZ.invoke();
        if (invoke != null && (Kh = invoke.Kh()) != null && (value = Kh.getValue()) != null) {
            C78841Uwv.LJJIIJZLJL("sub_textStickerDataV2", value, new AqS27S1000000_2(id, 3));
        }
    }
}
