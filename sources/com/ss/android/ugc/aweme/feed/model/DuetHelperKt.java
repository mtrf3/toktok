package com.ss.android.ugc.aweme.feed.model;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DuetHelperKt {
    public static final boolean checkDuetSetting(Aweme aweme) {
        User user = aweme.author;
        if (user == null) {
            return false;
        }
        int duetSetting = user.getDuetSetting();
        if (duetSetting == 0) {
            return true;
        }
        if (duetSetting != 1 || aweme.author.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean canAddDuet(Aweme aweme, boolean z) {
        int i;
        o.LJIIIZ(aweme, "<this>");
        InteractPermission interactPermission = aweme.interactPermission;
        if (interactPermission != null) {
            i = interactPermission.getDuet();
            if (i == 4) {
                return false;
            }
        } else {
            i = 0;
        }
        if ((!z && (i == 2 || aweme.isPrivate())) || !aweme.canDuetVideoType() || aweme.isWithPromotionalMusic() || aweme.duetSetting == 2) {
            return false;
        }
        return true;
    }

    public static final boolean setGrayForDuet(Aweme aweme, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        o.LJIIIZ(aweme, "<this>");
        boolean checkDuetSetting = checkDuetSetting(aweme);
        InteractPermission interactPermission = aweme.interactPermission;
        if (interactPermission != null) {
            i = interactPermission.getDuet();
        } else {
            i = 0;
        }
        if (z2 && i != 3 && ((z || (checkDuetSetting && i != 1)) && ((!aweme.author.isSecret() || z) && !z3 && !z4))) {
            return false;
        }
        return true;
    }
}
