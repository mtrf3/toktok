package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackSettings;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E61 {
    public final Keva LIZ = Keva.getRepo("realtime_feedback_repo");
    public RealtimeFeedbackSettings.RealtimeFeedbackModel LIZIZ = (RealtimeFeedbackSettings.RealtimeFeedbackModel) SettingsManager.LIZLLL().LJIIIIZZ("realtime_feedback_setting", RealtimeFeedbackSettings.RealtimeFeedbackModel.class, RealtimeFeedbackSettings.LIZ);
    public final C62822Ol8 LIZJ;

    public final boolean LIZ() {
        Gson gson;
        if (!((Boolean) this.LIZJ.getValue()).booleanValue() || this.LIZ.getBoolean("new_user_over_hundred_videos", false) || this.LIZ.getBoolean("kill_switch", false)) {
            return false;
        }
        RealtimeFeedbackSettings.RealtimeFeedbackModel realtimeFeedbackModel = this.LIZIZ;
        if (realtimeFeedbackModel != null && realtimeFeedbackModel.isServerConfig) {
            if (realtimeFeedbackModel.shouldUpload != 1) {
                return false;
            }
        } else {
            String storedSettings = this.LIZ.getString("realtime_feedback_settings", "");
            try {
                gson = new Gson();
                o.LJIIIIZZ(storedSettings, "storedSettings");
            } catch (Exception unused) {
            }
            if (storedSettings.length() > 0) {
                RealtimeFeedbackSettings.RealtimeFeedbackModel realtimeFeedbackModel2 = (RealtimeFeedbackSettings.RealtimeFeedbackModel) gson.LJI(storedSettings, RealtimeFeedbackSettings.RealtimeFeedbackModel.class);
                this.LIZIZ = realtimeFeedbackModel2;
                if (realtimeFeedbackModel2 == null || realtimeFeedbackModel2.shouldUpload != 1) {
                    return false;
                }
            } else {
                RealtimeFeedbackSettings.RealtimeFeedbackModel realtimeFeedbackModel3 = (RealtimeFeedbackSettings.RealtimeFeedbackModel) SettingsManager.LIZLLL().LJIIIIZZ("realtime_feedback_setting", RealtimeFeedbackSettings.RealtimeFeedbackModel.class, RealtimeFeedbackSettings.LIZ);
                if (realtimeFeedbackModel3 != null && realtimeFeedbackModel3.isServerConfig) {
                    this.LIZIZ = realtimeFeedbackModel3;
                    this.LIZ.storeString("realtime_feedback_settings", gson.LJIILL(realtimeFeedbackModel3));
                }
                RealtimeFeedbackSettings.RealtimeFeedbackModel realtimeFeedbackModel4 = this.LIZIZ;
                if (realtimeFeedbackModel4 == null || realtimeFeedbackModel4.shouldUpload != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public E61() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 110));
        this.LIZJ = LIZIZ;
        LIZIZ.getValue();
    }
}
