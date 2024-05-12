package tikcast.api.anchor;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class AboutMeResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("about_me")
        public AboutMe aboutMe;

        @InterfaceC65349Pkn("benefits_info")
        public BenefitsInfo benefitsInfo;

        @InterfaceC65349Pkn("conflict_info")
        public IntroConflictInfo conflictInfo;

        @InterfaceC65349Pkn("merge_type")
        public int mergeType;

        @InterfaceC65349Pkn("old_version")
        public boolean oldVersion;
    }
}
