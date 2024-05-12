package com.ss.android.ugc.aweme.services.video;

import X.C41802Gas;
import X.C43679HCh;
import X.H7B;
import X.X1D;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoCoverServiceImpl implements IVideoCoverService {
    @Override // com.ss.android.ugc.aweme.services.video.IVideoCoverService
    public void getVideoCoverByCallback(final AwemeDraft draft, final IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        IFilterService filterService;
        FilterBean filter;
        String filterFilePath;
        o.LJIIIZ(draft, "draft");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(draft.LJ());
        EffectPointModel effectPointModel = draft.LIZ.editEffectModel.timeEffect;
        if (effectPointModel != null) {
            arrayList.add(effectPointModel);
            if (TextUtils.equals(effectPointModel.getKey(), "1")) {
                z = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DraftBoxViewHolder SetCoverImage EffectPointModelList:");
                LIZ.append(arrayList);
                LIZ.append("\n filterId:");
                LIZ.append(draft.LJJJJI.filterId);
                H7B.LJ(X1D.LIZIZ(LIZ));
                IEffectService.OnVideoCoverCallback onVideoCoverCallback2 = new IEffectService.OnVideoCoverCallback() { // from class: com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1
                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                    public void onGetVideoCoverFailed(int i) {
                        IEffectService.OnVideoCoverCallback onVideoCoverCallback3 = onVideoCoverCallback;
                        if (onVideoCoverCallback3 != null) {
                            onVideoCoverCallback3.onGetVideoCoverFailed(i);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                    public void onGetVideoCoverSuccess(Bitmap bitmap) {
                        o.LJIIIZ(bitmap, "bitmap");
                        Bitmap mergeCoverTextImage = VideoCoverServiceImpl.this.mergeCoverTextImage(bitmap, draft.LJJJJI.coverPublishModel);
                        IEffectService.OnVideoCoverCallback onVideoCoverCallback3 = onVideoCoverCallback;
                        if (onVideoCoverCallback3 != null) {
                            onVideoCoverCallback3.onGetVideoCoverSuccess(mergeCoverTextImage);
                        }
                    }
                };
                filterService = AVServiceImpl.LIZ().getFilterService();
                if (filterService == null && (filter = filterService.getFilter(draft.LJIIL)) != null && (filterFilePath = filter.getFilterFilePath()) != null) {
                    C43679HCh.LIZ(arrayList, filterFilePath, draft.LJFF(), (int) (draft.LJJIJLIJ * 1000), z, C41802Gas.LIZJ(draft), null, onVideoCoverCallback2);
                    return;
                }
                return;
            }
        }
        z = false;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DraftBoxViewHolder SetCoverImage EffectPointModelList:");
        LIZ2.append(arrayList);
        LIZ2.append("\n filterId:");
        LIZ2.append(draft.LJJJJI.filterId);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        IEffectService.OnVideoCoverCallback onVideoCoverCallback22 = new IEffectService.OnVideoCoverCallback() { // from class: com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public void onGetVideoCoverFailed(int i) {
                IEffectService.OnVideoCoverCallback onVideoCoverCallback3 = onVideoCoverCallback;
                if (onVideoCoverCallback3 != null) {
                    onVideoCoverCallback3.onGetVideoCoverFailed(i);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public void onGetVideoCoverSuccess(Bitmap bitmap) {
                o.LJIIIZ(bitmap, "bitmap");
                Bitmap mergeCoverTextImage = VideoCoverServiceImpl.this.mergeCoverTextImage(bitmap, draft.LJJJJI.coverPublishModel);
                IEffectService.OnVideoCoverCallback onVideoCoverCallback3 = onVideoCoverCallback;
                if (onVideoCoverCallback3 != null) {
                    onVideoCoverCallback3.onGetVideoCoverSuccess(mergeCoverTextImage);
                }
            }
        };
        filterService = AVServiceImpl.LIZ().getFilterService();
        if (filterService == null) {
        }
    }

    public final Bitmap mergeCoverTextImage(Bitmap bitmap, CoverPublishModel coverPublishModel) {
        if (coverPublishModel == null) {
            return bitmap;
        }
        return coverPublishModel.getEffectTextModel().mergeCoverText(bitmap);
    }
}
