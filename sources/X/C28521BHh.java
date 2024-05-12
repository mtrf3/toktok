package X;

import Y.IDcS93S0200000_5;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BHh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28521BHh implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 206;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        CommercialContentToggle commercialContentToggle;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(abstractC65782Prm));
        C28527BHn c28527BHn = (C28527BHn) DataChannelGlobal.LJLJJI.mv0(ECBcToggleChannel.class);
        if (c28527BHn != null && (commercialContentToggle = c28527BHn.LIZIZ) != null && !C78847Ux1.LJIIZILJ() && commercialContentToggle.openCommercialContentToggle && (commercialContentToggle.promoteMyself || commercialContentToggle.promoteThirdParty)) {
            Context context = bik.LIZ;
            C78847Ux1.LJJJJJ(bik.LIZIZ, "show");
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LJ(R.drawable.coa);
            c47071t1.LJIILLIIL(R.string.kyg);
            c47071t1.LJFF(R.string.kyf);
            c47071t1.LJIIL(R.string.kyd, new IDcS93S0200000_5(c84654XKg, bik, 17));
            c47071t1.LJIIIZ(R.string.kye, new IDcS93S0200000_5(c84654XKg, bik, 18));
            c47071t1.LJIILL = false;
            LiveDialog LIZ = c47071t1.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "4609402031161318462")).LIZ) {
                LIZ.show();
            }
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJLIIIIJ;
            Boolean bool = Boolean.TRUE;
            c48459J0d.LIZ(bool);
            InterfaceC30442Bx8.LJJLIIIJ.LIZ(bool);
        } else {
            Boolean bool2 = Boolean.FALSE;
            C3C5.m7constructorimpl(bool2);
            c84654XKg.resumeWith(bool2);
        }
        return c84654XKg.LIZ();
    }
}
