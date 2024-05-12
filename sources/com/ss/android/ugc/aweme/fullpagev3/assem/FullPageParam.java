package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C200987ug;
import X.InterfaceC87283bg;
import X.X1D;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageParam implements InterfaceC87283bg {
    public final Bundle arguments;
    public final Aweme aweme;
    public final PostModeDetailParams postModeDetailParams;
    public final C200987ug postModeNavigator;

    public static /* synthetic */ FullPageParam copy$default(FullPageParam fullPageParam, Aweme aweme, PostModeDetailParams postModeDetailParams, Bundle bundle, C200987ug c200987ug, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme = fullPageParam.aweme;
        }
        if ((i & 2) != 0) {
            postModeDetailParams = fullPageParam.postModeDetailParams;
        }
        if ((i & 4) != 0) {
            bundle = fullPageParam.arguments;
        }
        if ((i & 8) != 0) {
            c200987ug = fullPageParam.postModeNavigator;
        }
        return fullPageParam.copy(aweme, postModeDetailParams, bundle, c200987ug);
    }

    public final FullPageParam copy(Aweme aweme, PostModeDetailParams postModeDetailParams, Bundle bundle, C200987ug c200987ug) {
        return new FullPageParam(aweme, postModeDetailParams, bundle, c200987ug);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullPageParam)) {
            return false;
        }
        FullPageParam fullPageParam = (FullPageParam) obj;
        return o.LJ(this.aweme, fullPageParam.aweme) && o.LJ(this.postModeDetailParams, fullPageParam.postModeDetailParams) && o.LJ(this.arguments, fullPageParam.arguments) && o.LJ(this.postModeNavigator, fullPageParam.postModeNavigator);
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        PostModeDetailParams postModeDetailParams = this.postModeDetailParams;
        int hashCode2 = (hashCode + (postModeDetailParams == null ? 0 : postModeDetailParams.hashCode())) * 31;
        Bundle bundle = this.arguments;
        int hashCode3 = (hashCode2 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        C200987ug c200987ug = this.postModeNavigator;
        return hashCode3 + (c200987ug != null ? c200987ug.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FullPageParam(aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", postModeDetailParams=");
        LIZ.append(this.postModeDetailParams);
        LIZ.append(", arguments=");
        LIZ.append(this.arguments);
        LIZ.append(", postModeNavigator=");
        LIZ.append(this.postModeNavigator);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Bundle getArguments() {
        return this.arguments;
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final PostModeDetailParams getPostModeDetailParams() {
        return this.postModeDetailParams;
    }

    public final C200987ug getPostModeNavigator() {
        return this.postModeNavigator;
    }

    public FullPageParam(Aweme aweme, PostModeDetailParams postModeDetailParams, Bundle bundle, C200987ug c200987ug) {
        this.aweme = aweme;
        this.postModeDetailParams = postModeDetailParams;
        this.arguments = bundle;
        this.postModeNavigator = c200987ug;
    }

    public /* synthetic */ FullPageParam(Aweme aweme, PostModeDetailParams postModeDetailParams, Bundle bundle, C200987ug c200987ug, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aweme, postModeDetailParams, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : c200987ug);
    }
}
