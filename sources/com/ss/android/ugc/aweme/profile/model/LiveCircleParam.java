package com.ss.android.ugc.aweme.profile.model;

import X.C53882LCs;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveCircleParam {
    public C53882LCs animationController;
    public View avatarView;
    public int liveCircleViewType;
    public boolean needLiveBreathAnim;
    public User user;
    public String enterFromMerge = "";
    public String enterMethod = "";
    public int sceneType = -1;
    public int followListOrder = -1;
    public String sortStatus = "";

    /* loaded from: classes10.dex */
    public static final class LiveCircleBuilder {
        public final LiveCircleParam param = new LiveCircleParam();

        public final LiveCircleBuilder setAnimationController(C53882LCs c53882LCs) {
            this.param.animationController = c53882LCs;
            return this;
        }

        public final LiveCircleBuilder setAvatarView(View avatarView) {
            o.LJIIIZ(avatarView, "avatarView");
            this.param.avatarView = avatarView;
            return this;
        }

        public final LiveCircleBuilder setCircleViewType(int i) {
            this.param.liveCircleViewType = i;
            return this;
        }

        public final LiveCircleBuilder setEnterFromMerge(String enterFromMerge) {
            o.LJIIIZ(enterFromMerge, "enterFromMerge");
            this.param.setEnterFromMerge(enterFromMerge);
            return this;
        }

        public final LiveCircleBuilder setEnterMethod(String enterMethod) {
            o.LJIIIZ(enterMethod, "enterMethod");
            this.param.setEnterMethod(enterMethod);
            return this;
        }

        public final LiveCircleBuilder setFollowListOrder(int i) {
            this.param.followListOrder = i;
            return this;
        }

        public final LiveCircleBuilder setNeedLiveBreathAnim(boolean z) {
            this.param.needLiveBreathAnim = z;
            return this;
        }

        public final LiveCircleBuilder setSceneType(int i) {
            this.param.sceneType = i;
            return this;
        }

        public final LiveCircleBuilder setSortStatus(String type) {
            o.LJIIIZ(type, "type");
            this.param.setSortStatus(type);
            return this;
        }

        public final LiveCircleBuilder setUser(User user) {
            o.LJIIIZ(user, "user");
            this.param.user = user;
            return this;
        }
    }

    public final void setEnterFromMerge(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.enterFromMerge = str;
    }

    public final void setEnterMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.enterMethod = str;
    }

    public final void setSortStatus(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.sortStatus = str;
    }
}
