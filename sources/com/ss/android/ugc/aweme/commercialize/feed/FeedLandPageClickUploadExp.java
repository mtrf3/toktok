package com.ss.android.ugc.aweme.commercialize.feed;

import X.C16880lQ;
import X.EF7;
import X.NN1;
import X.RunnableC58335Mux;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FeedLandPageClickUploadExp implements WeakHandler.IHandler {
    public static final WeakHandler HANDLER;
    public static final FeedLandPageClickUploadExp INSTANCE;
    public static RunnableC58335Mux mContentLoadedCallback;

    static {
        FeedLandPageClickUploadExp feedLandPageClickUploadExp = new FeedLandPageClickUploadExp();
        INSTANCE = feedLandPageClickUploadExp;
        HANDLER = new WeakHandler(feedLandPageClickUploadExp);
    }

    public static final void clearDelayedPostMessage() {
        HANDLER.removeMessages(1048577);
        mContentLoadedCallback = null;
    }

    public static final void onLandPageContentLoaded() {
        RunnableC58335Mux runnableC58335Mux = mContentLoadedCallback;
        if (runnableC58335Mux != null) {
            runnableC58335Mux.run();
        }
        mContentLoadedCallback = null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Bundle data;
        if (message == null || message.what != 1048577 || (data = message.getData()) == null) {
            return;
        }
        try {
            String string = data.getString("refer");
            Serializable serializable = data.getSerializable("aweme_raw_data");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.AwemeRawAd");
            NN1.LJJIIJ(EF7.LIZIZ(), (AwemeRawAd) serializable, string);
            message.setData(null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void logFeedRawAdClick(Context context, Aweme aweme, String str) {
        Integer valueOf;
        if (context == null) {
            return;
        }
        int i = 0;
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (valueOf = Integer.valueOf(awemeRawAd.getLeftSlideClickType())) != null) {
                if (valueOf.intValue() == 0) {
                    NN1.LJJIII(context, aweme, str);
                    return;
                }
                if (valueOf.intValue() == 1) {
                    return;
                }
                if (valueOf.intValue() == 2) {
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 == null || (i = awemeRawAd2.getLeftSlideClickDuration()) >= 10) {
                    }
                    WeakHandler weakHandler = HANDLER;
                    weakHandler.removeMessages(1048577);
                    try {
                        Message obtain = Message.obtain();
                        obtain.what = 1048577;
                        Bundle bundle = new Bundle();
                        bundle.putString("refer", str);
                        bundle.putSerializable("aweme_raw_data", aweme.getAwemeRawAd());
                        obtain.setData(bundle);
                        weakHandler.sendMessageDelayed(obtain, i * 1000);
                        return;
                    } catch (Throwable unused) {
                        NN1.LJJIII(context, aweme, str);
                        return;
                    }
                }
                if (valueOf.intValue() == 3) {
                    mContentLoadedCallback = new RunnableC58335Mux(aweme, str);
                    return;
                }
            }
            NN1.LJJIII(context, aweme, str);
        }
    }
}
