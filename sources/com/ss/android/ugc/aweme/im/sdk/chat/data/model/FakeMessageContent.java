package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class FakeMessageContent implements Serializable {
    public static final Companion Companion = new Companion();

    public /* synthetic */ FakeMessageContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean isValid();

    public abstract boolean needUpdate(FakeMessageContent fakeMessageContent);

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final FakeMessageContent from$im_base_release(int i, String data) {
            o.LJIIIZ(data, "data");
            if (i == 1) {
                return UserRecommendationContent.Companion.from$im_base_release(data);
            }
            return null;
        }
    }

    public FakeMessageContent() {
    }
}
