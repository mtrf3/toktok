package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C1DD;
import X.V0N;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NudgeContent extends GifContent {
    public boolean isNudgeBack;
    public boolean isReceive;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        String str;
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("nudge");
        Bundle bundle = LIZ.extras;
        bundle.putSerializable("video_cover", getUrl());
        bundle.putInt("aweme_type", this.type);
        if (this.isNudgeBack) {
            str = "action_bar:nudge_back";
        } else {
            str = "action_bar:nudge";
        }
        bundle.putString("a:src", str);
        bundle.putBoolean("is_receive", this.isReceive);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return getString(R.string.eqx);
    }

    /* loaded from: classes2.dex */
    public enum Type {
        RECEIVE_NUDGE(false, true, false, R.string.eqv),
        SEND_NUDGE(false, false, false, R.string.evf),
        RECEIVE_NUDGE_BACK(true, true, false, R.string.er1),
        RECEIVE_NUDGE_PUSH(false, true, true, R.string.eqv),
        RECEIVE_NUDGE_BACK_PUSH(true, true, true, R.string.er1),
        SEND_NUDGE_BACK(true, false, false, R.string.eqr);

        public static final Companion Companion = new Companion();
        public final boolean isFromPush;
        public final boolean isNudgeBack;
        public final boolean isReceive;
        public final int wrapMsgHintId;

        public static Type valueOf(String str) {
            return (Type) V0N.LJJJ(Type.class, str);
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final Type getType$im_base_release(boolean z, boolean z2, boolean z3) {
                for (Type type : Type.values()) {
                    if (type.isNudgeBack() == z && type.isReceive() == z2 && type.isFromPush() == z3) {
                        return type;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public final int getWrapMsgHintId() {
            return this.wrapMsgHintId;
        }

        public final boolean isFromPush() {
            return this.isFromPush;
        }

        public final boolean isNudgeBack() {
            return this.isNudgeBack;
        }

        public final boolean isReceive() {
            return this.isReceive;
        }

        Type(boolean z, boolean z2, boolean z3, int i) {
            this.isNudgeBack = z;
            this.isReceive = z2;
            this.isFromPush = z3;
            this.wrapMsgHintId = i;
        }
    }

    public final boolean isNudgeBack() {
        return this.isNudgeBack;
    }

    public final boolean isReceive() {
        return this.isReceive;
    }

    private final String getString(int i) {
        return C1DD.LIZLLL(i, "AppContextManager.getApp…ontext().getString(resId)");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        o.LJIIIZ(context, "context");
        return getMsgHint();
    }

    public final void setNudgeBack(boolean z) {
        this.isNudgeBack = z;
    }

    public final void setReceive(boolean z) {
        this.isReceive = z;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        String string = getString(Type.Companion.getType$im_base_release(this.isNudgeBack, z, z2).getWrapMsgHintId());
        if (str == null) {
            str = "";
        }
        return ujb.o.LJJJJZ(string, "%s", str, false);
    }
}
