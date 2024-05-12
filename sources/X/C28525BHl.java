package X;

import Y.IDcS16S0300000_5;
import android.content.Context;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BHl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28525BHl implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 204;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        int i;
        Object obj;
        C28531BHr c28531BHr;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(abstractC65782Prm));
        C28527BHn c28527BHn = (C28527BHn) DataChannelGlobal.LJLJJI.mv0(ECBcToggleChannel.class);
        if (c28527BHn != null && (c28531BHr = c28527BHn.LIZ) != null) {
            i = c28531BHr.LIZ;
        } else {
            i = -1;
        }
        DataChannel dataChannel = bik.LIZIZ;
        if (dataChannel != null) {
            obj = dataChannel.kv0(LiveModeChannel.class);
        } else {
            obj = null;
        }
        if (ORZ.LJLJJI(obj, C47261Igj.LJJIJIIJI(LiveMode.VIDEO, LiveMode.THIRD_PARTY)) && !C78847Ux1.LJIIZILJ() && c28527BHn != null && i == 1) {
            Context context = bik.LIZ;
            C78847Ux1.LJJJJJ(bik.LIZIZ, "show");
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LJ(R.drawable.coa);
            c47071t1.LJIILLIIL(R.string.kyg);
            c47071t1.LJFF(R.string.kyf);
            c47071t1.LJIIL(R.string.kyd, new IDcS16S0300000_5(c84654XKg, c28527BHn, bik, 1));
            c47071t1.LJIIIZ(R.string.kye, new IDcS16S0300000_5(c84654XKg, c28527BHn, bik, 2));
            c47071t1.LJIILL = false;
            LiveDialog LIZ = c47071t1.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "8959254103479033552")).LIZ) {
                LIZ.show();
            }
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJLIIIIJ;
            Boolean bool = Boolean.TRUE;
            c48459J0d.LIZ(bool);
            InterfaceC30442Bx8.LJJLIIIJ.LIZ(bool);
            c28527BHn.LJFF.invoke(EnumC28526BHm.DIALOG_SHOW);
        } else {
            Boolean bool2 = Boolean.FALSE;
            C3C5.m7constructorimpl(bool2);
            c84654XKg.resumeWith(bool2);
        }
        return c84654XKg.LIZ();
    }
}
