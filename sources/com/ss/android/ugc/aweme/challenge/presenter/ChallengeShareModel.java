package com.ss.android.ugc.aweme.challenge.presenter;

import X.C279017q;
import X.C62420Oee;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ChallengeShareModel extends ShareModel {
    public static final Parcelable.Creator<ChallengeShareModel> CREATOR = new C62420Oee();
    public final List<Aweme> awemeList;
    public final Challenge challenge;
    public final boolean isHashtag;
    public final String originId;
    public final String processId;
    public final String requestId;

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeSerializable(this.challenge);
        List<Aweme> list = this.awemeList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeSerializable((Serializable) LIZIZ.next());
            }
        }
        out.writeInt(this.isHashtag ? 1 : 0);
        out.writeString(this.requestId);
        out.writeString(this.processId);
        out.writeString(this.originId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeShareModel(Challenge challenge, List<? extends Aweme> list, boolean z, String str, String str2, String str3) {
        super(challenge);
        this.challenge = challenge;
        this.awemeList = list;
        this.isHashtag = z;
        this.requestId = str;
        this.processId = str2;
        this.originId = str3;
    }
}
