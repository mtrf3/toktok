package com.bytedance.android.live.wallet.service.feedback;

import X.C15380j0;
import X.C77574UcU;
import X.F9J;
import X.UIF;
import android.content.SharedPreferences;
import com.bytedance.android.live.wallet.model.FeedBackList;
import com.bytedance.android.live.wallet.service.IFeedbackService;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedbackCancelFrequency;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedbackShowFrequency;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public class FeedBackService implements IFeedbackService {
    @Override // com.bytedance.android.live.wallet.service.IFeedbackService
    public final int getFeedBackEntrance(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 999 : 5;
        }
        return 4;
    }

    @Override // com.bytedance.android.live.wallet.service.IFeedbackService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C77574UcU.LIZ(this);
    }

    @Override // com.bytedance.android.live.wallet.service.IFeedbackService
    public final FeedBackList getFeedBackListItem() {
        return UIF.LIZ.LIZ;
    }

    @Override // com.bytedance.android.live.wallet.service.IFeedbackService
    public final void setFeedBackCancelCount() {
        SharedPreferences LIZIZ = F9J.LIZIZ(C15380j0.LIZLLL(), 0, "js_kv_methods_20191113");
        LIZIZ.edit().putInt("wallet_feedback_cancel_count", LIZIZ.getInt("wallet_feedback_cancel_count", 0) + 1).apply();
        SharedPreferences LIZIZ2 = F9J.LIZIZ(C15380j0.LIZLLL(), 0, "js_kv_methods_20191113");
        if (LIZIZ2.getString("wallet_feedback_date", "").equals("completed")) {
            return;
        }
        LIZIZ2.edit().putString("wallet_feedback_date", new SimpleDateFormat("dd/MM/yyyy", Locale.US).format(Long.valueOf(System.currentTimeMillis()))).apply();
    }

    @Override // com.bytedance.android.live.wallet.service.IFeedbackService
    public final void setFeedBackListCompleted() {
        SharedPreferences LIZIZ = F9J.LIZIZ(C15380j0.LIZLLL(), 0, "js_kv_methods_20191113");
        LIZIZ.getString("wallet_feedback_date", "");
        LIZIZ.edit().putString("wallet_feedback_date", "completed").apply();
    }

    @Override // com.bytedance.android.live.wallet.service.IFeedbackService
    public final boolean showFeedBackListWhenPaymentCancel() {
        if (F9J.LIZIZ(C15380j0.LIZLLL(), 0, "js_kv_methods_20191113").getInt("wallet_feedback_cancel_count", 0) >= LiveFeedbackCancelFrequency.INSTANCE.getValue()) {
            return false;
        }
        Locale locale = Locale.US;
        String format = new SimpleDateFormat("dd/MM/yyyy", locale).format(Long.valueOf(System.currentTimeMillis()));
        String string = F9J.LIZIZ(C15380j0.LIZLLL(), 0, "js_kv_methods_20191113").getString("wallet_feedback_date", "");
        if (!Objects.equals(string, "")) {
            if (Objects.equals(string, "completed")) {
                return false;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", locale);
            try {
                if (TimeUnit.DAYS.convert(Math.abs(simpleDateFormat.parse(format).getTime() - simpleDateFormat.parse(string).getTime()), TimeUnit.MILLISECONDS) < LiveFeedbackShowFrequency.INSTANCE.getValue()) {
                    return false;
                }
            } catch (ParseException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.wallet.service.IFeedbackService
    public final void setFeedBackListItem(FeedBackList feedBackList) {
        UIF.LIZ.LIZ = feedBackList;
    }
}
