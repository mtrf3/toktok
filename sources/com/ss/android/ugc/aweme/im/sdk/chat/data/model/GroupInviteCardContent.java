package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C1DD;
import X.C72972SkS;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupInviteCardContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("expired_at")
    public Long expiredAt;

    @InterfaceC65349Pkn("group")
    public GroupInfo group;

    @InterfaceC65349Pkn("invite_id")
    public String inviteId;

    public static final GroupInviteCardContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("group");
        Bundle bundle = LIZ.extras;
        bundle.putString("invite_id", this.inviteId);
        Long l = this.expiredAt;
        if (l != null) {
            bundle.putLong("expired_at", l.longValue());
        }
        bundle.putSerializable("group", String.valueOf(this.group));
        return LIZ;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final GroupInviteCardContent fromSharePackage(SharePackage sharePackage) {
            GroupInfo groupInfo;
            o.LJIIIZ(sharePackage, "sharePackage");
            GroupInviteCardContent groupInviteCardContent = new GroupInviteCardContent();
            groupInviteCardContent.type = 103301;
            Bundle bundle = sharePackage.extras;
            groupInviteCardContent.setInviteId(bundle.getString("invite_id"));
            groupInviteCardContent.setExpiredAt(Long.valueOf(bundle.getLong("expired_at", 0L)));
            Serializable serializable = bundle.getSerializable("group");
            if (serializable instanceof GroupInfo) {
                groupInfo = (GroupInfo) serializable;
            } else {
                groupInfo = null;
            }
            groupInviteCardContent.setGroup(groupInfo);
            return groupInviteCardContent;
        }
    }

    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    public final GroupInfo getGroup() {
        return this.group;
    }

    public final String getInviteId() {
        return this.inviteId;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h7z, "context.resources.getStr…ng.im_quote_group_invite)");
    }

    public final void setExpiredAt(Long l) {
        this.expiredAt = l;
    }

    public final void setGroup(GroupInfo groupInfo) {
        this.group = groupInfo;
    }

    public final void setInviteId(String str) {
        this.inviteId = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        Context LIZIZ = EF7.LIZIZ();
        if (z || z2) {
            return C1DD.LIZLLL(R.string.cix, "{\n            getApplica…t_groupinvite1)\n        }");
        }
        String string = LIZIZ.getString(R.string.qgz);
        o.LJIIIIZZ(string, "{\n            context.ge…t_groupinvite2)\n        }");
        return string;
    }
}
