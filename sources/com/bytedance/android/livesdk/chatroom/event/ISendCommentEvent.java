package com.bytedance.android.livesdk.chatroom.event;

import X.CI7;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public interface ISendCommentEvent {

    /* loaded from: classes6.dex */
    public enum Sender implements Parcelable {
        UNKNOWN,
        COMMENTWIDGET,
        LOTTERY,
        QA,
        POLL,
        QUICKCOMMENT,
        REPLY,
        QUICKEMOTECOMMENT,
        QUICKCOMMENTFIRSTGIFT,
        QUICKSUBGIFTCOMMENT,
        QUICK_COMMENT_EC,
        COMMENT_COMBO_TRAY;

        public static final CI7 CREATOR = new CI7();
        public Map<String, String> logArgs = new LinkedHashMap();

        public static Sender valueOf(String str) {
            return (Sender) V0N.LJJJ(Sender.class, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Map<String, String> getLogArgs() {
            return this.logArgs;
        }

        public final void setLogArgs(Map<String, String> map) {
            o.LJIIIZ(map, "<set-?>");
            this.logArgs = map;
        }

        Sender() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            o.LJIIIZ(parcel, "parcel");
            parcel.writeString(name());
            parcel.writeMap(this.logArgs);
        }
    }
}
