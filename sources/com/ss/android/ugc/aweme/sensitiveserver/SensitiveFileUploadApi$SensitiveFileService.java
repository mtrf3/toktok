package com.ss.android.ugc.aweme.sensitiveserver;

import X.C10K;
import X.E8M;
import X.ENY;
import X.InterfaceC64977Pen;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;

/* loaded from: classes7.dex */
public interface SensitiveFileUploadApi$SensitiveFileService {
    @ENY
    @E8M("/pssresource/external/upload")
    C10K<String> uploadSensitiveFile(@InterfaceC64977Pen("file") TypedFile typedFile, @InterfaceC64977Pen("app_id") Integer num, @InterfaceC64977Pen("channel_key") TypedString typedString, @InterfaceC64977Pen("ftype") Integer num2);
}
