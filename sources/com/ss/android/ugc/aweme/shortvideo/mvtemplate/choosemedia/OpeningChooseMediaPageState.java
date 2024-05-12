package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.InterfaceC61312at;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public abstract class OpeningChooseMediaPageState implements InterfaceC61312at {

    /* loaded from: classes8.dex */
    public static final class NoSceneAnimation extends OpeningChooseMediaPageState {
        public static final NoSceneAnimation INSTANCE = new NoSceneAnimation();
    }

    /* loaded from: classes8.dex */
    public static final class OnSceneAnimationEnded extends OpeningChooseMediaPageState {
        public static final OnSceneAnimationEnded INSTANCE = new OnSceneAnimationEnded();
    }

    /* loaded from: classes8.dex */
    public static final class OnSceneAnimationStarted extends OpeningChooseMediaPageState {
        public static final OnSceneAnimationStarted INSTANCE = new OnSceneAnimationStarted();
    }

    public /* synthetic */ OpeningChooseMediaPageState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public OpeningChooseMediaPageState() {
    }
}
