package com.bytedance.android.livesdkapi.host;

import X.C29930Bos;
import X.InterfaceC06390Mx;
import X.InterfaceC29340BfM;
import X.InterfaceC29341BfN;
import X.InterfaceC62096OYq;
import X.InterfaceC64592gB;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* loaded from: classes6.dex */
public interface IHostShare extends InterfaceC06390Mx {
    Pair<String, Drawable> getBreathShareAnimShareRes(Context context, String str, String str2);

    String getBundleKey(int i);

    Dialog getLongPressShareDialog(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    Dialog getShareDialog(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    TuxSheet getShareTuxSheet(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    void getShortUrl(String str, InterfaceC29341BfN interfaceC29341BfN);

    void getUrlModelAndShowAnim(InterfaceC29340BfM interfaceC29340BfM);

    boolean isImChannel(String str);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void share(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    Boolean sharePanelRefactor();

    void shareSingleMessage(Activity activity, String str, C29930Bos c29930Bos, InterfaceC64592gB<Boolean> interfaceC64592gB);

    void shareStreamGoal(Activity activity, String str, C29930Bos c29930Bos, InterfaceC64592gB<Boolean> interfaceC64592gB);

    void shareSubInvitation(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    void shareSubscribeLink(Activity activity, C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    void showScreenTimeDialog(Bundle bundle);
}
