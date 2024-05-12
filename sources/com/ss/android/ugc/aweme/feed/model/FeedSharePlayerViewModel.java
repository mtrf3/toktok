package com.ss.android.ugc.aweme.feed.model;

import X.ActivityC45651qj;
import X.InterfaceC46330IGg;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedSharePlayerViewModel extends ViewModel {
    public static final Companion Companion = new Companion();
    public boolean hasBindCover;
    public InterfaceC46330IGg player;

    public static final InterfaceC46330IGg getPlayerManager(ActivityC45651qj activityC45651qj) {
        return Companion.getPlayerManager(activityC45651qj);
    }

    public static final FeedSharePlayerViewModel getViewModel(ActivityC45651qj activityC45651qj) {
        return Companion.getViewModel(activityC45651qj);
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final InterfaceC46330IGg getPlayerManager(ActivityC45651qj activity) {
            o.LJIIIZ(activity, "activity");
            return getViewModel(activity).player;
        }

        public final FeedSharePlayerViewModel getViewModel(ActivityC45651qj activity) {
            o.LJIIIZ(activity, "activity");
            return (FeedSharePlayerViewModel) ViewModelProviders.of(activity).get(FeedSharePlayerViewModel.class);
        }
    }
}
