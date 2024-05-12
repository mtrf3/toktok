package com.ss.android.ugc.aweme.sticker;

import X.AbstractC73672Svk;
import X.C113554cx;
import X.C160646Se;
import X.C221108m2;
import X.C61878OQg;
import X.C62822Ol8;
import X.C73969T1h;
import X.C76800UCe;
import X.E8L;
import X.EnumC160626Sc;
import X.GXR;
import X.InterfaceC64592gB;
import X.InterfaceC65349Pkn;
import X.InterfaceC88472Yns;
import X.T16;
import Y.AfS1S0100100_2;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursSuggestTopic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AddYoursStickerTopicRepo {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C160646Se.LJLIL);
    public Map<EnumC160626Sc, ? extends List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic>> LIZIZ = C113554cx.LJJJLIIL();

    /* loaded from: classes3.dex */
    public interface Api {
        @E8L("/tiktok/v1/addyours/topic/suggest")
        AbstractC73672Svk<Response> getTopics();
    }

    public final void LIZIZ(final InterfaceC88472Yns<? super Map<EnumC160626Sc, ? extends List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic>>, C76800UCe> successCallback) {
        o.LJIIIZ(successCallback, "successCallback");
        if (!this.LIZIZ.isEmpty()) {
            successCallback.invoke(this.LIZIZ);
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            ((Api) this.LIZ.getValue()).getTopics().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.6SR
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> list;
                    int i;
                    AddYoursStickerTopicRepo.Response response = (AddYoursStickerTopicRepo.Response) obj;
                    AddYoursStickerTopicRepo addYoursStickerTopicRepo = AddYoursStickerTopicRepo.this;
                    int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
                    String valueOf = String.valueOf(response.statusCode);
                    String str = response.statusMsg;
                    addYoursStickerTopicRepo.getClass();
                    AddYoursStickerTopicRepo.LIZ(currentTimeMillis2, valueOf, str);
                    Integer num = response.statusCode;
                    if (num == null || num.intValue() != 0 || (list = response.topics) == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic : list) {
                        if (C78685UuP.LJJJZ(addYoursStickerTopicRepoApi$AddYoursSuggestTopic.getText())) {
                            arrayList.add(addYoursStickerTopicRepoApi$AddYoursSuggestTopic);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic2 = (AddYoursStickerTopicRepoApi$AddYoursSuggestTopic) it.next();
                        Integer type = addYoursStickerTopicRepoApi$AddYoursSuggestTopic2.getType();
                        if (type == null || type.intValue() != 2) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        arrayList2.add(AddYoursStickerTopicRepoApi$AddYoursSuggestTopic.copy$default(addYoursStickerTopicRepoApi$AddYoursSuggestTopic2, null, null, Integer.valueOf(i), 3, null));
                    }
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    AddYoursStickerTopicRepo.this.LIZIZ = C113554cx.LJJL(new OSZ(EnumC160626Sc.HOT, ORZ.LLILLL(arrayList2, arrayList2.size() / 3)), new OSZ(EnumC160626Sc.RECOMMEND, ORZ.LLIIZ(arrayList2, new C40517FvF((arrayList2.size() / 3) + 1, arrayList2.size() - 1))));
                    successCallback.invoke(AddYoursStickerTopicRepo.this.LIZIZ);
                }
            }, new AfS1S0100100_2(currentTimeMillis, this, 0));
        }
    }

    /* loaded from: classes3.dex */
    public static final class Response {

        @InterfaceC65349Pkn("status_code")
        public final Integer statusCode;

        @InterfaceC65349Pkn("status_msg")
        public final String statusMsg;

        @InterfaceC65349Pkn("suggest_topics")
        public final List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> topics;

        public Response() {
            this(null, null, null, 7, null);
        }

        public Response(List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> list, Integer num, String statusMsg) {
            o.LJIIIZ(statusMsg, "statusMsg");
            this.topics = list;
            this.statusCode = num;
            this.statusMsg = statusMsg;
        }

        public Response(List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str);
        }
    }

    public static void LIZ(int i, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", i);
            jSONObject.put("status_code", str);
            jSONObject.put("status_msg", str2);
            GXR.LIZIZ("request_add_yours_topic_suggest_info", jSONObject);
        } catch (Exception unused) {
        }
    }
}
