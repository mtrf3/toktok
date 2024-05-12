package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.PrivateEmoteDetail;
import emotes.model.SubEmoteDetailResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CIu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31108CIu<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ int LJLIL;

    public C31108CIu(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        PrivateEmoteDetail privateEmoteDetail;
        List<EmoteModel> list;
        BaseResponse t = (BaseResponse) obj;
        o.LJIIIZ(t, "t");
        ArrayList arrayList = new ArrayList();
        int i = this.LJLIL;
        T t2 = t.data;
        if (t2 != null && ((SubEmoteDetailResult) t2).getStableEmoteDetail() != null && ((SubEmoteDetailResult) t.data).getStableEmoteDetail().getEmoteList() != null) {
            List<EmoteModel> emoteList = ((SubEmoteDetailResult) t.data).getStableEmoteDetail().getEmoteList();
            o.LJIIIIZZ(emoteList, "t.data.stableEmoteDetail.emoteList");
            arrayList.addAll(emoteList);
        }
        T t3 = t.data;
        if (t3 != null && ((SubEmoteDetailResult) t3).getEmoteConfig() != null && ((SubEmoteDetailResult) t.data).getEmoteConfig().defaultEmoteList != null) {
            List<EmoteModel> list2 = ((SubEmoteDetailResult) t.data).getEmoteConfig().defaultEmoteList;
            o.LJIIIIZZ(list2, "t.data.emoteConfig.defaultEmoteList");
            arrayList.addAll(list2);
        }
        SubEmoteDetailResult subEmoteDetailResult = (SubEmoteDetailResult) t.data;
        if (subEmoteDetailResult != null && (privateEmoteDetail = subEmoteDetailResult.privateEmoteDetail) != null && (list = privateEmoteDetail.emoteList) != null) {
            arrayList.addAll(list);
        }
        HashMap<Integer, List<String>> hashMap = C31106CIs.LJII;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EmoteModel) it.next()).emoteId);
        }
        hashMap.put(valueOf, arrayList2);
        return arrayList;
    }
}
