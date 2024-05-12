package com.tiktok.sticker.commonsticker.model;

import X.C1542563p;
import X.C64Q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel;
import com.tiktok.sticker.commonsticker.model.PollStickerModel;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class PollStickerModel extends BaseStickerModel {
    public static final C1542563p CREATOR = new Parcelable.Creator<PollStickerModel>() { // from class: X.63p
        @Override // android.os.Parcelable.Creator
        public final PollStickerModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new PollStickerModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PollStickerModel[] newArray(int i) {
            return new PollStickerModel[i];
        }
    };
    public ArrayList<OptionsBean> options;

    @InterfaceC65349Pkn("vote_id")
    public long pollId;

    @InterfaceC65349Pkn("question")
    public String question;

    @InterfaceC65349Pkn("ref_id")
    public long refId;

    @InterfaceC65349Pkn("ref_type")
    public final int refType;

    @InterfaceC65349Pkn("select_option_id")
    public long selectOptionId;
    public String stickerId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PollStickerModel() {
        /*
            r13 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r11 = 127(0x7f, float:1.78E-43)
            r0 = r13
            r4 = r2
            r7 = r2
            r9 = r1
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r4, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.sticker.commonsticker.model.PollStickerModel.<init>():void");
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PollStickerModel(android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            java.lang.String r1 = r14.readString()
            if (r1 != 0) goto Ld
            java.lang.String r1 = ""
        Ld:
            long r2 = r14.readLong()
            long r4 = r14.readLong()
            int r6 = r14.readInt()
            long r7 = r14.readLong()
            r9 = 0
            r11 = 96
            r0 = r13
            r10 = r9
            r12 = r9
            r0.<init>(r1, r2, r4, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.sticker.commonsticker.model.PollStickerModel.<init>(android.os.Parcel):void");
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel
    public final void syncStickerModelWithStickerRender(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        super.syncStickerModelWithStickerRender(stickerView);
        if (stickerView instanceof C64Q) {
            C64Q c64q = (C64Q) stickerView;
            this.question = c64q.getPollStruct().question;
            this.options = c64q.getPollStruct().options;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.question);
        parcel.writeLong(this.pollId);
        parcel.writeLong(this.refId);
        parcel.writeInt(this.refType);
        parcel.writeLong(this.selectOptionId);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PollStickerModel(java.lang.String r36, long r37, long r39, int r41, long r42, java.util.ArrayList<com.tiktok.sticker.commonsticker.model.OptionsBean> r44, java.lang.String r45) {
        /*
            r35 = this;
            java.lang.String r0 = "question"
            r3 = r36
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "options"
            r2 = r44
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "stickerId"
            r1 = r45
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.63X r0 = X.C63X.POLL
            int r8 = r0.getType()
            r6 = 0
            r9 = 0
            r11 = 0
            r21 = 1
            r25 = 294907(0x47ffb, float:4.13253E-40)
            r27 = 0
            r5 = r35
            r7 = r6
            r10 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r6
            r22 = r21
            r23 = r21
            r24 = r6
            r26 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5.question = r3
            r3 = r37
            r5.pollId = r3
            r3 = r39
            r5.refId = r3
            r0 = r41
            r5.refType = r0
            r3 = r42
            r5.selectOptionId = r3
            r5.options = r2
            r5.stickerId = r1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L86
            java.util.ArrayList<com.tiktok.sticker.commonsticker.model.OptionsBean> r1 = r5.options
            com.tiktok.sticker.commonsticker.model.OptionsBean r0 = new com.tiktok.sticker.commonsticker.model.OptionsBean
            r28 = 0
            r33 = 15
            r30 = r28
            r32 = r27
            r34 = r27
            r26 = r0
            r26.<init>(r27, r28, r30, r32, r33, r34)
            r1.add(r0)
            java.util.ArrayList<com.tiktok.sticker.commonsticker.model.OptionsBean> r1 = r5.options
            com.tiktok.sticker.commonsticker.model.OptionsBean r0 = new com.tiktok.sticker.commonsticker.model.OptionsBean
            r30 = r28
            r32 = r27
            r34 = r27
            r26 = r0
            r26.<init>(r27, r28, r30, r32, r33, r34)
            r1.add(r0)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.sticker.commonsticker.model.PollStickerModel.<init>(java.lang.String, long, long, int, long, java.util.ArrayList, java.lang.String):void");
    }

    public /* synthetic */ PollStickerModel(String str, long j, long j2, int i, long j3, ArrayList arrayList, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? j3 : 0L, (i2 & 32) != 0 ? new ArrayList() : arrayList, (i2 & 64) == 0 ? str2 : "");
    }
}
