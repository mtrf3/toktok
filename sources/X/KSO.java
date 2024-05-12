package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackCell;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackViewModel;
import kotlin.jvm.internal.AqS51S0110000_8;

/* loaded from: classes9.dex */
public final class KSO implements TextWatcher {
    public final /* synthetic */ KSI LJLIL;
    public final /* synthetic */ HashtagFeedbackCell LJLILLLLZI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String str;
        FeedbackOptionValue feedbackOptionValue = this.LJLIL.LJLIL;
        if (feedbackOptionValue != null && (str = feedbackOptionValue.logInfo) != null) {
            this.LJLILLLLZI.L().LJLIL.put(str, String.valueOf(editable));
        }
        HashtagFeedbackViewModel L = this.LJLILLLLZI.L();
        if (String.valueOf(editable).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        L.getClass();
        L.withState(new AqS51S0110000_8(L, !z, 3));
    }

    public KSO(HashtagFeedbackCell hashtagFeedbackCell, KSI ksi) {
        this.LJLIL = ksi;
        this.LJLILLLLZI = hashtagFeedbackCell;
    }
}
