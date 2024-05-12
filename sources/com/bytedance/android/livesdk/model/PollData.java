package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import X.ORZ;
import Y.IDComparatorS33S0000000_5;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class PollData {

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("operator")
    public User operator;

    @InterfaceC65349Pkn("poll_id")
    public long pollId;

    @InterfaceC65349Pkn("kind")
    public int pollKind;

    @InterfaceC65349Pkn("poll_option_list")
    public List<PollOptionInfo> pollOptionList = new ArrayList();

    @InterfaceC65349Pkn("poll_status")
    public int pollStatus;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("template_id")
    public Long templateId;

    @InterfaceC65349Pkn("title")
    public String title;

    public final String LIZ() {
        if (((PollOptionInfo) ListProtector.get(this.pollOptionList, 0)).votes == ((PollOptionInfo) ListProtector.get(this.pollOptionList, 1)).votes) {
            return "tie_up";
        }
        if (((PollOptionInfo) ListProtector.get(this.pollOptionList, 0)).votes > ((PollOptionInfo) ListProtector.get(this.pollOptionList, 1)).votes) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }

    public final String LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        for (PollOptionInfo pollOptionInfo : this.pollOptionList) {
            jSONObject.put(pollOptionInfo.displayContent, String.valueOf(pollOptionInfo.votes));
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …       }\n    }.toString()");
        return jSONObject2;
    }

    public final String LIZJ() {
        List LLILII = ORZ.LLILII(new IDComparatorS33S0000000_5(5), this.pollOptionList);
        if (((PollOptionInfo) ORZ.LJLLJ(LLILII)).votes == ((PollOptionInfo) ORZ.LLFF(LLILII)).votes) {
            return "tie_up";
        }
        return ((PollOptionInfo) ORZ.LJLLJ(LLILII)).displayContent;
    }
}
