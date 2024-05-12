package com.ss.android.ugc.gamora.editorpro.guide;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.C6E0;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class EditorProGuideTargetUserApi {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C6E0.LJLIL);

    /* loaded from: classes3.dex */
    public interface Api {
        @E8L("/tiktok/v1/creative/user/feature/")
        AbstractC73672Svk<FetchIsEpGuideTargetUserResponse> requestIsEpGuideTargetUser(@InterfaceC64986Pew("need_is_cc_creator") boolean z, @InterfaceC64986Pew("need_is_video_add_to_series_allowed") boolean z2);
    }

    /* loaded from: classes3.dex */
    public static final class FetchIsEpGuideTargetUserResponse extends BaseNetResponse implements Serializable {

        @InterfaceC65349Pkn("is_cc_creator")
        public final Boolean isCCCreator;

        @InterfaceC65349Pkn("is_video_add_to_series_allowed")
        public final Boolean isVideoAddToSeriesAllowed;

        public final Boolean isCCCreator() {
            return this.isCCCreator;
        }

        public final Boolean isVideoAddToSeriesAllowed() {
            return this.isVideoAddToSeriesAllowed;
        }
    }
}
