package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GO0 implements InterfaceC41392GMi {
    @Override // X.InterfaceC41392GMi
    public final DraftDBSaveResult LIZ(NDG ndg) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeDraftUpdateServiceImpl, updateDBSync creativeInfo : ");
        LIZ.append(((AwemeDraft) ndg.LJLILLLLZI).LIZIZ());
        LIZ.append(" , , trace : ");
        LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        return C45804HyK.LJJLJLI(ndg);
    }

    @Override // X.InterfaceC41392GMi
    public final void LIZJ(IAVDraftService.SaveDraftByPathParam saveDraftByPathParams) {
        o.LJIIIZ(saveDraftByPathParams, "saveDraftByPathParams");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = saveDraftByPathParams.getUrls().iterator();
        while (it.hasNext()) {
            String next = it.next();
            MediaModel mediaModel = new MediaModel(-1L);
            mediaModel.fileLocalUriPath = next;
            mediaModel.date = System.currentTimeMillis();
            mediaModel.type = 4;
            VEUtils.VEVideoFileInfo vEVideoFileInfo = VEUtils.getVEVideoFileInfo(next);
            if (vEVideoFileInfo != null) {
                mediaModel.width = vEVideoFileInfo.width;
                mediaModel.height = vEVideoFileInfo.height;
                mediaModel.duration = vEVideoFileInfo.duration;
                mediaModel.mimeType = vEVideoFileInfo.formatName;
                mediaModel.speed = 1.0f;
            }
            arrayList.add(mediaModel);
        }
        if (arrayList.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SaveDraftByPath");
            LIZ.append(" -> mediaList is null");
            H7B.LIZ(X1D.LIZIZ(LIZ));
            ISaveVideoToDraftListener.DefaultImpls.onFailed$default(saveDraftByPathParams.getListener(), null, 1, null);
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C41939Gd5(arrayList, new CreativeInfo(saveDraftByPathParams.getCreationId(), 0, null, 6, null), saveDraftByPathParams, null), 3);
    }

    @Override // X.InterfaceC41392GMi
    public final void LJI(GPP gpp) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeDraftUpdateServiceImpl, deleteAsync , creativeInfo : ");
        LIZ.append(gpp.LIZ.LIZIZ());
        LIZ.append(" , trace : ");
        LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new GLU(gpp, null), 3);
    }

    @Override // X.InterfaceC41392GMi
    public final Object LJII(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeDraftUpdateServiceImpl, clear beyond expiry data draft, , trace : ");
        LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        Object LIZ2 = GO2.LIZ.LIZ(interfaceC67352kd);
        if (LIZ2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ2;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC41392GMi
    public final Object LIZLLL(NDG ndg, InterfaceC67352kd<? super DraftDBSaveResult> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeDraftUpdateServiceImpl, updateDB creativeInfo : ");
        LIZ.append(((AwemeDraft) ndg.LJLILLLLZI).LIZIZ());
        LIZ.append(" , , trace : ");
        LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        return XKX.LJI(C78613UtF.LIZJ, new C41391GMh(ndg, null), interfaceC67352kd);
    }

    @Override // X.InterfaceC41392GMi
    public final Object LJFF(GPP gpp, InterfaceC67352kd<? super GLV> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeDraftUpdateServiceImpl, delete creativeInfo : ");
        LIZ.append(gpp.LIZ.LIZIZ());
        LIZ.append(" , , trace : ");
        LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        return XKX.LJI(C78613UtF.LIZJ, new GPQ(gpp, null), interfaceC67352kd);
    }

    @Override // X.InterfaceC41392GMi
    public final Object LIZIZ(C41021G8b c41021G8b, InterfaceC88472Yns<? super AwemeDraft, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C142535ib> interfaceC67352kd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeDraftUpdateServiceImpl, save , creativeInfo : ");
        LIZ.append(c41021G8b.LJLIL.creativeInfo);
        LIZ.append(" , trace : ");
        LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        return GX4.LIZ(c41021G8b, interfaceC88472Yns, interfaceC67352kd);
    }

    @Override // X.InterfaceC41392GMi
    public final void LJ(C41021G8b params, GI1 listener, InterfaceC88472Yns<? super AwemeDraft, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(listener, "listener");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeDraftUpdateServiceImpl, saveAsync , creativeInfo : ");
        LIZ.append(params.LJLIL.creativeInfo);
        LIZ.append(" , trace : ");
        LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
        GPR.LIZJ(X1D.LIZIZ(LIZ));
        XKX.LIZLLL(C48841JEv.LIZ(C150985wE.LIZ), null, null, new GLN(this, params, interfaceC88472Yns, listener, null), 3);
    }
}
