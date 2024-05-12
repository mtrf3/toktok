package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class UploadSingleSelectData {

    @InterfaceC65349Pkn("creation_upload_3cover")
    public final boolean upload3Columns;

    @InterfaceC65349Pkn("creation_upload_3cover_nonstory")
    public final boolean upload3ColumnsNonStory;

    @InterfaceC65349Pkn("creation_upload_alltab_nonstory")
    public final boolean uploadAllTabNonStory;

    @InterfaceC65349Pkn("creation_upload_remember_lastchoice")
    public final boolean uploadRememberLastChoice;

    @InterfaceC65349Pkn("creation_upload_remember_lastchoice_nonstory")
    public final boolean uploadRememberLastChoiceNonStory;

    @InterfaceC65349Pkn("creation_upload_singleselect")
    public final boolean uploadSingleSelect;

    @InterfaceC65349Pkn("creation_upload_singleselect_nonstory")
    public final boolean uploadSingleSelectNonStory;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadSingleSelectData() {
        /*
            r10 = this;
            r1 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 0
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData.<init>():void");
    }

    public final boolean getUpload3Columns() {
        return this.upload3Columns;
    }

    public final boolean getUpload3ColumnsNonStory() {
        return this.upload3ColumnsNonStory;
    }

    public final boolean getUploadAllTabNonStory() {
        return this.uploadAllTabNonStory;
    }

    public final boolean getUploadRememberLastChoice() {
        return this.uploadRememberLastChoice;
    }

    public final boolean getUploadRememberLastChoiceNonStory() {
        return this.uploadRememberLastChoiceNonStory;
    }

    public final boolean getUploadSingleSelect() {
        return this.uploadSingleSelect;
    }

    public final boolean getUploadSingleSelectNonStory() {
        return this.uploadSingleSelectNonStory;
    }

    public UploadSingleSelectData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.uploadSingleSelect = z;
        this.uploadSingleSelectNonStory = z2;
        this.upload3Columns = z3;
        this.upload3ColumnsNonStory = z4;
        this.uploadRememberLastChoice = z5;
        this.uploadRememberLastChoiceNonStory = z6;
        this.uploadAllTabNonStory = z7;
    }

    public /* synthetic */ UploadSingleSelectData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7);
    }
}
