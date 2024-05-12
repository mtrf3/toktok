package com.ss.android.ugc.aweme.now;

import X.EnumC181687Bc;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NowInteractionControl extends F9E implements Serializable {

    @InterfaceC65349Pkn("blur_comment_action")
    public int blurCommentAction;

    @InterfaceC65349Pkn("blur_like_action")
    public int blurLikeAction;

    @InterfaceC65349Pkn("disable_comment")
    public boolean disableComment;

    @InterfaceC65349Pkn("disable_like")
    public boolean disableLike;

    @InterfaceC65349Pkn("disable_reaction")
    public boolean disableReaction;

    public NowInteractionControl() {
    }

    public static /* synthetic */ NowInteractionControl copy$default(NowInteractionControl nowInteractionControl, boolean z, boolean z2, boolean z3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = nowInteractionControl.disableLike;
        }
        if ((i3 & 2) != 0) {
            z2 = nowInteractionControl.disableComment;
        }
        if ((i3 & 4) != 0) {
            z3 = nowInteractionControl.disableReaction;
        }
        if ((i3 & 8) != 0) {
            i = nowInteractionControl.blurCommentAction;
        }
        if ((i3 & 16) != 0) {
            i2 = nowInteractionControl.blurLikeAction;
        }
        return nowInteractionControl.copy(z, z2, z3, i, i2);
    }

    public final NowInteractionControl copy(boolean z, boolean z2, boolean z3, int i, int i2) {
        return new NowInteractionControl(z, z2, z3, i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.disableLike), Boolean.valueOf(this.disableComment), Boolean.valueOf(this.disableReaction), Integer.valueOf(this.blurCommentAction), Integer.valueOf(this.blurLikeAction)};
    }

    public final int getBlurCommentAction() {
        return this.blurCommentAction;
    }

    public final int getBlurLikeAction() {
        return this.blurLikeAction;
    }

    public final boolean getDisableComment() {
        return this.disableComment;
    }

    public final boolean getDisableLike() {
        return this.disableLike;
    }

    public final boolean getDisableReaction() {
        return this.disableReaction;
    }

    public NowInteractionControl(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.disableLike = z;
        this.disableComment = z2;
        this.disableReaction = z3;
        this.blurCommentAction = i;
        this.blurLikeAction = i2;
    }

    public /* synthetic */ NowInteractionControl(boolean z, boolean z2, boolean z3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, (i3 & 8) != 0 ? EnumC181687Bc.IGNORE.getValue() : i, (i3 & 16) != 0 ? EnumC181687Bc.IGNORE.getValue() : i2);
    }
}
