package X;

import android.text.Editable;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackCell;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackViewModel;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KSR implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ HashtagFeedbackCell LJLIL;
    public final /* synthetic */ KSI LJLILLLLZI;

    public KSR(HashtagFeedbackCell hashtagFeedbackCell, KSI ksi) {
        this.LJLIL = hashtagFeedbackCell;
        this.LJLILLLLZI = ksi;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        Editable text;
        if (z) {
            HashtagFeedbackViewModel L = this.LJLIL.L();
            FeedbackOptionValue feedbackOptionValue = this.LJLILLLLZI.LJLIL;
            String str2 = null;
            if (feedbackOptionValue != null) {
                str = feedbackOptionValue.logInfo;
            } else {
                str = null;
            }
            boolean z2 = false;
            if (feedbackOptionValue != null && (!feedbackOptionValue.shouldShowInputAreaAfterSelect || (feedbackOptionValue.shouldShowInputAreaAfterSelect && (text = ((C26018AJa) this.LJLIL.itemView.findViewById(R.id.cpu)).getEditText().getText()) != null && text.length() != 0))) {
                z2 = true;
            }
            L.getClass();
            if (str != null) {
                L.withState(new KSQ(L, str, z2));
            }
            HashTagMobHelper hashTagMobHelper = this.LJLIL.LJLILLLLZI;
            if (hashTagMobHelper != null) {
                FeedbackOptionValue feedbackOptionValue2 = this.LJLILLLLZI.LJLIL;
                if (feedbackOptionValue2 != null) {
                    str2 = feedbackOptionValue2.logInfo;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str3 = hashTagMobHelper.LJLIL;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("creation_id", str3);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put("to_status", str2);
                    C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
                    String LJ = C41930Gcw.LJ();
                    if (LJ != null) {
                        str4 = LJ;
                    }
                    jSONObject.put("tos_key", str4);
                    FMX.LJIILJJIL("choose_hashtag_recommendation_feedback_type", jSONObject);
                } catch (ClassCastException | NullPointerException | Exception unused) {
                }
            }
        }
    }
}
