package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43882HKc;
import X.C44847Hit;
import X.C45705Hwj;
import X.C6BK;
import X.C76800UCe;
import X.InterfaceC44303Ha7;
import X.InterfaceC88472Yns;
import X.WID;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AqS31S0100100_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS31S0100100_7 aqS31S0100100_7, Object obj) {
        AwemeDraft it = (AwemeDraft) obj;
        o.LJIIIZ(it, "it");
        it.LJJJ = true;
        it.LJJJI = aqS31S0100100_7.j1;
        it.LJJJIL = ((CreateAwemeResponse) aqS31S0100100_7.l0).aweme.getAid();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS31S0100100_7 aqS31S0100100_7, Object obj) {
        String preview;
        UrlModel cover;
        String uri;
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        String preview2;
        UrlModel cover2;
        C45705Hwj it = (C45705Hwj) obj;
        o.LJIIIZ(it, "it");
        String str = "";
        if (it.LIZIZ) {
            if (!it.LIZ) {
                ProviderEffect providerEffect = it.LIZLLL;
                if (providerEffect != null) {
                    WID wid = (WID) aqS31S0100100_7.l0;
                    long j = aqS31S0100100_7.j1;
                    C6BK c6bk = new C6BK();
                    LibraryMaterialInfoSv libraryMaterialInfoSv2 = wid.LJIILIIL().libraryContext.libraryMaterialInfo;
                    if ((libraryMaterialInfoSv2 != null && (cover2 = libraryMaterialInfoSv2.getCover()) != null && (preview2 = cover2.getUri()) != null) || ((libraryMaterialInfoSv = wid.LJIILIIL().libraryContext.libraryMaterialInfo) != null && (preview2 = libraryMaterialInfoSv.getPreview()) != null)) {
                        str = preview2;
                    }
                    c6bk.LIZ.put("url", str);
                    C43882HKc.LIZLLL(0, "library_download_error_rate", c6bk.LJ(), true);
                    C6BK c6bk2 = new C6BK();
                    c6bk2.LIZ.put("duration", C44847Hit.LIZ(j));
                    JSONObject LJ = c6bk2.LJ();
                    o.LJIIIIZZ(LJ, "newBuilder()\n           …                ).build()");
                    C43882HKc.LIZ.LJIILIIL("library_resource_download_takes_time", LJ, null);
                    ((InterfaceC44303Ha7) wid.LJJI.getValue()).b20(wid.LIZ(), wid.LJIILIIL(), providerEffect);
                }
            } else if (it.LIZ) {
                C6BK c6bk3 = new C6BK();
                LibraryMaterialInfoSv libraryMaterialInfoSv3 = ((WID) aqS31S0100100_7.l0).LJIILIIL().libraryContext.libraryMaterialInfo;
                if (libraryMaterialInfoSv3 == null || (cover = libraryMaterialInfoSv3.getCover()) == null || (uri = cover.getUri()) == null) {
                    LibraryMaterialInfoSv libraryMaterialInfoSv4 = ((WID) aqS31S0100100_7.l0).LJIILIIL().libraryContext.libraryMaterialInfo;
                    if (libraryMaterialInfoSv4 != null && (preview = libraryMaterialInfoSv4.getPreview()) != null) {
                        str = preview;
                    }
                } else {
                    str = uri;
                }
                c6bk3.LIZ.put("url", str);
                C43882HKc.LIZLLL(1, "library_download_error_rate", c6bk3.LJ(), true);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0100100_7(long j, CreateAwemeResponse createAwemeResponse, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = createAwemeResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S0100100_7(WID wid, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = wid;
        this.j1 = j;
    }
}
