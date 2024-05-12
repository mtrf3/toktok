package com.ss.android.ugc.aweme.commerce.tools.music.experiment;

import X.InterfaceC65349Pkn;
import X.V0N;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicUsageCheckboxConfig {

    @InterfaceC65349Pkn("default_value")
    public final boolean defaultValue;

    @InterfaceC65349Pkn("delete_music_dialog_on_uncheck")
    public final boolean deleteOnUncheck;

    @InterfaceC65349Pkn("press_post_action")
    public final PostAction pressPostAction;

    /* loaded from: classes8.dex */
    public enum PostAction {
        NO_ACTION,
        TOAST,
        DIALOG;

        public static PostAction valueOf(String str) {
            return (PostAction) V0N.LJJJ(PostAction.class, str);
        }
    }

    public MusicUsageCheckboxConfig(boolean z, PostAction pressPostAction, boolean z2) {
        o.LJIIIZ(pressPostAction, "pressPostAction");
        this.defaultValue = z;
        this.pressPostAction = pressPostAction;
        this.deleteOnUncheck = z2;
    }
}
