package com.ss.android.ugc.aweme.actionai.action.data;

import X.C61878OQg;
import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SmartMovieRequestBody extends F9E {
    public List<ImageInfoList> image_info_list;
    public String version;

    public SmartMovieRequestBody() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartMovieRequestBody copy$default(SmartMovieRequestBody smartMovieRequestBody, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = smartMovieRequestBody.image_info_list;
        }
        if ((i & 2) != 0) {
            str = smartMovieRequestBody.version;
        }
        return smartMovieRequestBody.copy(list, str);
    }

    public final SmartMovieRequestBody copy(List<ImageInfoList> image_info_list, String version) {
        o.LJIIIZ(image_info_list, "image_info_list");
        o.LJIIIZ(version, "version");
        return new SmartMovieRequestBody(image_info_list, version);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.image_info_list, this.version};
    }

    public final List<ImageInfoList> getImage_info_list() {
        return this.image_info_list;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setImage_info_list(List<ImageInfoList> list) {
        o.LJIIIZ(list, "<set-?>");
        this.image_info_list = list;
    }

    public final void setVersion(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.version = str;
    }

    public SmartMovieRequestBody(List<ImageInfoList> image_info_list, String version) {
        o.LJIIIZ(image_info_list, "image_info_list");
        o.LJIIIZ(version, "version");
        this.image_info_list = image_info_list;
        this.version = version;
    }

    public SmartMovieRequestBody(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? "" : str);
    }
}
