package X;

import com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase;
import kotlin.jvm.internal.o;

/* renamed from: X.YWr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87525YWr extends C1CG<C87526YWs> {
    public final /* synthetic */ C87523YWp LIZLLL;

    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `offline_mode_feed_pb` (`sec_uid`,`insert_time`,`aweme_struct`,`aid`,`has_cached`,`has_watched`,`cached_time`,`url_key`) VALUES (?,?,?,?,?,?,?,?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87525YWr(C87523YWp c87523YWp, OfflineModeFeedPBDataBase offlineModeFeedPBDataBase) {
        super(offlineModeFeedPBDataBase);
        this.LIZLLL = c87523YWp;
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C87526YWs c87526YWs) {
        byte[] bArr;
        C87526YWs c87526YWs2 = c87526YWs;
        String str = c87526YWs2.LJLIL;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        interfaceC37591dj.LJIIIZ(2, c87526YWs2.LJLILLLLZI);
        C76917UGr c76917UGr = this.LIZLLL.LIZJ;
        RCZ awemeStruct = c87526YWs2.LJLJI;
        c76917UGr.getClass();
        o.LJIIIZ(awemeStruct, "awemeStruct");
        try {
            bArr = awemeStruct.encode();
            o.LJIIIIZZ(bArr, "{\n            awemeStruct.encode()\n        }");
        } catch (Throwable unused) {
            bArr = new byte[0];
        }
        interfaceC37591dj.LJJIIZ(3, bArr);
        String str2 = c87526YWs2.LJLJJI;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(4);
        } else {
            interfaceC37591dj.LJJII(4, str2);
        }
        interfaceC37591dj.LJIIIZ(5, c87526YWs2.LJLJJL ? 1L : 0L);
        interfaceC37591dj.LJIIIZ(6, c87526YWs2.LJLJJLL ? 1L : 0L);
        interfaceC37591dj.LJIIIZ(7, c87526YWs2.LJLJL);
        String str3 = c87526YWs2.LJLJLJ;
        if (str3 == null) {
            interfaceC37591dj.LLLLLLJ(8);
        } else {
            interfaceC37591dj.LJJII(8, str3);
        }
    }
}
