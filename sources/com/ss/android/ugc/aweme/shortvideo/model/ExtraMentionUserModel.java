package com.ss.android.ugc.aweme.shortvideo.model;

import X.OSZ;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExtraMentionUserModel implements Serializable {
    public static final Companion Companion = new Companion();
    public List<OSZ<String, String>> userList = new ArrayList();

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ExtraMentionUserModel newInstance(String uid, String nickname) {
            o.LJIIIZ(uid, "uid");
            o.LJIIIZ(nickname, "nickname");
            ExtraMentionUserModel extraMentionUserModel = new ExtraMentionUserModel();
            extraMentionUserModel.addMentionUser(uid, nickname);
            return extraMentionUserModel;
        }
    }

    public final List<OSZ<String, String>> getUserList() {
        return this.userList;
    }

    public final void addMentionUser(String uid, String name) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(name, "name");
        if (!TextUtils.isEmpty(uid) && !TextUtils.isEmpty(name)) {
            this.userList.add(new OSZ<>(uid, name));
        }
    }
}
