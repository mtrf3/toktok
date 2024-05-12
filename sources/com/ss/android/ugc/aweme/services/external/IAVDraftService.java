package com.ss.android.ugc.aweme.services.external;

import X.C26336AVg;
import X.C79062V1e;
import X.GPJ;
import X.GPK;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public interface IAVDraftService {

    /* loaded from: classes8.dex */
    public static final class SaveDraftByPathParam {
        public final String creationId;
        public final ISaveVideoToDraftListener listener;
        public final String shootWay;
        public final ArrayList<String> urls;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SaveDraftByPathParam copy$default(SaveDraftByPathParam saveDraftByPathParam, ArrayList arrayList, String str, String str2, ISaveVideoToDraftListener iSaveVideoToDraftListener, int i, Object obj) {
            if ((i & 1) != 0) {
                arrayList = saveDraftByPathParam.urls;
            }
            if ((i & 2) != 0) {
                str = saveDraftByPathParam.creationId;
            }
            if ((i & 4) != 0) {
                str2 = saveDraftByPathParam.shootWay;
            }
            if ((i & 8) != 0) {
                iSaveVideoToDraftListener = saveDraftByPathParam.listener;
            }
            return saveDraftByPathParam.copy(arrayList, str, str2, iSaveVideoToDraftListener);
        }

        public final SaveDraftByPathParam copy(ArrayList<String> urls, String creationId, String shootWay, ISaveVideoToDraftListener listener) {
            o.LJIIIZ(urls, "urls");
            o.LJIIIZ(creationId, "creationId");
            o.LJIIIZ(shootWay, "shootWay");
            o.LJIIIZ(listener, "listener");
            return new SaveDraftByPathParam(urls, creationId, shootWay, listener);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveDraftByPathParam)) {
                return false;
            }
            SaveDraftByPathParam saveDraftByPathParam = (SaveDraftByPathParam) obj;
            return o.LJ(this.urls, saveDraftByPathParam.urls) && o.LJ(this.creationId, saveDraftByPathParam.creationId) && o.LJ(this.shootWay, saveDraftByPathParam.shootWay) && o.LJ(this.listener, saveDraftByPathParam.listener);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SaveDraftByPathParam(urls=");
            LIZ.append(this.urls);
            LIZ.append(", creationId=");
            LIZ.append(this.creationId);
            LIZ.append(", shootWay=");
            LIZ.append(this.shootWay);
            LIZ.append(", listener=");
            LIZ.append(this.listener);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public int hashCode() {
            return this.listener.hashCode() + C79062V1e.LJ(this.shootWay, C79062V1e.LJ(this.creationId, this.urls.hashCode() * 31, 31), 31);
        }

        public final String getCreationId() {
            return this.creationId;
        }

        public final ISaveVideoToDraftListener getListener() {
            return this.listener;
        }

        public final String getShootWay() {
            return this.shootWay;
        }

        public final ArrayList<String> getUrls() {
            return this.urls;
        }

        public SaveDraftByPathParam(ArrayList<String> urls, String creationId, String shootWay, ISaveVideoToDraftListener listener) {
            o.LJIIIZ(urls, "urls");
            o.LJIIIZ(creationId, "creationId");
            o.LJIIIZ(shootWay, "shootWay");
            o.LJIIIZ(listener, "listener");
            this.urls = urls;
            this.creationId = creationId;
            this.shootWay = shootWay;
            this.listener = listener;
        }
    }

    void editPostedDraft(Context context, String str);

    boolean enableAddDraftLossMonitor();

    ExecutorService executor();

    List<String> genCreationIdsOfVisibleDraft();

    Fragment genKidDraftDetailFragment(AwemeDraft awemeDraft);

    IAVDraftFeedbackService getFeedbackService();

    boolean hasAssociationWithPostedDraft(String str);

    void loadThumbCover(AwemeDraft awemeDraft, VideoCoverConfig videoCoverConfig, IEffectService.OnVideoCoverCallback onVideoCoverCallback);

    void openDraftActivity(Context context, Bundle bundle);

    List<String> queryAllDraftsCreationIdFromDB(GPK gpk);

    List<AwemeDraft> queryDraftList(GPJ gpj);

    C26336AVg queryDraftsInfo(GPK gpk);

    void registerListener(IDraftListener iDraftListener);

    void reportDraftLostException(List<String> list);

    void saveDraft(SaveDraftByPathParam saveDraftByPathParam);

    void unregisterListener(IDraftListener iDraftListener);

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ C26336AVg queryDraftsInfo$default(IAVDraftService iAVDraftService, GPK gpk, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    boolean z = false;
                    gpk = new GPK(z, z, null, 7);
                }
                return iAVDraftService.queryDraftsInfo(gpk);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryDraftsInfo");
        }

        public static /* synthetic */ void openDraftActivity$default(IAVDraftService iAVDraftService, Context context, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = null;
                }
                iAVDraftService.openDraftActivity(context, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDraftActivity");
        }

        public static /* synthetic */ void loadThumbCover$default(IAVDraftService iAVDraftService, AwemeDraft awemeDraft, VideoCoverConfig videoCoverConfig, IEffectService.OnVideoCoverCallback onVideoCoverCallback, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    videoCoverConfig = null;
                }
                iAVDraftService.loadThumbCover(awemeDraft, videoCoverConfig, onVideoCoverCallback);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadThumbCover");
        }
    }
}
