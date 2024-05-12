package Y;

import X.AbstractC65743Pr9;
import X.C134225Oo;
import X.C142955jH;
import X.C172656q5;
import X.C172746qE;
import X.C43645HAz;
import X.C43832HIe;
import X.C43838HIk;
import X.C44043HQh;
import X.C44044HQi;
import X.C44045HQj;
import X.C45244HpI;
import X.C60903NvH;
import X.C73433Srt;
import X.C73893SzJ;
import X.C78934UyQ;
import X.H89;
import X.HJE;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.X1D;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS85S1100000_7;

/* loaded from: classes8.dex */
public class IDuS2S1200000_7 implements InterfaceC86003Zc {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS2S1200000_7 iDuS2S1200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        C43832HIe c43832HIe = (C43832HIe) iDuS2S1200000_7.l1;
        ShortVideoContext shortVideoContext = (ShortVideoContext) iDuS2S1200000_7.l2;
        String str = iDuS2S1200000_7.s0;
        c43832HIe.getClass();
        if (shortVideoContext != null) {
            C43838HIk.LIZ = shortVideoContext.LJI();
            C43838HIk.LIZIZ = shortVideoContext.shootWay;
            C43838HIk.LIZJ = shortVideoContext.enterFrom;
            C43838HIk.LIZLLL = "video";
            C43838HIk.LJ = "shoot";
        }
        if (c43832HIe.LJLIL.LLZLLLL()) {
            C142955jH.LIZ("fail to stopRecord before goNext(Normal)");
        }
        interfaceC73573Su9.onNext(AbstractC65743Pr9.fromNullable(C43832HIe.LJ(shortVideoContext, str)));
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$1(IDuS2S1200000_7 iDuS2S1200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C73893SzJ) iDuS2S1200000_7.l1).onNext(new C43645HAz("stage_fetch_music", 0.0f, null, 12));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start requestMusic: musicId = ");
        LIZ.append(iDuS2S1200000_7.s0);
        C134225Oo.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        IAnotherMusicService musicService = C78934UyQ.LJLIL.getMusicService();
        String str = iDuS2S1200000_7.s0;
        musicService.requestMusic(str, new C44045HQj((C73433Srt) interfaceC73573Su9, str, (C44044HQi) iDuS2S1200000_7.l2, (C73893SzJ) iDuS2S1200000_7.l1));
    }

    public static final void subscribe$2(IDuS2S1200000_7 iDuS2S1200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C73893SzJ) iDuS2S1200000_7.l1).onNext(new C43645HAz("stage_fetch_template", 0.0f, null, 12));
        C45244HpI.LIZ.LIZIZ(new AqS157S0100000_7(((C44044HQi) iDuS2S1200000_7.l2).LIZLLL, 417));
        C172656q5.LIZIZ();
        H89.LIZ = new C172746qE();
        HJE LJI = C60903NvH.LJIIJJI().LJI();
        String str = iDuS2S1200000_7.s0;
        C44044HQi c44044HQi = (C44044HQi) iDuS2S1200000_7.l2;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        LJI.LIZLLL(str, c44044HQi.LIZJ, new C44043HQh(c73433Srt, str, c44044HQi, (C73893SzJ) iDuS2S1200000_7.l1), new AqS85S1100000_7(c73433Srt, iDuS2S1200000_7.s0, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$3(Y.IDuS2S1200000_7 r9, X.InterfaceC73573Su9 r10) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDuS2S1200000_7.subscribe$3(Y.IDuS2S1200000_7, X.Su9):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDuS2S1200000_7(X.C44044HQi r2, X.C73893SzJ r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r2
            r0.s0 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r3
            r0.s0 = r4
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDuS2S1200000_7.<init>(X.HQi, X.SzJ, java.lang.String, int):void");
    }

    public IDuS2S1200000_7(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
