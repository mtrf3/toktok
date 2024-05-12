package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryWrapperFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.Ahk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26940Ahk extends AbstractC26906AhC implements InterfaceC60061Nhh {
    public DeliveryPanelStarter.PackedDeliverySelectResult LJLJI;

    @Override // X.AbstractC26906AhC
    public final void LIZ(Bundle bundle) {
    }

    @Override // X.AbstractC26906AhC
    public final void LIZIZ(DialogInterface dialogInterface) {
    }

    @Override // X.AbstractC26906AhC
    public final void LJFF(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
    }

    @Override // X.AbstractC26906AhC
    public final void LJI() {
    }

    @Override // X.AbstractC26906AhC
    public final void onCreate(Bundle bundle) {
    }

    @Override // X.AbstractC26906AhC
    public final void LIZLLL() {
        DeliveryPanelStarter deliveryPanelStarter = DeliveryPanelStarter.LIZ;
        DeliveryPanelStarter.PackedDeliverySelectResult result = this.LJLJI;
        deliveryPanelStarter.getClass();
        o.LJIIIZ(result, "result");
        C84654XKg c84654XKg = DeliveryPanelStarter.LIZIZ;
        if (c84654XKg != null) {
            C3C5.m7constructorimpl(result);
            c84654XKg.resumeWith(result);
        }
        DeliveryPanelStarter.LIZIZ = null;
        EventCenter.LJ().LIZIZ("ec_delivery_panel_close", this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26940Ahk(DeliveryWrapperFragment fragment, DeliveryPanelViewModel viewModel) {
        super(fragment, viewModel);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(viewModel, "viewModel");
        this.excludeStatusBar = false;
        this.LJLJI = new DeliveryPanelStarter.PackedDeliverySelectResult(null, null, null, null, null, null, 63, null);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_delivery_panel_close")) {
            DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = null;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LIZLLL(DeliveryPanelStarter.PackedDeliverySelectResult.class)));
                if (!(fromJson instanceof DeliveryPanelStarter.PackedDeliverySelectResult)) {
                    fromJson = null;
                }
                packedDeliverySelectResult = (DeliveryPanelStarter.PackedDeliverySelectResult) fromJson;
            } catch (s unused) {
            }
            if (packedDeliverySelectResult == null) {
                return;
            }
            this.LJLJI = packedDeliverySelectResult;
            this.LJLIL.dismiss();
        }
    }

    @Override // X.AbstractC26906AhC
    public final View LIZJ(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        EventCenter.LJ().LIZJ("ec_delivery_panel_close", this);
        if (this.LJLIL.mo49getActivity() != null) {
            AbstractC60482NoU fallbackView = getFallbackView();
            if (fallbackView != null) {
                fallbackView.LIZJ(this.LJLIL);
                return fallbackView;
            }
            return fallbackView;
        }
        return null;
    }
}
