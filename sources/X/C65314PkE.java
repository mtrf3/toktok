package X;

import Y.AObserverS67S0200000_3;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.services.external.ICreativeStandardPathService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS39S1000000_1;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.PkE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65314PkE implements InterfaceC53475Kyl, ORQ, TGN, ICreativeStandardPathService {
    public static volatile long LJLIL;

    @Override // X.InterfaceC53475Kyl
    public float LIZIZ() {
        return 0.032407407f;
    }

    @Override // X.ORQ
    public Object[] LIZLLL(Object obj, List list, List list2) {
        return (Object[]) C40654FxS.LIZIZ(obj, "makePathElements", Object[].class, List.class, list, File.class, null, List.class, list2);
    }

    @Override // X.TGN
    public int LJ() {
        return R.layout.bns;
    }

    public static final AbstractC194637kR LJII() {
        AbstractC194637kR value = C194597kN.LIZ.LIZJ.getValue();
        if (value == null) {
            return C194627kQ.LIZ;
        }
        return value;
    }

    public static final String LJI(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static boolean LJIIIZ(Request request) {
        if (request == null) {
            return false;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (!path.contains("/aweme/v1/feed/") && !path.contains("/aweme/v2/feed/")) {
            return false;
        }
        return true;
    }

    public static final String LJIIL(InterfaceC67352kd interfaceC67352kd) {
        Object LIZ;
        if (interfaceC67352kd instanceof XKT) {
            return interfaceC67352kd.toString();
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(interfaceC67352kd);
            LIZ2.append('@');
            LIZ2.append(LJI(interfaceC67352kd));
            LIZ = X1D.LIZIZ(LIZ2);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            LIZ = ((Object) interfaceC67352kd.getClass().getName()) + '@' + LJI(interfaceC67352kd);
        }
        return (String) LIZ;
    }

    @Override // X.TGN
    public C80700Vlo LIZ(ViewGroup content) {
        o.LJIIIZ(content, "content");
        View findViewById = content.findViewById(R.id.kz8);
        o.LJIIIIZZ(findViewById, "content.findViewById(R.id.tab_sticker_name)");
        return (C80700Vlo) findViewById;
    }

    @Override // X.TGN
    public TGJ LIZJ(ViewGroup content) {
        o.LJIIIZ(content, "content");
        View findViewById = content.findViewById(R.id.ej3);
        o.LJIIIIZZ(findViewById, "content.findViewById(R.id.img_clear_sticker)");
        return new TGJ(findViewById);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICreativeStandardPathService
    public String genCreativePath(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        return C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), new CreativeInfo(creationId, 0, null, 4, null), EnumC43649HBd.OTHER_BUSINESS_LINE_SHARE, null, true, 4);
    }

    public DialogC73377Sqz LJIIIIZZ(ActivityC45651qj activity, AqS60S1100000_7 aqS60S1100000_7) {
        o.LJIIIZ(activity, "activity");
        return new DialogC73377Sqz(activity, aqS60S1100000_7);
    }

    public static final void LJIIJJI(ReusedUIAssem reusedUIAssem, boolean z, InterfaceC88471Ynr subscriber) {
        o.LJIIIZ(reusedUIAssem, "<this>");
        o.LJIIIZ(subscriber, "subscriber");
        LJIIJ(reusedUIAssem, C194597kN.LIZ.LIZJ, z, new AObserverS67S0200000_3(subscriber, reusedUIAssem, 11));
    }

    public static final void LJIIJ(final ReusedUIAssem reusedUIAssem, final MutableLiveData liveData, final boolean z, final Observer observer) {
        o.LJIIIZ(reusedUIAssem, "<this>");
        o.LJIIIZ(liveData, "liveData");
        if (C1DF.LJJII()) {
            liveData.observe(reusedUIAssem, observer);
            if (!z) {
                observer.onChanged(liveData.getValue());
                return;
            }
            return;
        }
        C1DH.LJJIJIIJI(new Runnable() { // from class: X.350
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    ?? r3 = reusedUIAssem;
                    LiveData<Object> liveData2 = liveData;
                    boolean z2 = z;
                    Observer<? super Object> observer2 = observer;
                    liveData2.observe(r3, observer2);
                    if (!z2) {
                        observer2.onChanged(liveData2.getValue());
                    }
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF(com.twitter.sdk.android.core.TwitterAuthConfig r13, com.twitter.sdk.android.core.TwitterAuthToken r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65314PkE.LJFF(com.twitter.sdk.android.core.TwitterAuthConfig, com.twitter.sdk.android.core.TwitterAuthToken, java.lang.String, java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }

    public static C10K LJIILIIL(String chunkSizeList, String str, String str2, long j, String keyword, String str3, int i, int i2, String searchId, String str4, String source, String searchSource, int i3, int i4, int i5, int i6, LinkedHashMap linkedHashMap, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        o.LJIIIZ(chunkSizeList, "chunkSizeList");
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(searchSource, "searchSource");
        EcSearchApi.RealApi realApi = (EcSearchApi.RealApi) ((InterfaceC789838c) C221108m2.LIZIZ(new AqS39S1000000_1(str, 0)).getValue()).create(EcSearchApi.RealApi.class);
        if (((Boolean) C52662Kle.LIZ.getValue()).booleanValue()) {
            if (realApi == null) {
                return null;
            }
            return realApi.searchDynamicShopListByChunkPost(chunkSizeList, str2, j, keyword, str3, i, i2, searchId, str4, source, searchSource, i3, i4, i5, i6, linkedHashMap, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19);
        }
        if (realApi == null) {
            return null;
        }
        return realApi.searchDynamicShopListByChunk(str17, chunkSizeList, str2, j, keyword, str3, i, i2, searchId, str4, source, searchSource, i3, i4, i5, i6, linkedHashMap, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str18, str19);
    }
}
