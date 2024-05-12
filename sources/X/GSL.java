package X;

import Y.ACallableS110S0100000_7;
import Y.IDComparatorS35S0000000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GSL implements GJQ {
    public static final boolean LIZLLL(VideoPublishEditModel editModel) {
        boolean z;
        AVUploadSaveModel saveModel;
        List<String> imageModeLocalPaths;
        o.LJIIIZ(editModel, "editModel");
        boolean isSaveLocal = editModel.isSaveLocal();
        if (H7R.LJJJJL(editModel)) {
            if (isSaveLocal && (saveModel = editModel.getSaveModel()) != null && (imageModeLocalPaths = saveModel.getImageModeLocalPaths()) != null && !imageModeLocalPaths.isEmpty()) {
                return true;
            }
            return false;
        }
        String localTempPath = editModel.getLocalTempPath();
        if (localTempPath == null || localTempPath.length() == 0 || !C1B6.LIZIZ(localTempPath) || C78496UrM.LIZ(localTempPath) <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (isSaveLocal && z) {
            return true;
        }
        return false;
    }

    public static final void LJ(Context context) {
        o.LJIIIZ(context, "context");
        C10K.LIZJ(new ACallableS110S0100000_7(context, 0));
    }

    public static final int[] LJI(VideoPublishEditModel model) {
        List<CreateAnchorInfo> list;
        o.LJIIIZ(model, "model");
        ArrayList arrayList = new ArrayList();
        try {
            PublishExtensionModel publishExtensionModel = (PublishExtensionModel) new Gson().LJI(model.commerceData, PublishExtensionModel.class);
            if (publishExtensionModel != null && (list = publishExtensionModel.createAnchorInfos) != null) {
                for (CreateAnchorInfo createAnchorInfo : list) {
                    if (createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || createAnchorInfo.getType() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                        arrayList.add(Integer.valueOf(EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()));
                    } else {
                        arrayList.add(Integer.valueOf(createAnchorInfo.getType()));
                    }
                }
            }
        } catch (Exception unused) {
        }
        Collections.reverse(arrayList);
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS35S0000000_7(0));
        }
        return ORZ.LLJ(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            java.lang.String r3 = r7.commerceData
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L9a
            r2.<init>()     // Catch: java.lang.Exception -> L9a
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel> r0 = com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel.class
            java.lang.Object r0 = r2.LJI(r3, r0)     // Catch: java.lang.Exception -> L9a
            com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel) r0     // Catch: java.lang.Exception -> L9a
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L89
            java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r0 = r0.createAnchorInfos     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L89
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Exception -> L9a
        L20:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L89
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Exception -> L9a
            com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo r4 = (com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo) r4     // Catch: java.lang.Exception -> L9a
            int r3 = r4.getType()     // Catch: java.lang.Exception -> L9a
            X.Gt8 r0 = X.EnumC42934Gt8.ANCHOR_SHOP_WINDOW     // Catch: java.lang.Exception -> L9a
            int r0 = r0.getTYPE()     // Catch: java.lang.Exception -> L9a
            java.lang.String r2 = ","
            if (r3 != r0) goto L43
            java.lang.String r0 = "product"
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            r1.append(r2)     // Catch: java.lang.Exception -> L9a
            goto L20
        L43:
            X.Gt8 r0 = X.EnumC42934Gt8.UG_PICK     // Catch: java.lang.Exception -> L9a
            int r0 = r0.getTYPE()     // Catch: java.lang.Exception -> L9a
            if (r3 != r0) goto L56
            java.lang.String r0 = r4.getSubtype()     // Catch: java.lang.Exception -> L9a
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            r1.append(r2)     // Catch: java.lang.Exception -> L9a
            goto L20
        L56:
            X.Gt8 r0 = X.EnumC42934Gt8.MUSIC_PLAYLIST     // Catch: java.lang.Exception -> L9a
            int r0 = r0.getTYPE()     // Catch: java.lang.Exception -> L9a
            if (r3 != r0) goto L69
            java.lang.String r0 = r4.getSubtype()     // Catch: java.lang.Exception -> L9a
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            r1.append(r2)     // Catch: java.lang.Exception -> L9a
            goto L20
        L69:
            X.Gt8 r0 = X.EnumC42934Gt8.LEMON8_ANCHOR     // Catch: java.lang.Exception -> L9a
            int r0 = r0.getTYPE()     // Catch: java.lang.Exception -> L9a
            if (r3 != r0) goto L72
            goto L7d
        L72:
            X.Gt8 r0 = X.EnumC42934Gt8.LEMON8_GENERAL_ANCHOR     // Catch: java.lang.Exception -> L9a
            int r0 = r0.getTYPE()     // Catch: java.lang.Exception -> L9a
            if (r3 != r0) goto L7b
            goto L7d
        L7b:
            r0 = 0
            goto L7e
        L7d:
            r0 = 1
        L7e:
            if (r0 == 0) goto L20
            java.lang.String r0 = "Lemon8"
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            r1.append(r2)     // Catch: java.lang.Exception -> L9a
            goto L20
        L89:
            int r0 = r1.length()     // Catch: java.lang.Exception -> L9a
            if (r0 <= 0) goto L90
            r7 = 1
        L90:
            if (r7 == 0) goto L9a
            int r0 = r1.length()     // Catch: java.lang.Exception -> L9a
            int r0 = r0 - r6
            r1.setLength(r0)     // Catch: java.lang.Exception -> L9a
        L9a:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "anchors.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSL.LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    public static final List<AVTextExtraStruct> LJIIIIZZ(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = C73030SlO.LJII(str).iterator();
        while (it.hasNext()) {
            String hashtag = (String) it.next();
            o.LJIIIIZZ(hashtag, "hashtag");
            int LJJLIIIJL = s.LJJLIIIJL(str, hashtag, 0, false, 6);
            if (LJJLIIIJL >= 0) {
                AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
                aVTextExtraStruct.type = 1;
                aVTextExtraStruct.hashTagName = ujb.o.LJJJJZ(hashtag, "#", "", false);
                aVTextExtraStruct.start = LJJLIIIJL;
                aVTextExtraStruct.end = hashtag.length() + LJJLIIIJL;
                arrayList.add(aVTextExtraStruct);
            }
        }
        return arrayList;
    }

    public static final void LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        H8G.LIZJ(videoPublishEditModel, false, false, "", null);
    }

    public final String LJIIIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        return GTX.LIZ(model);
    }

    public static final int LIZJ(Context context, VideoPublishEditModel model) {
        GSN gsn;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(model, "model");
        C60903NvH.LJIIJJI().LJJIIJ();
        IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
        if (iToolsVQEvaluationService != null) {
            iToolsVQEvaluationService.LIZ();
        }
        if (C1DG.LJIIIIZZ()) {
            gsn = GSN.NORMAL_PUBLISH;
        } else {
            boolean LJ = C19N.LJ("tool_enable_privacy_preupload_switch", false);
            boolean enablePreUpload = C60903NvH.LJIIJJI().LJJIL().getEnablePreUpload(false);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enablePreUploadByBusiness switchEnable:");
            LIZ.append(LJ);
            LIZ.append(" authkeyEnable:");
            LIZ.append(enablePreUpload);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            if (LJ && enablePreUpload && C1B8.LIZJ() && !C1DG.LJIIIIZZ() && C78596Usy.LJIIJJI(context)) {
                gsn = GSN.PRE_PUBLISH;
            } else if (C78596Usy.LJIIJJI(context)) {
                gsn = GSN.PRE_SYNTHETIC;
            } else {
                gsn = GSN.NORMAL_PUBLISH;
            }
        }
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("publishType: ");
        LIZ2.append(gsn);
        LIZIZ.LIZJ("calculatePublishType", X1D.LIZIZ(LIZ2));
        int i = GSM.LIZ[gsn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 1;
                }
                if (i == 4) {
                    return 2;
                }
                throw new C162476Zf();
            }
            return 0;
        }
        return -1;
    }

    public static final void LJIIJ(VideoPublishEditModel videoPublishEditModel, C147335qL c147335qL) {
        String title = videoPublishEditModel.getTitle();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c147335qL.LJLIL);
        String str = "";
        if (title == null) {
            title = "";
        }
        LIZ.append(title);
        videoPublishEditModel.setTitle(X1D.LIZIZ(LIZ));
        List<AVTextExtraStruct> structList = videoPublishEditModel.getStructList();
        if (structList == null) {
            videoPublishEditModel.setStructList(c147335qL.LJLILLLLZI);
        } else {
            for (AVTextExtraStruct aVTextExtraStruct : structList) {
                aVTextExtraStruct.start = c147335qL.LJLIL.length() + aVTextExtraStruct.start;
                aVTextExtraStruct.end = c147335qL.LJLIL.length() + aVTextExtraStruct.end;
            }
            videoPublishEditModel.setStructList(ORZ.LLIIIZ(structList, c147335qL.LJLILLLLZI));
        }
        String chain = videoPublishEditModel.getChain();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(c147335qL.LJLIL);
        if (chain != null) {
            str = chain;
        }
        LIZ2.append(str);
        videoPublishEditModel.setChain(X1D.LIZIZ(LIZ2));
        videoPublishEditModel.setDisableDeleteChain(c147335qL.LJLJI);
    }

    public static final void LJIILJJIL(C41021G8b c41021G8b, GI1 listener) {
        o.LJIIIZ(listener, "listener");
        GI3.LJII(new G8P(c41021G8b, listener));
    }

    public final void LJFF(int i, VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        AVUploadSaveModel saveModel = model.getSaveModel();
        model.setSaveModel(C46104I7o.LJIJI(model.creativeInfo, saveModel, i, false, GJP.LJLIL, H7R.LJJJJLL(model), false));
    }

    public final void LJIIL(ActivityC45651qj activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        GI3.LJII(new G8R(activity, bundle, null));
    }

    public final AVUploadSaveModel LJIILIIL(CreativeInfo creativeInfo, boolean z) {
        return C46104I7o.LJIJI(creativeInfo, null, 1, false, GJP.LJLIL, z, false);
    }

    @Override // X.GJQ
    public final AVUploadSaveModel LIZIZ(VideoPublishEditModel model, int i, boolean z, InterfaceC46109I7t interfaceC46109I7t, boolean z2) {
        o.LJIIIZ(model, "model");
        return C46104I7o.LJIJI(model.creativeInfo, model.getSaveModel(), i, z, interfaceC46109I7t, H7R.LJJJJLL(model), z2);
    }

    @Override // X.GJQ
    public final void LIZ(Activity activity, VideoPublishEditModel model, boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns, Bundle bundle) {
        Bundle bundle2 = bundle;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(model, "model");
        H8E h8e = new H8E();
        if (bundle2 == null) {
            bundle2 = C16880lQ.LLJJIJI(activity.getIntent());
        }
        H8E.LJIIIIZZ(h8e, activity, model, z, null, z2, interfaceC88472Yns, bundle2, 32);
    }
}
