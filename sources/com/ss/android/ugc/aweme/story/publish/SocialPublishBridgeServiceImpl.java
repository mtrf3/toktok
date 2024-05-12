package com.ss.android.ugc.aweme.story.publish;

import X.C41759GaB;
import X.C58096Mr6;
import X.InterfaceC88472Yns;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SocialPublishBridgeServiceImpl implements ISocialPublishBridgeService {
    public final Map<SocialPublishCallback, InterfaceC88472Yns<PublishModel, Boolean>> LIZ = new LinkedHashMap();

    public static ISocialPublishBridgeService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ISocialPublishBridgeService.class, false);
        if (LIZ != null) {
            return (ISocialPublishBridgeService) LIZ;
        }
        if (C58096Mr6.p7 == null) {
            synchronized (ISocialPublishBridgeService.class) {
                if (C58096Mr6.p7 == null) {
                    C58096Mr6.p7 = new SocialPublishBridgeServiceImpl();
                }
            }
        }
        return C58096Mr6.p7;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPublishStart,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        Map<SocialPublishCallback, InterfaceC88472Yns<PublishModel, Boolean>> map = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Boolean) ((InterfaceC88472Yns) entry.getValue()).invoke(publishModel)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it.next()).getKey()).onPublishStart(publishModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReadyToCreateAweme,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        Map<SocialPublishCallback, InterfaceC88472Yns<PublishModel, Boolean>> map = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Boolean) ((InterfaceC88472Yns) entry.getValue()).invoke(publishModel)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it.next()).getKey()).onReadyToCreateAweme(publishModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService
    public final void LJIIJJI(SocialPublishCallback callback, InterfaceC88472Yns<? super PublishModel, Boolean> trigger) {
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(trigger, "trigger");
        this.LIZ.put(callback, trigger);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, PublishModel publishModel) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPublishProgress,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        Map<SocialPublishCallback, InterfaceC88472Yns<PublishModel, Boolean>> map = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Boolean) ((InterfaceC88472Yns) entry.getValue()).invoke(publishModel)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it.next()).getKey()).onPublishProgress(i, publishModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        String str;
        o.LJIIIZ(createAwemeResponse, "createAwemeResponse");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPublishSuccess,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        Map<SocialPublishCallback, InterfaceC88472Yns<PublishModel, Boolean>> map = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Boolean) ((InterfaceC88472Yns) entry.getValue()).invoke(publishModel)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it.next()).getKey()).onPublishSuccess(publishModel, createAwemeResponse);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthetiseSuccess(PublishModel publishModel, String path) {
        String str;
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSynthetiseSuccess,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        Map<SocialPublishCallback, InterfaceC88472Yns<PublishModel, Boolean>> map = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Boolean) ((InterfaceC88472Yns) entry.getValue()).invoke(publishModel)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it.next()).getKey()).onSynthetiseSuccess(publishModel, path);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C41759GaB exception, String errorMsg) {
        String str;
        o.LJIIIZ(exception, "exception");
        o.LJIIIZ(errorMsg, "errorMsg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPublishFailed,creationID:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        Map<SocialPublishCallback, InterfaceC88472Yns<PublishModel, Boolean>> map = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Boolean) ((InterfaceC88472Yns) entry.getValue()).invoke(publishModel)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((SocialPublishCallback) ((Map.Entry) it.next()).getKey()).onPublishFailed(publishModel, exception, errorMsg);
        }
    }
}
