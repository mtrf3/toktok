package com.ss.android.ugc.aweme.comment.viewerlist.viewmodel;

import X.C73969T1h;
import X.InterfaceC101453yX;
import X.InterfaceC64592gB;
import X.OSZ;
import X.T16;
import android.app.Activity;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoViewAuthorizationViewModel extends ViewModel {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final NextLiveData<OSZ<Integer, OSZ<Boolean, Map<String, String>>>> LJLIL = new NextLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r2 = java.lang.String.valueOf(r5.status_code);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        return X.JF1.LIZIZ("log_id", r3, "status_code", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001b, code lost:
    
        if (r5 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if ((r4 instanceof X.C38333F2r) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r1 = ((X.C38333F2r) r4).getRawResponse();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if ((r1 instanceof com.ss.android.ugc.aweme.base.api.BaseResponse) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = java.lang.Integer.valueOf(r1.status_code).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0045, code lost:
    
        if (r3 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map gv0(com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel r3, java.lang.Throwable r4, com.ss.android.ugc.aweme.base.api.BaseResponse r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r6 & 2
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r3.getClass()
            java.lang.String r2 = ""
            if (r5 == 0) goto L2c
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r5.extra
            if (r0 == 0) goto L1a
            java.lang.String r3 = r0.logid
            if (r3 != 0) goto L1d
        L1a:
            r3 = r2
            if (r5 == 0) goto L48
        L1d:
            int r0 = r5.status_code
            java.lang.String r2 = java.lang.String.valueOf(r0)
        L23:
            java.lang.String r1 = "log_id"
            java.lang.String r0 = "status_code"
            java.util.LinkedHashMap r0 = X.JF1.LIZIZ(r1, r3, r0, r2)
            return r0
        L2c:
            boolean r0 = r4 instanceof X.C38333F2r
            if (r0 == 0) goto L1a
            r0 = r4
            X.F2r r0 = (X.C38333F2r) r0
            java.lang.Object r1 = r0.getRawResponse()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.base.api.BaseResponse
            if (r0 == 0) goto L1a
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1
            if (r1 == 0) goto L1a
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r1.extra
            if (r0 == 0) goto L1a
            java.lang.String r3 = r0.logid
            if (r3 != 0) goto L48
            goto L1a
        L48:
            boolean r0 = r4 instanceof X.C38333F2r
            if (r0 == 0) goto L23
            X.F2r r4 = (X.C38333F2r) r4
            java.lang.Object r1 = r4.getRawResponse()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.base.api.BaseResponse
            if (r0 == 0) goto L23
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1
            if (r1 == 0) goto L23
            int r0 = r1.status_code
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L67
            goto L23
        L67:
            r2 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel.gv0(com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel, java.lang.Throwable, com.ss.android.ugc.aweme.base.api.BaseResponse, int):java.util.Map");
    }

    public final void hv0(final String str, final String str2, final String str3, final String str4, final int i, final String str5, final boolean z) {
        InterfaceC101453yX LJFF = PrivacyServiceImpl.LJIIIIZZ().LJFF();
        if (LJFF != null) {
            LJFF.LIZIZ(i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.2jb
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    String str6;
                    Activity LJIIIIZZ;
                    OSZ<Integer, OSZ<Boolean, java.util.Map<String, String>>> osz = new OSZ<>(Integer.valueOf(i), new OSZ(Boolean.TRUE, VideoViewAuthorizationViewModel.gv0(this, null, (BaseResponse) obj, 1)));
                    if ((o.LJ(str2, "personal_homepage") || !z) && i == 1) {
                        String str7 = str;
                        if (str7 == null) {
                            str7 = "";
                        }
                        C2U8.LIZ(new C2IN(str7, true));
                    }
                    if (osz.getFirst().intValue() == 1 && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null) {
                        AnonymousClass114.LIZ(LJIIIIZZ, R.string.toy);
                    }
                    VideoViewAuthorizationViewModel videoViewAuthorizationViewModel = this;
                    String str8 = str2;
                    String str9 = str3;
                    String str10 = str4;
                    String str11 = str5;
                    String valueOf = String.valueOf(i);
                    if (osz.getSecond().getFirst().booleanValue()) {
                        str6 = "1";
                    } else {
                        str6 = CardStruct.IStatusCode.DEFAULT;
                    }
                    java.util.Map<String, String> second = osz.getSecond().getSecond();
                    videoViewAuthorizationViewModel.getClass();
                    C74Z.LJI("video_views_pop_up_auth_result", str8, str9, str10, valueOf, null, str11, str6, second, 32);
                    this.LJLIL.postValue(osz);
                }
            }, new InterfaceC64592gB() { // from class: X.2jc
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    String str6;
                    Throwable th = (Throwable) obj;
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        AnonymousClass114.LIZ(LJIIIIZZ, R.string.toz);
                    }
                    OSZ<Integer, OSZ<Boolean, java.util.Map<String, String>>> osz = new OSZ<>(Integer.valueOf(i), new OSZ(Boolean.FALSE, VideoViewAuthorizationViewModel.gv0(this, th, null, 2)));
                    VideoViewAuthorizationViewModel videoViewAuthorizationViewModel = this;
                    String str7 = str2;
                    String str8 = str3;
                    String str9 = str4;
                    String str10 = str5;
                    String valueOf = String.valueOf(i);
                    if (osz.getSecond().getFirst().booleanValue()) {
                        str6 = "1";
                    } else {
                        str6 = CardStruct.IStatusCode.DEFAULT;
                    }
                    java.util.Map<String, String> second = osz.getSecond().getSecond();
                    videoViewAuthorizationViewModel.getClass();
                    C74Z.LJI("video_views_pop_up_auth_result", str7, str8, str9, valueOf, null, str10, str6, second, 32);
                    this.LJLIL.postValue(osz);
                }
            });
        }
    }
}
