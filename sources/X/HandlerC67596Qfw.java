package X;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import com.ss.android.ugc.aweme.core.AppWidgetSchedulerService;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Qfw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC67596Qfw extends Handler {
    public final Context LIZ;
    public final AppWidgetSchedulerService LIZIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Integer num;
        Integer num2;
        int[] iArr;
        int[] iArr2;
        Float f;
        String str;
        int[] iArr3;
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        o.LJII(obj, "null cannot be cast to non-null type android.app.job.JobParameters");
        JobParameters jobParameters = (JobParameters) obj;
        if (msg.what != 1) {
            this.LIZIZ.jobFinished(jobParameters, false);
            return;
        }
        PersistableBundle extras = jobParameters.getExtras();
        int[] iArr4 = null;
        if (extras != null) {
            num = Integer.valueOf(extras.getInt("app_widget_type"));
        } else {
            num = null;
        }
        PersistableBundle extras2 = jobParameters.getExtras();
        if (extras2 != null) {
            num2 = Integer.valueOf(extras2.getInt("app_widghet_layout_id"));
        } else {
            num2 = null;
        }
        PersistableBundle extras3 = jobParameters.getExtras();
        if (extras3 != null) {
            iArr = extras3.getIntArray("app_widget_ids");
        } else {
            iArr = null;
        }
        PersistableBundle extras4 = jobParameters.getExtras();
        if (extras4 != null) {
            iArr2 = extras4.getIntArray("app_widget_video_cover_image_view_ids");
        } else {
            iArr2 = null;
        }
        PersistableBundle extras5 = jobParameters.getExtras();
        if (extras5 != null) {
            f = Float.valueOf((float) extras5.getDouble("app_widget_video_cover_aspect_ratio", 1.0d));
        } else {
            f = null;
        }
        PersistableBundle extras6 = jobParameters.getExtras();
        if (extras6 == null || (str = extras6.getString("app_log_desc")) == null) {
            str = "";
        }
        PersistableBundle extras7 = jobParameters.getExtras();
        if (extras7 != null) {
            iArr3 = extras7.getIntArray("topic_cover_px_size");
        } else {
            iArr3 = null;
        }
        PersistableBundle extras8 = jobParameters.getExtras();
        if (extras8 != null) {
            iArr4 = extras8.getIntArray("video_cover_px_size");
        }
        C56378MAs.LIZLLL(this.LIZ, num, num2, iArr2, f, iArr, str, iArr3, iArr4, null, new AqS142S0200000_11(this, jobParameters, 3), 512);
    }

    public HandlerC67596Qfw(Context context, AppWidgetSchedulerService service) {
        o.LJIIIZ(service, "service");
        this.LIZ = context;
        this.LIZIZ = service;
    }
}
