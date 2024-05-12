package com.ss.android.ugc.aweme.comment.preload;

import X.C16880lQ;
import X.C38827FLr;
import X.C76L;
import X.EnumC169566l6;
import X.InterfaceC65753PrJ;
import X.InterfaceC88472Yns;
import X.LFH;
import X.RunnableC65751PrH;
import X.X8M;
import X.XP8;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class CommentPreload implements X8M<CommentApi.RealApi, Future<CommentItemList>> {
    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        if (bundle != null && bundle.getParcelable("comment_preload_request") != null) {
            return true;
        }
        return false;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        if (bundle != null && bundle.containsKey("comment_ttl")) {
            return new C38827FLr(bundle.getInt("comment_ttl"), Api.LIZ, true);
        }
        return new C38827FLr(0, Api.LIZ, true, 1);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    @Override // X.X8M
    public Future<CommentItemList> preload(Bundle bundle, InterfaceC88472Yns<? super Class<CommentApi.RealApi>, ? extends CommentApi.RealApi> create) {
        final CommentPreloadRequest commentPreloadRequest;
        C76L<CommentItemList> c76l;
        o.LJIIIZ(create, "create");
        if (bundle != null) {
            commentPreloadRequest = (CommentPreloadRequest) bundle.getParcelable("comment_preload_request");
            if (commentPreloadRequest != null) {
                LFH.LIZIZ.LIZLLL().LJIJ();
                c76l = create.invoke(CommentApi.RealApi.class).preloadCommentList(commentPreloadRequest.aid, commentPreloadRequest.cursor, commentPreloadRequest.count, commentPreloadRequest.insertCids, commentPreloadRequest.forwardPageType, commentPreloadRequest.adCreativeId, commentPreloadRequest.channelId, commentPreloadRequest.userAvatarShrink, commentPreloadRequest.adPricingType, commentPreloadRequest.limitCount, commentPreloadRequest.offlinePin, commentPreloadRequest.authorRelationType, commentPreloadRequest.loadType, commentPreloadRequest.policy, 0, commentPreloadRequest.enterType, o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE), commentPreloadRequest.searchParams);
                InterfaceC65753PrJ<CommentItemList> interfaceC65753PrJ = new InterfaceC65753PrJ<CommentItemList>() { // from class: X.751
                    @Override // X.InterfaceC65753PrJ
                    public final void onFailure(Throwable t) {
                        String str;
                        o.LJIIIZ(t, "t");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("preload fail, aid: ");
                        CommentPreloadRequest commentPreloadRequest2 = CommentPreloadRequest.this;
                        String str2 = null;
                        if (commentPreloadRequest2 != null) {
                            str = commentPreloadRequest2.aid;
                        } else {
                            str = null;
                        }
                        LIZ.append(str);
                        LIZ.append(", cid: ");
                        CommentPreloadRequest commentPreloadRequest3 = CommentPreloadRequest.this;
                        if (commentPreloadRequest3 != null) {
                            str2 = commentPreloadRequest3.insertCids;
                        }
                        LIZ.append(str2);
                        LIZ.append(", ");
                        LIZ.append(t.getMessage());
                        C71Y.LIZLLL("InboxCommentPreload", X1D.LIZIZ(LIZ));
                    }

                    @Override // X.InterfaceC65753PrJ
                    public final void onSuccess(CommentItemList commentItemList) {
                        CommentItemList commentItemList2 = commentItemList;
                        CommentPreloadRequest commentPreloadRequest2 = CommentPreloadRequest.this;
                        if (commentPreloadRequest2 == null) {
                            return;
                        }
                        String str = commentPreloadRequest2.aid;
                        o.LJIIIIZZ(str, "request.aid");
                        C176556wN c176556wN = new C176556wN(commentPreloadRequest2.loadType, str, commentPreloadRequest2.insertCids, commentPreloadRequest2.cursor);
                        if (commentItemList2 != null) {
                            C1800874y.LIZIZ().put(c176556wN, new AnonymousClass750(commentItemList2, System.currentTimeMillis()));
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("preload success, aid: ");
                        LIZ.append(commentPreloadRequest2.aid);
                        LIZ.append(", cid: ");
                        LIZ.append(commentPreloadRequest2.insertCids);
                        LIZ.append(", loadType: ");
                        LIZ.append(commentPreloadRequest2.loadType);
                        C71Y.LIZLLL("InboxCommentPreload", X1D.LIZIZ(LIZ));
                    }
                };
                c76l.LJFF(new RunnableC65751PrH(c76l, interfaceC65753PrJ), EnumC169566l6.LJLIL);
                return c76l;
            }
        } else {
            commentPreloadRequest = null;
        }
        c76l = new XP8<>();
        InterfaceC65753PrJ<CommentItemList> interfaceC65753PrJ2 = new InterfaceC65753PrJ<CommentItemList>() { // from class: X.751
            @Override // X.InterfaceC65753PrJ
            public final void onFailure(Throwable t) {
                String str;
                o.LJIIIZ(t, "t");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("preload fail, aid: ");
                CommentPreloadRequest commentPreloadRequest2 = CommentPreloadRequest.this;
                String str2 = null;
                if (commentPreloadRequest2 != null) {
                    str = commentPreloadRequest2.aid;
                } else {
                    str = null;
                }
                LIZ.append(str);
                LIZ.append(", cid: ");
                CommentPreloadRequest commentPreloadRequest3 = CommentPreloadRequest.this;
                if (commentPreloadRequest3 != null) {
                    str2 = commentPreloadRequest3.insertCids;
                }
                LIZ.append(str2);
                LIZ.append(", ");
                LIZ.append(t.getMessage());
                C71Y.LIZLLL("InboxCommentPreload", X1D.LIZIZ(LIZ));
            }

            @Override // X.InterfaceC65753PrJ
            public final void onSuccess(CommentItemList commentItemList) {
                CommentItemList commentItemList2 = commentItemList;
                CommentPreloadRequest commentPreloadRequest2 = CommentPreloadRequest.this;
                if (commentPreloadRequest2 == null) {
                    return;
                }
                String str = commentPreloadRequest2.aid;
                o.LJIIIIZZ(str, "request.aid");
                C176556wN c176556wN = new C176556wN(commentPreloadRequest2.loadType, str, commentPreloadRequest2.insertCids, commentPreloadRequest2.cursor);
                if (commentItemList2 != null) {
                    C1800874y.LIZIZ().put(c176556wN, new AnonymousClass750(commentItemList2, System.currentTimeMillis()));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("preload success, aid: ");
                LIZ.append(commentPreloadRequest2.aid);
                LIZ.append(", cid: ");
                LIZ.append(commentPreloadRequest2.insertCids);
                LIZ.append(", loadType: ");
                LIZ.append(commentPreloadRequest2.loadType);
                C71Y.LIZLLL("InboxCommentPreload", X1D.LIZIZ(LIZ));
            }
        };
        c76l.LJFF(new RunnableC65751PrH(c76l, interfaceC65753PrJ2), EnumC169566l6.LJLIL);
        return c76l;
    }
}
