package com.ss.android.ugc.aweme.uploader.retrofit;

import X.C76L;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64985Pev;
import X.InterfaceC64992Pf2;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import java.util.Map;

/* loaded from: classes8.dex */
public interface UploaderRetrofitService {
    @InterfaceC195787mI
    @E4T("/material/resource/api/ugc_video_template/token")
    C76L<UploadAuthKeyConfig> getUgcTemplateUploadAuthKeyConfig(@InterfaceC64985Pev("creation_id") String str, @InterfaceC64985Pev("type") String str2);

    @InterfaceC195787mI
    @E4T("/aweme/v1/upload/authkey/")
    C76L<UploadAuthKeyConfig> getUploadAuthKeyConfig(@InterfaceC64992Pf2 Map<String, String> map);

    @InterfaceC195787mI
    @E4T("/material/resource/api/ugc_video_template/binding")
    C76L<String> ugcTemplateVideoBinding(@InterfaceC64985Pev("item_id") String str, @InterfaceC64985Pev("vid") String str2, @InterfaceC64985Pev("track_id") String str3, @InterfaceC64985Pev("type") String str4);
}
