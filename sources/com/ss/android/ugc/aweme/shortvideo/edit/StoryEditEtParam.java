package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C43588H8u;
import X.F9E;
import X.H7V;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StoryEditEtParam extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryEditEtParam> CREATOR = new H7V();
    public final int clipCount;
    public final String contentSource;
    public final String contentType;
    public final boolean isMultiContent;
    public final String shootPage;
    public final String shootTabName;

    public static /* synthetic */ StoryEditEtParam copy$default(StoryEditEtParam storyEditEtParam, String str, String str2, String str3, String str4, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = storyEditEtParam.shootPage;
        }
        if ((i2 & 2) != 0) {
            str2 = storyEditEtParam.shootTabName;
        }
        if ((i2 & 4) != 0) {
            str3 = storyEditEtParam.contentSource;
        }
        if ((i2 & 8) != 0) {
            str4 = storyEditEtParam.contentType;
        }
        if ((i2 & 16) != 0) {
            z = storyEditEtParam.isMultiContent;
        }
        if ((i2 & 32) != 0) {
            i = storyEditEtParam.clipCount;
        }
        return storyEditEtParam.copy(str, str2, str3, str4, z, i);
    }

    public final StoryEditEtParam copy(String shootPage, String shootTabName, String contentSource, String contentType, boolean z, int i) {
        o.LJIIIZ(shootPage, "shootPage");
        o.LJIIIZ(shootTabName, "shootTabName");
        o.LJIIIZ(contentSource, "contentSource");
        o.LJIIIZ(contentType, "contentType");
        return new StoryEditEtParam(shootPage, shootTabName, contentSource, contentType, z, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.shootPage, this.shootTabName, this.contentSource, this.contentType, Boolean.valueOf(this.isMultiContent), Integer.valueOf(this.clipCount)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.shootPage);
        out.writeString(this.shootTabName);
        out.writeString(this.contentSource);
        out.writeString(this.contentType);
        out.writeInt(this.isMultiContent ? 1 : 0);
        out.writeInt(this.clipCount);
    }

    public final int getClipCount() {
        return this.clipCount;
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getShootPage() {
        return this.shootPage;
    }

    public final String getShootTabName() {
        return this.shootTabName;
    }

    public final boolean isMultiContent() {
        return this.isMultiContent;
    }

    public StoryEditEtParam(String str, String str2, String str3, String str4, boolean z, int i) {
        C43588H8u.LIZLLL(str, "shootPage", str2, "shootTabName", str3, "contentSource", str4, "contentType");
        this.shootPage = str;
        this.shootTabName = str2;
        this.contentSource = str3;
        this.contentType = str4;
        this.isMultiContent = z;
        this.clipCount = i;
    }
}
