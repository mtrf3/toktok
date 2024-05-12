package com.ss.android.ugc.aweme.feed.model;

import X.C158056If;
import X.C16880lQ;
import X.C2YJ;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RelationLabelHelper {
    public static final RelationLabelHelper INSTANCE = new RelationLabelHelper();

    public static final User convertLabelUser2user(RelationLabelUser labelUser) {
        o.LJIIIZ(labelUser, "labelUser");
        User user = new User();
        user.setUid(String.valueOf(labelUser.getUid()));
        user.setSecUid(labelUser.getSecUid());
        user.setNickname(labelUser.getNickName());
        user.setRemarkName(labelUser.getRemarkName());
        user.setAvatarLarger(labelUser.getAvatarLarger());
        user.setAvatarThumb(labelUser.getAvatarThumb());
        user.setFollowStatus(labelUser.getFollowStatus());
        return user;
    }

    public static final List<User> convertLabelUsers2Users(List<RelationLabelUser> labelUsers) {
        o.LJIIIZ(labelUsers, "labelUsers");
        if (labelUsers.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<RelationLabelUser> it = labelUsers.iterator();
        while (it.hasNext()) {
            arrayList.add(convertLabelUser2user(it.next()));
        }
        return arrayList;
    }

    public static final boolean hasCommentId(Aweme aweme) {
        RelationLabelNew feedRelationLabel;
        Integer type;
        RelationLabelNew feedRelationLabel2;
        RelationLabelExtra extra;
        String cid;
        if (aweme != null && (feedRelationLabel = aweme.getFeedRelationLabel()) != null && (type = feedRelationLabel.getType()) != null && type.intValue() == 3 && (feedRelationLabel2 = aweme.getFeedRelationLabel()) != null && (extra = feedRelationLabel2.getExtra()) != null && (cid = extra.getCid()) != null && cid.length() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasDuoShanLabel(Aweme aweme) {
        List<AwemeLabelModel> videoLabels;
        boolean z = true;
        try {
            Integer showFromDuoshanLabel = C2YJ.LIZIZ.LIZ.getShowFromDuoshanLabel();
            if (showFromDuoshanLabel == null) {
                return false;
            }
            if (showFromDuoshanLabel.intValue() != 1 || aweme == null || (videoLabels = aweme.getVideoLabels()) == null) {
                return false;
            }
            if (!videoLabels.isEmpty()) {
                for (AwemeLabelModel awemeLabelModel : videoLabels) {
                    if (awemeLabelModel != null && awemeLabelModel.labelType == 100) {
                        break;
                    }
                }
            }
            z = false;
            return z;
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static final boolean hasNewFollowRelationLabel(Aweme aweme) {
        Integer num;
        RelationLabelNew relationLabelNew;
        if (aweme != null && (relationLabelNew = aweme.feedRelationLabel) != null) {
            num = relationLabelNew.getType();
        } else {
            num = null;
        }
        return hasNewFollowRelationLabel(num);
    }

    public static final boolean hasNewInteractiveRelationLabel(Integer num) {
        if (num != null && (num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 4 || num.intValue() == 22 || num.intValue() == 5)) {
            return true;
        }
        return false;
    }

    public static final boolean hasNewRelationLabel(Aweme aweme) {
        if (aweme != null && aweme.feedRelationLabel != null) {
            return true;
        }
        return false;
    }

    public static final RelationLabelNew mockStarCommentLabel(User user) {
        o.LJIIIZ(user, "user");
        RelationLabelNew relationLabelNew = new RelationLabelNew();
        relationLabelNew.setType(4);
        ArrayList arrayList = new ArrayList();
        RelationLabelUser relationLabelUser = new RelationLabelUser();
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        relationLabelUser.setUid(CastLongProtector.parseLong(uid));
        relationLabelUser.setSecUid(user.getSecUid());
        relationLabelUser.setNickName(user.getNickname());
        relationLabelUser.setRemarkName(user.getRemarkName());
        relationLabelUser.setAvatarLarger(user.getAvatarLarger());
        relationLabelUser.setAvatarThumb(user.getAvatarThumb());
        relationLabelUser.setFollowStatus(user.getFollowStatus());
        arrayList.add(relationLabelUser);
        relationLabelNew.setUserList(arrayList);
        return relationLabelNew;
    }

    public static final boolean hasNewFollowRelationLabel(Integer num) {
        if (num == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean hasNewInteractiveRelationLabel(Aweme aweme) {
        Integer num;
        RelationLabelNew relationLabelNew;
        if (aweme != null && (relationLabelNew = aweme.feedRelationLabel) != null) {
            num = relationLabelNew.getType();
        } else {
            num = null;
        }
        return hasNewInteractiveRelationLabel(num);
    }
}
