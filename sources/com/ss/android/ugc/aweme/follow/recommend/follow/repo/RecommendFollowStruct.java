package com.ss.android.ugc.aweme.follow.recommend.follow.repo;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendFollowStruct implements Cloneable {
    public final User LJLIL;
    public final int LJLILLLLZI;

    @InterfaceC65349Pkn("recommend_item_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("user_id")
    public final String uid;

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final RecommendFollowStruct clone() {
        ArrayList arrayList;
        String str = this.uid;
        List<Aweme> list = this.awemeList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                Aweme R1 = AwemeService.LIZ().R1(it.next().m114clone());
                o.LJI(R1);
                arrayList.add(R1);
            }
        } else {
            arrayList = new ArrayList();
        }
        User m150clone = this.LJLIL.m150clone();
        o.LJIIIIZZ(m150clone, "user.clone()");
        return new RecommendFollowStruct(str, arrayList, m150clone, this.LJLILLLLZI);
    }

    public final int hashCode() {
        return this.uid.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendFollowStruct(uid=");
        LIZ.append(this.uid);
        LIZ.append(", awemeList=");
        LIZ.append(this.awemeList);
        LIZ.append(", user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", index=");
        return b0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RecommendFollowStruct)) {
            return false;
        }
        return TextUtils.equals(((RecommendFollowStruct) obj).uid, this.uid);
    }

    public RecommendFollowStruct(String uid, List<Aweme> awemeList, User user, int i) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(awemeList, "awemeList");
        o.LJIIIZ(user, "user");
        this.uid = uid;
        this.awemeList = awemeList;
        this.LJLIL = user;
        this.LJLILLLLZI = i;
    }
}
