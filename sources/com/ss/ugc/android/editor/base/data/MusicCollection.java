package com.ss.ugc.android.editor.base.data;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MusicCollection extends F9E implements Serializable {
    public final String id;
    public final String name;

    @InterfaceC65349Pkn("name_en")
    public final String nameEn;

    public static /* synthetic */ MusicCollection copy$default(MusicCollection musicCollection, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicCollection.id;
        }
        if ((i & 2) != 0) {
            str2 = musicCollection.name;
        }
        if ((i & 4) != 0) {
            str3 = musicCollection.nameEn;
        }
        return musicCollection.copy(str, str2, str3);
    }

    public final MusicCollection copy(String id, String name, String nameEn) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(nameEn, "nameEn");
        return new MusicCollection(id, name, nameEn);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, this.name, this.nameEn};
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public MusicCollection(String str, String str2, String str3) {
        HH1.LIZ(str, "id", str2, "name", str3, "nameEn");
        this.id = str;
        this.name = str2;
        this.nameEn = str3;
    }
}
