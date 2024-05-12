package com.ss.ugc.android.editor.components.base.model;

import X.C79062V1e;
import X.EnumC123964tk;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SelectedMusicInfo {
    public final String musicId;
    public final String path;
    public final String title;
    public final EnumC123964tk type;

    public static /* synthetic */ SelectedMusicInfo copy$default(SelectedMusicInfo selectedMusicInfo, String str, String str2, String str3, EnumC123964tk enumC123964tk, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedMusicInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = selectedMusicInfo.path;
        }
        if ((i & 4) != 0) {
            str3 = selectedMusicInfo.musicId;
        }
        if ((i & 8) != 0) {
            enumC123964tk = selectedMusicInfo.type;
        }
        return selectedMusicInfo.copy(str, str2, str3, enumC123964tk);
    }

    public final SelectedMusicInfo copy(String title, String path, String str, EnumC123964tk type) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(type, "type");
        return new SelectedMusicInfo(title, path, str, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedMusicInfo)) {
            return false;
        }
        SelectedMusicInfo selectedMusicInfo = (SelectedMusicInfo) obj;
        return o.LJ(this.title, selectedMusicInfo.title) && o.LJ(this.path, selectedMusicInfo.path) && o.LJ(this.musicId, selectedMusicInfo.musicId) && this.type == selectedMusicInfo.type;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedMusicInfo(title=");
        LIZ.append(this.title);
        LIZ.append(", path=");
        LIZ.append(this.path);
        LIZ.append(", musicId=");
        LIZ.append(this.musicId);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.path, this.title.hashCode() * 31, 31);
        String str = this.musicId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.type.hashCode() + ((LJ + hashCode) * 31);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EnumC123964tk getType() {
        return this.type;
    }

    public SelectedMusicInfo(String title, String path, String str, EnumC123964tk type) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(type, "type");
        this.title = title;
        this.path = path;
        this.musicId = str;
        this.type = type;
    }

    public /* synthetic */ SelectedMusicInfo(String str, String str2, String str3, EnumC123964tk enumC123964tk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? EnumC123964tk.SONG : enumC123964tk);
    }
}
