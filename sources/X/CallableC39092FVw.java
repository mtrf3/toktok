package X;

import com.ss.android.ugc.aweme.BuildConfigAllServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: X.FVw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class CallableC39092FVw implements Callable {
    public final Callable LJLIL;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        if (BuildConfigAllServiceImpl.LIZJ().LIZIZ()) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                inputStream = EF7.LIZIZ().getAssets().open("feed_response.json");
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (Throwable unused) {
                            C37247Ejb.LIZ.getClass();
                            C36871EdX.LIZ(inputStream);
                            C36871EdX.LIZ(byteArrayOutputStream);
                            return null;
                        }
                    }
                    FeedItemList feedItemList = (FeedItemList) GsonHolder.LIZLLL().LIZ().LJI(new String(byteArrayOutputStream.toByteArray()), FeedItemList.class);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    long j = FW5.LJIIL;
                    if (currentTimeMillis2 < j) {
                        Thread.sleep(j - currentTimeMillis2);
                    }
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(inputStream);
                    C36871EdX.LIZ(byteArrayOutputStream);
                    return feedItemList;
                } catch (Throwable unused2) {
                    byteArrayOutputStream = null;
                }
            } catch (Throwable unused3) {
                inputStream = null;
                byteArrayOutputStream = null;
            }
        } else {
            AwemeService.LIZ();
            FW1.LJFF.LIZJ();
            FeedItemList data = C39079FVj.LIZIZ.LIZ().getData();
            C56662Kg.LIZ().LJFF("feed_api_to_ui_response", false);
            C56662Kg.LIZ().LIZJ("feed_ui_response_to_post_msg", false);
            if (data != null) {
                if (!data.isFromLocalCache) {
                    FFX.LIZ(1, "data_preload_is_loaded");
                    FFX.LIZ("preload", "data_type");
                    return data;
                }
                long j2 = C1A7.LJIIL().LIZ.getLong("key_feed_cache_time", 0L);
                if (System.currentTimeMillis() - j2 <= 0) {
                    FW5.LJII(j2, data, false);
                    FFX.LIZ(1, "data_preload_is_loaded");
                    FFX.LIZ("preload", "data_type");
                    return data;
                }
                FW5.LJII(j2, data, true);
            } else {
                FW5.LJII(0L, null, false);
            }
            FFX.LIZ("common_fetch", "data_type");
            return this.LJLIL.call();
        }
    }

    public CallableC39092FVw(Callable callable) {
        this.LJLIL = callable;
    }
}
