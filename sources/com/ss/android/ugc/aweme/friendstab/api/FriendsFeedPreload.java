package com.ss.android.ugc.aweme.friendstab.api;

import X.C10K;
import X.C32I;
import X.C36199EIp;
import X.C38827FLr;
import X.C47261Igj;
import X.C53283Kvf;
import X.C53414Kxm;
import X.C54028LIi;
import X.C54374LVq;
import X.C54379LVv;
import X.C54859Lfz;
import X.C75792yF;
import X.EnumC54377LVt;
import X.InterfaceC88472Yns;
import X.LII;
import X.ORZ;
import X.OSJ;
import X.WM7;
import X.X1D;
import X.X8M;
import Y.ACallableS86S0200000_9;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedListApi;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsFeedPreload implements X8M<FriendsFeedListApi.FriendsFeedApi, Future<FriendsFeedResponse>> {
    public static final C54379LVv Companion = new C54379LVv();
    public static List<C54859Lfz> clientReadGidsAll = new ArrayList();
    public Bundle preloadBundle;

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(FriendsTabPreloadTTLSetting.INSTANCE.getValue(), Api.LIZ, true);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C10K.LIZJ(new ACallableS86S0200000_9(exception, this, 3));
        return true;
    }

    @Override // X.X8M
    public Future<FriendsFeedResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<FriendsFeedListApi.FriendsFeedApi>, ? extends FriendsFeedListApi.FriendsFeedApi> create) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(create, "create");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload, bundle = ");
        if (bundle != null) {
            str = bundle.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        this.preloadBundle = bundle;
        OSJ LIZ2 = C54028LIi.LIZ("friends feed preload");
        Object first = LIZ2.getFirst();
        Object second = LIZ2.getSecond();
        Collection collection = (Collection) LIZ2.getThird();
        clientReadGidsAll.clear();
        clientReadGidsAll.addAll(ORZ.LLJILJILJ(collection));
        List<C54859Lfz> list = clientReadGidsAll;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C54859Lfz> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJLIL);
        }
        String LIZJ = C75792yF.LIZJ(arrayList);
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo(-1, "others_homepage", "others_homepage", "/tiktok/v1/friend/friend_feed", C47261Igj.LJJIJIIJI("source", "max_count", "pull_type", "aweme_ids", "page_token"));
        Bundle bundle2 = this.preloadBundle;
        if (bundle2 == null || (str2 = bundle2.getString("aweme_ids", "")) == null) {
            str2 = "";
        }
        if (C53283Kvf.LIZIZ()) {
            return null;
        }
        if (C36199EIp.LIZ()) {
            Bundle bundle3 = this.preloadBundle;
            if (bundle3 == null || (str3 = bundle3.getString(WM7.SCENE_SERVICE, "")) == null) {
                str3 = "";
            }
            FriendsFeedListApi.FriendsFeedApi invoke = create.invoke(FriendsFeedListApi.FriendsFeedApi.class);
            EnumC54377LVt enumC54377LVt = EnumC54377LVt.REFRESH;
            return invoke.getFriendsFeedListEnhance(1, str3, enumC54377LVt.getType(), C54374LVq.LIZJ(), LII.SORT.getDataLevel(), 6, enumC54377LVt.getType(), str2, null, C75792yF.LIZJ(first), null, C75792yF.LIZJ(second), LIZJ, C53414Kxm.LIZ(), 1, false, null, preloadExtraInfo);
        }
        return create.invoke(FriendsFeedListApi.FriendsFeedApi.class).getFriendsFeedList(C54374LVq.LIZJ(), LII.SORT.getDataLevel(), 6, EnumC54377LVt.REFRESH.getType(), str2, null, C75792yF.LIZJ(first), null, C75792yF.LIZJ(second), LIZJ, C53414Kxm.LIZ(), 1, false, null, preloadExtraInfo);
    }
}
