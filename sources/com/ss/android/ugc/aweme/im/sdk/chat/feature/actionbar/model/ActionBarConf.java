package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActionBarConf {

    @InterfaceC65349Pkn("action_bar_button_conf")
    public final List<ActionBarButtonConf> actionBarButtonConf;

    @InterfaceC65349Pkn("animated_emoji_resource")
    public final ActionBarResource animatedEmojiResource;

    @InterfaceC65349Pkn("sticker_resource")
    public final ActionBarResource stickerResource;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarConf() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionBarConf copy$default(ActionBarConf actionBarConf, List list, ActionBarResource actionBarResource, ActionBarResource actionBarResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = actionBarConf.actionBarButtonConf;
        }
        if ((i & 2) != 0) {
            actionBarResource = actionBarConf.animatedEmojiResource;
        }
        if ((i & 4) != 0) {
            actionBarResource2 = actionBarConf.stickerResource;
        }
        return actionBarConf.copy(list, actionBarResource, actionBarResource2);
    }

    public final ActionBarConf copy(List<ActionBarButtonConf> list, ActionBarResource actionBarResource, ActionBarResource actionBarResource2) {
        return new ActionBarConf(list, actionBarResource, actionBarResource2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarConf)) {
            return false;
        }
        ActionBarConf actionBarConf = (ActionBarConf) obj;
        return o.LJ(this.actionBarButtonConf, actionBarConf.actionBarButtonConf) && o.LJ(this.animatedEmojiResource, actionBarConf.animatedEmojiResource) && o.LJ(this.stickerResource, actionBarConf.stickerResource);
    }

    public int hashCode() {
        List<ActionBarButtonConf> list = this.actionBarButtonConf;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ActionBarResource actionBarResource = this.animatedEmojiResource;
        int hashCode2 = (hashCode + (actionBarResource == null ? 0 : actionBarResource.hashCode())) * 31;
        ActionBarResource actionBarResource2 = this.stickerResource;
        return hashCode2 + (actionBarResource2 != null ? actionBarResource2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionBarConf(actionBarButtonConf=");
        LIZ.append(this.actionBarButtonConf);
        LIZ.append(", animatedEmojiResource=");
        LIZ.append(this.animatedEmojiResource);
        LIZ.append(", stickerResource=");
        LIZ.append(this.stickerResource);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<ActionBarButtonConf> getActionBarButtonConf() {
        return this.actionBarButtonConf;
    }

    public final ActionBarResource getAnimatedEmojiResource() {
        return this.animatedEmojiResource;
    }

    public final ActionBarResource getStickerResource() {
        return this.stickerResource;
    }

    public ActionBarConf(List<ActionBarButtonConf> list, ActionBarResource actionBarResource, ActionBarResource actionBarResource2) {
        this.actionBarButtonConf = list;
        this.animatedEmojiResource = actionBarResource;
        this.stickerResource = actionBarResource2;
    }

    public /* synthetic */ ActionBarConf(List list, ActionBarResource actionBarResource, ActionBarResource actionBarResource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : actionBarResource, (i & 4) != 0 ? null : actionBarResource2);
    }
}
