package com.bytedance.android.livesdkapi.host;

import X.C45456Hsi;
import X.C73030SlO;
import X.C76878UFe;
import X.C76882UFi;
import X.C76883UFj;
import X.InterfaceC06390Mx;
import X.InterfaceC65349Pkn;
import X.UGZ;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes14.dex */
public interface IHostSubscription extends InterfaceC06390Mx {

    /* loaded from: classes14.dex */
    public static final class Params {

        @InterfaceC65349Pkn("emotes_show_style")
        public int emotesShowStyle;

        @InterfaceC65349Pkn("logInfo")
        public Map<String, ? extends Object> logInfo = new HashMap();

        @InterfaceC65349Pkn("max_count")
        public int max_count;

        @InterfaceC65349Pkn("max_height")
        public int max_height;

        @InterfaceC65349Pkn("max_size")
        public int max_size;

        @InterfaceC65349Pkn("max_width")
        public int max_width;

        @InterfaceC65349Pkn("min_height")
        public int min_height;

        @InterfaceC65349Pkn("min_width")
        public int min_width;
    }

    /* loaded from: classes14.dex */
    public static final class Result {
        public int LIZ;
        public int LIZIZ;

        @InterfaceC65349Pkn("originFiles")
        public PhotoFile[] originFiles;

        @InterfaceC65349Pkn("tempFiles")
        public PhotoFile[] tempFiles;

        /* loaded from: classes14.dex */
        public static final class PhotoFile {

            @InterfaceC65349Pkn("base64Data")
            public String base64;

            @InterfaceC65349Pkn("path")
            public String path;

            @InterfaceC65349Pkn("size")
            public int size;

            @InterfaceC65349Pkn("with_text_sticker")
            public int withTextSticker;
        }
    }

    void Ed(C76882UFi c76882UFi);

    void G30(Context context, int i, String str);

    void Hh(C76883UFj c76883UFj);

    void Hm(Context context, String str, String str2, String str3, String str4, Integer num, String str5);

    void Me0(Context context, AqS171S0100000_5 aqS171S0100000_5);

    Result QL(Fragment fragment, Intent intent, Params params);

    void RX(C76883UFj c76883UFj, String str, String str2);

    String V00(Context context, Uri uri);

    void W30(C45456Hsi c45456Hsi);

    void WX(Context context, String str, String str2, String str3, String str4, int i, String str5);

    void ZV(Context context, String str, String str2, String str3, Integer num, String str4, String str5, int i, C73030SlO c73030SlO);

    void gW(Context context, String str, int i, boolean z, int i2, boolean z2, boolean z3, UGZ ugz);

    void gx(Fragment fragment, int i, int i2, int i3, int i4, C76878UFe c76878UFe, Map<String, ? extends Object> map);

    List<LiveSubMediaModel> jy(Intent intent);

    void m10(Context context, AqS171S0100000_5 aqS171S0100000_5);

    Result uV(Fragment fragment, List<LiveSubMediaModel> list, Params params, boolean z);

    void yY(Context context);
}
