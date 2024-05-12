package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C58096Mr6;
import X.C76878UFe;
import X.HJ9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.external.IExternalAlbumService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AlbumServiceImpl implements IExternalAlbumService {
    public static IExternalAlbumService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IExternalAlbumService.class, false);
        if (LIZ != null) {
            return (IExternalAlbumService) LIZ;
        }
        if (C58096Mr6.b7 == null) {
            synchronized (IExternalAlbumService.class) {
                if (C58096Mr6.b7 == null) {
                    C58096Mr6.b7 = new AlbumServiceImpl();
                }
            }
        }
        return C58096Mr6.b7;
    }

    @Override // com.ss.android.ugc.aweme.external.IExternalAlbumService
    public final Intent LIZIZ(Context context, int i, int i2) {
        C76878UFe c76878UFe = new C76878UFe(255, 255, 4096, 4096, 20480000);
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 35);
        bundle.putBoolean("key_support_edit_after_choose", false);
        bundle.putInt("key_support_flag", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("result_code", -1);
        bundle.putInt("key_sub_emote_show_type", 0);
        bundle.putInt("key_choose_request_code", i2);
        bundle.putSerializable("key_sub_image_params", c76878UFe);
        Intent intent = new Intent(context, (Class<?>) MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i2);
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.external.IExternalAlbumService
    public final void LIZ(Fragment fragment, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Map<String, ? extends Object> logInfo, int i10) {
        String str;
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(logInfo, "logInfo");
        HashMap hashMap = new HashMap();
        hashMap.putAll(logInfo);
        C76878UFe c76878UFe = new C76878UFe(i5, i6, i7, i8, i9);
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 16);
        bundle.putBoolean("key_support_edit_after_choose", false);
        bundle.putInt("key_support_flag", i10);
        bundle.putInt("key_photo_select_max_count", i3);
        if (fragment != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            str = mo49getActivity.getString(R.string.i_q);
        } else {
            str = null;
        }
        bundle.putString("key_mv_hint_text", str);
        bundle.putInt("result_code", i2);
        bundle.putInt("key_sub_emote_show_type", i4);
        bundle.putSerializable("key_sub_log_info", hashMap);
        bundle.putSerializable("key_sub_image_params", c76878UFe);
        o.LJI(fragment);
        C16880lQ.LJII(fragment, HJ9.LIZIZ(fragment, bundle, -1, i), i);
    }
}
