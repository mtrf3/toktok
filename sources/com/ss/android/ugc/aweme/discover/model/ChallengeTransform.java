package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ChallengeTransform implements Serializable {

    @InterfaceC65349Pkn("action")
    public String action;

    @InterfaceC65349Pkn("icon")
    public UrlModel iconUrlModel;

    @InterfaceC65349Pkn("text")
    public String text;

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeTransform() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChallengeTransform copy$default(ChallengeTransform challengeTransform, String str, UrlModel urlModel, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeTransform.text;
        }
        if ((i & 2) != 0) {
            urlModel = challengeTransform.iconUrlModel;
        }
        if ((i & 4) != 0) {
            str2 = challengeTransform.action;
        }
        return challengeTransform.copy(str, urlModel, str2);
    }

    public final ChallengeTransform copy(String str, UrlModel urlModel, String str2) {
        return new ChallengeTransform(str, urlModel, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeTransform)) {
            return false;
        }
        ChallengeTransform challengeTransform = (ChallengeTransform) obj;
        return o.LJ(this.text, challengeTransform.text) && o.LJ(this.iconUrlModel, challengeTransform.iconUrlModel) && o.LJ(this.action, challengeTransform.action);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.iconUrlModel;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str2 = this.action;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChallengeTransform(text=");
        LIZ.append(this.text);
        LIZ.append(", iconUrlModel=");
        LIZ.append(this.iconUrlModel);
        LIZ.append(", action=");
        return q.LIZIZ(LIZ, this.action, ')', LIZ);
    }

    public final String getAction() {
        return this.action;
    }

    public final UrlModel getIconUrlModel() {
        return this.iconUrlModel;
    }

    public final String getText() {
        return this.text;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setIconUrlModel(UrlModel urlModel) {
        this.iconUrlModel = urlModel;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public ChallengeTransform(String str, UrlModel urlModel, String str2) {
        this.text = str;
        this.iconUrlModel = urlModel;
        this.action = str2;
    }

    public /* synthetic */ ChallengeTransform(String str, UrlModel urlModel, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : urlModel, (i & 4) != 0 ? null : str2);
    }
}
