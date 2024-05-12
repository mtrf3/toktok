package X;

import android.util.Pair;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.TuV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C76143TuV implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ C76143TuV(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Object obj2;
        switch (this.LJLIL) {
            case 0:
                BaseResponse baseResponse = (BaseResponse) obj;
                T t = baseResponse.data;
                if (t != 0) {
                    ResumeResponse.ResponseData responseData = (ResumeResponse.ResponseData) t;
                    if (responseData.isResume) {
                        long j = responseData.channelId;
                        B5G.LIZIZ().LJFF = j;
                        ResumeResponse.ResponseData responseData2 = (ResumeResponse.ResponseData) baseResponse.data;
                        C76113Tu1 c76113Tu1 = new C76113Tu1(j, responseData2.rtcExtInfo, responseData2.users);
                        C0NB.LIZIZ("LinkControlPresenter", "try resume cohost");
                        C8E.LIZLLL().LJFF(c76113Tu1, null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Pair pair = (Pair) obj;
                if (pair != null && (obj2 = pair.second) != null) {
                    C006100r c006100r = (C006100r) obj2;
                    if (c006100r.LIZ == 1) {
                        Collection<? extends FeedItem> list = c006100r.LIZIZ;
                        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                        c08680Vs.getClass();
                        o.LJIIIZ(list, "list");
                        c08680Vs.LIZJ().addAll(list);
                        return;
                    }
                    return;
                }
                return;
            default:
                C36922EeM.LJFF((Throwable) obj);
                return;
        }
    }
}
