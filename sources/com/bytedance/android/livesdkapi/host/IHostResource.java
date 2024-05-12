package com.bytedance.android.livesdkapi.host;

import X.AbstractC61537ODd;
import X.C31061Ju;
import X.InterfaceC06390Mx;
import android.content.Context;
import android.graphics.Typeface;
import com.bytedance.android.livesdk.livesetting.model.GeckoLiveGroupOpt;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IHostResource extends InterfaceC06390Mx {
    boolean Br0(String str);

    GeckoXNetImpl Ct(Context context);

    void FN(AbstractC61537ODd abstractC61537ODd, String str);

    Typeface Hj(int i);

    void K00(String str);

    Map<String, Integer> Ql0();

    boolean Sz();

    void Te0(String str);

    boolean Ue(String str);

    File Vw(String str, String str2);

    String WK();

    String d1();

    Map<String, String> eg0();

    String getAccessKey();

    boolean h50(Context context, String str);

    List<String> hp(String str, String str2);

    void l60();

    void mo0();

    void nr(boolean z);

    String oI(Context context);

    GeckoLiveGroupOpt uF();

    List<C31061Ju> vm();

    boolean xi();

    Map<String, String> xv();

    String yg();
}
