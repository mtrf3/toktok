package com.bytedance.android.livesdk.chatroom.utils;

import X.CI3;
import X.CI4;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class EmoteFixTextHelper implements Parcelable {
    public static final CI3 CREATOR = new CI3();
    public int emoteLength = 4;
    public boolean isReceiveInput = true;
    public ArrayList<EmoteText> list = new ArrayList<>();
    public int recordInputIndex;
    public int recordLength;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* loaded from: classes6.dex */
    public static final class EmoteText implements Parcelable {
        public static final CI4 CREATOR = new CI4();
        public String emoji;
        public EmoteModel emote;
        public int state;
        public CharSequence text;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public EmoteText() {
            this.emoji = "";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            o.LJIIIZ(parcel, "parcel");
            parcel.writeInt(this.state);
            parcel.writeParcelable(this.emote, i);
            CharSequence charSequence = this.text;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeString(this.emoji);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EmoteText(int i, EmoteModel emote, CharSequence text, String emoji, int i2) {
            this();
            emote = (i2 & 2) != 0 ? new EmoteModel() : emote;
            text = (i2 & 4) != 0 ? "" : text;
            emoji = (i2 & 8) != 0 ? "" : emoji;
            o.LJIIIZ(emote, "emote");
            o.LJIIIZ(text, "text");
            o.LJIIIZ(emoji, "emoji");
            this.state = i;
            this.emote = emote;
            this.text = text;
            this.emoji = emoji;
        }
    }

    public final int LIZ() {
        Iterator<EmoteText> it = this.list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().state == 1) {
                i += this.emoteLength;
            } else {
                i++;
            }
        }
        return i;
    }

    public final String LIZIZ() {
        if (this.list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = this.list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(this.list, i);
            o.LJIIIIZZ(obj, "list[index]");
            EmoteText emoteText = (EmoteText) obj;
            if (emoteText.state == 0) {
                sb.append(String.valueOf(emoteText.text));
            }
            if (emoteText.state == 2) {
                sb.append(String.valueOf(emoteText.emoji));
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "s.toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeInt(this.emoteLength);
        dest.writeByte(this.isReceiveInput ? (byte) 1 : (byte) 0);
        dest.writeTypedList(this.list);
        dest.writeInt(this.recordInputIndex);
        dest.writeInt(this.recordLength);
    }
}
