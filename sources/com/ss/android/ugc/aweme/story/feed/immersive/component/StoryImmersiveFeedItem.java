package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.InterfaceC222828oo;
import X.InterfaceC57784Mm4;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes4.dex */
public interface StoryImmersiveFeedItem extends InterfaceC57784Mm4, InterfaceC222828oo {
    @Override // X.InterfaceC57784Mm4
    boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4);

    @Override // X.InterfaceC57784Mm4
    boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4);

    @Override // X.InterfaceC57784Mm4
    /* synthetic */ Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4);

    /* synthetic */ Aweme getStoryCollection();
}
