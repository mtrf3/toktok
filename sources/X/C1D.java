package X;

import Y.AfS4S0100100_5;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.interaction.poll.network.EndPollResponse;
import com.bytedance.android.livesdk.interaction.poll.network.PollHistoryResponse;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class C1D implements PollApi {
    public final DataChannel LIZ;
    public int LIZIZ;
    public final List<String> LIZJ = new ArrayList();
    public long LIZLLL = C30725C4b.LIZ();
    public long LJ = C30725C4b.LIZ();
    public long LJFF = 1;

    public C1D(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final void LIZ(long j) {
        PollMessage pollMessage = new PollMessage();
        pollMessage.messageType = 1L;
        pollMessage.pollKind = 2;
        pollMessage.pollId = j;
        pollMessage.endContent = new PollEndContent();
        CommonMessageData commonMessageData = new CommonMessageData();
        pollMessage.baseMessage = commonMessageData;
        commonMessageData.createTime = System.currentTimeMillis();
        C1A.LIZIZ(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), pollMessage);
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final AbstractC73672Svk<C28467BFf<PollHistoryResponse>> getPollHistory(long j) {
        return AbstractC73672Svk.LJJIJIL(new C28467BFf());
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final AbstractC73672Svk<C28467BFf<EndPollResponse>> endCustomPoll(long j, long j2, int i) {
        return endMockPoll(j, j2, i, C29306Beo.LJJIJ(this.LIZ)).LJIJJLI(new AfS4S0100100_5(j2, this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.Object] */
    @Override // com.bytedance.android.live.poll.PollApi
    public final AbstractC73672Svk<C28467BFf<EndPollResponse>> endPoll(long j, long j2, int i) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("votes", 0L);
                jSONObject.put("display_content", str);
                jSONObject.put("option_idx", 0L);
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("kind", this.LIZIZ);
        jSONObject2.put("poll_id", 0L);
        jSONObject2.put("poll_status", 1);
        jSONObject2.put("start_time", this.LIZLLL);
        jSONObject2.put("end_time", C30725C4b.LIZ());
        jSONObject2.put("poll_option_list", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("poll_data", jSONObject2);
        int intType = EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            PollOptionInfo pollOptionInfo = new PollOptionInfo();
            pollOptionInfo.displayContent = str2;
            arrayList.add(pollOptionInfo);
        }
        PollMessage pollMessage = new PollMessage();
        pollMessage.messageType = 1L;
        pollMessage.pollKind = Integer.valueOf(this.LIZIZ);
        pollMessage.pollId = this.LJFF;
        PollEndContent pollEndContent = new PollEndContent();
        pollEndContent.optionList = arrayList;
        pollEndContent.endType = i;
        pollMessage.endContent = pollEndContent;
        CommonMessageData commonMessageData = new CommonMessageData();
        pollMessage.baseMessage = commonMessageData;
        commonMessageData.createTime = C30725C4b.LIZ();
        C1A.LIZIZ(intType, pollMessage);
        ((ArrayList) this.LIZJ).clear();
        C28467BFf c28467BFf = new C28467BFf();
        c28467BFf.data = GsonProtectorUtils.fromJson(new Gson(), jSONObject3.toString(), EndPollResponse.class);
        return AbstractC73672Svk.LJJIJIL(c28467BFf);
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final InterfaceC68342mE<C28467BFf<VoteResponseData>> vote(long j, long j2, int i) {
        Object LJ;
        LJ = XKX.LJ(MBB.INSTANCE, new C1E(null));
        return (InterfaceC68342mE) LJ;
    }

    @Override // com.bytedance.android.live.poll.PollApi
    public final AbstractC73672Svk<C28467BFf<EndPollResponse>> endMockPoll(long j, long j2, int i, long j3) {
        return ((PollApi) Q7L.LIZIZ(PollApi.class)).endMockPoll(j, j2, i, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078 A[LOOP:1: B:10:0x0072->B:12:0x0078, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.Object] */
    @Override // com.bytedance.android.live.poll.PollApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC73672Svk<X.C28467BFf<com.bytedance.android.livesdk.interaction.poll.network.StartPollResponse>> startPoll(long r8, java.lang.String r10, long r11, int r13) {
        /*
            r7 = this;
            java.lang.String r6 = ""
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> L8
            r5.<init>(r10)     // Catch: java.lang.Exception -> L8
            goto Ld
        L8:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>(r6)
        Ld:
            int r0 = r5.length()
            r4 = 0
            r1 = 2
            if (r0 >= r1) goto L21
        L15:
            java.util.List<java.lang.String> r0 = r7.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r6)
            int r4 = r4 + 1
            if (r4 >= r1) goto L3c
            goto L15
        L21:
            int r3 = r5.length()
        L25:
            if (r4 >= r3) goto L3c
            java.util.List<java.lang.String> r2 = r7.LIZJ
            java.lang.Object r1 = r5.get(r4)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L33
            if (r1 != 0) goto L34
        L33:
            r1 = r6
        L34:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r1)
            int r4 = r4 + 1
            goto L25
        L3c:
            r7.LIZIZ = r13
            long r0 = X.C30725C4b.LIZ()
            r7.LIZLLL = r0
            long r0 = r0 + r11
            r7.LJ = r0
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r2 = "end_time"
            long r0 = r7.LJ
            r4.put(r2, r0)
            long r2 = r7.LJFF
            r0 = 1
            long r0 = r0 + r2
            r7.LJFF = r0
            java.lang.String r0 = "poll_id"
            r4.put(r0, r2)
            X.CYf r0 = X.EnumC31509CYf.LIVE_POLL_MESSAGE
            int r5 = r0.getIntType()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List<java.lang.String> r0 = r7.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.bytedance.android.livesdk.model.message.PollOptionInfo r0 = new com.bytedance.android.livesdk.model.message.PollOptionInfo
            r0.<init>()
            r0.displayContent = r1
            r6.add(r0)
            goto L72
        L89:
            com.bytedance.android.livesdk.model.message.PollMessage r3 = new com.bytedance.android.livesdk.model.message.PollMessage
            r3.<init>()
            r0 = 0
            r3.messageType = r0
            int r0 = r7.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.pollKind = r0
            long r0 = r7.LJFF
            r3.pollId = r0
            com.bytedance.android.livesdk.model.message.PollStartContent r2 = new com.bytedance.android.livesdk.model.message.PollStartContent
            r2.<init>()
            long r0 = r7.LIZLLL
            r2.startTime = r0
            long r0 = r7.LJ
            r2.endTime = r0
            r2.optionList = r6
            r3.startContent = r2
            com.bytedance.android.livesdkapi.message.CommonMessageData r2 = new com.bytedance.android.livesdkapi.message.CommonMessageData
            r2.<init>()
            r3.baseMessage = r2
            long r0 = X.C30725C4b.LIZ()
            r2.createTime = r0
            X.C1A.LIZIZ(r5, r3)
            X.BFf r3 = new X.BFf
            r3.<init>()
            com.google.gson.Gson r2 = new com.google.gson.Gson
            r2.<init>()
            java.lang.String r1 = r4.toString()
            java.lang.Class<com.bytedance.android.livesdk.interaction.poll.network.StartPollResponse> r0 = com.bytedance.android.livesdk.interaction.poll.network.StartPollResponse.class
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            r3.data = r0
            X.Su1 r0 = X.AbstractC73672Svk.LJJIJIL(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D.startPoll(long, java.lang.String, long, int):X.Svk");
    }
}
