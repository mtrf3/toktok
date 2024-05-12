package com.ss.android.ugc.aweme.notice.repo;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TutorialVideoResp extends BaseResponse {

    @InterfaceC65349Pkn("msg_info")
    public final TutorialVideoInfo info;

    /* JADX WARN: Multi-variable type inference failed */
    public TutorialVideoResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TutorialVideoResp copy$default(TutorialVideoResp tutorialVideoResp, TutorialVideoInfo tutorialVideoInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            tutorialVideoInfo = tutorialVideoResp.info;
        }
        return tutorialVideoResp.copy(tutorialVideoInfo);
    }

    public final TutorialVideoResp copy(TutorialVideoInfo tutorialVideoInfo) {
        return new TutorialVideoResp(tutorialVideoInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TutorialVideoResp) && o.LJ(this.info, ((TutorialVideoResp) obj).info);
    }

    public int hashCode() {
        TutorialVideoInfo tutorialVideoInfo = this.info;
        if (tutorialVideoInfo == null) {
            return 0;
        }
        return tutorialVideoInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TutorialVideoResp(info=");
        LIZ.append(this.info);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final TutorialVideoInfo getInfo() {
        return this.info;
    }

    public TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo) {
        this.info = tutorialVideoInfo;
    }

    public /* synthetic */ TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tutorialVideoInfo);
    }
}
