package X;

import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import java.io.Serializable;

/* renamed from: X.GuA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42998GuA implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final AdDislikeInfo LJLJJLL;
    public final InterfaceC42995Gu7 LJLJL;

    public final String getAdId() {
        return this.LJLILLLLZI;
    }

    public final String getAid() {
        return this.LJLIL;
    }

    public final InterfaceC42995Gu7 getCallback() {
        return this.LJLJL;
    }

    public final String getCreativeId() {
        return this.LJLJJI;
    }

    public final AdDislikeInfo getDislikeInfo() {
        return this.LJLJJLL;
    }

    public final String getLogExtra() {
        return this.LJLJJL;
    }

    public final String getRoomId() {
        return this.LJLJI;
    }

    public C42998GuA(String str, String str2, String str3, String str4, String str5, AdDislikeInfo adDislikeInfo, InterfaceC42995Gu7 interfaceC42995Gu7) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = adDislikeInfo;
        this.LJLJL = interfaceC42995Gu7;
    }
}
