package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.C10K;
import X.E8L;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;

/* loaded from: classes8.dex */
public interface SubtitleApi {
    @E8M("/tiktok/v1/videocaption/feedback/")
    @EKC({"Content-Type: application/json"})
    C10K<Object> feedback(@InterfaceC64986Pew("vid") String str, @InterfaceC64986Pew("aweme_id") String str2, @InterfaceC64986Pew("task_id") String str3, @InterfaceC195727mC FeedbackBody feedbackBody);

    @E8L("/tiktok/v1/videocaption/query/")
    InterfaceC37276Ek4<SubmitAudioBody> query(@InterfaceC64986Pew("task_id") String str);

    @E8M("/tiktok/v1/videocaption/submit/")
    InterfaceC37276Ek4<SubmitAudioBody> submit(@InterfaceC64986Pew("tos_key") String str, @InterfaceC64986Pew("max_lines") int i, @InterfaceC64986Pew("words_per_line") int i2, @InterfaceC64986Pew("selected_language") String str2);
}
