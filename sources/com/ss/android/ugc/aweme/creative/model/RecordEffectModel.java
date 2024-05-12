package com.ss.android.ugc.aweme.creative.model;

import X.C279017q;
import X.GPV;
import X.H9J;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordEffectModel implements Parcelable {
    public static final Parcelable.Creator<RecordEffectModel> CREATOR = new H9J();

    @InterfaceC65349Pkn("effect_info")
    public SimpleEffect effectInfo;

    @GPV
    public String enterFrom;

    @GPV
    public boolean hasAutoApplyEffect;

    @GPV
    public boolean isStoryRecording;

    @GPV
    public List<? extends AVChallenge> stickerChallenges;

    @GPV
    public transient String stickerFrom;

    @InterfaceC65349Pkn("sticker_info")
    public StickerInfo stickerInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecordEffectModel() {
        /*
            r10 = this;
            r1 = 0
            r6 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.RecordEffectModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<? extends AVChallenge> list = this.stickerChallenges;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeParcelable((Parcelable) LIZIZ.next(), i);
            }
        }
        out.writeSerializable(this.stickerInfo);
        out.writeParcelable(this.effectInfo, i);
        out.writeString(this.stickerFrom);
        out.writeString(this.enterFrom);
        out.writeInt(this.hasAutoApplyEffect ? 1 : 0);
        out.writeInt(this.isStoryRecording ? 1 : 0);
    }

    public RecordEffectModel(List<? extends AVChallenge> list, StickerInfo stickerInfo, SimpleEffect simpleEffect, String str, String str2, boolean z, boolean z2) {
        this.stickerChallenges = list;
        this.stickerInfo = stickerInfo;
        this.effectInfo = simpleEffect;
        this.stickerFrom = str;
        this.enterFrom = str2;
        this.hasAutoApplyEffect = z;
        this.isStoryRecording = z2;
    }

    public /* synthetic */ RecordEffectModel(List list, StickerInfo stickerInfo, SimpleEffect simpleEffect, String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : stickerInfo, (i & 4) != 0 ? null : simpleEffect, (i & 8) != 0 ? null : str, (i & 16) == 0 ? str2 : null, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }
}
