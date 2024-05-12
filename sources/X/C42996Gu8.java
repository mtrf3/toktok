package X;

import Y.AfS59S0100000_7;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ad.feed.dialog.DislikeReasonApi;
import com.ss.android.ugc.aweme.ad.feed.dialog.FeedAdDislikeSubReasonDialog;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Gu8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C42996Gu8 extends TBS implements InterfaceC88473Ynt<String, String, Integer, C76800UCe> {
    public C42996Gu8(Object obj) {
        super(3, obj, FeedAdDislikeSubReasonDialog.class, "onViewHolderClick", "onViewHolderClick(Ljava/lang/String;Ljava/lang/String;I)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, String p1, Integer num) {
        String str2;
        String str3;
        String str4;
        String str5;
        String roomId;
        InterfaceC42995Gu7 callback;
        String p0 = str;
        int intValue = num.intValue();
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        FeedAdDislikeSubReasonDialog feedAdDislikeSubReasonDialog = (FeedAdDislikeSubReasonDialog) this.receiver;
        feedAdDislikeSubReasonDialog.LJLILLLLZI = false;
        feedAdDislikeSubReasonDialog.dismiss();
        C42998GuA vl = feedAdDislikeSubReasonDialog.vl();
        if (vl != null && (callback = vl.getCallback()) != null) {
            callback.onDismiss();
        }
        ActivityC45651qj mo49getActivity = feedAdDislikeSubReasonDialog.mo49getActivity();
        if (mo49getActivity != null) {
            C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
            c26045AKb.LJIIIZ(p0);
            c26045AKb.LJIIJ();
        }
        FMX.LJIIL("dislike_subcategory", C78920UyC.LIZJ(intValue, "option_id").LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reasons", p1);
        C73318Sq2 c73318Sq2 = feedAdDislikeSubReasonDialog.LJLJI;
        DislikeReasonApi.LIZ.getClass();
        DislikeReasonApi dislikeReasonApi = (DislikeReasonApi) RetrofitFactory.LIZLLL().LIZ(C42997Gu9.LIZIZ).LJFF().LIZ.LIZ(DislikeReasonApi.class);
        C42998GuA vl2 = feedAdDislikeSubReasonDialog.vl();
        String str6 = "";
        if (vl2 == null || (str2 = vl2.getAid()) == null) {
            str2 = "";
        }
        C42998GuA vl3 = feedAdDislikeSubReasonDialog.vl();
        if (vl3 == null || (str3 = vl3.getAdId()) == null) {
            str3 = "";
        }
        C42998GuA vl4 = feedAdDislikeSubReasonDialog.vl();
        if (vl4 == null || (str4 = vl4.getCreativeId()) == null) {
            str4 = "";
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "dislikeReasonJson.toString()");
        C42998GuA vl5 = feedAdDislikeSubReasonDialog.vl();
        if (vl5 == null || (str5 = vl5.getLogExtra()) == null) {
            str5 = "";
        }
        C42998GuA vl6 = feedAdDislikeSubReasonDialog.vl();
        if (vl6 != null && (roomId = vl6.getRoomId()) != null) {
            str6 = roomId;
        }
        c73318Sq2.LIZ(dislikeReasonApi.submitReason(str2, str3, str4, jSONObject2, str5, str6).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(feedAdDislikeSubReasonDialog, 58), new AfS59S0100000_7(feedAdDislikeSubReasonDialog, 59)));
        return C76800UCe.LIZ;
    }
}
