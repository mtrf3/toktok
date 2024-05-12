package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSAudioBean extends F9E implements Parcelable {
    public static final Parcelable.Creator<TTSAudioBean> CREATOR = new Parcelable.Creator<TTSAudioBean>() { // from class: X.5Zo
        @Override // android.os.Parcelable.Creator
        public final TTSAudioBean createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TTSAudioBean(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSAudioBean[] newArray(int i) {
            return new TTSAudioBean[i];
        }
    };

    @InterfaceC65349Pkn("challenge_ids")
    public final List<String> challengeIds;

    public TTSAudioBean() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TTSAudioBean copy$default(TTSAudioBean tTSAudioBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tTSAudioBean.challengeIds;
        }
        return tTSAudioBean.copy(list);
    }

    public final TTSAudioBean copy(List<String> challengeIds) {
        o.LJIIIZ(challengeIds, "challengeIds");
        return new TTSAudioBean(challengeIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.challengeIds};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeStringList(this.challengeIds);
    }

    public final List<String> getChallengeIds() {
        return this.challengeIds;
    }

    public TTSAudioBean(List<String> challengeIds) {
        o.LJIIIZ(challengeIds, "challengeIds");
        this.challengeIds = challengeIds;
    }

    public TTSAudioBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
