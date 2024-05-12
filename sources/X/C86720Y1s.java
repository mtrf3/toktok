package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86720Y1s<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ InterfaceC86733Y2f LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C86720Y1s(Aweme aweme, InterfaceC86733Y2f interfaceC86733Y2f, long j, String str) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = interfaceC86733Y2f;
        this.LJLJI = j;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        Integer num;
        OSZ osz = (OSZ) obj;
        o.LJIIIZ(osz, "<name for destructuring parameter 0>");
        String str = (String) osz.getFirst();
        RealtimeCaptionsTranslationResult realtimeCaptionsTranslationResult = (RealtimeCaptionsTranslationResult) osz.getSecond();
        boolean z = true;
        if (str.length() == 0) {
            C86713Y1l c86713Y1l = C86713Y1l.LIZIZ;
            c86713Y1l.LIZ(this.LJLIL, TBB.CLA_REALTIME_STATUS_FAILED);
            InterfaceC86733Y2f interfaceC86733Y2f = this.LJLILLLLZI;
            if (interfaceC86733Y2f != null) {
                c86713Y1l.LJFF(interfaceC86733Y2f, Y2M.FILE_WRITE_FAILURE.name());
            }
            z = false;
        } else {
            long j = this.LJLJI;
            String languageCode = this.LJLJJI;
            o.LJIIIZ(languageCode, "languageCode");
            int nextInt = C78841Uwv.LIZ(j ^ languageCode.hashCode()).nextInt();
            String str2 = this.LJLJJI;
            Integer num2 = realtimeCaptionsTranslationResult.aiLabTime;
            Integer num3 = realtimeCaptionsTranslationResult.translationCacheTime;
            String str3 = realtimeCaptionsTranslationResult.translatedContent;
            Integer num4 = null;
            if (str3 != null) {
                num = Integer.valueOf(str3.length());
            } else {
                num = null;
            }
            C69402nw c69402nw = new C69402nw(nextInt, str, str2, true, num2, num3, num);
            C86713Y1l c86713Y1l2 = C86713Y1l.LIZIZ;
            c86713Y1l2.getClass();
            ((Y20) C86713Y1l.LIZLLL.getValue()).LIZLLL(this.LJLIL, c69402nw, this.LJLJJI);
            c86713Y1l2.LIZ(this.LJLIL, TBB.CLA_REALTIME_STATUS_SUCCESS);
            InterfaceC86733Y2f interfaceC86733Y2f2 = this.LJLILLLLZI;
            if (interfaceC86733Y2f2 != null) {
                String str4 = realtimeCaptionsTranslationResult.translatedContent;
                if (str4 != null) {
                    num4 = Integer.valueOf(str4.length());
                }
                AbstractC86724Y1w.LJI(c86713Y1l2, interfaceC86733Y2f2, num4);
            }
        }
        return Boolean.valueOf(z);
    }
}
