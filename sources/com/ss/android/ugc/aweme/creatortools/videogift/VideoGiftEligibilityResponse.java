package com.ss.android.ugc.aweme.creatortools.videogift;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoGiftEligibilityResponse extends BaseResponse {

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("requirements")
    public final List<Requirement> requirements;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGiftEligibilityResponse)) {
            return false;
        }
        VideoGiftEligibilityResponse videoGiftEligibilityResponse = (VideoGiftEligibilityResponse) obj;
        return o.LJ(this.image, videoGiftEligibilityResponse.image) && o.LJ(this.requirements, videoGiftEligibilityResponse.requirements);
    }

    public final int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        List<Requirement> list = this.requirements;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoGiftEligibilityResponse(image=");
        LIZ.append(this.image);
        LIZ.append(", requirements=");
        return C1NE.LIZIZ(LIZ, this.requirements, ')', LIZ);
    }

    public VideoGiftEligibilityResponse(Image image, List<Requirement> list) {
        this.image = image;
        this.requirements = list;
    }
}
