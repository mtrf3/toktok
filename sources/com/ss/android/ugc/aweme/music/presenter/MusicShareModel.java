package com.ss.android.ugc.aweme.music.presenter;

import X.C279017q;
import X.C62421Oef;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicShareModel extends ShareModel {
    public static final Parcelable.Creator<MusicShareModel> CREATOR = new C62421Oef();
    public final List<Aweme> awemeList;
    public final Music music;
    public final String processId;

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeSerializable(this.music);
        List<Aweme> list = this.awemeList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeSerializable((Serializable) LIZIZ.next());
            }
        }
        out.writeString(this.processId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicShareModel(Music music, List<? extends Aweme> list, String str) {
        super(music);
        this.music = music;
        this.awemeList = list;
        this.processId = str;
    }
}
