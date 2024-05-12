package com.bytedance.android.livesdk.chatroom.banner.panel.model;

import X.C79045V0n;
import X.CAU;
import X.CAY;
import X.CN1;
import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BannerPanelItem implements Parcelable {
    public String activityId;
    public final String bannerId;
    public String bannerType;
    public final int color;
    public final boolean isLight;
    public final String schema;
    public final String title;
    public static final CAU Companion = new CAU();
    public static final Parcelable.Creator<BannerPanelItem> CREATOR = new CAY();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.bannerId);
        out.writeString(this.schema);
    }

    public static int LIZ() {
        Activity topActivity;
        Integer LJI;
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null && (topActivity = iHostAction.getTopActivity()) != null && (LJI = C79045V0n.LJI(R.attr.bm_, topActivity)) != null) {
            return LJI.intValue();
        }
        return -1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|2|3|(13:5|(1:7)|9|10|11|12|(1:14)(1:27)|15|(1:17)(1:26)|18|(1:20)(1:24)|21|22)|29|(1:31)|10|11|12|(0)(0)|15|(0)(0)|18|(0)(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[Catch: all -> 0x00db, TryCatch #1 {all -> 0x00db, blocks: (B:12:0x005e, B:18:0x00ba, B:26:0x007e), top: B:11:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BannerPanelItem(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
