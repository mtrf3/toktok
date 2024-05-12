package com.ss.android.ugc.aweme.im.service.model;

import X.C243619hF;
import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MediaSafetyModel extends F9E implements Serializable {
    public static final C243619hF Companion = new Object() { // from class: X.9hF
    };
    public final String LJLIL;
    public final String LJLILLLLZI;

    @InterfaceC65349Pkn("has_negative_action")
    public final boolean hasNegativeAction;

    @InterfaceC65349Pkn("is_nude")
    public final boolean isNudeMsg;

    @InterfaceC65349Pkn("is_nudity_mask")
    public final boolean isNudityMask;

    @InterfaceC65349Pkn("is_safe_mode")
    public final boolean isSafeMode;

    @InterfaceC65349Pkn("is_safety_mask")
    public final boolean isSafetyMask;

    @InterfaceC65349Pkn("stringified_msg")
    public final String stringifiedMsg;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaSafetyModel() {
        /*
            r11 = this;
            r1 = 0
            r3 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r1
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.model.MediaSafetyModel.<init>():void");
    }

    public static /* synthetic */ MediaSafetyModel copy$default(MediaSafetyModel mediaSafetyModel, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaSafetyModel.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = mediaSafetyModel.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = mediaSafetyModel.isSafeMode;
        }
        if ((i & 8) != 0) {
            z2 = mediaSafetyModel.isSafetyMask;
        }
        if ((i & 16) != 0) {
            z3 = mediaSafetyModel.isNudityMask;
        }
        if ((i & 32) != 0) {
            z4 = mediaSafetyModel.isNudeMsg;
        }
        if ((i & 64) != 0) {
            z5 = mediaSafetyModel.hasNegativeAction;
        }
        if ((i & 128) != 0) {
            str3 = mediaSafetyModel.stringifiedMsg;
        }
        return mediaSafetyModel.copy(str, str2, z, z2, z3, z4, z5, str3);
    }

    public final MediaSafetyModel copy(String msgId, String serverMsgId, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String stringifiedMsg) {
        o.LJIIIZ(msgId, "msgId");
        o.LJIIIZ(serverMsgId, "serverMsgId");
        o.LJIIIZ(stringifiedMsg, "stringifiedMsg");
        return new MediaSafetyModel(msgId, serverMsgId, z, z2, z3, z4, z5, stringifiedMsg);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.isSafeMode), Boolean.valueOf(this.isSafetyMask), Boolean.valueOf(this.isNudityMask), Boolean.valueOf(this.isNudeMsg), Boolean.valueOf(this.hasNegativeAction), this.stringifiedMsg};
    }

    public final boolean getHasNegativeAction() {
        return this.hasNegativeAction;
    }

    public final String getMsgId() {
        return this.LJLIL;
    }

    public final String getServerMsgId() {
        return this.LJLILLLLZI;
    }

    public final String getStringifiedMsg() {
        return this.stringifiedMsg;
    }

    public final boolean isNudeMsg() {
        return this.isNudeMsg;
    }

    public final boolean isNudityMask() {
        return this.isNudityMask;
    }

    public final boolean isSafeMode() {
        return this.isSafeMode;
    }

    public final boolean isSafetyMask() {
        return this.isSafetyMask;
    }

    public MediaSafetyModel(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str3) {
        HH1.LIZ(str, "msgId", str2, "serverMsgId", str3, "stringifiedMsg");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.isSafeMode = z;
        this.isSafetyMask = z2;
        this.isNudityMask = z3;
        this.isNudeMsg = z4;
        this.hasNegativeAction = z5;
        this.stringifiedMsg = str3;
    }

    public /* synthetic */ MediaSafetyModel(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) == 0 ? z5 : false, (i & 128) == 0 ? str3 : "");
    }
}
