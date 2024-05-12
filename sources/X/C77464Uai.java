package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Uai, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77464Uai extends AbstractC77466Uak {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        ActivityC45651qj activityC45651qj;
        Context context;
        InterfaceC77465Uaj interfaceC77465Uaj = (InterfaceC77465Uaj) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        FragmentManager fragmentManager = null;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
            activityC45651qj = C29306Beo.LIZJ(context);
        } else {
            activityC45651qj = null;
        }
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(activityC45651qj);
        if (LIZIZ != null) {
            fragmentManager = LIZIZ.getSupportFragmentManager();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null && room.cppVersion == 2) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).showCppUnlockGuideDialogV2(interfaceC77465Uaj.getFeatureName(), interfaceC77465Uaj.getFeatureNameET(), Boolean.valueOf(interfaceC77465Uaj.getNeedBackgroundMask()), fragmentManager);
            return;
        }
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 == null || room2.cppVersion != 1) {
            return;
        }
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).showCppUnlockGuideDialog(interfaceC77465Uaj.getFeatureName(), interfaceC77465Uaj.getFeatureNameET(), Boolean.valueOf(interfaceC77465Uaj.getNeedBackgroundMask()), fragmentManager);
    }
}
