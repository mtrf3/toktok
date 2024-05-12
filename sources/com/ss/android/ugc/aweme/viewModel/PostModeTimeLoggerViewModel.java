package com.ss.android.ugc.aweme.viewmodel;

import X.AbstractC65781Prl;
import X.C0MT;
import X.C203077y3;
import X.C2045481a;
import X.C47636Imm;
import X.C50914JyY;
import X.C86670Xzu;
import X.V10;
import X.X1D;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostModeTimeLoggerViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C203077y3 LJLIL = new C203077y3();
    public PhotoModeIngressEtData LJLILLLLZI;
    public long LJLJI;
    public AbstractC65781Prl LJLJJI;

    public final long gv0() {
        PhotoModeIngressEtData photoModeIngressEtData = this.LJLILLLLZI;
        long j = 0;
        if (photoModeIngressEtData == null) {
            return 0L;
        }
        long j2 = photoModeIngressEtData.postModeDuration;
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.LJLIL.LIZ;
        if (l != null) {
            j = l.longValue();
        }
        return (currentTimeMillis - j) + j2;
    }

    public final long hv0() {
        long j;
        C203077y3 c203077y3 = this.LJLIL;
        Long l = c203077y3.LIZJ;
        if (l != null) {
            long longValue = l.longValue();
            c203077y3.LIZIZ = (System.currentTimeMillis() - longValue) + c203077y3.LIZIZ;
        }
        c203077y3.LIZJ = null;
        long j2 = c203077y3.LIZIZ;
        PhotoModeIngressEtData photoModeIngressEtData = this.LJLILLLLZI;
        if (photoModeIngressEtData != null) {
            j = photoModeIngressEtData.videoPlayTimeAccumulated;
        } else {
            j = 0;
        }
        return j2 + j;
    }

    public final void kv0() {
        C203077y3 c203077y3 = this.LJLIL;
        if (c203077y3.LIZJ == null) {
            c203077y3.LIZJ = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void jv0(Aweme aweme, PostModeDetailParams postModeDetailParams) {
        long j;
        String str;
        String str2;
        PhotoModeIngressEtData photoModeIngressEtData;
        String str3;
        PhotoModeIngressEtData photoModeIngressEtData2;
        PhotoModeIngressEtData photoModeIngressEtData3;
        C203077y3 c203077y3 = this.LJLIL;
        Long l = c203077y3.LIZJ;
        if (l != null) {
            c203077y3.LIZIZ = (System.currentTimeMillis() - l.longValue()) + c203077y3.LIZIZ;
        }
        Long l2 = null;
        c203077y3.LIZJ = null;
        if (postModeDetailParams != null && (photoModeIngressEtData3 = postModeDetailParams.photoModeIngressEtData) != null) {
            j = photoModeIngressEtData3.videoPlayTimeAccumulated;
        } else {
            j = 0;
        }
        long j2 = j + c203077y3.LIZIZ;
        StringBuilder LIZJ = V10.LIZJ("duration ", j2, " | accuPlay ");
        LIZJ.append(c203077y3.LIZIZ);
        LIZJ.append(" | accTotal ");
        if (postModeDetailParams != null && (photoModeIngressEtData2 = postModeDetailParams.photoModeIngressEtData) != null) {
            l2 = Long.valueOf(photoModeIngressEtData2.videoPlayTimeAccumulated);
        }
        LIZJ.append(l2);
        X1D.LIZIZ(LIZJ);
        C50914JyY c50914JyY = new C50914JyY();
        String str4 = "";
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        c50914JyY.LIZLLL = str;
        if (postModeDetailParams != null && (str3 = postModeDetailParams.enterMethod) != null) {
            str4 = str3;
        }
        c50914JyY.LJJLIIIJLJLI = str4;
        c50914JyY.LJJIIZ(aweme);
        c50914JyY.LJJLIIIIJ = j2;
        String str5 = "1";
        if (C86670Xzu.LJIL(aweme)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c50914JyY.LLIL = str2;
        if (!C86670Xzu.LJJII(aweme)) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c50914JyY.LLIIZ = str5;
        c50914JyY.LJIILIIL();
        if (postModeDetailParams != null && (photoModeIngressEtData = postModeDetailParams.photoModeIngressEtData) != null) {
            photoModeIngressEtData.videoPlayTimeAccumulated = 0L;
        }
        c203077y3.LIZIZ = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.Pro, X.Prl] */
    public final void iv0(Aweme aweme, boolean z, boolean z2) {
        long j;
        long j2;
        long gv0 = gv0();
        PhotoModeIngressEtData photoModeIngressEtData = this.LJLILLLLZI;
        if (photoModeIngressEtData != null) {
            j = photoModeIngressEtData.photoModeDuration;
        } else {
            j = 0;
        }
        this.LJLJI = gv0 + j + this.LJLJI;
        ?? r0 = this.LJLJJI;
        if (r0 != 0) {
            r0.invoke();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("markPauseBegin photoTotalPlayTime: ");
        LIZ.append(this.LJLJI);
        C0MT.LIZLLL(LIZ, ", postStayTime:", gv0, ", feedStayTime: ");
        LIZ.append(j);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        PhotoModeIngressEtData photoModeIngressEtData2 = this.LJLILLLLZI;
        if ((z2 || !z) && aweme != null && photoModeIngressEtData2 != null) {
            C203077y3 c203077y3 = this.LJLIL;
            c203077y3.getClass();
            Long l = c203077y3.LIZ;
            if (l != null) {
                j2 = System.currentTimeMillis() - l.longValue();
            } else {
                j2 = 0;
            }
            C2045481a.LIZ(aweme, photoModeIngressEtData2.photoModeDuration, photoModeIngressEtData2.postModeDuration + j2, photoModeIngressEtData2.paramsEventType, photoModeIngressEtData2.startVolumeValue, C47636Imm.LJII(2));
        }
        PhotoModeIngressEtData photoModeIngressEtData3 = this.LJLILLLLZI;
        if (photoModeIngressEtData3 == null) {
            return;
        }
        photoModeIngressEtData3.postModeDuration = 0L;
        photoModeIngressEtData3.photoModeDuration = 0L;
    }
}
