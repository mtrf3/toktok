package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.AbstractC90763hI;
import X.C109544Rq;
import X.C32I;
import X.C34B;
import X.C3Q9;
import X.C47261Igj;
import X.C48841JEv;
import X.C4WC;
import X.C4WU;
import X.C61878OQg;
import X.C63089OpR;
import X.C63120Opw;
import X.C64962gm;
import X.C75732y9;
import X.C75752yB;
import X.C75782yE;
import X.C76212yv;
import X.C76252yz;
import X.C78613UtF;
import X.C78983UzD;
import X.C80533Eb;
import X.C81273Gx;
import X.C99033ud;
import X.InterfaceC68952nD;
import X.InterfaceC76162yq;
import X.InterfaceC79150V4o;
import X.JBR;
import X.ORS;
import X.ORZ;
import X.X1D;
import X.XKX;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FakeMessageViewModel extends ViewModel implements GenericLifecycleObserver, C4WU, InterfaceC76162yq {
    public static final /* synthetic */ int LJLL = 0;
    public final C99033ud LJLIL;
    public final AbstractC90763hI LJLILLLLZI;
    public final C64962gm LJLJI;
    public InterfaceC68952nD LJLJJI;
    public final HashMap<String, InterfaceC79150V4o> LJLJJL;
    public final HashMap<String, Integer> LJLJJLL;
    public final ArrayList<String> LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;

    @Override // X.InterfaceC120024nO
    public final void BH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void CN(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void DH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final int JG() {
        return 0;
    }

    @Override // X.InterfaceC120024nO
    public final void MO(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void Tu(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void f3(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void hW(int i, String str) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$im_base_release();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume$im_base_release();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop$im_base_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy$im_base_release();
        }
    }

    @Override // X.InterfaceC120024nO
    public final void tq0(int i, String str, List list) {
    }

    @Override // X.InterfaceC120024nO
    public final void we0(C63120Opw c63120Opw) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$im_base_release() {
        C34B.LJI("UserRecCardViewModel", "onCreate");
        if (!this.LJLIL.isReportPage()) {
            this.LJLILLLLZI.LJIIL(this);
            String convId = this.LJLIL.getConversationId();
            o.LJIIIZ(convId, "convId");
            HashMap<String, List<InterfaceC76162yq>> hashMap = C76212yv.LIZ;
            synchronized (hashMap) {
                List<InterfaceC76162yq> list = hashMap.get(convId);
                if (list != null) {
                    list.add(this);
                } else {
                    hashMap.put(convId, C47261Igj.LJJIJIL(this));
                }
            }
            C76252yz c76252yz = C76252yz.LJLIL;
            Iterator it = ((CopyOnWriteArraySet) C76212yv.LIZIZ.getValue()).iterator();
            while (it.hasNext()) {
                c76252yz.invoke(it.next());
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy$im_base_release() {
        C34B.LJI("UserRecCardViewModel", "onDestroy");
        if (!this.LJLIL.isReportPage()) {
            String convId = this.LJLIL.getConversationId();
            o.LJIIIZ(convId, "convId");
            HashMap<String, List<InterfaceC76162yq>> hashMap = C76212yv.LIZ;
            synchronized (hashMap) {
                List<InterfaceC76162yq> list = hashMap.get(convId);
                if (list == null || list.isEmpty()) {
                    C78983UzD.LJIILJJIL();
                } else {
                    ORS.LJJLL(list);
                    if (list.isEmpty()) {
                        hashMap.remove(convId);
                    }
                }
            }
            this.LJLILLLLZI.LJIJ();
            Iterator<Map.Entry<String, InterfaceC79150V4o>> it = this.LJLJJL.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().LIZIZ(null);
            }
            this.LJLJJL.clear();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume$im_base_release() {
        C34B.LJI("UserRecCardViewModel", "onResume");
        if (!(!this.LJLIL.isReportPage())) {
            return;
        }
        if (this.LJLJLLL) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C75752yB(this, null), 3);
        }
        this.LJLJLLL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop$im_base_release() {
        C34B.LJI("UserRecCardViewModel", "onStop");
        this.LJLJLLL = true;
    }

    @Override // X.InterfaceC76162yq
    public final boolean ru() {
        return !this.LJLIL.isReportPage();
    }

    public FakeMessageViewModel(C99033ud sessionInfo) {
        AbstractC90763hI convModel = C81273Gx.LIZ(sessionInfo.getConversationId());
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(convModel, "convModel");
        this.LJLIL = sessionInfo;
        this.LJLILLLLZI = convModel;
        this.LJLJI = C48841JEv.LIZ(C78613UtF.LIZ);
        this.LJLJJL = new HashMap<>();
        this.LJLJJLL = new HashMap<>();
        this.LJLJL = new ArrayList<>();
    }

    @Override // X.InterfaceC76162yq
    public final FakeMessage Wr0(FakeMessageContent fakeMessageContent) {
        UserRecommendationContent.RecUserInfo recUserInfo;
        if (!(!this.LJLIL.isReportPage()) || !(fakeMessageContent instanceof UserRecommendationContent)) {
            return null;
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LJLIL.getConversationId());
        if (LIZ == null) {
            return null;
        }
        UserRecommendationContent userRecommendationContent = (UserRecommendationContent) fakeMessageContent;
        String conversationId = LIZ.getConversationId();
        o.LJIIIIZZ(conversationId, "conv.conversationId");
        long lastMessageOrderIndex = LIZ.getLastMessageOrderIndex();
        List<UserRecommendationContent.RecUserInfo> userList = userRecommendationContent.getUserList();
        if (userList != null) {
            Iterator<UserRecommendationContent.RecUserInfo> it = userList.iterator();
            while (true) {
                if (it.hasNext()) {
                    recUserInfo = it.next();
                    UserRecommendationContent.RecUserInfo recUserInfo2 = recUserInfo;
                    if (recUserInfo2 != null && recUserInfo2.getOrderIndex() > 0) {
                        break;
                    }
                } else {
                    recUserInfo = null;
                    break;
                }
            }
            UserRecommendationContent.RecUserInfo recUserInfo3 = recUserInfo;
            if (recUserInfo3 != null) {
                long orderIndex = recUserInfo3.getOrderIndex();
                if (orderIndex > 0) {
                    lastMessageOrderIndex = orderIndex;
                    UserRecommendationContent gv0 = gv0(userRecommendationContent, LIZ);
                    FakeMessage.Builder builder = new FakeMessage.Builder();
                    builder.conversation(LIZ);
                    builder.msgType(LivePlayerResourceReleaseSetting.ENABLE);
                    builder.setFakeContent$im_base_release(gv0);
                    builder.orderIndex(lastMessageOrderIndex);
                    C109544Rq build = builder.build();
                    o.LJII(build, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage");
                    return (FakeMessage) build;
                }
            }
        }
        List<UserRecommendationContent.RecUserInfo> userList2 = userRecommendationContent.getUserList();
        if (userList2 != null) {
            for (UserRecommendationContent.RecUserInfo recUserInfo4 : userList2) {
                if (recUserInfo4 != null) {
                    recUserInfo4.setOrderIndex(lastMessageOrderIndex);
                }
            }
        }
        C75732y9.LIZIZ(conversationId, userRecommendationContent.getUserList(), null);
        UserRecommendationContent gv02 = gv0(userRecommendationContent, LIZ);
        FakeMessage.Builder builder2 = new FakeMessage.Builder();
        builder2.conversation(LIZ);
        builder2.msgType(LivePlayerResourceReleaseSetting.ENABLE);
        builder2.setFakeContent$im_base_release(gv02);
        builder2.orderIndex(lastMessageOrderIndex);
        C109544Rq build2 = builder2.build();
        o.LJII(build2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage");
        return (FakeMessage) build2;
    }

    @Override // X.InterfaceC120024nO
    public final void Mi(String conversationId, List<C63089OpR> list) {
        o.LJIIIZ(conversationId, "conversationId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    public final UserRecommendationContent gv0(UserRecommendationContent userRecommendationContent, C63120Opw c63120Opw) {
        ?? arrayList;
        UserRecommendationContent.RecUserInfo recUserInfo;
        UserRecommendationContent.RecUserInfo recUserInfo2;
        String str;
        Integer num;
        if (c63120Opw.isDissolved() || !c63120Opw.isMember()) {
            return new UserRecommendationContent(C61878OQg.INSTANCE);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String conversationId = c63120Opw.getConversationId();
        o.LJIIIIZZ(conversationId, "conv.conversationId");
        List<C63089OpR> LJIIJJI = C81273Gx.LIZ(conversationId).LJIIJJI();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C63089OpR c63089OpR : LJIIJJI) {
            linkedHashMap.put(String.valueOf(c63089OpR.getUid()), c63089OpR);
        }
        Integer num2 = null;
        if (this.LJLJL.isEmpty()) {
            C34B.LJI("UserRecCardViewModel", "copyWithFilter: selectedUserIdList is empty");
            List<UserRecommendationContent.RecUserInfo> userList = userRecommendationContent.getUserList();
            if (userList != null) {
                List LJLL2 = ORZ.LJLL(userList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((ArrayList) LJLL2).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hv0((UserRecommendationContent.RecUserInfo) next, currentTimeMillis, linkedHashMap)) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2.subList(0, Math.min(arrayList2.size(), 3));
                if (arrayList != 0) {
                    for (UserRecommendationContent.RecUserInfo recUserInfo3 : arrayList) {
                        ArrayList<String> arrayList3 = this.LJLJL;
                        String userId = recUserInfo3.getUserId();
                        if (userId == null) {
                            userId = "";
                        }
                        arrayList3.add(userId);
                    }
                }
            }
            arrayList = 0;
        } else {
            C34B.LJI("UserRecCardViewModel", "copyWithFilter: selectedUserIdList is not empty");
            ArrayList<String> arrayList4 = this.LJLJL;
            arrayList = new ArrayList(C32I.LJJL(arrayList4, 10));
            Iterator<String> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                List<UserRecommendationContent.RecUserInfo> userList2 = userRecommendationContent.getUserList();
                if (userList2 != null) {
                    Iterator<UserRecommendationContent.RecUserInfo> it3 = userList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            recUserInfo2 = it3.next();
                            UserRecommendationContent.RecUserInfo recUserInfo4 = recUserInfo2;
                            if (recUserInfo4 != null) {
                                str = recUserInfo4.getUserId();
                            } else {
                                str = null;
                            }
                            if (o.LJ(str, next2)) {
                                break;
                            }
                        } else {
                            recUserInfo2 = null;
                            break;
                        }
                    }
                    recUserInfo = recUserInfo2;
                    if (recUserInfo != null && hv0(recUserInfo, currentTimeMillis, linkedHashMap)) {
                        arrayList.add(recUserInfo);
                    }
                }
                recUserInfo = null;
                arrayList.add(recUserInfo);
            }
        }
        StringBuilder sb = new StringBuilder("copyWithFilter: total size=");
        List<UserRecommendationContent.RecUserInfo> userList3 = userRecommendationContent.getUserList();
        if (userList3 != null) {
            num = Integer.valueOf(userList3.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(", valid size=");
        if (arrayList != 0) {
            num2 = Integer.valueOf(((ArrayList) ORZ.LJLL(arrayList)).size());
        }
        sb.append(num2);
        C34B.LJI("UserRecCardViewModel", sb.toString());
        return new UserRecommendationContent(arrayList);
    }

    @Override // X.InterfaceC120024nO
    public final void y9(int i, C63120Opw c63120Opw) {
        String str = null;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        }
        if (!o.LJ(str, this.LJLIL.getConversationId())) {
            return;
        }
        if (i == 5) {
            if (c63120Opw.isDissolved() || !c63120Opw.isMember()) {
                Iterator<String> it = this.LJLJL.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    InterfaceC68952nD interfaceC68952nD = this.LJLJJI;
                    if (interfaceC68952nD != null) {
                        interfaceC68952nD.w(next, false, false);
                    }
                }
            } else {
                Iterator<String> it2 = this.LJLJL.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    List<Long> memberIds = c63120Opw.getMemberIds();
                    if (memberIds != null) {
                        Iterator<Long> it3 = memberIds.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Long next3 = it3.next();
                            if (o.LJ(String.valueOf(next3), next2)) {
                                if (next3 == null) {
                                }
                            }
                        }
                    }
                    InterfaceC68952nD interfaceC68952nD2 = this.LJLJJI;
                    if (interfaceC68952nD2 != null) {
                        interfaceC68952nD2.w(next2, false, false);
                    }
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            C76212yv.LIZIZ();
            return;
        }
        if (i == 10) {
            C76212yv.LIZIZ();
        } else {
            C34B.LJI("UserRecCardViewModel", "onUpdateConversation");
        }
    }

    public final boolean hv0(UserRecommendationContent.RecUserInfo recUserInfo, long j, Map<String, ? extends C63089OpR> map) {
        boolean z;
        int followStatus;
        boolean z2 = true;
        if (j - recUserInfo.getClosedTimestamp() < 86400000) {
            z = true;
        } else {
            z = false;
        }
        C63089OpR c63089OpR = (C63089OpR) ((LinkedHashMap) map).get(recUserInfo.getUserId());
        if (z || c63089OpR == null) {
            StringBuilder LJI = JBR.LJI("isValid: closedInInterval=", z, ", member is null=");
            if (c63089OpR != null) {
                z2 = false;
            }
            LJI.append(z2);
            LJI.append(", closedTs=");
            LJI.append(recUserInfo.getClosedTimestamp());
            C34B.LJI("UserRecCardViewModel", X1D.LIZIZ(LJI));
            return false;
        }
        IMUser LJIIJ = C80533Eb.LJIIJ(recUserInfo.getUserId(), c63089OpR.getSecUid());
        if (LJIIJ == null) {
            C34B.LJI("UserRecCardViewModel", "isValid: user is null");
            return false;
        }
        if (LJIIJ.isBlock()) {
            C34B.LJI("UserRecCardViewModel", "isValid: user is block");
            return false;
        }
        recUserInfo.setUser(IMUser.toUser(LJIIJ));
        Integer num = this.LJLJJLL.get(recUserInfo.getUserId());
        if (num != null) {
            followStatus = num.intValue();
        } else {
            followStatus = LJIIJ.getFollowStatus();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isValid: followStatus=");
        LIZ.append(followStatus);
        C34B.LJI("UserRecCardViewModel", X1D.LIZIZ(LIZ));
        if (followStatus == 0) {
            return true;
        }
        return false;
    }
}
