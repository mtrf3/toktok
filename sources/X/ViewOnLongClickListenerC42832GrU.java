package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.config.HashtagFeedbackValue;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackFragment;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import org.json.JSONObject;

/* renamed from: X.GrU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnLongClickListenerC42832GrU implements View.OnLongClickListener {
    public final /* synthetic */ C42830GrS LJLIL;
    public final /* synthetic */ RecommendHashtag LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJI;

    public ViewOnLongClickListenerC42832GrU(C42830GrS c42830GrS, RecommendHashtag recommendHashtag, AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLIL = c42830GrS;
        this.LJLILLLLZI = recommendHashtag;
        this.LJLJI = aqS173S0100000_7;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        FeedbackOptionValue[] feedbackOptionValueArr;
        FragmentManager supportFragmentManager;
        String str;
        String str2;
        String str3;
        HashtagFeedbackValue LIZ = C42834GrW.LIZ();
        List<RecommendHashtag> list = null;
        if (LIZ != null) {
            feedbackOptionValueArr = LIZ.feedbackOptionValues;
        } else {
            feedbackOptionValueArr = null;
        }
        boolean z = false;
        if (feedbackOptionValueArr != null && feedbackOptionValueArr.length != 0 && !C162496Zh.LJIIIIZZ) {
            HashTagMobHelper hashTagMobHelper = this.LJLIL.LJLJI;
            if (hashTagMobHelper != null) {
                RecommendHashtag recommendHashtag = this.LJLILLLLZI;
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str4 = hashTagMobHelper.LJLIL;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    jSONObject.put("creation_id", str4);
                    if (recommendHashtag == null || (str = recommendHashtag.getChallengeName()) == null) {
                        str = "";
                    }
                    jSONObject.put("hashtag", str);
                    if (recommendHashtag == null || (str2 = recommendHashtag.getQueryId()) == null) {
                        str2 = "";
                    }
                    jSONObject.put("query_id", str2);
                    RecommendHashtagResponse recommendHashtagResponse = C162496Zh.LJFF;
                    if (recommendHashtagResponse != null) {
                        list = recommendHashtagResponse.items;
                    }
                    jSONObject.put("hashtag_list", HashTagMobHelper.gv0(list));
                    if (recommendHashtag == null || (str3 = recommendHashtag.getLogId()) == null) {
                        str3 = "";
                    }
                    jSONObject.put("log_id", str3);
                    jSONObject.put("feedback_cnt", String.valueOf(C162496Zh.LJII));
                    C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
                    String LJ = C41930Gcw.LJ();
                    if (LJ != null) {
                        str5 = LJ;
                    }
                    jSONObject.put("tos_key", str5);
                    FMX.LJIILJJIL("hashtag_recommendation_feedback_page_show", jSONObject);
                } catch (ClassCastException | NullPointerException | Exception unused) {
                }
            }
            KeyboardStateViewModel keyboardStateViewModel = this.LJLIL.LJLJJI;
            if (keyboardStateViewModel != null) {
                Boolean value = keyboardStateViewModel.LJLIL.getValue();
                if (value != null) {
                    z = value.booleanValue();
                }
                keyboardStateViewModel.LJLJI = z;
            }
            HashtagFeedbackFragment hashtagFeedbackFragment = new HashtagFeedbackFragment();
            ASL asl = new ASL();
            asl.LIZ.LJZI = true;
            asl.LJI(1);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = hashtagFeedbackFragment;
            tuxSheet.LJLLJ = true;
            asl.LJFF(16);
            C42830GrS c42830GrS = this.LJLIL;
            DialogInterfaceOnDismissListenerC42833GrV dialogInterfaceOnDismissListenerC42833GrV = new DialogInterfaceOnDismissListenerC42833GrV(c42830GrS, hashtagFeedbackFragment, this.LJLILLLLZI, this.LJLJI);
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJLILLLLZI = dialogInterfaceOnDismissListenerC42833GrV;
            ActivityC45651qj LJ2 = C1DG.LJ(c42830GrS.itemView, "itemView.context");
            if (LJ2 != null && (supportFragmentManager = LJ2.getSupportFragmentManager()) != null) {
                tuxSheet2.show(supportFragmentManager, "hashtag_feedback");
                C162496Zh.LJIIIIZZ = true;
            }
        }
        return true;
    }
}
