package com.ss.android.ugc.aweme.effectcreator.services;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C46125I8j;
import X.C47261Igj;
import X.C77412UZs;
import X.C78605Ut7;
import X.C93556aSm;
import X.C94129ac1;
import X.C94130ac2;
import X.C94131ac3;
import X.C94354afe;
import X.H78;
import X.HJ9;
import X.HVR;
import X.W5I;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.effectcreatormobile.ckeapi.api.album.EditMedia;
import com.bytedance.effectcreatormobile.ckeapi.api.album.IAlbumService;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokAlbumServiceImpl implements IAlbumService {
    public static final C93556aSm Companion = new C93556aSm();

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.album.IAlbumService
    public int getResultCode() {
        return -1;
    }

    public final Bundle getChooseImageBundle(C94354afe c94354afe) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 10);
        Effect effect = new Effect(null, 1, null);
        effect.setExtra("{\"upload_image_max\":3,\"image_input_height\":1280,\"image_input_width\":720,\"upload_image_uncompressed_max\":10}");
        bundle.putParcelable("key_custom_effect_sticker", effect);
        bundle.putInt("key_photo_select_min_count", c94354afe.LJLILLLLZI);
        bundle.putInt("key_photo_select_max_count", c94354afe.LJLILLLLZI);
        bundle.putInt("key_video_select_min_count", 0);
        bundle.putInt("key_max_gif_size", 3);
        bundle.putInt("key_max_compress_width", 720);
        bundle.putInt("key_max_compress_height", 1280);
        bundle.putInt("key_support_flag", 1);
        return bundle;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.album.IAlbumService
    public List<EditMedia> parseIntentData(Intent intent, Integer num) {
        CustomStickerInfo customStickerInfo;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tiktok album service result = ");
        LIZ.append(intent);
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (intent != null && intent.hasExtra("custom_sticker") && intent.hasExtra("custom_sticker_image_info") && (customStickerInfo = (CustomStickerInfo) intent.getParcelableExtra("custom_sticker_image_info")) != null) {
            return C47261Igj.LJJIJIL(new EditMedia(customStickerInfo.path, false));
        }
        return new ArrayList();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.album.IAlbumService
    public void startSelectMedia(Fragment fragment, int i, C94354afe filterData) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(filterData, "filterData");
        W5I.LIZ().LIZLLL.LIZIZ(C94129ac1.LJLIL);
        if (C46125I8j.LIZIZ()) {
            Bundle chooseImageBundle = getChooseImageBundle(filterData);
            chooseImageBundle.putString("shoot_way", "");
            chooseImageBundle.putString("content_source", "cke");
            chooseImageBundle.putString("content_type", "");
            C77412UZs.LJJIJLIJ(chooseImageBundle, new CreativeInfo(null, 0, null, 7, null));
            C16880lQ.LJII(fragment, HJ9.LIZIZ(fragment, chooseImageBundle, 10004, 10004), i);
            return;
        }
        Context requireContext = fragment.requireContext();
        o.LJII(requireContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        HVR.LJ((ActivityC45651qj) requireContext, new C94130ac2(this, filterData, fragment, i), null, null, null, TokenCert.Companion.with((String) C78605Ut7.LJIIJ("bpea-request_storage_permission_effect_creator_target33", "bpea-request_storage_permission_effect_creator")), 28);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.album.IAlbumService
    public void startSelectMedia(ActivityC45651qj activity, int i, C94354afe filterData) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(filterData, "filterData");
        W5I.LIZ().LIZLLL.LIZIZ(C94131ac3.LJLIL);
        Bundle chooseImageBundle = getChooseImageBundle(filterData);
        chooseImageBundle.putString("shoot_way", "");
        chooseImageBundle.putString("content_source", "cke");
        chooseImageBundle.putString("content_type", "");
        C77412UZs.LJJIJLIJ(chooseImageBundle, new CreativeInfo(null, 0, null, 7, null));
        HJ9.LJ(activity, chooseImageBundle, 10004, i);
    }
}
