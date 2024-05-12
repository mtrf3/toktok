package com.bytedance.android.live.actionhandler;

import X.InterfaceC06390Mx;
import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public interface IActionHandlerService extends InterfaceC06390Mx {
    boolean canHandle(Uri uri);

    boolean handle(Context context, Uri uri);

    boolean handle(Context context, String str);

    boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map);

    boolean handleWithoutHost(Context context, String str);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void postReportReason(long j, long j2, long j3, String str);

    boolean showUserProfile(long j);

    boolean showUserProfile(long j, String str, Map<String, String> map);
}
