package com.ss.android.ugc.aweme.friendstab.interfaces;

import X.C2K0;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;

/* loaded from: classes10.dex */
public interface IBottomFriendsTabAvatarAbility extends C2K0 {
    void Px(Aweme aweme);

    void dh();

    void hf0(SocialFeedRedDotResponse socialFeedRedDotResponse, UrlModel urlModel);

    boolean isShowing();

    void remove();

    void sA();

    void unRegister();
}
