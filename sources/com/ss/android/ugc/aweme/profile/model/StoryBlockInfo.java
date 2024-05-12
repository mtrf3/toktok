package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class StoryBlockInfo implements Serializable {

    @InterfaceC65349Pkn("life_story_block")
    public boolean isBlock;

    @InterfaceC65349Pkn("life_story_blocked")
    public boolean isBlocked;

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }
}
