package com.bytedance.ies.xelement.audiott.bean;

import X.C47163If9;
import X.C47164IfA;
import X.EnumC47176IfM;
import X.EnumC47179IfP;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.google.gson.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PlayModel extends F9E {

    @InterfaceC65349Pkn("type")
    public final String encryptType;

    @InterfaceC65349Pkn("quality")
    public final String quality;

    @InterfaceC65349Pkn("video_model")
    public final m videoModelJsonObj;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PlayModel copy$default(PlayModel playModel, String str, String str2, m mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playModel.quality;
        }
        if ((i & 2) != 0) {
            str2 = playModel.encryptType;
        }
        if ((i & 4) != 0) {
            mVar = playModel.videoModelJsonObj;
        }
        return playModel.copy(str, str2, mVar);
    }

    public final PlayModel copy(String str, String str2, m mVar) {
        return new PlayModel(str, str2, mVar);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.quality, this.encryptType, this.videoModelJsonObj};
    }

    public final EnumC47176IfM getResolution() {
        String str = this.quality;
        if (o.LJ(str, EnumC47179IfP.EXCELLENT.getDesc())) {
            return EnumC47176IfM.SuperHigh;
        }
        if (o.LJ(str, EnumC47179IfP.GOOD.getDesc())) {
            return EnumC47176IfM.H_High;
        }
        if (o.LJ(str, EnumC47179IfP.REGULAR.getDesc())) {
            return EnumC47176IfM.Standard;
        }
        return EnumC47176IfM.Standard;
    }

    public final C47164IfA getVideoModel() {
        m mVar = this.videoModelJsonObj;
        if (mVar != null) {
            return makeVideoModel(mVar);
        }
        return null;
    }

    public final String getEncryptType() {
        return this.encryptType;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final m getVideoModelJsonObj() {
        return this.videoModelJsonObj;
    }

    private final boolean isValid(C47163If9 c47163If9) {
        if (c47163If9.LJJIJIIJIL == 10) {
            return true;
        }
        return false;
    }

    private final C47164IfA makeVideoModel(m mVar) {
        try {
            C47164IfA c47164IfA = new C47164IfA();
            C47163If9 c47163If9 = new C47163If9();
            c47163If9.LIZJ(new JSONObject(mVar.toString()));
            if (!isValid(c47163If9)) {
                return null;
            }
            c47164IfA.LJJIJIIJI(c47163If9);
            return c47164IfA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public PlayModel(String str, String str2, m mVar) {
        this.quality = str;
        this.encryptType = str2;
        this.videoModelJsonObj = mVar;
    }

    public /* synthetic */ PlayModel(String str, String str2, m mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : mVar);
    }
}
